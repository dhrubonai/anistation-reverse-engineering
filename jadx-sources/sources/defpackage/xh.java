package defpackage;

import com.anistation.android.R;
import com.anistation.model.settings.SubtitleFontFamily;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final /* synthetic */ class xh implements jc2 {
    public final /* synthetic */ Object A;
    public final /* synthetic */ byte x;
    public final /* synthetic */ boolean y;
    public final /* synthetic */ Object z;

    public /* synthetic */ xh(SubtitleFontFamily subtitleFontFamily, ub2 ub2Var, boolean z) {
        this.x = (byte) 3;
        this.z = subtitleFontFamily;
        this.A = ub2Var;
        this.y = z;
    }

    @Override // defpackage.jc2
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        boolean z;
        y50 y50Var;
        kd2 kd2Var;
        int i;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        long b;
        long b2;
        float f;
        s92 s92Var;
        long j;
        int i2;
        byte b3 = this.x;
        vz3 vz3Var = vz3.x;
        t53 t53Var = za3.p0;
        q18 q18Var = au0.a;
        pn6 pn6Var = pn6.a;
        boolean z7 = this.y;
        Object obj4 = this.A;
        Object obj5 = this.z;
        int i3 = 6;
        boolean z8 = false;
        boolean z9 = true;
        switch (b3) {
            case 0:
                String str = (String) obj5;
                String str2 = (String) obj4;
                ic2 ic2Var = (ic2) obj;
                kd2 kd2Var2 = (kd2) obj2;
                int intValue = ((Integer) obj3).intValue();
                ic2Var.getClass();
                if ((intValue & 6) == 0) {
                    if (kd2Var2.h(ic2Var)) {
                        i = 4;
                    } else {
                        i = 2;
                    }
                    intValue |= i;
                }
                if ((intValue & 19) != 18) {
                    z = true;
                } else {
                    z = false;
                }
                if (kd2Var2.V(intValue & 1, z)) {
                    z22 z22Var = ar5.c;
                    if (z7) {
                        y50Var = pk2.y;
                    } else {
                        y50Var = pk2.B;
                    }
                    vo3 c = b90.c(y50Var, false);
                    int hashCode = Long.hashCode(kd2Var2.T);
                    al4 l = kd2Var2.l();
                    yz3 E = o80.E(kd2Var2, z22Var);
                    tt0.d.getClass();
                    kd2Var2.h0();
                    if (kd2Var2.S) {
                        kd2Var2.k(t53Var);
                    } else {
                        kd2Var2.q0();
                    }
                    ss5.i(p7.F, kd2Var2, c);
                    ss5.i(p7.E, kd2Var2, l);
                    ss5.i(p7.G, kd2Var2, Integer.valueOf(hashCode));
                    ss5.h(kd2Var2);
                    ss5.i(p7.D, kd2Var2, E);
                    if (str.length() == 0) {
                        kd2Var2.e0(-426770688);
                        yc6.b(str2, null, 0L, 0L, null, xk6.a, 0L, null, 0L, 0, false, 0, 0, new xd6(ep0.d, hz5.g(16), null, null, 0L, 0, 0, 0L, 16777212), kd2Var2, 0, 12582912, 130942);
                        kd2Var = kd2Var2;
                        kd2Var.q(false);
                    } else {
                        kd2Var = kd2Var2;
                        kd2Var.e0(-426479412);
                        kd2Var.q(false);
                    }
                    ic2Var.invoke(kd2Var, Integer.valueOf(intValue & 14));
                    kd2Var.q(true);
                } else {
                    kd2Var2.Y();
                }
                return pn6Var;
            case 1:
                float f2 = 1.0f;
                ub2 ub2Var = (ub2) obj5;
                w44 w44Var = (w44) obj4;
                kd2 kd2Var3 = (kd2) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                ((el) obj).getClass();
                if ((intValue2 & 17) != 16) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (kd2Var3.V(intValue2 & 1, z2)) {
                    bg6 bg6Var = (bg6) w44Var.getValue();
                    if (bg6Var != null) {
                        kd2Var3.e0(1512524326);
                        boolean f3 = kd2Var3.f(ub2Var);
                        Object Q = kd2Var3.Q();
                        if (f3 || Q == q18Var) {
                            Q = new wi(ub2Var, (byte) 0);
                            kd2Var3.n0(Q);
                        }
                        yz3 D = m37.D(vz3Var, (ub2) Q);
                        if (z7) {
                            f2 = 0.6f;
                        }
                        l36.a(n77.V(ar5.c(D, f2), 16.0f, 0.0f, 16.0f, 8.0f, 2), ((cn5) kd2Var3.j(dn5.a)).c, ((mp0) kd2Var3.j(op0.a)).u, 0L, 6.0f, 0.0f, null, nx7.R(985289623, new o0((Object) bg6Var, (byte) 3), kd2Var3), kd2Var3, 12607488, 104);
                        kd2Var3.q(false);
                    } else {
                        kd2Var3.e0(1513492053);
                        kd2Var3.q(false);
                    }
                } else {
                    kd2Var3.Y();
                }
                return pn6Var;
            case 2:
                xm6 xm6Var = (xm6) obj5;
                w44 w44Var2 = (w44) obj4;
                kd2 kd2Var4 = (kd2) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                ((yp0) obj).getClass();
                if ((intValue3 & 17) != 16) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (kd2Var4.V(intValue3 & 1, z3)) {
                    yz3 R = n77.R(vz3Var, 16.0f);
                    vr vrVar = new vr(16.0f, true, new ze0((byte) 6));
                    w50 w50Var = pk2.K;
                    xp0 a = vp0.a(vrVar, w50Var, kd2Var4, 6);
                    int hashCode2 = Long.hashCode(kd2Var4.T);
                    al4 l2 = kd2Var4.l();
                    yz3 E2 = o80.E(kd2Var4, R);
                    tt0.d.getClass();
                    kd2Var4.h0();
                    if (kd2Var4.S) {
                        kd2Var4.k(t53Var);
                    } else {
                        kd2Var4.q0();
                    }
                    st0 st0Var = p7.F;
                    ss5.i(st0Var, kd2Var4, a);
                    ys0 ys0Var = p7.E;
                    ss5.i(ys0Var, kd2Var4, l2);
                    Integer valueOf = Integer.valueOf(hashCode2);
                    st0 st0Var2 = p7.G;
                    ss5.i(st0Var2, kd2Var4, valueOf);
                    ss5.h(kd2Var4);
                    ys0 ys0Var2 = p7.D;
                    ss5.i(ys0Var2, kd2Var4, E2);
                    yz3 c2 = ar5.c(vz3Var, 1.0f);
                    z75 a2 = y75.a(x97.y, pk2.I, kd2Var4, 48);
                    int hashCode3 = Long.hashCode(kd2Var4.T);
                    al4 l3 = kd2Var4.l();
                    yz3 E3 = o80.E(kd2Var4, c2);
                    kd2Var4.h0();
                    if (kd2Var4.S) {
                        kd2Var4.k(t53Var);
                    } else {
                        kd2Var4.q0();
                    }
                    ss5.i(st0Var, kd2Var4, a2);
                    ss5.i(ys0Var, kd2Var4, l3);
                    h11.q(hashCode3, kd2Var4, st0Var2, kd2Var4);
                    ss5.i(ys0Var2, kd2Var4, E3);
                    yz3 i4 = ar5.i(vz3Var, 42.0f);
                    o75 o75Var = p75.a;
                    tq1 tq1Var = op0.a;
                    l36.a(i4, o75Var, ((mp0) kd2Var4.j(tq1Var)).r, 0L, 0.0f, 0.0f, null, wk6.b, kd2Var4, 12582918, 120);
                    ov5.a(kd2Var4, ar5.l(vz3Var, 14.0f));
                    ob3 ob3Var = new ob3(1.0f, true);
                    xp0 a3 = vp0.a(new vr(3.0f, true, new ze0((byte) 6)), w50Var, kd2Var4, 6);
                    int hashCode4 = Long.hashCode(kd2Var4.T);
                    al4 l4 = kd2Var4.l();
                    yz3 E4 = o80.E(kd2Var4, ob3Var);
                    kd2Var4.h0();
                    if (kd2Var4.S) {
                        kd2Var4.k(t53Var);
                    } else {
                        kd2Var4.q0();
                    }
                    ss5.i(st0Var, kd2Var4, a3);
                    ss5.i(ys0Var, kd2Var4, l4);
                    h11.q(hashCode4, kd2Var4, st0Var2, kd2Var4);
                    ss5.i(ys0Var2, kd2Var4, E4);
                    String f4 = lz5.f(R.string.restore_from_backup, kd2Var4);
                    tq1 tq1Var2 = pl6.a;
                    yc6.b(f4, null, ((mp0) kd2Var4.j(tq1Var)).o, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, ((nl6) kd2Var4.j(tq1Var2)).j, kd2Var4, 0, 0, 131066);
                    yc6.b(lz5.f(R.string.restore_section_summary, kd2Var4), null, ep0.b(0.7f, ((mp0) kd2Var4.j(tq1Var)).o), 0L, null, null, 0L, null, 0L, 0, false, 0, 0, xd6.a(((nl6) kd2Var4.j(tq1Var2)).l, 0L, null, null, 0L, null, hz5.g(16), null, 16646143), kd2Var4, 0, 0, 131066);
                    kd2Var4.q(true);
                    kd2Var4.q(true);
                    String f5 = lz5.f(R.string.restore_from_backup, kd2Var4);
                    yz3 c3 = ar5.c(vz3Var, 1.0f);
                    boolean z10 = xm6Var.A;
                    boolean z11 = !z7;
                    long j2 = ((mp0) kd2Var4.j(tq1Var)).r;
                    long j3 = ((mp0) kd2Var4.j(tq1Var)).o;
                    Object Q2 = kd2Var4.Q();
                    if (Q2 == q18Var) {
                        Q2 = new cf(w44Var2, (byte) 7);
                        kd2Var4.n0(Q2);
                    }
                    nx7.a(f5, c3, null, null, z11, z10, 0.0f, j2, j3, null, null, (sb2) Q2, kd2Var4, 48, 384, 3276);
                    kd2Var4.q(true);
                    return pn6Var;
                }
                kd2Var4.Y();
                return pn6Var;
            default:
                SubtitleFontFamily subtitleFontFamily = (SubtitleFontFamily) obj5;
                ub2 ub2Var2 = (ub2) obj4;
                t62 t62Var = (t62) obj;
                kd2 kd2Var5 = (kd2) obj2;
                int intValue4 = ((Integer) obj3).intValue();
                t62Var.getClass();
                if ((intValue4 & 6) == 0) {
                    if (kd2Var5.f(t62Var)) {
                        i2 = 4;
                    } else {
                        i2 = 2;
                    }
                    intValue4 |= i2;
                }
                if ((intValue4 & 19) != 18) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (kd2Var5.V(intValue4 & 1, z4)) {
                    for (SubtitleFontFamily subtitleFontFamily2 : SubtitleFontFamily.getEntries()) {
                        if (subtitleFontFamily2 == subtitleFontFamily) {
                            z5 = z9;
                        } else {
                            z5 = z8;
                        }
                        if (z5) {
                            kd2Var5.e0(-2106355898);
                            z6 = z5;
                            b = n03.r(kd2Var5).o;
                            kd2Var5.q(z8);
                        } else {
                            z6 = z5;
                            kd2Var5.e0(-2106353364);
                            b = ep0.b(0.4f, n03.r(kd2Var5).r);
                            kd2Var5.q(z8);
                        }
                        px5 a4 = jq5.a(b, z51.V(200, i3, null), "fontCardContainerColor", kd2Var5);
                        if (z6) {
                            kd2Var5.e0(-2106344122);
                            b2 = n03.r(kd2Var5).o;
                            kd2Var5.q(z8);
                        } else {
                            kd2Var5.e0(-2106341651);
                            b2 = ep0.b(0.12f, n03.r(kd2Var5).o);
                            kd2Var5.q(z8);
                        }
                        px5 a5 = jq5.a(b2, z51.V(200, i3, null), "fontCardBorderColor", kd2Var5);
                        boolean d = kd2Var5.d(subtitleFontFamily2.ordinal());
                        Object Q3 = kd2Var5.Q();
                        if (d || Q3 == q18Var) {
                            Q3 = xt5.i(subtitleFontFamily2);
                            kd2Var5.n0(Q3);
                        }
                        q82 q82Var = (q82) Q3;
                        if (1.0f <= 0.0d) {
                            cz2.a("invalid weight; must be greater than zero");
                        }
                        float f6 = Float.MAX_VALUE;
                        if (1.0f <= Float.MAX_VALUE) {
                            f6 = 1.0f;
                        }
                        yz3 h = bx7.h(n03.k(ar5.g(new ob3(f6, true), 48.0f, 0.0f, 2), n03.w(kd2Var5).c), ((ep0) a4.getValue()).a, io3.h);
                        if (z6) {
                            f = 1.5f;
                        } else {
                            f = 1.0f;
                        }
                        yz3 S = n77.S(m37.f(h, f, ((ep0) a5.getValue()).a, n03.w(kd2Var5).c), 10.0f, 12.0f);
                        boolean f7 = kd2Var5.f(ub2Var2) | kd2Var5.d(subtitleFontFamily2.ordinal());
                        Object Q4 = kd2Var5.Q();
                        if (f7 || Q4 == q18Var) {
                            Q4 = new lb5((Object) ub2Var2, (Object) subtitleFontFamily2, (byte) 9);
                            kd2Var5.n0(Q4);
                        }
                        kd2 kd2Var6 = kd2Var5;
                        yz3 A = kb0.A(S, false, null, null, false, (sb2) Q4, kd2Var6, 0, 31);
                        boolean z12 = z6;
                        boolean g = kd2Var6.g(z12);
                        Object Q5 = kd2Var6.Q();
                        if (g || Q5 == q18Var) {
                            Q5 = new gr5((byte) 3, z12);
                            kd2Var6.n0(Q5);
                        }
                        yz3 a6 = rh5.a(A, false, (ub2) Q5);
                        vo3 c4 = b90.c(pk2.C, false);
                        pn6 pn6Var2 = pn6Var;
                        int hashCode5 = Long.hashCode(kd2Var6.T);
                        al4 l5 = kd2Var6.l();
                        yz3 E5 = o80.E(kd2Var6, a6);
                        tt0.d.getClass();
                        kd2Var6.h0();
                        if (kd2Var6.S) {
                            kd2Var6.k(t53Var);
                        } else {
                            kd2Var6.q0();
                        }
                        ss5.i(p7.F, kd2Var6, c4);
                        ss5.i(p7.E, kd2Var6, l5);
                        ss5.i(p7.G, kd2Var6, Integer.valueOf(hashCode5));
                        ss5.h(kd2Var6);
                        ss5.i(p7.D, kd2Var6, E5);
                        String displayName = subtitleFontFamily2.getDisplayName();
                        xd6 xd6Var = n03.y(kd2Var6).m;
                        if (z7) {
                            s92Var = s92.E;
                        } else {
                            s92Var = s92.B;
                        }
                        s92 s92Var2 = s92Var;
                        if (z12) {
                            kd2Var6.e0(-1068694230);
                            j = n03.r(kd2Var6).n;
                            kd2Var6.q(false);
                        } else {
                            kd2Var6.e0(-1068692116);
                            j = n03.r(kd2Var6).o;
                            kd2Var6.q(false);
                        }
                        yc6.b(displayName, null, j, 0L, s92Var2, q82Var, 0L, null, 0L, 0, false, 0, 0, xd6Var, kd2Var6, 0, 3072, 122682);
                        kd2Var6.q(true);
                        kd2Var5 = kd2Var6;
                        pn6Var = pn6Var2;
                        z9 = true;
                        i3 = 6;
                        z8 = false;
                    }
                    return pn6Var;
                }
                kd2Var5.Y();
                return pn6Var;
        }
    }

    public /* synthetic */ xh(Object obj, boolean z, w44 w44Var, byte b) {
        this.x = b;
        this.z = obj;
        this.y = z;
        this.A = w44Var;
    }

    public /* synthetic */ xh(boolean z, String str, String str2) {
        this.x = (byte) 0;
        this.y = z;
        this.z = str;
        this.A = str2;
    }
}
