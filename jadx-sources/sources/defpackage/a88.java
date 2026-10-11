package defpackage;

import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public abstract class a88 extends f88 {
    public static Object c(Object obj) {
        if (!(obj instanceof w78)) {
            if (!(obj instanceof y78)) {
                if (obj == f88.A) {
                    return null;
                }
                return obj;
            }
            throw new ExecutionException(((y78) obj).a);
        }
        Throwable th = ((w78) obj).b;
        CancellationException cancellationException = new CancellationException("Task was cancelled.");
        cancellationException.initCause(th);
        throw cancellationException;
    }

    public static Object f(a88 a88Var) {
        Object obj;
        boolean z = false;
        while (true) {
            try {
                obj = a88Var.get();
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

    public static void g(a88 a88Var) {
        for (e88 s = f88.D.s(a88Var); s != null; s = s.b) {
            Thread thread = s.a;
            if (thread != null) {
                s.a = null;
                LockSupport.unpark(thread);
            }
        }
        a88Var.d();
        z78 t = f88.D.t(a88Var);
        z78 z78Var = null;
        while (t != null) {
            z78 z78Var2 = t.c;
            t.c = z78Var;
            z78Var = t;
            t = z78Var2;
        }
        while (z78Var != null) {
            Runnable runnable = z78Var.a;
            z78 z78Var3 = z78Var.c;
            Objects.requireNonNull(runnable);
            Executor executor = z78Var.b;
            Objects.requireNonNull(executor);
            i(runnable, executor);
            z78Var = z78Var3;
        }
    }

    public static void i(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (Exception e) {
            Logger c = f88.B.c();
            Level level = Level.SEVERE;
            String valueOf = String.valueOf(runnable);
            String valueOf2 = String.valueOf(executor);
            c.logp(level, "com.google.common.util.concurrent.AbstractFuture", "executeListener", h11.l(new StringBuilder(valueOf.length() + 57 + valueOf2.length()), "RuntimeException while executing runnable ", valueOf, " with executor ", valueOf2), (Throwable) e);
        }
    }

    @Override // defpackage.ii3
    public final void a(Runnable runnable, Executor executor) {
        z78 z78Var;
        z78 z78Var2 = z78.d;
        if (executor != null) {
            if (!isDone() && (z78Var = this.y) != z78Var2) {
                z78 z78Var3 = new z78(runnable, executor);
                do {
                    z78Var3.c = z78Var;
                    if (!f88.D.r(this, z78Var, z78Var3)) {
                        z78Var = this.y;
                    } else {
                        return;
                    }
                } while (z78Var != z78Var2);
            }
            i(runnable, executor);
            return;
        }
        qi2.m("Executor was null.");
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        w78 w78Var;
        w78 w78Var2;
        Object obj = this.x;
        if (obj == null) {
            if (f88.C) {
                w78Var2 = new w78(new CancellationException("Future.cancel() was called."), z);
            } else {
                if (z) {
                    w78Var = w78.c;
                } else {
                    w78Var = w78.d;
                }
                w78Var2 = w78Var;
                Objects.requireNonNull(w78Var2);
            }
            if (f88.D.u(this, obj, w78Var2)) {
                g(this);
                return true;
            }
            return false;
        }
        return false;
    }

    public abstract String e();

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        long j2;
        long j3;
        boolean z;
        e88 e88Var = e88.c;
        long nanos = timeUnit.toNanos(j);
        if (!Thread.interrupted()) {
            Object obj = this.x;
            if (obj != null) {
                return c(obj);
            }
            long j4 = 0;
            if (nanos > 0) {
                j2 = System.nanoTime() + nanos;
            } else {
                j2 = 0;
            }
            if (nanos >= 1000) {
                e88 e88Var2 = this.z;
                if (e88Var2 != e88Var) {
                    e88 e88Var3 = new e88();
                    while (true) {
                        yu5 yu5Var = f88.D;
                        yu5Var.p(e88Var3, e88Var2);
                        if (yu5Var.q(this, e88Var2, e88Var3)) {
                            j3 = j4;
                            do {
                                LockSupport.parkNanos(this, Math.min(nanos, 2147483647999999999L));
                                if (!Thread.interrupted()) {
                                    Object obj2 = this.x;
                                    if (obj2 != null) {
                                        return c(obj2);
                                    }
                                    nanos = j2 - System.nanoTime();
                                } else {
                                    b(e88Var3);
                                    throw new InterruptedException();
                                }
                            } while (nanos >= 1000);
                            b(e88Var3);
                        } else {
                            long j5 = j4;
                            e88Var2 = this.z;
                            if (e88Var2 == e88Var) {
                                break;
                            }
                            j4 = j5;
                        }
                    }
                }
                Object obj3 = this.x;
                Objects.requireNonNull(obj3);
                return c(obj3);
            }
            j3 = 0;
            while (nanos > j3) {
                Object obj4 = this.x;
                if (obj4 != null) {
                    return c(obj4);
                }
                if (!Thread.interrupted()) {
                    nanos = j2 - System.nanoTime();
                } else {
                    throw new InterruptedException();
                }
            }
            String a88Var = toString();
            String obj5 = timeUnit.toString();
            Locale locale = Locale.ROOT;
            String lowerCase = obj5.toLowerCase(locale);
            String lowerCase2 = timeUnit.toString().toLowerCase(locale);
            StringBuilder sb = new StringBuilder(String.valueOf(j).length() + 8 + String.valueOf(lowerCase2).length());
            qx1.w(sb, "Waited ", j, " ");
            sb.append(lowerCase2);
            String sb2 = sb.toString();
            if (nanos + 1000 < j3) {
                String concat = sb2.concat(" (plus ");
                long j6 = -nanos;
                long convert = timeUnit.convert(j6, TimeUnit.NANOSECONDS);
                long nanos2 = j6 - timeUnit.toNanos(convert);
                if (convert == j3 || nanos2 > 1000) {
                    z = true;
                } else {
                    z = false;
                }
                if (convert > j3) {
                    StringBuilder sb3 = new StringBuilder(String.valueOf(convert).length() + concat.length() + 1 + String.valueOf(lowerCase).length());
                    qx1.w(sb3, concat, convert, " ");
                    sb3.append(lowerCase);
                    String sb4 = sb3.toString();
                    if (z) {
                        sb4 = sb4.concat(",");
                    }
                    concat = sb4.concat(" ");
                }
                if (z) {
                    StringBuilder sb5 = new StringBuilder(String.valueOf(nanos2).length() + concat.length() + 13);
                    sb5.append(concat);
                    sb5.append(nanos2);
                    sb5.append(" nanoseconds ");
                    concat = sb5.toString();
                }
                sb2 = concat.concat("delay)");
            }
            if (isDone()) {
                throw new TimeoutException(sb2.concat(" but future completed as timeout expired"));
            }
            throw new TimeoutException(qx1.q(new StringBuilder(sb2.length() + 5 + a88Var.length()), sb2, " for ", a88Var));
        }
        throw new InterruptedException();
    }

    public final void h(StringBuilder sb) {
        try {
            Object f = f(this);
            sb.append("SUCCESS, result=[");
            if (f == null) {
                sb.append("null");
            } else if (f == this) {
                sb.append("this future");
            } else {
                sb.append(f.getClass().getName());
                sb.append("@");
                sb.append(Integer.toHexString(System.identityHashCode(f)));
            }
            sb.append("]");
        } catch (CancellationException unused) {
            sb.append("CANCELLED");
        } catch (ExecutionException e) {
            sb.append("FAILURE, cause=[");
            sb.append(e.getCause());
            sb.append("]");
        } catch (Exception e2) {
            sb.append("UNKNOWN, cause=[");
            sb.append(e2.getClass());
            sb.append(" thrown from get()]");
        }
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.x instanceof w78;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        if (this.x != null) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x006d, code lost:
    
        if (r3.isEmpty() != false) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String toString() {
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
            java.lang.Object r1 = r6.x
            boolean r1 = r1 instanceof defpackage.w78
            java.lang.String r2 = "]"
            if (r1 == 0) goto L4f
            java.lang.String r6 = "CANCELLED"
            r0.append(r6)
            goto La9
        L4f:
            boolean r1 = r6.isDone()
            if (r1 == 0) goto L59
            r6.h(r0)
            goto La9
        L59:
            int r1 = r0.length()
            java.lang.String r3 = "PENDING"
            r0.append(r3)
            java.lang.String r3 = r6.e()     // Catch: java.lang.Throwable -> L71
            r4 = 0
            if (r3 == 0) goto L6f
            boolean r5 = r3.isEmpty()     // Catch: java.lang.Throwable -> L71
            if (r5 == 0) goto L8c
        L6f:
            r3 = r4
            goto L8c
        L71:
            r3 = move-exception
            boolean r4 = r3 instanceof java.lang.Error
            if (r4 == 0) goto L7e
            boolean r4 = r3 instanceof java.lang.StackOverflowError
            if (r4 == 0) goto L7b
            goto L7e
        L7b:
            java.lang.Error r3 = (java.lang.Error) r3
            throw r3
        L7e:
            java.lang.Class r3 = r3.getClass()
            java.lang.String r3 = java.lang.String.valueOf(r3)
            java.lang.String r4 = "Exception thrown from implementation: "
            java.lang.String r3 = r4.concat(r3)
        L8c:
            if (r3 == 0) goto L99
            java.lang.String r4 = ", info=["
            r0.append(r4)
            r0.append(r3)
            r0.append(r2)
        L99:
            boolean r3 = r6.isDone()
            if (r3 == 0) goto La9
            int r3 = r0.length()
            r0.delete(r1, r3)
            r6.h(r0)
        La9:
            r0.append(r2)
            java.lang.String r6 = r0.toString()
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.a88.toString():java.lang.String");
    }

    public void d() {
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        Object obj;
        e88 e88Var = e88.c;
        if (!Thread.interrupted()) {
            Object obj2 = this.x;
            if (obj2 != null) {
                return c(obj2);
            }
            e88 e88Var2 = this.z;
            if (e88Var2 != e88Var) {
                e88 e88Var3 = new e88();
                do {
                    yu5 yu5Var = f88.D;
                    yu5Var.p(e88Var3, e88Var2);
                    if (yu5Var.q(this, e88Var2, e88Var3)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.x;
                            } else {
                                b(e88Var3);
                                throw new InterruptedException();
                            }
                        } while (obj == null);
                        return c(obj);
                    }
                    e88Var2 = this.z;
                } while (e88Var2 != e88Var);
            }
            Object obj3 = this.x;
            Objects.requireNonNull(obj3);
            return c(obj3);
        }
        throw new InterruptedException();
    }
}
