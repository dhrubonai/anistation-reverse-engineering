package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class fh1 implements AutoCloseable {
    public final eh1 x;
    public boolean y;
    public final /* synthetic */ hh1 z;

    public fh1(hh1 hh1Var, eh1 eh1Var) {
        this.z = hh1Var;
        this.x = eh1Var;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        if (!this.y) {
            this.y = true;
            hh1 hh1Var = this.z;
            synchronized (hh1Var.E) {
                eh1 eh1Var = this.x;
                int i = eh1Var.h - 1;
                eh1Var.h = i;
                if (i == 0 && eh1Var.f) {
                    hh1Var.d0(eh1Var);
                }
            }
        }
    }
}
