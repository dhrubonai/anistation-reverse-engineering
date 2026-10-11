package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class x9 implements kn0 {
    public final pz2 a;

    public x9(pz2 pz2Var) {
        this.a = pz2Var;
    }

    public final void a(in0 in0Var) {
        pz2 pz2Var = this.a;
        if (in0Var == null) {
            pz2Var.s().clearPrimaryClip();
        } else {
            pz2Var.s().setPrimaryClip(in0Var.a);
        }
    }
}
