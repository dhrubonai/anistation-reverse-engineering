package defpackage;

import android.text.TextUtils;
import android.util.Log;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class es7 extends pv7 {
    public long A;
    public String B;
    public final bs7 C;
    public final bs7 D;
    public final bs7 E;
    public final bs7 F;
    public final bs7 G;
    public final bs7 H;
    public final bs7 I;
    public final bs7 J;
    public final bs7 K;
    public char z;

    public es7(gu7 gu7Var) {
        super(gu7Var);
        this.z = (char) 0;
        this.A = -1L;
        this.C = new bs7(this, 6, false, false);
        this.D = new bs7(this, 6, true, false);
        this.E = new bs7(this, 6, false, true);
        this.F = new bs7(this, 5, false, false);
        this.G = new bs7(this, 5, true, false);
        this.H = new bs7(this, 5, false, true);
        this.I = new bs7(this, 4, false, false);
        this.J = new bs7(this, 3, false, false);
        this.K = new bs7(this, 2, false, false);
    }

    public static cs7 P(String str) {
        if (str == null) {
            return null;
        }
        return new cs7(str);
    }

    public static String S(boolean z, String str, Object obj, Object obj2, Object obj3) {
        String T = T(obj, z);
        String T2 = T(obj2, z);
        String T3 = T(obj3, z);
        StringBuilder sb = new StringBuilder();
        String str2 = "";
        if (str == null) {
            str = "";
        }
        if (!TextUtils.isEmpty(str)) {
            sb.append(str);
            str2 = ": ";
        }
        String str3 = ", ";
        if (!TextUtils.isEmpty(T)) {
            sb.append(str2);
            sb.append(T);
            str2 = ", ";
        }
        if (!TextUtils.isEmpty(T2)) {
            sb.append(str2);
            sb.append(T2);
        } else {
            str3 = str2;
        }
        if (!TextUtils.isEmpty(T3)) {
            sb.append(str3);
            sb.append(T3);
        }
        return sb.toString();
    }

    public static String T(Object obj, boolean z) {
        String th;
        int lastIndexOf;
        String substring;
        String className;
        int lastIndexOf2;
        String substring2;
        String str = "";
        if (obj == null) {
            return "";
        }
        if (obj instanceof Integer) {
            obj = Long.valueOf(((Integer) obj).intValue());
        }
        if (obj instanceof Long) {
            if (!z) {
                return obj.toString();
            }
            Long l = (Long) obj;
            if (Math.abs(l.longValue()) < 100) {
                return obj.toString();
            }
            char charAt = obj.toString().charAt(0);
            String valueOf = String.valueOf(Math.abs(l.longValue()));
            long round = Math.round(Math.pow(10.0d, valueOf.length() - 1));
            long round2 = Math.round(Math.pow(10.0d, valueOf.length()) - 1.0d);
            int length = String.valueOf(round).length();
            if (charAt == '-') {
                str = "-";
            }
            StringBuilder sb = new StringBuilder(str.length() + str.length() + length + 3 + String.valueOf(round2).length());
            qx1.w(sb, str, round, "...");
            sb.append(str);
            sb.append(round2);
            return sb.toString();
        }
        if (obj instanceof Boolean) {
            return obj.toString();
        }
        if (obj instanceof Throwable) {
            Throwable th2 = (Throwable) obj;
            if (z) {
                th = th2.getClass().getName();
            } else {
                th = th2.toString();
            }
            StringBuilder sb2 = new StringBuilder(th);
            String canonicalName = gu7.class.getCanonicalName();
            if (TextUtils.isEmpty(canonicalName) || (lastIndexOf = canonicalName.lastIndexOf(46)) == -1) {
                substring = "";
            } else {
                substring = canonicalName.substring(0, lastIndexOf);
            }
            StackTraceElement[] stackTrace = th2.getStackTrace();
            int length2 = stackTrace.length;
            int i = 0;
            while (true) {
                if (i >= length2) {
                    break;
                }
                StackTraceElement stackTraceElement = stackTrace[i];
                if (!stackTraceElement.isNativeMethod() && (className = stackTraceElement.getClassName()) != null) {
                    if (TextUtils.isEmpty(className) || (lastIndexOf2 = className.lastIndexOf(46)) == -1) {
                        substring2 = "";
                    } else {
                        substring2 = className.substring(0, lastIndexOf2);
                    }
                    if (substring2.equals(substring)) {
                        sb2.append(": ");
                        sb2.append(stackTraceElement);
                        break;
                    }
                }
                i++;
            }
            return sb2.toString();
        }
        if (obj instanceof cs7) {
            return ((cs7) obj).a;
        }
        if (z) {
            return "-";
        }
        return obj.toString();
    }

    public final void Q(int i, boolean z, boolean z2, String str, Object obj, Object obj2, Object obj3) {
        if (!z && Log.isLoggable(R(), i)) {
            Log.println(i, R(), S(false, str, obj, obj2, obj3));
        }
        if (!z2 && i >= 5) {
            a34.x(str);
            au7 au7Var = ((gu7) this.x).D;
            if (au7Var == null) {
                Log.println(6, R(), "Scheduler not set. Not logging error/warn");
            } else {
                if (!au7Var.y) {
                    Log.println(6, R(), "Scheduler not initialized. Not logging error/warn");
                    return;
                }
                if (i >= 9) {
                    i = 8;
                }
                au7Var.U(new zr7(this, i, str, obj, obj2, obj3));
            }
        }
    }

    public final String R() {
        String str;
        synchronized (this) {
            try {
                str = this.B;
                if (str == null) {
                    ((gu7) ((gu7) this.x).A.x).getClass();
                    str = "FA";
                    this.B = "FA";
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return str;
    }
}
