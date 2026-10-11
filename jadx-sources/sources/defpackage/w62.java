package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class w62 implements w42 {
    public final /* synthetic */ ub2 A;
    public final /* synthetic */ w42 x;
    public final /* synthetic */ v65 y;
    public final /* synthetic */ boolean z;

    public w62(w42 w42Var, v65 v65Var, boolean z, ub2 ub2Var) {
        this.x = w42Var;
        this.y = v65Var;
        this.z = z;
        this.A = ub2Var;
    }

    @Override // defpackage.w42
    public final Object collect(x42 x42Var, vz0 vz0Var) {
        Object collect = this.x.collect(new v62(x42Var, this.y, this.z, this.A), vz0Var);
        if (collect == w11.x) {
            return collect;
        }
        return pn6.a;
    }
}
