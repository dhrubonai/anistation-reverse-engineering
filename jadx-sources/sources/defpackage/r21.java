package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public final class r21 extends x93 implements ic2 {
    public final /* synthetic */ j32 A;
    public final /* synthetic */ String B;
    public final /* synthetic */ os0 C;
    public final /* synthetic */ Boolean y;
    public final /* synthetic */ yz3 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r21(Boolean bool, yz3 yz3Var, j32 j32Var, String str, os0 os0Var, int i) {
        super(2);
        this.y = bool;
        this.z = yz3Var;
        this.A = j32Var;
        this.B = str;
        this.C = os0Var;
    }

    @Override // defpackage.ic2
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int N = kb0.N(24577);
        t80.c(this.y, this.z, this.A, this.B, this.C, (kd2) obj, N);
        return pn6.a;
    }
}
