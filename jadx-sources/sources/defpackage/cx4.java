package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class cx4 implements jc2 {
    public final /* synthetic */ long x;
    public final /* synthetic */ mx4 y;

    public cx4(long j, mx4 mx4Var) {
        this.x = j;
        this.y = mx4Var;
    }

    @Override // defpackage.jc2
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        boolean z;
        int i;
        boolean booleanValue = ((Boolean) obj).booleanValue();
        kd2 kd2Var = (kd2) obj2;
        int intValue = ((Number) obj3).intValue();
        if ((intValue & 6) == 0) {
            if (kd2Var.g(booleanValue)) {
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
        if (kd2Var.V(intValue & 1, z)) {
            if (booleanValue) {
                kd2Var.e0(-499784343);
                cv4.a(ar5.i(vz3.x, 16.0f), this.x, 2.5f, 0L, 0, 0.0f, kd2Var, 390, 56);
                kd2Var.q(false);
            } else {
                kd2Var.e0(-499540745);
                mx4 mx4Var = this.y;
                boolean f = kd2Var.f(mx4Var);
                Object Q = kd2Var.Q();
                if (f || Q == au0.a) {
                    Q = new bx4(mx4Var);
                    kd2Var.n0(Q);
                }
                nx7.b((bx4) Q, this.x, kd2Var, 0);
                kd2Var.q(false);
            }
        } else {
            kd2Var.Y();
        }
        return pn6.a;
    }
}
