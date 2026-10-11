package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class ov1 {
    public final im0 a;
    public final ub2 b;
    public final ub2 c;
    public final os0 d;

    public ov1(im0 im0Var, ub2 ub2Var, ub2 ub2Var2, os0 os0Var) {
        this.a = im0Var;
        this.b = ub2Var;
        this.c = ub2Var2;
        this.d = os0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ov1) {
            ov1 ov1Var = (ov1) obj;
            if (this.a.equals(ov1Var.a) && a34.i(this.b, ov1Var.b) && this.c.equals(ov1Var.c) && this.d == ov1Var.d) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "EntryClassProvider(clazz=" + this.a + ", clazzContentKey=" + this.b + ", metadata=" + this.c + ", content=" + this.d + ")";
    }
}
