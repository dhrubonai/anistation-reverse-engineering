package defpackage;

import android.text.Spanned;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public abstract class vv5 {
    public static final void a(final float f, final float f2, final int i, final int i2, final long j, final long j2, final os0 os0Var, final os0 os0Var2, final os0 os0Var3, kd2 kd2Var, final yz3 yz3Var, final yc5 yc5Var) {
        int i3;
        long j3;
        boolean z;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        kd2Var.f0(414860860);
        if ((i2 & 6) == 0) {
            if (kd2Var.d(i)) {
                i13 = 4;
            } else {
                i13 = 2;
            }
            i3 = i13 | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            if (kd2Var.f(yz3Var)) {
                i12 = 32;
            } else {
                i12 = 16;
            }
            i3 |= i12;
        }
        if ((i2 & 384) == 0) {
            j3 = j;
            if (kd2Var.e(j3)) {
                i11 = 256;
            } else {
                i11 = 128;
            }
            i3 |= i11;
        } else {
            j3 = j;
        }
        if ((i2 & 3072) == 0) {
            if (kd2Var.e(j2)) {
                i10 = 2048;
            } else {
                i10 = 1024;
            }
            i3 |= i10;
        }
        if ((i2 & 24576) == 0) {
            if (kd2Var.c(f)) {
                i9 = 16384;
            } else {
                i9 = 8192;
            }
            i3 |= i9;
        }
        if ((196608 & i2) == 0) {
            if (kd2Var.c(f2)) {
                i8 = 131072;
            } else {
                i8 = 65536;
            }
            i3 |= i8;
        }
        if ((1572864 & i2) == 0) {
            if (kd2Var.f(yc5Var)) {
                i7 = 1048576;
            } else {
                i7 = 524288;
            }
            i3 |= i7;
        }
        if ((i2 & 12582912) == 0) {
            if (kd2Var.h(os0Var)) {
                i6 = 8388608;
            } else {
                i6 = 4194304;
            }
            i3 |= i6;
        }
        if ((100663296 & i2) == 0) {
            if (kd2Var.h(os0Var2)) {
                i5 = 67108864;
            } else {
                i5 = 33554432;
            }
            i3 |= i5;
        }
        if ((805306368 & i2) == 0) {
            if (kd2Var.h(os0Var3)) {
                i4 = 536870912;
            } else {
                i4 = 268435456;
            }
            i3 |= i4;
        }
        if ((306783379 & i3) != 306783378) {
            z = true;
        } else {
            z = false;
        }
        if (kd2Var.V(i3 & 1, z)) {
            l36.a(yz3Var, null, j3, j2, 0.0f, 0.0f, null, nx7.R(1878374785, new r66(yc5Var, os0Var2, os0Var3, f, f2, i, os0Var), kd2Var), kd2Var, ((i3 >> 3) & 14) | 12582912 | (i3 & 896) | (i3 & 7168), 114);
        } else {
            kd2Var.Y();
        }
        zz4 u = kd2Var.u();
        if (u != null) {
            u.d = new ic2() { // from class: n66
                @Override // defpackage.ic2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int N = kb0.N(i2 | 1);
                    vv5.a(f, f2, i, N, j, j2, os0Var, os0Var2, os0Var3, (kd2) obj, yz3Var, yc5Var);
                    return pn6.a;
                }
            };
        }
    }

    public static final void b(final float f, final float f2, final int i, final int i2, final long j, long j2, final os0 os0Var, final os0 os0Var2, final os0 os0Var3, kd2 kd2Var, yz3 yz3Var, yc5 yc5Var) {
        int i3;
        int i4;
        boolean z;
        final long j3;
        final yz3 yz3Var2;
        final yc5 yc5Var2;
        long d;
        int i5;
        yc5 yc5Var3;
        yz3 yz3Var3;
        kd2Var.f0(519094802);
        if (kd2Var.d(i)) {
            i3 = 4;
        } else {
            i3 = 2;
        }
        int i6 = i2 | i3 | 176;
        if (kd2Var.e(j)) {
            i4 = 2048;
        } else {
            i4 = 1024;
        }
        int i7 = i6 | i4 | 8192;
        if ((306783379 & i7) != 306783378) {
            z = true;
        } else {
            z = false;
        }
        if (kd2Var.V(i7 & 1, z)) {
            kd2Var.a0();
            if ((i2 & 1) != 0 && !kd2Var.C()) {
                kd2Var.Y();
                i5 = i7 & (-58241);
                d = j2;
                yz3Var3 = yz3Var;
                yc5Var3 = yc5Var;
            } else {
                yc5 d0 = n77.d0(kd2Var);
                d = op0.d(tl7.i, kd2Var);
                i5 = i7 & (-58241);
                yc5Var3 = d0;
                yz3Var3 = vz3.x;
            }
            kd2Var.r();
            a(f, f2, i, ((i5 >> 3) & 896) | (i5 & 126) | 918773760, j, d, os0Var, os0Var2, os0Var3, kd2Var, yz3Var3, yc5Var3);
            j3 = d;
            yc5Var2 = yc5Var3;
            yz3Var2 = yz3Var3;
        } else {
            kd2Var.Y();
            j3 = j2;
            yz3Var2 = yz3Var;
            yc5Var2 = yc5Var;
        }
        zz4 u = kd2Var.u();
        if (u != null) {
            u.d = new ic2(f, f2, i, i2, j, j3, os0Var, os0Var2, os0Var3, yz3Var2, yc5Var2) { // from class: m66
                public final /* synthetic */ long A;
                public final /* synthetic */ long B;
                public final /* synthetic */ float C;
                public final /* synthetic */ os0 D;
                public final /* synthetic */ os0 E;
                public final /* synthetic */ float F;
                public final /* synthetic */ os0 G;
                public final /* synthetic */ int x;
                public final /* synthetic */ yz3 y;
                public final /* synthetic */ yc5 z;

                {
                    this.y = yz3Var2;
                    this.z = yc5Var2;
                    this.A = j;
                    this.B = j3;
                    this.D = os0Var;
                    this.E = os0Var2;
                    this.G = os0Var3;
                }

                @Override // defpackage.ic2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int N = kb0.N(920322049);
                    vv5.b(this.C, this.F, this.x, N, this.A, this.B, this.D, this.E, this.G, (kd2) obj, this.y, this.z);
                    return pn6.a;
                }
            };
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x004a, code lost:
    
        if (r21 != 3) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x004d, code lost:
    
        if (r21 != 4) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0050, code lost:
    
        if (r21 != 3) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0052, code lost:
    
        r1 = r11 - r19.c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x006d, code lost:
    
        if (r1 >= 0.0f) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x006f, code lost:
    
        r1 = 0.0f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0071, code lost:
    
        if (r21 != 3) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0073, code lost:
    
        r11 = r11 - r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0087, code lost:
    
        if (r11 >= 1.0f) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0089, code lost:
    
        r11 = 1.0f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x008c, code lost:
    
        if (r1 >= r11) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x008e, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x008f, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0075, code lost:
    
        if (r21 != 4) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0077, code lost:
    
        r11 = r2 - r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x007a, code lost:
    
        if (r21 != 5) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x007c, code lost:
    
        r11 = r9 - r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x007f, code lost:
    
        if (r21 != 6) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0081, code lost:
    
        r11 = r6 - r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0090, code lost:
    
        defpackage.ze0.m("This function should only be used for 2-D focus search");
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0093, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0057, code lost:
    
        if (r21 != 4) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0059, code lost:
    
        r1 = r19.a - r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x005d, code lost:
    
        if (r21 != 5) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x005f, code lost:
    
        r1 = r9 - r19.d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0064, code lost:
    
        if (r21 != 6) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0066, code lost:
    
        r1 = r19.b - r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0094, code lost:
    
        defpackage.ze0.m("This function should only be used for 2-D focus search");
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0097, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x004f, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x003a, code lost:
    
        if (r10 <= r7) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0041, code lost:
    
        if (r9 >= r6) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0048, code lost:
    
        if (r8 <= r5) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0033, code lost:
    
        if (r11 >= r2) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0098, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean c(defpackage.n05 r18, defpackage.n05 r19, defpackage.n05 r20, int r21) {
        /*
            r0 = r18
            r1 = r19
            r2 = r20
            r3 = r21
            boolean r4 = d(r3, r2, r0)
            float r5 = r2.b
            float r6 = r2.d
            float r7 = r2.a
            float r2 = r2.c
            float r8 = r0.d
            float r9 = r0.b
            float r10 = r0.c
            float r11 = r0.a
            r12 = 0
            if (r4 != 0) goto L9c
            boolean r0 = d(r3, r1, r0)
            if (r0 != 0) goto L27
            goto L9c
        L27:
            java.lang.String r4 = "This function should only be used for 2-D focus search"
            r13 = 6
            r14 = 5
            r15 = 4
            r18 = 1
            r0 = 3
            if (r3 != r0) goto L36
            int r16 = (r11 > r2 ? 1 : (r11 == r2 ? 0 : -1))
            if (r16 < 0) goto L98
            goto L4a
        L36:
            if (r3 != r15) goto L3d
            int r16 = (r10 > r7 ? 1 : (r10 == r7 ? 0 : -1))
            if (r16 > 0) goto L98
            goto L4a
        L3d:
            if (r3 != r14) goto L44
            int r16 = (r9 > r6 ? 1 : (r9 == r6 ? 0 : -1))
            if (r16 < 0) goto L98
            goto L4a
        L44:
            if (r3 != r13) goto L99
            int r16 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1))
            if (r16 > 0) goto L98
        L4a:
            if (r3 != r0) goto L4d
            goto L4f
        L4d:
            if (r3 != r15) goto L50
        L4f:
            return r18
        L50:
            if (r3 != r0) goto L57
            float r1 = r1.c
            float r1 = r11 - r1
            goto L69
        L57:
            if (r3 != r15) goto L5d
            float r1 = r1.a
            float r1 = r1 - r10
            goto L69
        L5d:
            if (r3 != r14) goto L64
            float r1 = r1.d
            float r1 = r9 - r1
            goto L69
        L64:
            if (r3 != r13) goto L94
            float r1 = r1.b
            float r1 = r1 - r8
        L69:
            r16 = 0
            int r17 = (r1 > r16 ? 1 : (r1 == r16 ? 0 : -1))
            if (r17 >= 0) goto L71
            r1 = r16
        L71:
            if (r3 != r0) goto L75
            float r11 = r11 - r7
            goto L83
        L75:
            if (r3 != r15) goto L7a
            float r11 = r2 - r10
            goto L83
        L7a:
            if (r3 != r14) goto L7f
            float r11 = r9 - r5
            goto L83
        L7f:
            if (r3 != r13) goto L90
            float r11 = r6 - r8
        L83:
            r0 = 1065353216(0x3f800000, float:1.0)
            int r2 = (r11 > r0 ? 1 : (r11 == r0 ? 0 : -1))
            if (r2 >= 0) goto L8a
            r11 = r0
        L8a:
            int r0 = (r1 > r11 ? 1 : (r1 == r11 ? 0 : -1))
            if (r0 >= 0) goto L8f
            return r18
        L8f:
            return r12
        L90:
            defpackage.ze0.m(r4)
            return r12
        L94:
            defpackage.ze0.m(r4)
            return r12
        L98:
            return r18
        L99:
            defpackage.ze0.m(r4)
        L9c:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vv5.c(n05, n05, n05, int):boolean");
    }

    public static final boolean d(int i, n05 n05Var, n05 n05Var2) {
        if (i == 3 || i == 4) {
            if (n05Var.d <= n05Var2.b || n05Var.b >= n05Var2.d) {
                return false;
            }
            return true;
        }
        if (i == 5 || i == 6) {
            if (n05Var.c <= n05Var2.a || n05Var.a >= n05Var2.c) {
                return false;
            }
            return true;
        }
        ze0.m("This function should only be used for 2-D focus search");
        return false;
    }

    public static final long e(int i, int i2, gi6 gi6Var) {
        boolean z;
        l13 l13Var;
        long a;
        vx2 vx2Var;
        ei6 ei6Var;
        if (i == -1) {
            return (i2 << 32) | 4294967295L;
        }
        if (i > i2) {
            z = true;
        } else {
            z = false;
        }
        he1 he1Var = gi6Var.c;
        if (he1Var != null && (ei6Var = (ei6) he1Var.getValue()) != null) {
            l13Var = ei6Var.b;
        } else {
            l13Var = null;
        }
        if (l13Var != null) {
            a = l13Var.a(i, false);
        } else {
            a = fy5.a(i, i);
        }
        long f = gi6Var.f(a);
        if (nd6.d(a) && nd6.d(f)) {
            vx2Var = vx2.x;
        } else if (!nd6.d(a) && !nd6.d(f)) {
            vx2Var = vx2.z;
        } else if (nd6.d(a) && !nd6.d(f)) {
            vx2Var = vx2.y;
        } else {
            vx2Var = vx2.A;
        }
        int ordinal = vx2Var.ordinal();
        m47 m47Var = m47.y;
        m47 m47Var2 = m47.x;
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal == 3) {
                        return (i << 32) | 4294967295L;
                    }
                    ze0.l();
                    return 0L;
                }
                if (z) {
                    return h41.l((int) (f & 4294967295L), m47Var2);
                }
                return h41.l((int) (f >> 32), m47Var);
            }
            if (z) {
                if (i == ((int) (f >> 32))) {
                    return h41.l(i, m47Var2);
                }
                return h41.l((int) (f & 4294967295L), m47Var);
            }
            if (i == ((int) (f & 4294967295L))) {
                return h41.l(i, m47Var);
            }
            return h41.l((int) (f >> 32), m47Var2);
        }
        if (z) {
            m47Var = m47Var2;
        }
        return h41.l(i, m47Var);
    }

    public static final void f(h82 h82Var, z44 z44Var) {
        if (!h82Var.x.K) {
            ez2.b("visitChildren called on an unattached node");
        }
        z44 z44Var2 = new z44(new xz3[16], 0);
        xz3 xz3Var = h82Var.x;
        xz3 xz3Var2 = xz3Var.C;
        if (xz3Var2 == null) {
            wc7.f(z44Var2, xz3Var);
        } else {
            z44Var2.b(xz3Var2);
        }
        while (true) {
            int i = z44Var2.z;
            if (i != 0) {
                xz3 xz3Var3 = (xz3) z44Var2.m(i - 1);
                if ((xz3Var3.A & 1024) == 0) {
                    wc7.f(z44Var2, xz3Var3);
                } else {
                    while (true) {
                        if (xz3Var3 == null) {
                            break;
                        }
                        if ((xz3Var3.z & 1024) != 0) {
                            z44 z44Var3 = null;
                            while (xz3Var3 != null) {
                                if (xz3Var3 instanceof h82) {
                                    h82 h82Var2 = (h82) xz3Var3;
                                    if (h82Var2.K && !wc7.O(h82Var2).n0) {
                                        if (h82Var2.c1().a) {
                                            z44Var.b(h82Var2);
                                        } else {
                                            f(h82Var2, z44Var);
                                        }
                                    }
                                } else if ((xz3Var3.z & 1024) != 0 && (xz3Var3 instanceof zc1)) {
                                    int i2 = 0;
                                    for (xz3 xz3Var4 = ((zc1) xz3Var3).M; xz3Var4 != null; xz3Var4 = xz3Var4.C) {
                                        if ((xz3Var4.z & 1024) != 0) {
                                            i2++;
                                            if (i2 == 1) {
                                                xz3Var3 = xz3Var4;
                                            } else {
                                                if (z44Var3 == null) {
                                                    z44Var3 = new z44(new xz3[16], 0);
                                                }
                                                if (xz3Var3 != null) {
                                                    z44Var3.b(xz3Var3);
                                                    xz3Var3 = null;
                                                }
                                                z44Var3.b(xz3Var4);
                                            }
                                        }
                                    }
                                    if (i2 == 1) {
                                    }
                                }
                                xz3Var3 = wc7.J(z44Var3);
                            }
                        } else {
                            xz3Var3 = xz3Var3.C;
                        }
                    }
                }
            } else {
                return;
            }
        }
    }

    public static final h82 g(z44 z44Var, n05 n05Var, int i) {
        n05 j;
        h82 h82Var = null;
        if (i == 3) {
            j = n05Var.j((n05Var.c - n05Var.a) + 1.0f, 0.0f);
        } else if (i == 4) {
            j = n05Var.j(-((n05Var.c - n05Var.a) + 1.0f), 0.0f);
        } else if (i == 5) {
            j = n05Var.j(0.0f, (n05Var.d - n05Var.b) + 1.0f);
        } else if (i == 6) {
            j = n05Var.j(0.0f, -((n05Var.d - n05Var.b) + 1.0f));
        } else {
            ze0.m("This function should only be used for 2-D focus search");
            return null;
        }
        Object[] objArr = z44Var.x;
        int i2 = z44Var.z;
        for (int i3 = 0; i3 < i2; i3++) {
            h82 h82Var2 = (h82) objArr[i3];
            if (bb4.J(h82Var2)) {
                n05 A = bb4.A(h82Var2);
                if (l(A, j, n05Var, i)) {
                    h82Var = h82Var2;
                    j = A;
                }
            }
        }
        return h82Var;
    }

    public static final boolean h(h82 h82Var, int i, ub2 ub2Var) {
        n05 n05Var;
        Object obj;
        z44 z44Var = new z44(new h82[16], 0);
        f(h82Var, z44Var);
        int i2 = z44Var.z;
        if (i2 <= 1) {
            if (i2 == 0) {
                obj = null;
            } else {
                obj = z44Var.x[0];
            }
            h82 h82Var2 = (h82) obj;
            if (h82Var2 != null) {
                return ((Boolean) ub2Var.invoke(h82Var2)).booleanValue();
            }
        } else {
            if (i == 7) {
                i = 4;
            }
            if (i == 4 || i == 6) {
                n05 A = bb4.A(h82Var);
                float f = A.a;
                float f2 = A.b;
                n05Var = new n05(f, f2, f, f2);
            } else if (i == 3 || i == 5) {
                n05 A2 = bb4.A(h82Var);
                float f3 = A2.c;
                float f4 = A2.d;
                n05Var = new n05(f3, f4, f3, f4);
            } else {
                ze0.m("This function should only be used for 2-D focus search");
                return false;
            }
            h82 g = g(z44Var, n05Var, i);
            if (g != null) {
                return ((Boolean) ub2Var.invoke(g)).booleanValue();
            }
        }
        return false;
    }

    public static final boolean i(int i, bg bgVar, h82 h82Var, n05 n05Var) {
        if (o(i, bgVar, h82Var, n05Var)) {
            return true;
        }
        Boolean bool = (Boolean) bb4.O(h82Var, i, new wp0(((r72) ((oa) wc7.P(h82Var)).getFocusOwner()).g(), h82Var, n05Var, i, bgVar));
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public static final boolean j(Spanned spanned, Class cls) {
        if (spanned.nextSpanTransition(-1, spanned.length(), cls) != spanned.length()) {
            return true;
        }
        return false;
    }

    public static final int k(int i, int i2) {
        return (i >> i2) & 31;
    }

    public static final boolean l(n05 n05Var, n05 n05Var2, n05 n05Var3, int i) {
        if (m(i, n05Var, n05Var3)) {
            if (m(i, n05Var2, n05Var3) && !c(n05Var3, n05Var, n05Var2, i)) {
                if (!c(n05Var3, n05Var2, n05Var, i) && n(i, n05Var3, n05Var) < n(i, n05Var3, n05Var2)) {
                    return true;
                }
                return false;
            }
            return true;
        }
        return false;
    }

    public static final boolean m(int i, n05 n05Var, n05 n05Var2) {
        if (i == 3) {
            float f = n05Var2.c;
            float f2 = n05Var2.a;
            float f3 = n05Var.c;
            if ((f <= f3 && f2 < f3) || f2 <= n05Var.a) {
                return false;
            }
            return true;
        }
        if (i == 4) {
            float f4 = n05Var2.a;
            float f5 = n05Var2.c;
            float f6 = n05Var.a;
            if ((f4 >= f6 && f5 > f6) || f5 >= n05Var.c) {
                return false;
            }
            return true;
        }
        if (i == 5) {
            float f7 = n05Var2.d;
            float f8 = n05Var2.b;
            float f9 = n05Var.d;
            if ((f7 <= f9 && f8 < f9) || f8 <= n05Var.b) {
                return false;
            }
            return true;
        }
        if (i == 6) {
            float f10 = n05Var2.b;
            float f11 = n05Var2.d;
            float f12 = n05Var.b;
            if ((f10 >= f12 && f11 > f12) || f11 >= n05Var.d) {
                return false;
            }
            return true;
        }
        ze0.m("This function should only be used for 2-D focus search");
        return false;
    }

    public static final long n(int i, n05 n05Var, n05 n05Var2) {
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        if (i == 3) {
            f = n05Var.a;
            f2 = n05Var2.c;
        } else if (i == 4) {
            f = n05Var2.a;
            f2 = n05Var.c;
        } else if (i == 5) {
            f = n05Var.b;
            f2 = n05Var2.d;
        } else if (i == 6) {
            f = n05Var2.b;
            f2 = n05Var.d;
        } else {
            ze0.m("This function should only be used for 2-D focus search");
            return 0L;
        }
        float f6 = f - f2;
        if (f6 < 0.0f) {
            f6 = 0.0f;
        }
        long j = f6;
        if (i == 3 || i == 4) {
            float f7 = n05Var.b;
            f3 = ((n05Var.d - f7) / 2.0f) + f7;
            f4 = n05Var2.b;
            f5 = n05Var2.d;
        } else if (i == 5 || i == 6) {
            float f8 = n05Var.a;
            f3 = ((n05Var.c - f8) / 2.0f) + f8;
            f4 = n05Var2.a;
            f5 = n05Var2.c;
        } else {
            ze0.m("This function should only be used for 2-D focus search");
            return 0L;
        }
        long j2 = f3 - (((f5 - f4) / 2.0f) + f4);
        return (j2 * j2) + (13 * j * j);
    }

    public static final boolean o(int i, bg bgVar, h82 h82Var, n05 n05Var) {
        h82 g;
        z44 z44Var = new z44(new h82[16], 0);
        if (!h82Var.x.K) {
            ez2.b("visitChildren called on an unattached node");
        }
        z44 z44Var2 = new z44(new xz3[16], 0);
        xz3 xz3Var = h82Var.x;
        xz3 xz3Var2 = xz3Var.C;
        if (xz3Var2 == null) {
            wc7.f(z44Var2, xz3Var);
        } else {
            z44Var2.b(xz3Var2);
        }
        while (true) {
            int i2 = z44Var2.z;
            if (i2 == 0) {
                break;
            }
            xz3 xz3Var3 = (xz3) z44Var2.m(i2 - 1);
            if ((xz3Var3.A & 1024) == 0) {
                wc7.f(z44Var2, xz3Var3);
            } else {
                while (true) {
                    if (xz3Var3 == null) {
                        break;
                    }
                    if ((xz3Var3.z & 1024) != 0) {
                        z44 z44Var3 = null;
                        while (xz3Var3 != null) {
                            if (xz3Var3 instanceof h82) {
                                h82 h82Var2 = (h82) xz3Var3;
                                if (h82Var2.K) {
                                    z44Var.b(h82Var2);
                                }
                            } else if ((xz3Var3.z & 1024) != 0 && (xz3Var3 instanceof zc1)) {
                                int i3 = 0;
                                for (xz3 xz3Var4 = ((zc1) xz3Var3).M; xz3Var4 != null; xz3Var4 = xz3Var4.C) {
                                    if ((xz3Var4.z & 1024) != 0) {
                                        i3++;
                                        if (i3 == 1) {
                                            xz3Var3 = xz3Var4;
                                        } else {
                                            if (z44Var3 == null) {
                                                z44Var3 = new z44(new xz3[16], 0);
                                            }
                                            if (xz3Var3 != null) {
                                                z44Var3.b(xz3Var3);
                                                xz3Var3 = null;
                                            }
                                            z44Var3.b(xz3Var4);
                                        }
                                    }
                                }
                                if (i3 == 1) {
                                }
                            }
                            xz3Var3 = wc7.J(z44Var3);
                        }
                    } else {
                        xz3Var3 = xz3Var3.C;
                    }
                }
            }
        }
        while (z44Var.z != 0 && (g = g(z44Var, n05Var, i)) != null) {
            if (g.c1().a) {
                return ((Boolean) bgVar.invoke(g)).booleanValue();
            }
            if (i(i, bgVar, g, n05Var)) {
                return true;
            }
            z44Var.k(g);
        }
        return false;
    }

    public static final Boolean p(int i, bg bgVar, h82 h82Var, n05 n05Var) {
        int ordinal = h82Var.f1().ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal == 3) {
                        if (h82Var.c1().a) {
                            return (Boolean) bgVar.invoke(h82Var);
                        }
                        if (n05Var == null) {
                            return Boolean.valueOf(h(h82Var, i, bgVar));
                        }
                        return Boolean.valueOf(o(i, bgVar, h82Var, n05Var));
                    }
                    ze0.l();
                    return null;
                }
            } else {
                h82 C = bb4.C(h82Var);
                if (C != null) {
                    int ordinal2 = C.f1().ordinal();
                    if (ordinal2 != 0) {
                        if (ordinal2 != 1) {
                            if (ordinal2 != 2) {
                                if (ordinal2 != 3) {
                                    ze0.l();
                                    return null;
                                }
                                ze0.m("ActiveParent must have a focusedChild");
                                return null;
                            }
                        } else {
                            Boolean p = p(i, bgVar, C, n05Var);
                            if (!a34.i(p, Boolean.FALSE)) {
                                return p;
                            }
                            if (n05Var == null) {
                                if (C.f1() == d82.y) {
                                    h82 y = bb4.y(C);
                                    if (y != null) {
                                        n05Var = bb4.A(y);
                                    } else {
                                        ze0.m("ActiveParent must have a focusedChild");
                                        return null;
                                    }
                                } else {
                                    ze0.m("Searching for active node in inactive hierarchy");
                                    return null;
                                }
                            }
                            return Boolean.valueOf(i(i, bgVar, h82Var, n05Var));
                        }
                    }
                    if (n05Var == null) {
                        n05Var = bb4.A(C);
                    }
                    return Boolean.valueOf(i(i, bgVar, h82Var, n05Var));
                }
                ze0.m("ActiveParent must have a focusedChild");
                return null;
            }
        }
        return Boolean.valueOf(h(h82Var, i, bgVar));
    }

    public static int q(int i) {
        if (i == 0) {
            return 1;
        }
        if (i == 1) {
            return 2;
        }
        if (i == 2) {
            return 3;
        }
        if (i == 3) {
            return 4;
        }
        if (i != 4) {
            return 0;
        }
        return 5;
    }
}
