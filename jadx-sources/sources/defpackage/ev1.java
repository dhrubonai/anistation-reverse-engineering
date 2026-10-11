package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class ev1 extends x93 implements ub2 {
    public final /* synthetic */ long A;
    public final /* synthetic */ long B;
    public final /* synthetic */ em4 C;
    public final /* synthetic */ long D;
    public final /* synthetic */ zu1 E;
    public final /* synthetic */ hv1 y;
    public final /* synthetic */ px5 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ev1(hv1 hv1Var, pi6 pi6Var, long j, long j2, long j3, em4 em4Var, long j4, zu1 zu1Var) {
        super(1);
        this.y = hv1Var;
        this.z = pi6Var;
        this.A = j2;
        this.B = j3;
        this.C = em4Var;
        this.D = j4;
        this.E = zu1Var;
    }

    @Override // defpackage.ub2
    public final Object invoke(Object obj) {
        long j;
        dm4 dm4Var = (dm4) obj;
        hv1 hv1Var = this.y;
        ln5 ln5Var = hv1Var.S;
        long j2 = 0;
        px5 px5Var = this.z;
        if (px5Var != null) {
            j = ((c13) px5Var.getValue()).a;
        } else {
            j = 0;
        }
        ln5Var.b();
        ln5Var.b();
        long d = c13.d(j, 0L);
        if (ln5Var.b()) {
            ln5Var.i = d;
        }
        e7 e7Var = hv1Var.W;
        if (e7Var != null) {
            j2 = e7Var.a(this.A, this.B, ia3.x);
        }
        long d2 = c13.d(j2, d);
        long j3 = this.D;
        em4 em4Var = this.C;
        dm4Var.e(em4Var);
        em4Var.V(c13.d(((((int) (d2 >> 32)) + ((int) (j3 >> 32))) << 32) | ((((int) (d2 & 4294967295L)) + ((int) (j3 & 4294967295L))) & 4294967295L), em4Var.B), 0.0f, this.E);
        return pn6.a;
    }
}
