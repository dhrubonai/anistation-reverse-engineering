package defpackage;

import com.anistation.android.R;
import com.anistation.model.Info;
import com.anistation.model.MediaFormat;
import com.anistation.model.MediaStatus;
import com.anistation.model.NextAiringEpisode;
import java.util.List;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public abstract class me1 {
    public static final void a(Info info, final do5 do5Var, final float f, final String str, String str2, kd2 kd2Var, final int i) {
        int i2;
        int i3;
        boolean z;
        Info info2;
        String str3;
        String str4;
        String str5;
        boolean z2;
        sb2 sb2Var;
        NextAiringEpisode nextAiringEpisode;
        Integer seasonYear;
        MediaFormat format;
        MediaStatus status;
        String label;
        int i4;
        int i5;
        int i6;
        final String str6 = str2;
        kd2 kd2Var2 = kd2Var;
        do5Var.getClass();
        str.getClass();
        kd2Var2.f0(216452376);
        if (kd2Var2.h(info)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i7 = i2 | i;
        if (kd2Var2.f(do5Var)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i8 = i7 | i3;
        if ((i & 384) == 0) {
            if (kd2Var2.c(f)) {
                i6 = 256;
            } else {
                i6 = 128;
            }
            i8 |= i6;
        }
        if ((i & 3072) == 0) {
            if (kd2Var2.f(str)) {
                i5 = 2048;
            } else {
                i5 = 1024;
            }
            i8 |= i5;
        }
        if ((i & 24576) == 0) {
            if (kd2Var2.f(str6)) {
                i4 = 16384;
            } else {
                i4 = 8192;
            }
            i8 |= i4;
        }
        if ((i8 & 9363) != 9362) {
            z = true;
        } else {
            z = false;
        }
        if (kd2Var2.V(i8 & 1, z)) {
            yc5 d0 = n77.d0(kd2Var2);
            Object Q = kd2Var2.Q();
            Object obj = au0.a;
            if (Q == obj) {
                Q = db.L(kd2Var2);
                kd2Var2.n0(Q);
            }
            v11 v11Var = (v11) Q;
            long currentTimeMillis = System.currentTimeMillis();
            String f2 = lz5.f(R.string.status, kd2Var2);
            String f3 = lz5.f(R.string.type, kd2Var2);
            String f4 = lz5.f(R.string.year, kd2Var2);
            if (info == null || (status = info.getStatus()) == null || (label = status.getLabel()) == null) {
                str3 = "N/A";
            } else {
                str3 = label;
            }
            ai4 ai4Var = new ai4(f2, str3);
            if (info == null || (format = info.getFormat()) == null || (str4 = format.getLabel()) == null) {
                str4 = "N/A";
            }
            ai4 ai4Var2 = new ai4(f3, str4);
            if (info == null || (seasonYear = info.getSeasonYear()) == null || (str5 = String.valueOf(seasonYear.intValue())) == null) {
                str5 = "N/A";
            }
            List<ai4> I = te4.I(ai4Var, ai4Var2, new ai4(f4, str5));
            jw4 jw4Var = op0.a;
            long b = ep0.b(0.8f, ((mp0) kd2Var2.j(jw4Var)).o);
            vz3 vz3Var = vz3.x;
            yz3 T = n77.T(ar5.e(bx7.h(ar5.c(vz3Var, 1.0f), ((mp0) kd2Var2.j(jw4Var)).n, io3.h), f), 12.0f, 0.0f, 2);
            WeakHashMap weakHashMap = z57.w;
            yz3 k0 = h41.k0(T, new ch3(mv5.b(kd2Var2).e, 32));
            xp0 a = vp0.a(x97.z, pk2.L, kd2Var2, 54);
            int hashCode = Long.hashCode(kd2Var2.T);
            al4 l = kd2Var2.l();
            yz3 E = o80.E(kd2Var2, k0);
            tt0.d.getClass();
            kd2Var2.h0();
            boolean z3 = kd2Var2.S;
            sb2 sb2Var2 = za3.p0;
            if (z3) {
                kd2Var2.k(sb2Var2);
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
            yz3 V = n77.V(ar5.c(vz3Var, 1.0f), 0.0f, 0.0f, 0.0f, 5.0f, 7);
            int i9 = i8;
            z75 a2 = y75.a(x97.B, pk2.I, kd2Var2, 54);
            int hashCode2 = Long.hashCode(kd2Var2.T);
            al4 l2 = kd2Var2.l();
            yz3 E2 = o80.E(kd2Var2, V);
            kd2Var2.h0();
            if (kd2Var2.S) {
                kd2Var2.k(sb2Var2);
            } else {
                kd2Var2.q0();
            }
            ss5.i(st0Var, kd2Var2, a2);
            ss5.i(ys0Var, kd2Var2, l2);
            h11.q(hashCode2, kd2Var2, st0Var2, kd2Var2);
            ss5.i(ys0Var2, kd2Var2, E2);
            String f5 = lz5.f(R.string.description, kd2Var2);
            jw4 jw4Var2 = pl6.a;
            yc6.b(f5, null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, ((nl6) kd2Var2.j(jw4Var2)).g, kd2Var, 0, 0, 131070);
            boolean h = kd2Var.h(v11Var);
            if ((i9 & 112) == 32) {
                z2 = true;
            } else {
                z2 = false;
            }
            boolean z4 = h | z2;
            Object Q2 = kd2Var.Q();
            if (z4 || Q2 == obj) {
                Q2 = new h80(v11Var, do5Var, (byte) 4);
                kd2Var.n0(Q2);
            }
            zz.a(null, false, false, null, null, 0L, 0L, (sb2) Q2, null, jf7.y, kd2Var, 805306368, 383);
            kd2Var.q(true);
            kb0.e(null, 0.5f, 0L, kd2Var, 48, 5);
            yz3 k02 = n77.k0(ar5.c(vz3Var, 1.0f).w(new ob3(1.0f, true)), d0, 14);
            xp0 a3 = vp0.a(new vr(12.0f, true, new ze0((byte) 6)), pk2.K, kd2Var, 6);
            int hashCode3 = Long.hashCode(kd2Var.T);
            al4 l3 = kd2Var.l();
            yz3 E3 = o80.E(kd2Var, k02);
            kd2Var.h0();
            if (kd2Var.S) {
                sb2Var = sb2Var2;
                kd2Var.k(sb2Var);
            } else {
                sb2Var = sb2Var2;
                kd2Var.q0();
            }
            ss5.i(st0Var, kd2Var, a3);
            ss5.i(ys0Var, kd2Var, l3);
            h11.q(hashCode3, kd2Var, st0Var2, kd2Var);
            ss5.i(ys0Var2, kd2Var, E3);
            ov5.a(kd2Var, ar5.e(vz3Var, 12.0f));
            sb2 sb2Var3 = sb2Var;
            yc6.b(str, null, ((mp0) kd2Var.j(jw4Var)).o, 0L, null, null, 0L, null, 0L, 2, false, 4, 0, ((nl6) kd2Var.j(jw4Var2)).g, kd2Var, (i9 >> 9) & 14, 24960, 110586);
            kd2Var2 = kd2Var;
            yz3 V2 = n77.V(ar5.c(vz3Var, 1.0f), 0.0f, 5.0f, 0.0f, 0.0f, 13);
            float f6 = 10.0f;
            z75 a4 = y75.a(new vr(10.0f, true, new ze0((byte) 6)), pk2.H, kd2Var2, 6);
            int hashCode4 = Long.hashCode(kd2Var2.T);
            al4 l4 = kd2Var2.l();
            yz3 E4 = o80.E(kd2Var2, V2);
            kd2Var2.h0();
            if (kd2Var2.S) {
                kd2Var2.k(sb2Var3);
            } else {
                kd2Var2.q0();
            }
            ss5.i(st0Var, kd2Var2, a4);
            ss5.i(ys0Var, kd2Var2, l4);
            h11.q(hashCode4, kd2Var2, st0Var2, kd2Var2);
            ss5.i(ys0Var2, kd2Var2, E4);
            kd2Var2.e0(-2038476194);
            for (ai4 ai4Var3 : I) {
                wk6.b(new ob3(1.0f, true), null, 0L, 0L, null, nx7.R(1440955679, new ie1((String) ai4Var3.y, (String) ai4Var3.x, b, (byte) 0), kd2Var2), kd2Var2, 196608, 30);
                f6 = f6;
            }
            float f7 = f6;
            kd2Var2.q(false);
            kd2Var2.q(true);
            List<String> list = null;
            if (info != null) {
                nextAiringEpisode = info.getNextAiringEpisode();
            } else {
                nextAiringEpisode = null;
            }
            if (nextAiringEpisode == null) {
                kd2Var2.e0(-1528116355);
                kd2Var2.q(false);
            } else {
                kd2Var2.e0(-1528116354);
                wk6.b(null, null, 0L, 0L, null, nx7.R(1683585617, new je1(nextAiringEpisode, currentTimeMillis, (byte) 0), kd2Var2), kd2Var2, 196608, 31);
                kd2Var2.q(false);
            }
            if (info != null) {
                list = info.getGenres();
            }
            if (list == null) {
                kd2Var2.e0(-1526022274);
                kd2Var2.q(false);
            } else {
                kd2Var2.e0(-1526022273);
                q23.b(null, new vr(6.0f, true, new ze0((byte) 6)), new vr(6.0f, true, new ze0((byte) 6)), null, 0, 0, nx7.R(431497605, new ke1(list, (byte) 0), kd2Var2), kd2Var, 1573296, 57);
                kd2Var2 = kd2Var;
                kd2Var2.q(false);
            }
            info2 = info;
            str6 = str2;
            wk6.b(n77.V(vz3Var, 0.0f, 0.0f, 0.0f, f7, 7), null, 0L, 0L, null, nx7.R(-624361754, new q(str6, info2, (byte) 17), kd2Var2), kd2Var2, 196614, 30);
            kd2Var2.q(true);
            kd2Var2.q(true);
        } else {
            info2 = info;
            kd2Var2.Y();
        }
        zz4 u = kd2Var2.u();
        if (u != null) {
            final Info info3 = info2;
            u.d = new ic2() { // from class: le1
                @Override // defpackage.ic2
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    me1.a(Info.this, do5Var, f, str, str6, (kd2) obj2, kb0.N(i | 1));
                    return pn6.a;
                }
            };
        }
    }
}
