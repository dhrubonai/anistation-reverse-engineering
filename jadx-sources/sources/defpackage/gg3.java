package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class gg3 implements lg3, v11 {
    public final fg3 x;
    public final l11 y;

    public gg3(fg3 fg3Var, l11 l11Var) {
        l11Var.getClass();
        this.x = fg3Var;
        this.y = l11Var;
        if (((rg3) fg3Var).i == eg3.x) {
            h98.i(l11Var, null);
        }
    }

    @Override // defpackage.v11
    public final l11 getCoroutineContext() {
        return this.y;
    }

    @Override // defpackage.lg3
    public final void onStateChanged(og3 og3Var, dg3 dg3Var) {
        fg3 fg3Var = this.x;
        if (((rg3) fg3Var).i.compareTo(eg3.x) <= 0) {
            fg3Var.b(this);
            h98.i(this.y, null);
        }
    }
}
