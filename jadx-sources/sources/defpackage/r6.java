package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class r6 extends d04 {
    public final ic2 x;

    public r6(ic2 ic2Var) {
        this.x = ic2Var;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [xz3, s6, zc1, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v2, types: [xz3, q6, yc1] */
    @Override // defpackage.d04
    public final xz3 a() {
        ?? zc1Var = new zc1();
        zc1Var.N = this.x;
        l0 l0Var = new l0(zc1Var, (byte) 4);
        ?? xz3Var = new xz3();
        xz3Var.L = l0Var;
        zc1Var.a1(xz3Var);
        return zc1Var;
    }

    @Override // defpackage.d04
    public final void b(xz3 xz3Var) {
        ((s6) xz3Var).N = this.x;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof r6) {
                if (this.x != ((r6) obj).x) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.x.hashCode();
    }
}
