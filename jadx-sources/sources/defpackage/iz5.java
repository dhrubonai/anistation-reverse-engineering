package defpackage;

import android.app.AppOpsManager;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.util.Log;
import android.widget.TextView;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public abstract class iz5 {
    public static final LinkedHashMap a(ArrayList arrayList) {
        String str = qj4.y;
        qj4 l = r18.l("/");
        LinkedHashMap U = vn3.U(new ai4(l, new t97(l, true, null, 0L, 0L, 0L, 0, 0L, 0, 0, null, null, null, 65532)));
        for (t97 t97Var : yo0.C0(arrayList, new w66((byte) 4))) {
            if (((t97) U.put(t97Var.a, t97Var)) == null) {
                while (true) {
                    qj4 qj4Var = t97Var.a;
                    qj4 c = qj4Var.c();
                    if (c != null) {
                        t97 t97Var2 = (t97) U.get(c);
                        if (t97Var2 != null) {
                            t97Var2.q.add(qj4Var);
                            break;
                        }
                        t97 t97Var3 = new t97(c, true, null, 0L, 0L, 0L, 0, 0L, 0, 0, null, null, null, 65532);
                        U.put(c, t97Var3);
                        t97Var3.q.add(qj4Var);
                        t97Var = t97Var3;
                    }
                }
            }
        }
        return U;
    }

    public static final void b(e04 e04Var, im0 im0Var, ic2 ic2Var) {
        String str;
        e04Var.getClass();
        y83 u = zz.u(im0Var, ic2Var, v83.y, e04Var, 72);
        im0 a = z05.a(vv6.class);
        k03 k03Var = u.b;
        r50 r50Var = k03Var.a;
        r50Var.f.add(a);
        e04 e04Var2 = u.a;
        e04Var2.getClass();
        ArrayList arrayList = r50Var.f;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            kz5 kz5Var = r50Var.c;
            qx4 qx4Var = r50Var.a;
            StringBuilder sb = new StringBuilder(f73.a((e73) obj));
            sb.append(':');
            if (kz5Var != null) {
                str = kz5Var.a;
            } else {
                str = "";
            }
            sb.append(str);
            sb.append(':');
            sb.append(qx4Var);
            e04Var2.c.put(sb.toString(), k03Var);
        }
    }

    public static final String c(int i) {
        t80.z(16);
        String num = Integer.toString(i, 16);
        num.getClass();
        return "0x".concat(num);
    }

    public static final boolean d(ko koVar) {
        int length = koVar.y.length();
        List list = koVar.x;
        if (list != null) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                jo joVar = (jo) list.get(i);
                if ((joVar.a instanceof vh3) && lo.b(0, length, joVar.b, joVar.c)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean e(Context context, int i) {
        if (l(i, context, "com.google.android.gms")) {
            try {
                PackageInfo packageInfo = context.getPackageManager().getPackageInfo("com.google.android.gms", 64);
                yh2 a = yh2.a(context);
                if (packageInfo != null) {
                    if (!yh2.e(packageInfo, false)) {
                        if (yh2.e(packageInfo, true)) {
                            if (!xh2.b((Context) a.x)) {
                                Log.w("GoogleSignatureVerifier", "Test-keys aren't accepted on this build.");
                                return false;
                            }
                        }
                    }
                    return true;
                }
            } catch (PackageManager.NameNotFoundException unused) {
                if (Log.isLoggable("UidVerifier", 3)) {
                    Log.d("UidVerifier", "Package manager can't find google play services package, defaulting to false");
                }
            }
        }
        return false;
    }

    public static String f(String str, String str2) {
        int length = str.length() - str2.length();
        if (length >= 0 && length <= 1) {
            StringBuilder sb = new StringBuilder(str2.length() + str.length());
            for (int i = 0; i < str.length(); i++) {
                sb.append(str.charAt(i));
                if (str2.length() > i) {
                    sb.append(str2.charAt(i));
                }
            }
            return sb.toString();
        }
        ze0.k("Invalid input received");
        return null;
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:108:0x01a9 A[Catch: all -> 0x014a, TRY_LEAVE, TryCatch #4 {all -> 0x014a, blocks: (B:3:0x000d, B:5:0x001b, B:6:0x0023, B:26:0x007a, B:28:0x0084, B:72:0x0149, B:82:0x0142, B:83:0x014e, B:108:0x01a9, B:114:0x01b6, B:117:0x01a4, B:11:0x01c2, B:15:0x01ce, B:16:0x01d5, B:133:0x01d6, B:134:0x01d9, B:135:0x01da, B:136:0x01ef, B:78:0x013d, B:106:0x019f, B:30:0x008d, B:32:0x0096, B:35:0x00a7, B:50:0x012c, B:64:0x0125, B:65:0x0130, B:66:0x0135, B:8:0x002c, B:19:0x0035, B:25:0x005b, B:130:0x01ba, B:131:0x01bf), top: B:2:0x000d, inners: #0, #1, #6, #10 }] */
    /* JADX WARN: Removed duplicated region for block: B:114:0x01b6 A[Catch: all -> 0x014a, TRY_ENTER, TRY_LEAVE, TryCatch #4 {all -> 0x014a, blocks: (B:3:0x000d, B:5:0x001b, B:6:0x0023, B:26:0x007a, B:28:0x0084, B:72:0x0149, B:82:0x0142, B:83:0x014e, B:108:0x01a9, B:114:0x01b6, B:117:0x01a4, B:11:0x01c2, B:15:0x01ce, B:16:0x01d5, B:133:0x01d6, B:134:0x01d9, B:135:0x01da, B:136:0x01ef, B:78:0x013d, B:106:0x019f, B:30:0x008d, B:32:0x0096, B:35:0x00a7, B:50:0x012c, B:64:0x0125, B:65:0x0130, B:66:0x0135, B:8:0x002c, B:19:0x0035, B:25:0x005b, B:130:0x01ba, B:131:0x01bf), top: B:2:0x000d, inners: #0, #1, #6, #10 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final defpackage.u97 g(defpackage.qj4 r24, defpackage.n22 r25, defpackage.ub2 r26) {
        /*
            Method dump skipped, instructions count: 507
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.iz5.g(qj4, n22, ub2):u97");
    }

    /* JADX WARN: Type inference failed for: r10v0, types: [java.lang.Object, w05] */
    /* JADX WARN: Type inference failed for: r1v6, types: [r05, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, v05] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object, v05] */
    /* JADX WARN: Type inference failed for: r7v7, types: [java.lang.Object, v05] */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.Object, w05] */
    /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Object, w05] */
    public static final t97 h(final xy4 xy4Var) {
        long j;
        int l = xy4Var.l();
        if (l == 33639248) {
            xy4Var.skip(4L);
            short q = xy4Var.q();
            int i = q & 65535;
            if ((q & 1) == 0) {
                int q2 = xy4Var.q() & 65535;
                int q3 = xy4Var.q() & 65535;
                int q4 = xy4Var.q() & 65535;
                long l2 = xy4Var.l() & 4294967295L;
                final ?? obj = new Object();
                obj.x = xy4Var.l() & 4294967295L;
                final ?? obj2 = new Object();
                obj2.x = xy4Var.l() & 4294967295L;
                int q5 = xy4Var.q() & 65535;
                int q6 = xy4Var.q() & 65535;
                int q7 = xy4Var.q() & 65535;
                xy4Var.skip(8L);
                final ?? obj3 = new Object();
                obj3.x = xy4Var.l() & 4294967295L;
                String t = xy4Var.t(q5);
                if (!uz5.N(t, (char) 0)) {
                    if (obj2.x == 4294967295L) {
                        j = 8;
                    } else {
                        j = 0;
                    }
                    if (obj.x == 4294967295L) {
                        j += 8;
                    }
                    if (obj3.x == 4294967295L) {
                        j += 8;
                    }
                    final long j2 = j;
                    final ?? obj4 = new Object();
                    final ?? obj5 = new Object();
                    final ?? obj6 = new Object();
                    final ?? obj7 = new Object();
                    i(xy4Var, q6, new ic2() { // from class: w97
                        @Override // defpackage.ic2
                        public final Object invoke(Object obj8, Object obj9) {
                            long j3;
                            int intValue = ((Integer) obj8).intValue();
                            long longValue = ((Long) obj9).longValue();
                            xy4 xy4Var2 = xy4Var;
                            if (intValue != 1) {
                                if (intValue == 10) {
                                    if (longValue >= 4) {
                                        xy4Var2.skip(4L);
                                        iz5.i(xy4Var2, (int) (longValue - 4), new v97(obj4, xy4Var2, obj5, obj6));
                                    } else {
                                        qi2.k("bad zip: NTFS extra too short");
                                        return null;
                                    }
                                }
                            } else {
                                r05 r05Var = r05.this;
                                if (!r05Var.x) {
                                    r05Var.x = true;
                                    if (longValue >= j2) {
                                        v05 v05Var = obj2;
                                        long j4 = v05Var.x;
                                        if (j4 == 4294967295L) {
                                            j4 = xy4Var2.p();
                                        }
                                        v05Var.x = j4;
                                        v05 v05Var2 = obj;
                                        long j5 = 0;
                                        if (v05Var2.x == 4294967295L) {
                                            j3 = xy4Var2.p();
                                        } else {
                                            j3 = 0;
                                        }
                                        v05Var2.x = j3;
                                        v05 v05Var3 = obj3;
                                        if (v05Var3.x == 4294967295L) {
                                            j5 = xy4Var2.p();
                                        }
                                        v05Var3.x = j5;
                                    } else {
                                        qi2.k("bad zip: zip64 extra too short");
                                        return null;
                                    }
                                } else {
                                    qi2.k("bad zip: zip64 extra repeated");
                                    return null;
                                }
                            }
                            return pn6.a;
                        }
                    });
                    if (j2 > 0 && !obj7.x) {
                        qi2.k("bad zip: zip64 extra required but absent");
                        return null;
                    }
                    String t2 = xy4Var.t(q7);
                    String str = qj4.y;
                    return new t97(r18.l("/").e(t), b06.A(t, "/", false), t2, l2, obj.x, obj2.x, q2, obj3.x, q4, q3, (Long) obj4.x, (Long) obj5.x, (Long) obj6.x, 57344);
                }
                qi2.k("bad zip: filename contains 0x00");
                return null;
            }
            qi2.k("unsupported zip: general purpose bit flag=".concat(c(i)));
            return null;
        }
        throw new IOException("bad zip: expected " + c(33639248) + " but was " + c(l));
    }

    public static final void i(xy4 xy4Var, int i, ic2 ic2Var) {
        pa0 pa0Var = xy4Var.y;
        long j = i;
        while (j != 0) {
            if (j >= 4) {
                int q = xy4Var.q() & 65535;
                long q2 = xy4Var.q() & 65535;
                long j2 = j - 4;
                if (j2 >= q2) {
                    xy4Var.m(q2);
                    long j3 = pa0Var.y;
                    ic2Var.invoke(Integer.valueOf(q), Long.valueOf(q2));
                    long j4 = (pa0Var.y + q2) - j3;
                    if (j4 >= 0) {
                        if (j4 > 0) {
                            pa0Var.skip(j4);
                        }
                        j = j2 - q2;
                    } else {
                        qi2.k(qx1.h(q, "unsupported zip: too many bytes processed for "));
                        return;
                    }
                } else {
                    qi2.k("bad zip: truncated value in extra field");
                    return;
                }
            } else {
                qi2.k("bad zip: truncated header in extra field");
                return;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object, w05] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, w05] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, w05] */
    public static final t97 j(xy4 xy4Var, t97 t97Var) {
        int l = xy4Var.l();
        if (l == 67324752) {
            xy4Var.skip(2L);
            short q = xy4Var.q();
            int i = q & 65535;
            if ((q & 1) == 0) {
                xy4Var.skip(18L);
                int q2 = xy4Var.q() & 65535;
                xy4Var.skip(xy4Var.q() & 65535);
                if (t97Var == null) {
                    xy4Var.skip(q2);
                    return null;
                }
                ?? obj = new Object();
                ?? obj2 = new Object();
                ?? obj3 = new Object();
                i(xy4Var, q2, new v97(xy4Var, (w05) obj, (w05) obj2, (w05) obj3));
                return new t97(t97Var.a, t97Var.b, t97Var.c, t97Var.d, t97Var.e, t97Var.f, t97Var.g, t97Var.h, t97Var.i, t97Var.j, t97Var.k, t97Var.l, t97Var.m, (Integer) obj.x, (Integer) obj2.x, (Integer) obj3.x);
            }
            qi2.k("unsupported zip: general purpose bit flag=".concat(c(i)));
            return null;
        }
        throw new IOException("bad zip: expected " + c(67324752) + " but was " + c(l));
    }

    public static void k(TextView textView, int i) {
        if (i >= 0) {
            if (i != textView.getPaint().getFontMetricsInt(null)) {
                textView.setLineSpacing(i - r0, 1.0f);
                return;
            }
            return;
        }
        p65.b();
    }

    public static boolean l(int i, Context context, String str) {
        try {
            AppOpsManager appOpsManager = (AppOpsManager) f97.a(context).x.getSystemService("appops");
            if (appOpsManager != null) {
                appOpsManager.checkPackage(i, str);
                return true;
            }
            throw new NullPointerException("context.getSystemService(Context.APP_OPS_SERVICE) is null");
        } catch (SecurityException unused) {
            return false;
        }
    }

    public static int m(int i, int i2) {
        if (i2 >= 0) {
            if (i2 <= i) {
                return i;
            }
            int i3 = i + (i >> 1) + 1;
            if (i3 < i2) {
                int highestOneBit = Integer.highestOneBit(i2 - 1);
                i3 = highestOneBit + highestOneBit;
            }
            if (i3 < 0) {
                return Integer.MAX_VALUE;
            }
            return i3;
        }
        ze0.k("cannot store more than Integer.MAX_VALUE elements");
        return 0;
    }
}
