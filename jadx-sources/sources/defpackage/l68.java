package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.webkit.WebView;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.logging.Logger;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class l68 implements es0, fu5, nj5, xm0, sa6, ng7 {
    public static l68 y;
    public final /* synthetic */ byte x;
    public static final l68 z = new l68(1);
    public static final ze0 A = new ze0(20);
    public static final l68 B = new l68(3);
    public static final l68 C = new l68(4);
    public static final l68 D = new l68(5);
    public static final n05 E = new n05(Float.NaN, Float.NaN, Float.NaN, Float.NaN);
    public static final l68 F = new l68(7);
    public static final l68 G = new l68(8);
    public static final l68 H = new l68(9);
    public static final l68 I = new l68(10);
    public static final l68 J = new l68(11);
    public static final p65 K = new p65(6);
    public static final p65 L = new p65(7);
    public static final p65 M = new p65(8);
    public static final p65 N = new p65(9);
    public static final p65 O = new p65(10);
    public static final l68 P = new l68(13);
    public static final l68 Q = new l68(14);
    public static final l68 R = new l68(15);
    public static final l68 S = new l68(16);
    public static final l68 T = new l68(17);
    public static final l68 U = new l68(18);
    public static final l68 V = new l68(19);
    public static final l68 W = new l68(20);
    public static final l68 X = new l68(21);
    public static final l68 Y = new l68(22);
    public static final l68 Z = new l68(23);
    public static final l68 a0 = new l68(24);
    public static final l68 b0 = new l68(25);
    public static final l68 c0 = new l68(26);
    public static final l68 d0 = new l68(27);
    public static final l68 e0 = new l68(28);
    public static final l68 f0 = new l68(29);

    public /* synthetic */ l68(byte b) {
        this.x = b;
    }

    public static void b(WebView webView, String str) {
        if (webView != null && !TextUtils.isEmpty(str)) {
            try {
                webView.evaluateJavascript(str, null);
            } catch (IllegalStateException unused) {
                webView.loadUrl("javascript: " + str);
            }
        }
    }

    public void a(WebView webView, String str, Object... objArr) {
        String obj;
        if (webView != null) {
            StringBuilder sb = new StringBuilder(128);
            sb.append("if(window.omidBridge!==undefined){omidBridge.");
            sb.append(str);
            sb.append("(");
            if (objArr.length > 0) {
                for (Object obj2 : objArr) {
                    if (obj2 == null) {
                        obj = "null";
                    } else {
                        if (obj2 instanceof String) {
                            obj = obj2.toString();
                            if (!obj.startsWith("{")) {
                                sb.append('\"');
                                sb.append(obj);
                                sb.append('\"');
                            }
                        } else {
                            sb.append(obj2);
                        }
                        sb.append(",");
                    }
                    sb.append(obj);
                    sb.append(",");
                }
                sb.setLength(sb.length() - 1);
            }
            sb.append(")}");
            String sb2 = sb.toString();
            Handler handler = webView.getHandler();
            if (handler != null && Looper.myLooper() != handler.getLooper()) {
                handler.post(new yc2(this, webView, sb2));
            } else {
                b(webView, sb2);
            }
        }
    }

    @Override // defpackage.ng7
    public boolean c(Class cls) {
        return mf7.class.isAssignableFrom(cls);
    }

    @Override // defpackage.ng7
    public wg7 d(Class cls) {
        if (mf7.class.isAssignableFrom(cls)) {
            try {
                return (wg7) mf7.l(cls.asSubclass(mf7.class)).q(3);
            } catch (Exception e) {
                ov3.k("Unable to get message info for ".concat(cls.getName()), e);
                return null;
            }
        }
        ze0.k("Unsupported message type: ".concat(cls.getName()));
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.xm0
    public void f(wp2 wp2Var, t36 t36Var) {
        vz0 vz0Var = null;
        switch (this.x) {
            case 11:
                wp2Var.A.f(ir2.i, new wz4((jc2) t36Var, vz0Var, (byte) 1));
                return;
            default:
                wp2Var.A.f(ir2.k, new wz4((lc2) t36Var, vz0Var, (byte) 2));
                return;
        }
    }

    @Override // defpackage.nj5
    public Object getDefaultValue() {
        return new j44(true);
    }

    @Override // defpackage.es0
    public Object h(kz kzVar) {
        Object l = kzVar.l(new px4(vz.class, Executor.class));
        l.getClass();
        return q23.B((Executor) l);
    }

    @Override // defpackage.nj5
    public Object readFrom(InputStream inputStream, vz0 vz0Var) {
        int i;
        byte[] bArr;
        try {
            ys4 o = ys4.o((FileInputStream) inputStream);
            j44 j44Var = new j44(false);
            us4[] us4VarArr = (us4[]) Arrays.copyOf(new us4[0], 0);
            j44Var.b();
            if (us4VarArr.length <= 0) {
                Map l = o.l();
                l.getClass();
                for (Map.Entry entry : l.entrySet()) {
                    String str = (String) entry.getKey();
                    ct4 ct4Var = (ct4) entry.getValue();
                    str.getClass();
                    ct4Var.getClass();
                    int u = ct4Var.u();
                    if (u == 0) {
                        i = -1;
                    } else {
                        i = vs4.a[h11.B(u)];
                    }
                    switch (i) {
                        case -1:
                            throw new IOException("Value case is null.", null);
                        case 0:
                        default:
                            ze0.l();
                            return null;
                        case 1:
                            j44Var.f(new ts4(str), Boolean.valueOf(ct4Var.l()));
                            break;
                        case 2:
                            j44Var.f(new ts4(str), Float.valueOf(ct4Var.p()));
                            break;
                        case 3:
                            j44Var.f(new ts4(str), Double.valueOf(ct4Var.o()));
                            break;
                        case 4:
                            j44Var.f(new ts4(str), Integer.valueOf(ct4Var.q()));
                            break;
                        case 5:
                            j44Var.f(new ts4(str), Long.valueOf(ct4Var.r()));
                            break;
                        case 6:
                            j44Var.f(new ts4(str), ct4Var.s());
                            break;
                        case 7:
                            ts4 ts4Var = new ts4(str);
                            x13 n = ct4Var.t().n();
                            n.getClass();
                            j44Var.f(ts4Var, yo0.N0(n));
                            break;
                        case 8:
                            ts4 ts4Var2 = new ts4(str);
                            xd0 m = ct4Var.m();
                            int size = m.size();
                            if (size == 0) {
                                bArr = y13.b;
                            } else {
                                byte[] bArr2 = new byte[size];
                                m.f(size, bArr2);
                                bArr = bArr2;
                            }
                            j44Var.f(ts4Var2, bArr);
                            break;
                        case 9:
                            throw new IOException("Value not set.", null);
                    }
                }
                return new j44(new LinkedHashMap(j44Var.a()), true);
            }
            us4 us4Var = us4VarArr[0];
            throw null;
        } catch (b33 e) {
            throw new IOException("Unable to parse preferences proto.", e);
        }
    }

    public String toString() {
        switch (this.x) {
            case 9:
                return "NoDeclaredBrand";
            case 14:
                return "TextFieldLineLimits.SingleLine";
            default:
                return super.toString();
        }
    }

    @Override // defpackage.nj5
    public Object writeTo(Object obj, OutputStream outputStream, vz0 vz0Var) {
        vd2 a;
        Map a2 = ((j44) obj).a();
        ws4 n = ys4.n();
        for (Map.Entry entry : a2.entrySet()) {
            ts4 ts4Var = (ts4) entry.getKey();
            Object value = entry.getValue();
            String str = ts4Var.a;
            if (value instanceof Boolean) {
                bt4 v = ct4.v();
                boolean booleanValue = ((Boolean) value).booleanValue();
                v.c();
                ((ct4) v.y).w(booleanValue);
                a = v.a();
            } else if (value instanceof Float) {
                bt4 v2 = ct4.v();
                float floatValue = ((Number) value).floatValue();
                v2.c();
                ((ct4) v2.y).z(floatValue);
                a = v2.a();
            } else if (value instanceof Double) {
                bt4 v3 = ct4.v();
                double doubleValue = ((Number) value).doubleValue();
                v3.c();
                ((ct4) v3.y).y(doubleValue);
                a = v3.a();
            } else if (value instanceof Integer) {
                bt4 v4 = ct4.v();
                int intValue = ((Number) value).intValue();
                v4.c();
                ((ct4) v4.y).A(intValue);
                a = v4.a();
            } else if (value instanceof Long) {
                bt4 v5 = ct4.v();
                long longValue = ((Number) value).longValue();
                v5.c();
                ((ct4) v5.y).B(longValue);
                a = v5.a();
            } else if (value instanceof String) {
                bt4 v6 = ct4.v();
                v6.c();
                ((ct4) v6.y).C((String) value);
                a = v6.a();
            } else if (value instanceof Set) {
                bt4 v7 = ct4.v();
                zs4 o = at4.o();
                o.c();
                ((at4) o.y).l((Set) value);
                v7.c();
                ((ct4) v7.y).D((at4) o.a());
                a = v7.a();
            } else if (value instanceof byte[]) {
                bt4 v8 = ct4.v();
                byte[] bArr = (byte[]) value;
                xd0 d = xd0.d(bArr, 0, bArr.length);
                v8.c();
                ((ct4) v8.y).x(d);
                a = v8.a();
            } else {
                ze0.m("PreferencesSerializer does not support type: ".concat(value.getClass().getName()));
                return null;
            }
            n.getClass();
            str.getClass();
            n.c();
            ((ys4) n.y).m().put(str, (ct4) a);
        }
        ys4 ys4Var = (ys4) n.a();
        int a3 = ys4Var.a(null);
        Logger logger = to0.f;
        if (a3 > 4096) {
            a3 = 4096;
        }
        to0 to0Var = new to0((dn6) outputStream, a3);
        ys4Var.b(to0Var);
        if (to0Var.d > 0) {
            to0Var.k();
        }
        return pn6.a;
    }
}
