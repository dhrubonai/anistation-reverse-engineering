package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public abstract class ov5 {
    public static SharedPreferences a;

    public static final void a(kd2 kd2Var, yz3 yz3Var) {
        yb ybVar = yb.k;
        int hashCode = Long.hashCode(kd2Var.T);
        yz3 E = o80.E(kd2Var, yz3Var);
        al4 l = kd2Var.l();
        tt0.d.getClass();
        kd2Var.h0();
        if (kd2Var.S) {
            kd2Var.k(za3.p0);
        } else {
            kd2Var.q0();
        }
        ss5.i(p7.F, kd2Var, ybVar);
        ss5.i(p7.E, kd2Var, l);
        ss5.h(kd2Var);
        ss5.i(p7.D, kd2Var, E);
        ss5.i(p7.G, kd2Var, Integer.valueOf(hashCode));
        kd2Var.q(true);
    }

    public static final float b(bd6 bd6Var, int i) {
        if (i >= 0) {
            ad6 ad6Var = bd6Var.a;
            o24 o24Var = bd6Var.b;
            if (ad6Var.a.y.length() != 0) {
                int min = Math.min(o24Var.d(i), Math.min(o24Var.b - 1, o24Var.f - 1));
                if (i <= o24Var.c(min, false)) {
                    o24Var.m(min);
                    ArrayList arrayList = o24Var.h;
                    di4 di4Var = (di4) arrayList.get(q23.y(min, arrayList));
                    return di4Var.a.d.g(min - di4Var.d);
                }
                return 0.0f;
            }
            return 0.0f;
        }
        return 0.0f;
    }

    public static final Object c(yg4 yg4Var, ae0 ae0Var, jq6 jq6Var) {
        wc0 wc0Var;
        boolean z = yg4Var instanceof xg4;
        w11 w11Var = w11.x;
        pn6 pn6Var = pn6.a;
        if (z) {
            byte[] d = ((xg4) yg4Var).d();
            Object m0 = h41.m0(ae0Var, d, 0, d.length, jq6Var);
            if (m0 == w11Var) {
                return m0;
            }
        } else if (yg4Var instanceof ob1) {
            ob1 ob1Var = (ob1) yg4Var;
            switch (ob1Var.a) {
                case 0:
                    wc0Var = (wc0) ob1Var.d;
                    break;
                default:
                    InputStream inputStream = (InputStream) ob1Var.d;
                    ja1 ja1Var = rh1.a;
                    j91 j91Var = j91.y;
                    xb0 xb0Var = yb0.a;
                    inputStream.getClass();
                    j91Var.getClass();
                    xb0Var.getClass();
                    int i = y63.a;
                    wc0Var = new ky4(new uz2(inputStream), j91Var);
                    break;
            }
            Object s = zz.s(wc0Var, ae0Var, jq6Var);
            if (s == w11Var) {
                return s;
            }
        } else if (yg4Var instanceof fk0) {
            Object invoke = ((fk0) yg4Var).a.invoke(ae0Var, jq6Var);
            if (invoke != w11Var) {
                invoke = pn6Var;
            }
            if (invoke == w11Var) {
                return invoke;
            }
        } else {
            if (yg4Var instanceof ht1) {
                ze0.m("unreachable code");
                return null;
            }
            ze0.l();
            return null;
        }
        return pn6Var;
    }

    public static long d(zi4 zi4Var, int i, int i2) {
        zi4Var.N(i);
        if (zi4Var.a() >= 5) {
            int m = zi4Var.m();
            if ((8388608 & m) == 0 && ((2096896 & m) >> 8) == i2 && (m & 32) != 0 && zi4Var.A() >= 7 && zi4Var.a() >= 7 && (zi4Var.A() & 16) == 16) {
                zi4Var.k(new byte[6], 0, 6);
                return ((r0[0] & 255) << 25) | ((r0[1] & 255) << 17) | ((r0[2] & 255) << 9) | ((r0[3] & 255) << 1) | ((r0[4] & 255) >> 7);
            }
            return -9223372036854775807L;
        }
        return -9223372036854775807L;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x012c, code lost:
    
        if (r2 == r13) goto L146;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00fd, code lost:
    
        if (r2 != r13) goto L107;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0031  */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.io.Closeable, nc0, ae0] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v20 */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5, types: [ae0] */
    /* JADX WARN: Type inference failed for: r6v2, types: [vz0, iq6, xz0] */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object e(defpackage.ls0 r16, defpackage.nc0 r17, defpackage.nc0 r18, defpackage.xz0 r19) {
        /*
            Method dump skipped, instructions count: 357
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ov5.e(ls0, nc0, nc0, xz0):java.lang.Object");
    }

    public static final long f(String str, long j, long j2, long j3) {
        String str2;
        int i = r46.a;
        try {
            str2 = System.getProperty(str);
        } catch (SecurityException unused) {
            str2 = null;
        }
        if (str2 == null) {
            return j;
        }
        Long L = b06.L(str2);
        if (L != null) {
            long longValue = L.longValue();
            if (j2 <= longValue && longValue <= j3) {
                return longValue;
            }
            StringBuilder sb = new StringBuilder("System property '");
            sb.append(str);
            sb.append("' should be in range ");
            sb.append(j2);
            qx1.w(sb, "..", j3, ", but is '");
            sb.append(longValue);
            sb.append('\'');
            throw new IllegalStateException(sb.toString().toString());
        }
        throw new IllegalStateException(("System property '" + str + "' has unrecognized value '" + str2 + '\'').toString());
    }

    public static int g(String str, int i, int i2) {
        int i3;
        if ((i2 & 8) != 0) {
            i3 = Integer.MAX_VALUE;
        } else {
            i3 = 2097150;
        }
        return (int) f(str, i, 1L, i3);
    }

    public static final h03 h(yz2 yz2Var) {
        return new h03(yz2Var.a, yz2Var.b, yz2Var.c, yz2Var.d);
    }

    public static final LinkedHashMap i(sq2 sq2Var) {
        Boolean bool;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        ri5 V = io3.V((ic2) sq2Var.d.b().b);
        while (V.hasNext()) {
            int intValue = ((Number) V.next()).intValue();
            String kk0Var = sq2Var.c(intValue).toString();
            String kk0Var2 = sq2Var.f(intValue).toString();
            List list = (List) linkedHashMap.get(kk0Var);
            if (list != null) {
                bool = Boolean.valueOf(list.add(kk0Var2));
            } else {
                bool = null;
            }
            if (bool == null) {
                linkedHashMap.put(kk0Var, te4.J(kk0Var2));
            }
        }
        return linkedHashMap;
    }

    public static final bx5 j(ls0 ls0Var, ae0 ae0Var, l11 l11Var, boolean z) {
        py4 Z;
        ae0 ae0Var2;
        nk2 nk2Var = (nk2) ls0Var.A;
        ae0Var.getClass();
        yg4 yg4Var = (yg4) ls0Var.B;
        vz0 vz0Var = null;
        if (yg4Var instanceof ht1) {
            if (z) {
                sw0.i(ae0Var);
            }
            return null;
        }
        String str = nk2Var.get("Content-Length");
        if (str == null) {
            Long a2 = yg4Var.a();
            if (a2 != null) {
                str = String.valueOf(a2.longValue());
            } else {
                str = null;
            }
        }
        String str2 = nk2Var.get("Transfer-Encoding");
        String str3 = yg4Var.c().get("Transfer-Encoding");
        if (str != null && !a34.i(str3, "chunked") && !a34.i(str2, "chunked")) {
            Z = null;
        } else {
            byte[] bArr = zl0.a;
            Z = zz.Z(jf2.x, l11Var, new nc0(false), new c0((Object) ae0Var, vz0Var, (byte) 19));
        }
        if (Z != null) {
            ae0Var2 = Z.a;
        } else {
            ae0Var2 = ae0Var;
        }
        return tl7.z(db.b(l11Var.plus(new r11("cio-client-body-writer"))), null, null, new jq6(ls0Var, yg4Var, ae0Var2, Z, ae0Var, z, null), 3);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(37:55|(2:57|(1:59)(34:60|61|(1:137)(1:67)|68|69|70|71|(1:73)(1:134)|(1:75)(1:133)|76|(1:78)(1:132)|(3:80|(1:82)(1:84)|83)|85|(1:90)|91|(1:96)|(1:100)|(1:102)|103|104|105|106|107|108|109|110|111|112|113|114|115|116|(1:118)|37))|138|61|(1:63)|137|68|69|70|71|(0)(0)|(0)(0)|76|(0)(0)|(0)|85|(2:87|90)|91|(1:96)|(2:98|100)|(0)|103|104|105|106|107|108|109|110|111|112|113|114|115|116|(0)|37) */
    /* JADX WARN: Can't wrap try/catch for region: R(8:1|(2:3|(5:5|6|(6:(1:(1:(2:11|12)(4:14|15|16|17))(5:22|23|24|25|26))(4:42|43|44|45)|30|31|(3:33|34|35)|41|17)(37:55|(2:57|(1:59)(34:60|61|(1:137)(1:67)|68|69|70|71|(1:73)(1:134)|(1:75)(1:133)|76|(1:78)(1:132)|(3:80|(1:82)(1:84)|83)|85|(1:90)|91|(1:96)|(1:100)|(1:102)|103|104|105|106|107|108|109|110|111|112|113|114|115|116|(1:118)|37))|138|61|(1:63)|137|68|69|70|71|(0)(0)|(0)(0)|76|(0)(0)|(0)|85|(2:87|90)|91|(1:96)|(2:98|100)|(0)|103|104|105|106|107|108|109|110|111|112|113|114|115|116|(0)|37)|46|47))|139|6|(0)(0)|46|47|(2:(0)|(1:18))) */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x01d1, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x01d2, code lost:
    
        r8 = r11;
        r1 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x01d5, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x010d, code lost:
    
        r8 = r11;
        r7 = r21;
        r1 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x01d8, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x010b, code lost:
    
        r6 = r25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x01db, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x0109, code lost:
    
        r4 = r24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x0106, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x0107, code lost:
    
        r1 = r23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x01f4, code lost:
    
        if (r1.f(r5) == r8) goto L271;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x01c4, code lost:
    
        if (r1.d(r5) != r8) goto L255;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x01cd, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x01ce, code lost:
    
        r3 = r6;
        r1 = r1;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0178 A[Catch: all -> 0x0106, TryCatch #4 {all -> 0x0106, blocks: (B:71:0x00ec, B:73:0x00f4, B:75:0x0116, B:76:0x011d, B:80:0x0132, B:82:0x013c, B:83:0x0143, B:84:0x013f, B:85:0x0146, B:87:0x014c, B:90:0x0156, B:91:0x0159, B:96:0x016b, B:98:0x0170, B:102:0x0178, B:103:0x017e, B:133:0x0119), top: B:70:0x00ec }] */
    /* JADX WARN: Removed duplicated region for block: B:118:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0119 A[Catch: all -> 0x0106, TryCatch #4 {all -> 0x0106, blocks: (B:71:0x00ec, B:73:0x00f4, B:75:0x0116, B:76:0x011d, B:80:0x0132, B:82:0x013c, B:83:0x0143, B:84:0x013f, B:85:0x0146, B:87:0x014c, B:90:0x0156, B:91:0x0159, B:96:0x016b, B:98:0x0170, B:102:0x0178, B:103:0x017e, B:133:0x0119), top: B:70:0x00ec }] */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00f4 A[Catch: all -> 0x0106, TryCatch #4 {all -> 0x0106, blocks: (B:71:0x00ec, B:73:0x00f4, B:75:0x0116, B:76:0x011d, B:80:0x0132, B:82:0x013c, B:83:0x0143, B:84:0x013f, B:85:0x0146, B:87:0x014c, B:90:0x0156, B:91:0x0159, B:96:0x016b, B:98:0x0170, B:102:0x0178, B:103:0x017e, B:133:0x0119), top: B:70:0x00ec }] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0116 A[Catch: all -> 0x0106, TryCatch #4 {all -> 0x0106, blocks: (B:71:0x00ec, B:73:0x00f4, B:75:0x0116, B:76:0x011d, B:80:0x0132, B:82:0x013c, B:83:0x0143, B:84:0x013f, B:85:0x0146, B:87:0x014c, B:90:0x0156, B:91:0x0159, B:96:0x016b, B:98:0x0170, B:102:0x0178, B:103:0x017e, B:133:0x0119), top: B:70:0x00ec }] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0132 A[Catch: all -> 0x0106, TryCatch #4 {all -> 0x0106, blocks: (B:71:0x00ec, B:73:0x00f4, B:75:0x0116, B:76:0x011d, B:80:0x0132, B:82:0x013c, B:83:0x0143, B:84:0x013f, B:85:0x0146, B:87:0x014c, B:90:0x0156, B:91:0x0159, B:96:0x016b, B:98:0x0170, B:102:0x0178, B:103:0x017e, B:133:0x0119), top: B:70:0x00ec }] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object k(defpackage.ls0 r22, defpackage.ae0 r23, boolean r24, boolean r25, defpackage.xz0 r26) {
        /*
            Method dump skipped, instructions count: 512
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ov5.k(ls0, ae0, boolean, boolean, xz0):java.lang.Object");
    }

    public static SharedPreferences l(Context context) {
        SharedPreferences sharedPreferences;
        synchronized (SharedPreferences.class) {
            try {
                sharedPreferences = a;
                if (sharedPreferences == null) {
                    sharedPreferences = (SharedPreferences) nv5.w(new ip7(context, (byte) 0));
                    a = sharedPreferences;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return sharedPreferences;
    }

    public static /* synthetic */ boolean m(int i, z98 z98Var, StringBuilder sb) {
        if (i - 1 != 0 || z98Var == z98.a) {
            return false;
        }
        sb.append(z98Var.a());
        sb.append('.');
        sb.append(z98Var.b());
        sb.append(':');
        sb.append(z98Var.c());
        return true;
    }
}
