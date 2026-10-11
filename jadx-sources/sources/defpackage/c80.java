package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class c80 implements ic2 {
    public final /* synthetic */ os0 x;
    public final /* synthetic */ float y;

    public c80(os0 os0Var, float f) {
        this.x = os0Var;
        this.y = f;
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
            this.x.invoke(n77.k(0.0f, 0.0f, 0.0f, this.y, 7), kd2Var, 0);
        } else {
            kd2Var.Y();
        }
        return pn6.a;
    }
}
