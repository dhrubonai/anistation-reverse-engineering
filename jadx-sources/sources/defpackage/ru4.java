package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class ru4 implements w44, v11 {
    public final /* synthetic */ w44 x;
    public final l11 y;

    public ru4(w44 w44Var, l11 l11Var) {
        this.x = w44Var;
        this.y = l11Var;
    }

    @Override // defpackage.v11
    public final l11 getCoroutineContext() {
        return this.y;
    }

    @Override // defpackage.px5
    public final Object getValue() {
        return this.x.getValue();
    }

    @Override // defpackage.w44
    public final void setValue(Object obj) {
        this.x.setValue(obj);
    }
}
