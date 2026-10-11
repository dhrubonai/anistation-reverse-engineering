package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import com.anistation.android.R;
import com.anistation.model.Recent;
import com.anistation.model.animelist.WatchStatus;
import java.util.List;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final /* synthetic */ class ni implements ic2 {
    public final /* synthetic */ Object A;
    public final /* synthetic */ Object B;
    public final /* synthetic */ Object C;
    public final /* synthetic */ byte x;
    public final /* synthetic */ Object y;
    public final /* synthetic */ Object z;

    public /* synthetic */ ni(yc5 yc5Var, List list, ub2 ub2Var, sb2 sb2Var, WatchStatus watchStatus) {
        this.x = (byte) 6;
        this.y = yc5Var;
        this.A = list;
        this.z = ub2Var;
        this.B = sb2Var;
        this.C = watchStatus;
    }

    @Override // defpackage.ic2
    public final Object invoke(Object obj, Object obj2) {
        boolean z;
        boolean z2;
        Object value;
        boolean z3;
        boolean z4;
        byte b = this.x;
        Object obj3 = au0.a;
        sb2 sb2Var = za3.p0;
        pn6 pn6Var = pn6.a;
        Object obj4 = this.C;
        Object obj5 = this.B;
        Object obj6 = this.z;
        Object obj7 = this.A;
        Object obj8 = this.y;
        switch (b) {
            case 0:
                th4 th4Var = (th4) obj8;
                ub2 ub2Var = (ub2) obj6;
                xd6 xd6Var = (xd6) obj5;
                px5 px5Var = (px5) obj4;
                kd2 kd2Var = (kd2) obj;
                int intValue = ((Integer) obj2).intValue();
                if ((intValue & 3) != 2) {
                    z = true;
                } else {
                    z = false;
                }
                if (kd2Var.V(intValue & 1, z)) {
                    vz3 vz3Var = vz3.x;
                    yz3 Q = n77.Q(vz3Var, th4Var);
                    z75 a = y75.a(x97.B, pk2.I, kd2Var, 54);
                    int hashCode = Long.hashCode(kd2Var.T);
                    al4 l = kd2Var.l();
                    yz3 E = o80.E(kd2Var, Q);
                    tt0.d.getClass();
                    kd2Var.h0();
                    if (kd2Var.S) {
                        kd2Var.k(sb2Var);
                    } else {
                        kd2Var.q0();
                    }
                    ss5.i(p7.F, kd2Var, a);
                    ss5.i(p7.E, kd2Var, l);
                    ss5.i(p7.G, kd2Var, Integer.valueOf(hashCode));
                    ss5.h(kd2Var);
                    ss5.i(p7.D, kd2Var, E);
                    String str = (String) ub2Var.invoke(obj7);
                    s92 s92Var = s92.C;
                    tq1 tq1Var = op0.a;
                    yc6.b(str, null, ((mp0) kd2Var.j(tq1Var)).o, 0L, s92Var, null, 0L, null, 0L, 0, false, 0, 0, xd6Var, kd2Var, 1572864, 0, 131002);
                    ov5.a(kd2Var, ar5.l(vz3Var, 6.0f));
                    xh4 H = w65.H(R.drawable.arrow_down, kd2Var, 0);
                    long j = ((mp0) kd2Var.j(tq1Var)).o;
                    yz3 i = ar5.i(vz3Var, 22.0f);
                    float floatValue = ((Number) px5Var.getValue()).floatValue();
                    if (floatValue != 0.0f) {
                        i = io3.P(i, 0.0f, 0.0f, 0.0f, 0.0f, floatValue, 0L, null, false, 0L, 0L, 1048319);
                    }
                    yt2.a(H, "Expand options", i, j, kd2Var, 56, 0);
                    kd2Var.q(true);
                } else {
                    kd2Var.Y();
                }
                return pn6Var;
            case 1:
                ((Integer) obj2).getClass();
                o80.d((os0) obj8, (os0) obj6, (os0) obj7, (sb2) obj5, (do5) obj4, (kd2) obj, kb0.N(3505));
                return pn6Var;
            case 2:
                yz3 yz3Var = (yz3) obj8;
                w44 w44Var = (w44) obj6;
                os0 os0Var = (os0) obj7;
                f40 f40Var = (f40) obj5;
                sb2 sb2Var2 = (sb2) obj4;
                kd2 kd2Var2 = (kd2) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if ((intValue2 & 3) != 2) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (kd2Var2.V(intValue2 & 1, z2)) {
                    Object Q2 = kd2Var2.Q();
                    if (Q2 == obj3) {
                        Q2 = new ef(w44Var, (byte) 12);
                        kd2Var2.n0(Q2);
                    }
                    yz3 B = wk6.B(yz3Var, (ub2) Q2);
                    vo3 c = b90.c(pk2.y, true);
                    int hashCode2 = Long.hashCode(kd2Var2.T);
                    al4 l2 = kd2Var2.l();
                    yz3 E2 = o80.E(kd2Var2, B);
                    tt0.d.getClass();
                    kd2Var2.h0();
                    if (kd2Var2.S) {
                        kd2Var2.k(sb2Var);
                    } else {
                        kd2Var2.q0();
                    }
                    ss5.i(p7.F, kd2Var2, c);
                    ss5.i(p7.E, kd2Var2, l2);
                    ss5.i(p7.G, kd2Var2, Integer.valueOf(hashCode2));
                    ss5.h(kd2Var2);
                    ss5.i(p7.D, kd2Var2, E2);
                    os0Var.invoke(kd2Var2, 0);
                    f40Var.b(sb2Var2, kd2Var2, 6);
                    kd2Var2.q(true);
                } else {
                    kd2Var2.Y();
                }
                return pn6Var;
            case 3:
                ((Integer) obj2).getClass();
                bx7.c((String) obj8, (sb2) obj6, (sb2) obj7, (sb2) obj5, (yz3) obj4, (kd2) obj, kb0.N(1));
                return pn6Var;
            case 4:
                Context context = (Context) obj8;
                hm5 hm5Var = (hm5) obj6;
                String str2 = (String) obj7;
                sb2 sb2Var3 = (sb2) obj5;
                String str3 = (String) obj4;
                String str4 = (String) obj;
                String str5 = (String) obj2;
                String str6 = "Unknown";
                str4.getClass();
                str5.getClass();
                try {
                    String str7 = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
                    if (str7 != null) {
                        str6 = str7;
                    }
                } catch (PackageManager.NameNotFoundException unused) {
                }
                String str8 = str6;
                lb5 lb5Var = new lb5(str2, sb2Var3, (byte) 6);
                ez3 ez3Var = new ez3(str3, sb2Var3, (byte) 1);
                sx5 sx5Var = hm5Var.j;
                do {
                    value = sx5Var.getValue();
                } while (!sx5Var.j(value, xm6.a((xm6) value, false, false, null, false, false, false, null, false, false, false, false, null, null, false, null, null, null, null, null, null, false, null, null, false, false, false, true, 134217727)));
                tl7.z(zz.J(hm5Var), null, null, new k41(str4, str5, str8, hm5Var, lb5Var, ez3Var, null), 3);
                return pn6Var;
            case 5:
                ((Integer) obj2).getClass();
                iv.m((Recent) obj8, (vh4) obj7, (yz3) obj5, (ub2) obj6, (ub2) obj4, (kd2) obj, kb0.N(1));
                return pn6Var;
            default:
                yc5 yc5Var = (yc5) obj8;
                List<q17> list = (List) obj7;
                ub2 ub2Var2 = (ub2) obj6;
                sb2 sb2Var4 = (sb2) obj5;
                WatchStatus watchStatus = (WatchStatus) obj4;
                kd2 kd2Var3 = (kd2) obj;
                int intValue3 = ((Integer) obj2).intValue();
                if ((intValue3 & 3) != 2) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (kd2Var3.V(intValue3 & 1, z3)) {
                    tr trVar = x97.z;
                    w50 w50Var = pk2.K;
                    xp0 a2 = vp0.a(trVar, w50Var, kd2Var3, 0);
                    int hashCode3 = Long.hashCode(kd2Var3.T);
                    al4 l3 = kd2Var3.l();
                    vz3 vz3Var2 = vz3.x;
                    yz3 E3 = o80.E(kd2Var3, vz3Var2);
                    tt0.d.getClass();
                    kd2Var3.h0();
                    if (kd2Var3.S) {
                        kd2Var3.k(sb2Var);
                    } else {
                        kd2Var3.q0();
                    }
                    st0 st0Var = p7.F;
                    ss5.i(st0Var, kd2Var3, a2);
                    ys0 ys0Var = p7.E;
                    ss5.i(ys0Var, kd2Var3, l3);
                    Integer valueOf = Integer.valueOf(hashCode3);
                    st0 st0Var2 = p7.G;
                    ss5.i(st0Var2, kd2Var3, valueOf);
                    ss5.h(kd2Var3);
                    ys0 ys0Var2 = p7.D;
                    ss5.i(ys0Var2, kd2Var3, E3);
                    w50 w50Var2 = pk2.L;
                    Object obj9 = obj3;
                    sb2 sb2Var5 = sb2Var4;
                    ub2 ub2Var3 = ub2Var2;
                    yz3 k = n03.k(ar5.e(ar5.l(n77.T(new tn2(w50Var2), 0.0f, 10.0f, 1), 40.0f), 5.0f), tm5.b);
                    jw4 jw4Var = op0.a;
                    b90.a(bx7.h(k, ((mp0) kd2Var3.j(jw4Var)).r, io3.h), kd2Var3, 0);
                    yz3 V = n77.V(ar5.c(vz3Var2, 1.0f), 20.0f, 0.0f, 20.0f, 8.0f, 2);
                    xp0 a3 = vp0.a(trVar, w50Var, kd2Var3, 0);
                    int hashCode4 = Long.hashCode(kd2Var3.T);
                    al4 l4 = kd2Var3.l();
                    yz3 E4 = o80.E(kd2Var3, V);
                    kd2Var3.h0();
                    if (kd2Var3.S) {
                        kd2Var3.k(sb2Var);
                    } else {
                        kd2Var3.q0();
                    }
                    ss5.i(st0Var, kd2Var3, a3);
                    ss5.i(ys0Var, kd2Var3, l4);
                    h11.q(hashCode4, kd2Var3, st0Var2, kd2Var3);
                    ss5.i(ys0Var2, kd2Var3, E4);
                    String f = lz5.f(R.string.edit_watch_status, kd2Var3);
                    jw4 jw4Var2 = pl6.a;
                    yc6.b(f, n77.V(vz3Var2, 0.0f, 16.0f, 0.0f, 0.0f, 13), 0L, 0L, s92.D, null, 0L, null, 0L, 0, false, 0, 0, ((nl6) kd2Var3.j(jw4Var2)).h, kd2Var3, 1572912, 0, 131004);
                    yc6.b(lz5.f(R.string.edit_watch_status_description, kd2Var3), n77.V(vz3Var2, 0.0f, 8.0f, 0.0f, 12.0f, 5), ep0.b(0.65f, ((mp0) kd2Var3.j(jw4Var)).o), 0L, null, null, 0L, null, 0L, 0, false, 0, 0, xd6.a(((nl6) kd2Var3.j(jw4Var2)).l, 0L, null, null, 0L, null, hz5.g(16), null, 16646143), kd2Var3, 48, 0, 131064);
                    yz3 k0 = n77.k0(ar5.c(vz3Var2, 1.0f), yc5Var, 14);
                    xp0 a4 = vp0.a(trVar, w50Var2, kd2Var3, 48);
                    int hashCode5 = Long.hashCode(kd2Var3.T);
                    al4 l5 = kd2Var3.l();
                    yz3 E5 = o80.E(kd2Var3, k0);
                    kd2Var3.h0();
                    if (kd2Var3.S) {
                        kd2Var3.k(sb2Var);
                    } else {
                        kd2Var3.q0();
                    }
                    ss5.i(st0Var, kd2Var3, a4);
                    ss5.i(ys0Var, kd2Var3, l5);
                    h11.q(hashCode5, kd2Var3, st0Var2, kd2Var3);
                    ss5.i(ys0Var2, kd2Var3, E5);
                    kd2Var3.e0(623070102);
                    for (q17 q17Var : list) {
                        WatchStatus watchStatus2 = q17Var.a;
                        if (watchStatus2 == watchStatus) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        String label = watchStatus2.getLabel();
                        int i2 = q17Var.b;
                        ub2 ub2Var4 = ub2Var3;
                        sb2 sb2Var6 = sb2Var5;
                        boolean f2 = kd2Var3.f(ub2Var4) | kd2Var3.f(q17Var) | kd2Var3.f(sb2Var6);
                        Object Q3 = kd2Var3.Q();
                        Object obj10 = obj9;
                        if (f2 || Q3 == obj10) {
                            Q3 = new mi((Object) ub2Var4, (Object) q17Var, (Object) sb2Var6, (byte) 24);
                            kd2Var3.n0(Q3);
                        }
                        wt5.a(label, i2, z4, (sb2) Q3, kd2Var3, 0, 0);
                        obj9 = obj10;
                        sb2Var5 = sb2Var6;
                        ub2Var3 = ub2Var4;
                    }
                    Object obj11 = obj9;
                    sb2 sb2Var7 = sb2Var5;
                    ub2 ub2Var5 = ub2Var3;
                    kd2Var3.q(false);
                    ov5.a(kd2Var3, ar5.e(vz3Var2, 5.0f));
                    kb0.e(ar5.c(vz3Var2, 1.0f), 0.0f, ((mp0) kd2Var3.j(op0.a)).r, kd2Var3, 6, 2);
                    String f3 = lz5.f(R.string.remove, kd2Var3);
                    boolean f4 = kd2Var3.f(ub2Var5) | kd2Var3.f(sb2Var7);
                    Object Q4 = kd2Var3.Q();
                    if (f4 || Q4 == obj11) {
                        Q4 = new v07(ub2Var5, sb2Var7, (byte) 2);
                        kd2Var3.n0(Q4);
                    }
                    wt5.a(f3, R.drawable.remove_my_list, false, (sb2) Q4, kd2Var3, 0, 4);
                    kd2Var3.q(true);
                    kd2Var3.q(true);
                    kd2Var3.q(true);
                    return pn6Var;
                }
                kd2Var3.Y();
                return pn6Var;
        }
    }

    public /* synthetic */ ni(Recent recent, vh4 vh4Var, yz3 yz3Var, ub2 ub2Var, ub2 ub2Var2, int i) {
        this.x = (byte) 5;
        this.y = recent;
        this.A = vh4Var;
        this.B = yz3Var;
        this.z = ub2Var;
        this.C = ub2Var2;
    }

    public /* synthetic */ ni(Object obj, ec2 ec2Var, ec2 ec2Var2, sb2 sb2Var, Object obj2, int i, byte b) {
        this.x = b;
        this.y = obj;
        this.z = ec2Var;
        this.A = ec2Var2;
        this.B = sb2Var;
        this.C = obj2;
    }

    public /* synthetic */ ni(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, byte b) {
        this.x = b;
        this.y = obj;
        this.z = obj2;
        this.A = obj3;
        this.B = obj4;
        this.C = obj5;
    }
}
