package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class ai1 implements c25 {
    public final ub2 x;
    public bi1 y;

    public ai1(ub2 ub2Var) {
        this.x = ub2Var;
    }

    @Override // defpackage.c25
    public final void b() {
        bi1 bi1Var = this.y;
        if (bi1Var != null) {
            bi1Var.dispose();
        }
        this.y = null;
    }

    @Override // defpackage.c25
    public final void c() {
        this.y = (bi1) this.x.invoke(db.h);
    }

    @Override // defpackage.c25
    public final void a() {
    }
}
