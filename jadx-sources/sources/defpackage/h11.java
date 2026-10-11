package defpackage;

import android.content.res.TypedArray;
import com.discord.org.webrtc.Logging;
import com.unity3d.ads.core.extensions.TimeExtensionsKt;
import java.util.HashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public abstract /* synthetic */ class h11 implements xf0 {
    public static final /* synthetic */ int[] x = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14};

    public static /* synthetic */ void A(Object obj) {
        boolean isTerminated;
        if (obj instanceof AutoCloseable) {
            ((AutoCloseable) obj).close();
            return;
        }
        if (obj instanceof ExecutorService) {
            ExecutorService executorService = (ExecutorService) obj;
            if (executorService != ForkJoinPool.commonPool() && !(isTerminated = executorService.isTerminated())) {
                executorService.shutdown();
                boolean z = false;
                while (!isTerminated) {
                    try {
                        isTerminated = executorService.awaitTermination(1L, TimeUnit.DAYS);
                    } catch (InterruptedException unused) {
                        if (!z) {
                            executorService.shutdownNow();
                            z = true;
                        }
                    }
                }
                if (z) {
                    Thread.currentThread().interrupt();
                    return;
                }
                return;
            }
            return;
        }
        if (obj instanceof TypedArray) {
            ((TypedArray) obj).recycle();
        } else {
            p65.b();
        }
    }

    public static /* synthetic */ int B(int i) {
        if (i != 0) {
            return i - 1;
        }
        throw null;
    }

    public static /* synthetic */ int[] C(int i) {
        int[] iArr = new int[i];
        System.arraycopy(x, 0, iArr, 0, i);
        return iArr;
    }

    public static /* synthetic */ boolean a(int i, int i2) {
        if (i != 0) {
            if (i == i2) {
                return true;
            }
            return false;
        }
        throw null;
    }

    public static /* synthetic */ byte b(int i) {
        switch (i) {
            case 1:
                return (byte) 0;
            case 2:
                return (byte) 1;
            case 3:
                return (byte) 2;
            case 4:
                return (byte) 3;
            case 5:
                return (byte) 4;
            case 6:
                return (byte) 5;
            case 7:
                return (byte) 6;
            case 8:
                return (byte) 7;
            case 9:
                return (byte) 8;
            case 10:
                return (byte) 9;
            case 11:
                return (byte) 10;
            case 12:
                return (byte) 11;
            case 13:
                return (byte) 12;
            case 14:
                return (byte) 13;
            default:
                throw null;
        }
    }

    public static double c(long j) {
        return TimeExtensionsKt.elapsedMillis(new bf6(j));
    }

    public static er0 e(String str) {
        ez2.c(str);
        return new er0((byte) 3);
    }

    public static ClassCastException f(Object obj) {
        obj.getClass();
        return new ClassCastException();
    }

    public static String g(int i, String str, StringBuilder sb) {
        sb.append(str);
        sb.append(i);
        return sb.toString();
    }

    public static String h(long j, String str) {
        return str + j;
    }

    public static String i(kd2 kd2Var, int i, int i2, kd2 kd2Var2, boolean z) {
        kd2Var.e0(i);
        String f = lz5.f(i2, kd2Var2);
        kd2Var.q(z);
        return f;
    }

    public static String j(String str, String str2) {
        return str + str2;
    }

    public static String k(StringBuilder sb, String str, String str2) {
        sb.append(str);
        sb.append(str2);
        return sb.toString();
    }

    public static String l(StringBuilder sb, String str, String str2, String str3, String str4) {
        sb.append(str);
        sb.append(str2);
        sb.append(str3);
        sb.append(str4);
        return sb.toString();
    }

    public static StringBuilder m(int i, String str, String str2, String str3, String str4) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(str2);
        sb.append(str3);
        sb.append(i);
        sb.append(str4);
        return sb;
    }

    public static StringBuilder n(String str, String str2, String str3) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(str2);
        sb.append(str3);
        return sb;
    }

    public static StringBuilder o(String str, String str2, String str3, String str4, String str5) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(str2);
        sb.append(str3);
        sb.append(str4);
        sb.append(str5);
        return sb;
    }

    public static void p(int i, kd2 kd2Var, int i2, st0 st0Var) {
        kd2Var.n0(Integer.valueOf(i));
        kd2Var.b(Integer.valueOf(i2), st0Var);
    }

    public static void q(int i, kd2 kd2Var, st0 st0Var, kd2 kd2Var2) {
        ss5.i(st0Var, kd2Var, Integer.valueOf(i));
        ss5.h(kd2Var2);
    }

    public static void r(int i, String str, String str2) {
        kb0.O(str2, str + i);
    }

    public static void s(int i, HashMap hashMap, String str, int i2, String str2) {
        hashMap.put(str, Integer.valueOf(i));
        hashMap.put(str2, Integer.valueOf(i2));
    }

    public static void t(long j, String str, StringBuilder sb) {
        sb.append((Object) ep0.h(j));
        sb.append(str);
    }

    public static void u(dn0 dn0Var, long j) {
        dn0Var.y().p();
        dn0Var.S(j);
    }

    public static /* synthetic */ void v(Object obj) {
        if (obj == null) {
            return;
        }
        ov3.d();
    }

    public static void w(String str, String str2, String str3) {
        kb0.O(str3, str + str2);
    }

    public static void x(StringBuilder sb, float f, String str, float f2, String str2) {
        sb.append(f);
        sb.append(str);
        sb.append(f2);
        sb.append(str2);
    }

    public static void y(StringBuilder sb, int i, String str, int i2, String str2) {
        sb.append(i);
        sb.append(str);
        sb.append(i2);
        sb.append(str2);
    }

    public static void z(int i, String str, String str2) {
        Logging.d(str2, str + i);
    }
}
