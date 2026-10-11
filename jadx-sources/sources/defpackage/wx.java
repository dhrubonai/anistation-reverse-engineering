package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class wx {
    public final Integer a;
    public final l38 b;
    public final cu4 c;

    public wx(Integer num, l38 l38Var, cu4 cu4Var) {
        this.a = num;
        this.b = l38Var;
        this.c = cu4Var;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof wx) {
                wx wxVar = (wx) obj;
                if (this.a.equals(wxVar.a) && this.b.equals(wxVar.b) && this.c.equals(wxVar.c)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.c.hashCode() ^ ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003);
    }

    public final String toString() {
        return "Event{code=" + this.a + ", payload=" + this.b + ", priority=" + this.c + "}";
    }
}
