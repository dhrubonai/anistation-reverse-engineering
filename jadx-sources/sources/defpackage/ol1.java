package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final /* synthetic */ class ol1 implements ic2 {
    public final /* synthetic */ long A;
    public final /* synthetic */ yz3 B;
    public final /* synthetic */ byte x;
    public final /* synthetic */ String y;
    public final /* synthetic */ String z;

    public /* synthetic */ ol1(String str, String str2, long j, yz3 yz3Var, int i, byte b) {
        this.x = b;
        this.y = str;
        this.z = str2;
        this.A = j;
        this.B = yz3Var;
    }

    @Override // defpackage.ic2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.x;
        pn6 pn6Var = pn6.a;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                int N = kb0.N(1);
                sl1.e(this.y, this.z, this.A, this.B, (kd2) obj, N);
                return pn6Var;
            default:
                ((Integer) obj2).getClass();
                int N2 = kb0.N(1);
                bb4.m(this.y, this.z, this.A, this.B, (kd2) obj, N2);
                return pn6Var;
        }
    }
}
