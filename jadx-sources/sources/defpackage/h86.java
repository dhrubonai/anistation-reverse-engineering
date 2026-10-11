package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class h86 {
    public final ko a;
    public ko b;
    public boolean c = false;
    public q24 d = null;

    public h86(ko koVar, ko koVar2) {
        this.a = koVar;
        this.b = koVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h86)) {
            return false;
        }
        h86 h86Var = (h86) obj;
        if (a34.i(this.a, h86Var.a) && a34.i(this.b, h86Var.b) && this.c == h86Var.c && a34.i(this.d, h86Var.d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int g = zo5.g((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c);
        q24 q24Var = this.d;
        if (q24Var == null) {
            hashCode = 0;
        } else {
            hashCode = q24Var.hashCode();
        }
        return g + hashCode;
    }

    public final String toString() {
        ko koVar = this.b;
        return "TextSubstitutionValue(original=" + ((Object) this.a) + ", substitution=" + ((Object) koVar) + ", isShowingSubstitution=" + this.c + ", layoutCache=" + this.d + ")";
    }
}
