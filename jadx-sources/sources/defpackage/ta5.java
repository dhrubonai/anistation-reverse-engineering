package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class ta5 implements ic2 {
    public final /* synthetic */ ic2 A;
    public final /* synthetic */ ic2 B;
    public final /* synthetic */ b54 C;
    public final /* synthetic */ ic2 D;
    public final /* synthetic */ byte x;
    public final /* synthetic */ ic2 y;
    public final /* synthetic */ os0 z;

    /* JADX WARN: Multi-variable type inference failed */
    public ta5(int i, ic2 ic2Var, os0 os0Var, ic2 ic2Var2, ic2 ic2Var3, b54 b54Var, ic2 ic2Var4) {
        this.x = i;
        this.y = ic2Var;
        this.z = os0Var;
        this.A = ic2Var2;
        this.B = ic2Var3;
        this.C = b54Var;
        this.D = ic2Var4;
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
            bb4.l(this.x, this.y, this.z, this.A, this.B, this.C, this.D, kd2Var, 0);
        } else {
            kd2Var.Y();
        }
        return pn6.a;
    }
}
