package f1;

import android.text.TextUtils;
import android.util.Log;
import java.net.UnknownHostException;

/* loaded from: classes.dex */
public abstract class o {

    /* renamed from: a, reason: collision with root package name */
    public static final Object f3838a = new Object();

    public static String a(String str, Throwable th) {
        boolean z9;
        String replace;
        if (th == null) {
            replace = null;
        } else {
            synchronized (f3838a) {
                Throwable th2 = th;
                while (true) {
                    if (th2 != null) {
                        try {
                            if (th2 instanceof UnknownHostException) {
                                z9 = true;
                                break;
                            }
                            th2 = th2.getCause();
                        } finally {
                        }
                    } else {
                        z9 = false;
                        break;
                    }
                }
                if (z9) {
                    replace = "UnknownHostException (no network)";
                } else {
                    replace = Log.getStackTraceString(th).trim().replace("\t", "    ");
                }
            }
        }
        if (!TextUtils.isEmpty(replace)) {
            StringBuilder a10 = p.j.a(str, "\n  ");
            a10.append(replace.replace("\n", "\n  "));
            a10.append('\n');
            return a10.toString();
        }
        return str;
    }

    public static void b(String str, String str2) {
        synchronized (f3838a) {
            Log.d(str, a(str2, null));
        }
    }

    public static void c(String str, String str2) {
        synchronized (f3838a) {
            Log.e(str, a(str2, null));
        }
    }

    public static void d(String str, String str2, Throwable th) {
        synchronized (f3838a) {
            Log.e(str, a(str2, th));
        }
    }

    public static void e(String str, String str2) {
        synchronized (f3838a) {
            Log.i(str, a(str2, null));
        }
    }

    public static void f(String str, String str2) {
        synchronized (f3838a) {
            Log.w(str, a(str2, null));
        }
    }

    public static void g(String str, String str2, Throwable th) {
        synchronized (f3838a) {
            Log.w(str, a(str2, th));
        }
    }
}
