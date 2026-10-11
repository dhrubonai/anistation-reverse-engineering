package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class ug5 implements jc2 {
    public final /* synthetic */ m65 A;
    public final /* synthetic */ sb2 B;
    public final /* synthetic */ by2 x;
    public final /* synthetic */ boolean y;
    public final /* synthetic */ boolean z;

    public ug5(by2 by2Var, boolean z, boolean z2, m65 m65Var, sb2 sb2Var) {
        this.x = by2Var;
        this.y = z;
        this.z = z2;
        this.A = m65Var;
        this.B = sb2Var;
    }

    @Override // defpackage.jc2
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        kd2 kd2Var = (kd2) obj2;
        ((Number) obj3).intValue();
        kd2Var.e0(-1525724089);
        Object Q = kd2Var.Q();
        if (Q == au0.a) {
            Q = new u34();
            kd2Var.n0(Q);
        }
        u34 u34Var = (u34) Q;
        yz3 w = yx2.a(u34Var, this.x).w(new sg5(this.y, u34Var, null, this.z, this.A, this.B));
        kd2Var.q(false);
        return w;
    }
}
