package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class mc6 {
    public final ko a;
    public final long b;
    public final nd6 c;

    public mc6(ko koVar, long j, nd6 nd6Var) {
        nd6 nd6Var2;
        this.a = koVar;
        this.b = fy5.b(koVar.y.length(), j);
        if (nd6Var != null) {
            nd6Var2 = new nd6(fy5.b(koVar.y.length(), nd6Var.a));
        } else {
            nd6Var2 = null;
        }
        this.c = nd6Var2;
    }

    public static mc6 a(mc6 mc6Var, ko koVar, long j, int i) {
        nd6 nd6Var;
        if ((i & 1) != 0) {
            koVar = mc6Var.a;
        }
        if ((i & 2) != 0) {
            j = mc6Var.b;
        }
        if ((i & 4) != 0) {
            nd6Var = mc6Var.c;
        } else {
            nd6Var = null;
        }
        mc6Var.getClass();
        return new mc6(koVar, j, nd6Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mc6)) {
            return false;
        }
        mc6 mc6Var = (mc6) obj;
        if (nd6.c(this.b, mc6Var.b) && a34.i(this.c, mc6Var.c) && a34.i(this.a, mc6Var.a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int hashCode = this.a.hashCode() * 31;
        int i2 = nd6.c;
        int d = qx1.d(hashCode, this.b, 31);
        nd6 nd6Var = this.c;
        if (nd6Var != null) {
            i = Long.hashCode(nd6Var.a);
        } else {
            i = 0;
        }
        return d + i;
    }

    public final String toString() {
        return "TextFieldValue(text='" + ((Object) this.a) + "', selection=" + nd6.i(this.b) + ", composition=" + this.c + ")";
    }

    public mc6(long j, int i, String str) {
        this(new ko((i & 1) != 0 ? "" : str), (i & 2) != 0 ? nd6.b : j, (nd6) null);
    }
}
