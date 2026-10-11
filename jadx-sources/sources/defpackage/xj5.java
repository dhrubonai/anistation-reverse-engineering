package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public final class xj5 implements Runnable {
    public final rg3 x;
    public final dg3 y;
    public boolean z;

    public xj5(rg3 rg3Var, dg3 dg3Var) {
        dg3Var.getClass();
        this.x = rg3Var;
        this.y = dg3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (!this.z) {
            this.x.e(this.y);
            this.z = true;
        }
    }
}
