package defpackage;

import com.anistation.android.R;
import com.anistation.model.settings.SubtitleArgbColor;
import com.anistation.model.settings.SubtitleStyleSettings;
import com.anistation.navigation.Route;
import java.util.List;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public abstract class h26 {
    public static final List a;
    public static final List b;

    static {
        int i = ep0.j;
        long j = ep0.e;
        l16 l16Var = new l16(j, "White");
        long j2 = ep0.b;
        a = te4.I(l16Var, new l16(j2, "Black"), new l16(w65.f(4294961979L), "Yellow"), new l16(w65.f(4289058471L), "Green"), new l16(w65.f(4294491088L), "Pink"));
        b = te4.I(new l16(j2, "Black"), new l16(w65.f(4280361249L), "Dark Gray"), new l16(j, "White"));
    }

    public static final void a(final xh4 xh4Var, final List list, final SubtitleStyleSettings subtitleStyleSettings, final af3 af3Var, final vm1 vm1Var, final ub2 ub2Var, final ub2 ub2Var2, final sb2 sb2Var, final sb2 sb2Var2, kd2 kd2Var, final int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        vr vrVar;
        kd2Var.f0(1931949268);
        if (kd2Var.h(xh4Var)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i10 = i | i2;
        if (kd2Var.f(list)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i11 = i10 | i3;
        if (kd2Var.h(subtitleStyleSettings)) {
            i4 = 256;
        } else {
            i4 = 128;
        }
        int i12 = i11 | i4;
        if (kd2Var.f(af3Var)) {
            i5 = 2048;
        } else {
            i5 = 1024;
        }
        int i13 = i12 | i5;
        if (kd2Var.f(vm1Var)) {
            i6 = 16384;
        } else {
            i6 = 8192;
        }
        int i14 = i13 | i6;
        if (kd2Var.h(ub2Var2)) {
            i7 = 1048576;
        } else {
            i7 = 524288;
        }
        int i15 = i14 | i7;
        if (kd2Var.h(sb2Var)) {
            i8 = 8388608;
        } else {
            i8 = 4194304;
        }
        int i16 = i15 | i8;
        if (kd2Var.h(sb2Var2)) {
            i9 = 67108864;
        } else {
            i9 = 33554432;
        }
        int i17 = i16 | i9;
        boolean z7 = false;
        if ((i17 & 38347923) != 38347922) {
            z = true;
        } else {
            z = false;
        }
        if (kd2Var.V(i17 & 1, z)) {
            z22 z22Var = ar5.c;
            vh4 k = n77.k(15.0f, 0.0f, 15.0f, 32.0f, 2);
            vr vrVar2 = new vr(15.0f, true, new ze0((byte) 6));
            if ((i17 & 57344) == 16384) {
                z2 = true;
            } else {
                z2 = false;
            }
            if ((i17 & 14) != 4 && !kd2Var.h(xh4Var)) {
                z3 = false;
            } else {
                z3 = true;
            }
            boolean z8 = z2 | z3;
            if ((i17 & 112) != 32) {
                z4 = false;
            } else {
                z4 = true;
            }
            boolean h = z8 | z4 | kd2Var.h(subtitleStyleSettings);
            if ((i17 & 3670016) == 1048576) {
                z5 = true;
            } else {
                z5 = false;
            }
            boolean z9 = h | z5;
            if ((i17 & 29360128) == 8388608) {
                z6 = true;
            } else {
                z6 = false;
            }
            boolean z10 = z9 | z6;
            if ((i17 & 234881024) == 67108864) {
                z7 = true;
            }
            boolean z11 = z10 | z7;
            Object Q = kd2Var.Q();
            if (!z11 && Q != au0.a) {
                vrVar = vrVar2;
            } else {
                vrVar = vrVar2;
                ub2 ub2Var3 = new ub2() { // from class: z16
                    @Override // defpackage.ub2
                    public final Object invoke(Object obj) {
                        pe3 pe3Var = (pe3) obj;
                        pe3Var.getClass();
                        vm1 vm1Var2 = vm1Var;
                        xh4 xh4Var2 = xh4Var;
                        List list2 = list;
                        SubtitleStyleSettings subtitleStyleSettings2 = SubtitleStyleSettings.this;
                        pe3.C0(pe3Var, null, new os0(-799257419, true, new c74(vm1Var2, xh4Var2, list2, subtitleStyleSettings2, (byte) 1)), 3);
                        h26.g(pe3Var, subtitleStyleSettings2, ub2Var, ub2Var2, sb2Var, sb2Var2);
                        return pn6.a;
                    }
                };
                kd2Var.n0(ub2Var3);
                Q = ub2Var3;
            }
            n77.h(z22Var, af3Var, k, vrVar, null, null, false, null, (ub2) Q, kd2Var, ((i17 >> 6) & 112) | 24966, 488);
        } else {
            kd2Var.Y();
        }
        zz4 u = kd2Var.u();
        if (u != null) {
            u.d = new ic2(list, subtitleStyleSettings, af3Var, vm1Var, ub2Var, ub2Var2, sb2Var, sb2Var2, i) { // from class: d26
                public final /* synthetic */ af3 A;
                public final /* synthetic */ vm1 B;
                public final /* synthetic */ ub2 C;
                public final /* synthetic */ ub2 D;
                public final /* synthetic */ sb2 E;
                public final /* synthetic */ sb2 F;
                public final /* synthetic */ List y;
                public final /* synthetic */ SubtitleStyleSettings z;

                @Override // defpackage.ic2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int N = kb0.N(196617);
                    h26.a(xh4.this, this.y, this.z, this.A, this.B, this.C, this.D, this.E, this.F, (kd2) obj, N);
                    return pn6.a;
                }
            };
        }
    }

    public static final void b(int i, kd2 kd2Var) {
        boolean z;
        kd2 kd2Var2;
        kd2Var.f0(414267592);
        if (i != 0) {
            z = true;
        } else {
            z = false;
        }
        if (kd2Var.V(i & 1, z)) {
            kd2Var2 = kd2Var;
            kb0.e(null, 0.0f, ep0.b(0.08f, ((mp0) kd2Var.j(op0.a)).o), kd2Var2, 0, 3);
        } else {
            kd2Var2 = kd2Var;
            kd2Var2.Y();
        }
        zz4 u = kd2Var2.u();
        if (u != null) {
            u.d = new ao5(i, (byte) 1);
        }
    }

    public static final void c(xh4 xh4Var, List list, SubtitleStyleSettings subtitleStyleSettings, yz3 yz3Var, kd2 kd2Var, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        boolean z;
        kd2 kd2Var2 = kd2Var;
        kd2Var2.f0(-1316826209);
        if (kd2Var2.h(xh4Var)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i6 = i | i2;
        if (kd2Var2.f(list)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i7 = i6 | i3;
        if (kd2Var2.h(subtitleStyleSettings)) {
            i4 = 256;
        } else {
            i4 = 128;
        }
        int i8 = i7 | i4;
        if (kd2Var2.f(yz3Var)) {
            i5 = 2048;
        } else {
            i5 = 1024;
        }
        int i9 = i8 | i5;
        if ((i9 & 1171) != 1170) {
            z = true;
        } else {
            z = false;
        }
        if (kd2Var2.V(i9 & 1, z)) {
            yz3 h = wc7.h(yz3Var);
            tq1 tq1Var = dn5.a;
            yz3 h2 = bx7.h(m37.f(n03.k(h, ((cn5) kd2Var2.j(tq1Var)).d), 0.5f, ep0.b(0.12f, ((mp0) kd2Var2.j(op0.a)).o), ((cn5) kd2Var2.j(tq1Var)).d), ep0.b, io3.h);
            vo3 c = b90.c(pk2.y, false);
            int hashCode = Long.hashCode(kd2Var2.T);
            al4 l = kd2Var2.l();
            yz3 E = o80.E(kd2Var2, h2);
            tt0.d.getClass();
            kd2Var2.h0();
            if (kd2Var2.S) {
                kd2Var2.k(za3.p0);
            } else {
                kd2Var2.q0();
            }
            ss5.i(p7.F, kd2Var2, c);
            ss5.i(p7.E, kd2Var2, l);
            ss5.i(p7.G, kd2Var2, Integer.valueOf(hashCode));
            ss5.h(kd2Var2);
            ss5.i(p7.D, kd2Var2, E);
            z22 z22Var = ar5.c;
            zz.c(xh4Var, z22Var, null, pk2.O, 0.0f, kd2Var, 25016 | (i9 & 14));
            kd2Var2 = kd2Var;
            o80.f(true, list, subtitleStyleSettings, z22Var, kd2Var2, (i9 & 112) | 3078 | (i9 & 896));
            kd2Var2.q(true);
        } else {
            kd2Var2.Y();
        }
        zz4 u = kd2Var2.u();
        if (u != null) {
            u.d = new fj(xh4Var, list, subtitleStyleSettings, yz3Var, i, (byte) 10);
        }
    }

    public static final void d(os0 os0Var, kd2 kd2Var, int i) {
        boolean z;
        kd2Var.f0(-457793504);
        if ((i & 3) != 2) {
            z = true;
        } else {
            z = false;
        }
        byte b2 = 6;
        if (kd2Var.V(i & 1, z)) {
            yz3 S = n77.S(bx7.h(ar5.c(vz3.x, 1.0f), ((mp0) kd2Var.j(op0.a)).p, ((cn5) kd2Var.j(dn5.a)).d), 16.0f, 16.0f);
            xp0 a2 = vp0.a(new vr(16.0f, true, new ze0((byte) 6)), pk2.K, kd2Var, 6);
            int hashCode = Long.hashCode(kd2Var.T);
            al4 l = kd2Var.l();
            yz3 E = o80.E(kd2Var, S);
            tt0.d.getClass();
            kd2Var.h0();
            if (kd2Var.S) {
                kd2Var.k(za3.p0);
            } else {
                kd2Var.q0();
            }
            ss5.i(p7.F, kd2Var, a2);
            ss5.i(p7.E, kd2Var, l);
            ss5.i(p7.G, kd2Var, Integer.valueOf(hashCode));
            ss5.h(kd2Var);
            ss5.i(p7.D, kd2Var, E);
            os0Var.invoke(yp0.a, kd2Var, 54);
            kd2Var.q(true);
        } else {
            kd2Var.Y();
        }
        zz4 u = kd2Var.u();
        if (u != null) {
            u.d = new k(os0Var, i, b2);
        }
    }

    public static final void e(SubtitleStyleSettings subtitleStyleSettings, ub2 ub2Var, sb2 sb2Var, sb2 sb2Var2, kd2 kd2Var, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        boolean z;
        subtitleStyleSettings.getClass();
        ub2Var.getClass();
        sb2Var.getClass();
        kd2Var.f0(-1828246065);
        if (kd2Var.h(subtitleStyleSettings)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i6 = i | i2;
        if (kd2Var.h(ub2Var)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i7 = i6 | i3;
        if (kd2Var.h(sb2Var)) {
            i4 = 256;
        } else {
            i4 = 128;
        }
        int i8 = i7 | i4;
        if (kd2Var.h(sb2Var2)) {
            i5 = 2048;
        } else {
            i5 = 1024;
        }
        int i9 = i8 | i5;
        if ((i9 & 1171) != 1170) {
            z = true;
        } else {
            z = false;
        }
        if (kd2Var.V(i9 & 1, z)) {
            Object Q = kd2Var.Q();
            Object obj = au0.a;
            if (Q == obj) {
                Q = xt5.g(subtitleStyleSettings.normalized());
                kd2Var.n0(Q);
            }
            w44 w44Var = (w44) Q;
            boolean h = kd2Var.h(subtitleStyleSettings);
            Object Q2 = kd2Var.Q();
            if (h || Q2 == obj) {
                Q2 = new yh(subtitleStyleSettings, w44Var, null, (byte) 24);
                kd2Var.n0(Q2);
            }
            db.f((ic2) Q2, kd2Var, subtitleStyleSettings);
            String f = lz5.f(R.string.subtitle_preview_text, kd2Var);
            boolean f2 = kd2Var.f(f);
            Object Q3 = kd2Var.Q();
            if (f2 || Q3 == obj) {
                Q3 = te4.H(new b31(f, null, null, null, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, -3.4028235E38f, false, SubtitleArgbColor.BLACK, Integer.MIN_VALUE, 0.0f, 0));
                kd2Var.n0(Q3);
            }
            List list = (List) Q3;
            xh4 H = w65.H(R.drawable.subtitle_preview, kd2Var, 0);
            af3 a2 = bf3.a(kd2Var);
            z22 z22Var = ar5.c;
            yz3 h2 = bx7.h(z22Var, ((mp0) kd2Var.j(op0.a)).n, io3.h);
            xp0 a3 = vp0.a(x97.z, pk2.K, kd2Var, 0);
            int hashCode = Long.hashCode(kd2Var.T);
            al4 l = kd2Var.l();
            yz3 E = o80.E(kd2Var, h2);
            tt0.d.getClass();
            kd2Var.h0();
            if (kd2Var.S) {
                kd2Var.k(za3.p0);
            } else {
                kd2Var.q0();
            }
            ss5.i(p7.F, kd2Var, a3);
            ss5.i(p7.E, kd2Var, l);
            ss5.i(p7.G, kd2Var, Integer.valueOf(hashCode));
            ss5.h(kd2Var);
            ss5.i(p7.D, kd2Var, E);
            Route.Settings settings = Route.Settings.INSTANCE;
            String f3 = lz5.f(R.string.subtitle_settings, kd2Var);
            Object Q4 = kd2Var.Q();
            if (Q4 == obj) {
                Q4 = new jk5((byte) 10);
                kd2Var.n0(Q4);
            }
            aj.a(settings, null, null, f3, true, false, (sb2) Q4, null, sb2Var2, kd2Var, ((i9 << 15) & 234881024) | 1794054, 134);
            x97.b(z22Var, null, nx7.R(-1104835173, new oi(H, list, a2, ub2Var, sb2Var, w44Var), kd2Var), kd2Var, 3078, 6);
            kd2Var.q(true);
        } else {
            kd2Var.Y();
        }
        zz4 u = kd2Var.u();
        if (u != null) {
            u.d = new fj(subtitleStyleSettings, ub2Var, sb2Var, sb2Var2, i, (byte) 9);
        }
    }

    public static final void f(xh4 xh4Var, List list, SubtitleStyleSettings subtitleStyleSettings, af3 af3Var, ub2 ub2Var, ub2 ub2Var2, sb2 sb2Var, sb2 sb2Var2, kd2 kd2Var, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        kd2 kd2Var2;
        kd2 kd2Var3 = kd2Var;
        kd2Var3.f0(-934978242);
        if (kd2Var3.h(xh4Var)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i9 = i | i2;
        if (kd2Var3.f(list)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i10 = i9 | i3;
        if (kd2Var3.h(subtitleStyleSettings)) {
            i4 = 256;
        } else {
            i4 = 128;
        }
        int i11 = i10 | i4;
        if (kd2Var3.f(af3Var)) {
            i5 = 2048;
        } else {
            i5 = 1024;
        }
        int i12 = i11 | i5;
        if (kd2Var3.h(ub2Var2)) {
            i6 = 131072;
        } else {
            i6 = 65536;
        }
        int i13 = i12 | i6;
        if (kd2Var3.h(sb2Var)) {
            i7 = 1048576;
        } else {
            i7 = 524288;
        }
        int i14 = i13 | i7;
        if (kd2Var3.h(sb2Var2)) {
            i8 = 8388608;
        } else {
            i8 = 4194304;
        }
        int i15 = i14 | i8;
        if ((4793491 & i15) != 4793490) {
            z = true;
        } else {
            z = false;
        }
        if (kd2Var3.V(i15 & 1, z)) {
            yz3 T = n77.T(ar5.c, 15.0f, 0.0f, 2);
            z75 a2 = y75.a(new vr(16.0f, true, new ze0((byte) 6)), pk2.H, kd2Var3, 6);
            int hashCode = Long.hashCode(kd2Var3.T);
            al4 l = kd2Var3.l();
            yz3 E = o80.E(kd2Var3, T);
            tt0.d.getClass();
            kd2Var3.h0();
            boolean z5 = kd2Var3.S;
            t53 t53Var = za3.p0;
            if (z5) {
                kd2Var3.k(t53Var);
            } else {
                kd2Var3.q0();
            }
            st0 st0Var = p7.F;
            ss5.i(st0Var, kd2Var3, a2);
            ys0 ys0Var = p7.E;
            ss5.i(ys0Var, kd2Var3, l);
            Integer valueOf = Integer.valueOf(hashCode);
            st0 st0Var2 = p7.G;
            ss5.i(st0Var2, kd2Var3, valueOf);
            ss5.h(kd2Var3);
            ys0 ys0Var2 = p7.D;
            ss5.i(ys0Var2, kd2Var3, E);
            float f = 0.5f;
            if (0.5f <= 0.0d) {
                cz2.a("invalid weight; must be greater than zero");
            }
            if (0.5f > Float.MAX_VALUE) {
                f = Float.MAX_VALUE;
            }
            ob3 ob3Var = new ob3(f, true);
            z22 z22Var = ar5.b;
            float f2 = 0.5f;
            x97.b(n77.V(ob3Var.w(z22Var), 0.0f, 5.0f, 0.0f, 32.0f, 5), pk2.z, nx7.R(-1665088776, new ao(xh4Var, list, subtitleStyleSettings), kd2Var3), kd2Var3, 3120, 4);
            if (0.5f <= 0.0d) {
                cz2.a("invalid weight; must be greater than zero");
            }
            if (0.5f > Float.MAX_VALUE) {
                f2 = Float.MAX_VALUE;
            }
            yz3 w = new ob3(f2, true).w(z22Var);
            vo3 c = b90.c(pk2.y, false);
            int hashCode2 = Long.hashCode(kd2Var3.T);
            al4 l2 = kd2Var3.l();
            yz3 E2 = o80.E(kd2Var3, w);
            kd2Var3.h0();
            if (kd2Var3.S) {
                kd2Var3.k(t53Var);
            } else {
                kd2Var3.q0();
            }
            ss5.i(st0Var, kd2Var3, c);
            ss5.i(ys0Var, kd2Var3, l2);
            h11.q(hashCode2, kd2Var3, st0Var2, kd2Var3);
            ss5.i(ys0Var2, kd2Var3, E2);
            yz3 w2 = ar5.c(ar5.n(vz3.x, 0.0f, 720.0f, 1), 1.0f).w(z22Var);
            vh4 k = n77.k(0.0f, 5.0f, 0.0f, 32.0f, 5);
            vr vrVar = new vr(15.0f, true, new ze0((byte) 6));
            boolean h = kd2Var3.h(subtitleStyleSettings);
            if ((i15 & 458752) == 131072) {
                z2 = true;
            } else {
                z2 = false;
            }
            boolean z6 = h | z2;
            if ((i15 & 3670016) == 1048576) {
                z3 = true;
            } else {
                z3 = false;
            }
            boolean z7 = z6 | z3;
            if ((i15 & 29360128) == 8388608) {
                z4 = true;
            } else {
                z4 = false;
            }
            boolean z8 = z7 | z4;
            Object Q = kd2Var3.Q();
            if (!z8 && Q != au0.a) {
                kd2Var2 = kd2Var3;
            } else {
                kd2Var2 = kd2Var3;
                g5 g5Var = new g5(subtitleStyleSettings, ub2Var, ub2Var2, sb2Var, sb2Var2, (byte) 7);
                kd2Var2.n0(g5Var);
                Q = g5Var;
            }
            kd2 kd2Var4 = kd2Var2;
            n77.h(w2, af3Var, k, vrVar, null, null, false, null, (ub2) Q, kd2Var4, ((i15 >> 6) & 112) | 24966, 488);
            kd2Var3 = kd2Var4;
            kd2Var3.q(true);
            kd2Var3.q(true);
        } else {
            kd2Var3.Y();
        }
        zz4 u = kd2Var3.u();
        if (u != null) {
            u.d = new hx2(xh4Var, list, subtitleStyleSettings, af3Var, ub2Var, ub2Var2, sb2Var, sb2Var2, i);
        }
    }

    public static final void g(pe3 pe3Var, SubtitleStyleSettings subtitleStyleSettings, ub2 ub2Var, ub2 ub2Var2, sb2 sb2Var, sb2 sb2Var2) {
        pe3.A0(pe3Var, "font-selector", new os0(-1968274133, true, new a26((byte) 2, ub2Var2, subtitleStyleSettings)), 2);
        pe3.A0(pe3Var, "subtitle-sliders", new os0(-370038956, true, new b26(subtitleStyleSettings, ub2Var, sb2Var, (byte) 1)), 2);
        pe3.A0(pe3Var, "subtitle-colors", new os0(-785365773, true, new a26((byte) 3, ub2Var2, subtitleStyleSettings)), 2);
        pe3.A0(pe3Var, "reset-button", new os0(-1200692590, true, new sm0(sb2Var2, (byte) 4)), 2);
    }
}
