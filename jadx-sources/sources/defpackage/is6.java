package defpackage;

import android.content.Context;
import android.os.Build;
import com.anistation.model.Recent;
import com.anistation.model.download.DownloadSettings;
import com.anistation.model.download.DownloadStorageUsage;
import java.util.List;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final /* synthetic */ class is6 implements ic2 {
    public final /* synthetic */ Object A;
    public final /* synthetic */ Object B;
    public final /* synthetic */ Object C;
    public final /* synthetic */ Object D;
    public final /* synthetic */ byte x = 3;
    public final /* synthetic */ ub2 y;
    public final /* synthetic */ Object z;

    public /* synthetic */ is6(ev2 ev2Var, String str, Recent recent, ub2 ub2Var, String str2, String str3) {
        this.z = ev2Var;
        this.A = str;
        this.D = recent;
        this.y = ub2Var;
        this.B = str2;
        this.C = str3;
    }

    @Override // defpackage.ic2
    public final Object invoke(Object obj, Object obj2) {
        boolean z;
        boolean z2;
        byte b = this.x;
        ub2 ub2Var = this.y;
        pn6 pn6Var = pn6.a;
        Object obj3 = this.D;
        Object obj4 = this.C;
        Object obj5 = this.B;
        Object obj6 = this.A;
        Object obj7 = this.z;
        switch (b) {
            case 0:
                ev2 ev2Var = (ev2) obj7;
                String str = (String) obj6;
                Recent recent = (Recent) obj3;
                String str2 = (String) obj5;
                String str3 = (String) obj4;
                kd2 kd2Var = (kd2) obj;
                int intValue = ((Integer) obj2).intValue();
                if ((intValue & 3) != 2) {
                    z = true;
                } else {
                    z = false;
                }
                if (kd2Var.V(intValue & 1, z)) {
                    vz3 vz3Var = vz3.x;
                    yz3 V = n77.V(ar5.c(vz3Var, 1.0f), 0.0f, 0.0f, 0.0f, 20.0f, 7);
                    xp0 a = vp0.a(new vr(12.0f, true, new ze0((byte) 6)), pk2.L, kd2Var, 54);
                    int hashCode = Long.hashCode(kd2Var.T);
                    al4 l = kd2Var.l();
                    yz3 E = o80.E(kd2Var, V);
                    tt0.d.getClass();
                    kd2Var.h0();
                    boolean z3 = kd2Var.S;
                    t53 t53Var = za3.p0;
                    if (z3) {
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
                    yz3 k = n03.k(wc7.h(ar5.c(vz3Var, 1.0f)), ((cn5) kd2Var.j(dn5.a)).c);
                    tq1 tq1Var = op0.a;
                    yz3 h = bx7.h(k, ((mp0) kd2Var.j(tq1Var)).p, io3.h);
                    vo3 c = b90.c(pk2.y, false);
                    int hashCode2 = Long.hashCode(kd2Var.T);
                    al4 l2 = kd2Var.l();
                    yz3 E2 = o80.E(kd2Var, h);
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
                    tl7.a(ev2Var, str, ar5.c, pk2.O, kd2Var, 1573248);
                    n03.c(qx1.h(recent.getEpisodeNumber(), "EP "), n77.R(n90.a.a(vz3Var, pk2.G), 10.0f), null, ep0.b(0.65f, ep0.b), null, ep0.e, null, null, kd2Var, 199680, 212);
                    kd2Var.q(true);
                    yz3 T = n77.T(ar5.c(vz3Var, 1.0f), 4.0f, 0.0f, 2);
                    z75 a2 = y75.a(new vr(12.0f, true, new ze0((byte) 6)), pk2.H, kd2Var, 54);
                    int hashCode3 = Long.hashCode(kd2Var.T);
                    al4 l3 = kd2Var.l();
                    yz3 E3 = o80.E(kd2Var, T);
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
                    iv.n(recent, ub2Var, kd2Var, 0);
                    yz3 w = n77.V(vz3Var, 0.0f, 0.0f, 20.0f, 0.0f, 11).w(new ob3(1.0f, true));
                    xp0 a3 = vp0.a(new vr(4.0f, true, new ze0((byte) 6)), pk2.K, kd2Var, 54);
                    int hashCode4 = Long.hashCode(kd2Var.T);
                    al4 l4 = kd2Var.l();
                    yz3 E4 = o80.E(kd2Var, w);
                    kd2Var.h0();
                    if (kd2Var.S) {
                        kd2Var.k(t53Var);
                    } else {
                        kd2Var.q0();
                    }
                    ss5.i(st0Var, kd2Var, a3);
                    ss5.i(ys0Var, kd2Var, l4);
                    h11.q(hashCode4, kd2Var, st0Var2, kd2Var);
                    ss5.i(ys0Var2, kd2Var, E4);
                    yc6.b(str2, null, ((mp0) kd2Var.j(tq1Var)).o, 0L, s92.C, null, 0L, null, 0L, 2, false, 2, 0, xd6.a(((nl6) kd2Var.j(pl6.a)).j, 0L, null, null, 0L, null, hz5.g(22), null, 16646143), kd2Var, 1572864, 24960, 110522);
                    iv.o(str, str3, kd2Var, 0);
                    kd2Var.q(true);
                    kd2Var.q(true);
                    kd2Var.q(true);
                    return pn6Var;
                }
                kd2Var.Y();
                return pn6Var;
            case 1:
                ((Integer) obj2).getClass();
                sl1.b((DownloadSettings) obj7, (DownloadStorageUsage) obj6, (sb2) obj5, (sb2) obj4, this.y, (sb2) obj3, (kd2) obj, kb0.N(1));
                return pn6Var;
            case 2:
                ((Integer) obj2).getClass();
                pb5.b((vm6) obj7, (kc2) obj6, this.y, (sb2) obj5, (sb2) obj4, (af3) obj3, (kd2) obj, kb0.N(9));
                return pn6Var;
            default:
                Context context = (Context) obj7;
                sm3 sm3Var = (sm3) obj6;
                w44 w44Var = (w44) obj3;
                bm1 bm1Var = (bm1) obj;
                String str4 = (String) obj2;
                bm1Var.getClass();
                str4.getClass();
                List list = ((ym6) ((px5) obj5).getValue()).w;
                boolean booleanValue = ((Boolean) ((w44) obj4).getValue()).booleanValue();
                list.getClass();
                if (!booleanValue && str4.equals(z51.u(list))) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                uk4 uk4Var = new uk4(bm1Var, str4, z2);
                if (Build.VERSION.SDK_INT >= 33 && t80.A(context, "android.permission.POST_NOTIFICATIONS") != 0) {
                    w44Var.setValue(uk4Var);
                    sm3Var.a("android.permission.POST_NOTIFICATIONS");
                } else {
                    ub2Var.invoke(uk4Var);
                }
                return pn6Var;
        }
    }

    public /* synthetic */ is6(vm6 vm6Var, kc2 kc2Var, ub2 ub2Var, sb2 sb2Var, sb2 sb2Var2, af3 af3Var, int i) {
        this.z = vm6Var;
        this.A = kc2Var;
        this.y = ub2Var;
        this.B = sb2Var;
        this.C = sb2Var2;
        this.D = af3Var;
    }

    public /* synthetic */ is6(Context context, sm3 sm3Var, ub2 ub2Var, w44 w44Var, w44 w44Var2, w44 w44Var3) {
        this.z = context;
        this.A = sm3Var;
        this.y = ub2Var;
        this.B = w44Var;
        this.C = w44Var2;
        this.D = w44Var3;
    }

    public /* synthetic */ is6(DownloadSettings downloadSettings, DownloadStorageUsage downloadStorageUsage, sb2 sb2Var, sb2 sb2Var2, ub2 ub2Var, sb2 sb2Var3, int i) {
        this.z = downloadSettings;
        this.A = downloadStorageUsage;
        this.B = sb2Var;
        this.C = sb2Var2;
        this.y = ub2Var;
        this.D = sb2Var3;
    }
}
