package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final /* synthetic */ class x64 implements ic2 {
    public final /* synthetic */ byte x;
    public final /* synthetic */ wp5 y;

    public /* synthetic */ x64(wp5 wp5Var, byte b) {
        this.x = b;
        this.y = wp5Var;
    }

    @Override // defpackage.ic2
    public final Object invoke(Object obj, Object obj2) {
        boolean z;
        boolean z2;
        byte b = this.x;
        pn6 pn6Var = pn6.a;
        wp5 wp5Var = this.y;
        kd2 kd2Var = (kd2) obj;
        int intValue = ((Integer) obj2).intValue();
        switch (b) {
            case 0:
                if ((intValue & 3) != 2) {
                    z = true;
                } else {
                    z = false;
                }
                if (kd2Var.V(intValue & 1, z)) {
                    wp5Var.e.invoke(kd2Var, 0);
                } else {
                    kd2Var.Y();
                }
                return pn6Var;
            default:
                if ((intValue & 3) != 2) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (kd2Var.V(intValue & 1, z2)) {
                    wp5Var.b.a(0, kd2Var);
                } else {
                    kd2Var.Y();
                }
                return pn6Var;
        }
    }
}
