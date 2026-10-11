package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class zk5 implements or1 {
    public final int a;
    public final int b;

    public zk5(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    @Override // defpackage.or1
    public final void a(sr1 sr1Var) {
        int C = db.C(this.a, 0, ((wp) sr1Var.f).g());
        int C2 = db.C(this.b, 0, ((wp) sr1Var.f).g());
        if (C < C2) {
            sr1Var.p(C, C2);
        } else {
            sr1Var.p(C2, C);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zk5)) {
            return false;
        }
        zk5 zk5Var = (zk5) obj;
        if (this.a == zk5Var.a && this.b == zk5Var.b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.a * 31) + this.b;
    }

    public final String toString() {
        return qx1.l("SetSelectionCommand(start=", this.a, ", end=", this.b, ")");
    }
}
