package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final /* synthetic */ class kz6 implements ub2 {
    public final /* synthetic */ boolean x;
    public final /* synthetic */ float y;
    public final /* synthetic */ float z;

    public /* synthetic */ kz6(boolean z, float f, float f2) {
        this.x = z;
        this.y = f;
        this.z = f2;
    }

    @Override // defpackage.ub2
    public final Object invoke(Object obj) {
        lo1 lo1Var = (lo1) obj;
        lo1Var.getClass();
        if (this.x) {
            lo1Var.a(xx6.x, -this.y);
        }
        lo1Var.a(xx6.y, 0.0f);
        lo1Var.a(xx6.z, this.z);
        return pn6.a;
    }
}
