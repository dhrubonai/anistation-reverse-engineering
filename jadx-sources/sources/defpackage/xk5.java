package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class xk5 implements or1 {
    public final int a;
    public final int b;

    public xk5(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    @Override // defpackage.or1
    public final void a(sr1 sr1Var) {
        boolean z;
        if (sr1Var.d != -1) {
            z = true;
        } else {
            z = false;
        }
        wp wpVar = (wp) sr1Var.f;
        if (z) {
            sr1Var.d = -1;
            sr1Var.e = -1;
        }
        int C = db.C(this.a, 0, wpVar.g());
        int C2 = db.C(this.b, 0, wpVar.g());
        if (C != C2) {
            if (C < C2) {
                sr1Var.o(C, C2);
            } else {
                sr1Var.o(C2, C);
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xk5)) {
            return false;
        }
        xk5 xk5Var = (xk5) obj;
        if (this.a == xk5Var.a && this.b == xk5Var.b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.a * 31) + this.b;
    }

    public final String toString() {
        return qx1.l("SetComposingRegionCommand(start=", this.a, ", end=", this.b, ")");
    }
}
