package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public final class t21 extends x93 implements ic2 {
    public final /* synthetic */ j32 A;
    public final /* synthetic */ ub2 B;
    public final /* synthetic */ os0 C;
    public final /* synthetic */ int D;
    public final /* synthetic */ xi6 y;
    public final /* synthetic */ yz3 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t21(xi6 xi6Var, yz3 yz3Var, j32 j32Var, ub2 ub2Var, os0 os0Var, int i) {
        super(2);
        this.y = xi6Var;
        this.z = yz3Var;
        this.A = j32Var;
        this.B = ub2Var;
        this.C = os0Var;
        this.D = i;
    }

    @Override // defpackage.ic2
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        t80.b(this.y, this.z, this.A, this.B, this.C, (kd2) obj, kb0.N(this.D | 1));
        return pn6.a;
    }
}
