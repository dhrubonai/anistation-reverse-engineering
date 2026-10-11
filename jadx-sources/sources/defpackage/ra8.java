package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class ra8 implements aa8 {
    public final aa8 a;
    public final Object b;

    public ra8(aa8 aa8Var, Object obj) {
        it5.h(aa8Var, "log site key");
        this.a = aa8Var;
        it5.h(obj, "log site qualifier");
        this.b = obj;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ra8)) {
            return false;
        }
        ra8 ra8Var = (ra8) obj;
        if (!this.a.equals(ra8Var.a) || !this.b.equals(ra8Var.b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.b.hashCode() ^ this.a.hashCode();
    }

    public final String toString() {
        String obj = this.a.toString();
        int length = obj.length();
        String obj2 = this.b.toString();
        StringBuilder sb = new StringBuilder(length + 47 + obj2.length() + 3);
        qx1.x(sb, "SpecializedLogSiteKey{ delegate='", obj, "', qualifier='", obj2);
        sb.append("' }");
        return sb.toString();
    }
}
