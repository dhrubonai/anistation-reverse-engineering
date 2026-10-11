package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class cn5 {
    public final o75 a;
    public final o75 b;
    public final o75 c;
    public final o75 d;
    public final o75 e;
    public final o75 f;
    public final o75 g;
    public final o75 h;

    public cn5(o75 o75Var, o75 o75Var2, o75 o75Var3, o75 o75Var4, o75 o75Var5) {
        o75 o75Var6 = rm5.e;
        o75 o75Var7 = rm5.g;
        o75 o75Var8 = rm5.h;
        this.a = o75Var;
        this.b = o75Var2;
        this.c = o75Var3;
        this.d = o75Var4;
        this.e = o75Var5;
        this.f = o75Var6;
        this.g = o75Var7;
        this.h = o75Var8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cn5)) {
            return false;
        }
        cn5 cn5Var = (cn5) obj;
        if (a34.i(this.a, cn5Var.a) && a34.i(this.b, cn5Var.b) && a34.i(this.c, cn5Var.c) && a34.i(this.d, cn5Var.d) && a34.i(this.e, cn5Var.e) && a34.i(this.f, cn5Var.f) && a34.i(this.g, cn5Var.g) && a34.i(this.h, cn5Var.h)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.h.hashCode() + ((this.g.hashCode() + ((this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "Shapes(extraSmall=" + this.a + ", small=" + this.b + ", medium=" + this.c + ", large=" + this.d + ", largeIncreased=" + this.f + ", extraLarge=" + this.e + ", extralargeIncreased=" + this.g + ", extraExtraLarge=" + this.h + ')';
    }
}
