package defpackage;

import java.util.List;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class t66 {
    public final String a;
    public final String b;
    public final String c;
    public final List d;
    public final List e;

    public t66(String str, String str2, String str3, List list, List list2) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = list;
        this.e = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof t66) {
            t66 t66Var = (t66) obj;
            if (!a34.i(this.a, t66Var.a) || !a34.i(this.b, t66Var.b) || !a34.i(this.c, t66Var.c) || !this.d.equals(t66Var.d)) {
                return false;
            }
            return this.e.equals(t66Var.e);
        }
        return false;
    }

    public final int hashCode() {
        return this.e.hashCode() + zo5.j(this.d, zo5.i(this.c, zo5.i(this.b, this.a.hashCode() * 31, 31), 31), 31);
    }

    public final String toString() {
        return vz5.t(vz5.v("\n            |ForeignKey {\n            |   referenceTable = '" + this.a + "',\n            |   onDelete = '" + this.b + "',\n            |   onUpdate = '" + this.c + "',\n            |   columnNames = {" + gy5.m(yo0.B0(this.d)) + "\n            |   referenceColumnNames = {" + gy5.l(yo0.B0(this.e)) + "\n            |}\n        "));
    }
}
