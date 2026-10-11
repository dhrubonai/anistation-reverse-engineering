package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final /* synthetic */ class tb3 implements ic2 {
    public final /* synthetic */ i42 A;
    public final /* synthetic */ boolean B;
    public final /* synthetic */ fc C;
    public final /* synthetic */ ub2 D;
    public final /* synthetic */ int E;
    public final /* synthetic */ short F;
    public final /* synthetic */ th4 G;
    public final /* synthetic */ Object H;
    public final /* synthetic */ Object I;
    public final /* synthetic */ byte x;
    public final /* synthetic */ yz3 y;
    public final /* synthetic */ af3 z;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ tb3(yz3 yz3Var, af3 af3Var, th4 th4Var, Object obj, Object obj2, i42 i42Var, boolean z, fc fcVar, ub2 ub2Var, int i, int i2, byte b) {
        this.x = b;
        this.y = yz3Var;
        this.z = af3Var;
        this.G = th4Var;
        this.H = obj;
        this.I = obj2;
        this.A = i42Var;
        this.B = z;
        this.C = fcVar;
        this.D = ub2Var;
        this.E = i;
        this.F = i2;
    }

    @Override // defpackage.ic2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.x;
        pn6 pn6Var = pn6.a;
        int i = this.E;
        Object obj3 = this.I;
        Object obj4 = this.H;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                int N = kb0.N(i | 1);
                n77.i(this.y, this.z, (vh4) this.G, (ur) obj4, (x50) obj3, this.A, this.B, this.C, this.D, (kd2) obj, N, this.F);
                return pn6Var;
            default:
                ((Integer) obj2).getClass();
                int N2 = kb0.N(i | 1);
                n77.h(this.y, this.z, this.G, (wr) obj4, (d7) obj3, this.A, this.B, this.C, this.D, (kd2) obj, N2, this.F);
                return pn6Var;
        }
    }
}
