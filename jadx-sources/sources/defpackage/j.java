package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final /* synthetic */ class j implements ic2 {
    public final /* synthetic */ Object A;
    public final /* synthetic */ ec2 B;
    public final /* synthetic */ byte x = 1;
    public final /* synthetic */ sb2 y;
    public final /* synthetic */ short z;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ j(sb2 sb2Var, eg1 eg1Var, os0 os0Var, int i) {
        this.y = sb2Var;
        this.A = eg1Var;
        this.B = os0Var;
        this.z = i;
    }

    @Override // defpackage.ic2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.x;
        pn6 pn6Var = pn6.a;
        short s = this.z;
        ec2 ec2Var = this.B;
        Object obj3 = this.A;
        sb2 sb2Var = this.y;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                u.e((xm6) obj3, (ub2) ec2Var, sb2Var, (kd2) obj, kb0.N(s | 1));
                return pn6Var;
            default:
                ((Integer) obj2).getClass();
                te4.h(sb2Var, (eg1) obj3, (os0) ec2Var, (kd2) obj, kb0.N(s | 1));
                return pn6Var;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ j(xm6 xm6Var, ub2 ub2Var, sb2 sb2Var, int i) {
        this.A = xm6Var;
        this.B = ub2Var;
        this.y = sb2Var;
        this.z = i;
    }
}
