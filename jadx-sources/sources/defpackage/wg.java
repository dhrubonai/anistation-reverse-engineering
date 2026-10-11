package defpackage;

import com.anistation.android.R;
import com.anistation.model.download.EpisodeDownload;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final /* synthetic */ class wg implements ic2 {
    public final /* synthetic */ Object A;
    public final /* synthetic */ byte x = 2;
    public final /* synthetic */ boolean y;
    public final /* synthetic */ Object z;

    public /* synthetic */ wg(t70 t70Var, boolean z, ub2 ub2Var, int i) {
        this.z = t70Var;
        this.y = z;
        this.A = ub2Var;
    }

    @Override // defpackage.ic2
    public final Object invoke(Object obj, Object obj2) {
        boolean z;
        String i;
        int i2;
        byte b = this.x;
        pn6 pn6Var = pn6.a;
        boolean z2 = this.y;
        Object obj3 = this.A;
        Object obj4 = this.z;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                yg.b((t70) obj4, z2, (ub2) obj3, (kd2) obj, kb0.N(1));
                return pn6Var;
            case 1:
                ((Integer) obj2).getClass();
                i35.a(z2, (ic2) obj4, (sb2) obj3, (kd2) obj, kb0.N(1));
                return pn6Var;
            default:
                String str = (String) obj4;
                EpisodeDownload episodeDownload = (EpisodeDownload) obj3;
                kd2 kd2Var = (kd2) obj;
                int intValue = ((Integer) obj2).intValue();
                if ((intValue & 3) != 2) {
                    z = true;
                } else {
                    z = false;
                }
                if (kd2Var.V(intValue & 1, z)) {
                    yz3 c = ar5.c(vz3.x, 1.0f);
                    xp0 a = vp0.a(new vr(5.0f, true, new ze0((byte) 6)), pk2.K, kd2Var, 6);
                    int hashCode = Long.hashCode(kd2Var.T);
                    al4 l = kd2Var.l();
                    yz3 E = o80.E(kd2Var, c);
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
                    String a2 = e02.a(str, false);
                    if (a2 == null) {
                        a2 = str;
                    }
                    tq1 tq1Var = pl6.a;
                    xd6 xd6Var = ((nl6) kd2Var.j(tq1Var)).j;
                    tq1 tq1Var2 = op0.a;
                    yc6.b(a2, null, ((mp0) kd2Var.j(tq1Var2)).o, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, xd6Var, kd2Var, 0, 0, 131066);
                    if (episodeDownload != null && episodeDownload.isCompleted()) {
                        kd2Var.e0(-1993439998);
                        if (z2) {
                            i2 = R.string.external_downloaded_server_hint;
                        } else {
                            i2 = R.string.downloaded_server_hint;
                        }
                        i = lz5.g(i2, new Object[]{str}, kd2Var);
                        kd2Var.q(false);
                    } else {
                        i = h11.i(kd2Var, -1993190262, R.string.server_change_hint, kd2Var, false);
                    }
                    yc6.b(i, null, ep0.b(0.55f, ((mp0) kd2Var.j(tq1Var2)).o), 0L, null, null, 0L, null, 0L, 0, false, 0, 0, xd6.a(((nl6) kd2Var.j(tq1Var)).l, 0L, null, null, 0L, null, hz5.g(16), null, 16646143), kd2Var, 0, 0, 131066);
                    kd2Var.q(true);
                } else {
                    kd2Var.Y();
                }
                return pn6Var;
        }
    }

    public /* synthetic */ wg(String str, EpisodeDownload episodeDownload, boolean z) {
        this.z = str;
        this.A = episodeDownload;
        this.y = z;
    }

    public /* synthetic */ wg(boolean z, ic2 ic2Var, sb2 sb2Var, int i) {
        this.y = z;
        this.z = ic2Var;
        this.A = sb2Var;
    }
}
