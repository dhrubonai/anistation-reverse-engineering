package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public final class b63 extends l63 {
    public final boolean x;
    public final String y;

    public b63(String str, boolean z) {
        str.getClass();
        this.x = z;
        this.y = str.toString();
    }

    @Override // defpackage.l63
    public final String b() {
        return this.y;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && b63.class == obj.getClass()) {
                b63 b63Var = (b63) obj;
                if (this.x == b63Var.x && a34.i(this.y, b63Var.y)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.y.hashCode() + (Boolean.hashCode(this.x) * 31);
    }

    @Override // defpackage.l63
    public final String toString() {
        boolean z = this.x;
        String str = this.y;
        if (z) {
            StringBuilder sb = new StringBuilder();
            jz5.a(sb, str);
            return sb.toString();
        }
        return str;
    }
}
