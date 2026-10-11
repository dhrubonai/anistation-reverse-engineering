package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class yv2 {
    public static final yv2 g = new yv2(false, 0, true, 1, 1, fk3.z);
    public final boolean a;
    public final int b;
    public final boolean c;
    public final int d;
    public final int e;
    public final fk3 f;

    public yv2(boolean z, int i, boolean z2, int i2, int i3, fk3 fk3Var) {
        this.a = z;
        this.b = i;
        this.c = z2;
        this.d = i2;
        this.e = i3;
        this.f = fk3Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yv2)) {
            return false;
        }
        yv2 yv2Var = (yv2) obj;
        if (this.a == yv2Var.a && this.b == yv2Var.b && this.c == yv2Var.c && this.d == yv2Var.d && this.e == yv2Var.e && a34.i(this.f, yv2Var.f)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f.x.hashCode() + qx1.c(this.e, qx1.c(this.d, zo5.g(qx1.c(this.b, Boolean.hashCode(this.a) * 31, 31), 31, this.c), 31), 961);
    }

    public final String toString() {
        return "ImeOptions(singleLine=" + this.a + ", capitalization=" + n83.a(this.b) + ", autoCorrect=" + this.c + ", keyboardType=" + p83.a(this.d) + ", imeAction=" + sv2.a(this.e) + ", platformImeOptions=null, hintLocales=" + this.f + ")";
    }
}
