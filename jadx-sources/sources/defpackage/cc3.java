package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final /* synthetic */ class cc3 implements ic2 {
    public final /* synthetic */ byte x;
    public final /* synthetic */ int y;
    public final /* synthetic */ Object z;

    public /* synthetic */ cc3(yz3 yz3Var, int i) {
        this.x = (byte) 3;
        os0 os0Var = zs0.a;
        this.z = yz3Var;
        this.y = i;
    }

    @Override // defpackage.ic2
    public final Object invoke(Object obj, Object obj2) {
        boolean z;
        byte b = this.x;
        boolean z2 = false;
        pn6 pn6Var = pn6.a;
        int i = this.y;
        Object obj3 = this.z;
        switch (b) {
            case 0:
                dc3 dc3Var = (dc3) obj3;
                kd2 kd2Var = (kd2) obj;
                int intValue = ((Integer) obj2).intValue();
                if ((intValue & 3) != 2) {
                    z2 = true;
                }
                if (kd2Var.V(intValue & 1, z2)) {
                    g23 i2 = dc3Var.b.v.i(i);
                    ((yb3) i2.c).d.e(fc3.a, Integer.valueOf(i - i2.a), kd2Var, 6);
                } else {
                    kd2Var.Y();
                }
                return pn6Var;
            case 1:
                qe3 qe3Var = (qe3) obj3;
                kd2 kd2Var2 = (kd2) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if ((intValue2 & 3) != 2) {
                    z = true;
                } else {
                    z = false;
                }
                if (kd2Var2.V(intValue2 & 1, z)) {
                    g23 i3 = qe3Var.b.u.i(i);
                    ((ne3) i3.c).c.e(qe3Var.c, Integer.valueOf(i - i3.a), kd2Var2, 0);
                } else {
                    kd2Var2.Y();
                }
                return pn6Var;
            case 2:
                ((Integer) obj2).getClass();
                ((j74) obj3).a(kb0.N(i | 1), (kd2) obj);
                return pn6Var;
            default:
                os0 os0Var = zs0.a;
                ((Integer) obj2).getClass();
                qs5.a((yz3) obj3, (kd2) obj, kb0.N(i | 1));
                return pn6Var;
        }
    }

    public /* synthetic */ cc3(Object obj, int i, byte b) {
        this.x = b;
        this.z = obj;
        this.y = i;
    }
}
