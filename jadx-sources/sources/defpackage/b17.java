package defpackage;

import com.anistation.android.R;
import java.util.Locale;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final /* synthetic */ class b17 implements ic2 {
    public final /* synthetic */ byte x;
    public final /* synthetic */ String y;
    public final /* synthetic */ boolean z;

    public /* synthetic */ b17(String str, boolean z, byte b) {
        this.x = b;
        this.y = str;
        this.z = z;
    }

    @Override // defpackage.ic2
    public final Object invoke(Object obj, Object obj2) {
        boolean z;
        boolean z2;
        byte b = this.x;
        pn6 pn6Var = pn6.a;
        t53 t53Var = za3.p0;
        vz3 vz3Var = vz3.x;
        boolean z3 = this.z;
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
                    yz3 R = n77.R(ar5.c(vz3Var, 1.0f), 14.0f);
                    z75 a = y75.a(x97.B, pk2.I, kd2Var, 54);
                    int hashCode = Long.hashCode(kd2Var.T);
                    al4 l = kd2Var.l();
                    yz3 E = o80.E(kd2Var, R);
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
                    yc6.b(this.y, null, 0L, 0L, s92.C, null, 0L, null, 0L, 0, false, 0, 0, ((nl6) kd2Var.j(pl6.a)).k, kd2Var, 1572864, 0, 131006);
                    if (z3) {
                        kd2Var.e0(-1727056938);
                        yt2.a(w65.H(R.drawable.tick, kd2Var, 0), lz5.f(R.string.selected_text, kd2Var), ar5.i(vz3Var, 18.0f), ((mp0) kd2Var.j(op0.a)).n, kd2Var, 392, 0);
                        kd2Var.q(false);
                    } else {
                        kd2Var.e0(-1726722789);
                        kd2Var.q(false);
                    }
                    kd2Var.q(true);
                } else {
                    kd2Var.Y();
                }
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
                    yz3 R2 = n77.R(ar5.c(vz3Var, 1.0f), 14.0f);
                    z75 a2 = y75.a(x97.B, pk2.I, kd2Var2, 54);
                    int hashCode2 = Long.hashCode(kd2Var2.T);
                    al4 l2 = kd2Var2.l();
                    yz3 E2 = o80.E(kd2Var2, R2);
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
                    Locale locale = Locale.ROOT;
                    String str = this.y;
                    String lowerCase = str.toLowerCase(locale);
                    lowerCase.getClass();
                    if (lowerCase.equals("auto")) {
                        str = h11.i(kd2Var2, 876801047, R.string.auto, kd2Var2, false);
                    } else {
                        kd2Var2.e0(876802913);
                        kd2Var2.q(false);
                    }
                    yc6.b(str, null, 0L, 0L, s92.C, null, 0L, null, 0L, 0, false, 0, 0, ((nl6) kd2Var2.j(pl6.a)).k, kd2Var2, 1572864, 0, 131006);
                    if (z3) {
                        kd2Var2.e0(1411309605);
                        yt2.a(w65.H(R.drawable.tick, kd2Var2, 0), null, ar5.i(vz3Var, 18.0f), ((mp0) kd2Var2.j(op0.a)).n, kd2Var2, 440, 0);
                        kd2Var2.q(false);
                    } else {
                        kd2Var2.e0(1411611080);
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
