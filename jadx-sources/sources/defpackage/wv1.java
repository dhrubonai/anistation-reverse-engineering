package defpackage;

import com.anistation.android.R;
import com.anistation.model.download.EpisodeDownload;
import com.anistation.model.download.EpisodeDownloadState;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final /* synthetic */ class wv1 implements ic2 {
    public final /* synthetic */ boolean A;
    public final /* synthetic */ sb2 B;
    public final /* synthetic */ Object C;
    public final /* synthetic */ Object D;
    public final /* synthetic */ Object E;
    public final /* synthetic */ Object F;
    public final /* synthetic */ Object G;
    public final /* synthetic */ byte x = 0;
    public final /* synthetic */ boolean y;
    public final /* synthetic */ sb2 z;

    public /* synthetic */ wv1(EpisodeDownload episodeDownload, ev2 ev2Var, boolean z, Long l, Long l2, boolean z2, sb2 sb2Var, ub2 ub2Var, sb2 sb2Var2) {
        this.C = episodeDownload;
        this.D = ev2Var;
        this.y = z;
        this.E = l;
        this.F = l2;
        this.A = z2;
        this.z = sb2Var;
        this.G = ub2Var;
        this.B = sb2Var2;
    }

    @Override // defpackage.ic2
    public final Object invoke(Object obj, Object obj2) {
        boolean z;
        pn6 pn6Var;
        y50 y50Var;
        n90 n90Var;
        boolean z2;
        ys0 ys0Var;
        q18 q18Var;
        boolean z3;
        y50 y50Var2;
        n90 n90Var2;
        boolean z4;
        n90 n90Var3;
        t53 t53Var;
        q18 q18Var2;
        boolean z5;
        float f;
        int i;
        float f2;
        EpisodeDownload episodeDownload;
        float f3;
        String str;
        boolean z6;
        boolean z7;
        byte b = this.x;
        pn6 pn6Var2 = pn6.a;
        Object obj3 = this.G;
        Object obj4 = this.F;
        Object obj5 = this.E;
        Object obj6 = this.D;
        Object obj7 = this.C;
        switch (b) {
            case 0:
                EpisodeDownload episodeDownload2 = (EpisodeDownload) obj7;
                ev2 ev2Var = (ev2) obj6;
                Long l = (Long) obj5;
                Long l2 = (Long) obj4;
                ub2 ub2Var = (ub2) obj3;
                kd2 kd2Var = (kd2) obj;
                int intValue = ((Integer) obj2).intValue();
                if ((intValue & 3) != 2) {
                    z = true;
                } else {
                    z = false;
                }
                if (kd2Var.V(intValue & 1, z)) {
                    z75 a = y75.a(x97.B, pk2.H, kd2Var, 54);
                    int hashCode = Long.hashCode(kd2Var.T);
                    al4 l3 = kd2Var.l();
                    vz3 vz3Var = vz3.x;
                    yz3 E = o80.E(kd2Var, vz3Var);
                    tt0.d.getClass();
                    kd2Var.h0();
                    boolean z8 = kd2Var.S;
                    t53 t53Var2 = za3.p0;
                    if (z8) {
                        kd2Var.k(t53Var2);
                    } else {
                        kd2Var.q0();
                    }
                    st0 st0Var = p7.F;
                    ss5.i(st0Var, kd2Var, a);
                    ys0 ys0Var2 = p7.E;
                    ss5.i(ys0Var2, kd2Var, l3);
                    Integer valueOf = Integer.valueOf(hashCode);
                    st0 st0Var2 = p7.G;
                    ss5.i(st0Var2, kd2Var, valueOf);
                    ss5.h(kd2Var);
                    ys0 ys0Var3 = p7.D;
                    ss5.i(ys0Var3, kd2Var, E);
                    pn6Var = pn6Var2;
                    yz3 k = n03.k(ar5.g(ar5.l(vz3Var, 160.0f), 100.0f, 0.0f, 2), n03.w(kd2Var).c);
                    long j = n03.r(kd2Var).p;
                    ao2 ao2Var = io3.h;
                    yz3 h = bx7.h(k, j, ao2Var);
                    y50 y50Var3 = pk2.y;
                    vo3 c = b90.c(y50Var3, false);
                    int hashCode2 = Long.hashCode(kd2Var.T);
                    al4 l4 = kd2Var.l();
                    yz3 E2 = o80.E(kd2Var, h);
                    kd2Var.h0();
                    if (kd2Var.S) {
                        kd2Var.k(t53Var2);
                    } else {
                        kd2Var.q0();
                    }
                    ss5.i(st0Var, kd2Var, c);
                    ss5.i(ys0Var2, kd2Var, l4);
                    h11.q(hashCode2, kd2Var, st0Var2, kd2Var);
                    ss5.i(ys0Var3, kd2Var, E2);
                    String episodeTitle = episodeDownload2.getMetadata().getEpisodeTitle();
                    cz0 cz0Var = pk2.O;
                    n90 n90Var4 = n90.a;
                    tl7.a(ev2Var, episodeTitle, n90Var4.b(vz3Var), cz0Var, kd2Var, 1572864);
                    boolean z9 = this.y;
                    q18 q18Var3 = au0.a;
                    if (z9) {
                        kd2Var.e0(-484260030);
                        y50Var = y50Var3;
                        n90Var = n90Var4;
                        yz3 h2 = bx7.h(n90Var4.b(vz3Var), ep0.b(0.4f, n03.r(kd2Var).n), ao2Var);
                        vo3 c2 = b90.c(pk2.C, false);
                        z2 = z9;
                        int hashCode3 = Long.hashCode(kd2Var.T);
                        al4 l5 = kd2Var.l();
                        yz3 E3 = o80.E(kd2Var, h2);
                        kd2Var.h0();
                        if (kd2Var.S) {
                            kd2Var.k(t53Var2);
                        } else {
                            kd2Var.q0();
                        }
                        ss5.i(st0Var, kd2Var, c2);
                        ss5.i(ys0Var2, kd2Var, l5);
                        h11.q(hashCode3, kd2Var, st0Var2, kd2Var);
                        ss5.i(ys0Var3, kd2Var, E3);
                        sb2 sb2Var = this.z;
                        boolean f4 = kd2Var.f(sb2Var);
                        Object Q = kd2Var.Q();
                        if (f4 || Q == q18Var3) {
                            Q = new mm(sb2Var, (byte) 5);
                            kd2Var.n0(Q);
                        }
                        h98.a(this.A, (ub2) Q, null, kd2Var, 0);
                        kd2Var.q(true);
                        kd2Var.q(false);
                    } else {
                        y50Var = y50Var3;
                        n90Var = n90Var4;
                        z2 = z9;
                        kd2Var.e0(-483751661);
                        kd2Var.q(false);
                    }
                    if (l != null && l2 != null) {
                        kd2Var.e0(-483617586);
                        float B = db.B(((float) l.longValue()) / ((float) l2.longValue()), 0.0f, 1.0f);
                        n90Var2 = n90Var;
                        yz3 a2 = n90Var2.a(bx7.h(ar5.e(ar5.c(vz3Var, 1.0f), 3.0f), ep0.b(0.4f, n03.r(kd2Var).o), ao2Var), pk2.F);
                        y50Var2 = y50Var;
                        vo3 c3 = b90.c(y50Var2, false);
                        q18Var = q18Var3;
                        int hashCode4 = Long.hashCode(kd2Var.T);
                        al4 l6 = kd2Var.l();
                        yz3 E4 = o80.E(kd2Var, a2);
                        kd2Var.h0();
                        z3 = z2;
                        if (kd2Var.S) {
                            kd2Var.k(t53Var2);
                        } else {
                            kd2Var.q0();
                        }
                        ss5.i(st0Var, kd2Var, c3);
                        ss5.i(ys0Var2, kd2Var, l6);
                        h11.q(hashCode4, kd2Var, st0Var2, kd2Var);
                        ys0Var = ys0Var3;
                        ss5.i(ys0Var, kd2Var, E4);
                        z4 = false;
                        b90.a(bx7.h(ar5.c(vz3Var, B).w(ar5.b), n03.r(kd2Var).a, ao2Var), kd2Var, 0);
                        kd2Var.q(true);
                        kd2Var.q(false);
                    } else {
                        ys0Var = ys0Var3;
                        q18Var = q18Var3;
                        z3 = z2;
                        y50Var2 = y50Var;
                        n90Var2 = n90Var;
                        z4 = false;
                        kd2Var.e0(-482782477);
                        kd2Var.q(false);
                    }
                    if (episodeDownload2.isExternal()) {
                        kd2Var.e0(-482698932);
                        t53Var = t53Var2;
                        z5 = z3;
                        n90Var3 = n90Var2;
                        q18Var2 = q18Var;
                        n03.b(n77.R(n90Var2.a(vz3Var, y50Var2), 6.0f), new vh4(6.0f, 6.0f, 6.0f, 6.0f), ep0.b(0.5f, ep0.b), ep0.e, null, zz.g, kd2Var, 1597872, 40);
                        kd2Var = kd2Var;
                        kd2Var.q(false);
                    } else {
                        n90Var3 = n90Var2;
                        t53Var = t53Var2;
                        q18Var2 = q18Var;
                        z5 = z3;
                        kd2Var.e0(-482090061);
                        kd2Var.q(z4);
                    }
                    kd2 kd2Var2 = kd2Var;
                    n03.c(qx1.h(episodeDownload2.getMetadata().getEpisodeNumber(), "EP "), n77.R(n90Var3.a(vz3Var, pk2.G), 6.0f), null, ep0.b(0.75f, ep0.b), null, ep0.e, null, null, kd2Var2, 199680, 212);
                    kd2Var2.q(true);
                    if (1.0f <= 0.0d) {
                        cz2.a("invalid weight; must be greater than zero");
                    }
                    if (1.0f > Float.MAX_VALUE) {
                        f = Float.MAX_VALUE;
                    } else {
                        f = 1.0f;
                    }
                    yz3 U = n77.U(new ob3(f, true), 12.0f, 6.0f, 8.0f, 6.0f);
                    xp0 a3 = vp0.a(new vr(5.0f, true, new ze0((byte) 6)), pk2.K, kd2Var2, 6);
                    int hashCode5 = Long.hashCode(kd2Var2.T);
                    al4 l7 = kd2Var2.l();
                    yz3 E5 = o80.E(kd2Var2, U);
                    kd2Var2.h0();
                    if (kd2Var2.S) {
                        kd2Var2.k(t53Var);
                    } else {
                        kd2Var2.q0();
                    }
                    ss5.i(st0Var, kd2Var2, a3);
                    ss5.i(ys0Var2, kd2Var2, l7);
                    h11.q(hashCode5, kd2Var2, st0Var2, kd2Var2);
                    ss5.i(ys0Var, kd2Var2, E5);
                    yz3 c4 = ar5.c(vz3Var, 1.0f);
                    z75 a4 = y75.a(new vr(8.0f, true, new ze0((byte) 6)), pk2.I, kd2Var2, 54);
                    int hashCode6 = Long.hashCode(kd2Var2.T);
                    al4 l8 = kd2Var2.l();
                    yz3 E6 = o80.E(kd2Var2, c4);
                    kd2Var2.h0();
                    if (kd2Var2.S) {
                        kd2Var2.k(t53Var);
                    } else {
                        kd2Var2.q0();
                    }
                    ss5.i(st0Var, kd2Var2, a4);
                    ss5.i(ys0Var2, kd2Var2, l8);
                    h11.q(hashCode6, kd2Var2, st0Var2, kd2Var2);
                    ss5.i(ys0Var, kd2Var2, E6);
                    String episodeTitle2 = episodeDownload2.getMetadata().getEpisodeTitle();
                    xd6 a5 = xd6.a(n03.y(kd2Var2).k, 0L, s92.C, null, 0L, null, hz5.g(20), null, 16646139);
                    long j2 = n03.r(kd2Var2).o;
                    EpisodeDownloadState state = episodeDownload2.getState();
                    int[] iArr = aw1.a;
                    int i2 = iArr[state.ordinal()];
                    if (i2 != 1 && i2 != 2 && i2 != 3 && i2 != 4) {
                        i = 2;
                    } else {
                        i = 1;
                    }
                    if (1.0f <= 0.0d) {
                        cz2.a("invalid weight; must be greater than zero");
                    }
                    if (1.0f > Float.MAX_VALUE) {
                        f2 = Float.MAX_VALUE;
                    } else {
                        f2 = 1.0f;
                    }
                    yc6.b(episodeTitle2, new ob3(f2, true), j2, 0L, null, null, 0L, null, 0L, 2, false, i, 0, a5, kd2Var2, 0, 384, 110584);
                    kd2 kd2Var3 = kd2Var2;
                    if ((!episodeDownload2.isActive() && !episodeDownload2.isPaused()) || z5) {
                        episodeDownload = episodeDownload2;
                        kd2Var3.e0(-1468152833);
                        kd2Var3.q(false);
                    } else {
                        kd2Var3.e0(-1469712536);
                        long j3 = n03.r(kd2Var3).p;
                        long j4 = n03.r(kd2Var3).o;
                        yz3 i3 = ar5.i(vz3Var, 25.0f);
                        boolean f5 = kd2Var3.f(ub2Var) | kd2Var3.h(episodeDownload2);
                        Object Q2 = kd2Var3.Q();
                        if (f5 || Q2 == q18Var2) {
                            Q2 = new sj1(ub2Var, episodeDownload2);
                            kd2Var3.n0(Q2);
                        }
                        episodeDownload = episodeDownload2;
                        zz.a(i3, false, true, null, null, j3, j4, (sb2) Q2, null, nx7.R(-879118121, new yv1(episodeDownload2, (byte) 0), kd2Var3), kd2Var3, 805306758, 282);
                        zz.a(ar5.i(vz3Var, 25.0f), false, true, null, null, n03.r(kd2Var3).p, n03.r(kd2Var3).o, this.B, null, zz.h, kd2Var3, 805306758, 282);
                        kd2Var3 = kd2Var3;
                        kd2Var3.q(false);
                    }
                    kd2Var3.q(true);
                    kd2 kd2Var4 = kd2Var3;
                    yc6.b("Episode " + episodeDownload.getMetadata().getEpisodeNumber() + " • " + episodeDownload.getMetadata().getQuality() + " • " + episodeDownload.getMetadata().getServer(), null, ep0.b(0.65f, n03.r(kd2Var3).o), 0L, null, null, 0L, null, 0L, 2, false, 1, 0, n03.y(kd2Var3).l, kd2Var4, 0, 24960, 110586);
                    kd2Var4.e0(2033322341);
                    if (episodeDownload.isWaitingForWifi()) {
                        z6 = false;
                        str = h11.i(kd2Var4, -1512812115, R.string.waiting_for_wifi, kd2Var4, false);
                    } else {
                        kd2Var4.e0(-1512765987);
                        kd2Var4.q(false);
                        switch (iArr[episodeDownload.getState().ordinal()]) {
                            case 1:
                                float percentDownloaded = episodeDownload.getPercentDownloaded();
                                if (percentDownloaded < 0.0f) {
                                    f3 = 0.0f;
                                } else {
                                    f3 = percentDownloaded;
                                }
                                str = ((int) f3) + "% • " + sw0.K(episodeDownload.getBytesDownloaded());
                                break;
                            case 2:
                                str = "Restarting";
                                break;
                            case 3:
                                str = "Queued";
                                break;
                            case 4:
                                str = "Paused";
                                break;
                            case 5:
                                if (episodeDownload.getContentLength() > 0) {
                                    str = "Downloaded • ".concat(sw0.K(episodeDownload.getContentLength()));
                                    break;
                                } else {
                                    str = "Downloaded • ".concat(sw0.K(episodeDownload.getBytesDownloaded()));
                                    break;
                                }
                            case 6:
                                str = "Download failed";
                                break;
                            case 7:
                                str = "Deleting";
                                break;
                            default:
                                ze0.l();
                                return null;
                        }
                        z6 = false;
                    }
                    kd2Var4.q(z6);
                    yc6.b(str, null, ep0.b(0.75f, n03.r(kd2Var4).o), 0L, null, null, 0L, null, 0L, 0, false, 0, 0, n03.y(kd2Var4).n, kd2Var4, 0, 0, 131066);
                    kd2 kd2Var5 = kd2Var4;
                    if (!episodeDownload.isActive() && !episodeDownload.isPaused() && !episodeDownload.isWaitingForWifi()) {
                        kd2Var5.e0(-1218067773);
                        kd2Var5.q(false);
                    } else {
                        kd2Var5.e0(-1218344541);
                        boolean h3 = kd2Var5.h(episodeDownload);
                        Object Q3 = kd2Var5.Q();
                        if (!h3 && Q3 != q18Var2) {
                            z7 = false;
                        } else {
                            z7 = false;
                            Q3 = new zv1(episodeDownload, (byte) 0);
                            kd2Var5.n0(Q3);
                        }
                        o80.g((sb2) Q3, ar5.e(ar5.c(vz3Var, 1.0f), 3.0f), 0L, 0L, kd2Var5, 48);
                        kd2Var5 = kd2Var5;
                        kd2Var5.q(z7);
                    }
                    kd2Var5.q(true);
                    kd2Var5.q(true);
                } else {
                    pn6Var = pn6Var2;
                    kd2Var.Y();
                }
                return pn6Var;
            default:
                ((Integer) obj2).getClass();
                n77.a(this.y, this.z, this.A, (ko4) obj7, (String) obj6, (String) obj5, (String) obj4, (String) obj3, this.B, vz3.x, (kd2) obj, kb0.N(1));
                return pn6Var2;
        }
    }

    public /* synthetic */ wv1(boolean z, sb2 sb2Var, boolean z2, ko4 ko4Var, String str, String str2, String str3, String str4, sb2 sb2Var2, int i) {
        this.y = z;
        this.z = sb2Var;
        this.A = z2;
        this.C = ko4Var;
        this.D = str;
        this.E = str2;
        this.F = str3;
        this.G = str4;
        this.B = sb2Var2;
    }
}
