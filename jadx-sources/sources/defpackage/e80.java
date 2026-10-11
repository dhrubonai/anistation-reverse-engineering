package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class e80 implements ic2 {
    public final /* synthetic */ float A;
    public final /* synthetic */ boolean B;
    public final /* synthetic */ om5 C;
    public final /* synthetic */ long D;
    public final /* synthetic */ long E;
    public final /* synthetic */ float F;
    public final /* synthetic */ os0 G;
    public final /* synthetic */ os0 H;
    public final /* synthetic */ jc2 I;
    public final /* synthetic */ n80 x;
    public final /* synthetic */ os0 y;
    public final /* synthetic */ float z;

    public e80(n80 n80Var, os0 os0Var, float f, float f2, boolean z, om5 om5Var, long j, long j2, float f3, os0 os0Var2, os0 os0Var3, jc2 jc2Var) {
        this.x = n80Var;
        this.y = os0Var;
        this.z = f;
        this.A = f2;
        this.B = z;
        this.C = om5Var;
        this.D = j;
        this.E = j2;
        this.F = f3;
        this.G = os0Var2;
        this.H = os0Var3;
        this.I = jc2Var;
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
            n80 n80Var = this.x;
            do5 do5Var = n80Var.a;
            os0 R = nx7.R(-519581786, new c80(this.y, this.z), kd2Var);
            os0 R2 = nx7.R(-815624571, new d80(this.x, this.z, this.A, this.B, this.C, this.D, this.E, this.F, this.G, this.H), kd2Var);
            os0 R3 = nx7.R(-1111667356, new d50((Object) this.I, (Object) n80Var, (byte) 1), kd2Var);
            boolean f = kd2Var.f(n80Var);
            Object Q = kd2Var.Q();
            if (f || Q == au0.a) {
                Q = new y7(n80Var, (byte) 23);
                kd2Var.n0(Q);
            }
            o80.d(R, R2, R3, (sb2) Q, do5Var, kd2Var, 3504);
        } else {
            kd2Var.Y();
        }
        return pn6.a;
    }
}
