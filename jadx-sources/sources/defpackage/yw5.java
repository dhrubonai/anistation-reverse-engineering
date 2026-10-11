package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class yw5 implements vz0, x11 {
    public final qj0 x;
    public final l11 y;

    public yw5(qj0 qj0Var, l11 l11Var) {
        this.x = qj0Var;
        this.y = l11Var;
    }

    @Override // defpackage.x11
    public final x11 getCallerFrame() {
        return this.x;
    }

    @Override // defpackage.vz0
    public final l11 getContext() {
        return this.y;
    }

    @Override // defpackage.vz0
    public final void resumeWith(Object obj) {
        this.x.resumeWith(obj);
    }
}
