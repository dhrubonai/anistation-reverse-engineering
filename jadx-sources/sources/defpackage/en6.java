package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class en6 extends n11 {
    public static final en6 y = new n11();

    @Override // defpackage.n11
    public final String toString() {
        return "Dispatchers.Unconfined";
    }

    @Override // defpackage.n11
    public final void u0(l11 l11Var, Runnable runnable) {
        o97 o97Var = (o97) l11Var.get(o97.y);
        if (o97Var != null) {
            o97Var.x = true;
        } else {
            ov3.g("Dispatchers.Unconfined.dispatch function can only be used by the yield function. If you wrap Unconfined dispatcher in your code, make sure you properly delegate isDispatchNeeded and dispatch calls.");
        }
    }

    @Override // defpackage.n11
    public final n11 x0(int i) {
        throw new UnsupportedOperationException("limitedParallelism is not supported for Dispatchers.Unconfined");
    }
}
