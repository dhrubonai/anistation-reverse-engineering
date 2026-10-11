package defpackage;

import com.anistation.android.R;
import com.anistation.model.animelist.WatchStatus;
import com.anistation.model.settings.SubtitleFontFamily;
import com.anistation.model.update.AppUpdateCheck;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final /* synthetic */ class s16 implements ic2 {
    public final /* synthetic */ Object A;
    public final /* synthetic */ Object B;
    public final /* synthetic */ Object C;
    public final /* synthetic */ byte x = 0;
    public final /* synthetic */ boolean y;
    public final /* synthetic */ Object z;

    public /* synthetic */ s16(v05 v05Var, cc6 cc6Var, cj2 cj2Var, v05 v05Var2, boolean z) {
        this.z = v05Var;
        this.A = cc6Var;
        this.B = cj2Var;
        this.C = v05Var2;
        this.y = z;
    }

    @Override // defpackage.ic2
    public final Object invoke(Object obj, Object obj2) {
        int i;
        int g;
        boolean z;
        int i2;
        int i3;
        int i4;
        int i5;
        byte b = this.x;
        pn6 pn6Var = pn6.a;
        Object obj3 = this.C;
        Object obj4 = this.A;
        Object obj5 = this.B;
        Object obj6 = this.z;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                xt5.a((String) obj6, (SubtitleFontFamily) obj4, this.y, (ub2) obj5, (ub2) obj3, (kd2) obj, kb0.N(1));
                return pn6Var;
            case 1:
                v05 v05Var = (v05) obj6;
                cc6 cc6Var = (cc6) obj4;
                cj2 cj2Var = (cj2) obj5;
                v05 v05Var2 = (v05) obj3;
                v05Var.x = xc4.f(v05Var.x, ((xc4) obj2).a);
                dd6 dd6Var = cc6Var.b;
                gi6 gi6Var = cc6Var.a;
                bd6 c = dd6Var.c();
                if (c != null) {
                    o24 o24Var = c.b;
                    cc6Var.A(cj2Var, xc4.f(v05Var2.x, v05Var.x));
                    boolean z2 = this.y;
                    if (z2) {
                        i = o24Var.g(cc6Var.n());
                    } else {
                        long j = gi6Var.d().B;
                        int i6 = nd6.c;
                        i = (int) (j >> 32);
                    }
                    int i7 = i;
                    if (z2) {
                        long j2 = gi6Var.d().B;
                        int i8 = nd6.c;
                        g = (int) (j2 & 4294967295L);
                    } else {
                        g = o24Var.g(cc6Var.n());
                    }
                    int i9 = g;
                    long j3 = gi6Var.d().B;
                    long B = cc6Var.B(gi6Var.d(), i7, i9, z2, l68.O, false, false, new tj2(9));
                    if (nd6.d(j3) || !nd6.d(B)) {
                        gi6Var.j(B);
                    }
                }
                return pn6Var;
            case 2:
                yc5 yc5Var = (yc5) obj6;
                AppUpdateCheck appUpdateCheck = (AppUpdateCheck) obj4;
                sb2 sb2Var = (sb2) obj5;
                sb2 sb2Var2 = (sb2) obj3;
                kd2 kd2Var = (kd2) obj;
                int intValue = ((Integer) obj2).intValue();
                if ((intValue & 3) != 2) {
                    z = true;
                } else {
                    z = false;
                }
                if (kd2Var.V(intValue & 1, z)) {
                    vz3 vz3Var = vz3.x;
                    yz3 k0 = n77.k0(n77.V(n77.T(ar5.c(vz3Var, 1.0f), 20.0f, 0.0f, 2), 0.0f, 30.0f, 0.0f, 0.0f, 13), yc5Var, 14);
                    xp0 a = vp0.a(x97.z, pk2.L, kd2Var, 48);
                    int hashCode = Long.hashCode(kd2Var.T);
                    al4 l = kd2Var.l();
                    yz3 E = o80.E(kd2Var, k0);
                    tt0.d.getClass();
                    kd2Var.h0();
                    boolean z3 = kd2Var.S;
                    t53 t53Var = za3.p0;
                    if (z3) {
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
                    yz3 h = bx7.h(vz3Var, ep0.e, tm5.b);
                    vo3 c2 = b90.c(pk2.C, false);
                    int hashCode2 = Long.hashCode(kd2Var.T);
                    al4 l2 = kd2Var.l();
                    yz3 E2 = o80.E(kd2Var, h);
                    kd2Var.h0();
                    if (kd2Var.S) {
                        kd2Var.k(t53Var);
                    } else {
                        kd2Var.q0();
                    }
                    ss5.i(st0Var, kd2Var, c2);
                    ss5.i(ys0Var, kd2Var, l2);
                    h11.q(hashCode2, kd2Var, st0Var2, kd2Var);
                    ss5.i(ys0Var2, kd2Var, E2);
                    yt2.a(w65.H(R.drawable.logo_android, kd2Var, 0), lz5.f(R.string.app_name, kd2Var), n77.R(ar5.i(vz3Var, 75.0f), 5.0f), ep0.i, kd2Var, 3464, 0);
                    kd2Var.q(true);
                    ov5.a(kd2Var, ar5.e(vz3Var, 20.0f));
                    boolean z4 = this.y;
                    if (z4) {
                        i2 = -1152849040;
                        i3 = R.string.update_required;
                    } else {
                        i2 = -1152847055;
                        i3 = R.string.update_available;
                    }
                    String i10 = h11.i(kd2Var, i2, i3, kd2Var, false);
                    tq1 tq1Var = pl6.a;
                    xd6 xd6Var = ((nl6) kd2Var.j(tq1Var)).f;
                    s92 s92Var = s92.D;
                    tq1 tq1Var2 = op0.a;
                    yc6.b(i10, null, ((mp0) kd2Var.j(tq1Var2)).o, 0L, s92Var, null, 0L, new c86(3), 0L, 0, false, 0, 0, xd6Var, kd2Var, 1572864, 0, 129978);
                    ov5.a(kd2Var, ar5.e(vz3Var, 14.0f));
                    if (z4) {
                        i4 = -1378134199;
                        i5 = R.string.update_message_1;
                    } else {
                        i4 = -1378047895;
                        i5 = R.string.update_message_2;
                    }
                    yc6.b(h11.i(kd2Var, i4, i5, kd2Var, false), null, ep0.b(0.88f, ((mp0) kd2Var.j(tq1Var2)).o), 0L, null, null, 0L, new c86(3), 0L, 0, false, 0, 0, xd6.a(((nl6) kd2Var.j(tq1Var)).k, 0L, null, null, 0L, null, hz5.g(20), null, 16646143), kd2Var, 0, 0, 130042);
                    ov5.a(kd2Var, ar5.e(vz3Var, 28.0f));
                    nx7.k(appUpdateCheck, kd2Var, 0);
                    ov5.a(kd2Var, ar5.e(vz3Var, 30.0f));
                    nx7.a(lz5.f(R.string.update_now, kd2Var), ar5.c(vz3Var, 1.0f), null, null, false, false, 0.0f, ((mp0) kd2Var.j(tq1Var2)).o, ((mp0) kd2Var.j(tq1Var2)).n, null, null, sb2Var, kd2Var, 48, 0, 3324);
                    te4.d(!z4, null, null, null, null, nx7.R(419508672, new sm0(sb2Var2, (byte) 5), kd2Var), kd2Var, 1572870, 30);
                    ov5.a(kd2Var, ar5.e(vz3Var, 20.0f));
                    kd2Var.q(true);
                    return pn6Var;
                }
                kd2Var.Y();
                return pn6Var;
            default:
                ((Integer) obj2).getClass();
                wt5.d(this.y, (WatchStatus) obj6, (ub2) obj5, (sb2) obj4, (yz3) obj3, (kd2) obj, kb0.N(3073));
                return pn6Var;
        }
    }

    public /* synthetic */ s16(yc5 yc5Var, boolean z, AppUpdateCheck appUpdateCheck, sb2 sb2Var, sb2 sb2Var2) {
        this.z = yc5Var;
        this.y = z;
        this.A = appUpdateCheck;
        this.B = sb2Var;
        this.C = sb2Var2;
    }

    public /* synthetic */ s16(String str, SubtitleFontFamily subtitleFontFamily, boolean z, ub2 ub2Var, ub2 ub2Var2, int i) {
        this.z = str;
        this.A = subtitleFontFamily;
        this.y = z;
        this.B = ub2Var;
        this.C = ub2Var2;
    }

    public /* synthetic */ s16(boolean z, WatchStatus watchStatus, ub2 ub2Var, sb2 sb2Var, yz3 yz3Var, int i) {
        this.y = z;
        this.z = watchStatus;
        this.B = ub2Var;
        this.A = sb2Var;
        this.C = yz3Var;
    }
}
