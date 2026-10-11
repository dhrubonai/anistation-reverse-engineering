package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class th3 extends vh3 {
    public final String a;
    public final id6 b;

    public th3(String str, id6 id6Var) {
        this.a = str;
        this.b = id6Var;
    }

    @Override // defpackage.vh3
    public final id6 a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof th3)) {
            return false;
        }
        th3 th3Var = (th3) obj;
        if (a34.i(this.a, th3Var.a) && a34.i(this.b, th3Var.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int hashCode = this.a.hashCode() * 31;
        id6 id6Var = this.b;
        if (id6Var != null) {
            i = id6Var.hashCode();
        } else {
            i = 0;
        }
        return (hashCode + i) * 31;
    }

    public final String toString() {
        return qx1.m("LinkAnnotation.Clickable(tag=", this.a, ")");
    }
}
