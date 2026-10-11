package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public final class e91 implements nr2 {
    public final nk2 A;
    public final mv0 B;
    public final yp2 x;
    public final xq2 y;
    public final op6 z;

    public e91(yp2 yp2Var, ls0 ls0Var) {
        this.x = yp2Var;
        this.y = (xq2) ls0Var.z;
        this.z = (op6) ls0Var.y;
        this.A = (nk2) ls0Var.A;
        this.B = (mv0) ls0Var.D;
    }

    @Override // defpackage.wq2
    public final jk2 a() {
        return this.A;
    }

    @Override // defpackage.nr2
    public final yp2 d0() {
        return this.x;
    }

    @Override // defpackage.nr2
    public final mv0 getAttributes() {
        return this.B;
    }

    @Override // defpackage.nr2, defpackage.v11
    public final l11 getCoroutineContext() {
        return this.x.getCoroutineContext();
    }

    @Override // defpackage.nr2
    public final xq2 getMethod() {
        return this.y;
    }

    @Override // defpackage.nr2
    public final op6 getUrl() {
        return this.z;
    }
}
