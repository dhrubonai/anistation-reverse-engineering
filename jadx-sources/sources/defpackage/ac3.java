package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final /* synthetic */ class ac3 implements kc2 {
    public final /* synthetic */ byte x;
    public final /* synthetic */ os0 y;

    public /* synthetic */ ac3(os0 os0Var, byte b) {
        this.x = b;
        this.y = os0Var;
    }

    @Override // defpackage.kc2
    public final Object e(Object obj, Object obj2, Object obj3, Object obj4) {
        byte b = this.x;
        pn6 pn6Var = pn6.a;
        boolean z = false;
        int i = 2;
        os0 os0Var = this.y;
        switch (b) {
            case 0:
                fc3 fc3Var = (fc3) obj;
                ((Integer) obj2).getClass();
                kd2 kd2Var = (kd2) obj3;
                int intValue = ((Integer) obj4).intValue();
                if ((intValue & 6) == 0) {
                    if (kd2Var.f(fc3Var)) {
                        i = 4;
                    }
                    intValue |= i;
                }
                if ((intValue & 131) != 130) {
                    z = true;
                }
                if (kd2Var.V(intValue & 1, z)) {
                    os0Var.invoke(fc3Var, kd2Var, Integer.valueOf(intValue & 14));
                } else {
                    kd2Var.Y();
                }
                return pn6Var;
            default:
                zc3 zc3Var = (zc3) obj;
                ((Integer) obj2).getClass();
                kd2 kd2Var2 = (kd2) obj3;
                int intValue2 = ((Integer) obj4).intValue();
                if ((intValue2 & 6) == 0) {
                    if (kd2Var2.f(zc3Var)) {
                        i = 4;
                    }
                    intValue2 |= i;
                }
                if ((intValue2 & 131) != 130) {
                    z = true;
                }
                if (kd2Var2.V(intValue2 & 1, z)) {
                    os0Var.invoke(zc3Var, kd2Var2, Integer.valueOf(intValue2 & 14));
                } else {
                    kd2Var2.Y();
                }
                return pn6Var;
        }
    }
}
