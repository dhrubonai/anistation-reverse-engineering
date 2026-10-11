package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class jo {
    public final Object a;
    public final int b;
    public final int c;
    public final String d;

    public jo(Object obj, int i, int i2, String str) {
        boolean z;
        this.a = obj;
        this.b = i;
        this.c = i2;
        this.d = str;
        if (i <= i2) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            fz2.a("Reversed range is not supported");
        }
    }

    public static jo a(jo joVar, go goVar, int i, int i2, int i3) {
        Object obj = goVar;
        if ((i3 & 1) != 0) {
            obj = joVar.a;
        }
        if ((i3 & 2) != 0) {
            i = joVar.b;
        }
        if ((i3 & 4) != 0) {
            i2 = joVar.c;
        }
        return new jo(obj, i, i2, joVar.d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jo)) {
            return false;
        }
        jo joVar = (jo) obj;
        if (a34.i(this.a, joVar.a) && this.b == joVar.b && this.c == joVar.c && a34.i(this.d, joVar.d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        Object obj = this.a;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        return this.d.hashCode() + qx1.c(this.c, qx1.c(this.b, hashCode * 31, 31), 31);
    }

    public final String toString() {
        return "Range(item=" + this.a + ", start=" + this.b + ", end=" + this.c + ", tag=" + this.d + ")";
    }

    public jo(int i, int i2, Object obj) {
        this(obj, i, i2, "");
    }
}
