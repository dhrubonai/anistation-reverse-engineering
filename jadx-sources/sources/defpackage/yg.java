package defpackage;

import com.anistation.android.R;
import com.anistation.model.connectivity.NetworkState;
import com.anistation.navigation.Route;
import java.util.List;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public abstract class yg {
    public static final void a(final Route route, final ub2 ub2Var, final float f, final ic2 ic2Var, NetworkState networkState, boolean z, yz3 yz3Var, final ub2 ub2Var2, kd2 kd2Var, final int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        boolean z2;
        final NetworkState networkState2;
        kd2 kd2Var2;
        yz3 yz3Var2;
        pi4 pi4Var;
        boolean z3;
        boolean z4;
        final boolean z5 = z;
        route.getClass();
        ub2Var.getClass();
        ic2Var.getClass();
        networkState.getClass();
        kd2Var.f0(-2018588097);
        if (kd2Var.f(route)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i8 = i | i2;
        if (kd2Var.h(ub2Var)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i9 = i8 | i3;
        if (kd2Var.c(f)) {
            i4 = 256;
        } else {
            i4 = 128;
        }
        int i10 = i9 | i4;
        if (kd2Var.d(networkState.ordinal())) {
            i5 = 16384;
        } else {
            i5 = 8192;
        }
        int i11 = i10 | i5;
        if (kd2Var.g(z5)) {
            i6 = 131072;
        } else {
            i6 = 65536;
        }
        int i12 = i11 | i6 | 1572864;
        if (kd2Var.h(ub2Var2)) {
            i7 = 8388608;
        } else {
            i7 = 4194304;
        }
        int i13 = i12 | i7;
        if ((4793491 & i13) != 4793490) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (kd2Var.V(i13 & 1, z2)) {
            List I = te4.I(new t70(Route.Home.INSTANCE, R.string.home, R.drawable.home, R.drawable.home_filled), new t70(Route.Schedule.INSTANCE, R.string.schedule, R.drawable.schedule, R.drawable.schedule_filled), new t70(Route.MyList.INSTANCE, R.string.my_list, R.drawable.my_list, R.drawable.my_list_filled), new t70(Route.Downloads.INSTANCE, R.string.downloads, R.drawable.download, R.drawable.downloads_filled), new t70(Route.Settings.INSTANCE, R.string.settings, R.drawable.settings, R.drawable.settings_filled));
            Object Q = kd2Var.Q();
            q18 q18Var = au0.a;
            if (Q == q18Var) {
                Q = new pi4(0.0f);
                kd2Var.n0(Q);
            }
            pi4 pi4Var2 = (pi4) Q;
            Object Q2 = kd2Var.Q();
            if (Q2 == q18Var) {
                Q2 = new pi4(0.0f);
                kd2Var.n0(Q2);
            }
            pi4 pi4Var3 = (pi4) Q2;
            Float valueOf = Float.valueOf(pi4Var2.h());
            Float valueOf2 = Float.valueOf(pi4Var3.h());
            Object Q3 = kd2Var.Q();
            if (Q3 == q18Var) {
                Q3 = new xg(ic2Var, pi4Var2, pi4Var3, null, (byte) 0);
                pi4Var = pi4Var2;
                kd2Var.n0(Q3);
            } else {
                pi4Var = pi4Var2;
            }
            db.g(valueOf, valueOf2, (ic2) Q3, kd2Var);
            yz3Var2 = vz3.x;
            yz3 c = ar5.c(yz3Var2, 1.0f);
            xp0 a = vp0.a(x97.z, pk2.K, kd2Var, 0);
            int hashCode = Long.hashCode(kd2Var.T);
            al4 l = kd2Var.l();
            yz3 E = o80.E(kd2Var, c);
            tt0.d.getClass();
            kd2Var.h0();
            boolean z6 = kd2Var.S;
            t53 t53Var = za3.p0;
            if (z6) {
                kd2Var.k(t53Var);
            } else {
                kd2Var.q0();
            }
            st0 st0Var = p7.F;
            ss5.i(st0Var, kd2Var, a);
            ys0 ys0Var = p7.E;
            ss5.i(ys0Var, kd2Var, l);
            Integer valueOf3 = Integer.valueOf(hashCode);
            st0 st0Var2 = p7.G;
            ss5.i(st0Var2, kd2Var, valueOf3);
            ss5.h(kd2Var);
            ys0 ys0Var2 = p7.D;
            ss5.i(ys0Var2, kd2Var, E);
            yz3 c2 = ar5.c(yz3Var2, 1.0f);
            Object Q4 = kd2Var.Q();
            if (Q4 == q18Var) {
                Q4 = new sg(pi4Var, (byte) 0);
                kd2Var.n0(Q4);
            }
            yz3 D = m37.D(c2, (ub2) Q4);
            if ((i13 & 896) == 256) {
                z3 = true;
            } else {
                z3 = false;
            }
            Object Q5 = kd2Var.Q();
            if (!z3 && Q5 != q18Var) {
                z4 = false;
            } else {
                z4 = false;
                Q5 = new tg(f, (byte) 0);
                kd2Var.n0(Q5);
            }
            l36.a(io3.O(D, (ub2) Q5), null, ((mp0) kd2Var.j(op0.a)).n, 0L, 0.0f, 0.0f, null, nx7.R(-597237234, new fj(I, route, ub2Var2, ub2Var, (byte) 3), kd2Var), kd2Var, 12582912, 122);
            kd2Var2 = kd2Var;
            yz3 c3 = ar5.c(yz3Var2, 1.0f);
            Object Q6 = kd2Var2.Q();
            if (Q6 == q18Var) {
                Q6 = new sg(pi4Var3, (byte) 1);
                kd2Var2.n0(Q6);
            }
            yz3 D2 = m37.D(c3, (ub2) Q6);
            vo3 c4 = b90.c(pk2.y, false);
            int hashCode2 = Long.hashCode(kd2Var2.T);
            al4 l2 = kd2Var2.l();
            yz3 E2 = o80.E(kd2Var2, D2);
            kd2Var2.h0();
            if (kd2Var2.S) {
                kd2Var2.k(t53Var);
            } else {
                kd2Var2.q0();
            }
            ss5.i(st0Var, kd2Var2, c4);
            ss5.i(ys0Var, kd2Var2, l2);
            h11.q(hashCode2, kd2Var2, st0Var2, kd2Var2);
            ss5.i(ys0Var2, kd2Var2, E2);
            networkState2 = networkState;
            z5 = z;
            m37.a(networkState2, z5, null, kd2Var2, (i13 >> 12) & 126);
            kd2Var2.q(true);
            kd2Var2.q(true);
        } else {
            networkState2 = networkState;
            kd2Var2 = kd2Var;
            kd2Var2.Y();
            yz3Var2 = yz3Var;
        }
        zz4 u = kd2Var2.u();
        if (u != null) {
            final yz3 yz3Var3 = yz3Var2;
            u.d = new ic2(ub2Var, f, ic2Var, networkState2, z5, yz3Var3, ub2Var2, i) { // from class: ug
                public final /* synthetic */ ic2 A;
                public final /* synthetic */ NetworkState B;
                public final /* synthetic */ boolean C;
                public final /* synthetic */ yz3 D;
                public final /* synthetic */ ub2 E;
                public final /* synthetic */ ub2 y;
                public final /* synthetic */ float z;

                @Override // defpackage.ic2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int N = kb0.N(3073);
                    yg.a(Route.this, this.y, this.z, this.A, this.B, this.C, this.D, this.E, (kd2) obj, N);
                    return pn6.a;
                }
            };
        }
    }

    public static final void b(t70 t70Var, boolean z, ub2 ub2Var, kd2 kd2Var, int i) {
        int i2;
        int i3;
        int i4;
        boolean z2;
        boolean z3;
        boolean z4;
        int i5;
        kd2 kd2Var2 = kd2Var;
        int i6 = t70Var.b;
        kd2Var2.f0(-1589905247);
        if (kd2Var2.f(t70Var)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i7 = i | i2;
        if (kd2Var2.g(z)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i8 = i7 | i3;
        if (kd2Var2.h(ub2Var)) {
            i4 = 256;
        } else {
            i4 = 128;
        }
        int i9 = i8 | i4;
        if ((i9 & 147) != 146) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (kd2Var2.V(i9 & 1, z2)) {
            long j = ((mp0) kd2Var2.j(op0.a)).o;
            yz3 T = n77.T(ar5.c(vz3.x, 1.0f), 0.0f, 5.0f, 1);
            if ((i9 & 896) == 256) {
                z3 = true;
            } else {
                z3 = false;
            }
            if ((i9 & 14) != 4) {
                z4 = false;
            } else {
                z4 = true;
            }
            boolean z5 = z4 | z3;
            Object Q = kd2Var2.Q();
            if (z5 || Q == au0.a) {
                Q = new n(ub2Var, t70Var, (byte) 5);
                kd2Var2.n0(Q);
            }
            yz3 A = kb0.A(T, false, null, null, false, (sb2) Q, kd2Var, 3462, 25);
            xp0 a = vp0.a(new vr(2.0f, true, new ze0((byte) 6)), pk2.L, kd2Var, 54);
            int hashCode = Long.hashCode(kd2Var.T);
            al4 l = kd2Var.l();
            yz3 E = o80.E(kd2Var, A);
            tt0.d.getClass();
            kd2Var.h0();
            if (kd2Var.S) {
                kd2Var.k(za3.p0);
            } else {
                kd2Var.q0();
            }
            ss5.i(p7.F, kd2Var, a);
            ss5.i(p7.E, kd2Var, l);
            ss5.i(p7.G, kd2Var, Integer.valueOf(hashCode));
            ss5.h(kd2Var);
            ss5.i(p7.D, kd2Var, E);
            if (z) {
                i5 = t70Var.d;
            } else {
                i5 = t70Var.c;
            }
            yt2.a(w65.H(i5, kd2Var, 0), lz5.f(i6, kd2Var), null, j, kd2Var, 8, 4);
            String f = lz5.f(i6, kd2Var);
            ud1 ud1Var = (ud1) kd2Var.j(bv0.h);
            yc6.b(f, null, j, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, xd6.a(((nl6) kd2Var.j(pl6.a)).o, ud1Var.r(11.0f), null, null, hz5.g(0), null, ud1Var.r(12.0f), null, 16646013), kd2Var, 0, 3072, 122874);
            kd2Var2 = kd2Var;
            kd2Var2.q(true);
        } else {
            kd2Var2.Y();
        }
        zz4 u = kd2Var2.u();
        if (u != null) {
            u.d = new wg(t70Var, z, ub2Var, i);
        }
    }
}
