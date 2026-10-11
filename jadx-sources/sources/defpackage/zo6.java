package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final /* synthetic */ class zo6 implements ic2 {
    public final /* synthetic */ String A;
    public final /* synthetic */ sb2 B;
    public final /* synthetic */ short C;
    public final /* synthetic */ byte D;
    public final /* synthetic */ byte x = 0;
    public final /* synthetic */ int y;
    public final /* synthetic */ yz3 z;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ zo6(int i, yz3 yz3Var, String str, sb2 sb2Var, int i2, int i3) {
        this.y = i;
        this.z = yz3Var;
        this.A = str;
        this.B = sb2Var;
        this.C = i2;
        this.D = i3;
    }

    @Override // defpackage.ic2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.x;
        pn6 pn6Var = pn6.a;
        short s = this.C;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                int N = kb0.N(s | 1);
                nx7.g(this.y, N, this.D, this.B, (kd2) obj, this.z, this.A);
                return pn6Var;
            default:
                ((Integer) obj2).getClass();
                int N2 = kb0.N(s | 1);
                nx7.h(this.y, N2, this.D, this.B, (kd2) obj, this.z, this.A);
                return pn6Var;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ zo6(int i, String str, sb2 sb2Var, yz3 yz3Var, int i2, int i3) {
        this.y = i;
        this.A = str;
        this.B = sb2Var;
        this.z = yz3Var;
        this.C = i2;
        this.D = i3;
    }
}
