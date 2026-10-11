package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import com.anistation.android.R;
import com.anistation.model.github.DevProfile;
import com.anistation.navigation.Route;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public abstract class u {
    public static final void a(int i, String str, String str2, yz3 yz3Var, boolean z, sb2 sb2Var, kd2 kd2Var, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        boolean z2;
        yz3 yz3Var2;
        kd2Var.f0(1675156656);
        if (kd2Var.d(i)) {
            i3 = 4;
        } else {
            i3 = 2;
        }
        int i7 = i2 | i3;
        if (kd2Var.f(str)) {
            i4 = 32;
        } else {
            i4 = 16;
        }
        int i8 = i7 | i4;
        if (kd2Var.f(str2)) {
            i5 = 256;
        } else {
            i5 = 128;
        }
        int i9 = i8 | i5 | 3072;
        if (kd2Var.h(sb2Var)) {
            i6 = 131072;
        } else {
            i6 = 65536;
        }
        int i10 = i9 | i6;
        if ((74899 & i10) != 74898) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (kd2Var.V(i10 & 1, z2)) {
            b(i, str, str2, true, sb2Var, z, kd2Var, ((i10 >> 3) & 57344) | (i10 & 14) | 3072 | (i10 & 112) | (i10 & 896) | 1769472);
            yz3Var2 = vz3.x;
        } else {
            kd2Var.Y();
            yz3Var2 = yz3Var;
        }
        zz4 u = kd2Var.u();
        if (u != null) {
            u.d = new g(i, str, str2, yz3Var2, z, sb2Var, i2);
        }
    }

    public static final void b(final int i, final String str, final String str2, final boolean z, final sb2 sb2Var, final boolean z2, kd2 kd2Var, final int i2) {
        int i3;
        boolean z3;
        int i4;
        vz3 vz3Var;
        int i5;
        yz3 c;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        kd2 kd2Var2 = kd2Var;
        kd2Var2.f0(164211871);
        if ((i2 & 6) == 0) {
            if (kd2Var2.d(i)) {
                i12 = 4;
            } else {
                i12 = 2;
            }
            i3 = i12 | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            if (kd2Var2.f(str)) {
                i11 = 32;
            } else {
                i11 = 16;
            }
            i3 |= i11;
        }
        if ((i2 & 384) == 0) {
            if (kd2Var2.f(str2)) {
                i10 = 256;
            } else {
                i10 = 128;
            }
            i3 |= i10;
        }
        if ((i2 & 3072) == 0) {
            if (kd2Var2.g(z)) {
                i9 = 2048;
            } else {
                i9 = 1024;
            }
            i3 |= i9;
        }
        if ((i2 & 24576) == 0) {
            if (kd2Var2.h(sb2Var)) {
                i8 = 16384;
            } else {
                i8 = 8192;
            }
            i3 |= i8;
        }
        if ((196608 & i2) == 0) {
            if (kd2Var2.g(z2)) {
                i7 = 131072;
            } else {
                i7 = 65536;
            }
            i3 |= i7;
        }
        int i13 = i2 & 1572864;
        vz3 vz3Var2 = vz3.x;
        if (i13 == 0) {
            if (kd2Var2.f(vz3Var2)) {
                i6 = 1048576;
            } else {
                i6 = 524288;
            }
            i3 |= i6;
        }
        if ((599187 & i3) != 599186) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (kd2Var2.V(i3 & 1, z3)) {
            if (sb2Var != null) {
                kd2Var2.e0(68352895);
                i4 = i3;
                vz3Var = vz3Var2;
                i5 = 0;
                c = kb0.A(ar5.c(vz3Var2, 1.0f), false, null, null, false, sb2Var, kd2Var, (i3 << 6) & 3670016, 31);
                kd2Var2 = kd2Var;
                kd2Var2.q(false);
            } else {
                i4 = i3;
                vz3Var = vz3Var2;
                i5 = 0;
                kd2Var2.e0(68456156);
                kd2Var2.q(false);
                c = ar5.c(vz3Var, 1.0f);
            }
            tr trVar = x97.z;
            w50 w50Var = pk2.K;
            xp0 a = vp0.a(trVar, w50Var, kd2Var2, i5);
            int hashCode = Long.hashCode(kd2Var2.T);
            al4 l = kd2Var2.l();
            yz3 E = o80.E(kd2Var2, vz3Var);
            tt0.d.getClass();
            kd2Var2.h0();
            boolean z4 = kd2Var2.S;
            t53 t53Var = za3.p0;
            if (z4) {
                kd2Var2.k(t53Var);
            } else {
                kd2Var2.q0();
            }
            st0 st0Var = p7.F;
            ss5.i(st0Var, kd2Var2, a);
            ys0 ys0Var = p7.E;
            ss5.i(ys0Var, kd2Var2, l);
            Integer valueOf = Integer.valueOf(hashCode);
            st0 st0Var2 = p7.G;
            ss5.i(st0Var2, kd2Var2, valueOf);
            ss5.h(kd2Var2);
            ys0 ys0Var2 = p7.D;
            ss5.i(ys0Var2, kd2Var2, E);
            yz3 R = n77.R(c, 14.0f);
            z75 a2 = y75.a(x97.y, pk2.I, kd2Var2, 48);
            int hashCode2 = Long.hashCode(kd2Var2.T);
            al4 l2 = kd2Var2.l();
            yz3 E2 = o80.E(kd2Var2, R);
            kd2Var2.h0();
            if (kd2Var2.S) {
                kd2Var2.k(t53Var);
            } else {
                kd2Var2.q0();
            }
            ss5.i(st0Var, kd2Var2, a2);
            ss5.i(ys0Var, kd2Var2, l2);
            h11.q(hashCode2, kd2Var2, st0Var2, kd2Var2);
            ss5.i(ys0Var2, kd2Var2, E2);
            yz3 i14 = ar5.i(vz3Var, 42.0f);
            o75 o75Var = p75.a;
            tq1 tq1Var = op0.a;
            l36.a(i14, o75Var, ((mp0) kd2Var2.j(tq1Var)).r, 0L, 0.0f, 0.0f, null, nx7.R(1765467604, new r(i, (byte) 0), kd2Var2), kd2Var, 12582918, 120);
            ov5.a(kd2Var, ar5.l(vz3Var, 14.0f));
            ob3 ob3Var = new ob3(1.0f, true);
            xp0 a3 = vp0.a(new vr(5.0f, true, new ze0((byte) 6)), w50Var, kd2Var, 6);
            int hashCode3 = Long.hashCode(kd2Var.T);
            al4 l3 = kd2Var.l();
            yz3 E3 = o80.E(kd2Var, ob3Var);
            kd2Var.h0();
            if (kd2Var.S) {
                kd2Var.k(t53Var);
            } else {
                kd2Var.q0();
            }
            ss5.i(st0Var, kd2Var, a3);
            ss5.i(ys0Var, kd2Var, l3);
            h11.q(hashCode3, kd2Var, st0Var2, kd2Var);
            ss5.i(ys0Var2, kd2Var, E3);
            tq1 tq1Var2 = pl6.a;
            yc6.b(str, null, ((mp0) kd2Var.j(tq1Var)).o, 0L, s92.C, null, 0L, null, 0L, 0, false, 0, 0, ((nl6) kd2Var.j(tq1Var2)).j, kd2Var, ((i4 >> 3) & 14) | 1572864, 0, 131002);
            yc6.b(str2, null, ep0.b(0.75f, ((mp0) kd2Var.j(tq1Var)).o), 0L, null, null, 0L, null, 0L, 0, false, 0, 0, xd6.a(((nl6) kd2Var.j(tq1Var2)).k, 0L, null, null, 0L, null, hz5.g(20), null, 16646143), kd2Var, (i4 >> 6) & 14, 0, 131066);
            kd2Var2 = kd2Var;
            kd2Var2.q(true);
            if (z) {
                kd2Var2.e0(-1899456242);
                ov5.a(kd2Var2, ar5.l(vz3Var, 10.0f));
                yt2.a(w65.H(R.drawable.arrow_right, kd2Var2, 0), null, ar5.i(vz3Var, 20.0f), 0L, kd2Var, 440, 8);
                kd2Var2 = kd2Var;
                kd2Var2.q(false);
            } else {
                kd2Var2.e0(-1899184279);
                kd2Var2.q(false);
            }
            kd2Var2.q(true);
            if (z2) {
                kd2Var2.e0(-394762739);
                kb0.e(ar5.c(vz3Var, 1.0f), 0.0f, ep0.b(0.5f, ((mp0) kd2Var2.j(tq1Var)).r), kd2Var2, 6, 2);
                kd2Var2.q(false);
            } else {
                kd2Var2.e0(-394578227);
                kd2Var2.q(false);
            }
            kd2Var2.q(true);
        } else {
            kd2Var2.Y();
        }
        zz4 u = kd2Var2.u();
        if (u != null) {
            u.d = new ic2() { // from class: s
                @Override // defpackage.ic2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    u.b(i, str, str2, z, sb2Var, z2, (kd2) obj, kb0.N(i2 | 1));
                    return pn6.a;
                }
            };
        }
    }

    public static final void c(int i, kd2 kd2Var) {
        boolean z;
        byte b;
        kd2 kd2Var2 = kd2Var;
        kd2Var2.f0(948332976);
        if (i != 0) {
            z = true;
        } else {
            z = false;
        }
        if (kd2Var2.V(i & 1, z)) {
            vz3 vz3Var = vz3.x;
            yz3 V = n77.V(vz3Var, 20.0f, 0.0f, 20.0f, 10.0f, 2);
            w50 w50Var = pk2.L;
            xp0 a = vp0.a(new vr(15.0f, true, new ze0((byte) 6)), w50Var, kd2Var2, 54);
            int hashCode = Long.hashCode(kd2Var2.T);
            al4 l = kd2Var2.l();
            yz3 E = o80.E(kd2Var2, V);
            tt0.d.getClass();
            kd2Var2.h0();
            boolean z2 = kd2Var2.S;
            t53 t53Var = za3.p0;
            if (z2) {
                kd2Var2.k(t53Var);
            } else {
                kd2Var2.q0();
            }
            st0 st0Var = p7.F;
            ss5.i(st0Var, kd2Var2, a);
            ys0 ys0Var = p7.E;
            ss5.i(ys0Var, kd2Var2, l);
            Integer valueOf = Integer.valueOf(hashCode);
            st0 st0Var2 = p7.G;
            ss5.i(st0Var2, kd2Var2, valueOf);
            ss5.h(kd2Var2);
            ys0 ys0Var2 = p7.D;
            ss5.i(ys0Var2, kd2Var2, E);
            xp0 a2 = vp0.a(new vr(10.0f, true, new ze0((byte) 6)), w50Var, kd2Var2, 54);
            int hashCode2 = Long.hashCode(kd2Var2.T);
            al4 l2 = kd2Var2.l();
            yz3 E2 = o80.E(kd2Var2, vz3Var);
            kd2Var2.h0();
            if (kd2Var2.S) {
                kd2Var2.k(t53Var);
            } else {
                kd2Var2.q0();
            }
            ss5.i(st0Var, kd2Var2, a2);
            ss5.i(ys0Var, kd2Var2, l2);
            h11.q(hashCode2, kd2Var2, st0Var2, kd2Var2);
            ss5.i(ys0Var2, kd2Var2, E2);
            xh4 H = w65.H(R.drawable.logo, kd2Var2, 0);
            String f = lz5.f(R.string.app_name, kd2Var2);
            tq1 tq1Var = op0.a;
            yt2.a(H, f, ar5.i(vz3Var, 80.0f), ((mp0) kd2Var2.j(tq1Var)).o, kd2Var2, 392, 0);
            String f2 = lz5.f(R.string.app_name, kd2Var2);
            tq1 tq1Var2 = pl6.a;
            yc6.b(f2, null, ((mp0) kd2Var2.j(tq1Var)).o, 0L, s92.D, null, 0L, null, 0L, 0, false, 0, 0, ((nl6) kd2Var2.j(tq1Var2)).f, kd2Var, 1572864, 0, 131002);
            yc6.b(lz5.f(R.string.about_subtitle, kd2Var), null, ep0.b(0.75f, ((mp0) kd2Var.j(tq1Var)).o), 0L, null, null, 0L, new c86(3), 0L, 0, false, 0, 0, xd6.a(((nl6) kd2Var.j(tq1Var2)).k, 0L, null, null, 0L, null, hz5.g(20), null, 16646143), kd2Var, 0, 0, 130042);
            kd2Var2 = kd2Var;
            b = 1;
            kd2Var2.q(true);
            kd2Var2.q(true);
        } else {
            b = 1;
            kd2Var2.Y();
        }
        zz4 u = kd2Var2.u();
        if (u != null) {
            u.d = new vs0(i, b);
        }
    }

    public static final void d(final int i, final String str, final String str2, yz3 yz3Var, boolean z, kd2 kd2Var, final int i2, final int i3) {
        int i4;
        int i5;
        int i6;
        int i7;
        boolean z2;
        final boolean z3;
        kd2Var.f0(-1066244580);
        if (kd2Var.d(i)) {
            i4 = 4;
        } else {
            i4 = 2;
        }
        int i8 = i4 | i2;
        if (kd2Var.f(str)) {
            i5 = 32;
        } else {
            i5 = 16;
        }
        int i9 = i8 | i5;
        if (kd2Var.f(str2)) {
            i6 = 256;
        } else {
            i6 = 128;
        }
        int i10 = i9 | i6;
        int i11 = i10 | 3072;
        int i12 = i3 & 16;
        if (i12 != 0) {
            i11 = i10 | 27648;
        } else if ((i2 & 24576) == 0) {
            if (kd2Var.g(z)) {
                i7 = 16384;
            } else {
                i7 = 8192;
            }
            i11 |= i7;
        }
        if ((i11 & 9363) != 9362) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (kd2Var.V(i11 & 1, z2)) {
            if (i12 != 0) {
                z3 = true;
            } else {
                z3 = z;
            }
            b(i, str, str2, false, null, z3, kd2Var, (i11 & 14) | 27648 | (i11 & 112) | (i11 & 896) | ((i11 << 3) & 458752) | 1572864);
            yz3Var = vz3.x;
        } else {
            kd2Var.Y();
            z3 = z;
        }
        final yz3 yz3Var2 = yz3Var;
        zz4 u = kd2Var.u();
        if (u != null) {
            u.d = new ic2() { // from class: p
                @Override // defpackage.ic2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    u.d(i, str, str2, yz3Var2, z3, (kd2) obj, kb0.N(i2 | 1), i3);
                    return pn6.a;
                }
            };
        }
    }

    public static final void e(xm6 xm6Var, ub2 ub2Var, sb2 sb2Var, kd2 kd2Var, int i) {
        int i2;
        boolean z;
        xm6 xm6Var2;
        ub2 ub2Var2;
        sb2 sb2Var2;
        kd2 kd2Var2;
        int i3;
        int i4;
        String str = "Unknown";
        xm6Var.getClass();
        ub2Var.getClass();
        sb2Var.getClass();
        kd2Var.f0(-1296702422);
        if (kd2Var.h(xm6Var)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i5 = i2 | i;
        if ((i & 48) == 0) {
            if (kd2Var.h(ub2Var)) {
                i4 = 32;
            } else {
                i4 = 16;
            }
            i5 |= i4;
        }
        if ((i & 384) == 0) {
            if (kd2Var.h(sb2Var)) {
                i3 = 256;
            } else {
                i3 = 128;
            }
            i5 |= i3;
        }
        if ((i5 & 147) != 146) {
            z = true;
        } else {
            z = false;
        }
        if (kd2Var.V(i5 & 1, z)) {
            yc5 d0 = n77.d0(kd2Var);
            wf wfVar = (wf) kd2Var.j(bv0.s);
            Context context = (Context) kd2Var.j(eb.b);
            try {
                String str2 = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
                if (str2 != null) {
                    str = str2;
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
            z22 z22Var = ar5.c;
            yz3 k0 = n77.k0(bx7.h(z22Var, ((mp0) kd2Var.j(op0.a)).n, io3.h), d0, 14);
            vr vrVar = new vr(5.0f, true, new ze0((byte) 6));
            w50 w50Var = pk2.L;
            xp0 a = vp0.a(vrVar, w50Var, kd2Var, 54);
            int hashCode = Long.hashCode(kd2Var.T);
            al4 l = kd2Var.l();
            yz3 E = o80.E(kd2Var, k0);
            tt0.d.getClass();
            kd2Var.h0();
            boolean z2 = kd2Var.S;
            int i6 = i5;
            t53 t53Var = za3.p0;
            if (z2) {
                kd2Var.k(t53Var);
            } else {
                kd2Var.q0();
            }
            st0 st0Var = p7.F;
            ss5.i(st0Var, kd2Var, a);
            ys0 ys0Var = p7.E;
            ss5.i(ys0Var, kd2Var, l);
            Integer valueOf = Integer.valueOf(hashCode);
            st0 st0Var2 = p7.G;
            ss5.i(st0Var2, kd2Var, valueOf);
            ss5.h(kd2Var);
            ys0 ys0Var2 = p7.D;
            ss5.i(ys0Var2, kd2Var, E);
            String str3 = str;
            Route.About about = Route.About.INSTANCE;
            String f = lz5.f(R.string.about, kd2Var);
            Object Q = kd2Var.Q();
            if (Q == au0.a) {
                Q = new t((byte) 0);
                kd2Var.n0(Q);
            }
            aj.a(about, null, null, f, true, false, (sb2) Q, null, sb2Var, kd2Var, ((i6 << 18) & 234881024) | 1794054, 134);
            sb2Var2 = sb2Var;
            kd2Var2 = kd2Var;
            yz3 V = n77.V(z22Var, 15.0f, 0.0f, 15.0f, 15.0f, 2);
            byte b = 1;
            xp0 a2 = vp0.a(new vr(18.0f, true, new ze0((byte) 6)), w50Var, kd2Var2, 54);
            int hashCode2 = Long.hashCode(kd2Var2.T);
            al4 l2 = kd2Var2.l();
            yz3 E2 = o80.E(kd2Var2, V);
            kd2Var2.h0();
            if (kd2Var2.S) {
                kd2Var2.k(t53Var);
            } else {
                kd2Var2.q0();
            }
            ss5.i(st0Var, kd2Var2, a2);
            ss5.i(ys0Var, kd2Var2, l2);
            h11.q(hashCode2, kd2Var2, st0Var2, kd2Var2);
            ss5.i(ys0Var2, kd2Var2, E2);
            c(0, kd2Var2);
            xm6Var2 = xm6Var;
            f(lz5.f(R.string.developer, kd2Var2), null, nx7.R(1299020877, new h(xm6Var2, wfVar, b), kd2Var2), kd2Var2, 384);
            f(lz5.f(R.string.social, kd2Var2), null, nx7.R(-737389564, new fr5(wfVar, b), kd2Var2), kd2Var2, 384);
            f(lz5.f(R.string.made_for_anime_nights, kd2Var2), null, bb4.x, kd2Var2, 384);
            byte b2 = 0;
            f(lz5.f(R.string.app_info, kd2Var2), null, nx7.R(-2051219450, new h(str3, wfVar, b2), kd2Var2), kd2Var2, 384);
            ub2Var2 = ub2Var;
            f(lz5.f(R.string.support, kd2Var2), null, nx7.R(-560650745, new i(ub2Var2, b2), kd2Var2), kd2Var2, 384);
            f(lz5.f(R.string.legal_disclaimer, kd2Var2), null, bb4.y, kd2Var2, 384);
            kd2Var2.q(true);
            kd2Var2.q(true);
        } else {
            xm6Var2 = xm6Var;
            ub2Var2 = ub2Var;
            sb2Var2 = sb2Var;
            kd2Var2 = kd2Var;
            kd2Var2.Y();
        }
        zz4 u = kd2Var2.u();
        if (u != null) {
            u.d = new j(xm6Var2, ub2Var2, sb2Var2, i);
        }
    }

    public static final void f(String str, yz3 yz3Var, os0 os0Var, kd2 kd2Var, int i) {
        int i2;
        boolean z;
        os0 os0Var2;
        yz3 yz3Var2;
        kd2 kd2Var2 = kd2Var;
        kd2Var2.f0(1377442817);
        if (kd2Var2.f(str)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i3 = i | i2 | 48;
        if ((i3 & 147) != 146) {
            z = true;
        } else {
            z = false;
        }
        if (kd2Var2.V(i3 & 1, z)) {
            vz3 vz3Var = vz3.x;
            yz3 V = n77.V(ar5.c(vz3Var, 1.0f), 0.0f, 10.0f, 0.0f, 0.0f, 13);
            xp0 a = vp0.a(new vr(10.0f, true, new ze0((byte) 6)), pk2.K, kd2Var2, 6);
            int hashCode = Long.hashCode(kd2Var2.T);
            al4 l = kd2Var2.l();
            yz3 E = o80.E(kd2Var2, V);
            tt0.d.getClass();
            kd2Var2.h0();
            if (kd2Var2.S) {
                kd2Var2.k(za3.p0);
            } else {
                kd2Var2.q0();
            }
            ss5.i(p7.F, kd2Var2, a);
            ss5.i(p7.E, kd2Var2, l);
            ss5.i(p7.G, kd2Var2, Integer.valueOf(hashCode));
            ss5.h(kd2Var2);
            ss5.i(p7.D, kd2Var2, E);
            xd6 xd6Var = ((nl6) kd2Var2.j(pl6.a)).h;
            s92 s92Var = s92.C;
            tq1 tq1Var = op0.a;
            yc6.b(str, n77.T(vz3Var, 2.0f, 0.0f, 2), ((mp0) kd2Var2.j(tq1Var)).o, 0L, s92Var, null, 0L, null, 0L, 0, false, 0, 0, xd6Var, kd2Var, (i3 & 14) | 1572912, 0, 131000);
            kd2Var2 = kd2Var;
            os0Var2 = os0Var;
            l36.a(ar5.c(vz3Var, 1.0f), ((cn5) kd2Var2.j(dn5.a)).d, ((mp0) kd2Var2.j(tq1Var)).p, 0L, 0.0f, 0.0f, null, nx7.R(844410320, new k(os0Var2, (byte) 0), kd2Var2), kd2Var2, 12582912, 120);
            kd2Var2.q(true);
            yz3Var2 = vz3Var;
        } else {
            os0Var2 = os0Var;
            kd2Var2.Y();
            yz3Var2 = yz3Var;
        }
        zz4 u = kd2Var2.u();
        if (u != null) {
            u.d = new l(str, yz3Var2, os0Var2, i, (byte) 0);
        }
    }

    public static final void g(DevProfile devProfile, Context context, sb2 sb2Var, yz3 yz3Var, kd2 kd2Var, int i) {
        int i2;
        int i3;
        int i4;
        boolean z;
        yz3 yz3Var2;
        kd2 kd2Var2 = kd2Var;
        kd2Var2.f0(-1678876810);
        if (kd2Var2.h(devProfile)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i5 = i | i2;
        if (kd2Var2.h(context)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i6 = i5 | i3;
        if (kd2Var2.h(sb2Var)) {
            i4 = 256;
        } else {
            i4 = 128;
        }
        int i7 = i6 | i4 | 3072;
        if ((i7 & 1171) != 1170) {
            z = true;
        } else {
            z = false;
        }
        if (kd2Var2.V(i7 & 1, z)) {
            tr trVar = x97.z;
            w50 w50Var = pk2.K;
            xp0 a = vp0.a(trVar, w50Var, kd2Var2, 0);
            int hashCode = Long.hashCode(kd2Var2.T);
            al4 l = kd2Var2.l();
            vz3 vz3Var = vz3.x;
            yz3 E = o80.E(kd2Var2, vz3Var);
            tt0.d.getClass();
            kd2Var2.h0();
            boolean z2 = kd2Var2.S;
            t53 t53Var = za3.p0;
            if (z2) {
                kd2Var2.k(t53Var);
            } else {
                kd2Var2.q0();
            }
            st0 st0Var = p7.F;
            ss5.i(st0Var, kd2Var2, a);
            ys0 ys0Var = p7.E;
            ss5.i(ys0Var, kd2Var2, l);
            Integer valueOf = Integer.valueOf(hashCode);
            st0 st0Var2 = p7.G;
            ss5.i(st0Var2, kd2Var2, valueOf);
            ss5.h(kd2Var2);
            ys0 ys0Var2 = p7.D;
            ss5.i(ys0Var2, kd2Var2, E);
            yz3 S = n77.S(kb0.A(ar5.c(vz3Var, 1.0f), false, null, null, false, sb2Var, kd2Var2, (i7 << 12) & 3670016, 31), 14.0f, 14.0f);
            z75 a2 = y75.a(x97.y, pk2.I, kd2Var2, 48);
            int hashCode2 = Long.hashCode(kd2Var2.T);
            al4 l2 = kd2Var2.l();
            yz3 E2 = o80.E(kd2Var2, S);
            kd2Var2.h0();
            if (kd2Var2.S) {
                kd2Var2.k(t53Var);
            } else {
                kd2Var2.q0();
            }
            ss5.i(st0Var, kd2Var2, a2);
            ss5.i(ys0Var, kd2Var2, l2);
            h11.q(hashCode2, kd2Var2, st0Var2, kd2Var2);
            ss5.i(ys0Var2, kd2Var2, E2);
            yz3 i8 = ar5.i(vz3Var, 42.0f);
            o75 o75Var = p75.a;
            tq1 tq1Var = op0.a;
            l36.a(i8, o75Var, ((mp0) kd2Var2.j(tq1Var)).r, 0L, 0.0f, 0.0f, null, nx7.R(-681257631, new q(context, devProfile, (byte) 0), kd2Var2), kd2Var, 12582918, 120);
            ov5.a(kd2Var, ar5.l(vz3Var, 14.0f));
            ob3 ob3Var = new ob3(1.0f, true);
            xp0 a3 = vp0.a(new vr(5.0f, true, new ze0((byte) 6)), w50Var, kd2Var, 6);
            int hashCode3 = Long.hashCode(kd2Var.T);
            al4 l3 = kd2Var.l();
            yz3 E3 = o80.E(kd2Var, ob3Var);
            kd2Var.h0();
            if (kd2Var.S) {
                kd2Var.k(t53Var);
            } else {
                kd2Var.q0();
            }
            ss5.i(st0Var, kd2Var, a3);
            ss5.i(ys0Var, kd2Var, l3);
            h11.q(hashCode3, kd2Var, st0Var2, kd2Var);
            ss5.i(ys0Var2, kd2Var, E3);
            String name = devProfile.getName();
            tq1 tq1Var2 = pl6.a;
            yc6.b(name, null, ((mp0) kd2Var.j(tq1Var)).o, 0L, s92.C, null, 0L, null, 0L, 0, false, 0, 0, ((nl6) kd2Var.j(tq1Var2)).j, kd2Var, 1572864, 0, 131002);
            yc6.b(devProfile.getUsername(), null, ep0.b(0.75f, ((mp0) kd2Var.j(tq1Var)).o), 0L, null, null, 0L, null, 0L, 0, false, 0, 0, ((nl6) kd2Var.j(tq1Var2)).k, kd2Var, 0, 0, 131066);
            kd2Var2 = kd2Var;
            kd2Var2.q(true);
            ov5.a(kd2Var2, ar5.l(vz3Var, 10.0f));
            yt2.a(w65.H(R.drawable.arrow_right, kd2Var2, 0), null, ar5.i(vz3Var, 20.0f), 0L, kd2Var2, 440, 8);
            kd2Var2.q(true);
            kd2Var2.q(true);
            yz3Var2 = vz3Var;
        } else {
            kd2Var2.Y();
            yz3Var2 = yz3Var;
        }
        zz4 u = kd2Var2.u();
        if (u != null) {
            u.d = new fj(devProfile, context, sb2Var, yz3Var2, i);
        }
    }

    public static final void h(int i, kd2 kd2Var) {
        boolean z;
        kd2Var.f0(2121348896);
        if (i != 0) {
            z = true;
        } else {
            z = false;
        }
        if (kd2Var.V(i & 1, z)) {
            l36.a(ar5.c(vz3.x, 1.0f), ((cn5) kd2Var.j(dn5.a)).d, ((mp0) kd2Var.j(op0.a)).p, 0L, 0.0f, 0.0f, null, bb4.z, kd2Var, 12582918, 120);
        } else {
            kd2Var.Y();
        }
        zz4 u = kd2Var.u();
        if (u != null) {
            u.d = new vs0(i, (byte) 2);
        }
    }
}
