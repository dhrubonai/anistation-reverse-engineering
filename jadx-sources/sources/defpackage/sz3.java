package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class sz3 {
    public final boolean a;
    public final boolean b;
    public final Boolean c;
    public final Boolean d;

    public sz3() {
        this.a = true;
        this.b = true;
        Boolean bool = Boolean.FALSE;
        this.c = bool;
        this.d = bool;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof sz3) {
                sz3 sz3Var = (sz3) obj;
                if (!a34.i(this.c, sz3Var.c) || !a34.i(this.d, sz3Var.d) || this.b != sz3Var.b || this.a != sz3Var.a) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i;
        int g = zo5.g(ef5.x.hashCode() * 31, 31, this.a);
        int i2 = 0;
        Boolean bool = this.c;
        if (bool != null) {
            i = bool.hashCode();
        } else {
            i = 0;
        }
        int i3 = (g + i) * 31;
        Boolean bool2 = this.d;
        if (bool2 != null) {
            i2 = bool2.hashCode();
        }
        return Boolean.hashCode(this.b) + ((i3 + i2) * 31);
    }

    public sz3(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
        this.d = null;
        this.c = null;
    }
}
