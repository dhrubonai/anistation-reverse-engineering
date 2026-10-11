package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final /* synthetic */ class tz0 implements ic2 {
    public final /* synthetic */ Object A;
    public final /* synthetic */ ec2 B;
    public final /* synthetic */ byte x = 1;
    public final /* synthetic */ yz3 y;
    public final /* synthetic */ byte z;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ tz0(yz3 yz3Var, qz0 qz0Var, ub2 ub2Var, int i, int i2) {
        this.y = yz3Var;
        this.A = qz0Var;
        this.B = ub2Var;
        this.z = i2;
    }

    @Override // defpackage.ic2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.x;
        pn6 pn6Var = pn6.a;
        ec2 ec2Var = this.B;
        Object obj3 = this.A;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                int N = kb0.N(1);
                uz0.b(this.y, (qz0) obj3, (ub2) ec2Var, (kd2) obj, N, this.z);
                return pn6Var;
            default:
                ((Integer) obj2).getClass();
                int N2 = kb0.N(this.z | 1);
                t80.d((xm6) obj3, (sb2) ec2Var, this.y, (kd2) obj, N2);
                return pn6Var;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ tz0(xm6 xm6Var, sb2 sb2Var, yz3 yz3Var, int i) {
        this.A = xm6Var;
        this.B = sb2Var;
        this.y = yz3Var;
        this.z = i;
    }
}
