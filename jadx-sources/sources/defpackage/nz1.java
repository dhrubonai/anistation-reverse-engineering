package defpackage;

import com.anistation.android.R;
import com.anistation.navigation.Route;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public abstract class nz1 {
    public static final void a(final boolean z, final boolean z2, final ub2 ub2Var, final boolean z3, final ub2 ub2Var2, final sb2 sb2Var, kd2 kd2Var, final int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        boolean z4;
        int i8;
        boolean z5;
        boolean z6;
        ub2Var.getClass();
        ub2Var2.getClass();
        kd2Var.f0(1488435946);
        if (kd2Var.g(z)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i9 = i | i2;
        if (kd2Var.g(z2)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i10 = i9 | i3;
        if (kd2Var.h(ub2Var)) {
            i4 = 256;
        } else {
            i4 = 128;
        }
        int i11 = i10 | i4;
        if (kd2Var.g(z3)) {
            i5 = 2048;
        } else {
            i5 = 1024;
        }
        int i12 = i11 | i5;
        if (kd2Var.h(ub2Var2)) {
            i6 = 16384;
        } else {
            i6 = 8192;
        }
        int i13 = i12 | i6;
        if (kd2Var.h(sb2Var)) {
            i7 = 131072;
        } else {
            i7 = 65536;
        }
        int i14 = i13 | i7;
        if ((i14 & 74899) != 74898) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (kd2Var.V(i14 & 1, z4)) {
            yz3 h = bx7.h(ar5.c, ((mp0) kd2Var.j(op0.a)).n, io3.h);
            xp0 a = vp0.a(x97.z, pk2.K, kd2Var, 0);
            int hashCode = Long.hashCode(kd2Var.T);
            al4 l = kd2Var.l();
            yz3 E = o80.E(kd2Var, h);
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
            Route.Settings settings = Route.Settings.INSTANCE;
            String f = lz5.f(R.string.experimental_settings, kd2Var);
            Object Q = kd2Var.Q();
            if (Q == au0.a) {
                Q = new vj1((byte) 9);
                kd2Var.n0(Q);
            }
            aj.a(settings, null, null, f, true, false, (sb2) Q, null, sb2Var, kd2Var, ((i14 << 9) & 234881024) | 1794054, 134);
            String f2 = lz5.f(R.string.discord_rich_presence, kd2Var);
            if (z) {
                i8 = R.string.discord_rich_presence_summary;
            } else {
                i8 = R.string.discord_rich_presence_unavailable_summary;
            }
            String f3 = lz5.f(i8, kd2Var);
            vh4 vh4Var = new vh4(18.0f, 10.0f, 16.0f, 15.0f);
            if (z && z2) {
                z5 = true;
            } else {
                z5 = false;
            }
            oi4.f(f2, f3, R.drawable.discord, z5, ub2Var, null, z, vh4Var, kd2Var, (57344 & (i14 << 6)) | ((i14 << 18) & 3670016), 32);
            String f4 = lz5.f(R.string.discord_share_watching_details, kd2Var);
            String f5 = lz5.f(R.string.discord_share_watching_details_summary, kd2Var);
            if (z && z2) {
                z6 = true;
            } else {
                z6 = false;
            }
            oi4.f(f4, f5, R.drawable.share, z3, ub2Var2, null, z6, null, kd2Var, i14 & 64512, 160);
            kd2Var.q(true);
        } else {
            kd2Var.Y();
        }
        zz4 u = kd2Var.u();
        if (u != null) {
            u.d = new ic2(z, z2, ub2Var, z3, ub2Var2, sb2Var, i) { // from class: mz1
                public final /* synthetic */ boolean A;
                public final /* synthetic */ ub2 B;
                public final /* synthetic */ sb2 C;
                public final /* synthetic */ boolean x;
                public final /* synthetic */ boolean y;
                public final /* synthetic */ ub2 z;

                @Override // defpackage.ic2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int N = kb0.N(1);
                    nz1.a(this.x, this.y, this.z, this.A, this.B, this.C, (kd2) obj, N);
                    return pn6.a;
                }
            };
        }
    }
}
