package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final /* synthetic */ class v20 implements ic2 {
    public final /* synthetic */ long A;
    public final /* synthetic */ long B;
    public final /* synthetic */ om5 C;
    public final /* synthetic */ os0 D;
    public final /* synthetic */ int E;
    public final /* synthetic */ byte F;
    public final /* synthetic */ byte x;
    public final /* synthetic */ yz3 y;
    public final /* synthetic */ th4 z;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ v20(yz3 yz3Var, th4 th4Var, long j, long j2, om5 om5Var, os0 os0Var, int i, int i2, byte b) {
        this.x = b;
        this.y = yz3Var;
        this.z = th4Var;
        this.A = j;
        this.B = j2;
        this.C = om5Var;
        this.D = os0Var;
        this.E = i;
        this.F = i2;
    }

    @Override // defpackage.ic2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.x;
        pn6 pn6Var = pn6.a;
        int i = this.E;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                int N = kb0.N(i | 1);
                n03.b(this.y, this.z, this.A, this.B, this.C, this.D, (kd2) obj, N, this.F);
                return pn6Var;
            default:
                ((Integer) obj2).getClass();
                int N2 = kb0.N(i | 1);
                wk6.b(this.y, this.z, this.A, this.B, this.C, this.D, (kd2) obj, N2, this.F);
                return pn6Var;
        }
    }
}
