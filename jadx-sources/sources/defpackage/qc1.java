package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class qc1 extends n11 {
    public static final /* synthetic */ long A = qs.a.objectFieldOffset(qc1.class.getDeclaredField("z"));
    public final n11 y;
    public volatile /* synthetic */ int z = 1;

    public qc1(n11 n11Var) {
        this.y = n11Var;
    }

    @Override // defpackage.n11
    public final String toString() {
        return "DeferredDispatchCoroutineDispatcher(delegate=" + this.y + ")";
    }

    @Override // defpackage.n11
    public final void u0(l11 l11Var, Runnable runnable) {
        y0().u0(l11Var, runnable);
    }

    @Override // defpackage.n11
    public final void v0(l11 l11Var, Runnable runnable) {
        y0().v0(l11Var, runnable);
    }

    @Override // defpackage.n11
    public final boolean w0(l11 l11Var) {
        return y0().w0(l11Var);
    }

    @Override // defpackage.n11
    public final n11 x0(int i) {
        return y0().x0(i);
    }

    public final n11 y0() {
        if (qs.a.getIntVolatile(this, A) == 1) {
            return rh1.b;
        }
        return this.y;
    }
}
