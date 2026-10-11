package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class xc implements ic2 {
    public final /* synthetic */ yc5 A;
    public final /* synthetic */ om5 B;
    public final /* synthetic */ long C;
    public final /* synthetic */ float D;
    public final /* synthetic */ os0 E;
    public final /* synthetic */ yz3 x;
    public final /* synthetic */ y44 y;
    public final /* synthetic */ w44 z;

    public xc(yz3 yz3Var, y44 y44Var, w44 w44Var, yc5 yc5Var, om5 om5Var, long j, float f, os0 os0Var) {
        this.x = yz3Var;
        this.y = y44Var;
        this.z = w44Var;
        this.A = yc5Var;
        this.B = om5Var;
        this.C = j;
        this.D = f;
        this.E = os0Var;
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
            wc7.a(this.x, this.y, this.z, this.A, this.B, this.C, this.D, this.E, kd2Var, 384);
        } else {
            kd2Var.Y();
        }
        return pn6.a;
    }
}
