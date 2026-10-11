package defpackage;

import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public abstract class j1 implements ii3 {
    public static final boolean A;
    public static final cf3 B;
    public static final bx7 C;
    public static final Object D;
    public volatile Object x;
    public volatile a1 y;
    public volatile i1 z;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [bx7] */
    /* JADX WARN: Type inference failed for: r0v18 */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARN: Type inference failed for: r0v9 */
    static {
        boolean z;
        Throwable th;
        ?? b1Var;
        try {
            z = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
        } catch (SecurityException unused) {
            z = false;
        }
        A = z;
        B = new cf3(j1.class);
        Throwable th2 = null;
        try {
            th = null;
            b1Var = new Object();
        } catch (Error | Exception e) {
            th = e;
            try {
                b1Var = new b1(AtomicReferenceFieldUpdater.newUpdater(i1.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(i1.class, i1.class, "b"), AtomicReferenceFieldUpdater.newUpdater(j1.class, i1.class, "z"), AtomicReferenceFieldUpdater.newUpdater(j1.class, a1.class, "y"), AtomicReferenceFieldUpdater.newUpdater(j1.class, Object.class, "x"));
            } catch (Error | Exception e2) {
                th2 = e2;
                b1Var = new Object();
            }
        }
        C = b1Var;
        if (th2 != null) {
            cf3 cf3Var = B;
            Logger b = cf3Var.b();
            Level level = Level.SEVERE;
            b.log(level, "UnsafeAtomicHelper is broken!", th);
            cf3Var.b().log(level, "SafeAtomicHelper is broken!", th2);
        }
        D = new Object();
    }

    public static void e(j1 j1Var, boolean z) {
        a1 a1Var = null;
        while (true) {
            for (i1 u = C.u(j1Var); u != null; u = u.b) {
                Thread thread = u.a;
                if (thread != null) {
                    u.a = null;
                    LockSupport.unpark(thread);
                }
            }
            if (z) {
                z = false;
            }
            j1Var.c();
            a1 a1Var2 = a1Var;
            a1 t = C.t(j1Var);
            a1 a1Var3 = a1Var2;
            while (t != null) {
                a1 a1Var4 = t.c;
                t.c = a1Var3;
                a1Var3 = t;
                t = a1Var4;
            }
            while (a1Var3 != null) {
                a1Var = a1Var3.c;
                Runnable runnable = a1Var3.a;
                Objects.requireNonNull(runnable);
                if (runnable instanceof c1) {
                    c1 c1Var = (c1) runnable;
                    j1Var = c1Var.x;
                    if (j1Var.x == c1Var) {
                        if (C.l(j1Var, c1Var, h(c1Var.y))) {
                            break;
                        }
                    } else {
                        continue;
                    }
                } else {
                    Executor executor = a1Var3.b;
                    Objects.requireNonNull(executor);
                    f(runnable, executor);
                }
                a1Var3 = a1Var;
            }
            return;
        }
    }

    public static void f(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (Exception e) {
            B.b().log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e);
        }
    }

    public static Object g(Object obj) {
        if (!(obj instanceof x0)) {
            if (!(obj instanceof z0)) {
                if (obj == D) {
                    return null;
                }
                return obj;
            }
            throw new ExecutionException(((z0) obj).a);
        }
        Throwable th = ((x0) obj).b;
        CancellationException cancellationException = new CancellationException("Task was cancelled.");
        cancellationException.initCause(th);
        throw cancellationException;
    }

    public static Object h(ii3 ii3Var) {
        Object obj;
        Throwable o;
        if (ii3Var instanceof e1) {
            Object obj2 = ((j1) ii3Var).x;
            if (obj2 instanceof x0) {
                x0 x0Var = (x0) obj2;
                if (x0Var.a) {
                    obj2 = x0Var.b != null ? new x0(x0Var.b, false) : x0.d;
                }
            }
            Objects.requireNonNull(obj2);
            return obj2;
        }
        if ((ii3Var instanceof j1) && (o = ((j1) ii3Var).o()) != null) {
            return new z0(o);
        }
        boolean isCancelled = ii3Var.isCancelled();
        boolean z = true;
        if ((!A) & isCancelled) {
            x0 x0Var2 = x0.d;
            Objects.requireNonNull(x0Var2);
            return x0Var2;
        }
        boolean z2 = false;
        while (true) {
            try {
                try {
                    obj = ii3Var.get();
                    break;
                } catch (InterruptedException unused) {
                    z2 = z;
                } catch (Throwable th) {
                    if (z2) {
                        Thread.currentThread().interrupt();
                    }
                    throw th;
                }
            } catch (Error | Exception e) {
                return new z0(e);
            } catch (CancellationException e2) {
                if (!isCancelled) {
                    return new z0(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: " + ii3Var, e2));
                }
                return new x0(e2, false);
            } catch (ExecutionException e3) {
                if (isCancelled) {
                    return new x0(new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: " + ii3Var, e3), false);
                }
                return new z0(e3.getCause());
            }
        }
        if (z2) {
            Thread.currentThread().interrupt();
        }
        if (isCancelled) {
            return new x0(new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: " + ii3Var), false);
        }
        if (obj == null) {
            return D;
        }
        return obj;
    }

    @Override // defpackage.ii3
    public void a(Runnable runnable, Executor executor) {
        a1 a1Var;
        a1 a1Var2 = a1.d;
        io3.w(executor, "Executor was null.");
        if (!isDone() && (a1Var = this.y) != a1Var2) {
            a1 a1Var3 = new a1(runnable, executor);
            do {
                a1Var3.c = a1Var;
                if (C.k(this, a1Var, a1Var3)) {
                    return;
                } else {
                    a1Var = this.y;
                }
            } while (a1Var != a1Var2);
        }
        f(runnable, executor);
    }

    public final void b(StringBuilder sb) {
        Object obj;
        boolean z = false;
        while (true) {
            try {
                try {
                    obj = get();
                    break;
                } catch (InterruptedException unused) {
                    z = true;
                } catch (Throwable th) {
                    if (z) {
                        Thread.currentThread().interrupt();
                    }
                    throw th;
                }
            } catch (CancellationException unused2) {
                sb.append("CANCELLED");
                return;
            } catch (ExecutionException e) {
                sb.append("FAILURE, cause=[");
                sb.append(e.getCause());
                sb.append("]");
                return;
            } catch (Exception e2) {
                sb.append("UNKNOWN, cause=[");
                sb.append(e2.getClass());
                sb.append(" thrown from get()]");
                return;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        sb.append("SUCCESS, result=[");
        d(sb, obj);
        sb.append("]");
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z) {
        boolean z2;
        x0 x0Var;
        boolean z3;
        Object obj = this.x;
        if (obj == null) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!(z2 | (obj instanceof c1))) {
            return false;
        }
        if (A) {
            x0Var = new x0(new CancellationException("Future.cancel() was called."), z);
        } else {
            if (z) {
                x0Var = x0.c;
            } else {
                x0Var = x0.d;
            }
            Objects.requireNonNull(x0Var);
        }
        boolean z4 = false;
        while (true) {
            if (C.l(this, obj, x0Var)) {
                e(this, z);
                if (!(obj instanceof c1)) {
                    break;
                }
                ii3 ii3Var = ((c1) obj).y;
                if (ii3Var instanceof e1) {
                    this = (j1) ii3Var;
                    obj = this.x;
                    if (obj == null) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (!z3 && !(obj instanceof c1)) {
                        break;
                    }
                    z4 = true;
                } else {
                    ii3Var.cancel(z);
                    break;
                }
            } else {
                obj = this.x;
                if (!(obj instanceof c1)) {
                    return z4;
                }
            }
        }
        return true;
    }

    public final void d(StringBuilder sb, Object obj) {
        if (obj == null) {
            sb.append("null");
        } else {
            if (obj == this) {
                sb.append("this future");
                return;
            }
            sb.append(obj.getClass().getName());
            sb.append("@");
            sb.append(Integer.toHexString(System.identityHashCode(obj)));
        }
    }

    @Override // java.util.concurrent.Future
    public Object get(long j, TimeUnit timeUnit) {
        boolean z;
        long j2;
        boolean z2;
        long j3;
        boolean z3;
        boolean z4;
        boolean z5;
        i1 i1Var = i1.c;
        long nanos = timeUnit.toNanos(j);
        if (!Thread.interrupted()) {
            Object obj = this.x;
            if (obj != null) {
                z = true;
            } else {
                z = false;
            }
            if (z & (!(obj instanceof c1))) {
                return g(obj);
            }
            long j4 = 0;
            if (nanos > 0) {
                j2 = System.nanoTime() + nanos;
            } else {
                j2 = 0;
            }
            if (nanos >= 1000) {
                i1 i1Var2 = this.z;
                if (i1Var2 != i1Var) {
                    i1 i1Var3 = new i1();
                    z2 = true;
                    while (true) {
                        bx7 bx7Var = C;
                        bx7Var.F(i1Var3, i1Var2);
                        if (bx7Var.m(this, i1Var2, i1Var3)) {
                            j3 = j4;
                            do {
                                LockSupport.parkNanos(this, Math.min(nanos, 2147483647999999999L));
                                if (!Thread.interrupted()) {
                                    Object obj2 = this.x;
                                    if (obj2 != null) {
                                        z5 = true;
                                    } else {
                                        z5 = false;
                                    }
                                    if (z5 & (!(obj2 instanceof c1))) {
                                        return g(obj2);
                                    }
                                    nanos = j2 - System.nanoTime();
                                } else {
                                    k(i1Var3);
                                    throw new InterruptedException();
                                }
                            } while (nanos >= 1000);
                            k(i1Var3);
                        } else {
                            long j5 = j4;
                            i1Var2 = this.z;
                            if (i1Var2 == i1Var) {
                                break;
                            }
                            j4 = j5;
                        }
                    }
                }
                Object obj3 = this.x;
                Objects.requireNonNull(obj3);
                return g(obj3);
            }
            z2 = true;
            j3 = 0;
            while (nanos > j3) {
                Object obj4 = this.x;
                if (obj4 != null) {
                    z4 = z2;
                } else {
                    z4 = false;
                }
                if (z4 & (!(obj4 instanceof c1))) {
                    return g(obj4);
                }
                if (!Thread.interrupted()) {
                    nanos = j2 - System.nanoTime();
                } else {
                    throw new InterruptedException();
                }
            }
            String j1Var = toString();
            String obj5 = timeUnit.toString();
            Locale locale = Locale.ROOT;
            String lowerCase = obj5.toLowerCase(locale);
            StringBuilder n = zo5.n(j, "Waited ", " ");
            n.append(timeUnit.toString().toLowerCase(locale));
            String sb = n.toString();
            if (nanos + 1000 < j3) {
                String concat = sb.concat(" (plus ");
                long j6 = -nanos;
                long convert = timeUnit.convert(j6, TimeUnit.NANOSECONDS);
                long nanos2 = j6 - timeUnit.toNanos(convert);
                if (convert != j3 && nanos2 <= 1000) {
                    z3 = false;
                } else {
                    z3 = z2;
                }
                if (convert > j3) {
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
            throw new TimeoutException(qx1.m(sb, " for ", j1Var));
        }
        throw new InterruptedException();
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return this.x instanceof x0;
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        boolean z;
        if (this.x != null) {
            z = true;
        } else {
            z = false;
        }
        return (!(r2 instanceof c1)) & z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public String j() {
        if (this instanceof ScheduledFuture) {
            return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
        }
        return null;
    }

    public final void k(i1 i1Var) {
        i1Var.a = null;
        while (true) {
            i1 i1Var2 = this.z;
            if (i1Var2 != i1.c) {
                i1 i1Var3 = null;
                while (i1Var2 != null) {
                    i1 i1Var4 = i1Var2.b;
                    if (i1Var2.a != null) {
                        i1Var3 = i1Var2;
                    } else if (i1Var3 != null) {
                        i1Var3.b = i1Var4;
                        if (i1Var3.a == null) {
                            break;
                        }
                    } else if (!C.m(this, i1Var2, i1Var4)) {
                        break;
                    }
                    i1Var2 = i1Var4;
                }
                return;
            }
            return;
        }
    }

    public boolean l(Object obj) {
        if (obj == null) {
            obj = D;
        }
        if (!C.l(this, null, obj)) {
            return false;
        }
        e(this, false);
        return true;
    }

    public boolean m(Throwable th) {
        th.getClass();
        if (!C.l(this, null, new z0(th))) {
            return false;
        }
        e(this, false);
        return true;
    }

    public boolean n(ii3 ii3Var) {
        z0 z0Var;
        ii3Var.getClass();
        Object obj = this.x;
        if (obj == null) {
            if (ii3Var.isDone()) {
                if (C.l(this, null, h(ii3Var))) {
                    e(this, false);
                    return true;
                }
                return false;
            }
            c1 c1Var = new c1(this, ii3Var);
            if (C.l(this, null, c1Var)) {
                try {
                    ii3Var.a(c1Var, qg1.x);
                    return true;
                } catch (Throwable th) {
                    try {
                        z0Var = new z0(th);
                    } catch (Error | Exception unused) {
                        z0Var = z0.b;
                    }
                    C.l(this, c1Var, z0Var);
                    return true;
                }
            }
            obj = this.x;
        }
        if (obj instanceof x0) {
            ii3Var.cancel(((x0) obj).a);
        }
        return false;
    }

    public final Throwable o() {
        if (this instanceof e1) {
            Object obj = this.x;
            if (obj instanceof z0) {
                return ((z0) obj).a;
            }
            return null;
        }
        return null;
    }

    public final boolean p() {
        Object obj = this.x;
        if ((obj instanceof x0) && ((x0) obj).a) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00b9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String toString() {
        /*
            r6 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.Class r1 = r6.getClass()
            java.lang.String r1 = r1.getName()
            java.lang.String r2 = "com.google.common.util.concurrent."
            boolean r1 = r1.startsWith(r2)
            if (r1 == 0) goto L21
            java.lang.Class r1 = r6.getClass()
            java.lang.String r1 = r1.getSimpleName()
            r0.append(r1)
            goto L2c
        L21:
            java.lang.Class r1 = r6.getClass()
            java.lang.String r1 = r1.getName()
            r0.append(r1)
        L2c:
            r1 = 64
            r0.append(r1)
            int r1 = java.lang.System.identityHashCode(r6)
            java.lang.String r1 = java.lang.Integer.toHexString(r1)
            r0.append(r1)
            java.lang.String r1 = "[status="
            r0.append(r1)
            boolean r1 = r6.isCancelled()
            java.lang.String r2 = "]"
            if (r1 == 0) goto L50
            java.lang.String r6 = "CANCELLED"
            r0.append(r6)
            goto Ld4
        L50:
            boolean r1 = r6.isDone()
            if (r1 == 0) goto L5b
            r6.b(r0)
            goto Ld4
        L5b:
            int r1 = r0.length()
            java.lang.String r3 = "PENDING"
            r0.append(r3)
            java.lang.Object r3 = r6.x
            boolean r4 = r3 instanceof defpackage.c1
            java.lang.String r5 = "Exception thrown from implementation: "
            if (r4 == 0) goto L91
            java.lang.String r4 = ", setFuture=["
            r0.append(r4)
            c1 r3 = (defpackage.c1) r3
            ii3 r3 = r3.y
            if (r3 != r6) goto L7f
            java.lang.String r3 = "this future"
            r0.append(r3)     // Catch: java.lang.Throwable -> L7d
            goto L8d
        L7d:
            r3 = move-exception
            goto L83
        L7f:
            r0.append(r3)     // Catch: java.lang.Throwable -> L7d
            goto L8d
        L83:
            r0.append(r5)
            java.lang.Class r3 = r3.getClass()
            r0.append(r3)
        L8d:
            r0.append(r2)
            goto Lc4
        L91:
            java.lang.String r3 = r6.j()     // Catch: java.lang.Throwable -> La0
            if (r3 == 0) goto La2
            boolean r4 = r3.isEmpty()     // Catch: java.lang.Throwable -> La0
            if (r4 == 0) goto L9e
            goto La2
        L9e:
            r4 = 0
            goto La3
        La0:
            r3 = move-exception
            goto La7
        La2:
            r4 = 1
        La3:
            if (r4 == 0) goto Lb7
            r3 = 0
            goto Lb7
        La7:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>(r5)
            java.lang.Class r3 = r3.getClass()
            r4.append(r3)
            java.lang.String r3 = r4.toString()
        Lb7:
            if (r3 == 0) goto Lc4
            java.lang.String r4 = ", info=["
            r0.append(r4)
            r0.append(r3)
            r0.append(r2)
        Lc4:
            boolean r3 = r6.isDone()
            if (r3 == 0) goto Ld4
            int r3 = r0.length()
            r0.delete(r1, r3)
            r6.b(r0)
        Ld4:
            r0.append(r2)
            java.lang.String r6 = r0.toString()
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.j1.toString():java.lang.String");
    }

    public void c() {
    }

    public void i() {
    }

    @Override // java.util.concurrent.Future
    public Object get() {
        Object obj;
        i1 i1Var = i1.c;
        if (!Thread.interrupted()) {
            Object obj2 = this.x;
            if ((obj2 != null) & (!(obj2 instanceof c1))) {
                return g(obj2);
            }
            i1 i1Var2 = this.z;
            if (i1Var2 != i1Var) {
                i1 i1Var3 = new i1();
                do {
                    bx7 bx7Var = C;
                    bx7Var.F(i1Var3, i1Var2);
                    if (bx7Var.m(this, i1Var2, i1Var3)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.x;
                            } else {
                                k(i1Var3);
                                throw new InterruptedException();
                            }
                        } while (!((obj != null) & (!(obj instanceof c1))));
                        return g(obj);
                    }
                    i1Var2 = this.z;
                } while (i1Var2 != i1Var);
            }
            Object obj3 = this.x;
            Objects.requireNonNull(obj3);
            return g(obj3);
        }
        throw new InterruptedException();
    }
}
