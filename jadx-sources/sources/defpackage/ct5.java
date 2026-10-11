package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import com.unity3d.ads.core.data.datasource.AndroidGoogleAppIdDataSource;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public abstract class ct5 {
    public static lp6 a(String str) {
        String str2 = qj4.y;
        StringBuilder sb = new StringBuilder();
        sb.append("file:");
        if (str != null) {
            sb.append(str);
        }
        return new lp6(sb.toString(), str2, "file", null, str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Type inference failed for: r5v0, types: [t05, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b(defpackage.wc5 r9, float r10, defpackage.ml r11, defpackage.f61 r12, defpackage.ub2 r13, defpackage.xz0 r14) {
        /*
            boolean r0 = r14 instanceof defpackage.at5
            if (r0 == 0) goto L13
            r0 = r14
            at5 r0 = (defpackage.at5) r0
            int r1 = r0.B
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.B = r1
            goto L18
        L13:
            at5 r0 = new at5
            r0.<init>(r14)
        L18:
            java.lang.Object r14 = r0.A
            int r1 = r0.B
            r2 = 1
            if (r1 == 0) goto L32
            if (r1 != r2) goto L2b
            float r10 = r0.x
            t05 r9 = r0.z
            ml r11 = r0.y
            defpackage.m37.N(r14)
            goto L69
        L2b:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ze0.m(r9)
            r9 = 0
            return r9
        L32:
            defpackage.m37.N(r14)
            t05 r5 = new t05
            r5.<init>()
            java.lang.Object r14 = r11.b()
            java.lang.Number r14 = (java.lang.Number) r14
            float r14 = r14.floatValue()
            r1 = 0
            int r14 = (r14 > r1 ? 1 : (r14 == r1 ? 0 : -1))
            if (r14 != 0) goto L4b
            r14 = r2
            goto L4c
        L4b:
            r14 = 0
        L4c:
            r14 = r14 ^ r2
            zs5 r3 = new zs5
            r8 = 0
            r6 = r9
            r4 = r10
            r7 = r13
            r3.<init>(r4, r5, r6, r7, r8)
            r0.y = r11
            r0.z = r5
            r0.x = r4
            r0.B = r2
            java.lang.Object r9 = defpackage.nv5.d(r11, r12, r14, r3, r0)
            w11 r10 = defpackage.w11.x
            if (r9 != r10) goto L67
            return r10
        L67:
            r10 = r4
            r9 = r5
        L69:
            il r12 = new il
            float r9 = r9.x
            float r10 = r10 - r9
            java.lang.Float r9 = new java.lang.Float
            r9.<init>(r10)
            r12.<init>(r9, r11)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ct5.b(wc5, float, ml, f61, ub2, xz0):java.lang.Object");
    }

    public static final void c(kl klVar, wc5 wc5Var, ub2 ub2Var, float f) {
        float f2;
        try {
            f2 = wc5Var.a(f);
        } catch (CancellationException unused) {
            klVar.a();
            f2 = 0.0f;
        }
        ub2Var.invoke(Float.valueOf(f2));
        if (Math.abs(f - f2) > 0.5f) {
            klVar.a();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /* JADX WARN: Type inference failed for: r12v0, types: [t05, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object d(defpackage.wc5 r16, float r17, float r18, defpackage.ml r19, defpackage.ll r20, defpackage.ub2 r21, defpackage.xz0 r22) {
        /*
            r0 = r17
            r1 = r22
            boolean r2 = r1 instanceof defpackage.bt5
            if (r2 == 0) goto L18
            r2 = r1
            bt5 r2 = (defpackage.bt5) r2
            int r3 = r2.C
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L18
            int r3 = r3 - r4
            r2.C = r3
        L16:
            r8 = r2
            goto L1e
        L18:
            bt5 r2 = new bt5
            r2.<init>(r1)
            goto L16
        L1e:
            java.lang.Object r1 = r8.B
            int r2 = r8.C
            r9 = 0
            r3 = 1
            if (r2 == 0) goto L3d
            if (r2 != r3) goto L36
            float r0 = r8.y
            float r2 = r8.x
            t05 r3 = r8.A
            ml r4 = r8.z
            defpackage.m37.N(r1)
            r1 = r0
            r0 = r2
            goto L8f
        L36:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ze0.m(r0)
            r0 = 0
            return r0
        L3d:
            defpackage.m37.N(r1)
            t05 r12 = new t05
            r12.<init>()
            java.lang.Object r1 = r19.b()
            java.lang.Number r1 = (java.lang.Number) r1
            float r1 = r1.floatValue()
            java.lang.Float r4 = new java.lang.Float
            r4.<init>(r0)
            java.lang.Object r2 = r19.b()
            java.lang.Number r2 = (java.lang.Number) r2
            float r2 = r2.floatValue()
            int r2 = (r2 > r9 ? 1 : (r2 == r9 ? 0 : -1))
            if (r2 != 0) goto L64
            r2 = r3
            goto L65
        L64:
            r2 = 0
        L65:
            r6 = r2 ^ 1
            zs5 r10 = new zs5
            r15 = 1
            r13 = r16
            r11 = r18
            r14 = r21
            r10.<init>(r11, r12, r13, r14, r15)
            r2 = r19
            r8.z = r2
            r8.A = r12
            r8.x = r0
            r8.y = r1
            r8.C = r3
            r5 = r20
            r3 = r2
            r7 = r10
            java.lang.Object r2 = defpackage.nv5.e(r3, r4, r5, r6, r7, r8)
            w11 r3 = defpackage.w11.x
            if (r2 != r3) goto L8c
            return r3
        L8c:
            r4 = r19
            r3 = r12
        L8f:
            java.lang.Object r2 = r4.b()
            java.lang.Number r2 = (java.lang.Number) r2
            float r2 = r2.floatValue()
            float r1 = f(r2, r1)
            il r2 = new il
            float r3 = r3.x
            float r0 = r0 - r3
            java.lang.Float r3 = new java.lang.Float
            r3.<init>(r0)
            r0 = 29
            ml r0 = defpackage.n03.m(r4, r9, r1, r0)
            r2.<init>(r3, r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ct5.d(wc5, float, float, ml, ll, ub2, xz0):java.lang.Object");
    }

    public static void e(StringBuilder sb, Object obj, ub2 ub2Var) {
        boolean z;
        if (ub2Var != null) {
            sb.append((CharSequence) ub2Var.invoke(obj));
            return;
        }
        if (obj == null) {
            z = true;
        } else {
            z = obj instanceof CharSequence;
        }
        if (z) {
            sb.append((CharSequence) obj);
        } else if (obj instanceof Character) {
            sb.append(((Character) obj).charValue());
        } else {
            sb.append((CharSequence) obj.toString());
        }
    }

    public static final float f(float f, float f2) {
        if (f2 == 0.0f) {
            return 0.0f;
        }
        if (f2 <= 0.0f ? f < f2 : f > f2) {
            return f2;
        }
        return f;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000e, code lost:
    
        if (defpackage.t80.c0(r2.charAt(r0)) == false) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0011, code lost:
    
        r0 = r0 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0013, code lost:
    
        if (r0 >= r3) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001d, code lost:
    
        if (defpackage.t80.c0(r2.charAt(r0)) == false) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final int g(defpackage.mk0 r2, defpackage.h12 r3) {
        /*
            int r0 = r3.b
            int r3 = r3.c
            if (r0 >= r3) goto L1f
            char r1 = r2.charAt(r0)
            boolean r1 = defpackage.t80.c0(r1)
            if (r1 == 0) goto L11
            goto L1f
        L11:
            int r0 = r0 + 1
            if (r0 >= r3) goto L1f
            char r1 = r2.charAt(r0)
            boolean r1 = defpackage.t80.c0(r1)
            if (r1 == 0) goto L11
        L1f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ct5.g(mk0, h12):int");
    }

    public static final String h(lp6 lp6Var) {
        List i = i(lp6Var);
        String str = lp6Var.b;
        if (i.isEmpty()) {
            return null;
        }
        String str2 = lp6Var.e;
        str2.getClass();
        if (!b06.I(str2, str, false)) {
            str = "";
        }
        return yo0.q0(i, lp6Var.b, str, null, null, 60);
    }

    public static final List i(lp6 lp6Var) {
        String str = lp6Var.e;
        if (str == null) {
            return nt1.x;
        }
        ArrayList arrayList = new ArrayList();
        int i = -1;
        while (i < str.length()) {
            int i2 = i + 1;
            int S = uz5.S(str, '/', i2, 4);
            if (S == -1) {
                S = str.length();
            }
            String substring = str.substring(i2, S);
            if (substring.length() > 0) {
                arrayList.add(substring);
            }
            i = S;
        }
        return arrayList;
    }

    public static int j(int i) {
        int i2 = 0;
        while (i > 0) {
            i2++;
            i >>>= 1;
        }
        return i2;
    }

    public static void k(mc6 mc6Var, tf1 tf1Var, bd6 bd6Var, ha3 ha3Var, vc6 vc6Var, boolean z, h12 h12Var) {
        n05 n05Var;
        if (z) {
            int f = nd6.f(mc6Var.b);
            h12Var.b(f);
            String str = ga6.a;
            if (f < bd6Var.a.a.y.length()) {
                n05Var = bd6Var.b(f);
            } else if (f != 0) {
                n05Var = bd6Var.b(f - 1);
            } else {
                n05Var = new n05(0.0f, 0.0f, 1.0f, (int) (ga6.a((xd6) tf1Var.c, (ud1) tf1Var.d, (p82) tf1Var.e) & 4294967295L));
            }
            float f2 = n05Var.b;
            float f3 = n05Var.a;
            long J = ha3Var.J((Float.floatToRawIntBits(f3) << 32) | (Float.floatToRawIntBits(f2) & 4294967295L));
            float intBitsToFloat = Float.intBitsToFloat((int) (J >> 32));
            float intBitsToFloat2 = Float.intBitsToFloat((int) (J & 4294967295L));
            long floatToRawIntBits = (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat) << 32);
            float f4 = n05Var.c - f3;
            float f5 = n05Var.d - f2;
            n05 g = n03.g(floatToRawIntBits, (Float.floatToRawIntBits(f4) << 32) | (Float.floatToRawIntBits(f5) & 4294967295L));
            if (a34.i((vc6) vc6Var.a.b.get(), vc6Var)) {
                vc6Var.b.g(g);
            }
        }
    }

    public static final String l(String str, byte[] bArr) {
        int length = str.length();
        int i = 0;
        int max = Math.max(0, length - 2);
        int i2 = 0;
        while (true) {
            if (i >= max) {
                if (i == i2) {
                    return str;
                }
                if (i >= length) {
                    return b06.z(bArr, i2, 5);
                }
            } else if (str.charAt(i) == '%') {
                int i3 = i + 3;
                try {
                    String substring = str.substring(i + 1, i3);
                    t80.z(16);
                    bArr[i2] = (byte) Integer.parseInt(substring, 16);
                    i2++;
                    i = i3;
                } catch (NumberFormatException unused) {
                }
            }
            bArr[i2] = (byte) str.charAt(i);
            i2++;
            i++;
        }
    }

    public static sn3 m(zi4 zi4Var, boolean z, boolean z2) {
        if (z) {
            p(3, zi4Var, false);
        }
        zi4Var.y((int) zi4Var.r(), StandardCharsets.UTF_8);
        long r = zi4Var.r();
        String[] strArr = new String[(int) r];
        for (int i = 0; i < r; i++) {
            strArr[i] = zi4Var.y((int) zi4Var.r(), StandardCharsets.UTF_8);
        }
        if (z2 && (zi4Var.A() & 1) == 0) {
            throw bj4.a("framing bit expected to be set", null);
        }
        return new sn3((Object) strArr, (byte) 27);
    }

    public static final void n(mk0 mk0Var, h12 h12Var) {
        int i = h12Var.b;
        int i2 = h12Var.c;
        if (i >= i2 || !t80.c0(mk0Var.charAt(i))) {
            return;
        }
        do {
            i++;
            if (i >= i2) {
                break;
            }
        } while (t80.c0(mk0Var.charAt(i)));
        h12Var.b = i;
    }

    public static lp6 o(String str) {
        String str2;
        int i;
        int i2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        String str8;
        String str9;
        String str10 = qj4.y;
        if (!a34.i(str10, "/")) {
            str2 = b06.G(str, str10, "/");
        } else {
            str2 = str;
        }
        int i8 = 0;
        boolean z = true;
        int i9 = -1;
        int i10 = -1;
        int i11 = -1;
        int i12 = -1;
        int i13 = -1;
        while (i8 < str2.length()) {
            char charAt = str2.charAt(i8);
            if (charAt != '#') {
                if (charAt != '/') {
                    if (charAt != ':') {
                        if (charAt == '?' && i11 == -1 && i9 == -1) {
                            i11 = i8 + 1;
                        }
                    } else if (z && i11 == -1 && i9 == -1) {
                        int i14 = i8 + 2;
                        if (i14 < str.length() && str.charAt(i8 + 1) == '/' && str.charAt(i14) == '/' && i10 == -1) {
                            i12 = i8 + 3;
                            z = false;
                            i13 = i8;
                            i8 = i14;
                        } else if (str2.equals(str)) {
                            i10 = i8 + 1;
                            i13 = i8;
                            i8 = i10;
                            i12 = i8;
                        }
                    }
                } else if (i10 == -1 && i11 == -1 && i9 == -1) {
                    if (i12 == -1) {
                        i10 = 0;
                    } else {
                        i10 = i8;
                    }
                    z = false;
                }
            } else if (i9 == -1) {
                i9 = i8 + 1;
            }
            i8++;
        }
        int i15 = Integer.MAX_VALUE;
        if (i9 == -1) {
            i = Integer.MAX_VALUE;
        } else {
            i = i9 - 1;
        }
        int min = Math.min(i, str2.length());
        if (i11 == -1) {
            i2 = Integer.MAX_VALUE;
        } else {
            i2 = i11 - 1;
        }
        int min2 = Math.min(i2, min);
        String str11 = null;
        if (i12 != -1) {
            str4 = str2.substring(0, i13);
            if (i10 != -1) {
                i15 = i10;
            }
            str3 = str2.substring(i12, Math.min(i15, min2));
        } else {
            str3 = null;
            str4 = null;
        }
        if (i10 != -1) {
            str5 = str2.substring(i10, min2);
        } else {
            str5 = null;
        }
        if (i11 != -1) {
            str6 = str2.substring(i11, min);
        } else {
            str6 = null;
        }
        if (i9 != -1) {
            str7 = str2.substring(i9, str2.length());
        } else {
            str7 = null;
        }
        if (str4 != null) {
            i3 = str4.length();
        } else {
            i3 = 0;
        }
        if (str3 != null) {
            i4 = str3.length();
        } else {
            i4 = 0;
        }
        if (str5 != null) {
            i5 = str5.length();
        } else {
            i5 = 0;
        }
        if (str6 != null) {
            i6 = str6.length();
        } else {
            i6 = 0;
        }
        if (str7 != null) {
            i7 = str7.length();
        } else {
            i7 = 0;
        }
        byte[] bArr = new byte[Math.max(0, Math.max(i3, Math.max(i4, Math.max(i5, Math.max(i6, i7)))) - 2)];
        if (str4 != null) {
            str8 = l(str4, bArr);
        } else {
            str8 = null;
        }
        if (str3 != null) {
            str9 = l(str3, bArr);
        } else {
            str9 = null;
        }
        if (str5 != null) {
            str11 = l(str5, bArr);
        }
        String str12 = str11;
        if (str6 != null) {
            l(str6, bArr);
        }
        if (str7 != null) {
            l(str7, bArr);
        }
        return new lp6(str2, str10, str8, str9, str12);
    }

    public static boolean p(int i, zi4 zi4Var, boolean z) {
        if (zi4Var.a() < 7) {
            if (!z) {
                throw bj4.a("too short header: " + zi4Var.a(), null);
            }
            return false;
        }
        if (zi4Var.A() != i) {
            if (!z) {
                throw bj4.a("expected header type " + Integer.toHexString(i), null);
            }
            return false;
        }
        if (zi4Var.A() == 118 && zi4Var.A() == 111 && zi4Var.A() == 114 && zi4Var.A() == 98 && zi4Var.A() == 105 && zi4Var.A() == 115) {
            return true;
        }
        if (z) {
            return false;
        }
        throw bj4.a("expected characters 'vorbis'", null);
    }

    public static String q(Context context, String str) {
        a34.x(context);
        Resources resources = context.getResources();
        if (TextUtils.isEmpty(str)) {
            str = lz5.h(context);
        }
        int identifier = resources.getIdentifier(AndroidGoogleAppIdDataSource.GOOGLE_APP_ID_RESOURCE_NAME, "string", str);
        if (identifier == 0) {
            return null;
        }
        try {
            return resources.getString(identifier);
        } catch (Resources.NotFoundException unused) {
            return null;
        }
    }

    public static String r(d98 d98Var) {
        StringBuilder sb = new StringBuilder(d98Var.d());
        for (int i = 0; i < d98Var.d(); i++) {
            byte b = d98Var.b(i);
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

    public static String s(String str, String[] strArr, String[] strArr2) {
        int min = Math.min(strArr.length, strArr2.length);
        for (int i = 0; i < min; i++) {
            String str2 = strArr[i];
            if ((str == null && str2 == null) || (str != null && str.equals(str2))) {
                return strArr2[i];
            }
        }
        return null;
    }
}
