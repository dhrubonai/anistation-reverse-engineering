package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public class b73 extends n22 {
    @Override // defpackage.n22
    public final void p(qj4 qj4Var) {
        qj4Var.getClass();
        if (!qj4Var.toFile().mkdir()) {
            e22 T = T(qj4Var);
            if (T == null || !T.c) {
                p65.n(qj4Var, "failed to create directory: ");
            }
        }
    }

    public String toString() {
        return "JvmSystemFileSystem";
    }
}
