package defpackage;

import com.anistation.android.R;
import com.anistation.model.settings.HoldAction;
import com.anistation.navigation.Route;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public abstract class np4 {
    public static final void a(final boolean z, final ub2 ub2Var, final boolean z2, final ub2 ub2Var2, final boolean z3, final ub2 ub2Var3, final HoldAction holdAction, final ub2 ub2Var4, final boolean z4, final ub2 ub2Var5, final boolean z5, final ub2 ub2Var6, final sb2 sb2Var, kd2 kd2Var, final int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        boolean z6;
        ys0 ys0Var;
        kd2 kd2Var2 = kd2Var;
        ub2Var.getClass();
        ub2Var2.getClass();
        ub2Var3.getClass();
        holdAction.getClass();
        ub2Var4.getClass();
        ub2Var5.getClass();
        ub2Var6.getClass();
        kd2Var2.f0(-1564717211);
        int i12 = 4;
        if (kd2Var2.g(z)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i13 = i | i2;
        int i14 = 32;
        if (kd2Var2.h(ub2Var)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i15 = i13 | i3;
        int i16 = 128;
        if (kd2Var2.g(z2)) {
            i4 = 256;
        } else {
            i4 = 128;
        }
        int i17 = i15 | i4;
        if (kd2Var2.h(ub2Var2)) {
            i5 = 2048;
        } else {
            i5 = 1024;
        }
        int i18 = i17 | i5;
        if (kd2Var2.g(z3)) {
            i6 = 16384;
        } else {
            i6 = 8192;
        }
        int i19 = i18 | i6;
        if (kd2Var2.h(ub2Var3)) {
            i7 = 131072;
        } else {
            i7 = 65536;
        }
        int i20 = i19 | i7;
        if (kd2Var2.d(holdAction.ordinal())) {
            i8 = 1048576;
        } else {
            i8 = 524288;
        }
        int i21 = i20 | i8;
        if (kd2Var2.h(ub2Var4)) {
            i9 = 8388608;
        } else {
            i9 = 4194304;
        }
        int i22 = i21 | i9;
        if (kd2Var2.g(z4)) {
            i10 = 67108864;
        } else {
            i10 = 33554432;
        }
        int i23 = i22 | i10;
        if (kd2Var2.h(ub2Var5)) {
            i11 = 536870912;
        } else {
            i11 = 268435456;
        }
        int i24 = i23 | i11;
        if (!kd2Var2.g(z5)) {
            i12 = 2;
        }
        if (!kd2Var2.h(ub2Var6)) {
            i14 = 16;
        }
        int i25 = i12 | i14;
        if (kd2Var2.h(sb2Var)) {
            i16 = 256;
        }
        int i26 = i25 | i16;
        if ((i24 & 306783379) == 306783378 && (i26 & 147) == 146) {
            z6 = false;
        } else {
            z6 = true;
        }
        if (kd2Var2.V(i24 & 1, z6)) {
            yc5 d0 = n77.d0(kd2Var2);
            z22 z22Var = ar5.c;
            tq1 tq1Var = op0.a;
            yz3 k0 = n77.k0(bx7.h(z22Var, ((mp0) kd2Var2.j(tq1Var)).n, io3.h), d0, 14);
            tr trVar = x97.z;
            w50 w50Var = pk2.K;
            xp0 a = vp0.a(trVar, w50Var, kd2Var2, 0);
            int hashCode = Long.hashCode(kd2Var2.T);
            al4 l = kd2Var2.l();
            yz3 E = o80.E(kd2Var2, k0);
            tt0.d.getClass();
            kd2Var2.h0();
            boolean z7 = kd2Var2.S;
            t53 t53Var = za3.p0;
            if (z7) {
                kd2Var2.k(t53Var);
            } else {
                kd2Var2.q0();
            }
            st0 st0Var = p7.F;
            ss5.i(st0Var, kd2Var2, a);
            ys0 ys0Var2 = p7.E;
            ss5.i(ys0Var2, kd2Var2, l);
            Integer valueOf = Integer.valueOf(hashCode);
            st0 st0Var2 = p7.G;
            ss5.i(st0Var2, kd2Var2, valueOf);
            ss5.h(kd2Var2);
            ys0 ys0Var3 = p7.D;
            ss5.i(ys0Var3, kd2Var2, E);
            Route.Settings settings = Route.Settings.INSTANCE;
            String f = lz5.f(R.string.player_settings, kd2Var2);
            Object Q = kd2Var2.Q();
            q18 q18Var = au0.a;
            if (Q == q18Var) {
                ys0Var = ys0Var2;
                Q = new qa4((byte) 12);
                kd2Var2.n0(Q);
            } else {
                ys0Var = ys0Var2;
            }
            ys0 ys0Var4 = ys0Var;
            aj.a(settings, null, null, f, true, false, (sb2) Q, null, sb2Var, kd2Var2, ((i26 << 18) & 234881024) | 1794054, 134);
            oi4.f(lz5.f(R.string.volume_brightness_gestures, kd2Var2), lz5.f(R.string.volume_brightness_gestures_summary, kd2Var2), R.drawable.tune, z, ub2Var, null, false, new vh4(18.0f, 10.0f, 16.0f, 15.0f), kd2Var2, (i24 << 9) & 64512, 96);
            int i27 = i24 << 3;
            oi4.f(lz5.f(R.string.fullscreen_swipe_gestures, kd2Var2), lz5.f(R.string.fullscreen_swipe_gestures_summary, kd2Var2), R.drawable.maximize, z2, ub2Var2, null, false, null, kd2Var2, i27 & 64512, 224);
            oi4.f(lz5.f(R.string.hold_gesture, kd2Var2), lz5.f(R.string.hold_gesture_summary, kd2Var2), R.drawable.touch, z3, ub2Var3, null, false, null, kd2Var2, (i24 >> 3) & 64512, 224);
            String f2 = lz5.f(R.string.hold_action_fast_forward, kd2Var2);
            String f3 = lz5.f(R.string.hold_action_pause, kd2Var2);
            vz3 vz3Var = vz3.x;
            yz3 U = n77.U(ar5.c(vz3Var, 1.0f), 18.0f, 15.0f, 16.0f, 15.0f);
            x50 x50Var = pk2.I;
            z75 a2 = y75.a(x97.B, x50Var, kd2Var2, 54);
            int hashCode2 = Long.hashCode(kd2Var2.T);
            al4 l2 = kd2Var2.l();
            yz3 E2 = o80.E(kd2Var2, U);
            kd2Var2.h0();
            if (kd2Var2.S) {
                kd2Var2.k(t53Var);
            } else {
                kd2Var2.q0();
            }
            ss5.i(st0Var, kd2Var2, a2);
            ss5.i(ys0Var4, kd2Var2, l2);
            h11.q(hashCode2, kd2Var2, st0Var2, kd2Var2);
            ss5.i(ys0Var3, kd2Var2, E2);
            ob3 ob3Var = new ob3(1.0f, true);
            z75 a3 = y75.a(new vr(20.0f, true, new ze0((byte) 6)), x50Var, kd2Var2, 54);
            int hashCode3 = Long.hashCode(kd2Var2.T);
            al4 l3 = kd2Var2.l();
            yz3 E3 = o80.E(kd2Var2, ob3Var);
            kd2Var2.h0();
            if (kd2Var2.S) {
                kd2Var2.k(t53Var);
            } else {
                kd2Var2.q0();
            }
            ss5.i(st0Var, kd2Var2, a3);
            ss5.i(ys0Var4, kd2Var2, l3);
            h11.q(hashCode3, kd2Var2, st0Var2, kd2Var2);
            ss5.i(ys0Var3, kd2Var2, E3);
            yt2.a(w65.H(R.drawable.playback, kd2Var2, 0), null, ar5.i(vz3Var, 22.0f), ((mp0) kd2Var2.j(tq1Var)).o, kd2Var2, 440, 0);
            xp0 a4 = vp0.a(new vr(6.0f, true, new ze0((byte) 6)), w50Var, kd2Var2, 6);
            int hashCode4 = Long.hashCode(kd2Var2.T);
            al4 l4 = kd2Var2.l();
            yz3 E4 = o80.E(kd2Var2, vz3Var);
            kd2Var2.h0();
            if (kd2Var2.S) {
                kd2Var2.k(t53Var);
            } else {
                kd2Var2.q0();
            }
            ss5.i(st0Var, kd2Var2, a4);
            ss5.i(ys0Var4, kd2Var2, l4);
            h11.q(hashCode4, kd2Var2, st0Var2, kd2Var2);
            ss5.i(ys0Var3, kd2Var2, E4);
            String f4 = lz5.f(R.string.hold_action, kd2Var2);
            tq1 tq1Var2 = pl6.a;
            yc6.b(f4, null, ((mp0) kd2Var2.j(tq1Var)).o, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, xd6.a(((nl6) kd2Var2.j(tq1Var2)).k, 0L, s92.C, null, 0L, null, 0L, null, 16777211), kd2Var, 0, 0, 131066);
            yc6.b(lz5.f(R.string.hold_action_summary, kd2Var), null, ep0.b(0.65f, ((mp0) kd2Var.j(tq1Var)).o), 0L, null, null, 0L, null, 0L, 0, false, 0, 0, xd6.a(((nl6) kd2Var.j(tq1Var2)).l, 0L, null, null, 0L, null, hz5.g(16), null, 16646143), kd2Var, 0, 0, 131066);
            kd2Var.q(true);
            kd2Var.q(true);
            ov5.a(kd2Var, ar5.l(vz3Var, 10.0f));
            sv1 entries = HoldAction.getEntries();
            boolean f5 = kd2Var.f(f2) | kd2Var.f(f3);
            Object Q2 = kd2Var.Q();
            if (f5 || Q2 == q18Var) {
                Q2 = new r82(f2, f3, (byte) 17);
                kd2Var.n0(Q2);
            }
            int i28 = i24 >> 15;
            t80.a(entries, holdAction, ub2Var4, null, (ub2) Q2, z3, null, 0L, null, null, kd2Var, (i28 & 1008) | (i27 & 458752), 968);
            kd2Var2 = kd2Var;
            kd2Var2.q(true);
            oi4.f(lz5.f(R.string.double_tap_to_skip, kd2Var2), lz5.f(R.string.double_tap_to_skip_summary, kd2Var2), R.drawable.forward_outlined, z4, ub2Var5, null, false, null, kd2Var2, i28 & 64512, 224);
            oi4.f(lz5.f(R.string.show_skip_button, kd2Var2), lz5.f(R.string.show_skip_button_summary, kd2Var2), R.drawable.next_outlined, z5, ub2Var6, null, false, null, kd2Var2, (i26 << 9) & 64512, 224);
            kd2Var2.q(true);
        } else {
            kd2Var2.Y();
        }
        zz4 u = kd2Var2.u();
        if (u != null) {
            u.d = new ic2(z, ub2Var, z2, ub2Var2, z3, ub2Var3, holdAction, ub2Var4, z4, ub2Var5, z5, ub2Var6, sb2Var, i) { // from class: mp4
                public final /* synthetic */ ub2 A;
                public final /* synthetic */ boolean B;
                public final /* synthetic */ ub2 C;
                public final /* synthetic */ HoldAction D;
                public final /* synthetic */ ub2 E;
                public final /* synthetic */ boolean F;
                public final /* synthetic */ ub2 G;
                public final /* synthetic */ boolean H;
                public final /* synthetic */ ub2 I;
                public final /* synthetic */ sb2 J;
                public final /* synthetic */ boolean x;
                public final /* synthetic */ ub2 y;
                public final /* synthetic */ boolean z;

                @Override // defpackage.ic2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int N = kb0.N(1);
                    np4.a(this.x, this.y, this.z, this.A, this.B, this.C, this.D, this.E, this.F, this.G, this.H, this.I, this.J, (kd2) obj, N);
                    return pn6.a;
                }
            };
        }
    }
}
