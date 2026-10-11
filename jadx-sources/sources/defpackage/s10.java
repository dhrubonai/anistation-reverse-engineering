package defpackage;

import com.anistation.android.R;
import com.anistation.model.backup.BackupFrequency;
import com.anistation.navigation.Route;
import java.text.DateFormat;
import java.util.Date;
import java.util.Map;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public abstract class s10 {
    public static final void a(xm6 xm6Var, ub2 ub2Var, ub2 ub2Var2, sb2 sb2Var, sb2 sb2Var2, sb2 sb2Var3, kd2 kd2Var, int i) {
        int i2;
        boolean z;
        String str;
        boolean z2;
        boolean z3;
        String str2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        xm6 xm6Var2 = xm6Var;
        xm6Var2.getClass();
        ub2Var.getClass();
        ub2Var2.getClass();
        sb2Var.getClass();
        sb2Var2.getClass();
        sb2Var3.getClass();
        kd2Var.f0(-1203162809);
        if (kd2Var.h(xm6Var2)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i8 = i2 | i;
        if ((i & 48) == 0) {
            if (kd2Var.h(ub2Var)) {
                i7 = 32;
            } else {
                i7 = 16;
            }
            i8 |= i7;
        }
        if ((i & 384) == 0) {
            if (kd2Var.h(ub2Var2)) {
                i6 = 256;
            } else {
                i6 = 128;
            }
            i8 |= i6;
        }
        if ((i & 3072) == 0) {
            if (kd2Var.h(sb2Var)) {
                i5 = 2048;
            } else {
                i5 = 1024;
            }
            i8 |= i5;
        }
        if ((i & 24576) == 0) {
            if (kd2Var.h(sb2Var2)) {
                i4 = 16384;
            } else {
                i4 = 8192;
            }
            i8 |= i4;
        }
        if ((196608 & i) == 0) {
            if (kd2Var.h(sb2Var3)) {
                i3 = 131072;
            } else {
                i3 = 65536;
            }
            i8 |= i3;
        }
        int i9 = i8;
        if ((i9 & 74899) != 74898) {
            z = true;
        } else {
            z = false;
        }
        if (kd2Var.V(i9 & 1, z)) {
            Object Q = kd2Var.Q();
            q18 q18Var = au0.a;
            if (Q == q18Var) {
                Q = xt5.g(Boolean.FALSE);
                kd2Var.n0(Q);
            }
            w44 w44Var = (w44) Q;
            Map T = vn3.T(new ai4(BackupFrequency.NEVER, lz5.f(R.string.never, kd2Var)), new ai4(BackupFrequency.DAILY, lz5.f(R.string.daily, kd2Var)), new ai4(BackupFrequency.WEEKLY, lz5.f(R.string.weekly, kd2Var)), new ai4(BackupFrequency.MONTHLY, lz5.f(R.string.monthly, kd2Var)));
            Long l = xm6Var2.u;
            if (l != null) {
                str = DateFormat.getDateTimeInstance(2, 3).format(new Date(l.longValue()));
            } else {
                str = null;
            }
            if (str == null) {
                z2 = false;
                str = h11.i(kd2Var, -893231227, R.string.never, kd2Var, false);
            } else {
                z2 = false;
                kd2Var.e0(-893236590);
                kd2Var.q(false);
            }
            if (!xm6Var2.z && !xm6Var2.A) {
                z3 = z2;
            } else {
                z3 = true;
            }
            z22 z22Var = ar5.c;
            tq1 tq1Var = op0.a;
            yz3 k0 = n77.k0(bx7.h(z22Var, ((mp0) kd2Var.j(tq1Var)).n, io3.h), n77.d0(kd2Var), 14);
            vr vrVar = new vr(5.0f, true, new ze0((byte) 6));
            w50 w50Var = pk2.L;
            xp0 a = vp0.a(vrVar, w50Var, kd2Var, 54);
            boolean z4 = z3;
            int hashCode = Long.hashCode(kd2Var.T);
            al4 l2 = kd2Var.l();
            yz3 E = o80.E(kd2Var, k0);
            tt0.d.getClass();
            kd2Var.h0();
            boolean z5 = kd2Var.S;
            t53 t53Var = za3.p0;
            if (z5) {
                kd2Var.k(t53Var);
            } else {
                kd2Var.q0();
            }
            st0 st0Var = p7.F;
            ss5.i(st0Var, kd2Var, a);
            ys0 ys0Var = p7.E;
            ss5.i(ys0Var, kd2Var, l2);
            Integer valueOf = Integer.valueOf(hashCode);
            st0 st0Var2 = p7.G;
            ss5.i(st0Var2, kd2Var, valueOf);
            ss5.h(kd2Var);
            ys0 ys0Var2 = p7.D;
            ss5.i(ys0Var2, kd2Var, E);
            Route.Settings settings = Route.Settings.INSTANCE;
            String f = lz5.f(R.string.backup_and_restore, kd2Var);
            Object Q2 = kd2Var.Q();
            if (Q2 == q18Var) {
                str2 = str;
                Q2 = new gr((byte) 6);
                kd2Var.n0(Q2);
            } else {
                str2 = str;
            }
            byte b = 2;
            aj.a(settings, null, null, f, true, false, (sb2) Q2, null, sb2Var3, kd2Var, ((i9 << 9) & 234881024) | 1794054, 134);
            yz3 V = n77.V(z22Var, 15.0f, 0.0f, 15.0f, 30.0f, 2);
            xp0 a2 = vp0.a(new vr(16.0f, true, new ze0((byte) 6)), w50Var, kd2Var, 54);
            int hashCode2 = Long.hashCode(kd2Var.T);
            al4 l3 = kd2Var.l();
            yz3 E2 = o80.E(kd2Var, V);
            kd2Var.h0();
            if (kd2Var.S) {
                kd2Var.k(t53Var);
            } else {
                kd2Var.q0();
            }
            ss5.i(st0Var, kd2Var, a2);
            ss5.i(ys0Var, kd2Var, l3);
            h11.q(hashCode2, kd2Var, st0Var2, kd2Var);
            ss5.i(ys0Var2, kd2Var, E2);
            l36.a(ar5.c(vz3.x, 1.0f), ((cn5) kd2Var.j(dn5.a)).d, ((mp0) kd2Var.j(tq1Var)).p, 0L, 0.0f, 0.0f, null, nx7.R(1714625294, new n10(xm6Var, z4, sb2Var, str2, (byte) 0), kd2Var), kd2Var, 12582918, 120);
            xm6Var2 = xm6Var;
            boolean z6 = true;
            b(lz5.f(R.string.backup_settings_title, kd2Var), null, nx7.R(750275577, new ip4(xm6Var2, z4, ub2Var, T, ub2Var2), kd2Var), kd2Var, 384);
            b(lz5.f(R.string.restore_section_title, kd2Var), null, nx7.R(-596041744, new xh(xm6Var2, z4, w44Var, b), kd2Var), kd2Var, 384);
            kd2Var.q(true);
            kd2Var.q(true);
            boolean booleanValue = ((Boolean) w44Var.getValue()).booleanValue();
            String f2 = lz5.f(R.string.restore_backup, kd2Var);
            String f3 = lz5.f(R.string.restore_backup_warning, kd2Var);
            if ((i9 & 57344) != 16384) {
                z6 = false;
            }
            Object Q3 = kd2Var.Q();
            if (z6 || Q3 == q18Var) {
                Q3 = new o10(sb2Var2, w44Var, (byte) 0);
                kd2Var.n0(Q3);
            }
            sb2 sb2Var4 = (sb2) Q3;
            Object Q4 = kd2Var.Q();
            if (Q4 == q18Var) {
                Q4 = new cf(w44Var, (byte) 6);
                kd2Var.n0(Q4);
            }
            iv.a(booleanValue, f2, f3, null, null, null, false, 0L, 0L, 0L, 0L, sb2Var4, (sb2) Q4, null, kd2Var, 0, 384, 10232);
        } else {
            kd2Var.Y();
        }
        zz4 u = kd2Var.u();
        if (u != null) {
            u.d = new p10(xm6Var2, ub2Var, ub2Var2, sb2Var, sb2Var2, sb2Var3, i);
        }
    }

    public static final void b(String str, yz3 yz3Var, os0 os0Var, kd2 kd2Var, int i) {
        int i2;
        boolean z;
        os0 os0Var2;
        yz3 yz3Var2;
        kd2 kd2Var2 = kd2Var;
        kd2Var2.f0(75665239);
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
            yz3 V = n77.V(ar5.c(vz3Var, 1.0f), 0.0f, 4.0f, 0.0f, 0.0f, 13);
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
            l36.a(ar5.c(vz3Var, 1.0f), ((cn5) kd2Var2.j(dn5.a)).d, ((mp0) kd2Var2.j(tq1Var)).p, 0L, 0.0f, 0.0f, null, nx7.R(-1067456154, new k(os0Var2, (byte) 1), kd2Var2), kd2Var2, 12582918, 120);
            kd2Var2.q(true);
            yz3Var2 = vz3Var;
        } else {
            os0Var2 = os0Var;
            kd2Var2.Y();
            yz3Var2 = yz3Var;
        }
        zz4 u = kd2Var2.u();
        if (u != null) {
            u.d = new l(str, yz3Var2, os0Var2, i, (byte) 1);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0292  */
    /* JADX WARN: Removed duplicated region for block: B:55:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0286  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0059  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void c(final int r51, final java.lang.String r52, final java.lang.String r53, defpackage.yz3 r54, defpackage.ic2 r55, defpackage.kd2 r56, final int r57, final int r58) {
        /*
            Method dump skipped, instructions count: 676
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.s10.c(int, java.lang.String, java.lang.String, yz3, ic2, kd2, int, int):void");
    }
}
