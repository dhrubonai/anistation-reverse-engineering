package defpackage;

import com.anistation.android.R;
import com.anistation.model.download.DownloadSettings;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final /* synthetic */ class ql1 implements ic2 {
    public final /* synthetic */ sb2 A;
    public final /* synthetic */ byte x = 1;
    public final /* synthetic */ DownloadSettings y;
    public final /* synthetic */ sb2 z;

    public /* synthetic */ ql1(sb2 sb2Var, DownloadSettings downloadSettings, sb2 sb2Var2) {
        this.z = sb2Var;
        this.y = downloadSettings;
        this.A = sb2Var2;
    }

    @Override // defpackage.ic2
    public final Object invoke(Object obj, Object obj2) {
        boolean z;
        float f;
        boolean z2;
        byte b = this.x;
        pn6 pn6Var = pn6.a;
        sb2 sb2Var = this.A;
        sb2 sb2Var2 = this.z;
        DownloadSettings downloadSettings = this.y;
        switch (b) {
            case 0:
                kd2 kd2Var = (kd2) obj;
                int intValue = ((Integer) obj2).intValue();
                if ((intValue & 3) != 2) {
                    z = true;
                } else {
                    z = false;
                }
                if (kd2Var.V(intValue & 1, z)) {
                    tr trVar = x97.z;
                    w50 w50Var = pk2.K;
                    xp0 a = vp0.a(trVar, w50Var, kd2Var, 0);
                    int hashCode = Long.hashCode(kd2Var.T);
                    al4 l = kd2Var.l();
                    vz3 vz3Var = vz3.x;
                    yz3 E = o80.E(kd2Var, vz3Var);
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
                    yz3 S = n77.S(q23.n(15, sb2Var2, ar5.c(vz3Var, 1.0f), null, false), 16.0f, 18.0f);
                    x50 x50Var = pk2.I;
                    sr srVar = x97.y;
                    z75 a2 = y75.a(srVar, x50Var, kd2Var, 48);
                    int hashCode2 = Long.hashCode(kd2Var.T);
                    al4 l2 = kd2Var.l();
                    yz3 E2 = o80.E(kd2Var, S);
                    kd2Var.h0();
                    if (kd2Var.S) {
                        kd2Var.k(t53Var);
                    } else {
                        kd2Var.q0();
                    }
                    ss5.i(st0Var, kd2Var, a2);
                    ss5.i(ys0Var, kd2Var, l2);
                    h11.q(hashCode2, kd2Var, st0Var2, kd2Var);
                    ss5.i(ys0Var2, kd2Var, E2);
                    sl1.d(R.drawable.folder, kd2Var, 0);
                    ov5.a(kd2Var, ar5.l(vz3Var, 14.0f));
                    if (1.0f <= 0.0d) {
                        cz2.a("invalid weight; must be greater than zero");
                    }
                    if (1.0f > Float.MAX_VALUE) {
                        f = Float.MAX_VALUE;
                    } else {
                        f = 1.0f;
                    }
                    ob3 ob3Var = new ob3(f, true);
                    xp0 a3 = vp0.a(trVar, w50Var, kd2Var, 0);
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
                    String f2 = lz5.f(R.string.external_download_location, kd2Var);
                    xd6 xd6Var = n03.y(kd2Var).j;
                    s92 s92Var = s92.C;
                    yc6.b(f2, null, n03.r(kd2Var).q, 0L, s92Var, null, 0L, null, 0L, 0, false, 0, 0, xd6Var, kd2Var, 1572864, 0, 131002);
                    ov5.a(kd2Var, ar5.e(vz3Var, 4.0f));
                    yc6.b(downloadSettings.getExternalLocationName(), null, ep0.b(0.68f, n03.r(kd2Var).q), 0L, null, null, 0L, null, 0L, 2, false, 2, 0, n03.y(kd2Var).l, kd2Var, 0, 24960, 110586);
                    kd2Var.q(true);
                    yt2.a(w65.H(R.drawable.arrow_right, kd2Var, 0), null, ar5.i(vz3Var, 20.0f), n03.r(kd2Var).o, kd2Var, 440, 0);
                    kd2 kd2Var2 = kd2Var;
                    kd2Var2.q(true);
                    if (!downloadSettings.getUsesDefaultExternalLocation()) {
                        kd2Var2.e0(-929791978);
                        kb0.e(ar5.c(vz3Var, 1.0f), 0.0f, ep0.b(0.8f, n03.r(kd2Var2).r), kd2Var2, 6, 2);
                        yz3 S2 = n77.S(q23.n(15, sb2Var, ar5.c(vz3Var, 1.0f), null, false), 16.0f, 18.0f);
                        z75 a4 = y75.a(srVar, x50Var, kd2Var2, 48);
                        int hashCode4 = Long.hashCode(kd2Var2.T);
                        al4 l4 = kd2Var2.l();
                        yz3 E4 = o80.E(kd2Var2, S2);
                        kd2Var2.h0();
                        if (kd2Var2.S) {
                            kd2Var2.k(t53Var);
                        } else {
                            kd2Var2.q0();
                        }
                        ss5.i(st0Var, kd2Var2, a4);
                        ss5.i(ys0Var, kd2Var2, l4);
                        h11.q(hashCode4, kd2Var2, st0Var2, kd2Var2);
                        ss5.i(ys0Var2, kd2Var2, E4);
                        sl1.d(R.drawable.refresh, kd2Var2, 0);
                        ov5.a(kd2Var2, ar5.l(vz3Var, 14.0f));
                        float f3 = 1.0f;
                        if (1.0f <= 0.0d) {
                            cz2.a("invalid weight; must be greater than zero");
                        }
                        if (1.0f > Float.MAX_VALUE) {
                            f3 = Float.MAX_VALUE;
                        }
                        ob3 ob3Var2 = new ob3(f3, true);
                        xp0 a5 = vp0.a(trVar, w50Var, kd2Var2, 0);
                        int hashCode5 = Long.hashCode(kd2Var2.T);
                        al4 l5 = kd2Var2.l();
                        yz3 E5 = o80.E(kd2Var2, ob3Var2);
                        kd2Var2.h0();
                        if (kd2Var2.S) {
                            kd2Var2.k(t53Var);
                        } else {
                            kd2Var2.q0();
                        }
                        ss5.i(st0Var, kd2Var2, a5);
                        ss5.i(ys0Var, kd2Var2, l5);
                        h11.q(hashCode5, kd2Var2, st0Var2, kd2Var2);
                        ss5.i(ys0Var2, kd2Var2, E5);
                        yc6.b(lz5.f(R.string.use_default_location, kd2Var2), null, n03.r(kd2Var2).q, 0L, s92Var, null, 0L, null, 0L, 0, false, 0, 0, n03.y(kd2Var2).j, kd2Var2, 1572864, 0, 131002);
                        ov5.a(kd2Var2, ar5.e(vz3Var, 4.0f));
                        yc6.b(DownloadSettings.DEFAULT_EXTERNAL_LOCATION, null, ep0.b(0.68f, n03.r(kd2Var2).q), 0L, null, null, 0L, null, 0L, 2, false, 2, 0, n03.y(kd2Var2).l, kd2Var2, 6, 24960, 110586);
                        kd2Var2 = kd2Var2;
                        z2 = true;
                        kd2Var2.q(true);
                        kd2Var2.q(true);
                        kd2Var2.q(false);
                    } else {
                        z2 = true;
                        kd2Var2.e0(-928307233);
                        kd2Var2.q(false);
                    }
                    kd2Var2.q(z2);
                    return pn6Var;
                }
                kd2Var.Y();
                return pn6Var;
            default:
                ((Integer) obj2).getClass();
                sl1.c(downloadSettings, sb2Var2, sb2Var, (kd2) obj, kb0.N(1));
                return pn6Var;
        }
    }

    public /* synthetic */ ql1(DownloadSettings downloadSettings, sb2 sb2Var, sb2 sb2Var2, int i) {
        this.y = downloadSettings;
        this.z = sb2Var;
        this.A = sb2Var2;
    }
}
