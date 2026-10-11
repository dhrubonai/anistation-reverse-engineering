package defpackage;

import com.anistation.model.Anime;
import com.anistation.model.MediaStatus;
import com.anistation.model.Recommendation;
import com.anistation.model.Relation;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final /* synthetic */ class fm implements ic2 {
    public final /* synthetic */ String A;
    public final /* synthetic */ Object B;
    public final /* synthetic */ byte x;
    public final /* synthetic */ Object y;
    public final /* synthetic */ long z;

    public /* synthetic */ fm(th4 th4Var, String str, long j, xd6 xd6Var) {
        this.x = (byte) 3;
        this.B = th4Var;
        this.A = str;
        this.z = j;
        this.y = xd6Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ic2
    public final Object invoke(Object obj, Object obj2) {
        boolean z;
        boolean z2;
        boolean z3;
        byte b = this.x;
        n90 n90Var = n90.a;
        t53 t53Var = za3.p0;
        q18 q18Var = au0.a;
        long j = this.z;
        pn6 pn6Var = pn6.a;
        Object obj3 = this.y;
        Object obj4 = this.B;
        boolean z4 = false;
        Object[] objArr = 0;
        switch (b) {
            case 0:
                Anime anime = (Anime) obj4;
                ev2 ev2Var = (ev2) obj3;
                kd2 kd2Var = (kd2) obj;
                int intValue = ((Integer) obj2).intValue();
                if ((intValue & 3) != 2) {
                    z = true;
                } else {
                    z = false;
                }
                if (kd2Var.V(intValue & 1, z)) {
                    String english = anime.getTitle().getEnglish();
                    cz0 cz0Var = pk2.O;
                    z22 z22Var = ar5.c;
                    tl7.a(ev2Var, english, z22Var, cz0Var, kd2Var, 1573248);
                    Object Q = kd2Var.Q();
                    if (Q == q18Var) {
                        Q = new pb(j, (byte) 1);
                        kd2Var.n0(Q);
                    }
                    yz3 x = nx7.x(z22Var, (ub2) Q);
                    vo3 c = b90.c(pk2.E, false);
                    int hashCode = Long.hashCode(kd2Var.T);
                    al4 l = kd2Var.l();
                    yz3 E = o80.E(kd2Var, x);
                    tt0.d.getClass();
                    kd2Var.h0();
                    if (kd2Var.S) {
                        kd2Var.k(t53Var);
                    } else {
                        kd2Var.q0();
                    }
                    st0 st0Var = p7.F;
                    ss5.i(st0Var, kd2Var, c);
                    ys0 ys0Var = p7.E;
                    ss5.i(ys0Var, kd2Var, l);
                    Integer valueOf = Integer.valueOf(hashCode);
                    st0 st0Var2 = p7.G;
                    ss5.i(st0Var2, kd2Var, valueOf);
                    ss5.h(kd2Var);
                    ys0 ys0Var2 = p7.D;
                    ss5.i(ys0Var2, kd2Var, E);
                    MediaStatus status = anime.getStatus();
                    MediaStatus mediaStatus = MediaStatus.RELEASING;
                    vz3 vz3Var = vz3.x;
                    if (status == mediaStatus) {
                        kd2Var.e0(1682633464);
                        n03.c(anime.getStatus().getLabel(), n90Var.a(n77.R(vz3Var, 10.0f), pk2.y), null, ip0.m, null, ep0.e, null, null, kd2Var, 196608, 212);
                        kd2Var.q(false);
                    } else {
                        kd2Var.e0(1682918354);
                        kd2Var.q(false);
                    }
                    yz3 V = n77.V(vz3Var, 10.0f, 0.0f, 10.0f, 10.0f, 2);
                    xp0 a = vp0.a(new vr(5.0f, true, new ze0((byte) 6)), pk2.K, kd2Var, 54);
                    int hashCode2 = Long.hashCode(kd2Var.T);
                    al4 l2 = kd2Var.l();
                    yz3 E2 = o80.E(kd2Var, V);
                    kd2Var.h0();
                    if (kd2Var.S) {
                        kd2Var.k(t53Var);
                    } else {
                        kd2Var.q0();
                    }
                    ss5.i(st0Var, kd2Var, a);
                    ss5.i(ys0Var, kd2Var, l2);
                    h11.q(hashCode2, kd2Var, st0Var2, kd2Var);
                    ss5.i(ys0Var2, kd2Var, E2);
                    yc6.b(this.A, null, ep0.e, 0L, null, null, 0L, null, 0L, 2, false, 2, 0, xd6.a(((nl6) kd2Var.j(pl6.a)).i, 0L, null, null, 0L, null, hz5.g(20), null, 16646143), kd2Var, 384, 24960, 110586);
                    q23.b(n77.V(vz3Var, 0.0f, 5.0f, 0.0f, 0.0f, 13), new vr(8.0f, true, new ze0((byte) 6)), x97.A, null, 0, 0, nx7.R(-521742635, new hm(anime, objArr == true ? 1 : 0), kd2Var), kd2Var, 1573302, 56);
                    kd2Var.q(true);
                    kd2Var.q(true);
                } else {
                    kd2Var.Y();
                }
                return pn6Var;
            case 1:
                Recommendation recommendation = (Recommendation) obj4;
                ev2 ev2Var2 = (ev2) obj3;
                kd2 kd2Var2 = (kd2) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if ((intValue2 & 3) != 2) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (kd2Var2.V(intValue2 & 1, z2)) {
                    String b2 = e02.b(recommendation.getTitle());
                    cz0 cz0Var2 = pk2.O;
                    z22 z22Var2 = ar5.c;
                    tl7.a(ev2Var2, b2, z22Var2, cz0Var2, kd2Var2, 1573248);
                    Object Q2 = kd2Var2.Q();
                    if (Q2 == q18Var) {
                        Q2 = new pb(j, (byte) 7);
                        kd2Var2.n0(Q2);
                    }
                    yz3 w = nx7.w(z22Var2, (ub2) Q2);
                    vo3 c2 = b90.c(pk2.E, false);
                    int hashCode3 = Long.hashCode(kd2Var2.T);
                    al4 l3 = kd2Var2.l();
                    yz3 E3 = o80.E(kd2Var2, w);
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
                    ss5.i(ys0Var3, kd2Var2, l3);
                    Integer valueOf2 = Integer.valueOf(hashCode3);
                    st0 st0Var4 = p7.G;
                    ss5.i(st0Var4, kd2Var2, valueOf2);
                    ss5.h(kd2Var2);
                    ys0 ys0Var4 = p7.D;
                    ss5.i(ys0Var4, kd2Var2, E3);
                    MediaStatus status2 = recommendation.getStatus();
                    MediaStatus mediaStatus2 = MediaStatus.RELEASING;
                    vz3 vz3Var2 = vz3.x;
                    if (status2 == mediaStatus2) {
                        kd2Var2.e0(1067007019);
                        n03.c(recommendation.getStatus().getLabel(), n77.R(n90Var.a(vz3Var2, pk2.y), 10.0f), null, ip0.m, null, ep0.e, null, null, kd2Var2, 196608, 212);
                        kd2Var2.q(false);
                    } else {
                        kd2Var2.e0(1067300558);
                        kd2Var2.q(false);
                    }
                    yz3 V2 = n77.V(vz3Var2, 10.0f, 0.0f, 10.0f, 10.0f, 2);
                    xp0 a2 = vp0.a(new vr(5.0f, true, new ze0((byte) 6)), pk2.K, kd2Var2, 54);
                    int hashCode4 = Long.hashCode(kd2Var2.T);
                    al4 l4 = kd2Var2.l();
                    yz3 E4 = o80.E(kd2Var2, V2);
                    kd2Var2.h0();
                    if (kd2Var2.S) {
                        kd2Var2.k(t53Var);
                    } else {
                        kd2Var2.q0();
                    }
                    ss5.i(st0Var3, kd2Var2, a2);
                    ss5.i(ys0Var3, kd2Var2, l4);
                    h11.q(hashCode4, kd2Var2, st0Var4, kd2Var2);
                    ss5.i(ys0Var4, kd2Var2, E4);
                    yc6.b(this.A, null, ep0.e, 0L, null, null, 0L, null, 0L, 2, false, 2, 0, ((nl6) kd2Var2.j(pl6.a)).i, kd2Var2, 384, 24960, 110586);
                    q23.b(n77.V(vz3Var2, 0.0f, 5.0f, 0.0f, 0.0f, 13), new vr(8.0f, true, new ze0((byte) 6)), x97.A, null, 0, 0, nx7.R(-378344273, new fr5((Object) recommendation, (byte) 14), kd2Var2), kd2Var2, 1573302, 56);
                    kd2Var2.q(true);
                    kd2Var2.q(true);
                } else {
                    kd2Var2.Y();
                }
                return pn6Var;
            case 2:
                Relation relation = (Relation) obj4;
                ev2 ev2Var3 = (ev2) obj3;
                kd2 kd2Var3 = (kd2) obj;
                int intValue3 = ((Integer) obj2).intValue();
                if ((intValue3 & 3) != 2) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (kd2Var3.V(intValue3 & 1, z3)) {
                    String b3 = e02.b(relation.getTitle());
                    cz0 cz0Var3 = pk2.O;
                    z22 z22Var3 = ar5.c;
                    tl7.a(ev2Var3, b3, z22Var3, cz0Var3, kd2Var3, 1573248);
                    Object Q3 = kd2Var3.Q();
                    if (Q3 == q18Var) {
                        Q3 = new pb(j, (byte) 8);
                        kd2Var3.n0(Q3);
                    }
                    yz3 w2 = nx7.w(z22Var3, (ub2) Q3);
                    vo3 c3 = b90.c(pk2.E, false);
                    int hashCode5 = Long.hashCode(kd2Var3.T);
                    al4 l5 = kd2Var3.l();
                    yz3 E5 = o80.E(kd2Var3, w2);
                    tt0.d.getClass();
                    kd2Var3.h0();
                    if (kd2Var3.S) {
                        kd2Var3.k(t53Var);
                    } else {
                        kd2Var3.q0();
                    }
                    st0 st0Var5 = p7.F;
                    ss5.i(st0Var5, kd2Var3, c3);
                    ys0 ys0Var5 = p7.E;
                    ss5.i(ys0Var5, kd2Var3, l5);
                    Integer valueOf3 = Integer.valueOf(hashCode5);
                    st0 st0Var6 = p7.G;
                    ss5.i(st0Var6, kd2Var3, valueOf3);
                    ss5.h(kd2Var3);
                    ys0 ys0Var6 = p7.D;
                    ss5.i(ys0Var6, kd2Var3, E5);
                    MediaStatus status3 = relation.getStatus();
                    MediaStatus mediaStatus3 = MediaStatus.RELEASING;
                    vz3 vz3Var3 = vz3.x;
                    if (status3 == mediaStatus3) {
                        kd2Var3.e0(-1203356460);
                        n03.c(relation.getStatus().getLabel(), n77.R(n90Var.a(vz3Var3, pk2.y), 10.0f), null, ip0.m, null, ep0.e, null, null, kd2Var3, 196608, 212);
                        kd2Var3.q(false);
                    } else {
                        kd2Var3.e0(-1203068687);
                        kd2Var3.q(false);
                    }
                    yz3 V3 = n77.V(vz3Var3, 10.0f, 0.0f, 10.0f, 10.0f, 2);
                    xp0 a3 = vp0.a(new vr(5.0f, true, new ze0((byte) 6)), pk2.K, kd2Var3, 54);
                    int hashCode6 = Long.hashCode(kd2Var3.T);
                    al4 l6 = kd2Var3.l();
                    yz3 E6 = o80.E(kd2Var3, V3);
                    kd2Var3.h0();
                    if (kd2Var3.S) {
                        kd2Var3.k(t53Var);
                    } else {
                        kd2Var3.q0();
                    }
                    ss5.i(st0Var5, kd2Var3, a3);
                    ss5.i(ys0Var5, kd2Var3, l6);
                    h11.q(hashCode6, kd2Var3, st0Var6, kd2Var3);
                    ss5.i(ys0Var6, kd2Var3, E6);
                    String a4 = e02.a(relation.getRelationType(), true);
                    if (a4 == null) {
                        a4 = "N/A";
                    }
                    String str = a4;
                    tq1 tq1Var = pl6.a;
                    xd6 xd6Var = ((nl6) kd2Var3.j(tq1Var)).l;
                    long j2 = ep0.e;
                    yc6.b(str, null, j2, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, xd6Var, kd2Var3, 384, 0, 131066);
                    yc6.b(this.A, null, j2, 0L, null, null, 0L, null, 0L, 2, false, 2, 0, ((nl6) kd2Var3.j(tq1Var)).i, kd2Var3, 384, 24960, 110586);
                    q23.b(n77.V(vz3Var3, 0.0f, 5.0f, 0.0f, 0.0f, 13), new vr(8.0f, true, new ze0((byte) 6)), x97.A, null, 0, 0, nx7.R(-1019883604, new fr5((Object) relation, (byte) 15), kd2Var3), kd2Var3, 1573302, 56);
                    kd2Var3.q(true);
                    kd2Var3.q(true);
                } else {
                    kd2Var3.Y();
                }
                return pn6Var;
            default:
                th4 th4Var = (th4) obj4;
                xd6 xd6Var2 = (xd6) obj3;
                kd2 kd2Var4 = (kd2) obj;
                int intValue4 = ((Integer) obj2).intValue();
                if ((intValue4 & 3) != 2) {
                    z4 = true;
                }
                if (kd2Var4.V(intValue4 & 1, z4)) {
                    yc6.b(this.A, n77.Q(vz3.x, th4Var), this.z, 0L, s92.C, null, 0L, null, 0L, 1, false, 0, 0, xd6Var2, kd2Var4, 1572864, 3456, 118712);
                } else {
                    kd2Var4.Y();
                }
                return pn6Var;
        }
    }

    public /* synthetic */ fm(Object obj, ev2 ev2Var, long j, String str, byte b) {
        this.x = b;
        this.B = obj;
        this.y = ev2Var;
        this.z = j;
        this.A = str;
    }
}
