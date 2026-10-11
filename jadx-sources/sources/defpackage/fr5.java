package defpackage;

import android.os.Bundle;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import com.anistation.android.R;
import com.anistation.model.MediaFormat;
import com.anistation.model.MediaStatus;
import com.anistation.model.Recommendation;
import com.anistation.model.Relation;
import com.anistation.model.download.DownloadStorageUsage;
import com.anistation.model.library.AnimeListItem;
import com.anistation.model.schedule.AnimeSchedule;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;
import java.util.Set;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final /* synthetic */ class fr5 implements jc2 {
    public final /* synthetic */ byte x;
    public final /* synthetic */ Object y;

    public /* synthetic */ fr5(m54 m54Var, l54 l54Var) {
        this.x = (byte) 10;
        this.y = m54Var;
    }

    @Override // defpackage.jc2
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        boolean z;
        y50 y50Var;
        String str;
        boolean z2;
        boolean z3;
        kd2 kd2Var;
        String str2;
        String label;
        String str3;
        String label2;
        boolean z4;
        eg3 eg3Var;
        int i;
        boolean z5;
        boolean z6;
        boolean h;
        boolean z7;
        boolean z8;
        String str4;
        String valueOf;
        String str5;
        String valueOf2;
        boolean z9;
        int i2;
        String str6;
        String valueOf3;
        p96 d;
        byte b = this.x;
        byte b2 = 13;
        final byte b3 = 3;
        vz3 vz3Var = vz3.x;
        byte b4 = 18;
        final byte b5 = 2;
        q18 q18Var = au0.a;
        pn6 pn6Var = pn6.a;
        final byte b6 = 1;
        r7 = true;
        r7 = true;
        boolean z10 = true;
        boolean z11 = true;
        boolean z12 = false;
        boolean z13 = false;
        boolean z14 = false;
        boolean z15 = false;
        boolean z16 = false;
        boolean z17 = false;
        Object obj4 = this.y;
        switch (b) {
            case 0:
                er5 er5Var = (er5) obj4;
                kd2 kd2Var2 = (kd2) obj2;
                int intValue = ((Integer) obj3).intValue();
                ((el) obj).getClass();
                if ((intValue & 17) != 16) {
                    z = true;
                } else {
                    z = false;
                }
                if (kd2Var2.V(intValue & 1, z)) {
                    if (er5Var != null) {
                        boolean z18 = er5Var.a;
                        z22 z22Var = ar5.c;
                        vo3 c = b90.c(pk2.y, false);
                        int hashCode = Long.hashCode(kd2Var2.T);
                        al4 l = kd2Var2.l();
                        yz3 E = o80.E(kd2Var2, z22Var);
                        tt0.d.getClass();
                        kd2Var2.h0();
                        boolean z19 = kd2Var2.S;
                        t53 t53Var = za3.p0;
                        if (z19) {
                            kd2Var2.k(t53Var);
                        } else {
                            kd2Var2.q0();
                        }
                        st0 st0Var = p7.F;
                        ss5.i(st0Var, kd2Var2, c);
                        ys0 ys0Var = p7.E;
                        ss5.i(ys0Var, kd2Var2, l);
                        Integer valueOf4 = Integer.valueOf(hashCode);
                        st0 st0Var2 = p7.G;
                        ss5.i(st0Var2, kd2Var2, valueOf4);
                        ss5.h(kd2Var2);
                        ys0 ys0Var2 = p7.D;
                        ss5.i(ys0Var2, kd2Var2, E);
                        yz3 c2 = ar5.c(ar5.b, 0.45f);
                        if (z18) {
                            y50Var = pk2.D;
                        } else {
                            y50Var = pk2.B;
                        }
                        yz3 a = n90.a.a(c2, y50Var);
                        vo3 c3 = b90.c(pk2.C, false);
                        int hashCode2 = Long.hashCode(kd2Var2.T);
                        al4 l2 = kd2Var2.l();
                        yz3 E2 = o80.E(kd2Var2, a);
                        kd2Var2.h0();
                        if (kd2Var2.S) {
                            kd2Var2.k(t53Var);
                        } else {
                            kd2Var2.q0();
                        }
                        ss5.i(st0Var, kd2Var2, c3);
                        ss5.i(ys0Var, kd2Var2, l2);
                        h11.q(hashCode2, kd2Var2, st0Var2, kd2Var2);
                        ss5.i(ys0Var2, kd2Var2, E2);
                        xp0 a2 = vp0.a(x97.A, pk2.L, kd2Var2, 54);
                        int hashCode3 = Long.hashCode(kd2Var2.T);
                        al4 l3 = kd2Var2.l();
                        yz3 E3 = o80.E(kd2Var2, vz3Var);
                        kd2Var2.h0();
                        if (kd2Var2.S) {
                            kd2Var2.k(t53Var);
                        } else {
                            kd2Var2.q0();
                        }
                        ss5.i(st0Var, kd2Var2, a2);
                        ss5.i(ys0Var, kd2Var2, l3);
                        h11.q(hashCode3, kd2Var2, st0Var2, kd2Var2);
                        ss5.i(ys0Var2, kd2Var2, E3);
                        t80.k(z18, null, kd2Var2, 0);
                        ov5.a(kd2Var2, ar5.e(vz3Var, 6.0f));
                        int i3 = er5Var.b;
                        if (z18) {
                            str = "+";
                        } else {
                            str = "-";
                        }
                        yc6.b(qx1.i(i3, str, " sec"), null, ep0.e, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, xd6.a(((nl6) kd2Var2.j(pl6.a)).k, 0L, s92.C, null, 0L, new km5(2.0f, ep0.b(0.6f, ep0.b), (Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(0.0f) & 4294967295L)), 0L, null, 16769019), kd2Var2, 384, 0, 131066);
                        kd2Var2.q(true);
                        kd2Var2.q(true);
                        kd2Var2.q(true);
                    }
                } else {
                    kd2Var2.Y();
                }
                return pn6Var;
            case 1:
                wf wfVar = (wf) obj4;
                kd2 kd2Var3 = (kd2) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                ((yp0) obj).getClass();
                if ((intValue2 & 17) != 16) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (kd2Var3.V(intValue2 & 1, z2)) {
                    String f = lz5.f(R.string.anistation_discord, kd2Var3);
                    String f2 = lz5.f(R.string.official_anistation_discord_desc, kd2Var3);
                    boolean h2 = kd2Var3.h(wfVar);
                    Object Q = kd2Var3.Q();
                    if (h2 || Q == q18Var) {
                        Q = new m(wfVar, (byte) 0);
                        kd2Var3.n0(Q);
                    }
                    u.a(R.drawable.discord, f, f2, null, false, (sb2) Q, kd2Var3, 24576);
                } else {
                    kd2Var3.Y();
                }
                return pn6Var;
            case 2:
                AnimeListItem animeListItem = (AnimeListItem) obj4;
                kd2 kd2Var4 = (kd2) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                ((t62) obj).getClass();
                if ((intValue3 & 17) != 16) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (kd2Var4.V(intValue3 & 1, z3)) {
                    if (animeListItem.getMediaStatus() == MediaStatus.RELEASING) {
                        kd2Var4.e0(1525862718);
                        MediaStatus mediaStatus = animeListItem.getMediaStatus();
                        if (mediaStatus == null || (label2 = mediaStatus.getLabel()) == null) {
                            str3 = "N/A";
                        } else {
                            str3 = label2;
                        }
                        n03.c(str3, null, null, ip0.m, null, ep0.e, null, tm5.b, kd2Var4, 196608, 86);
                        kd2Var = kd2Var4;
                        kd2Var.q(false);
                    } else {
                        kd2Var = kd2Var4;
                        kd2Var.e0(1526172160);
                        kd2Var.q(false);
                    }
                    String label3 = animeListItem.getWatchStatus().getLabel();
                    tq1 tq1Var = op0.a;
                    long j = ((mp0) kd2Var.j(tq1Var)).o;
                    long j2 = ((mp0) kd2Var.j(tq1Var)).n;
                    o75 o75Var = tm5.b;
                    n03.c(label3, null, null, j, null, j2, null, o75Var, kd2Var, 0, 86);
                    MediaFormat format = animeListItem.getFormat();
                    if (format == null || (label = format.getLabel()) == null) {
                        str2 = "N/A";
                    } else {
                        str2 = label;
                    }
                    n03.c(str2, null, null, ((mp0) kd2Var.j(tq1Var)).r, null, ((mp0) kd2Var.j(tq1Var)).o, null, o75Var, kd2Var, 0, 86);
                } else {
                    kd2Var4.Y();
                }
                return pn6Var;
            case 3:
                w44 w44Var = (w44) obj4;
                final j74 j74Var = (j74) obj;
                kd2 kd2Var5 = (kd2) obj2;
                int intValue4 = ((Integer) obj3).intValue();
                if ((intValue4 & 6) == 0) {
                    if (kd2Var5.f(j74Var)) {
                        b5 = 4;
                    }
                    intValue4 |= b5;
                }
                if ((intValue4 & 19) != 18) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (kd2Var5.V(intValue4 & 1, z4)) {
                    List list = (List) w44Var.getValue();
                    if ((intValue4 & 14) != 4) {
                        b6 = 0;
                    }
                    Object Q2 = kd2Var5.Q();
                    if (b6 != 0 || Q2 == q18Var) {
                        Q2 = new l0(j74Var, (byte) 15);
                        kd2Var5.n0(Q2);
                    }
                    ub2 ub2Var = (ub2) Q2;
                    if (list instanceof RandomAccess) {
                        int size = list.size();
                        for (int i4 = 0; i4 < size; i4++) {
                            if (((Boolean) ub2Var.invoke(list.get(i4))).booleanValue()) {
                                eg3Var = eg3.B;
                            }
                        }
                        eg3Var = eg3.z;
                    } else {
                        if (list == null || !list.isEmpty()) {
                            Iterator it = list.iterator();
                            while (it.hasNext()) {
                                if (((Boolean) ub2Var.invoke(it.next())).booleanValue()) {
                                    eg3Var = eg3.B;
                                }
                            }
                        }
                        eg3Var = eg3.z;
                    }
                    mw4 a3 = vj3.a.a(bb4.M(eg3Var, kd2Var5));
                    final byte b7 = false ? (byte) 1 : (byte) 0;
                    kb0.b(a3, nx7.R(-1713684244, new ic2() { // from class: tz
                        @Override // defpackage.ic2
                        public final Object invoke(Object obj5, Object obj6) {
                            boolean z20;
                            boolean z21;
                            boolean z22;
                            boolean z23;
                            byte b8 = b7;
                            pn6 pn6Var2 = pn6.a;
                            j74 j74Var2 = j74Var;
                            kd2 kd2Var6 = (kd2) obj5;
                            int intValue5 = ((Integer) obj6).intValue();
                            switch (b8) {
                                case 0:
                                    if ((intValue5 & 3) != 2) {
                                        z20 = true;
                                    } else {
                                        z20 = false;
                                    }
                                    if (kd2Var6.V(intValue5 & 1, z20)) {
                                        j74Var2.a(0, kd2Var6);
                                    } else {
                                        kd2Var6.Y();
                                    }
                                    return pn6Var2;
                                case 1:
                                    if ((intValue5 & 3) != 2) {
                                        z21 = true;
                                    } else {
                                        z21 = false;
                                    }
                                    if (kd2Var6.V(intValue5 & 1, z21)) {
                                        j74Var2.a(0, kd2Var6);
                                    } else {
                                        kd2Var6.Y();
                                    }
                                    return pn6Var2;
                                case 2:
                                    if ((intValue5 & 3) != 2) {
                                        z22 = true;
                                    } else {
                                        z22 = false;
                                    }
                                    if (kd2Var6.V(intValue5 & 1, z22)) {
                                        j74Var2.a(0, kd2Var6);
                                    } else {
                                        kd2Var6.Y();
                                    }
                                    return pn6Var2;
                                default:
                                    if ((intValue5 & 3) != 2) {
                                        z23 = true;
                                    } else {
                                        z23 = false;
                                    }
                                    if (kd2Var6.V(intValue5 & 1, z23)) {
                                        j74Var2.a(0, kd2Var6);
                                    } else {
                                        kd2Var6.Y();
                                    }
                                    return pn6Var2;
                            }
                        }
                    }, kd2Var5), kd2Var5, 56);
                } else {
                    kd2Var5.Y();
                }
                return pn6Var;
            case 4:
                xo3 xo3Var = (xo3) obj;
                ro3 ro3Var = (ro3) obj2;
                float f3 = ((vm1) ((dd6) obj4).f.getValue()).x;
                int x0 = xo3Var.x0(f3);
                long j3 = ((rx0) obj3).a;
                if (vm1.c(f3, 0.0f)) {
                    i = Integer.MAX_VALUE;
                } else {
                    i = x0;
                }
                em4 p = ro3Var.p(sx0.e(j3, sx0.a(0, Integer.MAX_VALUE, x0, i)));
                return xo3Var.L(p.x, p.y, ot1.x, new r0(p, (byte) 4));
            case 5:
                return new ao(obj3, (za0) obj4, (ng5) obj, b6);
            case 6:
                ((pz3) obj4).invoke((Throwable) obj);
                return pn6Var;
            case 7:
                e11 e11Var = (e11) obj4;
                int intValue5 = ((Integer) obj).intValue();
                int intValue6 = ((Integer) obj2).intValue();
                boolean booleanValue = ((Boolean) obj3).booleanValue();
                if (!booleanValue) {
                    e11Var.R.c(intValue5);
                }
                if (!booleanValue) {
                    e11Var.R.c(intValue6);
                }
                if (e11Var.Q) {
                    long j4 = e11Var.O.b;
                    int i5 = nd6.c;
                    if (intValue5 != ((int) (j4 >> 32)) || intValue6 != ((int) (j4 & 4294967295L))) {
                        int min = Math.min(intValue5, intValue6);
                        hj2 hj2Var = hj2.x;
                        if (min >= 0 && Math.max(intValue5, intValue6) <= e11Var.O.a.y.length()) {
                            if (!booleanValue && intValue5 != intValue6) {
                                e11Var.S.e(true);
                            } else {
                                jb6 jb6Var = e11Var.S;
                                jb6Var.u(false);
                                jb6Var.r(hj2Var);
                            }
                            e11Var.P.v.invoke(new mc6(e11Var.O.a, fy5.a(intValue5, intValue6), (nd6) null));
                            return Boolean.valueOf(z11);
                        }
                        jb6 jb6Var2 = e11Var.S;
                        jb6Var2.u(false);
                        jb6Var2.r(hj2Var);
                    }
                }
                z11 = false;
                return Boolean.valueOf(z11);
            case 8:
                DownloadStorageUsage downloadStorageUsage = (DownloadStorageUsage) obj4;
                kd2 kd2Var6 = (kd2) obj2;
                int intValue7 = ((Integer) obj3).intValue();
                ((zc3) obj).getClass();
                if ((intValue7 & 17) != 16) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                if (kd2Var6.V(intValue7 & 1, z5)) {
                    sl1.a(downloadStorageUsage, kd2Var6, 0);
                } else {
                    kd2Var6.Y();
                }
                return pn6Var;
            case 9:
                i14 i14Var = (i14) obj4;
                kd2 kd2Var7 = (kd2) obj2;
                int intValue8 = ((Integer) obj3).intValue();
                if ((intValue8 & 6) == 0) {
                    if ((intValue8 & 8) == 0) {
                        h = kd2Var7.f(obj);
                    } else {
                        h = kd2Var7.h(obj);
                    }
                    if (h) {
                        b5 = 4;
                    }
                    intValue8 |= b5;
                }
                if ((intValue8 & 19) != 18) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                if (kd2Var7.V(intValue8 & 1, z6)) {
                    kd2Var7.H(i14Var, kd2Var7.l(), obj, false);
                } else {
                    kd2Var7.Y();
                }
                return pn6Var;
            case 10:
                m54 m54Var = (m54) obj4;
                m54.F.set(m54Var, null);
                m54Var.l(null);
                return pn6Var;
            case 11:
                p90 p90Var = (p90) obj4;
                kd2 kd2Var8 = (kd2) obj2;
                int intValue9 = ((Integer) obj3).intValue();
                ((fc3) obj).getClass();
                if ((intValue9 & 17) != 16) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                if (kd2Var8.V(intValue9 & 1, z7)) {
                    yz3 c4 = ar5.c(ar5.e(vz3Var, p90Var.b() - 180.0f), 1.0f);
                    vo3 c5 = b90.c(pk2.C, false);
                    int hashCode4 = Long.hashCode(kd2Var8.T);
                    al4 l4 = kd2Var8.l();
                    yz3 E4 = o80.E(kd2Var8, c4);
                    tt0.d.getClass();
                    kd2Var8.h0();
                    if (kd2Var8.S) {
                        kd2Var8.k(za3.p0);
                    } else {
                        kd2Var8.q0();
                    }
                    ss5.i(p7.F, kd2Var8, c5);
                    ss5.i(p7.E, kd2Var8, l4);
                    ss5.i(p7.G, kd2Var8, Integer.valueOf(hashCode4));
                    ss5.h(kd2Var8);
                    ss5.i(p7.D, kd2Var8, E4);
                    h98.d(lz5.f(R.string.nothing_here_yet, kd2Var8), lz5.f(R.string.no_anime_in_this_status, kd2Var8), null, kd2Var8, 0, 4);
                    kd2Var8.q(true);
                } else {
                    kd2Var8.Y();
                }
                return pn6Var;
            case 12:
                String str7 = (String) obj4;
                kd2 kd2Var9 = (kd2) obj2;
                int intValue10 = ((Integer) obj3).intValue();
                ((el) obj).getClass();
                if ((intValue10 & 17) != 16) {
                    z12 = true;
                }
                if (kd2Var9.V(intValue10 & 1, z12)) {
                    if (str7 == null) {
                        str7 = "";
                    }
                    yc6.b(str7, null, ep0.e, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, xd6.a(((nl6) kd2Var9.j(pl6.a)).l, hz5.g(13), s92.C, null, 0L, new km5(2.0f, ep0.b(0.6f, ep0.b), (Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(0.0f) & 4294967295L)), 0L, null, 16769017), kd2Var9, 384, 0, 131066);
                } else {
                    kd2Var9.Y();
                }
                return pn6Var;
            case 13:
                px5 px5Var = (px5) obj4;
                kd2 kd2Var10 = (kd2) obj2;
                int intValue11 = ((Integer) obj3).intValue();
                ((tr5) obj).getClass();
                if ((intValue11 & 17) != 16) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                if (kd2Var10.V(intValue11 & 1, z8)) {
                    yz3 i6 = ar5.i(vz3Var, 15.0f);
                    boolean f4 = kd2Var10.f(px5Var);
                    Object Q3 = kd2Var10.Q();
                    if (f4 || Q3 == q18Var) {
                        Q3 = new qh(px5Var, b3);
                        kd2Var10.n0(Q3);
                    }
                    b90.a(bx7.h(wk6.F(io3.O(i6, (ub2) Q3), 4.0f, tm5.b), ((mp0) kd2Var10.j(op0.a)).a, io3.h), kd2Var10, 0);
                } else {
                    kd2Var10.Y();
                }
                return pn6Var;
            case 14:
                Recommendation recommendation = (Recommendation) obj4;
                kd2 kd2Var11 = (kd2) obj2;
                int intValue12 = ((Integer) obj3).intValue();
                ((t62) obj).getClass();
                if ((intValue12 & 17) != 16) {
                    z17 = true;
                }
                if (kd2Var11.V(intValue12 & 1, z17)) {
                    String label4 = recommendation.getFormat().getLabel();
                    long j5 = ep0.e;
                    n03.c(label4, null, null, j5, null, ep0.b, null, null, kd2Var11, 199680, 214);
                    Integer seasonYear = recommendation.getSeasonYear();
                    if (seasonYear == null || (valueOf = String.valueOf(seasonYear.intValue())) == null) {
                        str4 = "N/A";
                    } else {
                        str4 = valueOf;
                    }
                    n03.c(str4, null, null, ep0.c, new s70(1.0f, new su5(ep0.b(0.2f, j5))), j5, null, null, kd2Var11, 224256, 198);
                } else {
                    kd2Var11.Y();
                }
                return pn6Var;
            case 15:
                Relation relation = (Relation) obj4;
                kd2 kd2Var12 = (kd2) obj2;
                int intValue13 = ((Integer) obj3).intValue();
                ((t62) obj).getClass();
                if ((intValue13 & 17) != 16) {
                    z16 = true;
                }
                if (kd2Var12.V(intValue13 & 1, z16)) {
                    String label5 = relation.getFormat().getLabel();
                    long j6 = ep0.e;
                    n03.c(label5, null, null, j6, null, ep0.b, null, null, kd2Var12, 199680, 214);
                    Integer seasonYear2 = relation.getSeasonYear();
                    if (seasonYear2 == null || (valueOf2 = String.valueOf(seasonYear2.intValue())) == null) {
                        str5 = "N/A";
                    } else {
                        str5 = valueOf2;
                    }
                    n03.c(str5, null, null, ep0.c, new s70(1.0f, new su5(ep0.b(0.2f, j6))), j6, null, null, kd2Var12, 224256, 198);
                } else {
                    kd2Var12.Y();
                }
                return pn6Var;
            case 16:
                j95 j95Var = (j95) obj4;
                final j74 j74Var2 = (j74) obj;
                kd2 kd2Var13 = (kd2) obj2;
                int intValue14 = ((Integer) obj3).intValue();
                if ((intValue14 & 6) == 0) {
                    if (kd2Var13.f(j74Var2)) {
                        b5 = 4;
                    }
                    intValue14 |= b5;
                }
                if ((intValue14 & 19) != 18) {
                    z15 = true;
                }
                if (kd2Var13.V(intValue14 & 1, z15)) {
                    j95Var.e(j74Var2.b, nx7.R(121262920, new ic2() { // from class: tz
                        @Override // defpackage.ic2
                        public final Object invoke(Object obj5, Object obj6) {
                            boolean z20;
                            boolean z21;
                            boolean z22;
                            boolean z23;
                            byte b8 = b6;
                            pn6 pn6Var2 = pn6.a;
                            j74 j74Var22 = j74Var2;
                            kd2 kd2Var62 = (kd2) obj5;
                            int intValue52 = ((Integer) obj6).intValue();
                            switch (b8) {
                                case 0:
                                    if ((intValue52 & 3) != 2) {
                                        z20 = true;
                                    } else {
                                        z20 = false;
                                    }
                                    if (kd2Var62.V(intValue52 & 1, z20)) {
                                        j74Var22.a(0, kd2Var62);
                                    } else {
                                        kd2Var62.Y();
                                    }
                                    return pn6Var2;
                                case 1:
                                    if ((intValue52 & 3) != 2) {
                                        z21 = true;
                                    } else {
                                        z21 = false;
                                    }
                                    if (kd2Var62.V(intValue52 & 1, z21)) {
                                        j74Var22.a(0, kd2Var62);
                                    } else {
                                        kd2Var62.Y();
                                    }
                                    return pn6Var2;
                                case 2:
                                    if ((intValue52 & 3) != 2) {
                                        z22 = true;
                                    } else {
                                        z22 = false;
                                    }
                                    if (kd2Var62.V(intValue52 & 1, z22)) {
                                        j74Var22.a(0, kd2Var62);
                                    } else {
                                        kd2Var62.Y();
                                    }
                                    return pn6Var2;
                                default:
                                    if ((intValue52 & 3) != 2) {
                                        z23 = true;
                                    } else {
                                        z23 = false;
                                    }
                                    if (kd2Var62.V(intValue52 & 1, z23)) {
                                        j74Var22.a(0, kd2Var62);
                                    } else {
                                        kd2Var62.Y();
                                    }
                                    return pn6Var2;
                            }
                        }
                    }, kd2Var13), kd2Var13, 48);
                } else {
                    kd2Var13.Y();
                }
                return pn6Var;
            case 17:
                bu5 bu5Var = (bu5) obj4;
                final j74 j74Var3 = (j74) obj;
                kd2 kd2Var14 = (kd2) obj2;
                int intValue15 = ((Integer) obj3).intValue();
                if ((intValue15 & 6) == 0) {
                    if (kd2Var14.f(j74Var3)) {
                        i2 = 4;
                    } else {
                        i2 = 2;
                    }
                    intValue15 |= i2;
                }
                if ((intValue15 & 19) != 18) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                if (kd2Var14.V(intValue15 & 1, z9)) {
                    Object obj5 = j74Var3.b;
                    if (!((Set) kd2Var14.j(jb5.a)).contains(obj5)) {
                        kd2Var14.e0(1574916499);
                        kd2Var14.c0(1159182959, obj5);
                        Object Q4 = kd2Var14.Q();
                        if (Q4 == q18Var) {
                            Object obj6 = bu5Var.get(obj5);
                            if (obj6 == null) {
                                obj6 = new os0(1032736913, true, new fr5(new Object(), (byte) 9));
                                bu5Var.put(obj5, obj6);
                            }
                            Q4 = (jc2) obj6;
                            kd2Var14.n0(Q4);
                        }
                        ((jc2) Q4).invoke(nx7.R(-804085656, new ic2() { // from class: tz
                            @Override // defpackage.ic2
                            public final Object invoke(Object obj52, Object obj62) {
                                boolean z20;
                                boolean z21;
                                boolean z22;
                                boolean z23;
                                byte b8 = b5;
                                pn6 pn6Var2 = pn6.a;
                                j74 j74Var22 = j74Var3;
                                kd2 kd2Var62 = (kd2) obj52;
                                int intValue52 = ((Integer) obj62).intValue();
                                switch (b8) {
                                    case 0:
                                        if ((intValue52 & 3) != 2) {
                                            z20 = true;
                                        } else {
                                            z20 = false;
                                        }
                                        if (kd2Var62.V(intValue52 & 1, z20)) {
                                            j74Var22.a(0, kd2Var62);
                                        } else {
                                            kd2Var62.Y();
                                        }
                                        return pn6Var2;
                                    case 1:
                                        if ((intValue52 & 3) != 2) {
                                            z21 = true;
                                        } else {
                                            z21 = false;
                                        }
                                        if (kd2Var62.V(intValue52 & 1, z21)) {
                                            j74Var22.a(0, kd2Var62);
                                        } else {
                                            kd2Var62.Y();
                                        }
                                        return pn6Var2;
                                    case 2:
                                        if ((intValue52 & 3) != 2) {
                                            z22 = true;
                                        } else {
                                            z22 = false;
                                        }
                                        if (kd2Var62.V(intValue52 & 1, z22)) {
                                            j74Var22.a(0, kd2Var62);
                                        } else {
                                            kd2Var62.Y();
                                        }
                                        return pn6Var2;
                                    default:
                                        if ((intValue52 & 3) != 2) {
                                            z23 = true;
                                        } else {
                                            z23 = false;
                                        }
                                        if (kd2Var62.V(intValue52 & 1, z23)) {
                                            j74Var22.a(0, kd2Var62);
                                        } else {
                                            kd2Var62.Y();
                                        }
                                        return pn6Var2;
                                }
                            }
                        }, kd2Var14), kd2Var14, 54);
                        kd2Var14.q(false);
                        kd2Var14.q(false);
                    } else {
                        kd2Var14.e0(1576267665);
                        kd2Var14.q(false);
                    }
                } else {
                    kd2Var14.Y();
                }
                return pn6Var;
            case 18:
                AnimeSchedule animeSchedule = (AnimeSchedule) obj4;
                kd2 kd2Var15 = (kd2) obj2;
                int intValue16 = ((Integer) obj3).intValue();
                ((t62) obj).getClass();
                if ((intValue16 & 17) != 16) {
                    z14 = true;
                }
                if (kd2Var15.V(intValue16 & 1, z14)) {
                    String label6 = animeSchedule.getFormat().getLabel();
                    tq1 tq1Var2 = op0.a;
                    n03.c(label6, null, null, ((mp0) kd2Var15.j(tq1Var2)).o, null, ((mp0) kd2Var15.j(tq1Var2)).n, null, null, kd2Var15, 0, 214);
                    Integer seasonYear3 = animeSchedule.getSeasonYear();
                    if (seasonYear3 == null || (valueOf3 = String.valueOf(seasonYear3.intValue())) == null) {
                        str6 = "N/A";
                    } else {
                        str6 = valueOf3;
                    }
                    n03.c(str6, null, null, ((mp0) kd2Var15.j(tq1Var2)).r, null, ((mp0) kd2Var15.j(tq1Var2)).o, null, null, kd2Var15, 0, 214);
                } else {
                    kd2Var15.Y();
                }
                return pn6Var;
            case 19:
                ((fi5) obj4).d();
                return pn6Var;
            case 20:
                fa6 fa6Var = (fa6) obj4;
                int intValue17 = ((Integer) obj).intValue();
                int intValue18 = ((Integer) obj2).intValue();
                boolean booleanValue2 = ((Boolean) obj3).booleanValue();
                gi6 gi6Var = fa6Var.N;
                if (booleanValue2) {
                    d = gi6Var.a.c();
                } else {
                    d = gi6Var.d();
                }
                long j7 = d.B;
                if (fa6Var.Q && Math.min(intValue17, intValue18) >= 0 && Math.max(intValue17, intValue18) <= d.A.length()) {
                    int i7 = nd6.c;
                    if (intValue17 != ((int) (j7 >> 32)) || intValue18 != ((int) (j7 & 4294967295L))) {
                        long a4 = fy5.a(intValue17, intValue18);
                        if (!booleanValue2 && intValue17 != intValue18) {
                            fa6Var.P.x(be6.z);
                        } else {
                            fa6Var.P.x(be6.x);
                        }
                        gi6 gi6Var2 = fa6Var.N;
                        if (booleanValue2) {
                            gi6Var2.k(a4);
                        } else {
                            gi6Var2.j(a4);
                        }
                    }
                } else {
                    z10 = false;
                }
                return Boolean.valueOf(z10);
            case 21:
                lx3 lx3Var = (lx3) obj4;
                kd2 kd2Var16 = (kd2) obj2;
                ((Integer) obj3).getClass();
                kd2Var16.e0(-102778667);
                Object Q5 = kd2Var16.Q();
                Object obj7 = Q5;
                if (Q5 == q18Var) {
                    v11 L = db.L(kd2Var16);
                    kd2Var16.n0(L);
                    obj7 = L;
                }
                v11 v11Var = (v11) obj7;
                Object Q6 = kd2Var16.Q();
                Object obj8 = Q6;
                if (Q6 == q18Var) {
                    ti4 g = xt5.g(null);
                    kd2Var16.n0(g);
                    obj8 = g;
                }
                w44 w44Var2 = (w44) obj8;
                w44 h3 = xt5.h(lx3Var, kd2Var16);
                boolean f5 = kd2Var16.f(null);
                Object Q7 = kd2Var16.Q();
                Object obj9 = Q7;
                if (f5 || Q7 == q18Var) {
                    ef efVar = new ef(w44Var2, b4);
                    kd2Var16.n0(efVar);
                    obj9 = efVar;
                }
                db.c(null, (ub2) obj9, kd2Var16);
                boolean h4 = kd2Var16.h(v11Var) | kd2Var16.f(null) | kd2Var16.f(h3);
                Object Q8 = kd2Var16.Q();
                Object obj10 = Q8;
                if (h4 || Q8 == q18Var) {
                    za6 za6Var = new za6(v11Var, w44Var2, h3);
                    kd2Var16.n0(za6Var);
                    obj10 = za6Var;
                }
                yz3 a5 = v36.a(vz3Var, null, (PointerInputEventHandler) obj10);
                kd2Var16.q(false);
                return a5;
            case 22:
                jb6 jb6Var3 = (jb6) obj4;
                yz3 yz3Var = (yz3) obj;
                kd2 kd2Var17 = (kd2) obj2;
                ((Integer) obj3).getClass();
                kd2Var17.e0(1980580247);
                ud1 ud1Var = (ud1) kd2Var17.j(bv0.h);
                Object Q9 = kd2Var17.Q();
                Object obj11 = Q9;
                if (Q9 == q18Var) {
                    ti4 g2 = xt5.g(new k13(0L));
                    kd2Var17.n0(g2);
                    obj11 = g2;
                }
                w44 w44Var3 = (w44) obj11;
                boolean h5 = kd2Var17.h(jb6Var3);
                Object Q10 = kd2Var17.Q();
                Object obj12 = Q10;
                if (h5 || Q10 == q18Var) {
                    lb5 lb5Var = new lb5(jb6Var3, w44Var3, b2);
                    kd2Var17.n0(lb5Var);
                    obj12 = lb5Var;
                }
                sb2 sb2Var = (sb2) obj12;
                boolean f6 = kd2Var17.f(ud1Var);
                Object Q11 = kd2Var17.Q();
                Object obj13 = Q11;
                if (f6 || Q11 == q18Var) {
                    nb6 nb6Var = new nb6(ud1Var, w44Var3, false ? (byte) 1 : (byte) 0);
                    kd2Var17.n0(nb6Var);
                    obj13 = nb6Var;
                }
                ol olVar = kh5.a;
                yz3 s = o80.s(yz3Var, new u54(sb2Var, (ub2) obj13));
                kd2Var17.q(false);
                return s;
            default:
                kw6 kw6Var = (kw6) obj4;
                final j74 j74Var4 = (j74) obj;
                kd2 kd2Var18 = (kd2) obj2;
                int intValue19 = ((Integer) obj3).intValue();
                if ((intValue19 & 6) == 0) {
                    if (kd2Var18.f(j74Var4)) {
                        b5 = 4;
                    }
                    intValue19 |= b5;
                }
                if ((intValue19 & 19) != 18) {
                    z13 = true;
                }
                if (kd2Var18.V(intValue19 & 1, z13)) {
                    Object obj14 = j74Var4.b;
                    ga5 ga5Var = (ga5) kd2Var18.j(ck3.a);
                    boolean f7 = kd2Var18.f(kw6Var) | kd2Var18.f(obj14) | kd2Var18.f(ga5Var);
                    Object Q12 = kd2Var18.Q();
                    if (f7 || Q12 == q18Var) {
                        Bundle bundle = kw6Var.c;
                        j21 j21Var = kw6Var.d;
                        yv6 yv6Var = kw6Var.e;
                        bundle.getClass();
                        j21Var.getClass();
                        yv6Var.getClass();
                        p44 p44Var = kw6Var.a().b;
                        Object g3 = p44Var.g(obj14);
                        if (g3 == null) {
                            g3 = new iw6(obj14);
                            p44Var.n(obj14, g3);
                        }
                        cw6 cw6Var = ((iw6) g3).b;
                        if (ga5Var == null) {
                            Q12 = new fw6(cw6Var, yv6Var, j21Var, bundle);
                        } else {
                            ea5 savedStateRegistry = ga5Var.getSavedStateRegistry();
                            fg3 lifecycle = ga5Var.getLifecycle();
                            savedStateRegistry.getClass();
                            lifecycle.getClass();
                            Q12 = new gw6(savedStateRegistry, cw6Var, lifecycle, yv6Var, j21Var, bundle);
                        }
                        kd2Var18.n0(Q12);
                    }
                    ew6 ew6Var = (ew6) Q12;
                    boolean h6 = kd2Var18.h(kw6Var) | kd2Var18.h(obj14);
                    Object Q13 = kd2Var18.Q();
                    Object obj15 = Q13;
                    if (h6 || Q13 == q18Var) {
                        r82 r82Var = new r82(kw6Var, obj14, (byte) 25);
                        kd2Var18.n0(r82Var);
                        obj15 = r82Var;
                    }
                    db.c(ew6Var, (ub2) obj15, kd2Var18);
                    kb0.b(dk3.a.a(ew6Var), nx7.R(1108866301, new ic2() { // from class: tz
                        @Override // defpackage.ic2
                        public final Object invoke(Object obj52, Object obj62) {
                            boolean z20;
                            boolean z21;
                            boolean z22;
                            boolean z23;
                            byte b8 = b3;
                            pn6 pn6Var2 = pn6.a;
                            j74 j74Var22 = j74Var4;
                            kd2 kd2Var62 = (kd2) obj52;
                            int intValue52 = ((Integer) obj62).intValue();
                            switch (b8) {
                                case 0:
                                    if ((intValue52 & 3) != 2) {
                                        z20 = true;
                                    } else {
                                        z20 = false;
                                    }
                                    if (kd2Var62.V(intValue52 & 1, z20)) {
                                        j74Var22.a(0, kd2Var62);
                                    } else {
                                        kd2Var62.Y();
                                    }
                                    return pn6Var2;
                                case 1:
                                    if ((intValue52 & 3) != 2) {
                                        z21 = true;
                                    } else {
                                        z21 = false;
                                    }
                                    if (kd2Var62.V(intValue52 & 1, z21)) {
                                        j74Var22.a(0, kd2Var62);
                                    } else {
                                        kd2Var62.Y();
                                    }
                                    return pn6Var2;
                                case 2:
                                    if ((intValue52 & 3) != 2) {
                                        z22 = true;
                                    } else {
                                        z22 = false;
                                    }
                                    if (kd2Var62.V(intValue52 & 1, z22)) {
                                        j74Var22.a(0, kd2Var62);
                                    } else {
                                        kd2Var62.Y();
                                    }
                                    return pn6Var2;
                                default:
                                    if ((intValue52 & 3) != 2) {
                                        z23 = true;
                                    } else {
                                        z23 = false;
                                    }
                                    if (kd2Var62.V(intValue52 & 1, z23)) {
                                        j74Var22.a(0, kd2Var62);
                                    } else {
                                        kd2Var62.Y();
                                    }
                                    return pn6Var2;
                            }
                        }
                    }, kd2Var18), kd2Var18, 56);
                } else {
                    kd2Var18.Y();
                }
                return pn6Var;
        }
    }

    public /* synthetic */ fr5(Object obj, byte b) {
        this.x = b;
        this.y = obj;
    }
}
