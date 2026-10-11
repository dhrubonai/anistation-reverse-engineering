package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class py2 implements px5 {
    public l76 A;
    public boolean B;
    public boolean C;
    public long D;
    public final /* synthetic */ ry2 E;
    public Float x;
    public Float y;
    public final ti4 z;

    public py2(ry2 ry2Var, Float f, Float f2, oy2 oy2Var) {
        this.E = ry2Var;
        this.x = f;
        this.y = f2;
        this.z = xt5.g(f);
        this.A = new l76(oy2Var, db.l, this.x, this.y, null);
    }

    @Override // defpackage.px5
    public final Object getValue() {
        return this.z.getValue();
    }
}
