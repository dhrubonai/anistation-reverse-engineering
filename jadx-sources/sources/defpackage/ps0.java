package defpackage;

import com.anistation.android.R;
import java.net.SocketTimeoutException;
import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final /* synthetic */ class ps0 implements jc2 {
    public final /* synthetic */ byte x;

    public /* synthetic */ ps0(byte b) {
        this.x = b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.jc2
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        boolean z;
        boolean h;
        int g;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        byte b = this.x;
        t53 t53Var = za3.p0;
        final byte b2 = 3;
        int i = 4;
        ot1 ot1Var = ot1.x;
        final byte b3 = 2;
        vz3 vz3Var = vz3.x;
        pn6 pn6Var = pn6.a;
        boolean z7 = true;
        boolean z8 = true;
        boolean z9 = true;
        final byte b4 = 0;
        boolean z10 = false;
        boolean z11 = false;
        boolean z12 = false;
        boolean z13 = false;
        boolean z14 = false;
        boolean z15 = false;
        boolean z16 = false;
        boolean z17 = false;
        boolean z18 = false;
        switch (b) {
            case 0:
                tr5 tr5Var = (tr5) obj;
                kd2 kd2Var = (kd2) obj2;
                int intValue = ((Integer) obj3).intValue();
                tr5Var.getClass();
                if ((intValue & 6) == 0) {
                    if ((intValue & 8) == 0) {
                        h = kd2Var.f(tr5Var);
                    } else {
                        h = kd2Var.h(tr5Var);
                    }
                    if (!h) {
                        i = 2;
                    }
                    intValue |= i;
                }
                if ((intValue & 19) != 18) {
                    z = true;
                } else {
                    z = false;
                }
                if (kd2Var.V(intValue & 1, z)) {
                    yz3 e = ar5.e(ar5.c(vz3Var, 1.0f), 7.0f);
                    tq1 tq1Var = op0.a;
                    long j = ((mp0) kd2Var.j(tq1Var)).r;
                    o75 o75Var = tm5.b;
                    yz3 h2 = bx7.h(e, j, o75Var);
                    vo3 c = b90.c(pk2.y, false);
                    int hashCode = Long.hashCode(kd2Var.T);
                    al4 l = kd2Var.l();
                    yz3 E = o80.E(kd2Var, h2);
                    tt0.d.getClass();
                    kd2Var.h0();
                    if (kd2Var.S) {
                        kd2Var.k(t53Var);
                    } else {
                        kd2Var.q0();
                    }
                    ss5.i(p7.F, kd2Var, c);
                    ss5.i(p7.E, kd2Var, l);
                    ss5.i(p7.G, kd2Var, Integer.valueOf(hashCode));
                    ss5.h(kd2Var);
                    ss5.i(p7.D, kd2Var, E);
                    b90.a(bx7.h(ar5.c(vz3Var, tr5Var.c()).w(ar5.b), ((mp0) kd2Var.j(tq1Var)).o, o75Var), kd2Var, 0);
                    kd2Var.q(true);
                } else {
                    kd2Var.Y();
                }
                return pn6Var;
            case 1:
                xo3 xo3Var = (xo3) obj;
                final int x0 = xo3Var.x0(10.0f);
                int i2 = x0 * 2;
                final em4 p = ((ro3) obj2).p(sx0.i(i2, ((rx0) obj3).a, 0));
                int i3 = p.y;
                int i4 = p.x - i2;
                final byte b5 = z7 ? (byte) 1 : (byte) 0;
                return xo3Var.L(i4, i3, ot1Var, new ub2() { // from class: i4
                    @Override // defpackage.ub2
                    public final Object invoke(Object obj4) {
                        byte b6 = b5;
                        pn6 pn6Var2 = pn6.a;
                        int i5 = x0;
                        em4 em4Var = p;
                        dm4 dm4Var = (dm4) obj4;
                        switch (b6) {
                            case 0:
                                dm4Var.f(em4Var, 0, -i5, 0.0f);
                                return pn6Var2;
                            case 1:
                                dm4Var.f(em4Var, -i5, 0, 0.0f);
                                return pn6Var2;
                            case 2:
                                dm4Var.getClass();
                                dm4Var.f(em4Var, 0, -i5, 0.0f);
                                return pn6Var2;
                            default:
                                dm4Var.getClass();
                                dm4Var.f(em4Var, -i5, 0, 0.0f);
                                return pn6Var2;
                        }
                    }
                });
            case 2:
                xo3 xo3Var2 = (xo3) obj;
                final int x02 = xo3Var2.x0(10.0f);
                int i5 = x02 * 2;
                final em4 p2 = ((ro3) obj2).p(sx0.i(0, ((rx0) obj3).a, i5));
                return xo3Var2.L(p2.x, p2.y - i5, ot1Var, new ub2() { // from class: i4
                    @Override // defpackage.ub2
                    public final Object invoke(Object obj4) {
                        byte b6 = b4;
                        pn6 pn6Var2 = pn6.a;
                        int i52 = x02;
                        em4 em4Var = p2;
                        dm4 dm4Var = (dm4) obj4;
                        switch (b6) {
                            case 0:
                                dm4Var.f(em4Var, 0, -i52, 0.0f);
                                return pn6Var2;
                            case 1:
                                dm4Var.f(em4Var, -i52, 0, 0.0f);
                                return pn6Var2;
                            case 2:
                                dm4Var.getClass();
                                dm4Var.f(em4Var, 0, -i52, 0.0f);
                                return pn6Var2;
                            default:
                                dm4Var.getClass();
                                dm4Var.f(em4Var, -i52, 0, 0.0f);
                                return pn6Var2;
                        }
                    }
                });
            case 3:
                xo3 xo3Var3 = (xo3) obj;
                ro3 ro3Var = (ro3) obj2;
                rx0 rx0Var = (rx0) obj3;
                xo3Var3.getClass();
                ro3Var.getClass();
                final int x03 = xo3Var3.x0(10.0f);
                long j2 = rx0Var.a;
                boolean c2 = rx0.c(j2);
                long j3 = rx0Var.a;
                if (c2) {
                    g = (x03 * 2) + rx0.g(j3);
                } else {
                    g = rx0.g(j3);
                }
                final em4 p3 = ro3Var.p(rx0.a(j2, 0, 0, 0, g, 7));
                int i6 = p3.y - (x03 * 2);
                if (i6 >= 0) {
                    b4 = i6;
                }
                return xo3Var3.L(p3.x, b4, ot1Var, new ub2() { // from class: i4
                    @Override // defpackage.ub2
                    public final Object invoke(Object obj4) {
                        byte b6 = b3;
                        pn6 pn6Var2 = pn6.a;
                        int i52 = x03;
                        em4 em4Var = p3;
                        dm4 dm4Var = (dm4) obj4;
                        switch (b6) {
                            case 0:
                                dm4Var.f(em4Var, 0, -i52, 0.0f);
                                return pn6Var2;
                            case 1:
                                dm4Var.f(em4Var, -i52, 0, 0.0f);
                                return pn6Var2;
                            case 2:
                                dm4Var.getClass();
                                dm4Var.f(em4Var, 0, -i52, 0.0f);
                                return pn6Var2;
                            default:
                                dm4Var.getClass();
                                dm4Var.f(em4Var, -i52, 0, 0.0f);
                                return pn6Var2;
                        }
                    }
                });
            case 4:
                em4 p4 = ((ro3) obj2).p(((rx0) obj3).a);
                return ((xo3) obj).v0(p4.x, p4.y, ot1.x, new ui((byte) 17), new r0(p4, (byte) 3));
            case 5:
                kd2 kd2Var2 = (kd2) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                ((yp0) obj).getClass();
                if ((intValue2 & 17) != 16) {
                    z18 = true;
                }
                if (kd2Var2.V(intValue2 & 1, z18)) {
                    u.d(R.drawable.play_outlined, lz5.f(R.string.familiar_anime_player, kd2Var2), lz5.f(R.string.about_subtitle_1, kd2Var2), null, false, kd2Var2, 0, 24);
                    u.d(R.drawable.my_list, lz5.f(R.string.local_watch_tracking, kd2Var2), lz5.f(R.string.about_subtitle_2, kd2Var2), null, false, kd2Var2, 0, 24);
                    u.d(R.drawable.list_import, lz5.f(R.string.import_and_export_lists, kd2Var2), lz5.f(R.string.about_subtitle_3, kd2Var2), null, false, kd2Var2, 24576, 8);
                } else {
                    kd2Var2.Y();
                }
                return pn6Var;
            case 6:
                kd2 kd2Var3 = (kd2) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                ((yp0) obj).getClass();
                if ((intValue3 & 17) != 16) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (kd2Var3.V(intValue3 & 1, z2)) {
                    u.h(0, kd2Var3);
                } else {
                    kd2Var3.Y();
                }
                return pn6Var;
            case 7:
                kd2 kd2Var4 = (kd2) obj2;
                int intValue4 = ((Integer) obj3).intValue();
                ((tr5) obj).getClass();
                if ((intValue4 & 17) != 16) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (kd2Var4.V(intValue4 & 1, z3)) {
                    yz3 i7 = ar5.i(vz3Var, 18.0f);
                    tq1 tq1Var2 = op0.a;
                    long j4 = ((mp0) kd2Var4.j(tq1Var2)).o;
                    o75 o75Var2 = tm5.b;
                    b90.a(m37.f(bx7.h(i7, j4, o75Var2), 0.5f, ep0.b(0.08f, ((mp0) kd2Var4.j(tq1Var2)).n), o75Var2), kd2Var4, 0);
                } else {
                    kd2Var4.Y();
                }
                return pn6Var;
            case 8:
                qz0 qz0Var = (qz0) obj;
                kd2 kd2Var5 = (kd2) obj2;
                int intValue5 = ((Integer) obj3).intValue();
                if ((intValue5 & 6) == 0) {
                    if (!kd2Var5.f(qz0Var)) {
                        i = 2;
                    }
                    intValue5 |= i;
                }
                if ((intValue5 & 19) != 18) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (kd2Var5.V(intValue5 & 1, z4)) {
                    b90.a(bx7.h(ar5.e(ar5.c(n77.T(vz3Var, 0.0f, sz0.g, 1), 1.0f), sz0.f), qz0Var.c, io3.h), kd2Var5, 0);
                } else {
                    kd2Var5.Y();
                }
                return pn6Var;
            case 9:
                kd2 kd2Var6 = (kd2) obj2;
                int intValue6 = ((Integer) obj3).intValue();
                ((yp0) obj).getClass();
                if ((intValue6 & 17) != 16) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                if (kd2Var6.V(intValue6 & 1, z5)) {
                    qi1.e(0, kd2Var6);
                } else {
                    kd2Var6.Y();
                }
                return pn6Var;
            case 10:
                kd2 kd2Var7 = (kd2) obj2;
                int intValue7 = ((Integer) obj3).intValue();
                ((zc3) obj).getClass();
                if ((intValue7 & 17) != 16) {
                    z17 = true;
                }
                if (kd2Var7.V(intValue7 & 1, z17)) {
                    ov5.a(kd2Var7, ar5.e(vz3Var, 10.0f));
                } else {
                    kd2Var7.Y();
                }
                return pn6Var;
            case 11:
                kd2 kd2Var8 = (kd2) obj2;
                int intValue8 = ((Integer) obj3).intValue();
                ((fc3) obj).getClass();
                if ((intValue8 & 17) != 16) {
                    z16 = true;
                }
                if (kd2Var8.V(intValue8 & 1, z16)) {
                    ov5.a(kd2Var8, ar5.e(vz3Var, 40.0f));
                } else {
                    kd2Var8.Y();
                }
                return pn6Var;
            case 12:
                kd2 kd2Var9 = (kd2) obj2;
                int intValue9 = ((Integer) obj3).intValue();
                ((fc3) obj).getClass();
                if ((intValue9 & 17) != 16) {
                    z15 = true;
                }
                if (kd2Var9.V(intValue9 & 1, z15)) {
                    ov5.a(kd2Var9, ar5.e(vz3Var, 40.0f));
                } else {
                    kd2Var9.Y();
                }
                return pn6Var;
            case 13:
                kd2 kd2Var10 = (kd2) obj2;
                int intValue10 = ((Integer) obj3).intValue();
                ((tr5) obj).getClass();
                if ((intValue10 & 17) != 16) {
                    z14 = true;
                }
                if (kd2Var10.V(intValue10 & 1, z14)) {
                    b90.a(ar5.i(vz3Var, 15.0f), kd2Var10, 6);
                } else {
                    kd2Var10.Y();
                }
                return pn6Var;
            case 14:
                ic2 ic2Var = (ic2) obj;
                kd2 kd2Var11 = (kd2) obj2;
                int intValue11 = ((Integer) obj3).intValue();
                if ((intValue11 & 6) == 0) {
                    if (!kd2Var11.h(ic2Var)) {
                        i = 2;
                    }
                    intValue11 |= i;
                }
                if ((intValue11 & 19) == 18) {
                    z7 = false;
                }
                if (kd2Var11.V(intValue11 & 1, z7)) {
                    ic2Var.invoke(kd2Var11, Integer.valueOf(intValue11 & 14));
                } else {
                    kd2Var11.Y();
                }
                return pn6Var;
            case 15:
                kd2 kd2Var12 = (kd2) obj2;
                int intValue12 = ((Integer) obj3).intValue();
                ((zc3) obj).getClass();
                if ((intValue12 & 17) != 16) {
                    z13 = true;
                }
                if (kd2Var12.V(intValue12 & 1, z13)) {
                    ov5.a(kd2Var12, ar5.e(vz3Var, 32.0f));
                } else {
                    kd2Var12.Y();
                }
                return pn6Var;
            case 16:
                kd2 kd2Var13 = (kd2) obj2;
                int intValue13 = ((Integer) obj3).intValue();
                ((zc3) obj).getClass();
                if ((intValue13 & 17) != 16) {
                    z12 = true;
                }
                if (kd2Var13.V(intValue13 & 1, z12)) {
                    yc6.b(lz5.f(R.string.trending, kd2Var13), n77.V(vz3.x, 12.0f, 12.0f, 0.0f, 4.0f, 4), ((mp0) kd2Var13.j(op0.a)).o, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, ((nl6) kd2Var13.j(pl6.a)).h, kd2Var13, 48, 0, 131064);
                } else {
                    kd2Var13.Y();
                }
                return pn6Var;
            case 17:
                kd2 kd2Var14 = (kd2) obj2;
                int intValue14 = ((Integer) obj3).intValue();
                ((fc3) obj).getClass();
                if ((intValue14 & 17) != 16) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                if (kd2Var14.V(intValue14 & 1, z6)) {
                    yz3 R = n77.R(ar5.c(vz3Var, 1.0f), 16.0f);
                    vo3 c3 = b90.c(pk2.C, false);
                    int hashCode2 = Long.hashCode(kd2Var14.T);
                    al4 l2 = kd2Var14.l();
                    yz3 E2 = o80.E(kd2Var14, R);
                    tt0.d.getClass();
                    kd2Var14.h0();
                    if (kd2Var14.S) {
                        kd2Var14.k(t53Var);
                    } else {
                        kd2Var14.q0();
                    }
                    ss5.i(p7.F, kd2Var14, c3);
                    ss5.i(p7.E, kd2Var14, l2);
                    ss5.i(p7.G, kd2Var14, Integer.valueOf(hashCode2));
                    ss5.h(kd2Var14);
                    ss5.i(p7.D, kd2Var14, E2);
                    cv4.a(null, ((mp0) kd2Var14.j(op0.a)).o, 0.0f, 0L, 0, 0.0f, kd2Var14, 0, 61);
                    kd2Var14.q(true);
                } else {
                    kd2Var14.Y();
                }
                return pn6Var;
            case 18:
                kd2 kd2Var15 = (kd2) obj2;
                int intValue15 = ((Integer) obj3).intValue();
                ((zc3) obj).getClass();
                if ((intValue15 & 17) != 16) {
                    z11 = true;
                }
                if (kd2Var15.V(intValue15 & 1, z11)) {
                    ov5.a(kd2Var15, ar5.e(vz3Var, 10.0f));
                } else {
                    kd2Var15.Y();
                }
                return pn6Var;
            case 19:
                kd2 kd2Var16 = (kd2) obj2;
                int intValue16 = ((Integer) obj3).intValue();
                ((zc3) obj).getClass();
                if ((intValue16 & 17) != 16) {
                    z10 = true;
                }
                if (kd2Var16.V(intValue16 & 1, z10)) {
                    ov5.a(kd2Var16, ar5.e(vz3Var, 10.0f));
                } else {
                    kd2Var16.Y();
                }
                return pn6Var;
            case 20:
                Throwable th = (Throwable) obj3;
                ((gs2) obj).getClass();
                ((or2) obj2).getClass();
                th.getClass();
                yk3 yk3Var = yr2.a;
                Throwable i0 = h41.i0(th);
                if ((i0 instanceof zr2) || (i0 instanceof sv0) || (i0 instanceof SocketTimeoutException) || (th instanceof CancellationException)) {
                    z9 = false;
                }
                return Boolean.valueOf(z9);
            case 21:
                f91 f91Var = (f91) obj3;
                ((gs2) obj).getClass();
                ((nr2) obj2).getClass();
                f91Var.getClass();
                int i8 = f91Var.c().x;
                if (500 > i8 || i8 >= 600) {
                    z8 = false;
                }
                return Boolean.valueOf(z8);
            default:
                xo3 xo3Var4 = (xo3) obj;
                ro3 ro3Var2 = (ro3) obj2;
                rx0 rx0Var2 = (rx0) obj3;
                xo3Var4.getClass();
                ro3Var2.getClass();
                final int x04 = xo3Var4.x0(10.0f);
                long j5 = rx0Var2.a;
                final em4 p5 = ro3Var2.p(rx0.a(j5, 0, (x04 * 2) + rx0.h(j5), 0, 0, 13));
                return xo3Var4.L(rx0.h(rx0Var2.a), p5.y, ot1Var, new ub2() { // from class: i4
                    @Override // defpackage.ub2
                    public final Object invoke(Object obj4) {
                        byte b6 = b2;
                        pn6 pn6Var2 = pn6.a;
                        int i52 = x04;
                        em4 em4Var = p5;
                        dm4 dm4Var = (dm4) obj4;
                        switch (b6) {
                            case 0:
                                dm4Var.f(em4Var, 0, -i52, 0.0f);
                                return pn6Var2;
                            case 1:
                                dm4Var.f(em4Var, -i52, 0, 0.0f);
                                return pn6Var2;
                            case 2:
                                dm4Var.getClass();
                                dm4Var.f(em4Var, 0, -i52, 0.0f);
                                return pn6Var2;
                            default:
                                dm4Var.getClass();
                                dm4Var.f(em4Var, -i52, 0, 0.0f);
                                return pn6Var2;
                        }
                    }
                });
        }
    }
}
