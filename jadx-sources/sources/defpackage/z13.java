package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class z13 extends gu2 {
    public final String b;
    public final String c;
    public final String d;

    public z13(String str, String str2, String str3) {
        super("----");
        this.b = str;
        this.c = str2;
        this.d = str3;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && z13.class == obj.getClass()) {
                z13 z13Var = (z13) obj;
                if (this.c.equals(z13Var.c) && this.b.equals(z13Var.b) && this.d.equals(z13Var.d)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.d.hashCode() + zo5.i(this.c, zo5.i(this.b, 527, 31), 31);
    }

    @Override // defpackage.gu2
    public final String toString() {
        return this.a + ": domain=" + this.b + ", description=" + this.c;
    }
}
