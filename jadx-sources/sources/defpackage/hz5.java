package defpackage;

import android.os.Looper;
import com.google.android.gms.tasks.Task;
import com.unity3d.ads.adplayer.DisplayRecoverer;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public abstract class hz5 implements qv6 {
    public static final gz5 a(y43 y43Var, String str) {
        y43Var.getClass();
        str.getClass();
        return new gz5(str, y43Var.a);
    }

    public static Object b(v78 v78Var) {
        boolean z;
        a34.w("Must not be called on the main application thread");
        Looper myLooper = Looper.myLooper();
        if (myLooper != null && Objects.equals(myLooper.getThread().getName(), "GoogleApiHandler")) {
            ze0.m("Must not be called on GoogleApiHandler thread.");
            return null;
        }
        synchronized (v78Var.a) {
            z = v78Var.c;
        }
        if (z) {
            return m(v78Var);
        }
        fq3 fq3Var = new fq3((byte) 23);
        Executor executor = r76.b;
        v78Var.a(executor, fq3Var);
        os7 os7Var = new os7(executor, (ce4) fq3Var);
        u98 u98Var = v78Var.b;
        u98Var.m(os7Var);
        v78Var.j();
        u98Var.m(new os7(executor, (yd4) fq3Var));
        v78Var.j();
        ((CountDownLatch) fq3Var.y).await();
        return m(v78Var);
    }

    public static Object c(v78 v78Var) {
        boolean z;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        a34.w("Must not be called on the main application thread");
        Looper myLooper = Looper.myLooper();
        if (myLooper != null && Objects.equals(myLooper.getThread().getName(), "GoogleApiHandler")) {
            ze0.m("Must not be called on GoogleApiHandler thread.");
            return null;
        }
        a34.y(v78Var, "Task must not be null");
        a34.y(timeUnit, "TimeUnit must not be null");
        synchronized (v78Var.a) {
            z = v78Var.c;
        }
        if (z) {
            return m(v78Var);
        }
        fq3 fq3Var = new fq3((byte) 23);
        Executor executor = r76.b;
        v78Var.a(executor, fq3Var);
        os7 os7Var = new os7(executor, (ce4) fq3Var);
        u98 u98Var = v78Var.b;
        u98Var.m(os7Var);
        v78Var.j();
        u98Var.m(new os7(executor, (yd4) fq3Var));
        v78Var.j();
        if (((CountDownLatch) fq3Var.y).await(DisplayRecoverer.DEFAULT_MAX_BACKGROUND_AGE_MS, timeUnit)) {
            return m(v78Var);
        }
        throw new TimeoutException("Timed out waiting for Task");
    }

    public static v78 d(Executor executor, Callable callable) {
        a34.y(executor, "Executor must not be null");
        v78 v78Var = new v78();
        executor.execute(new ly7((byte) 10, (Object) v78Var, (Object) callable, false));
        return v78Var;
    }

    public static v78 e(Object obj) {
        v78 v78Var = new v78();
        v78Var.f(obj);
        return v78Var;
    }

    public static final long f(double d) {
        return h((float) d, 4294967296L);
    }

    public static final long g(int i) {
        return h(i, 4294967296L);
    }

    public static final long h(float f, long j) {
        long floatToRawIntBits = j | (Float.floatToRawIntBits(f) & 4294967295L);
        fe6[] fe6VarArr = ee6.b;
        return floatToRawIntBits;
    }

    public static final xl6 i(String str) {
        int i;
        t80.z(10);
        int length = str.length();
        if (length != 0) {
            int i2 = 0;
            char charAt = str.charAt(0);
            if (charAt < '0') {
                i = 1;
                if (length == 1 || charAt != '+') {
                    return null;
                }
            } else {
                i = 0;
            }
            int i3 = 119304647;
            while (i < length) {
                int digit = Character.digit((int) str.charAt(i), 10);
                if (digit >= 0) {
                    if (Integer.compareUnsigned(i2, i3) > 0) {
                        if (i3 == 119304647) {
                            i3 = Integer.divideUnsigned(-1, 10);
                            if (Integer.compareUnsigned(i2, i3) > 0) {
                                return null;
                            }
                        } else {
                            return null;
                        }
                    }
                    int i4 = i2 * 10;
                    int i5 = digit + i4;
                    if (Integer.compareUnsigned(i5, i4) < 0) {
                        return null;
                    }
                    i++;
                    i2 = i5;
                } else {
                    return null;
                }
            }
            return new xl6(i2);
        }
        return null;
    }

    public static final cm6 j(String str) {
        str.getClass();
        t80.z(10);
        int length = str.length();
        if (length != 0) {
            int i = 0;
            char charAt = str.charAt(0);
            if (charAt < '0') {
                i = 1;
                if (length == 1 || charAt != '+') {
                    return null;
                }
            }
            long j = 0;
            long j2 = 512409557603043100L;
            while (i < length) {
                int digit = Character.digit((int) str.charAt(i), 10);
                if (digit >= 0) {
                    if (Long.compareUnsigned(j, j2) > 0) {
                        if (j2 == 512409557603043100L) {
                            j2 = Long.divideUnsigned(-1L, 10L);
                            if (Long.compareUnsigned(j, j2) > 0) {
                                return null;
                            }
                        } else {
                            return null;
                        }
                    }
                    long j3 = j * 10;
                    long j4 = (digit & 4294967295L) + j3;
                    if (Long.compareUnsigned(j4, j3) < 0) {
                        return null;
                    }
                    i++;
                    j = j4;
                } else {
                    return null;
                }
            }
            return new cm6(j);
        }
        return null;
    }

    public static final yz3 k(yz3 yz3Var, float f) {
        return yz3Var.w(new p97(f));
    }

    public static int l(int i) {
        return (int) (Integer.rotateLeft((int) (i * (-862048943)), 15) * 461845907);
    }

    public static Object m(Task task) {
        if (task.d()) {
            return task.c();
        }
        if (((v78) task).d) {
            throw new CancellationException("Task is already canceled");
        }
        throw new ExecutionException(task.b());
    }
}
