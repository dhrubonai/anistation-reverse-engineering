package defpackage;

import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public abstract class x2 implements ii3 {
    public static final boolean A = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
    public static final Logger B = Logger.getLogger(x2.class.getName());
    public static final zz C;
    public static final Object D;
    public volatile Object x;
    public volatile s2 y;
    public volatile w2 z;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [zz] */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5 */
    static {
        ?? r2;
        try {
            th = null;
            r2 = new t2(AtomicReferenceFieldUpdater.newUpdater(w2.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(w2.class, w2.class, "b"), AtomicReferenceFieldUpdater.newUpdater(x2.class, w2.class, "z"), AtomicReferenceFieldUpdater.newUpdater(x2.class, s2.class, "y"), AtomicReferenceFieldUpdater.newUpdater(x2.class, Object.class, "x"));
        } catch (Throwable th) {
            th = th;
            r2 = new Object();
        }
        C = r2;
        if (th != null) {
            B.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        D = new Object();
    }

    public static void d(x2 x2Var) {
        s2 s2Var;
        s2 s2Var2;
        s2 s2Var3 = null;
        while (true) {
            w2 w2Var = x2Var.z;
            if (C.p(x2Var, w2Var, w2.c)) {
                while (w2Var != null) {
                    Thread thread = w2Var.a;
                    if (thread != null) {
                        w2Var.a = null;
                        LockSupport.unpark(thread);
                    }
                    w2Var = w2Var.b;
                }
                x2Var.c();
                do {
                    s2Var = x2Var.y;
                } while (!C.n(x2Var, s2Var, s2.d));
                while (true) {
                    s2Var2 = s2Var3;
                    s2Var3 = s2Var;
                    if (s2Var3 == null) {
                        break;
                    }
                    s2Var = s2Var3.c;
                    s2Var3.c = s2Var2;
                }
                while (s2Var2 != null) {
                    s2Var3 = s2Var2.c;
                    Runnable runnable = s2Var2.a;
                    if (runnable instanceof u2) {
                        u2 u2Var = (u2) runnable;
                        x2Var = u2Var.x;
                        if (x2Var.x == u2Var) {
                            if (C.o(x2Var, u2Var, g(u2Var.y))) {
                                break;
                            }
                        } else {
                            continue;
                        }
                    } else {
                        e(runnable, s2Var2.b);
                    }
                    s2Var2 = s2Var3;
                }
                return;
            }
        }
    }

    public static void e(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e) {
            B.log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e);
        }
    }

    public static Object f(Object obj) {
        if (!(obj instanceof q2)) {
            if (!(obj instanceof r2)) {
                if (obj == D) {
                    return null;
                }
                return obj;
            }
            throw new ExecutionException(((r2) obj).a);
        }
        Throwable th = ((q2) obj).b;
        CancellationException cancellationException = new CancellationException("Task was cancelled.");
        cancellationException.initCause(th);
        throw cancellationException;
    }

    public static Object g(ii3 ii3Var) {
        if (ii3Var instanceof x2) {
            Object obj = ((x2) ii3Var).x;
            if (obj instanceof q2) {
                q2 q2Var = (q2) obj;
                if (q2Var.a) {
                    if (q2Var.b != null) {
                        return new q2(q2Var.b, false);
                    }
                    return q2.d;
                }
                return obj;
            }
            return obj;
        }
        boolean isCancelled = ii3Var.isCancelled();
        if ((!A) & isCancelled) {
            return q2.d;
        }
        try {
            Object h = h(ii3Var);
            if (h == null) {
                return D;
            }
            return h;
        } catch (CancellationException e) {
            if (!isCancelled) {
                return new r2(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: " + ii3Var, e));
            }
            return new q2(e, false);
        } catch (ExecutionException e2) {
            return new r2(e2.getCause());
        } catch (Throwable th) {
            return new r2(th);
        }
    }

    public static Object h(Future future) {
        Object obj;
        boolean z = false;
        while (true) {
            try {
                obj = future.get();
                break;
            } catch (InterruptedException unused) {
                z = true;
            } catch (Throwable th) {
                if (z) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        return obj;
    }

    @Override // defpackage.ii3
    public final void a(Runnable runnable, Executor executor) {
        executor.getClass();
        s2 s2Var = this.y;
        s2 s2Var2 = s2.d;
        if (s2Var != s2Var2) {
            s2 s2Var3 = new s2(runnable, executor);
            do {
                s2Var3.c = s2Var;
                if (C.n(this, s2Var, s2Var3)) {
                    return;
                } else {
                    s2Var = this.y;
                }
            } while (s2Var != s2Var2);
        }
        e(runnable, executor);
    }

    public final void b(StringBuilder sb) {
        String valueOf;
        try {
            Object h = h(this);
            sb.append("SUCCESS, result=[");
            if (h == this) {
                valueOf = "this future";
            } else {
                valueOf = String.valueOf(h);
            }
            sb.append(valueOf);
            sb.append("]");
        } catch (CancellationException unused) {
            sb.append("CANCELLED");
        } catch (RuntimeException e) {
            sb.append("UNKNOWN, cause=[");
            sb.append(e.getClass());
            sb.append(" thrown from get()]");
        } catch (ExecutionException e2) {
            sb.append("FAILURE, cause=[");
            sb.append(e2.getCause());
            sb.append("]");
        }
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        boolean z2;
        q2 q2Var;
        boolean z3;
        Object obj = this.x;
        if (obj == null) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!(z2 | (obj instanceof u2))) {
            return false;
        }
        if (A) {
            q2Var = new q2(new CancellationException("Future.cancel() was called."), z);
        } else if (z) {
            q2Var = q2.c;
        } else {
            q2Var = q2.d;
        }
        boolean z4 = false;
        while (true) {
            if (C.o(this, obj, q2Var)) {
                d(this);
                if (!(obj instanceof u2)) {
                    break;
                }
                ii3 ii3Var = ((u2) obj).y;
                if (ii3Var instanceof x2) {
                    this = (x2) ii3Var;
                    obj = this.x;
                    if (obj == null) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (!z3 && !(obj instanceof u2)) {
                        break;
                    }
                    z4 = true;
                } else {
                    ii3Var.cancel(z);
                    break;
                }
            } else {
                obj = this.x;
                if (!(obj instanceof u2)) {
                    return z4;
                }
            }
        }
        return true;
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        boolean z;
        long j2;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        w2 w2Var = w2.c;
        long nanos = timeUnit.toNanos(j);
        if (!Thread.interrupted()) {
            Object obj = this.x;
            if (obj != null) {
                z = true;
            } else {
                z = false;
            }
            if (z & (!(obj instanceof u2))) {
                return f(obj);
            }
            if (nanos > 0) {
                j2 = System.nanoTime() + nanos;
            } else {
                j2 = 0;
            }
            if (nanos >= 1000) {
                w2 w2Var2 = this.z;
                if (w2Var2 != w2Var) {
                    w2 w2Var3 = new w2();
                    z2 = true;
                    do {
                        zz zzVar = C;
                        zzVar.S(w2Var3, w2Var2);
                        if (zzVar.p(this, w2Var2, w2Var3)) {
                            do {
                                LockSupport.parkNanos(this, nanos);
                                if (!Thread.interrupted()) {
                                    Object obj2 = this.x;
                                    if (obj2 != null) {
                                        z5 = true;
                                    } else {
                                        z5 = false;
                                    }
                                    if (z5 & (!(obj2 instanceof u2))) {
                                        return f(obj2);
                                    }
                                    nanos = j2 - System.nanoTime();
                                } else {
                                    j(w2Var3);
                                    throw new InterruptedException();
                                }
                            } while (nanos >= 1000);
                            j(w2Var3);
                        } else {
                            w2Var2 = this.z;
                        }
                    } while (w2Var2 != w2Var);
                }
                return f(this.x);
            }
            z2 = true;
            while (nanos > 0) {
                Object obj3 = this.x;
                if (obj3 != null) {
                    z4 = z2;
                } else {
                    z4 = false;
                }
                if (z4 & (!(obj3 instanceof u2))) {
                    return f(obj3);
                }
                if (!Thread.interrupted()) {
                    nanos = j2 - System.nanoTime();
                } else {
                    throw new InterruptedException();
                }
            }
            String x2Var = toString();
            String obj4 = timeUnit.toString();
            Locale locale = Locale.ROOT;
            String lowerCase = obj4.toLowerCase(locale);
            StringBuilder n = zo5.n(j, "Waited ", " ");
            n.append(timeUnit.toString().toLowerCase(locale));
            String sb = n.toString();
            if (nanos + 1000 < 0) {
                String concat = sb.concat(" (plus ");
                long j3 = -nanos;
                long convert = timeUnit.convert(j3, TimeUnit.NANOSECONDS);
                long nanos2 = j3 - timeUnit.toNanos(convert);
                if (convert != 0 && nanos2 <= 1000) {
                    z3 = false;
                } else {
                    z3 = z2;
                }
                if (convert > 0) {
                    String str = concat + convert + " " + lowerCase;
                    if (z3) {
                        str = str.concat(",");
                    }
                    concat = str.concat(" ");
                }
                if (z3) {
                    concat = qx1.j(nanos2, concat, " nanoseconds ");
                }
                sb = concat.concat("delay)");
            }
            if (isDone()) {
                throw new TimeoutException(sb.concat(" but future completed as timeout expired"));
            }
            throw new TimeoutException(qx1.m(sb, " for ", x2Var));
        }
        throw new InterruptedException();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public String i() {
        String valueOf;
        Object obj = this.x;
        if (obj instanceof u2) {
            StringBuilder sb = new StringBuilder("setFuture=[");
            ii3 ii3Var = ((u2) obj).y;
            if (ii3Var == this) {
                valueOf = "this future";
            } else {
                valueOf = String.valueOf(ii3Var);
            }
            return h11.k(sb, valueOf, "]");
        }
        if (this instanceof ScheduledFuture) {
            return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
        }
        return null;
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.x instanceof q2;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        boolean z;
        if (this.x != null) {
            z = true;
        } else {
            z = false;
        }
        return (!(r2 instanceof u2)) & z;
    }

    public final void j(w2 w2Var) {
        w2Var.a = null;
        while (true) {
            w2 w2Var2 = this.z;
            if (w2Var2 != w2.c) {
                w2 w2Var3 = null;
                while (w2Var2 != null) {
                    w2 w2Var4 = w2Var2.b;
                    if (w2Var2.a != null) {
                        w2Var3 = w2Var2;
                    } else if (w2Var3 != null) {
                        w2Var3.b = w2Var4;
                        if (w2Var3.a == null) {
                            break;
                        }
                    } else if (!C.p(this, w2Var2, w2Var4)) {
                        break;
                    }
                    w2Var2 = w2Var4;
                }
                return;
            }
            return;
        }
    }

    public boolean k(Object obj) {
        if (obj == null) {
            obj = D;
        }
        if (C.o(this, null, obj)) {
            d(this);
            return true;
        }
        return false;
    }

    public boolean l(Throwable th) {
        if (C.o(this, null, new r2(th))) {
            d(this);
            return true;
        }
        return false;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (this.x instanceof q2) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            b(sb);
        } else {
            try {
                str = i();
            } catch (RuntimeException e) {
                str = "Exception thrown from implementation: " + e.getClass();
            }
            if (str != null && !str.isEmpty()) {
                sb.append("PENDING, info=[");
                sb.append(str);
                sb.append("]");
            } else if (isDone()) {
                b(sb);
            } else {
                sb.append("PENDING");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    public void c() {
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        Object obj;
        w2 w2Var = w2.c;
        if (!Thread.interrupted()) {
            Object obj2 = this.x;
            if ((obj2 != null) & (!(obj2 instanceof u2))) {
                return f(obj2);
            }
            w2 w2Var2 = this.z;
            if (w2Var2 != w2Var) {
                w2 w2Var3 = new w2();
                do {
                    zz zzVar = C;
                    zzVar.S(w2Var3, w2Var2);
                    if (zzVar.p(this, w2Var2, w2Var3)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.x;
                            } else {
                                j(w2Var3);
                                throw new InterruptedException();
                            }
                        } while (!((obj != null) & (!(obj instanceof u2))));
                        return f(obj);
                    }
                    w2Var2 = this.z;
                } while (w2Var2 != w2Var);
            }
            return f(this.x);
        }
        throw new InterruptedException();
    }
}
