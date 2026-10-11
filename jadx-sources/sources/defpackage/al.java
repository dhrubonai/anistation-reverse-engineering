package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public final class al extends x93 implements ic2 {
    public final /* synthetic */ yz3 A;
    public final /* synthetic */ iv1 B;
    public final /* synthetic */ rx1 C;
    public final /* synthetic */ String D;
    public final /* synthetic */ os0 E;
    public final /* synthetic */ int F;
    public final /* synthetic */ byte G;
    public final /* synthetic */ byte y;
    public final /* synthetic */ boolean z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ al(boolean z, yz3 yz3Var, iv1 iv1Var, rx1 rx1Var, String str, os0 os0Var, int i, int i2, byte b) {
        super(2);
        this.y = b;
        this.z = z;
        this.A = yz3Var;
        this.B = iv1Var;
        this.C = rx1Var;
        this.D = str;
        this.E = os0Var;
        this.F = i;
        this.G = i2;
    }

    @Override // defpackage.ic2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.y;
        pn6 pn6Var = pn6.a;
        int i = this.F;
        switch (b) {
            case 0:
                ((Number) obj2).intValue();
                int N = kb0.N(i | 1);
                byte b2 = this.G;
                te4.c(this.z, this.A, this.B, this.C, this.D, this.E, (kd2) obj, N, b2);
                return pn6Var;
            default:
                ((Number) obj2).intValue();
                int N2 = kb0.N(i | 1);
                byte b3 = this.G;
                te4.d(this.z, this.A, this.B, this.C, this.D, this.E, (kd2) obj, N2, b3);
                return pn6Var;
        }
    }
}
