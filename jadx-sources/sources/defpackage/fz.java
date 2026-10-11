package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public final class fz implements lg0 {
    public final ez[] x;

    public fz(ez[] ezVarArr) {
        this.x = ezVarArr;
    }

    @Override // defpackage.lg0
    public final void a(Throwable th) {
        b();
    }

    public final void b() {
        for (ez ezVar : this.x) {
            ei1 ei1Var = ezVar.C;
            if (ei1Var != null) {
                ei1Var.dispose();
            } else {
                a34.s0("handle");
                throw null;
            }
        }
    }

    public final String toString() {
        return "DisposeHandlersOnCancel[" + this.x + ']';
    }
}
