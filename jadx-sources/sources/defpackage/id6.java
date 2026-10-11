package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class id6 {
    public final pv5 a;
    public final pv5 b;
    public final pv5 c;
    public final pv5 d;

    public id6(pv5 pv5Var, pv5 pv5Var2, pv5 pv5Var3, pv5 pv5Var4) {
        this.a = pv5Var;
        this.b = pv5Var2;
        this.c = pv5Var3;
        this.d = pv5Var4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof id6)) {
            return false;
        }
        id6 id6Var = (id6) obj;
        if (a34.i(this.a, id6Var.a) && a34.i(this.b, id6Var.b) && a34.i(this.c, id6Var.c) && a34.i(this.d, id6Var.d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3;
        int i4 = 0;
        pv5 pv5Var = this.a;
        if (pv5Var != null) {
            i = pv5Var.hashCode();
        } else {
            i = 0;
        }
        int i5 = i * 31;
        pv5 pv5Var2 = this.b;
        if (pv5Var2 != null) {
            i2 = pv5Var2.hashCode();
        } else {
            i2 = 0;
        }
        int i6 = (i5 + i2) * 31;
        pv5 pv5Var3 = this.c;
        if (pv5Var3 != null) {
            i3 = pv5Var3.hashCode();
        } else {
            i3 = 0;
        }
        int i7 = (i6 + i3) * 31;
        pv5 pv5Var4 = this.d;
        if (pv5Var4 != null) {
            i4 = pv5Var4.hashCode();
        }
        return i7 + i4;
    }
}
