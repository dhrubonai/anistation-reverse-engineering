package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class ki0 {
    public final ii0 a;
    public final int b;

    public ki0(ii0 ii0Var, int i) {
        ii0Var.getClass();
        this.a = ii0Var;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ki0)) {
            return false;
        }
        ki0 ki0Var = (ki0) obj;
        if (a34.i(this.a, ki0Var.a) && this.b == ki0Var.b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "IndexedCue(cue=" + this.a + ", index=" + this.b + ")";
    }
}
