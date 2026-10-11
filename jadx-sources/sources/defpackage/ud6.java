package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class ud6 {
    public final String a;
    public String b;
    public boolean c = false;
    public gi4 d = null;

    public ud6(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ud6)) {
            return false;
        }
        ud6 ud6Var = (ud6) obj;
        if (a34.i(this.a, ud6Var.a) && a34.i(this.b, ud6Var.b) && this.c == ud6Var.c && a34.i(this.d, ud6Var.d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int g = zo5.g(zo5.i(this.b, this.a.hashCode() * 31, 31), 31, this.c);
        gi4 gi4Var = this.d;
        if (gi4Var == null) {
            hashCode = 0;
        } else {
            hashCode = gi4Var.hashCode();
        }
        return g + hashCode;
    }

    public final String toString() {
        return "TextSubstitution(layoutCache=" + this.d + ", isShowingSubstitution=" + this.c + ")";
    }
}
