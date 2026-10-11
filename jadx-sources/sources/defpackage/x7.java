package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class x7<T> extends d04 {
    public final e9 x;
    public final boolean y;
    public final ys5 z;

    public x7(e9 e9Var, boolean z, ys5 ys5Var) {
        this.x = e9Var;
        this.y = z;
        this.z = ys5Var;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [xz3, r8, ho1] */
    @Override // defpackage.d04
    public final xz3 a() {
        ?? ho1Var = new ho1(z51.a, this.y, null, rg4.x);
        ho1Var.g0 = this.x;
        ho1Var.h0 = this.z;
        return ho1Var;
    }

    @Override // defpackage.d04
    public final void b(xz3 xz3Var) {
        boolean z;
        boolean z2;
        r8 r8Var = (r8) xz3Var;
        ys5 ys5Var = this.z;
        r8Var.h0 = ys5Var;
        e9 e9Var = r8Var.g0;
        e9 e9Var2 = this.x;
        if (!a34.i(e9Var, e9Var2)) {
            r8Var.g0 = e9Var2;
            r8Var.x1(ys5Var);
            z = true;
        } else {
            z = false;
        }
        rg4 rg4Var = r8Var.N;
        rg4 rg4Var2 = rg4.x;
        if (rg4Var != rg4Var2) {
            r8Var.N = rg4Var2;
            z2 = true;
        } else {
            z2 = z;
        }
        r8Var.u1(r8Var.O, this.y, null, rg4Var2, z2);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof x7) {
                x7 x7Var = (x7) obj;
                if (!a34.i(this.x, x7Var.x) || this.y != x7Var.y || !a34.i(this.z, x7Var.z)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i;
        int g = zo5.g((rg4.x.hashCode() + (this.x.hashCode() * 31)) * 31, 28629151, this.y);
        ys5 ys5Var = this.z;
        if (ys5Var != null) {
            i = ys5Var.hashCode();
        } else {
            i = 0;
        }
        return g + i;
    }
}
