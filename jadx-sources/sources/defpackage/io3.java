package defpackage;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;
import com.anistation.android.R;
import com.anistation.model.Relation;
import com.discord.org.webrtc.PeerConnection;
import com.google.protobuf.CodedOutputStream;
import com.unity3d.services.core.device.MimeTypes;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Objects;

/* loaded from: classes.dex */
public abstract class io3 {
    public static final os0 b;
    public static p55 c;
    public static final ao2 h;
    public static boolean k;
    public static int l;
    public static final zn0 a = new zn0(null);
    public static final byte[] d = {0, 0, 0, 1};
    public static final float[] e = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 2.1818182f, 1.8181819f, 2.909091f, 2.4242425f, 1.6363636f, 1.3636364f, 1.939394f, 1.6161616f, 1.3333334f, 1.5f, 2.0f};
    public static final Object f = new Object();
    public static int[] g = new int[10];
    public static final int[] i = {1769172845, 1769172786, 1769172787, 1769172788, 1769172789, 1769172790, 1769172793, 1635148593, 1752589105, 1751479857, 1635135537, 1836069937, 1836069938, 862401121, 862401122, 862417462, 862417718, 862414134, 862414646, 1295275552, 1295270176, 1714714144, 1801741417, 1295275600, 1903435808, 1297305174, 1684175153, 1769172332, 1885955686};
    public static final Object j = new Object();

    static {
        byte b2 = 2;
        b = new os0(1792394244, false, new ys0(b2));
        h = new ao2(b2);
    }

    public io3(q23 q23Var) {
        new Rect();
    }

    public static void A(Object obj, boolean z) {
        if (z) {
        } else {
            throw new IllegalStateException(String.valueOf(obj));
        }
    }

    public static void B(boolean z) {
        if (z) {
            return;
        }
        p65.l();
    }

    public static void C(boolean z, String str, long j2, long j3) {
        if (z) {
            return;
        }
        ze0.m(ss5.f(str, Long.valueOf(j2), Long.valueOf(j3)));
    }

    public static void D(boolean z, String str, Object obj) {
        if (z) {
            return;
        }
        ze0.m(ss5.f(str, obj));
    }

    public static void E(boolean[] zArr) {
        zArr[0] = false;
        zArr[1] = false;
        zArr[2] = false;
    }

    public static void F(q41 q41Var) {
        if (q41Var != null) {
            try {
                q41Var.close();
            } catch (IOException unused) {
            }
        }
    }

    /* JADX WARN: Type inference failed for: r3v3, types: [v95, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v6, types: [v95, java.lang.Object] */
    public static v95 G(Bundle bundle, Bundle bundle2) {
        if (bundle == null) {
            bundle = bundle2;
        }
        if (bundle == null) {
            ?? obj = new Object();
            new LinkedHashMap();
            obj.a = new kz(ot1.x);
            return obj;
        }
        ClassLoader classLoader = v95.class.getClassLoader();
        classLoader.getClass();
        bundle.setClassLoader(classLoader);
        an3 an3Var = new an3(bundle.size());
        for (String str : bundle.keySet()) {
            str.getClass();
            an3Var.put(str, bundle.get(str));
        }
        an3 b2 = an3Var.b();
        ?? obj2 = new Object();
        new LinkedHashMap();
        obj2.a = new kz(b2);
        return obj2;
    }

    public static io3 H(q23 q23Var, int i2) {
        if (i2 != 0) {
            if (i2 == 1) {
                return new io3(q23Var);
            }
            ze0.k("invalid orientation");
            return null;
        }
        return new io3(q23Var);
    }

    public static final float I(long j2, n05 n05Var) {
        float f2 = n05Var.d;
        float f3 = n05Var.c;
        if (sw0.k(j2, n05Var)) {
            return 0.0f;
        }
        float d2 = xc4.d(xc4.e(n05Var.f(), j2));
        if (d2 >= Float.MAX_VALUE) {
            d2 = Float.MAX_VALUE;
        }
        float f4 = n05Var.b;
        float d3 = xc4.d(xc4.e((Float.floatToRawIntBits(f3) << 32) | (Float.floatToRawIntBits(f4) & 4294967295L), j2));
        if (d3 < d2) {
            d2 = d3;
        }
        float d4 = xc4.d(xc4.e((Float.floatToRawIntBits(n05Var.a) << 32) | (Float.floatToRawIntBits(f2) & 4294967295L), j2));
        if (d4 < d2) {
            d2 = d4;
        }
        float d5 = xc4.d(xc4.e((Float.floatToRawIntBits(f2) & 4294967295L) | (Float.floatToRawIntBits(f3) << 32), j2));
        if (d5 < d2) {
            return d5;
        }
        return d2;
    }

    public static int J(byte[] bArr, int i2, int i3, boolean[] zArr) {
        boolean z;
        boolean z2;
        boolean z3;
        int i4 = i3 - i2;
        boolean z4 = false;
        if (i4 >= 0) {
            z = true;
        } else {
            z = false;
        }
        B(z);
        if (i4 == 0) {
            return i3;
        }
        if (zArr[0]) {
            E(zArr);
            return i2 - 3;
        }
        if (i4 > 1 && zArr[1] && bArr[i2] == 1) {
            E(zArr);
            return i2 - 2;
        }
        if (i4 > 2 && zArr[2] && bArr[i2] == 0 && bArr[i2 + 1] == 1) {
            E(zArr);
            return i2 - 1;
        }
        int i5 = i3 - 1;
        int i6 = i2 + 2;
        while (i6 < i5) {
            byte b2 = bArr[i6];
            if ((b2 & 254) == 0) {
                int i7 = i6 - 2;
                if (bArr[i7] == 0 && bArr[i6 - 1] == 0 && b2 == 1) {
                    E(zArr);
                    return i7;
                }
                i6 -= 2;
            }
            i6 += 3;
        }
        if (i4 <= 2 ? !(i4 != 2 ? !zArr[1] || bArr[i5] != 1 : !zArr[2] || bArr[i3 - 2] != 0 || bArr[i5] != 1) : !(bArr[i3 - 3] != 0 || bArr[i3 - 2] != 0 || bArr[i5] != 1)) {
            z2 = true;
        } else {
            z2 = false;
        }
        zArr[0] = z2;
        if (i4 <= 1 ? !(!zArr[2] || bArr[i5] != 0) : !(bArr[i3 - 2] != 0 || bArr[i5] != 0)) {
            z3 = true;
        } else {
            z3 = false;
        }
        zArr[1] = z3;
        if (bArr[i5] == 0) {
            z4 = true;
        }
        zArr[2] = z4;
        return i3;
    }

    public static qo3 K(long j2) {
        byte[] bArr = new byte[8];
        for (int i2 = 7; i2 >= 0; i2--) {
            bArr[i2] = (byte) (255 & j2);
            j2 >>= 8;
        }
        return new qo3("auxiliary.tracks.offset", bArr, 0, 78);
    }

    public static final View L(xz3 xz3Var) {
        View view;
        sv6 sv6Var = wc7.O(xz3Var.x).L;
        if (sv6Var != null) {
            view = sv6Var.getInteropView();
        } else {
            view = null;
        }
        if (view != null) {
            return view;
        }
        ze0.m("Could not fetch interop view");
        return null;
    }

    public static String M(List list) {
        for (int i2 = 0; i2 < list.size(); i2++) {
            byte[] bArr = (byte[]) list.get(i2);
            int length = bArr.length;
            if (length > 3) {
                boolean[] zArr = new boolean[3];
                jw2 k2 = nw2.k();
                int i3 = 0;
                while (i3 < bArr.length) {
                    int J = J(bArr, i3, bArr.length, zArr);
                    if (J != bArr.length) {
                        k2.c(Integer.valueOf(J));
                    }
                    i3 = J + 3;
                }
                o15 g2 = k2.g();
                for (int i4 = 0; i4 < g2.A; i4++) {
                    if (((Integer) g2.get(i4)).intValue() + 3 < length) {
                        sr1 sr1Var = new sr1(bArr, ((Integer) g2.get(i4)).intValue() + 3, length);
                        n3 Y = Y(sr1Var);
                        if (Y.a == 33 && Y.b == 0) {
                            sr1Var.u(4);
                            int j2 = sr1Var.j(3);
                            sr1Var.t();
                            g64 Z = Z(sr1Var, true, j2, null);
                            return ko0.a(Z.a, Z.b, Z.c, Z.d, Z.e, Z.f);
                        }
                    }
                }
            }
        }
        return null;
    }

    public static String N(ea2 ea2Var) {
        String str = ea2Var.p;
        String str2 = ea2Var.l;
        if (Objects.equals(str, "video/dolby-vision") && str2 != null) {
            if (!str2.startsWith("dva1") && !str2.startsWith("dvav")) {
                if (str2.startsWith("dvh1") || str2.startsWith("dvhe")) {
                    return MimeTypes.VIDEO_H265;
                }
            } else {
                return MimeTypes.VIDEO_H264;
            }
        }
        return ea2Var.p;
    }

    public static final yz3 O(yz3 yz3Var, ub2 ub2Var) {
        return yz3Var.w(new x60(ub2Var));
    }

    public static yz3 P(yz3 yz3Var, float f2, float f3, float f4, float f5, float f6, long j2, om5 om5Var, boolean z, long j3, long j4, int i2) {
        float f7;
        float f8;
        float f9;
        float f10;
        float f11;
        long j5;
        om5 om5Var2;
        boolean z2;
        long j6;
        long j7;
        if ((i2 & 1) != 0) {
            f7 = 1.0f;
        } else {
            f7 = f2;
        }
        if ((i2 & 2) != 0) {
            f8 = 1.0f;
        } else {
            f8 = f3;
        }
        if ((i2 & 4) != 0) {
            f9 = 1.0f;
        } else {
            f9 = f4;
        }
        if ((i2 & 32) != 0) {
            f10 = 0.0f;
        } else {
            f10 = f5;
        }
        if ((i2 & 256) != 0) {
            f11 = 0.0f;
        } else {
            f11 = f6;
        }
        if ((i2 & 1024) != 0) {
            j5 = xh6.b;
        } else {
            j5 = j2;
        }
        if ((i2 & 2048) != 0) {
            om5Var2 = h;
        } else {
            om5Var2 = om5Var;
        }
        if ((i2 & CodedOutputStream.DEFAULT_BUFFER_SIZE) != 0) {
            z2 = false;
        } else {
            z2 = z;
        }
        if ((i2 & 16384) != 0) {
            j6 = gi2.a;
        } else {
            j6 = j3;
        }
        if ((i2 & PeerConnection.PORTALLOCATOR_ENABLE_ANY_ADDRESS_PORTS) != 0) {
            j7 = gi2.a;
        } else {
            j7 = j4;
        }
        return yz3Var.w(new ei2(f7, f8, f9, 0.0f, 0.0f, f10, 0.0f, 0.0f, f11, 8.0f, j5, om5Var2, z2, null, j6, j7, 0, 3, null, ca3.a));
    }

    public static yz3 Q(yz3 yz3Var, float f2, float f3, float f4, float f5, om5 om5Var, int i2) {
        float f6;
        float f7;
        float f8;
        float f9;
        om5 om5Var2;
        if ((i2 & 1) != 0) {
            f6 = 1.0f;
        } else {
            f6 = f2;
        }
        if ((i2 & 2) != 0) {
            f7 = 1.0f;
        } else {
            f7 = f3;
        }
        if ((i2 & 4) != 0) {
            f8 = 1.0f;
        } else {
            f8 = f4;
        }
        if ((i2 & 32) != 0) {
            f9 = 0.0f;
        } else {
            f9 = f5;
        }
        long j2 = xh6.b;
        if ((i2 & 2048) != 0) {
            om5Var2 = h;
        } else {
            om5Var2 = om5Var;
        }
        long j3 = gi2.a;
        return P(yz3Var, f6, f7, f8, f9, 0.0f, j2, om5Var2, false, j3, j3, 524288);
    }

    public static final void R(kd2 kd2Var, ic2 ic2Var) {
        ic2Var.getClass();
        wk6.j(2, ic2Var);
        ic2Var.invoke(kd2Var, 1);
    }

    public static final boolean S(String str) {
        for (int i2 = 0; i2 < str.length(); i2++) {
            char charAt = str.charAt(i2);
            if (charAt >= 128 || Character.isLetter(charAt)) {
                return true;
            }
        }
        return false;
    }

    public static boolean T(byte[] bArr, int i2, ea2 ea2Var) {
        int i3;
        if (Objects.equals(ea2Var.p, MimeTypes.VIDEO_H264)) {
            byte b2 = bArr[4];
            if (((b2 & 96) >> 5) == 0 && ((i3 = b2 & 31) == 1 || i3 == 9 || i3 == 14)) {
                return false;
            }
        } else if (Objects.equals(ea2Var.p, MimeTypes.VIDEO_H265)) {
            n3 Y = Y(new sr1(bArr, 4, i2 + 4));
            int i4 = Y.a;
            if (i4 != 35) {
                if (i4 <= 14 && i4 % 2 == 0 && Y.c == ea2Var.I - 1) {
                    return false;
                }
            } else {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001f, code lost:
    
        if (r0.b <= 4294967295L) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean U(defpackage.ey3 r6) {
        /*
            boolean r0 = r6 instanceof defpackage.y14
            r1 = 1
            if (r0 != 0) goto L33
            boolean r0 = r6 instanceof defpackage.w14
            if (r0 != 0) goto L33
            boolean r0 = r6 instanceof defpackage.z14
            if (r0 == 0) goto L22
            r0 = r6
            z14 r0 = (defpackage.z14) r0
            long r2 = r0.a
            r4 = 4294967295(0xffffffff, double:2.1219957905E-314)
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 > 0) goto L22
            long r2 = r0.b
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 > 0) goto L22
            goto L33
        L22:
            boolean r0 = r6 instanceof defpackage.qo3
            if (r0 == 0) goto L31
            qo3 r6 = (defpackage.qo3) r6
            int r6 = r6.d
            if (r6 == r1) goto L33
            r0 = 23
            if (r6 != r0) goto L31
            goto L33
        L31:
            r6 = 0
            return r6
        L33:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.io3.U(ey3):boolean");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, vz0, ri5] */
    public static ri5 V(ic2 ic2Var) {
        ?? obj = new Object();
        obj.z = wc7.j(obj, obj, ic2Var);
        return obj;
    }

    public static int W(ea2 ea2Var) {
        String N = N(ea2Var);
        if (Objects.equals(N, MimeTypes.VIDEO_H264)) {
            return 1;
        }
        if (!Objects.equals(N, MimeTypes.VIDEO_H265) && !Objects.equals(N, "video/vvc")) {
            return 0;
        }
        return 2;
    }

    public static jz0 X(String str) {
        str.getClass();
        if (uz5.V(str)) {
            return jz0.e;
        }
        dk2 dk2Var = (dk2) yo0.r0(m37.F(str));
        String str2 = dk2Var.a;
        List list = dk2Var.b;
        int S = uz5.S(str2, '/', 0, 6);
        if (S == -1) {
            if (a34.i(uz5.w0(str2).toString(), "*")) {
                return jz0.e;
            }
            throw new t20(str);
        }
        String obj = uz5.w0(uz5.u0(S, str2)).toString();
        if (obj.length() != 0) {
            String obj2 = uz5.w0(str2.substring(S + 1)).toString();
            if (!uz5.N(obj, ' ') && !uz5.N(obj2, ' ')) {
                if (obj2.length() != 0 && !uz5.N(obj2, '/')) {
                    return new jz0(obj, obj2, list);
                }
                throw new t20(str);
            }
            throw new t20(str);
        }
        throw new t20(str);
    }

    public static n3 Y(sr1 sr1Var) {
        sr1Var.t();
        return new n3(sr1Var.j(6), sr1Var.j(6), sr1Var.j(3) - 1);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0076  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.g64 Z(defpackage.sr1 r19, boolean r20, int r21, defpackage.g64 r22) {
        /*
            r0 = r19
            r1 = r21
            r2 = r22
            r3 = 6
            int[] r4 = new int[r3]
            r5 = 2
            r6 = 8
            r7 = 0
            if (r20 == 0) goto L42
            int r2 = r0.j(r5)
            boolean r8 = r0.i()
            r9 = 5
            int r9 = r0.j(r9)
            r10 = r7
            r11 = r10
        L1e:
            r12 = 32
            if (r10 >= r12) goto L2e
            boolean r12 = r0.i()
            if (r12 == 0) goto L2b
            r12 = 1
            int r12 = r12 << r10
            r11 = r11 | r12
        L2b:
            int r10 = r10 + 1
            goto L1e
        L2e:
            r10 = r7
        L2f:
            if (r10 >= r3) goto L3a
            int r12 = r0.j(r6)
            r4[r10] = r12
            int r10 = r10 + 1
            goto L2f
        L3a:
            r13 = r2
        L3b:
            r17 = r4
            r14 = r8
            r15 = r9
            r16 = r11
            goto L57
        L42:
            if (r2 == 0) goto L50
            int r3 = r2.a
            boolean r8 = r2.b
            int r9 = r2.c
            int r11 = r2.d
            int[] r4 = r2.e
            r13 = r3
            goto L3b
        L50:
            r17 = r4
            r13 = r7
            r14 = r13
            r15 = r14
            r16 = r15
        L57:
            int r18 = r0.j(r6)
            r2 = r7
        L5c:
            if (r7 >= r1) goto L71
            boolean r3 = r0.i()
            if (r3 == 0) goto L66
            int r2 = r2 + 88
        L66:
            boolean r3 = r0.i()
            if (r3 == 0) goto L6e
            int r2 = r2 + 8
        L6e:
            int r7 = r7 + 1
            goto L5c
        L71:
            r0.u(r2)
            if (r1 <= 0) goto L7b
            int r6 = r6 - r1
            int r6 = r6 * r5
            r0.u(r6)
        L7b:
            g64 r12 = new g64
            r12.<init>(r13, r14, r15, r16, r17, r18)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.io3.Z(sr1, boolean, int, g64):g64");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:53:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x003e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(defpackage.yz3 r17, int r18, float r19, defpackage.kd2 r20, final int r21, final int r22) {
        /*
            Method dump skipped, instructions count: 444
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.io3.a(yz3, int, float, kd2, int, int):void");
    }

    public static mm5 a0(byte[] bArr, int i2, int i3) {
        byte b2;
        int i4;
        int max;
        int max2;
        int i5 = i2 + 2;
        do {
            i3--;
            b2 = bArr[i3];
            if (b2 != 0) {
                break;
            }
        } while (i3 > i5);
        if (b2 != 0 && i3 > i5) {
            sr1 sr1Var = new sr1(bArr, i5, i3 + 1);
            while (sr1Var.c(16)) {
                int j2 = sr1Var.j(8);
                int i6 = 0;
                while (j2 == 255) {
                    i6 += 255;
                    j2 = sr1Var.j(8);
                }
                int i7 = i6 + j2;
                int j3 = sr1Var.j(8);
                int i8 = 0;
                while (j3 == 255) {
                    i8 += 255;
                    j3 = sr1Var.j(8);
                }
                int i9 = i8 + j3;
                if (i9 != 0 && sr1Var.c(i9)) {
                    if (i7 == 176) {
                        int k2 = sr1Var.k();
                        boolean i10 = sr1Var.i();
                        if (i10) {
                            i4 = sr1Var.k();
                        } else {
                            i4 = 0;
                        }
                        int k3 = sr1Var.k();
                        int i11 = -1;
                        for (int i12 = 0; i12 <= k3; i12++) {
                            i11 = sr1Var.k();
                            sr1Var.k();
                            int j4 = sr1Var.j(6);
                            if (j4 != 63) {
                                if (j4 == 0) {
                                    max = Math.max(0, k2 - 30);
                                } else {
                                    max = Math.max(0, (j4 + k2) - 31);
                                }
                                sr1Var.j(max);
                                if (i10) {
                                    int j5 = sr1Var.j(6);
                                    if (j5 != 63) {
                                        if (j5 == 0) {
                                            max2 = Math.max(0, i4 - 30);
                                        } else {
                                            max2 = Math.max(0, (j5 + i4) - 31);
                                        }
                                        sr1Var.j(max2);
                                    } else {
                                        return null;
                                    }
                                }
                                if (sr1Var.i()) {
                                    sr1Var.u(10);
                                }
                            } else {
                                return null;
                            }
                        }
                        return new mm5(i11);
                    }
                    sr1Var.u(i9 * 8);
                } else {
                    return null;
                }
            }
            return null;
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:61:0x00ca, code lost:
    
        if (r9.length() > 0) goto L47;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(final com.anistation.model.download.DownloadAnimeGroup r29, final boolean r30, final boolean r31, final defpackage.sb2 r32, final defpackage.sb2 r33, final defpackage.yz3 r34, defpackage.kd2 r35, final int r36) {
        /*
            Method dump skipped, instructions count: 477
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.io3.b(com.anistation.model.download.DownloadAnimeGroup, boolean, boolean, sb2, sb2, yz3, kd2, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x02fe  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0319  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x03cd  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01ce  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.j64 b0(byte[] r34, int r35, int r36, defpackage.zp2 r37) {
        /*
            Method dump skipped, instructions count: 998
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.io3.b0(byte[], int, int, zp2):j64");
    }

    public static final void c(xr4 xr4Var, os0 os0Var, ng6 ng6Var, os0 os0Var2, kd2 kd2Var, int i2) {
        xr4 xr4Var2;
        int i3;
        boolean z;
        w44 w44Var;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        boolean h2;
        int i10;
        int i11;
        int i12;
        kd2Var.f0(-1221877520);
        if ((i2 & 6) == 0) {
            xr4Var2 = xr4Var;
            if (kd2Var.f(xr4Var2)) {
                i12 = 4;
            } else {
                i12 = 2;
            }
            i3 = i12 | i2;
        } else {
            xr4Var2 = xr4Var;
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            if (kd2Var.h(os0Var)) {
                i11 = 32;
            } else {
                i11 = 16;
            }
            i3 |= i11;
        }
        if ((i2 & 384) == 0) {
            if ((i2 & 512) == 0) {
                h2 = kd2Var.f(ng6Var);
            } else {
                h2 = kd2Var.h(ng6Var);
            }
            if (h2) {
                i10 = 256;
            } else {
                i10 = 128;
            }
            i3 |= i10;
        }
        int i13 = i2 & 3072;
        vz3 vz3Var = vz3.x;
        if (i13 == 0) {
            if (kd2Var.f(vz3Var)) {
                i9 = 2048;
            } else {
                i9 = 1024;
            }
            i3 |= i9;
        }
        if ((i2 & 24576) == 0) {
            if (kd2Var.h(null)) {
                i8 = 16384;
            } else {
                i8 = 8192;
            }
            i3 |= i8;
        }
        boolean z2 = false;
        if ((i2 & 196608) == 0) {
            if (kd2Var.g(false)) {
                i7 = 131072;
            } else {
                i7 = 65536;
            }
            i3 |= i7;
        }
        if ((1572864 & i2) == 0) {
            if (kd2Var.g(true)) {
                i6 = 1048576;
            } else {
                i6 = 524288;
            }
            i3 |= i6;
        }
        if ((12582912 & i2) == 0) {
            if (kd2Var.g(false)) {
                i5 = 8388608;
            } else {
                i5 = 4194304;
            }
            i3 |= i5;
        }
        if ((100663296 & i2) == 0) {
            if (kd2Var.h(os0Var2)) {
                i4 = 67108864;
            } else {
                i4 = 33554432;
            }
            i3 |= i4;
        }
        int i14 = i3;
        if ((38347923 & i14) != 38347922) {
            z = true;
        } else {
            z = false;
        }
        if (kd2Var.V(i14 & 1, z)) {
            Object Q = kd2Var.Q();
            Object obj = au0.a;
            if (Q == obj) {
                Q = db.L(kd2Var);
                kd2Var.n0(Q);
            }
            v11 v11Var = (v11) Q;
            Object Q2 = kd2Var.Q();
            if (Q2 == obj) {
                Q2 = xt5.g(Boolean.FALSE);
                kd2Var.n0(Q2);
            }
            w44 w44Var2 = (w44) Q2;
            vo3 c2 = b90.c(pk2.y, false);
            int s = h98.s(kd2Var);
            al4 l2 = kd2Var.l();
            yz3 E = o80.E(kd2Var, vz3Var);
            tt0.d.getClass();
            kd2Var.h0();
            if (kd2Var.S) {
                kd2Var.k(za3.p0);
            } else {
                kd2Var.q0();
            }
            ss5.i(p7.F, kd2Var, c2);
            ss5.i(p7.E, kd2Var, l2);
            st0 st0Var = p7.G;
            if (kd2Var.S || !a34.i(kd2Var.Q(), Integer.valueOf(s))) {
                h11.p(s, kd2Var, s, st0Var);
            }
            ss5.i(p7.D, kd2Var, E);
            if (ng6Var.b()) {
                kd2Var.e0(-1891243071);
                w44Var = w44Var2;
                d(xr4Var2, ng6Var, v11Var, false, w44Var, os0Var, kd2Var, (i14 & 14) | 196608 | ((i14 >> 3) & 112) | ((i14 >> 6) & 896) | ((i14 << 15) & 3670016));
                kd2Var.q(false);
            } else {
                w44Var = w44Var2;
                kd2Var.e0(-1890863476);
                kd2Var.q(false);
            }
            e(ng6Var, w44Var, os0Var2, kd2Var, ((i14 >> 18) & 14) | 384 | ((i14 >> 3) & 112) | ((i14 >> 12) & 7168) | (57344 & (i14 << 3)) | ((i14 >> 9) & 458752));
            kd2Var.q(true);
            if ((i14 & 896) == 256 || ((i14 & 512) != 0 && kd2Var.h(ng6Var))) {
                z2 = true;
            }
            Object Q3 = kd2Var.Q();
            if (z2 || Q3 == obj) {
                Q3 = new l0(ng6Var, (byte) 18);
                kd2Var.n0(Q3);
            }
            db.c(ng6Var, (ub2) Q3, kd2Var);
        } else {
            kd2Var.Y();
        }
        zz4 u = kd2Var.u();
        if (u != null) {
            u.d = new c50(xr4Var, os0Var, ng6Var, os0Var2, i2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0116  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.zp2 c0(byte[] r38, int r39, int r40) {
        /*
            Method dump skipped, instructions count: 2047
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.io3.c0(byte[], int, int):zp2");
    }

    public static final void d(xr4 xr4Var, ng6 ng6Var, v11 v11Var, boolean z, w44 w44Var, os0 os0Var, kd2 kd2Var, int i2) {
        xr4 xr4Var2;
        int i3;
        boolean z2;
        boolean z3;
        boolean z4;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        boolean h2;
        int i9;
        int i10;
        kd2Var.f0(-1413720282);
        byte b2 = 4;
        if ((i2 & 6) == 0) {
            xr4Var2 = xr4Var;
            if (kd2Var.f(xr4Var2)) {
                i10 = 4;
            } else {
                i10 = 2;
            }
            i3 = i10 | i2;
        } else {
            xr4Var2 = xr4Var;
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            if ((i2 & 64) == 0) {
                h2 = kd2Var.f(ng6Var);
            } else {
                h2 = kd2Var.h(ng6Var);
            }
            if (h2) {
                i9 = 32;
            } else {
                i9 = 16;
            }
            i3 |= i9;
        }
        if ((i2 & 384) == 0) {
            if (kd2Var.h(null)) {
                i8 = 256;
            } else {
                i8 = 128;
            }
            i3 |= i8;
        }
        if ((i2 & 3072) == 0) {
            if (kd2Var.h(v11Var)) {
                i7 = 2048;
            } else {
                i7 = 1024;
            }
            i3 |= i7;
        }
        if ((i2 & 24576) == 0) {
            if (kd2Var.g(z)) {
                i6 = 16384;
            } else {
                i6 = 8192;
            }
            i3 |= i6;
        }
        if ((196608 & i2) == 0) {
            if (kd2Var.f(w44Var)) {
                i5 = 131072;
            } else {
                i5 = 65536;
            }
            i3 |= i5;
        }
        if ((1572864 & i2) == 0) {
            if (kd2Var.h(os0Var)) {
                i4 = 1048576;
            } else {
                i4 = 524288;
            }
            i3 |= i4;
        }
        byte b3 = 0;
        boolean z5 = true;
        if ((599187 & i3) != 599186) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (kd2Var.V(i3 & 1, z2)) {
            String f2 = lz5.f(R.string.tooltip_description, kd2Var);
            if ((i3 & 896) == 256) {
                z3 = true;
            } else {
                z3 = false;
            }
            if ((i3 & 112) != 32 && ((i3 & 64) == 0 || !kd2Var.h(ng6Var))) {
                z4 = false;
            } else {
                z4 = true;
            }
            boolean h3 = z4 | z3 | kd2Var.h(v11Var);
            if ((458752 & i3) != 131072) {
                z5 = false;
            }
            boolean z6 = h3 | z5;
            Object Q = kd2Var.Q();
            if (z6 || Q == au0.a) {
                Q = new mi(ng6Var, v11Var, w44Var, b2);
                kd2Var.n0(Q);
            }
            ae.a(xr4Var2, (sb2) Q, new yr4(z), nx7.R(-1287705660, new d50(f2, os0Var, b3), kd2Var), kd2Var, (i3 & 14) | 3072, 0);
        } else {
            kd2Var.Y();
        }
        zz4 u = kd2Var.u();
        if (u != null) {
            u.d = new tl(xr4Var, ng6Var, v11Var, z, w44Var, os0Var, i2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0261  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x023b  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01ff  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.m64 d0(byte[] r30, int r31, int r32) {
        /*
            Method dump skipped, instructions count: 634
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.io3.d0(byte[], int, int):m64");
    }

    public static final void e(ng6 ng6Var, w44 w44Var, os0 os0Var, kd2 kd2Var, int i2) {
        int i3;
        boolean z;
        int i4;
        int i5;
        int i6;
        int i7;
        boolean h2;
        int i8;
        int i9;
        kd2Var.f0(1873232064);
        byte b2 = 1;
        byte b3 = 2;
        if ((i2 & 6) == 0) {
            if (kd2Var.g(true)) {
                i9 = 4;
            } else {
                i9 = 2;
            }
            i3 = i9 | i2;
        } else {
            i3 = i2;
        }
        byte b4 = 16;
        if ((i2 & 48) == 0) {
            if ((i2 & 64) == 0) {
                h2 = kd2Var.f(ng6Var);
            } else {
                h2 = kd2Var.h(ng6Var);
            }
            if (h2) {
                i8 = 32;
            } else {
                i8 = 16;
            }
            i3 |= i8;
        }
        if ((i2 & 384) == 0) {
            if (kd2Var.f(w44Var)) {
                i7 = 256;
            } else {
                i7 = 128;
            }
            i3 |= i7;
        }
        byte b5 = 0;
        if ((i2 & 3072) == 0) {
            if (kd2Var.g(false)) {
                i6 = 2048;
            } else {
                i6 = 1024;
            }
            i3 |= i6;
        }
        int i10 = i2 & 24576;
        vz3 vz3Var = vz3.x;
        if (i10 == 0) {
            if (kd2Var.f(vz3Var)) {
                i5 = 16384;
            } else {
                i5 = 8192;
            }
            i3 |= i5;
        }
        if ((196608 & i2) == 0) {
            if (kd2Var.h(os0Var)) {
                i4 = 131072;
            } else {
                i4 = 65536;
            }
            i3 |= i4;
        }
        if ((74899 & i3) != 74898) {
            z = true;
        } else {
            z = false;
        }
        if (kd2Var.V(i3 & 1, z)) {
            Object Q = kd2Var.Q();
            if (Q == au0.a) {
                Q = db.L(kd2Var);
                kd2Var.n0(Q);
            }
            v11 v11Var = (v11) Q;
            yz3 O = n77.O(h41.N(v36.a(v36.a(vz3Var, ng6Var, new i50(ng6Var, b5)), ng6Var, new i50(ng6Var, b2)).w(new xi4(new bg(lz5.f(R.string.tooltip_label, kd2Var), v11Var, ng6Var, b3))), new b0(v11Var, ng6Var, b4)), new od(ng6Var, w44Var, (byte) 5));
            vo3 c2 = b90.c(pk2.y, false);
            int s = h98.s(kd2Var);
            al4 l2 = kd2Var.l();
            yz3 E = o80.E(kd2Var, O);
            tt0.d.getClass();
            kd2Var.h0();
            if (kd2Var.S) {
                kd2Var.k(za3.p0);
            } else {
                kd2Var.q0();
            }
            ss5.i(p7.F, kd2Var, c2);
            ss5.i(p7.E, kd2Var, l2);
            st0 st0Var = p7.G;
            if (kd2Var.S || !a34.i(kd2Var.Q(), Integer.valueOf(s))) {
                h11.p(s, kd2Var, s, st0Var);
            }
            ss5.i(p7.D, kd2Var, E);
            os0Var.invoke(kd2Var, Integer.valueOf((i3 >> 15) & 14));
            kd2Var.q(true);
        } else {
            kd2Var.Y();
        }
        zz4 u = kd2Var.u();
        if (u != null) {
            u.d = new je(ng6Var, w44Var, os0Var, i2);
        }
    }

    public static final Object e0(Object obj, Object obj2) {
        if (obj == null) {
            return obj2;
        }
        if (obj instanceof ArrayList) {
            ((ArrayList) obj).add(obj2);
            return obj;
        }
        ArrayList arrayList = new ArrayList(4);
        arrayList.add(obj);
        arrayList.add(obj2);
        return arrayList;
    }

    public static final void f(g4 g4Var, uh5 uh5Var) {
        ph5 ph5Var = uh5Var.d;
        p44 p44Var = ph5Var.x;
        Object g2 = ph5Var.x.g(yh5.z);
        Object obj = null;
        if (g2 == null) {
            g2 = null;
        }
        m65 m65Var = (m65) g2;
        if (v94.r(uh5Var)) {
            if (m65Var == null || m65Var.a != 8) {
                Object g3 = p44Var.g(oh5.y);
                if (g3 == null) {
                    g3 = null;
                }
                o3 o3Var = (o3) g3;
                if (o3Var != null) {
                    g4Var.a(new b4(android.R.id.accessibilityActionPageUp, o3Var.a));
                }
                Object g4 = p44Var.g(oh5.A);
                if (g4 == null) {
                    g4 = null;
                }
                o3 o3Var2 = (o3) g4;
                if (o3Var2 != null) {
                    g4Var.a(new b4(android.R.id.accessibilityActionPageDown, o3Var2.a));
                }
                Object g5 = p44Var.g(oh5.z);
                if (g5 == null) {
                    g5 = null;
                }
                o3 o3Var3 = (o3) g5;
                if (o3Var3 != null) {
                    g4Var.a(new b4(android.R.id.accessibilityActionPageLeft, o3Var3.a));
                }
                Object g6 = p44Var.g(oh5.B);
                if (g6 != null) {
                    obj = g6;
                }
                o3 o3Var4 = (o3) obj;
                if (o3Var4 != null) {
                    g4Var.a(new b4(android.R.id.accessibilityActionPageRight, o3Var4.a));
                }
            }
        }
    }

    public static final void f0(pe3 pe3Var, String str, List list, int i2, float f2, float f3, vm1 vm1Var, boolean z, ub2 ub2Var) {
        int i3;
        List<String> genres;
        list.getClass();
        ub2Var.getClass();
        if (!z) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                Relation relation = (Relation) obj;
                if (!relation.getAdult() && (genres = relation.getGenres()) != null && !genres.contains("Ecchi")) {
                    arrayList.add(obj);
                }
            }
            list = arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : list) {
            Relation relation2 = (Relation) obj2;
            if (vc2.b(relation2.getFormat(), relation2.getStatus())) {
                arrayList2.add(obj2);
            }
        }
        byte b2 = 2;
        byte b3 = 3;
        byte b4 = 1;
        if (arrayList2.isEmpty()) {
            pe3.A0(pe3Var, str.concat("-empty"), new os0(871935079, true, new dw1(vm1Var, b3)), 2);
            return;
        }
        if (i2 < 1) {
            i3 = 1;
        } else {
            i3 = i2;
        }
        pe3.A0(pe3Var, null, new os0(-997222644, true, new xz4(f3, b4)), 3);
        ArrayList d0 = yo0.d0(i3, arrayList2);
        pe3Var.B0(d0.size(), new od(new zg(str, (byte) 19), d0, (byte) 20), new zd(d0, b2), new os0(802480018, true, new yz4(d0, i3, f2, ub2Var, (byte) 1)));
    }

    public static final void g(StringBuilder sb, Class cls) {
        while (cls.isArray()) {
            sb.append("[");
            cls = cls.getComponentType();
            cls.getClass();
        }
        if (cls.equals(Void.TYPE)) {
            sb.append("V");
            return;
        }
        if (cls.equals(Integer.TYPE)) {
            sb.append("I");
            return;
        }
        if (cls.equals(Long.TYPE)) {
            sb.append("J");
            return;
        }
        if (cls.equals(Short.TYPE)) {
            sb.append("S");
            return;
        }
        if (cls.equals(Byte.TYPE)) {
            sb.append("B");
            return;
        }
        if (cls.equals(Boolean.TYPE)) {
            sb.append("Z");
            return;
        }
        if (cls.equals(Character.TYPE)) {
            sb.append("C");
            return;
        }
        if (cls.equals(Float.TYPE)) {
            sb.append("F");
            return;
        }
        if (cls.equals(Double.TYPE)) {
            sb.append("D");
            return;
        }
        sb.append("L");
        String replace = cls.getName().replace('.', '/');
        replace.getClass();
        sb.append((CharSequence) replace);
        sb.append(";");
    }

    public static int g0(double d2) {
        if (!Double.isNaN(d2)) {
            if (d2 > 2.147483647E9d) {
                return Integer.MAX_VALUE;
            }
            if (d2 < -2.147483648E9d) {
                return Integer.MIN_VALUE;
            }
            return (int) Math.round(d2);
        }
        ze0.k("Cannot round NaN value.");
        return 0;
    }

    public static final void h(vv6 vv6Var, ea5 ea5Var, fg3 fg3Var) {
        ea5Var.getClass();
        fg3Var.getClass();
        w95 w95Var = (w95) vv6Var.c("androidx.lifecycle.savedstate.vm.tag");
        if (w95Var != null && !w95Var.z) {
            w95Var.a(ea5Var, fg3Var);
            eg3 eg3Var = ((rg3) fg3Var).i;
            if (eg3Var != eg3.y && eg3Var.compareTo(eg3.A) < 0) {
                fg3Var.a(new o91((Object) fg3Var, (Object) ea5Var, (byte) 1));
            } else {
                ea5Var.d();
            }
        }
    }

    public static int h0(float f2) {
        if (!Float.isNaN(f2)) {
            return Math.round(f2);
        }
        ze0.k("Cannot round NaN value.");
        return 0;
    }

    public static String i(String str, int i2, int i3) {
        if (i2 < 0) {
            return ss5.f("%s (%s) must not be negative", str, Integer.valueOf(i2));
        }
        if (i3 >= 0) {
            return ss5.f("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i2), Integer.valueOf(i3));
        }
        ze0.k(qx1.h(i3, "negative size: "));
        return null;
    }

    public static long i0(double d2) {
        if (!Double.isNaN(d2)) {
            return Math.round(d2);
        }
        ze0.k("Cannot round NaN value.");
        return 0L;
    }

    public static void j(int i2, int i3, String str, boolean z) {
        if (z) {
            return;
        }
        ze0.k(ss5.f(str, Integer.valueOf(i2), Integer.valueOf(i3)));
    }

    public static void j0(sr1 sr1Var) {
        int k2 = sr1Var.k() + 1;
        sr1Var.u(8);
        for (int i2 = 0; i2 < k2; i2++) {
            sr1Var.k();
            sr1Var.k();
            sr1Var.t();
        }
        sr1Var.u(20);
    }

    public static void k(int i2, String str, boolean z) {
        if (z) {
            return;
        }
        ze0.k(ss5.f(str, Integer.valueOf(i2)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:85:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0159 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.fu5 k0(defpackage.c12 r23, boolean r24) {
        /*
            Method dump skipped, instructions count: 384
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.io3.k0(c12, boolean):fu5");
    }

    public static void l(long j2, String str, boolean z) {
        if (z) {
            return;
        }
        ze0.k(ss5.f(str, Long.valueOf(j2)));
    }

    public static final h94 l0(p45 p45Var) {
        lv5 lv5Var;
        db0 o0;
        int i2 = p45Var.A;
        long j2 = p45Var.H;
        long j3 = p45Var.I;
        ik2 ik2Var = p45Var.C;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = ik2Var.iterator();
        while (true) {
            o1 o1Var = (o1) it;
            if (!o1Var.hasNext()) {
                break;
            }
            ai4 ai4Var = (ai4) o1Var.next();
            String str = (String) ai4Var.x;
            String str2 = (String) ai4Var.y;
            String lowerCase = str.toLowerCase(Locale.ROOT);
            lowerCase.getClass();
            Object obj = linkedHashMap.get(lowerCase);
            if (obj == null) {
                obj = new ArrayList();
                linkedHashMap.put(lowerCase, obj);
            }
            ((List) obj).add(str2);
        }
        b94 b94Var = new b94(vn3.Z(linkedHashMap));
        t45 t45Var = p45Var.D;
        if (t45Var != null && (o0 = t45Var.o0()) != null) {
            lv5Var = new lv5(o0);
        } else {
            lv5Var = null;
        }
        return new h94(i2, j2, j3, b94Var, lv5Var, p45Var);
    }

    public static void m(Object obj, boolean z) {
        if (z) {
        } else {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final defpackage.l35 m0(defpackage.e94 r10, defpackage.xz0 r11) {
        /*
            Method dump skipped, instructions count: 254
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.io3.m0(e94, xz0):l35");
    }

    public static void n(boolean z) {
        if (z) {
            return;
        }
        p65.b();
    }

    public static int n0(int i2, byte[] bArr) {
        int i3;
        synchronized (f) {
            int i4 = 0;
            int i5 = 0;
            while (i4 < i2) {
                while (true) {
                    if (i4 < i2 - 2) {
                        try {
                            if (bArr[i4] == 0 && bArr[i4 + 1] == 0 && bArr[i4 + 2] == 3) {
                                break;
                            }
                            i4++;
                        } catch (Throwable th) {
                            throw th;
                        }
                    } else {
                        i4 = i2;
                        break;
                    }
                }
                if (i4 < i2) {
                    int[] iArr = g;
                    if (iArr.length <= i5) {
                        iArr = Arrays.copyOf(iArr, iArr.length * 2);
                        g = iArr;
                    }
                    iArr[i5] = i4;
                    i4 += 3;
                    i5++;
                }
            }
            i3 = i2 - i5;
            int i6 = 0;
            int i7 = 0;
            for (int i8 = 0; i8 < i5; i8++) {
                int i9 = g[i8] - i7;
                System.arraycopy(bArr, i7, bArr, i6, i9);
                int i10 = i6 + i9;
                int i11 = i10 + 1;
                bArr[i10] = 0;
                i6 = i10 + 2;
                bArr[i11] = 0;
                i7 += i9 + 3;
            }
            System.arraycopy(bArr, i7, bArr, i6, i3 - i6);
        }
        return i3;
    }

    public static void o(boolean z, String str, long j2, long j3) {
        if (z) {
            return;
        }
        ze0.k(ss5.f(str, Long.valueOf(j2), Long.valueOf(j3)));
    }

    public static void p(boolean z, String str, Object obj) {
        if (z) {
            return;
        }
        ze0.k(ss5.f(str, obj));
    }

    public static void q(boolean z, String str, Object obj, Object obj2) {
        if (z) {
            return;
        }
        ze0.k(ss5.f(str, obj, obj2));
    }

    public static void r(int i2, int i3) {
        String f2;
        if (i2 >= 0 && i2 < i3) {
            return;
        }
        if (i2 >= 0) {
            if (i3 < 0) {
                ze0.k(qx1.h(i3, "negative size: "));
                return;
            }
            f2 = ss5.f("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i2), Integer.valueOf(i3));
        } else {
            f2 = ss5.f("%s (%s) must not be negative", "index", Integer.valueOf(i2));
        }
        throw new IndexOutOfBoundsException(f2);
    }

    public static void s(Object obj, Object obj2) {
        if (obj != null) {
            if (obj2 != null) {
                return;
            }
            throw new NullPointerException("null value in entry: " + obj + "=null");
        }
        throw new NullPointerException("null key in entry: null=" + obj2);
    }

    public static void t(int i2, String str) {
        if (i2 >= 0) {
            return;
        }
        throw new IllegalArgumentException(str + " cannot be negative but was: " + i2);
    }

    public static void u(ii3 ii3Var, String str, Object obj) {
        if (ii3Var != null) {
            return;
        }
        qi2.m(ss5.f(str, obj));
    }

    public static void v(Object obj) {
        obj.getClass();
    }

    public static void w(Object obj, String str) {
        if (obj != null) {
            return;
        }
        qi2.m(str);
    }

    public static void x(int i2, int i3) {
        if (i2 >= 0 && i2 <= i3) {
            return;
        }
        ze0.g(i("index", i2, i3));
    }

    public static void y(int i2, int i3, int i4) {
        String i5;
        if (i2 >= 0 && i3 >= i2 && i3 <= i4) {
            return;
        }
        if (i2 >= 0 && i2 <= i4) {
            if (i3 >= 0 && i3 <= i4) {
                i5 = ss5.f("end index (%s) must not be less than start index (%s)", Integer.valueOf(i3), Integer.valueOf(i2));
            } else {
                i5 = i("end index", i3, i4);
            }
        } else {
            i5 = i("start index", i2, i4);
        }
        throw new IndexOutOfBoundsException(i5);
    }

    public static void z(int i2, String str, boolean z) {
        if (z) {
            return;
        }
        ze0.m(ss5.f(str, Integer.valueOf(i2)));
    }
}
