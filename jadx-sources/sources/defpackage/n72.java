package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class n72 {
    public final r72 a;
    public final oa b;
    public final q44 c;
    public final q44 d;
    public boolean e;

    public n72(r72 r72Var, oa oaVar) {
        this.a = r72Var;
        this.b = oaVar;
        q44 q44Var = db5.a;
        this.c = new q44();
        this.d = new q44();
    }

    public final void a() {
        if (!this.e) {
            ia iaVar = new ia(0, this, n72.class, "invalidateNodes", "invalidateNodes()V", 0, (byte) 14);
            f44 f44Var = this.b.N0;
            if (!f44Var.e(iaVar)) {
                f44Var.a(iaVar);
            }
            this.e = true;
        }
    }
}
