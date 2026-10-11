package defpackage;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.opengl.Matrix;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.inputmethod.ExtractedText;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.WeakHashMap;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public abstract class h41 {
    public static final cr0 a = new cr0(2);
    public static final os0 b = new os0(-51699941, false, new ps0(14));
    public static final float[][] c = {new float[]{1.0f, 0.0f, 0.0f, 1.0f}, new float[]{-1.0f, 0.0f, 0.0f, 1.0f}, new float[]{0.0f, 1.0f, 0.0f, 1.0f}, new float[]{0.0f, -1.0f, 0.0f, 1.0f}, new float[]{0.0f, 0.0f, 1.0f, 1.0f}, new float[]{0.0f, 0.0f, -1.0f, 1.0f}};
    public static final m18 d = new m18((byte) 28);
    public static final js5 e = new Object();
    public static final ks5 f = new Object();

    /* JADX WARN: Multi-variable type inference failed */
    public static final void A(ub2 ub2Var) {
        vz0 r23Var;
        cr0 cr0Var = a;
        try {
            if (ub2Var instanceof h30) {
                r23Var = ((h30) ub2Var).create(cr0Var);
            } else {
                r23Var = new r23(ub2Var);
            }
            kh1.a(wc7.z(r23Var), pn6.a);
        } catch (Throwable th) {
            oi4.n(cr0Var, th);
            throw null;
        }
    }

    public static int B(Context context, int i) {
        Integer num;
        int i2;
        TypedValue G = sw0.G(context.getTheme(), i);
        if (G != null) {
            int i3 = G.resourceId;
            if (i3 != 0) {
                i2 = context.getColor(i3);
            } else {
                i2 = G.data;
            }
            num = Integer.valueOf(i2);
        } else {
            num = null;
        }
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    public static final long C(KeyEvent keyEvent) {
        return q23.c(keyEvent.getKeyCode());
    }

    public static final Object D(ph5 ph5Var, ai5 ai5Var) {
        Object g = ph5Var.x.g(ai5Var);
        if (g == null) {
            return null;
        }
        return g;
    }

    public static final int E(KeyEvent keyEvent) {
        int action = keyEvent.getAction();
        if (action != 0) {
            if (action == 1) {
                return 1;
            }
            return 0;
        }
        return 2;
    }

    public static final m47 F(long j) {
        int i = (int) (j & 4294967295L);
        if (i < 0) {
            return null;
        }
        if (i == 0) {
            return m47.x;
        }
        return m47.y;
    }

    public static final void G(o96 o96Var, int i, int i2) {
        o96Var.A = false;
        nd6 nd6Var = o96Var.D;
        int min = Math.min(i, i2);
        int max = Math.max(i, i2);
        o96Var.c("", min, max);
        if (nd6Var != null) {
            long c2 = ss5.c(min, max, 0, nd6Var.a);
            if (nd6.d(c2)) {
                o96Var.f(null);
            } else {
                o96Var.e(null, nd6.g(c2), nd6.f(c2));
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0041, code lost:
    
        if (r11 == r2) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0044, code lost:
    
        r9.f(null);
        r9.F = null;
        r2 = r9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void H(defpackage.o96 r9, int r10, int r11, java.lang.CharSequence r12) {
        /*
            kk0 r0 = r9.y
            int r1 = java.lang.Math.min(r10, r11)
            int r10 = java.lang.Math.max(r10, r11)
            r11 = 0
            r3 = r1
        Lc:
            if (r3 >= r10) goto L23
            int r2 = r12.length()
            if (r11 >= r2) goto L23
            char r2 = r12.charAt(r11)
            char r4 = r0.charAt(r3)
            if (r2 != r4) goto L23
            int r11 = r11 + 1
            int r3 = r3 + 1
            goto Lc
        L23:
            int r2 = r12.length()
            r4 = r10
        L28:
            if (r4 <= r3) goto L3f
            if (r2 <= r11) goto L3f
            int r10 = r2 + (-1)
            char r10 = r12.charAt(r10)
            int r5 = r4 + (-1)
            char r5 = r0.charAt(r5)
            if (r10 != r5) goto L3f
            int r2 = r2 + (-1)
            int r4 = r4 + (-1)
            goto L28
        L3f:
            if (r3 != r4) goto L4c
            if (r11 == r2) goto L44
            goto L4c
        L44:
            r10 = 0
            r9.f(r10)
            r9.F = r10
            r2 = r9
            goto L63
        L4c:
            if (r11 != 0) goto L56
            int r10 = r12.length()
            if (r2 != r10) goto L56
            r5 = r12
            goto L5b
        L56:
            java.lang.CharSequence r10 = r12.subSequence(r11, r2)
            r5 = r10
        L5b:
            r7 = 0
            r8 = 24
            r6 = 0
            r2 = r9
            defpackage.o96.d(r2, r3, r4, r5, r6, r7, r8)
        L63:
            int r9 = r12.length()
            int r9 = r9 + r1
            long r9 = defpackage.fy5.a(r9, r9)
            r2.g(r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.h41.H(o96, int, int, java.lang.CharSequence):void");
    }

    public static final boolean I(ph5 ph5Var) {
        ai5 ai5Var = yh5.s;
        p44 p44Var = ph5Var.x;
        Object g = p44Var.g(ai5Var);
        if (g == null) {
            g = null;
        }
        if (!a34.i(g, nr1.A)) {
            if (!p44Var.b(oh5.g) && !p44Var.b(oh5.h)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public static boolean J(float[] fArr, float[] fArr2) {
        boolean z;
        if (fArr2.length == 4) {
            z = true;
        } else {
            z = false;
        }
        io3.m("Expecting 4 plane parameters", z);
        if ((fArr2[2] * fArr[2]) + (fArr2[1] * fArr[1]) + (fArr2[0] * fArr[0]) > fArr2[3]) {
            return false;
        }
        return true;
    }

    public static final boolean K(float f2) {
        if (!Float.isNaN(f2) && Math.abs(f2) >= 0.5f) {
            return false;
        }
        return true;
    }

    public static void L(PackageInfo packageInfo, File file) {
        try {
            DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(new File(file, "profileinstaller_profileWrittenFor_lastUpdateTime.dat")));
            try {
                dataOutputStream.writeLong(packageInfo.lastUpdateTime);
                dataOutputStream.close();
            } finally {
            }
        } catch (IOException unused) {
        }
    }

    public static final yz3 M(yz3 yz3Var, ub2 ub2Var) {
        return yz3Var.w(new yx0(ub2Var));
    }

    public static final yz3 N(yz3 yz3Var, ub2 ub2Var) {
        return yz3Var.w(new d72(ub2Var));
    }

    public static final void O(bs5 bs5Var, nr nrVar, int i) {
        while (true) {
            int i2 = bs5Var.v;
            if (i <= i2 || i >= bs5Var.u) {
                if (i2 == 0 && i == 0) {
                    return;
                }
                bs5Var.N();
                if (bs5Var.x(bs5Var.v)) {
                    nrVar.p();
                }
                bs5Var.i();
            } else {
                return;
            }
        }
    }

    public static boolean P(Parcel parcel, int i) {
        r0(parcel, i, 4);
        if (parcel.readInt() != 0) {
            return true;
        }
        return false;
    }

    public static Boolean Q(Parcel parcel, int i) {
        boolean z;
        int W = W(parcel, i);
        if (W == 0) {
            return null;
        }
        s0(parcel, W, 4);
        if (parcel.readInt() != 0) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    public static double R(Parcel parcel, int i) {
        r0(parcel, i, 8);
        return parcel.readDouble();
    }

    public static IBinder S(Parcel parcel, int i) {
        int W = W(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (W == 0) {
            return null;
        }
        IBinder readStrongBinder = parcel.readStrongBinder();
        parcel.setDataPosition(dataPosition + W);
        return readStrongBinder;
    }

    public static int T(Parcel parcel, int i) {
        r0(parcel, i, 4);
        return parcel.readInt();
    }

    public static Integer U(Parcel parcel, int i) {
        int W = W(parcel, i);
        if (W == 0) {
            return null;
        }
        s0(parcel, W, 4);
        return Integer.valueOf(parcel.readInt());
    }

    public static long V(Parcel parcel, int i) {
        r0(parcel, i, 8);
        return parcel.readLong();
    }

    public static int W(Parcel parcel, int i) {
        if ((i & (-65536)) != -65536) {
            return (char) (i >> 16);
        }
        return parcel.readInt();
    }

    public static final op6 X(op6 op6Var) {
        String str = op6Var.x;
        if (!uz5.N(str, '/') && !uz5.M(str, "?", false) && !uz5.M(str, "#", false)) {
            return op6Var;
        }
        return fz5.b(op6Var.C);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:1|(2:3|(7:5|6|7|(1:(1:10)(2:16|17))(4:18|19|20|(1:22))|11|12|13))|24|6|7|(0)(0)|11|12|13) */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object Y(defpackage.sb2 r4, defpackage.ic2 r5, defpackage.xz0 r6) {
        /*
            boolean r0 = r6 instanceof defpackage.e8
            if (r0 == 0) goto L13
            r0 = r6
            e8 r0 = (defpackage.e8) r0
            int r1 = r0.y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.y = r1
            goto L18
        L13:
            e8 r0 = new e8
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.x
            int r1 = r0.y
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L2c
            if (r1 != r3) goto L26
            defpackage.m37.N(r6)     // Catch: defpackage.u7 -> L40
            goto L40
        L26:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ze0.m(r4)
            return r2
        L2c:
            defpackage.m37.N(r6)
            k8 r6 = new k8     // Catch: defpackage.u7 -> L40
            r1 = 0
            r6.<init>(r4, r5, r2, r1)     // Catch: defpackage.u7 -> L40
            r0.y = r3     // Catch: defpackage.u7 -> L40
            java.lang.Object r4 = defpackage.db.K(r6, r0)     // Catch: defpackage.u7 -> L40
            w11 r5 = defpackage.w11.x
            if (r4 != r5) goto L40
            return r5
        L40:
            pn6 r4 = defpackage.pn6.a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.h41.Y(sb2, ic2, xz0):java.lang.Object");
    }

    public static final ty4 Z(w42 w42Var, v11 v11Var, int i) {
        ad k = k(w42Var, i);
        in5 a2 = jn5.a(i, k.y, (ta0) k.A);
        return new ty4(a2, tl7.y(v11Var, (l11) k.B, y11.x, new j10(un5.a, (w42) k.z, a2, jn5.a, null, (byte) 2)));
    }

    public static final void a(final xi xiVar, final float f2, final boolean z, final float f3, final yz3 yz3Var, ub2 ub2Var, kd2 kd2Var, final int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        boolean z2;
        ub2 ub2Var2;
        boolean z3;
        boolean z4;
        y50 y50Var;
        boolean z5;
        ub2Var.getClass();
        kd2Var.f0(322221483);
        if (kd2Var.h(xiVar)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i7 = i | i2;
        if (kd2Var.c(f2)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i8 = i7 | i3;
        if (kd2Var.g(z)) {
            i4 = 256;
        } else {
            i4 = 128;
        }
        int i9 = i8 | i4;
        if (kd2Var.c(f3)) {
            i5 = 2048;
        } else {
            i5 = 1024;
        }
        int i10 = i9 | i5;
        if (kd2Var.f(yz3Var)) {
            i6 = 16384;
        } else {
            i6 = 8192;
        }
        int i11 = i10 | i6;
        byte b2 = 0;
        if ((74899 & i11) != 74898) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (kd2Var.V(i11 & 1, z2)) {
            bg6 bg6Var = (bg6) xiVar.a.getValue();
            Object Q = kd2Var.Q();
            q18 q18Var = au0.a;
            if (Q == q18Var) {
                Q = xt5.g(null);
                kd2Var.n0(Q);
            }
            w44 w44Var = (w44) Q;
            if (bg6Var != null) {
                w44Var.setValue(bg6Var);
            }
            yz3 c2 = ar5.c(yz3Var, 1.0f);
            WeakHashMap weakHashMap = z57.w;
            yz3 k0 = k0(c2, mv5.b(kd2Var).l);
            if ((i11 & 112) == 32) {
                z3 = true;
            } else {
                z3 = false;
            }
            if ((i11 & 7168) == 2048) {
                z4 = true;
            } else {
                z4 = false;
            }
            boolean z6 = z4 | z3;
            Object Q2 = kd2Var.Q();
            if (z6 || Q2 == q18Var) {
                Q2 = new ub2() { // from class: ti
                    @Override // defpackage.ub2
                    public final Object invoke(Object obj) {
                        p55 p55Var = (p55) obj;
                        p55Var.getClass();
                        p55Var.n((-(1.0f - f2)) * f3);
                        return pn6.a;
                    }
                };
                kd2Var.n0(Q2);
            }
            yz3 O = io3.O(k0, (ub2) Q2);
            if (z) {
                y50Var = pk2.B;
            } else {
                y50Var = pk2.C;
            }
            vo3 c3 = b90.c(y50Var, false);
            int hashCode = Long.hashCode(kd2Var.T);
            al4 l = kd2Var.l();
            yz3 E = o80.E(kd2Var, O);
            tt0.d.getClass();
            kd2Var.h0();
            if (kd2Var.S) {
                kd2Var.k(za3.p0);
            } else {
                kd2Var.q0();
            }
            ss5.i(p7.F, kd2Var, c3);
            ss5.i(p7.E, kd2Var, l);
            ss5.i(p7.G, kd2Var, Integer.valueOf(hashCode));
            ss5.h(kd2Var);
            ss5.i(p7.D, kd2Var, E);
            if (bg6Var != null) {
                z5 = true;
            } else {
                z5 = false;
            }
            sk6 V = z51.V(250, 2, br1.b);
            Object Q3 = kd2Var.Q();
            if (Q3 == q18Var) {
                Q3 = new ui(b2);
                kd2Var.n0(Q3);
            }
            iv1 e2 = dv1.e(V, (ub2) Q3);
            sk6 V2 = z51.V(250, 2, br1.c);
            Object Q4 = kd2Var.Q();
            if (Q4 == q18Var) {
                Q4 = new ui(b2);
                kd2Var.n0(Q4);
            }
            ub2Var2 = ub2Var;
            te4.c(z5, null, e2, dv1.f(V2, (ub2) Q4), null, nx7.R(-700759411, new xh(ub2Var2, z, w44Var, (byte) 1), kd2Var), kd2Var, 196608, 18);
            kd2Var.q(true);
        } else {
            ub2Var2 = ub2Var;
            kd2Var.Y();
        }
        zz4 u = kd2Var.u();
        if (u != null) {
            final ub2 ub2Var3 = ub2Var2;
            u.d = new ic2(f2, z, f3, yz3Var, ub2Var3, i) { // from class: vi
                public final /* synthetic */ float A;
                public final /* synthetic */ yz3 B;
                public final /* synthetic */ ub2 C;
                public final /* synthetic */ float y;
                public final /* synthetic */ boolean z;

                @Override // defpackage.ic2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int N = kb0.N(196617);
                    h41.a(xi.this, this.y, this.z, this.A, this.B, this.C, (kd2) obj, N);
                    return pn6.a;
                }
            };
        }
    }

    public static void a0(Parcel parcel, int i) {
        parcel.setDataPosition(parcel.dataPosition() + W(parcel, i));
    }

    /* JADX WARN: Code restructure failed: missing block: B:176:0x03e9, code lost:
    
        if (r5 == r0) goto L271;
     */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0271  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0292  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x03b9  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x03c0  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0416  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x047d  */
    /* JADX WARN: Removed duplicated region for block: B:190:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0418  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0405  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x03bc  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x046e  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0166  */
    /* JADX WARN: Type inference failed for: r2v15, types: [java.lang.Object, zc3] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(final defpackage.yz3 r40, defpackage.af3 r41, final defpackage.th4 r42, final boolean r43, final defpackage.i42 r44, final boolean r45, final defpackage.fc r46, defpackage.d7 r47, defpackage.wr r48, defpackage.x50 r49, defpackage.ur r50, final defpackage.ub2 r51, defpackage.kd2 r52, final int r53, final int r54, final int r55) {
        /*
            Method dump skipped, instructions count: 1184
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.h41.b(yz3, af3, th4, boolean, i42, boolean, fc, d7, wr, x50, ur, ub2, kd2, int, int, int):void");
    }

    public static int b0(int i) {
        return (int) (Integer.rotateLeft((int) (i * (-862048943)), 15) * 461845907);
    }

    public static final ty4 c(in5 in5Var) {
        return new ty4(in5Var, null);
    }

    public static int c0(Object obj) {
        int hashCode;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        return b0(hashCode);
    }

    public static final vy4 d(sx5 sx5Var) {
        return new vy4(sx5Var, null);
    }

    public static final vy4 d0(w42 w42Var, ke0 ke0Var, vn5 vn5Var, Object obj) {
        y11 y11Var;
        ad k = k(w42Var, 1);
        sx5 a2 = tx5.a(obj);
        l11 l11Var = (l11) k.B;
        w42 w42Var2 = (w42) k.z;
        if (vn5Var.equals(un5.a)) {
            y11Var = y11.x;
        } else {
            y11Var = y11.A;
        }
        return new vy4(a2, tl7.y(ke0Var, l11Var, y11Var, new j10(vn5Var, w42Var2, a2, obj, null, (byte) 2)));
    }

    public static final Object e(ArrayList arrayList, vz0 vz0Var) {
        if (arrayList.isEmpty()) {
            return nt1.x;
        }
        return new gz((nc1[]) arrayList.toArray(new nc1[0])).a((xz0) vz0Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object e0(defpackage.p5 r4, defpackage.ny2 r5, defpackage.mu5 r6, defpackage.xz0 r7) {
        /*
            boolean r0 = r7 instanceof defpackage.tv0
            if (r0 == 0) goto L13
            r0 = r7
            tv0 r0 = (defpackage.tv0) r0
            int r1 = r0.A
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.A = r1
            goto L18
        L13:
            tv0 r0 = new tv0
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.z
            int r1 = r0.A
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L32
            if (r1 != r3) goto L2c
            lu5 r4 = r0.y
            java.nio.channels.SocketChannel r5 = r0.x
            defpackage.m37.N(r7)     // Catch: java.lang.Throwable -> L2a
            return r4
        L2a:
            r4 = move-exception
            goto L73
        L2c:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ze0.m(r4)
            return r2
        L32:
            defpackage.m37.N(r7)
            java.nio.channels.spi.SelectorProvider r7 = r4.x
            r7.getClass()
            r5.getClass()
            boolean r1 = r5 instanceof defpackage.ny2
            if (r1 == 0) goto L77
            java.nio.channels.SocketChannel r7 = r7.openSocketChannel()
            boolean r1 = r5 instanceof defpackage.ny2     // Catch: java.lang.Throwable -> L50
            if (r1 == 0) goto L53
            r7.getClass()     // Catch: java.lang.Throwable -> L50
            defpackage.c43.a(r7, r6)     // Catch: java.lang.Throwable -> L50
            goto L53
        L50:
            r4 = move-exception
            r5 = r7
            goto L73
        L53:
            r7.getClass()     // Catch: java.lang.Throwable -> L50
            boolean r1 = defpackage.c43.a     // Catch: java.lang.Throwable -> L50
            r1 = 0
            r7.configureBlocking(r1)     // Catch: java.lang.Throwable -> L50
            lu5 r1 = new lu5     // Catch: java.lang.Throwable -> L50
            r1.<init>(r7, r4, r6)     // Catch: java.lang.Throwable -> L50
            java.net.InetSocketAddress r4 = r5.a     // Catch: java.lang.Throwable -> L50
            r0.x = r7     // Catch: java.lang.Throwable -> L50
            r0.y = r1     // Catch: java.lang.Throwable -> L50
            r0.A = r3     // Catch: java.lang.Throwable -> L50
            java.lang.Object r4 = r1.l0(r4, r0)     // Catch: java.lang.Throwable -> L50
            w11 r5 = defpackage.w11.x
            if (r4 != r5) goto L72
            return r5
        L72:
            return r1
        L73:
            r5.close()
            throw r4
        L77:
            defpackage.ze0.l()
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.h41.e0(p5, ny2, mu5, xz0):java.lang.Object");
    }

    public static final void f(xj0 xj0Var) {
        xj0Var.getClass();
        xj0Var.c().l(null);
    }

    public static final ExtractedText f0(mc6 mc6Var) {
        ExtractedText extractedText = new ExtractedText();
        String str = mc6Var.a.y;
        extractedText.text = str;
        extractedText.startOffset = 0;
        extractedText.partialEndOffset = str.length();
        extractedText.partialStartOffset = -1;
        long j = mc6Var.b;
        extractedText.selectionStart = nd6.g(j);
        extractedText.selectionEnd = nd6.f(j);
        extractedText.flags = !uz5.N(mc6Var.a.y, '\n') ? 1 : 0;
        return extractedText;
    }

    public static final void g(long j, rg4 rg4Var) {
        if (rg4Var == rg4.x) {
            if (rx0.g(j) == Integer.MAX_VALUE) {
                hz2.c("Vertically scrollable component was measured with an infinity maximum height constraints, which is disallowed. One of the common reasons is nesting layouts like LazyColumn and Column(Modifier.verticalScroll()). If you want to add a header before the list of items please add a header as a separate item() before the main items() inside the LazyColumn scope. There could be other reasons for this to happen: your ComposeView was added into a LinearLayout with some weight, you applied Modifier.wrapContentSize(unbounded = true) or wrote a custom layout. Please try to remove the source of infinite constraints in the hierarchy above the scrolling container.");
            }
        } else {
            if (rx0.h(j) != Integer.MAX_VALUE) {
                return;
            }
            hz2.c("Horizontally scrollable component was measured with an infinity maximum width constraints, which is disallowed. One of the common reasons is nesting layouts like LazyRow and Row(Modifier.horizontalScroll()). If you want to add a header before the list of items please add a header as a separate item() before the main items() inside the LazyRow scope. There could be other reasons for this to happen: your ComposeView was added into a LinearLayout with some weight, you applied Modifier.wrapContentSize(unbounded = true) or wrote a custom layout. Please try to remove the source of infinite constraints in the hierarchy above the scrolling container.");
        }
    }

    public static final void g0(nq4 nq4Var, long j, ub2 ub2Var, boolean z) {
        MotionEvent a2 = nq4Var.a();
        if (a2 != null) {
            int action = a2.getAction();
            if (z) {
                a2.setAction(3);
            }
            int i = (int) (j >> 32);
            int i2 = (int) (j & 4294967295L);
            a2.offsetLocation(-Float.intBitsToFloat(i), -Float.intBitsToFloat(i2));
            ub2Var.invoke(a2);
            a2.offsetLocation(Float.intBitsToFloat(i), Float.intBitsToFloat(i2));
            a2.setAction(action);
            return;
        }
        ze0.k("The PointerEvent receiver cannot have a null MotionEvent.");
    }

    public static final void h(ae0 ae0Var, Throwable th) {
        ae0Var.getClass();
        if (th == null) {
            A(new d0(1, ae0Var, ae0.class, "flushAndClose", "flushAndClose(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, (byte) 4));
            return;
        }
        ae0Var.a(th);
    }

    public static o15 h0(float[] fArr, nw2 nw2Var) {
        io3.t(4, "initialCapacity");
        Object[] objArr = new Object[4];
        int i = 0;
        int i2 = 0;
        while (i < nw2Var.size()) {
            float[] fArr2 = new float[4];
            float[] fArr3 = fArr;
            Matrix.multiplyMV(fArr2, 0, fArr3, 0, (float[]) nw2Var.get(i), 0);
            float f2 = fArr2[0];
            float f3 = fArr2[3];
            fArr2[0] = f2 / f3;
            fArr2[1] = fArr2[1] / f3;
            fArr2[2] = fArr2[2] / f3;
            fArr2[3] = 1.0f;
            int i3 = i2 + 1;
            int b2 = fw2.b(objArr.length, i3);
            if (b2 > objArr.length) {
                objArr = Arrays.copyOf(objArr, b2);
            }
            objArr[i2] = fArr2;
            i++;
            i2 = i3;
            fArr = fArr3;
        }
        return nw2.j(objArr, i2);
    }

    public static float[] i(float[] fArr, float[] fArr2, float[] fArr3, float[] fArr4) {
        boolean z;
        if (fArr2.length == 4) {
            z = true;
        } else {
            z = false;
        }
        io3.m("Expecting 4 plane parameters", z);
        float f2 = fArr[0];
        float f3 = fArr3[0];
        float f4 = fArr2[0];
        float f5 = fArr[1];
        float f6 = fArr3[1];
        float f7 = fArr2[1];
        float f8 = fArr[2];
        float f9 = fArr3[2];
        float f10 = fArr2[2];
        float f11 = ((f8 - f9) * f10) + ((f5 - f6) * f7) + ((f2 - f3) * f4);
        float f12 = fArr4[0] - f3;
        float f13 = fArr4[1] - f6;
        float f14 = fArr4[2] - f9;
        float f15 = f11 / ((f10 * f14) + ((f7 * f13) + (f4 * f12)));
        return new float[]{(f12 * f15) + f3, (f13 * f15) + f6, (f14 * f15) + f9, 1.0f};
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x001d, code lost:
    
        return r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Throwable i0(java.lang.Throwable r3) {
        /*
            r3.getClass()
            r0 = r3
        L4:
            boolean r1 = r0 instanceof java.util.concurrent.CancellationException
            if (r1 == 0) goto L1b
            r1 = r0
            java.util.concurrent.CancellationException r1 = (java.util.concurrent.CancellationException) r1
            java.lang.Throwable r2 = r1.getCause()
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L16
            goto L1d
        L16:
            java.lang.Throwable r0 = r1.getCause()
            goto L4
        L1b:
            if (r0 != 0) goto L1e
        L1d:
            return r3
        L1e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.h41.i0(java.lang.Throwable):java.lang.Throwable");
    }

    public static sq5 j(List list, int i, int i2) {
        boolean z;
        boolean z2 = true;
        if (i > 0) {
            z = true;
        } else {
            z = false;
        }
        io3.m("inputWidth must be positive", z);
        if (i2 <= 0) {
            z2 = false;
        }
        io3.m("inputHeight must be positive", z2);
        sq5 sq5Var = new sq5(i, i2);
        for (int i3 = 0; i3 < list.size(); i3++) {
            sq5Var = ((ko3) list.get(i3)).e(sq5Var.a, sq5Var.b);
        }
        return sq5Var;
    }

    public static int j0(Parcel parcel) {
        int readInt = parcel.readInt();
        int W = W(parcel, readInt);
        char c2 = (char) readInt;
        int dataPosition = parcel.dataPosition();
        if (c2 == 20293) {
            int i = W + dataPosition;
            if (i >= dataPosition && i <= parcel.dataSize()) {
                return i;
            }
            StringBuilder sb = new StringBuilder(String.valueOf(dataPosition).length() + 32 + String.valueOf(i).length());
            sb.append("Size read is invalid start=");
            sb.append(dataPosition);
            sb.append(" end=");
            sb.append(i);
            throw new z85(sb.toString(), parcel);
        }
        throw new z85("Expected object header. Got 0x".concat(String.valueOf(Integer.toHexString(readInt))), parcel);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x002e, code lost:
    
        if (r5 == 0) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final defpackage.ad k(defpackage.w42 r7, int r8) {
        /*
            kj0 r0 = defpackage.lj0.c
            r0.getClass()
            int r0 = defpackage.kj0.b
            if (r8 >= r0) goto La
            goto Lb
        La:
            r0 = r8
        Lb:
            int r0 = r0 - r8
            boolean r1 = r7 instanceof defpackage.oj0
            ta0 r2 = defpackage.ta0.x
            if (r1 == 0) goto L3b
            r1 = r7
            oj0 r1 = (defpackage.oj0) r1
            ta0 r3 = r1.z
            w42 r4 = r1.h()
            if (r4 == 0) goto L3b
            ad r7 = new ad
            int r5 = r1.y
            r6 = -3
            if (r5 == r6) goto L2b
            r6 = -2
            if (r5 == r6) goto L2b
            if (r5 == 0) goto L2b
            r0 = r5
            goto L35
        L2b:
            r6 = 0
            if (r3 != r2) goto L32
            if (r5 != 0) goto L35
        L30:
            r0 = r6
            goto L35
        L32:
            if (r8 != 0) goto L30
            r0 = 1
        L35:
            l11 r8 = r1.x
            r7.<init>(r0, r3, r8, r4)
            return r7
        L3b:
            ad r8 = new ad
            it1 r1 = defpackage.it1.x
            r8.<init>(r0, r2, r1, r7)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.h41.k(w42, int):ad");
    }

    public static final yz3 k0(yz3 yz3Var, t47 t47Var) {
        return yz3Var.w(new d03(t47Var));
    }

    public static long l(int i, m47 m47Var) {
        int i2 = i31.a[m47Var.ordinal()];
        int i3 = -1;
        if (i2 != -1) {
            i3 = 1;
            if (i2 != 1) {
                if (i2 != 2) {
                    ze0.l();
                    return 0L;
                }
            } else {
                i3 = 0;
            }
        }
        return (i << 32) | (i3 & 4294967295L);
    }

    public static final Object l0(ae0 ae0Var, byte b2, xz0 xz0Var) {
        ((oa0) ae0Var.e()).l0(b2);
        Object t = sw0.t(ae0Var, xz0Var);
        if (t == w11.x) {
            return t;
        }
        return pn6.a;
    }

    public static Bundle m(Parcel parcel, int i) {
        int W = W(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (W == 0) {
            return null;
        }
        Bundle readBundle = parcel.readBundle();
        parcel.setDataPosition(dataPosition + W);
        return readBundle;
    }

    public static final Object m0(ae0 ae0Var, byte[] bArr, int i, int i2, xz0 xz0Var) {
        ((oa0) ae0Var.e()).write(bArr, i, i2);
        Object t = sw0.t(ae0Var, xz0Var);
        if (t == w11.x) {
            return t;
        }
        return pn6.a;
    }

    public static byte[] n(Parcel parcel, int i) {
        int W = W(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (W == 0) {
            return null;
        }
        byte[] createByteArray = parcel.createByteArray();
        parcel.setDataPosition(dataPosition + W);
        return createByteArray;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object n0(defpackage.ae0 r6, defpackage.cv5 r7, defpackage.xz0 r8) {
        /*
            boolean r0 = r8 instanceof defpackage.be0
            if (r0 == 0) goto L13
            r0 = r8
            be0 r0 = (defpackage.be0) r0
            int r1 = r0.A
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.A = r1
            goto L18
        L13:
            be0 r0 = new be0
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.z
            int r1 = r0.A
            r2 = 1
            if (r1 == 0) goto L33
            if (r1 != r2) goto L2c
            cv5 r6 = r0.y
            ae0 r7 = r0.x
            defpackage.m37.N(r8)
            r5 = r7
            r7 = r6
            r6 = r5
            goto L36
        L2c:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ze0.m(r6)
            r6 = 0
            return r6
        L33:
            defpackage.m37.N(r8)
        L36:
            boolean r8 = r7.D()
            if (r8 != 0) goto L5a
            qq5 r8 = r6.e()
            oa0 r1 = r7.c()
            long r3 = r1.z
            oa0 r8 = (defpackage.oa0) r8
            r8.k0(r7, r3)
            r0.x = r6
            r0.y = r7
            r0.A = r2
            java.lang.Object r8 = defpackage.sw0.t(r6, r0)
            w11 r1 = defpackage.w11.x
            if (r8 != r1) goto L36
            return r1
        L5a:
            pn6 r6 = defpackage.pn6.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.h41.n0(ae0, cv5, xz0):java.lang.Object");
    }

    public static byte[][] o(Parcel parcel, int i) {
        int W = W(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (W == 0) {
            return null;
        }
        int readInt = parcel.readInt();
        byte[][] bArr = new byte[readInt];
        for (int i2 = 0; i2 < readInt; i2++) {
            bArr[i2] = parcel.createByteArray();
        }
        parcel.setDataPosition(dataPosition + W);
        return bArr;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x01c8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x02c6  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x0107 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x02da A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0164 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01c1 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0207  */
    /* JADX WARN: Type inference failed for: r0v71, types: [uf1[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r7v22, types: [boolean] */
    /* JADX WARN: Type inference failed for: r7v23 */
    /* JADX WARN: Type inference failed for: r7v24 */
    /* JADX WARN: Type inference failed for: r7v26, types: [java.io.OutputStream, java.io.ByteArrayOutputStream] */
    /* JADX WARN: Type inference failed for: r7v27, types: [int] */
    /* JADX WARN: Type inference failed for: r7v28 */
    /* JADX WARN: Type inference failed for: r7v29 */
    /* JADX WARN: Type inference failed for: r7v30 */
    /* JADX WARN: Type inference failed for: r7v31 */
    /* JADX WARN: Type inference failed for: r7v33, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r7v37 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.io.FileInputStream, java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r7v51 */
    /* JADX WARN: Type inference failed for: r7v52 */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r9v6, types: [uf1[]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void o0(android.content.Context r18, java.util.concurrent.Executor r19, defpackage.uu4 r20, boolean r21) {
        /*
            Method dump skipped, instructions count: 748
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.h41.o0(android.content.Context, java.util.concurrent.Executor, uu4, boolean):void");
    }

    public static int[] p(Parcel parcel, int i) {
        int W = W(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (W == 0) {
            return null;
        }
        int[] createIntArray = parcel.createIntArray();
        parcel.setDataPosition(dataPosition + W);
        return createIntArray;
    }

    public static final k97 p0(v11 v11Var, l11 l11Var, nc0 nc0Var, ic2 ic2Var) {
        v11Var.getClass();
        l11Var.getClass();
        bx5 z = tl7.z(v11Var, l11Var, null, new jd0(ic2Var, nc0Var, null, (byte) 1), 2);
        z.l0(new tc0(nc0Var, (byte) 2));
        return new k97(nc0Var, z);
    }

    public static ArrayList q(Parcel parcel, int i) {
        int W = W(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (W == 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int readInt = parcel.readInt();
        for (int i2 = 0; i2 < readInt; i2++) {
            arrayList.add(Integer.valueOf(parcel.readInt()));
        }
        parcel.setDataPosition(dataPosition + W);
        return arrayList;
    }

    public static k97 q0(v11 v11Var, l11 l11Var, ic2 ic2Var, int i) {
        boolean z;
        if ((i & 1) != 0) {
            l11Var = it1.x;
        }
        if ((i & 2) != 0) {
            z = false;
        } else {
            z = true;
        }
        v11Var.getClass();
        l11Var.getClass();
        return p0(v11Var, l11Var, new nc0(z), ic2Var);
    }

    public static long[] r(Parcel parcel, int i) {
        int W = W(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (W == 0) {
            return null;
        }
        long[] createLongArray = parcel.createLongArray();
        parcel.setDataPosition(dataPosition + W);
        return createLongArray;
    }

    public static void r0(Parcel parcel, int i, int i2) {
        int W = W(parcel, i);
        if (W == i2) {
            return;
        }
        String hexString = Integer.toHexString(W);
        int length = String.valueOf(i2).length();
        StringBuilder sb = new StringBuilder(String.valueOf(hexString).length() + length + 19 + String.valueOf(W).length() + 4 + 1);
        sb.append("Expected size ");
        sb.append(i2);
        sb.append(" got ");
        sb.append(W);
        throw new z85(qx1.q(sb, " (0x", hexString, ")"), parcel);
    }

    public static Parcelable s(Parcel parcel, int i, Parcelable.Creator creator) {
        int W = W(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (W == 0) {
            return null;
        }
        Parcelable parcelable = (Parcelable) creator.createFromParcel(parcel);
        parcel.setDataPosition(dataPosition + W);
        return parcelable;
    }

    public static void s0(Parcel parcel, int i, int i2) {
        if (i == i2) {
            return;
        }
        String hexString = Integer.toHexString(i);
        int length = String.valueOf(i2).length();
        StringBuilder sb = new StringBuilder(String.valueOf(hexString).length() + length + 19 + String.valueOf(i).length() + 4 + 1);
        sb.append("Expected size ");
        sb.append(i2);
        sb.append(" got ");
        sb.append(i);
        throw new z85(qx1.q(sb, " (0x", hexString, ")"), parcel);
    }

    public static String t(Parcel parcel, int i) {
        int W = W(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (W == 0) {
            return null;
        }
        String readString = parcel.readString();
        parcel.setDataPosition(dataPosition + W);
        return readString;
    }

    public static ArrayList u(Parcel parcel, int i) {
        int W = W(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (W == 0) {
            return null;
        }
        ArrayList<String> createStringArrayList = parcel.createStringArrayList();
        parcel.setDataPosition(dataPosition + W);
        return createStringArrayList;
    }

    public static Object[] v(Parcel parcel, int i, Parcelable.Creator creator) {
        int W = W(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (W == 0) {
            return null;
        }
        Object[] createTypedArray = parcel.createTypedArray(creator);
        parcel.setDataPosition(dataPosition + W);
        return createTypedArray;
    }

    public static ArrayList w(Parcel parcel, int i, Parcelable.Creator creator) {
        int W = W(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (W == 0) {
            return null;
        }
        ArrayList createTypedArrayList = parcel.createTypedArrayList(creator);
        parcel.setDataPosition(dataPosition + W);
        return createTypedArrayList;
    }

    public static String x(String str, int i, String str2, String str3) {
        str.getClass();
        str2.getClass();
        Locale locale = Locale.ROOT;
        locale.getClass();
        String lowerCase = str2.toLowerCase(locale);
        lowerCase.getClass();
        StringBuilder m = h11.m(i, "episode:", str, ":", ":");
        m.append(lowerCase);
        String sb = m.toString();
        if (str3 != null) {
            String lowerCase2 = str3.toLowerCase(locale);
            lowerCase2.getClass();
            Pattern compile = Pattern.compile("[^a-z0-9-]+");
            compile.getClass();
            String replaceAll = compile.matcher(lowerCase2).replaceAll("-");
            replaceAll.getClass();
            String x0 = uz5.x0(replaceAll, '-');
            if (uz5.V(x0)) {
                x0 = "unknown";
            }
            return qx1.m(sb, ":audio:", x0);
        }
        return sb;
    }

    public static final yz3 y(yz3 yz3Var, d9 d9Var, ic2 ic2Var) {
        return yz3Var.w(new mo1(d9Var, ic2Var));
    }

    public static void z(Parcel parcel, int i) {
        if (parcel.dataPosition() == i) {
        } else {
            throw new z85(h11.g(i, "Overread allowed size end=", new StringBuilder(String.valueOf(i).length() + 26)), parcel);
        }
    }
}
