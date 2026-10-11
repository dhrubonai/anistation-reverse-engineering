package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class o83 {
    public final int a;
    public final Boolean b;
    public final int c;
    public final int d;
    public final Boolean e;
    public final fk3 f;

    public o83(int i, int i2, int i3) {
        i = (i3 & 1) != 0 ? -1 : i;
        i2 = (i3 & 8) != 0 ? -1 : i2;
        this.a = i;
        this.b = null;
        this.c = 0;
        this.d = i2;
        this.e = null;
        this.f = null;
    }

    public final int a() {
        int i = this.d;
        sv2 sv2Var = new sv2(i);
        if (i == -1) {
            sv2Var = null;
        }
        if (sv2Var != null) {
            return sv2Var.a;
        }
        return 1;
    }

    public final yv2 b(boolean z) {
        int i;
        boolean z2;
        int i2 = this.a;
        n83 n83Var = new n83(i2);
        p83 p83Var = null;
        if (i2 == -1) {
            n83Var = null;
        }
        if (n83Var != null) {
            i = n83Var.a;
        } else {
            i = 0;
        }
        int i3 = i;
        int i4 = 1;
        Boolean bool = this.b;
        if (bool != null) {
            z2 = bool.booleanValue();
        } else {
            z2 = true;
        }
        int i5 = this.c;
        p83 p83Var2 = new p83(i5);
        if (i5 != 0) {
            p83Var = p83Var2;
        }
        if (p83Var != null) {
            i4 = p83Var.a;
        }
        int i6 = i4;
        int a = a();
        fk3 fk3Var = this.f;
        if (fk3Var == null) {
            fk3Var = fk3.z;
        }
        return new yv2(z, i3, z2, i6, a, fk3Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o83)) {
            return false;
        }
        o83 o83Var = (o83) obj;
        if (this.a == o83Var.a && a34.i(this.b, o83Var.b) && this.c == o83Var.c && this.d == o83Var.d && a34.i(this.e, o83Var.e) && a34.i(this.f, o83Var.f)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int i2;
        int hashCode = Integer.hashCode(this.a) * 31;
        int i3 = 0;
        Boolean bool = this.b;
        if (bool != null) {
            i = bool.hashCode();
        } else {
            i = 0;
        }
        int c = qx1.c(this.d, qx1.c(this.c, (hashCode + i) * 31, 31), 961);
        Boolean bool2 = this.e;
        if (bool2 != null) {
            i2 = bool2.hashCode();
        } else {
            i2 = 0;
        }
        int i4 = (c + i2) * 31;
        fk3 fk3Var = this.f;
        if (fk3Var != null) {
            i3 = fk3Var.x.hashCode();
        }
        return i4 + i3;
    }

    public final String toString() {
        String a = n83.a(this.a);
        String a2 = p83.a(this.c);
        String a3 = sv2.a(this.d);
        StringBuilder sb = new StringBuilder("KeyboardOptions(capitalization=");
        sb.append(a);
        sb.append(", autoCorrectEnabled=");
        sb.append(this.b);
        sb.append(", keyboardType=");
        qx1.x(sb, a2, ", imeAction=", a3, ", platformImeOptions=nullshowKeyboardOnFocus=");
        sb.append(this.e);
        sb.append(", hintLocales=");
        sb.append(this.f);
        sb.append(")");
        return sb.toString();
    }
}
