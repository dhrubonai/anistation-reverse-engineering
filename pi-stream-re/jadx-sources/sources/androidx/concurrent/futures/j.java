package androidx.concurrent.futures;

import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public abstract class j implements u6.b {
    static final a ATOMIC_HELPER;
    private static final Object NULL;
    private static final long SPIN_THRESHOLD_NANOS = 1000;
    volatile e listeners;
    volatile Object value;
    volatile i waiters;
    static final boolean GENERATE_CANCELLATION_CAUSES = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
    private static final Logger log = Logger.getLogger(j.class.getName());

    static {
        a hVar;
        try {
            hVar = new f(AtomicReferenceFieldUpdater.newUpdater(i.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(i.class, i.class, "b"), AtomicReferenceFieldUpdater.newUpdater(j.class, i.class, "waiters"), AtomicReferenceFieldUpdater.newUpdater(j.class, e.class, "listeners"), AtomicReferenceFieldUpdater.newUpdater(j.class, Object.class, "value"));
            th = null;
        } catch (Throwable th) {
            th = th;
            hVar = new h();
        }
        ATOMIC_HELPER = hVar;
        if (th != null) {
            log.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        NULL = new Object();
    }

    public static void b(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e10) {
            log.log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e10);
        }
    }

    public static Object c(Object obj) {
        if (!(obj instanceof b)) {
            if (!(obj instanceof d)) {
                if (obj == NULL) {
                    return null;
                }
                return obj;
            }
            throw new ExecutionException(((d) obj).f743a);
        }
        Throwable th = ((b) obj).f741b;
        CancellationException cancellationException = new CancellationException("Task was cancelled.");
        cancellationException.initCause(th);
        throw cancellationException;
    }

    public static <T> T checkNotNull(T t9) {
        t9.getClass();
        return t9;
    }

    public static void complete(j jVar) {
        e eVar;
        e eVar2;
        e eVar3 = null;
        while (true) {
            i iVar = jVar.waiters;
            if (ATOMIC_HELPER.c(jVar, iVar, i.f755c)) {
                while (iVar != null) {
                    Thread thread = iVar.f756a;
                    if (thread != null) {
                        iVar.f756a = null;
                        LockSupport.unpark(thread);
                    }
                    iVar = iVar.f757b;
                }
                jVar.afterDone();
                do {
                    eVar = jVar.listeners;
                } while (!ATOMIC_HELPER.a(jVar, eVar, e.f744d));
                while (true) {
                    eVar2 = eVar3;
                    eVar3 = eVar;
                    if (eVar3 == null) {
                        break;
                    }
                    eVar = eVar3.f747c;
                    eVar3.f747c = eVar2;
                }
                while (eVar2 != null) {
                    eVar3 = eVar2.f747c;
                    Runnable runnable = eVar2.f745a;
                    if (runnable instanceof g) {
                        g gVar = (g) runnable;
                        jVar = gVar.f753a;
                        if (jVar.value == gVar) {
                            if (ATOMIC_HELPER.b(jVar, gVar, getFutureValue(gVar.f754b))) {
                                break;
                            }
                        } else {
                            continue;
                        }
                    } else {
                        b(runnable, eVar2.f746b);
                    }
                    eVar2 = eVar3;
                }
                return;
            }
        }
    }

    public static Object getFutureValue(u6.b bVar) {
        if (bVar instanceof j) {
            Object obj = ((j) bVar).value;
            if (obj instanceof b) {
                b bVar2 = (b) obj;
                if (bVar2.f740a) {
                    if (bVar2.f741b != null) {
                        return new b(bVar2.f741b, false);
                    }
                    return b.f739d;
                }
                return obj;
            }
            return obj;
        }
        boolean isCancelled = bVar.isCancelled();
        if ((!GENERATE_CANCELLATION_CAUSES) & isCancelled) {
            return b.f739d;
        }
        try {
            Object uninterruptibly = getUninterruptibly(bVar);
            if (uninterruptibly == null) {
                return NULL;
            }
            return uninterruptibly;
        } catch (CancellationException e10) {
            if (!isCancelled) {
                return new d(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: " + bVar, e10));
            }
            return new b(e10, false);
        } catch (ExecutionException e11) {
            return new d(e11.getCause());
        } catch (Throwable th) {
            return new d(th);
        }
    }

    public static <V> V getUninterruptibly(Future<V> future) {
        V v9;
        boolean z9 = false;
        while (true) {
            try {
                v9 = future.get();
                break;
            } catch (InterruptedException unused) {
                z9 = true;
            } catch (Throwable th) {
                if (z9) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z9) {
            Thread.currentThread().interrupt();
        }
        return v9;
    }

    public final void a(StringBuilder sb) {
        String valueOf;
        try {
            Object uninterruptibly = getUninterruptibly(this);
            sb.append("SUCCESS, result=[");
            if (uninterruptibly == this) {
                valueOf = "this future";
            } else {
                valueOf = String.valueOf(uninterruptibly);
            }
            sb.append(valueOf);
            sb.append("]");
        } catch (CancellationException unused) {
            sb.append("CANCELLED");
        } catch (RuntimeException e10) {
            sb.append("UNKNOWN, cause=[");
            sb.append(e10.getClass());
            sb.append(" thrown from get()]");
        } catch (ExecutionException e11) {
            sb.append("FAILURE, cause=[");
            sb.append(e11.getCause());
            sb.append("]");
        }
    }

    @Override // u6.b
    public final void addListener(Runnable runnable, Executor executor) {
        checkNotNull(runnable);
        checkNotNull(executor);
        e eVar = this.listeners;
        e eVar2 = e.f744d;
        if (eVar != eVar2) {
            e eVar3 = new e(runnable, executor);
            do {
                eVar3.f747c = eVar;
                if (ATOMIC_HELPER.a(this, eVar, eVar3)) {
                    return;
                } else {
                    eVar = this.listeners;
                }
            } while (eVar != eVar2);
        }
        b(runnable, executor);
    }

    public void afterDone() {
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z9) {
        boolean z10;
        b bVar;
        boolean z11;
        Object obj = this.value;
        if (obj == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!(z10 | (obj instanceof g))) {
            return false;
        }
        if (GENERATE_CANCELLATION_CAUSES) {
            bVar = new b(new CancellationException("Future.cancel() was called."), z9);
        } else if (z9) {
            bVar = b.f738c;
        } else {
            bVar = b.f739d;
        }
        j jVar = this;
        boolean z12 = false;
        while (true) {
            if (ATOMIC_HELPER.b(jVar, obj, bVar)) {
                if (z9) {
                    jVar.interruptTask();
                }
                complete(jVar);
                if (!(obj instanceof g)) {
                    return true;
                }
                u6.b bVar2 = ((g) obj).f754b;
                if (bVar2 instanceof j) {
                    jVar = (j) bVar2;
                    obj = jVar.value;
                    if (obj == null) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (!(z11 | (obj instanceof g))) {
                        return true;
                    }
                    z12 = true;
                } else {
                    bVar2.cancel(z9);
                    return true;
                }
            } else {
                obj = jVar.value;
                if (!(obj instanceof g)) {
                    return z12;
                }
            }
        }
    }

    public final void d(i iVar) {
        iVar.f756a = null;
        while (true) {
            i iVar2 = this.waiters;
            if (iVar2 == i.f755c) {
                return;
            }
            i iVar3 = null;
            while (iVar2 != null) {
                i iVar4 = iVar2.f757b;
                if (iVar2.f756a != null) {
                    iVar3 = iVar2;
                } else if (iVar3 != null) {
                    iVar3.f757b = iVar4;
                    if (iVar3.f756a == null) {
                        break;
                    }
                } else if (!ATOMIC_HELPER.c(this, iVar2, iVar4)) {
                    break;
                }
                iVar2 = iVar4;
            }
            return;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00bc  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:45:0x00ad -> B:33:0x00b3). Please report as a decompilation issue!!! */
    @Override // java.util.concurrent.Future
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object get(long r18, java.util.concurrent.TimeUnit r20) {
        /*
            Method dump skipped, instructions count: 383
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.concurrent.futures.j.get(long, java.util.concurrent.TimeUnit):java.lang.Object");
    }

    public void interruptTask() {
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.value instanceof b;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        boolean z9;
        if (this.value != null) {
            z9 = true;
        } else {
            z9 = false;
        }
        return (!(r0 instanceof g)) & z9;
    }

    public final void maybePropagateCancellationTo(Future<?> future) {
        boolean z9;
        if (future != null) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (z9 & isCancelled()) {
            future.cancel(wasInterrupted());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public String pendingToString() {
        String valueOf;
        Object obj = this.value;
        if (obj instanceof g) {
            StringBuilder sb = new StringBuilder("setFuture=[");
            u6.b bVar = ((g) obj).f754b;
            if (bVar == this) {
                valueOf = "this future";
            } else {
                valueOf = String.valueOf(bVar);
            }
            return a3.g.t(sb, valueOf, "]");
        }
        if (this instanceof ScheduledFuture) {
            return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
        }
        return null;
    }

    public boolean set(Object obj) {
        if (obj == null) {
            obj = NULL;
        }
        if (ATOMIC_HELPER.b(this, null, obj)) {
            complete(this);
            return true;
        }
        return false;
    }

    public boolean setException(Throwable th) {
        if (ATOMIC_HELPER.b(this, null, new d((Throwable) checkNotNull(th)))) {
            complete(this);
            return true;
        }
        return false;
    }

    public boolean setFuture(u6.b bVar) {
        d dVar;
        checkNotNull(bVar);
        Object obj = this.value;
        if (obj == null) {
            if (bVar.isDone()) {
                if (!ATOMIC_HELPER.b(this, null, getFutureValue(bVar))) {
                    return false;
                }
                complete(this);
                return true;
            }
            g gVar = new g(this, bVar);
            if (ATOMIC_HELPER.b(this, null, gVar)) {
                try {
                    bVar.addListener(gVar, k.f758a);
                } catch (Throwable th) {
                    try {
                        dVar = new d(th);
                    } catch (Throwable unused) {
                        dVar = d.f742b;
                    }
                    ATOMIC_HELPER.b(this, gVar, dVar);
                }
                return true;
            }
            obj = this.value;
        }
        if (obj instanceof b) {
            bVar.cancel(((b) obj).f740a);
        }
        return false;
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (isCancelled()) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            a(sb);
        } else {
            try {
                str = pendingToString();
            } catch (RuntimeException e10) {
                str = "Exception thrown from implementation: " + e10.getClass();
            }
            if (str != null && !str.isEmpty()) {
                sb.append("PENDING, info=[");
                sb.append(str);
                sb.append("]");
            } else if (isDone()) {
                a(sb);
            } else {
                sb.append("PENDING");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    public final boolean wasInterrupted() {
        Object obj = this.value;
        if ((obj instanceof b) && ((b) obj).f740a) {
            return true;
        }
        return false;
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        Object obj;
        if (!Thread.interrupted()) {
            Object obj2 = this.value;
            if ((obj2 != null) & (!(obj2 instanceof g))) {
                return c(obj2);
            }
            i iVar = this.waiters;
            i iVar2 = i.f755c;
            if (iVar != iVar2) {
                i iVar3 = new i();
                do {
                    a aVar = ATOMIC_HELPER;
                    aVar.d(iVar3, iVar);
                    if (aVar.c(this, iVar, iVar3)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.value;
                            } else {
                                d(iVar3);
                                throw new InterruptedException();
                            }
                        } while (!((obj != null) & (!(obj instanceof g))));
                        return c(obj);
                    }
                    iVar = this.waiters;
                } while (iVar != iVar2);
            }
            return c(this.value);
        }
        throw new InterruptedException();
    }
}
