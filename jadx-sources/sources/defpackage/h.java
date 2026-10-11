package defpackage;

import android.content.Context;
import android.graphics.Typeface;
import android.text.Spannable;
import com.anistation.android.R;
import com.anistation.model.download.DownloadSettings;
import com.anistation.model.github.DevProfile;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final /* synthetic */ class h implements jc2 {
    public final /* synthetic */ byte x;
    public final /* synthetic */ Object y;
    public final /* synthetic */ Object z;

    public /* synthetic */ h(gp4 gp4Var, String str) {
        this.x = (byte) 7;
        this.y = gp4Var;
        this.z = str;
    }

    @Override // defpackage.jc2
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        int i;
        boolean z5;
        int i2;
        int i3;
        Typeface typeface;
        byte b = this.x;
        vz3 vz3Var = vz3.x;
        q18 q18Var = au0.a;
        pn6 pn6Var = pn6.a;
        boolean z6 = false;
        int i4 = 0;
        boolean z7 = false;
        boolean z8 = false;
        Object obj4 = this.y;
        Object obj5 = this.z;
        byte b2 = 1;
        switch (b) {
            case 0:
                String str = (String) obj5;
                wf wfVar = (wf) obj4;
                kd2 kd2Var = (kd2) obj2;
                int intValue = ((Integer) obj3).intValue();
                ((yp0) obj).getClass();
                if ((intValue & 17) != 16) {
                    z6 = true;
                }
                if (kd2Var.V(intValue & 1, z6)) {
                    u.d(R.drawable.update, lz5.f(R.string.app_version, kd2Var), str, null, false, kd2Var, 0, 24);
                    String f = lz5.f(R.string.privacy_policy, kd2Var);
                    String f2 = lz5.f(R.string.see_how_app_data_is_handled, kd2Var);
                    boolean h = kd2Var.h(wfVar);
                    Object Q = kd2Var.Q();
                    if (h || Q == q18Var) {
                        Q = new m(wfVar, (byte) 1);
                        kd2Var.n0(Q);
                    }
                    u.a(R.drawable.privacy_policy, f, f2, null, false, (sb2) Q, kd2Var, 24576);
                } else {
                    kd2Var.Y();
                }
                return pn6Var;
            case 1:
                xm6 xm6Var = (xm6) obj5;
                wf wfVar2 = (wf) obj4;
                kd2 kd2Var2 = (kd2) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                ((yp0) obj).getClass();
                if ((intValue2 & 17) != 16) {
                    z = true;
                } else {
                    z = false;
                }
                if (kd2Var2.V(intValue2 & 1, z)) {
                    if (xm6Var.x != null) {
                        kd2Var2.e0(1475668029);
                        DevProfile devProfile = xm6Var.x;
                        Context context = (Context) kd2Var2.j(eb.b);
                        boolean h2 = kd2Var2.h(wfVar2) | kd2Var2.h(xm6Var);
                        Object Q2 = kd2Var2.Q();
                        if (h2 || Q2 == q18Var) {
                            Q2 = new n(wfVar2, xm6Var, false ? (byte) 1 : (byte) 0);
                            kd2Var2.n0(Q2);
                        }
                        u.g(devProfile, context, (sb2) Q2, null, kd2Var2, 0);
                        kd2Var2.q(false);
                    } else {
                        kd2Var2.e0(1475955771);
                        b90.a(bx7.h(ar5.e(ar5.c(vz3Var, 1.0f), 71.0f), ((mp0) kd2Var2.j(op0.a)).p, ((cn5) kd2Var2.j(dn5.a)).d), kd2Var2, 0);
                        kd2Var2.q(false);
                    }
                } else {
                    kd2Var2.Y();
                }
                return pn6Var;
            case 2:
                o80.n((ub2) obj5, obj4, (l11) obj3);
                return pn6Var;
            case 3:
                ub2 ub2Var = (ub2) obj5;
                qz0 qz0Var = (qz0) obj4;
                kd2 kd2Var3 = (kd2) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                if ((intValue3 & 17) != 16) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (kd2Var3.V(intValue3 & 1, z2)) {
                    Object Q3 = kd2Var3.Q();
                    if (Q3 == q18Var) {
                        Q3 = new rz0();
                        kd2Var3.n0(Q3);
                    }
                    rz0 rz0Var = (rz0) Q3;
                    rz0Var.a.clear();
                    ub2Var.invoke(rz0Var);
                    rz0Var.a(qz0Var, kd2Var3, 0);
                } else {
                    kd2Var3.Y();
                }
                return pn6Var;
            case 4:
                k74 k74Var = (k74) obj5;
                j74 j74Var = (j74) obj4;
                kd2 kd2Var4 = (kd2) obj2;
                int intValue4 = ((Integer) obj3).intValue();
                if ((intValue4 & 17) != 16) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (kd2Var4.V(intValue4 & 1, z3)) {
                    k74Var.b.invoke(j74Var, kd2Var4, 0);
                } else {
                    kd2Var4.Y();
                }
                return pn6Var;
            case 5:
                DownloadSettings downloadSettings = (DownloadSettings) obj5;
                ub2 ub2Var2 = (ub2) obj4;
                kd2 kd2Var5 = (kd2) obj2;
                int intValue5 = ((Integer) obj3).intValue();
                ((zc3) obj).getClass();
                if ((intValue5 & 17) != 16) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (kd2Var5.V(intValue5 & 1, z4)) {
                    sl1.f(downloadSettings.getDownloadOverWifiOnly(), ub2Var2, kd2Var5, 0);
                } else {
                    kd2Var5.Y();
                }
                return pn6Var;
            case 6:
                tm6 tm6Var = (tm6) obj5;
                mx4 mx4Var = (mx4) obj4;
                m90 m90Var = (m90) obj;
                kd2 kd2Var6 = (kd2) obj2;
                int intValue6 = ((Integer) obj3).intValue();
                m90Var.getClass();
                if ((intValue6 & 6) == 0) {
                    if (kd2Var6.f(m90Var)) {
                        i = 4;
                    } else {
                        i = 2;
                    }
                    intValue6 |= i;
                }
                if ((intValue6 & 19) != 18) {
                    z8 = true;
                }
                if (kd2Var6.V(intValue6 & 1, z8)) {
                    ex4 ex4Var = ex4.a;
                    boolean z9 = tm6Var.f;
                    tq1 tq1Var = op0.a;
                    ex4Var.a(mx4Var, z9, n77.V(m90Var.a(vz3Var, pk2.z), 0.0f, 105.0f, 0.0f, 0.0f, 13), ((mp0) kd2Var6.j(tq1Var)).n, ((mp0) kd2Var6.j(tq1Var)).o, 0.0f, kd2Var6, 1572864, 32);
                } else {
                    kd2Var6.Y();
                }
                return pn6Var;
            case 7:
                gp4 gp4Var = (gp4) obj4;
                String str2 = (String) obj5;
                kd2 kd2Var7 = (kd2) obj2;
                int intValue7 = ((Integer) obj3).intValue();
                ((a85) obj).getClass();
                if ((intValue7 & 17) != 16) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                if (kd2Var7.V(intValue7 & 1, z5)) {
                    yz3 S = n77.S(vz3Var, 12.0f, 10.0f);
                    z75 a = y75.a(new vr(10.0f, true, new ze0((byte) 6)), pk2.I, kd2Var7, 54);
                    int hashCode = Long.hashCode(kd2Var7.T);
                    al4 l = kd2Var7.l();
                    yz3 E = o80.E(kd2Var7, S);
                    tt0.d.getClass();
                    kd2Var7.h0();
                    if (kd2Var7.S) {
                        kd2Var7.k(za3.p0);
                    } else {
                        kd2Var7.q0();
                    }
                    ss5.i(p7.F, kd2Var7, a);
                    ss5.i(p7.E, kd2Var7, l);
                    ss5.i(p7.G, kd2Var7, Integer.valueOf(hashCode));
                    ss5.h(kd2Var7);
                    ss5.i(p7.D, kd2Var7, E);
                    if (gp4Var == gp4.z) {
                        i2 = R.drawable.unlock;
                    } else {
                        i2 = R.drawable.lock;
                    }
                    yt2.a(w65.H(i2, kd2Var7, 0), null, ar5.i(vz3Var, 20.0f), ep0.b, kd2Var7, 3512, 0);
                    yc6.b(str2, null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, xd6.a(((nl6) kd2Var7.j(pl6.a)).k, 0L, s92.C, null, 0L, null, 0L, null, 16777211), kd2Var7, 0, 0, 131070);
                    kd2Var7.q(true);
                } else {
                    kd2Var7.Y();
                }
                return pn6Var;
            case 8:
                ic6 ic6Var = (ic6) obj5;
                sb2 sb2Var = (sb2) obj4;
                kd2 kd2Var8 = (kd2) obj2;
                int intValue8 = ((Integer) obj3).intValue();
                ((el) obj).getClass();
                if ((intValue8 & 17) != 16) {
                    z7 = true;
                }
                if (kd2Var8.V(intValue8 & 1, z7)) {
                    boolean f3 = kd2Var8.f(ic6Var) | kd2Var8.f(sb2Var);
                    Object Q4 = kd2Var8.Q();
                    if (f3 || Q4 == q18Var) {
                        Q4 = new lb5(ic6Var, sb2Var, b2);
                        kd2Var8.n0(Q4);
                    }
                    zz.a(null, false, true, null, null, 0L, 0L, (sb2) Q4, null, n03.h, kd2Var8, 805306752, 379);
                } else {
                    kd2Var8.Y();
                }
                return pn6Var;
            default:
                Spannable spannable = (Spannable) obj5;
                fd fdVar = (fd) obj4;
                pv5 pv5Var = (pv5) obj;
                int intValue9 = ((Integer) obj2).intValue();
                int intValue10 = ((Integer) obj3).intValue();
                q82 q82Var = pv5Var.f;
                s92 s92Var = pv5Var.c;
                if (s92Var == null) {
                    s92Var = s92.B;
                }
                o92 o92Var = pv5Var.d;
                if (o92Var != null) {
                    i4 = o92Var.a;
                }
                p92 p92Var = pv5Var.e;
                if (p92Var != null) {
                    i3 = p92Var.a;
                } else {
                    i3 = 65535;
                }
                gd gdVar = (gd) fdVar.y;
                ll6 b3 = ((s82) gdVar.B).b(q82Var, s92Var, i4, i3);
                if (!(b3 instanceof kl6)) {
                    st3 st3Var = new st3(b3, gdVar.G);
                    gdVar.G = st3Var;
                    Object obj6 = st3Var.z;
                    obj6.getClass();
                    typeface = (Typeface) obj6;
                } else {
                    Object obj7 = ((kl6) b3).x;
                    obj7.getClass();
                    typeface = (Typeface) obj7;
                }
                spannable.setSpan(new u82(typeface, (byte) 1), intValue9, intValue10, 33);
                return pn6Var;
        }
    }

    public /* synthetic */ h(Object obj, Object obj2, byte b) {
        this.x = b;
        this.z = obj;
        this.y = obj2;
    }
}
