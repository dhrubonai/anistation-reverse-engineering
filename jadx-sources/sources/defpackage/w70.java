package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class w70 implements ic2 {
    public final /* synthetic */ float x;
    public final /* synthetic */ float y;

    public w70(float f, float f2) {
        this.x = f;
        this.y = f2;
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
            b90.a(ar5.j(vz3.x, this.x, this.y), kd2Var, 0);
        } else {
            kd2Var.Y();
        }
        return pn6.a;
    }
}
