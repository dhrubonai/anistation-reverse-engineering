package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class ho4 {
    public final g42 a;

    public ho4(g42 g42Var) {
        this.a = g42Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ho4)) {
            return false;
        }
        return this.a.equals(((ho4) obj).a);
    }

    public final int hashCode() {
        return this.a.a.hashCode();
    }
}
