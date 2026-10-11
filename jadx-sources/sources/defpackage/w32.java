package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class w32 implements t47 {
    public final int a;

    public w32(int i) {
        this.a = i;
    }

    @Override // defpackage.t47
    public final int a(ud1 ud1Var) {
        return this.a;
    }

    @Override // defpackage.t47
    public final int b(ud1 ud1Var, ia3 ia3Var) {
        return 0;
    }

    @Override // defpackage.t47
    public final int c(ud1 ud1Var) {
        return 0;
    }

    @Override // defpackage.t47
    public final int d(ud1 ud1Var, ia3 ia3Var) {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof w32) && this.a == ((w32) obj).a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a * 961;
    }

    public final String toString() {
        return qx1.i(this.a, "Insets(left=0, top=", ", right=0, bottom=0)");
    }
}
