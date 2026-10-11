package defpackage;

import android.view.View;
import java.io.EOFException;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public abstract class mv5 {
    public static final jw1 a(ev2 ev2Var, Throwable th) {
        mu2 mu2Var;
        if (th instanceof sb4) {
            ub2 ub2Var = ev2Var.n;
            cv2 cv2Var = ev2Var.t;
            mu2Var = (mu2) ub2Var.invoke(ev2Var);
            if (mu2Var == null) {
                mu2Var = (mu2) cv2Var.j.invoke(ev2Var);
            }
            if (mu2Var == null && (mu2Var = (mu2) ev2Var.m.invoke(ev2Var)) == null) {
                mu2Var = (mu2) cv2Var.i.invoke(ev2Var);
            }
        } else {
            mu2Var = (mu2) ev2Var.m.invoke(ev2Var);
            if (mu2Var == null) {
                mu2Var = (mu2) ev2Var.t.i.invoke(ev2Var);
            }
        }
        return new jw1(mu2Var, ev2Var, th);
    }

    public static z57 b(kd2 kd2Var) {
        View view = (View) kd2Var.j(eb.f);
        z57 d = d(view);
        boolean h = kd2Var.h(d) | kd2Var.h(view);
        Object Q = kd2Var.Q();
        if (h || Q == au0.a) {
            Q = new ll5((Object) d, (Object) view, (byte) 25);
            kd2Var.n0(Q);
        }
        db.c(d, (ub2) Q, kd2Var);
        return d;
    }

    public static String c(xd0 xd0Var) {
        StringBuilder sb = new StringBuilder(xd0Var.size());
        for (int i = 0; i < xd0Var.size(); i++) {
            byte b = xd0Var.b(i);
            if (b != 34) {
                if (b != 39) {
                    if (b != 92) {
                        switch (b) {
                            case 7:
                                sb.append("\\a");
                                break;
                            case 8:
                                sb.append("\\b");
                                break;
                            case 9:
                                sb.append("\\t");
                                break;
                            case 10:
                                sb.append("\\n");
                                break;
                            case 11:
                                sb.append("\\v");
                                break;
                            case 12:
                                sb.append("\\f");
                                break;
                            case 13:
                                sb.append("\\r");
                                break;
                            default:
                                if (b >= 32 && b <= 126) {
                                    sb.append((char) b);
                                    break;
                                } else {
                                    sb.append('\\');
                                    sb.append((char) (((b >>> 6) & 3) + 48));
                                    sb.append((char) (((b >>> 3) & 7) + 48));
                                    sb.append((char) ((b & 7) + 48));
                                    break;
                                }
                                break;
                        }
                    } else {
                        sb.append("\\\\");
                    }
                } else {
                    sb.append("\\'");
                }
            } else {
                sb.append("\\\"");
            }
        }
        return sb.toString();
    }

    public static z57 d(View view) {
        z57 z57Var;
        WeakHashMap weakHashMap = z57.w;
        synchronized (weakHashMap) {
            try {
                Object obj = weakHashMap.get(view);
                if (obj == null) {
                    obj = new z57(view);
                    weakHashMap.put(view, obj);
                }
                z57Var = (z57) obj;
            } catch (Throwable th) {
                throw th;
            }
        }
        return z57Var;
    }

    public static r26 e(r26 r26Var) {
        if (!(r26Var instanceof t26)) {
            if (r26Var instanceof s26) {
                return r26Var;
            }
            if (r26Var instanceof Serializable) {
                return new s26(r26Var);
            }
            return new t26(r26Var);
        }
        return r26Var;
    }

    public static final int f(cv5 cv5Var, ByteBuffer byteBuffer) {
        cv5Var.getClass();
        byteBuffer.getClass();
        if (cv5Var.c().z == 0) {
            cv5Var.g(8192L);
            if (cv5Var.c().z == 0) {
                return -1;
            }
        }
        oa0 c = cv5Var.c();
        c.getClass();
        if (c.D()) {
            return -1;
        }
        if (!c.D()) {
            yf5 yf5Var = c.x;
            yf5Var.getClass();
            byte[] bArr = yf5Var.a;
            int i = yf5Var.b;
            int min = Math.min(byteBuffer.remaining(), yf5Var.c - i);
            byteBuffer.put(bArr, i, min);
            if (min != 0) {
                if (min >= 0) {
                    if (min <= yf5Var.b()) {
                        c.skip(min);
                        return min;
                    }
                    ze0.m("Returned too many bytes");
                    return 0;
                }
                ze0.m("Returned negative read bytes count");
                return 0;
            }
            return min;
        }
        ze0.k("Buffer is empty");
        return 0;
    }

    public static final Object g(y43 y43Var, String str, h63 h63Var, ne1 ne1Var) {
        y43Var.getClass();
        str.getClass();
        return new r63(y43Var, h63Var, str, ne1Var.getDescriptor()).f(ne1Var);
    }

    public static final String h(oa0 oa0Var, long j, Charset charset) {
        int i;
        String str;
        if (j >= 0 && j <= 2147483647L) {
            if (oa0Var.z >= j) {
                if (j == 0) {
                    return "";
                }
                if (!oa0Var.D()) {
                    yf5 yf5Var = oa0Var.x;
                    yf5Var.getClass();
                    byte[] bArr = yf5Var.a;
                    int i2 = yf5Var.b;
                    if (yf5Var.c - i2 >= j) {
                        i = (int) j;
                        str = new String(bArr, i2, i, charset);
                    } else {
                        i = 0;
                        str = null;
                    }
                    if (i != 0) {
                        if (i >= 0) {
                            if (i <= yf5Var.b()) {
                                oa0Var.skip(i);
                            } else {
                                ze0.m("Returned too many bytes");
                                return null;
                            }
                        } else {
                            ze0.m("Returned negative read bytes count");
                            return null;
                        }
                    }
                    if (str == null) {
                        return new String(nv5.o(oa0Var, (int) j), charset);
                    }
                    return str;
                }
                ze0.k("Buffer is empty");
                return null;
            }
            StringBuilder n = zo5.n(j, "Buffer contains less bytes then required (byteCount: ", ", size: ");
            n.append(oa0Var.z);
            n.append(')');
            throw new EOFException(n.toString());
        }
        ze0.e(qx1.j(j, "byteCount (", ") is not within the range [0..2147483647)"));
        return null;
    }

    public static xq6 i(int i, String str) {
        return new xq6(new h03(0, 0, 0, 0), str);
    }

    public static int j(int i) {
        int[] iArr = {1, 2, 3};
        for (int i2 = 0; i2 < 3; i2++) {
            int i3 = iArr[i2];
            int i4 = i3 - 1;
            if (i3 != 0) {
                if (i4 == i) {
                    return i3;
                }
            } else {
                throw null;
            }
        }
        return 1;
    }

    public static /* synthetic */ String k(int i, int i2, byte b, String str, String str2) {
        StringBuilder sb = new StringBuilder(String.valueOf(i2).length() + b + String.valueOf(i).length());
        sb.append(str);
        sb.append(i2);
        sb.append(str2);
        sb.append(i);
        return sb.toString();
    }
}
