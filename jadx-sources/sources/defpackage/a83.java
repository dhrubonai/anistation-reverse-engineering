package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class a83 {
    public static final a83 c = new a83(null, null);
    public final c83 a;
    public final y73 b;

    public a83(c83 c83Var, al6 al6Var) {
        boolean z;
        String str;
        this.a = c83Var;
        this.b = al6Var;
        if (c83Var == null) {
            z = true;
        } else {
            z = false;
        }
        if (z == (al6Var == null)) {
            return;
        }
        if (c83Var == null) {
            str = "Star projection must have no type specified.";
        } else {
            str = "The projection variance " + c83Var + " requires type to be specified.";
        }
        ze0.e(str);
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a83)) {
            return false;
        }
        a83 a83Var = (a83) obj;
        if (this.a == a83Var.a && a34.i(this.b, a83Var.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int i = 0;
        c83 c83Var = this.a;
        if (c83Var == null) {
            hashCode = 0;
        } else {
            hashCode = c83Var.hashCode();
        }
        int i2 = hashCode * 31;
        y73 y73Var = this.b;
        if (y73Var != null) {
            i = y73Var.hashCode();
        }
        return i2 + i;
    }

    public final String toString() {
        int i;
        c83 c83Var = this.a;
        if (c83Var == null) {
            i = -1;
        } else {
            i = z73.a[c83Var.ordinal()];
        }
        if (i != -1) {
            y73 y73Var = this.b;
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        return "out " + y73Var;
                    }
                    ze0.l();
                    return null;
                }
                return "in " + y73Var;
            }
            return String.valueOf(y73Var);
        }
        return "*";
    }
}
