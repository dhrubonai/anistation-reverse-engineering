package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class ji1 implements w42 {
    public final w42 x;
    public final ub2 y;
    public final ic2 z;

    public ji1(w42 w42Var, ub2 ub2Var, ic2 ic2Var) {
        this.x = w42Var;
        this.y = ub2Var;
        this.z = ic2Var;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, w05] */
    @Override // defpackage.w42
    public final Object collect(x42 x42Var, vz0 vz0Var) {
        ?? obj = new Object();
        obj.x = tb4.a;
        Object collect = this.x.collect(new zk(this, obj, x42Var, (byte) 1), vz0Var);
        if (collect == w11.x) {
            return collect;
        }
        return pn6.a;
    }
}
