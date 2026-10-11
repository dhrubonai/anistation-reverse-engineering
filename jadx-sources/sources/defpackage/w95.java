package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class w95 implements lg3, AutoCloseable {
    public final String x;
    public final v95 y;
    public boolean z;

    public w95(String str, v95 v95Var) {
        this.x = str;
        this.y = v95Var;
    }

    public final void a(ea5 ea5Var, fg3 fg3Var) {
        ea5Var.getClass();
        fg3Var.getClass();
        if (!this.z) {
            this.z = true;
            fg3Var.a(this);
            ea5Var.c(this.x, (or0) this.y.a.B);
            return;
        }
        ze0.m("Already attached to lifecycleOwner");
    }

    @Override // defpackage.lg3
    public final void onStateChanged(og3 og3Var, dg3 dg3Var) {
        if (dg3Var == dg3.ON_DESTROY) {
            this.z = false;
            og3Var.getLifecycle().b(this);
        }
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
    }
}
