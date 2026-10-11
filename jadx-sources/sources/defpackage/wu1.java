package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class wu1 extends x93 implements ic2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ xi6 y;
    public final /* synthetic */ sb2 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wu1(xi6 xi6Var, sb2 sb2Var, int i) {
        super(2);
        this.y = xi6Var;
        this.z = sb2Var;
        this.A = i;
    }

    @Override // defpackage.ic2
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int N = kb0.N(this.A | 1);
        dv1.a(this.y, this.z, (kd2) obj, N);
        return pn6.a;
    }
}
