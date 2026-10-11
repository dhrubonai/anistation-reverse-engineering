package defpackage;

import com.anistation.android.R;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class l80 implements ic2 {
    public final /* synthetic */ v11 A;
    public final /* synthetic */ boolean B;
    public final /* synthetic */ do5 x;
    public final /* synthetic */ os0 y;
    public final /* synthetic */ os0 z;

    public l80(do5 do5Var, os0 os0Var, os0 os0Var2, v11 v11Var, boolean z) {
        this.x = do5Var;
        this.y = os0Var;
        this.z = os0Var2;
        this.A = v11Var;
        this.B = z;
    }

    @Override // defpackage.ic2
    public final Object invoke(Object obj, Object obj2) {
        boolean z;
        kd2 kd2Var = (kd2) obj;
        int intValue = ((Number) obj2).intValue();
        if ((intValue & 3) != 2) {
            z = true;
        } else {
            z = false;
        }
        if (kd2Var.V(intValue & 1, z)) {
            yz3 O = io3.O(ar5.c(vz3.x, 1.0f), new y70(this.x, (byte) 1));
            xp0 a = vp0.a(x97.z, pk2.K, kd2Var, 0);
            int s = h98.s(kd2Var);
            al4 l = kd2Var.l();
            yz3 E = o80.E(kd2Var, O);
            tt0.d.getClass();
            kd2Var.h0();
            if (kd2Var.S) {
                kd2Var.k(za3.p0);
            } else {
                kd2Var.q0();
            }
            ss5.i(p7.F, kd2Var, a);
            ss5.i(p7.E, kd2Var, l);
            st0 st0Var = p7.G;
            if (kd2Var.S || !a34.i(kd2Var.Q(), Integer.valueOf(s))) {
                h11.p(s, kd2Var, s, st0Var);
            }
            ss5.i(p7.D, kd2Var, E);
            kd2Var.e0(-1044068159);
            zn5.a(nx7.R(-511691176, new k80(this.x, this.A, this.B, lt5.m(R.string.m3c_bottom_sheet_expand_description, kd2Var), lt5.m(R.string.m3c_bottom_sheet_collapse_description, kd2Var), lt5.m(R.string.m3c_bottom_sheet_dismiss_description, kd2Var), this.y), kd2Var), kd2Var, 54);
            kd2Var.q(false);
            this.z.invoke(yp0.a, kd2Var, 6);
            kd2Var.q(true);
        } else {
            kd2Var.Y();
        }
        return pn6.a;
    }
}
