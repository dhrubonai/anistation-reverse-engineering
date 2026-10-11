package defpackage;

import android.util.Log;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class xk3 {
    public static final Object b = new Object();
    public static volatile xk3 c;
    public final byte a;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ xk3(int i) {
        this.a = i;
    }

    public static xk3 d() {
        xk3 xk3Var;
        synchronized (b) {
            try {
                if (c == null) {
                    c = new xk3(3);
                }
                xk3Var = c;
            } catch (Throwable th) {
                throw th;
            }
        }
        return xk3Var;
    }

    public static String f(String str) {
        int length = str.length();
        StringBuilder sb = new StringBuilder(23);
        sb.append("WM-");
        if (length >= 20) {
            sb.append(str.substring(0, 20));
        } else {
            sb.append(str);
        }
        return sb.toString();
    }

    public void a(String str, String str2) {
        if (this.a <= 3) {
            Log.d(str, str2);
        }
    }

    public void b(String str, String str2) {
        if (this.a <= 6) {
            Log.e(str, str2);
        }
    }

    public void c(String str, String str2, Throwable th) {
        if (this.a <= 6) {
            Log.e(str, str2, th);
        }
    }

    public void e(String str, String str2) {
        if (this.a <= 4) {
            Log.i(str, str2);
        }
    }

    public void g(String str, String str2) {
        if (this.a <= 5) {
            Log.w(str, str2);
        }
    }

    public void h(String str, String str2, Exception exc) {
        if (this.a <= 5) {
            Log.w(str, str2, exc);
        }
    }
}
