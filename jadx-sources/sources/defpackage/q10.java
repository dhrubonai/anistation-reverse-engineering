package defpackage;

import com.anistation.android.R;
import com.anistation.model.AnimeWatchOrderItem;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final /* synthetic */ class q10 implements ic2 {
    public final /* synthetic */ byte x;
    public final /* synthetic */ String y;

    public /* synthetic */ q10(String str, byte b) {
        this.x = b;
        this.y = str;
    }

    @Override // defpackage.ic2
    public final Object invoke(Object obj, Object obj2) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        byte b = this.x;
        t53 t53Var = za3.p0;
        String str = this.y;
        vz3 vz3Var = vz3.x;
        pn6 pn6Var = pn6.a;
        boolean z6 = false;
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
                    yz3 S = n77.S(vz3Var, 12.0f, 8.0f);
                    z75 a = y75.a(new vr(8.0f, true, new ze0((byte) 6)), pk2.I, kd2Var, 54);
                    int hashCode = Long.hashCode(kd2Var.T);
                    al4 l = kd2Var.l();
                    yz3 E = o80.E(kd2Var, S);
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
                    yt2.a(w65.H(R.drawable.check_circle, kd2Var, 0), null, ar5.i(vz3Var, 16.0f), ip0.m, kd2Var, 440, 0);
                    yc6.b(this.y, null, ep0.b(0.85f, ((mp0) kd2Var.j(op0.a)).o), 0L, null, null, 0L, null, 0L, 2, false, 0, 0, ((nl6) kd2Var.j(pl6.a)).l, kd2Var, 0, 384, 126970);
                    kd2Var.q(true);
                } else {
                    kd2Var.Y();
                }
                return pn6Var;
            case 1:
                kd2 kd2Var2 = (kd2) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if ((intValue2 & 3) != 2) {
                    z6 = true;
                }
                if (kd2Var2.V(intValue2 & 1, z6)) {
                    yc6.b(this.y, null, ((mp0) kd2Var2.j(op0.a)).o, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, ((nl6) kd2Var2.j(pl6.a)).j, kd2Var2, 0, 0, 131066);
                } else {
                    kd2Var2.Y();
                }
                return pn6Var;
            case 2:
                kd2 kd2Var3 = (kd2) obj;
                int intValue3 = ((Integer) obj2).intValue();
                if ((intValue3 & 3) != 2) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (kd2Var3.V(intValue3 & 1, z2)) {
                    yz3 R = n77.R(vz3Var, 16.0f);
                    xp0 a2 = vp0.a(x97.z, pk2.K, kd2Var3, 0);
                    int hashCode2 = Long.hashCode(kd2Var3.T);
                    al4 l2 = kd2Var3.l();
                    yz3 E2 = o80.E(kd2Var3, R);
                    tt0.d.getClass();
                    kd2Var3.h0();
                    if (kd2Var3.S) {
                        kd2Var3.k(t53Var);
                    } else {
                        kd2Var3.q0();
                    }
                    ss5.i(p7.F, kd2Var3, a2);
                    ss5.i(p7.E, kd2Var3, l2);
                    ss5.i(p7.G, kd2Var3, Integer.valueOf(hashCode2));
                    ss5.h(kd2Var3);
                    ss5.i(p7.D, kd2Var3, E2);
                    String f = lz5.f(R.string.saved_to, kd2Var3);
                    tq1 tq1Var = pl6.a;
                    xd6 xd6Var = ((nl6) kd2Var3.j(tq1Var)).m;
                    s92 s92Var = s92.D;
                    tq1 tq1Var2 = op0.a;
                    yc6.b(f, null, ((mp0) kd2Var3.j(tq1Var2)).o, 0L, s92Var, null, 0L, null, 0L, 0, false, 0, 0, xd6Var, kd2Var3, 1572864, 0, 131002);
                    ov5.a(kd2Var3, ar5.e(vz3Var, 6.0f));
                    yc6.b(this.y, null, ((mp0) kd2Var3.j(tq1Var2)).o, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, ((nl6) kd2Var3.j(tq1Var)).k, kd2Var3, 0, 0, 131066);
                    kd2Var3.q(true);
                } else {
                    kd2Var3.Y();
                }
                return pn6Var;
            case 3:
                kd2 kd2Var4 = (kd2) obj;
                int intValue4 = ((Integer) obj2).intValue();
                if ((intValue4 & 3) != 2) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (kd2Var4.V(intValue4 & 1, z3)) {
                    yt2.a(w65.H(R.drawable.arrow_up_left, kd2Var4, 0), lz5.g(R.string.search_history_edit_query, new Object[]{str}, kd2Var4), ar5.i(vz3Var, 26.0f), ((mp0) kd2Var4.j(op0.a)).o, kd2Var4, 392, 0);
                } else {
                    kd2Var4.Y();
                }
                return pn6Var;
            case 4:
                kd2 kd2Var5 = (kd2) obj;
                int intValue5 = ((Integer) obj2).intValue();
                if ((intValue5 & 3) != 2) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (kd2Var5.V(intValue5 & 1, z4)) {
                    yt2.a(w65.H(R.drawable.arrow_up_left, kd2Var5, 0), lz5.g(R.string.search_history_edit_query, new Object[]{str}, kd2Var5), ar5.i(vz3Var, 26.0f), ((mp0) kd2Var5.j(op0.a)).o, kd2Var5, 392, 0);
                } else {
                    kd2Var5.Y();
                }
                return pn6Var;
            case 5:
                kd2 kd2Var6 = (kd2) obj;
                int intValue6 = ((Integer) obj2).intValue();
                if ((intValue6 & 3) != 2) {
                    z6 = true;
                }
                if (kd2Var6.V(intValue6 & 1, z6)) {
                    xd6 xd6Var2 = ((nl6) kd2Var6.j(pl6.a)).n;
                    yc6.b(this.y, null, ((mp0) kd2Var6.j(op0.a)).o, 0L, s92.D, null, 0L, null, 0L, 0, false, 0, 0, xd6Var2, kd2Var6, 1572864, 0, 131002);
                } else {
                    kd2Var6.Y();
                }
                return pn6Var;
            case 6:
                int intValue7 = ((Integer) obj).intValue();
                AnimeWatchOrderItem animeWatchOrderItem = (AnimeWatchOrderItem) obj2;
                animeWatchOrderItem.getClass();
                Object id = animeWatchOrderItem.getId();
                if (id == null) {
                    id = Integer.valueOf(animeWatchOrderItem.getAnilistId());
                }
                return str + "-" + id + "-" + intValue7;
            default:
                kd2 kd2Var7 = (kd2) obj;
                int intValue8 = ((Integer) obj2).intValue();
                if ((intValue8 & 3) != 2) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                if (kd2Var7.V(intValue8 & 1, z5)) {
                    yt2.a(w65.H(R.drawable.sort, kd2Var7, 0), this.y, ar5.i(vz3Var, 20.0f), 0L, kd2Var7, 392, 8);
                } else {
                    kd2Var7.Y();
                }
                return pn6Var;
        }
    }
}
