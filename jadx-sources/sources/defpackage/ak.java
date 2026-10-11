package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class ak extends x93 implements ic2 {
    public final /* synthetic */ ub2 A;
    public final /* synthetic */ yz3 B;
    public final /* synthetic */ os0 C;
    public final /* synthetic */ int D;
    public final /* synthetic */ Object E;
    public final /* synthetic */ Object F;
    public final /* synthetic */ Object G;
    public final /* synthetic */ byte y = 1;
    public final /* synthetic */ xi6 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ak(xi6 xi6Var, ub2 ub2Var, yz3 yz3Var, iv1 iv1Var, rx1 rx1Var, ic2 ic2Var, os0 os0Var, int i) {
        super(2);
        this.z = xi6Var;
        this.A = ub2Var;
        this.B = yz3Var;
        this.E = iv1Var;
        this.F = rx1Var;
        this.G = ic2Var;
        this.C = os0Var;
        this.D = i;
    }

    @Override // defpackage.ic2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.y;
        pn6 pn6Var = pn6.a;
        int i = this.D;
        Object obj3 = this.G;
        Object obj4 = this.F;
        Object obj5 = this.E;
        switch (b) {
            case 0:
                ((Number) obj2).intValue();
                int N = kb0.N(i | 1);
                xi6 xi6Var = this.z;
                yz3 yz3Var = this.B;
                ub2 ub2Var = this.A;
                bb4.b(xi6Var, yz3Var, ub2Var, (e7) obj3, (ub2) obj5, (ub2) obj4, this.C, (kd2) obj, N);
                return pn6Var;
            default:
                ((Number) obj2).intValue();
                int N2 = kb0.N(i | 1);
                xi6 xi6Var2 = this.z;
                ub2 ub2Var2 = this.A;
                yz3 yz3Var2 = this.B;
                te4.a(xi6Var2, ub2Var2, yz3Var2, (iv1) obj5, (rx1) obj4, (ic2) obj3, this.C, (kd2) obj, N2);
                return pn6Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ak(xi6 xi6Var, yz3 yz3Var, ub2 ub2Var, e7 e7Var, ub2 ub2Var2, ub2 ub2Var3, os0 os0Var, int i) {
        super(2);
        this.z = xi6Var;
        this.B = yz3Var;
        this.A = ub2Var;
        this.G = e7Var;
        this.E = ub2Var2;
        this.F = ub2Var3;
        this.C = os0Var;
        this.D = i;
    }
}
