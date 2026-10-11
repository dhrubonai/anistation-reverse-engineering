package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class d80 implements ic2 {
    public final /* synthetic */ boolean A;
    public final /* synthetic */ om5 B;
    public final /* synthetic */ long C;
    public final /* synthetic */ long D;
    public final /* synthetic */ float E;
    public final /* synthetic */ os0 F;
    public final /* synthetic */ os0 G;
    public final /* synthetic */ n80 x;
    public final /* synthetic */ float y;
    public final /* synthetic */ float z;

    public d80(n80 n80Var, float f, float f2, boolean z, om5 om5Var, long j, long j2, float f3, os0 os0Var, os0 os0Var2) {
        this.x = n80Var;
        this.y = f;
        this.z = f2;
        this.A = z;
        this.B = om5Var;
        this.C = j;
        this.D = j2;
        this.E = f3;
        this.F = os0Var;
        this.G = os0Var2;
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
            o80.h(this.x.a, this.y, this.z, this.A, this.B, this.C, this.D, this.E, this.F, this.G, kd2Var, 0);
        } else {
            kd2Var.Y();
        }
        return pn6.a;
    }
}
