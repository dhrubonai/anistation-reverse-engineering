package defpackage;

import com.anistation.model.download.DownloadAnimeGroup;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final /* synthetic */ class km implements ic2 {
    public final /* synthetic */ boolean A;
    public final /* synthetic */ boolean B;
    public final /* synthetic */ sb2 C;
    public final /* synthetic */ byte x;
    public final /* synthetic */ DownloadAnimeGroup y;
    public final /* synthetic */ ev2 z;

    public /* synthetic */ km(DownloadAnimeGroup downloadAnimeGroup, ev2 ev2Var, boolean z, boolean z2, sb2 sb2Var, byte b) {
        this.x = b;
        this.y = downloadAnimeGroup;
        this.z = ev2Var;
        this.A = z;
        this.B = z2;
        this.C = sb2Var;
    }

    @Override // defpackage.ic2
    public final Object invoke(Object obj, Object obj2) {
        boolean z;
        String str;
        boolean z2;
        byte b = this.x;
        pn6 pn6Var = pn6.a;
        t53 t53Var = za3.p0;
        vz3 vz3Var = vz3.x;
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
                    yz3 t = wk6.t(ar5.c(vz3Var, 1.0f));
                    z75 a = y75.a(x97.y, pk2.H, kd2Var, 48);
                    int hashCode = Long.hashCode(kd2Var.T);
                    al4 l = kd2Var.l();
                    yz3 E = o80.E(kd2Var, t);
                    tt0.d.getClass();
                    kd2Var.h0();
                    if (kd2Var.S) {
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
                    float f = 0.9f;
                    if (0.9f <= 0.0d) {
                        cz2.a("invalid weight; must be greater than zero");
                    }
                    if (0.9f > Float.MAX_VALUE) {
                        f = Float.MAX_VALUE;
                    }
                    yz3 w = new ob3(f, true).w(ar5.b);
                    vo3 c = b90.c(pk2.z, false);
                    int hashCode2 = Long.hashCode(kd2Var.T);
                    al4 l2 = kd2Var.l();
                    yz3 E2 = o80.E(kd2Var, w);
                    kd2Var.h0();
                    if (kd2Var.S) {
                        kd2Var.k(t53Var);
                    } else {
                        kd2Var.q0();
                    }
                    ss5.i(st0Var, kd2Var, c);
                    ss5.i(ys0Var, kd2Var, l2);
                    h11.q(hashCode2, kd2Var, st0Var2, kd2Var);
                    ss5.i(ys0Var2, kd2Var, E2);
                    z22 z22Var = ar5.c;
                    b90.a(bx7.h(n77.V(z22Var, 8.0f, 0.0f, 8.0f, 8.0f, 2), n03.r(kd2Var).r, n03.w(kd2Var).c), kd2Var, 0);
                    yz3 V = n77.V(z22Var, 0.0f, 5.0f, 0.0f, 0.0f, 13);
                    long j = n03.r(kd2Var).p;
                    o75 o75Var = n03.w(kd2Var).c;
                    s70 s70Var = new s70(1.5f, new su5(n03.r(kd2Var).n));
                    DownloadAnimeGroup downloadAnimeGroup = this.y;
                    l36.a(V, o75Var, j, 0L, 0.0f, 0.0f, s70Var, nx7.R(-578998123, new km(downloadAnimeGroup, this.z, this.A, this.B, this.C, (byte) 1), kd2Var), kd2Var, 12582918, 56);
                    kd2Var.q(true);
                    float f2 = 1.2f;
                    if (1.2f <= 0.0d) {
                        cz2.a("invalid weight; must be greater than zero");
                    }
                    if (1.2f > Float.MAX_VALUE) {
                        f2 = Float.MAX_VALUE;
                    }
                    yz3 S = n77.S(new ob3(f2, true), 14.0f, 10.0f);
                    xp0 a2 = vp0.a(new vr(5.0f, true, new ze0((byte) 6)), pk2.K, kd2Var, 6);
                    int hashCode3 = Long.hashCode(kd2Var.T);
                    al4 l3 = kd2Var.l();
                    yz3 E3 = o80.E(kd2Var, S);
                    kd2Var.h0();
                    if (kd2Var.S) {
                        kd2Var.k(t53Var);
                    } else {
                        kd2Var.q0();
                    }
                    ss5.i(st0Var, kd2Var, a2);
                    ss5.i(ys0Var, kd2Var, l3);
                    h11.q(hashCode3, kd2Var, st0Var2, kd2Var);
                    ss5.i(ys0Var2, kd2Var, E3);
                    yc6.b(downloadAnimeGroup.getAnimeTitle(), null, n03.r(kd2Var).o, 0L, null, null, 0L, null, 0L, 2, false, 3, 0, xd6.a(n03.y(kd2Var).k, 0L, s92.C, null, 0L, null, hz5.g(20), null, 16646139), kd2Var, 0, 24960, 110586);
                    int size = downloadAnimeGroup.getDownloads().size();
                    if (downloadAnimeGroup.getDownloads().size() == 1) {
                        str = "";
                    } else {
                        str = "s";
                    }
                    yc6.b(size + " episode" + str, null, ep0.b(0.65f, n03.r(kd2Var).o), 0L, null, null, 0L, null, 0L, 0, false, 0, 0, n03.y(kd2Var).i, kd2Var, 0, 0, 131066);
                    kd2Var.q(true);
                    kd2Var.q(true);
                    return pn6Var;
                }
                kd2Var.Y();
                return pn6Var;
            default:
                kd2 kd2Var2 = (kd2) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if ((intValue2 & 3) != 2) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (kd2Var2.V(intValue2 & 1, z2)) {
                    z22 z22Var2 = ar5.c;
                    vo3 c2 = b90.c(pk2.y, false);
                    int hashCode4 = Long.hashCode(kd2Var2.T);
                    al4 l4 = kd2Var2.l();
                    yz3 E4 = o80.E(kd2Var2, z22Var2);
                    tt0.d.getClass();
                    kd2Var2.h0();
                    if (kd2Var2.S) {
                        kd2Var2.k(t53Var);
                    } else {
                        kd2Var2.q0();
                    }
                    st0 st0Var3 = p7.F;
                    ss5.i(st0Var3, kd2Var2, c2);
                    ys0 ys0Var3 = p7.E;
                    ss5.i(ys0Var3, kd2Var2, l4);
                    Integer valueOf2 = Integer.valueOf(hashCode4);
                    st0 st0Var4 = p7.G;
                    ss5.i(st0Var4, kd2Var2, valueOf2);
                    ss5.h(kd2Var2);
                    ys0 ys0Var4 = p7.D;
                    ss5.i(ys0Var4, kd2Var2, E4);
                    tl7.a(this.z, this.y.getAnimeTitle(), n90.a.b(n03.k(oi4.E(vz3Var, 0.98f, 0.98f), ((cn5) kd2Var2.j(dn5.a)).c)), pk2.O, kd2Var2, 1572864);
                    if (this.A) {
                        kd2Var2.e0(-1438506183);
                        yz3 h = bx7.h(z22Var2, ep0.b(0.45f, ((mp0) kd2Var2.j(op0.a)).n), io3.h);
                        vo3 c3 = b90.c(pk2.C, false);
                        int hashCode5 = Long.hashCode(kd2Var2.T);
                        al4 l5 = kd2Var2.l();
                        yz3 E5 = o80.E(kd2Var2, h);
                        kd2Var2.h0();
                        if (kd2Var2.S) {
                            kd2Var2.k(t53Var);
                        } else {
                            kd2Var2.q0();
                        }
                        ss5.i(st0Var3, kd2Var2, c3);
                        ss5.i(ys0Var3, kd2Var2, l5);
                        h11.q(hashCode5, kd2Var2, st0Var4, kd2Var2);
                        ss5.i(ys0Var4, kd2Var2, E5);
                        sb2 sb2Var = this.C;
                        boolean f3 = kd2Var2.f(sb2Var);
                        Object Q = kd2Var2.Q();
                        if (f3 || Q == au0.a) {
                            Q = new mm(sb2Var, (byte) 0);
                            kd2Var2.n0(Q);
                        }
                        h98.a(this.B, (ub2) Q, null, kd2Var2, 0);
                        kd2Var2.q(true);
                        kd2Var2.q(false);
                    } else {
                        kd2Var2.e0(-1437908441);
                        kd2Var2.q(false);
                    }
                    kd2Var2.q(true);
                } else {
                    kd2Var2.Y();
                }
                return pn6Var;
        }
    }
}
