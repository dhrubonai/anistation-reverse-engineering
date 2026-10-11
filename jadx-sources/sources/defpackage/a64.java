package defpackage;

import com.anistation.android.R;
import com.anistation.navigation.Route;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public abstract class a64 {
    public static final void a(final um6 um6Var, final ub2 ub2Var, final ub2 ub2Var2, final sb2 sb2Var, wc3 wc3Var, kd2 kd2Var, final int i) {
        int i2;
        int i3;
        boolean z;
        final wc3 wc3Var2;
        zz4 u;
        ic2 ic2Var;
        int i4;
        wc3 a;
        int i5;
        int i6;
        int i7;
        um6Var.getClass();
        ub2Var.getClass();
        ub2Var2.getClass();
        sb2Var.getClass();
        kd2Var.f0(-1725403829);
        if (kd2Var.S) {
            i2 = -kd2Var.I.v;
        } else {
            i2 = kd2Var.G.i;
        }
        int i8 = i2;
        if (kd2Var.h(um6Var)) {
            i3 = 4;
        } else {
            i3 = 2;
        }
        int i9 = i3 | i;
        if ((i & 48) == 0) {
            if (kd2Var.h(ub2Var)) {
                i7 = 32;
            } else {
                i7 = 16;
            }
            i9 |= i7;
        }
        if ((i & 384) == 0) {
            if (kd2Var.h(ub2Var2)) {
                i6 = 256;
            } else {
                i6 = 128;
            }
            i9 |= i6;
        }
        if ((i & 3072) == 0) {
            if (kd2Var.h(sb2Var)) {
                i5 = 2048;
            } else {
                i5 = 1024;
            }
            i9 |= i5;
        }
        int i10 = i9 | 8192;
        if ((i10 & 9363) != 9362) {
            z = true;
        } else {
            z = false;
        }
        if (kd2Var.V(i10 & 1, z)) {
            kd2Var.a0();
            if ((i & 1) != 0 && !kd2Var.C()) {
                kd2Var.Y();
                i4 = i10 & (-57345);
                a = wc3Var;
            } else {
                i4 = i10 & (-57345);
                a = yc3.a(kd2Var);
            }
            kd2Var.r();
            Route.MyList myList = Route.MyList.INSTANCE;
            boolean f = kd2Var.f(a);
            Object Q = kd2Var.Q();
            if (f || Q == au0.a) {
                Q = new im1(a, null, (byte) 2);
                kd2Var.n0(Q);
            }
            k66.a(myList, (ub2) Q, kd2Var, 6);
            z22 z22Var = ar5.c;
            yz3 h = bx7.h(z22Var, ((mp0) kd2Var.j(op0.a)).n, io3.h);
            y50 y50Var = pk2.C;
            vo3 c = b90.c(y50Var, false);
            int hashCode = Long.hashCode(kd2Var.T);
            al4 l = kd2Var.l();
            yz3 E = o80.E(kd2Var, h);
            tt0.d.getClass();
            kd2Var.h0();
            boolean z2 = kd2Var.S;
            t53 t53Var = za3.p0;
            if (z2) {
                kd2Var.k(t53Var);
            } else {
                kd2Var.q0();
            }
            st0 st0Var = p7.F;
            ss5.i(st0Var, kd2Var, c);
            ys0 ys0Var = p7.E;
            ss5.i(ys0Var, kd2Var, l);
            Integer valueOf = Integer.valueOf(hashCode);
            st0 st0Var2 = p7.G;
            ss5.i(st0Var2, kd2Var, valueOf);
            ss5.h(kd2Var);
            ys0 ys0Var2 = p7.D;
            ss5.i(ys0Var2, kd2Var, E);
            kd2Var.e0(-1371862473);
            if (um6Var.a.isEmpty() && !um6Var.c) {
                kd2Var.e0(-1371966541);
                yz3 V = n77.V(z22Var, 0.0f, 0.0f, 0.0f, 5.0f, 7);
                xp0 a2 = vp0.a(x97.z, pk2.K, kd2Var, 0);
                final wc3 wc3Var3 = a;
                int hashCode2 = Long.hashCode(kd2Var.T);
                al4 l2 = kd2Var.l();
                yz3 E2 = o80.E(kd2Var, V);
                kd2Var.h0();
                int i11 = i4;
                if (kd2Var.S) {
                    kd2Var.k(t53Var);
                } else {
                    kd2Var.q0();
                }
                ss5.i(st0Var, kd2Var, a2);
                ss5.i(ys0Var, kd2Var, l2);
                h11.q(hashCode2, kd2Var, st0Var2, kd2Var);
                ss5.i(ys0Var2, kd2Var, E2);
                aj.a(myList, null, null, lz5.f(R.string.my_list, kd2Var), false, false, sb2Var, null, null, kd2Var, ((i11 << 9) & 3670016) | 6, 438);
                yz3 V2 = n77.V(ar5.c(new ob3(1.0f, true), 1.0f), 0.0f, 0.0f, 0.0f, 5.0f, 7);
                vo3 c2 = b90.c(y50Var, false);
                int hashCode3 = Long.hashCode(kd2Var.T);
                al4 l3 = kd2Var.l();
                yz3 E3 = o80.E(kd2Var, V2);
                kd2Var.h0();
                if (kd2Var.S) {
                    kd2Var.k(t53Var);
                } else {
                    kd2Var.q0();
                }
                ss5.i(st0Var, kd2Var, c2);
                ss5.i(ys0Var, kd2Var, l3);
                h11.q(hashCode3, kd2Var, st0Var2, kd2Var);
                ss5.i(ys0Var2, kd2Var, E3);
                h98.d(lz5.f(R.string.time_to_start_watching, kd2Var), lz5.f(R.string.your_list_is_a_blank_canvas, kd2Var), null, kd2Var, 0, 4);
                kd2Var.q(true);
                kd2Var.q(true);
                kd2Var.w(i8);
                u = kd2Var.u();
                if (u != null) {
                    final byte b = 1;
                    ic2Var = new ic2() { // from class: x54
                        @Override // defpackage.ic2
                        public final Object invoke(Object obj, Object obj2) {
                            byte b2 = b;
                            pn6 pn6Var = pn6.a;
                            short s = i;
                            switch (b2) {
                                case 0:
                                    ((Integer) obj2).getClass();
                                    int N = kb0.N(s | 1);
                                    a64.a(um6Var, ub2Var, ub2Var2, sb2Var, wc3Var3, (kd2) obj, N);
                                    return pn6Var;
                                default:
                                    ((Integer) obj2).getClass();
                                    int N2 = kb0.N(s | 1);
                                    a64.a(um6Var, ub2Var, ub2Var2, sb2Var, wc3Var3, (kd2) obj, N2);
                                    return pn6Var;
                            }
                        }
                    };
                    u.d = ic2Var;
                }
                return;
            }
            wc3 wc3Var4 = a;
            kd2Var.e0(-1370861391);
            kd2Var.q(false);
            x97.b(z22Var, null, nx7.R(257461799, new w54(um6Var, wc3Var4, sb2Var, ub2Var, ub2Var2), kd2Var), kd2Var, 3078, 6);
            kd2Var.q(false);
            kd2Var.q(true);
            wc3Var2 = wc3Var4;
        } else {
            kd2Var.Y();
            wc3Var2 = wc3Var;
        }
        u = kd2Var.u();
        if (u != null) {
            final byte b2 = 0;
            ic2Var = new ic2() { // from class: x54
                @Override // defpackage.ic2
                public final Object invoke(Object obj, Object obj2) {
                    byte b22 = b2;
                    pn6 pn6Var = pn6.a;
                    short s = i;
                    switch (b22) {
                        case 0:
                            ((Integer) obj2).getClass();
                            int N = kb0.N(s | 1);
                            a64.a(um6Var, ub2Var, ub2Var2, sb2Var, wc3Var2, (kd2) obj, N);
                            return pn6Var;
                        default:
                            ((Integer) obj2).getClass();
                            int N2 = kb0.N(s | 1);
                            a64.a(um6Var, ub2Var, ub2Var2, sb2Var, wc3Var2, (kd2) obj, N2);
                            return pn6Var;
                    }
                }
            };
            u.d = ic2Var;
        }
    }
}
