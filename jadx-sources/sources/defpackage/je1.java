package defpackage;

import com.anistation.android.R;
import com.anistation.model.NextAiringEpisode;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final /* synthetic */ class je1 implements ic2 {
    public final /* synthetic */ byte x;
    public final /* synthetic */ NextAiringEpisode y;
    public final /* synthetic */ long z;

    public /* synthetic */ je1(NextAiringEpisode nextAiringEpisode, long j, byte b) {
        this.x = b;
        this.y = nextAiringEpisode;
        this.z = j;
    }

    @Override // defpackage.ic2
    public final Object invoke(Object obj, Object obj2) {
        boolean z;
        boolean z2;
        io ioVar;
        int i;
        String g;
        int d;
        int i2;
        boolean z3;
        boolean z4;
        int i3;
        String g2;
        int i4;
        boolean z5;
        boolean z6;
        int i5;
        String g3;
        int i6;
        byte b = this.x;
        pn6 pn6Var = pn6.a;
        t53 t53Var = za3.p0;
        vz3 vz3Var = vz3.x;
        long j = this.z;
        NextAiringEpisode nextAiringEpisode = this.y;
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
                    yz3 c = ar5.c(vz3Var, 1.0f);
                    z75 a = y75.a(x97.A, pk2.I, kd2Var, 54);
                    int hashCode = Long.hashCode(kd2Var.T);
                    al4 l = kd2Var.l();
                    yz3 E = o80.E(kd2Var, c);
                    tt0.d.getClass();
                    kd2Var.h0();
                    if (kd2Var.S) {
                        kd2Var.k(t53Var);
                    } else {
                        kd2Var.q0();
                    }
                    ss5.i(p7.F, kd2Var, a);
                    ss5.i(p7.E, kd2Var, l);
                    ss5.i(p7.G, kd2Var, Integer.valueOf(hashCode));
                    ss5.h(kd2Var);
                    ss5.i(p7.D, kd2Var, E);
                    yt2.a(w65.H(R.drawable.schedule, kd2Var, 0), lz5.f(R.string.schedule, kd2Var), ar5.i(vz3Var, 20.0f), 0L, kd2Var, 392, 8);
                    ov5.a(kd2Var, ar5.l(vz3Var, 5.0f));
                    Long airingAt = nextAiringEpisode.getAiringAt();
                    if (airingAt == null) {
                        kd2Var.e0(-1177339756);
                        kd2Var.q(false);
                    } else {
                        kd2Var.e0(-1177339755);
                        long longValue = airingAt.longValue();
                        if (longValue * 1000 > j) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        kd2Var.e0(-1284899928);
                        ioVar = new io();
                        if (z2) {
                            kd2Var.e0(1036910524);
                            Integer episodeNumber = nextAiringEpisode.getEpisodeNumber();
                            if (episodeNumber != null) {
                                i2 = episodeNumber.intValue();
                            } else {
                                i2 = 1;
                            }
                            g = lz5.g(R.string.episode_airs, new Object[]{Integer.valueOf(i2)}, kd2Var);
                            kd2Var.q(false);
                        } else {
                            kd2Var.e0(1037219067);
                            Integer episodeNumber2 = nextAiringEpisode.getEpisodeNumber();
                            if (episodeNumber2 != null) {
                                i = episodeNumber2.intValue();
                            } else {
                                i = 1;
                            }
                            g = lz5.g(R.string.episode_aired, new Object[]{Integer.valueOf(i)}, kd2Var);
                            kd2Var.q(false);
                        }
                        ioVar.b(g);
                        d = ioVar.d(new pv5(ip0.m, 0L, (s92) null, (o92) null, (p92) null, (q82) null, (String) null, 0L, (z30) null, (oc6) null, (fk3) null, 0L, (g96) null, (km5) null, 65534));
                        try {
                            ioVar.b(e02.e(longValue));
                            ioVar.c(d);
                            ko e = ioVar.e();
                            kd2Var.q(false);
                            yc6.c(e, null, 0L, 0L, s92.C, 0L, null, 0L, 0, false, 0, 0, null, null, ((nl6) kd2Var.j(pl6.a)).k, kd2Var, 1572864, 0, 262078);
                            kd2Var.q(false);
                        } finally {
                        }
                    }
                    kd2Var.q(true);
                } else {
                    kd2Var.Y();
                }
                return pn6Var;
            case 1:
                kd2 kd2Var2 = (kd2) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if ((intValue2 & 3) != 2) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (kd2Var2.V(intValue2 & 1, z3)) {
                    yz3 c2 = ar5.c(vz3Var, 1.0f);
                    z75 a2 = y75.a(x97.A, pk2.I, kd2Var2, 54);
                    int hashCode2 = Long.hashCode(kd2Var2.T);
                    al4 l2 = kd2Var2.l();
                    yz3 E2 = o80.E(kd2Var2, c2);
                    tt0.d.getClass();
                    kd2Var2.h0();
                    if (kd2Var2.S) {
                        kd2Var2.k(t53Var);
                    } else {
                        kd2Var2.q0();
                    }
                    ss5.i(p7.F, kd2Var2, a2);
                    ss5.i(p7.E, kd2Var2, l2);
                    ss5.i(p7.G, kd2Var2, Integer.valueOf(hashCode2));
                    ss5.h(kd2Var2);
                    ss5.i(p7.D, kd2Var2, E2);
                    yt2.a(w65.H(R.drawable.schedule, kd2Var2, 0), null, ar5.i(vz3Var, 20.0f), 0L, kd2Var2, 440, 8);
                    ov5.a(kd2Var2, ar5.l(vz3Var, 5.0f));
                    Long airingAt2 = nextAiringEpisode.getAiringAt();
                    if (airingAt2 == null) {
                        kd2Var2.e0(1103452279);
                        kd2Var2.q(false);
                    } else {
                        kd2Var2.e0(1103452280);
                        long longValue2 = airingAt2.longValue();
                        if (longValue2 * 1000 > j) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        kd2Var2.e0(-795683639);
                        ioVar = new io();
                        if (z4) {
                            kd2Var2.e0(-1722231029);
                            Integer episodeNumber3 = nextAiringEpisode.getEpisodeNumber();
                            if (episodeNumber3 != null) {
                                i4 = episodeNumber3.intValue();
                            } else {
                                i4 = 1;
                            }
                            g2 = lz5.g(R.string.episode_airs, new Object[]{Integer.valueOf(i4)}, kd2Var2);
                            kd2Var2.q(false);
                        } else {
                            kd2Var2.e0(-1721902646);
                            Integer episodeNumber4 = nextAiringEpisode.getEpisodeNumber();
                            if (episodeNumber4 != null) {
                                i3 = episodeNumber4.intValue();
                            } else {
                                i3 = 1;
                            }
                            g2 = lz5.g(R.string.episode_aired, new Object[]{Integer.valueOf(i3)}, kd2Var2);
                            kd2Var2.q(false);
                        }
                        ioVar.b(g2);
                        d = ioVar.d(new pv5(ip0.m, 0L, (s92) null, (o92) null, (p92) null, (q82) null, (String) null, 0L, (z30) null, (oc6) null, (fk3) null, 0L, (g96) null, (km5) null, 65534));
                        try {
                            ioVar.b(e02.e(longValue2));
                            ioVar.c(d);
                            ko e2 = ioVar.e();
                            kd2Var2.q(false);
                            yc6.c(e2, null, 0L, 0L, s92.C, 0L, null, 0L, 0, false, 0, 0, null, null, ((nl6) kd2Var2.j(pl6.a)).k, kd2Var2, 1572864, 0, 262078);
                            kd2Var2.q(false);
                        } finally {
                        }
                    }
                    kd2Var2.q(true);
                } else {
                    kd2Var2.Y();
                }
                return pn6Var;
            default:
                kd2 kd2Var3 = (kd2) obj;
                int intValue3 = ((Integer) obj2).intValue();
                if ((intValue3 & 3) != 2) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                if (kd2Var3.V(intValue3 & 1, z5)) {
                    yz3 c3 = ar5.c(vz3Var, 1.0f);
                    z75 a3 = y75.a(x97.A, pk2.I, kd2Var3, 54);
                    int hashCode3 = Long.hashCode(kd2Var3.T);
                    al4 l3 = kd2Var3.l();
                    yz3 E3 = o80.E(kd2Var3, c3);
                    tt0.d.getClass();
                    kd2Var3.h0();
                    if (kd2Var3.S) {
                        kd2Var3.k(t53Var);
                    } else {
                        kd2Var3.q0();
                    }
                    ss5.i(p7.F, kd2Var3, a3);
                    ss5.i(p7.E, kd2Var3, l3);
                    ss5.i(p7.G, kd2Var3, Integer.valueOf(hashCode3));
                    ss5.h(kd2Var3);
                    ss5.i(p7.D, kd2Var3, E3);
                    yt2.a(w65.H(R.drawable.schedule, kd2Var3, 0), null, ar5.i(vz3Var, 20.0f), 0L, kd2Var3, 440, 8);
                    ov5.a(kd2Var3, ar5.l(vz3Var, 6.0f));
                    Long airingAt3 = nextAiringEpisode.getAiringAt();
                    if (airingAt3 == null) {
                        kd2Var3.e0(-1659634498);
                        kd2Var3.q(false);
                    } else {
                        kd2Var3.e0(-1659634497);
                        long longValue3 = airingAt3.longValue();
                        if (longValue3 * 1000 > j) {
                            z6 = true;
                        } else {
                            z6 = false;
                        }
                        kd2Var3.e0(-330626560);
                        ioVar = new io();
                        if (z6) {
                            kd2Var3.e0(-1898902908);
                            Integer episodeNumber5 = nextAiringEpisode.getEpisodeNumber();
                            if (episodeNumber5 != null) {
                                i6 = episodeNumber5.intValue();
                            } else {
                                i6 = 1;
                            }
                            g3 = lz5.g(R.string.episode_airs, new Object[]{Integer.valueOf(i6)}, kd2Var3);
                            kd2Var3.q(false);
                        } else {
                            kd2Var3.e0(-1898594365);
                            Integer episodeNumber6 = nextAiringEpisode.getEpisodeNumber();
                            if (episodeNumber6 != null) {
                                i5 = episodeNumber6.intValue();
                            } else {
                                i5 = 1;
                            }
                            g3 = lz5.g(R.string.episode_aired, new Object[]{Integer.valueOf(i5)}, kd2Var3);
                            kd2Var3.q(false);
                        }
                        ioVar.b(g3);
                        d = ioVar.d(new pv5(ip0.m, 0L, (s92) null, (o92) null, (p92) null, (q82) null, (String) null, 0L, (z30) null, (oc6) null, (fk3) null, 0L, (g96) null, (km5) null, 65534));
                        try {
                            ioVar.b(e02.e(longValue3));
                            ioVar.c(d);
                            ko e3 = ioVar.e();
                            kd2Var3.q(false);
                            yc6.c(e3, null, 0L, 0L, s92.C, 0L, new c86(3), 0L, 0, false, 0, 0, null, null, ((nl6) kd2Var3.j(pl6.a)).k, kd2Var3, 1572864, 0, 261054);
                            kd2Var3.q(false);
                        } finally {
                        }
                    }
                    kd2Var3.q(true);
                } else {
                    kd2Var3.Y();
                }
                return pn6Var;
        }
    }
}
