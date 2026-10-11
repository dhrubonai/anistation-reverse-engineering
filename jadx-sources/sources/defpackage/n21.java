package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class n21 extends o80 {
    public final d7 i;

    public n21(w50 w50Var) {
        this.i = w50Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof n21) && a34.i(this.i, ((n21) obj).i)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.i.hashCode();
    }

    @Override // defpackage.o80
    public final int i(int i, int i2, ia3 ia3Var) {
        return this.i.a(i2, i, ia3Var);
    }

    public final String toString() {
        return "HorizontalCrossAxisAlignment(horizontal=" + this.i + ")";
    }
}
