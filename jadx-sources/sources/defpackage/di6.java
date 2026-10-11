package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class di6 {
    public final ko a;
    public final h12 b;

    public di6(ko koVar, h12 h12Var) {
        this.a = koVar;
        this.b = h12Var;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof di6) {
                di6 di6Var = (di6) obj;
                if (!a34.i(this.a, di6Var.a) || !this.b.equals(di6Var.b)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "TransformedText(text=" + ((Object) this.a) + ", offsetMapping=" + this.b + ")";
    }
}
