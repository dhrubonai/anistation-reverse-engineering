package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class h94 {
    public final int a;
    public final long b;
    public final long c;
    public final b94 d;
    public final lv5 e;
    public final Object f;

    public h94(int i, long j, long j2, b94 b94Var, lv5 lv5Var, Object obj) {
        this.a = i;
        this.b = j;
        this.c = j2;
        this.d = b94Var;
        this.e = lv5Var;
        this.f = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h94)) {
            return false;
        }
        h94 h94Var = (h94) obj;
        if (this.a == h94Var.a && this.b == h94Var.b && this.c == h94Var.c && a34.i(this.d, h94Var.d) && a34.i(this.e, h94Var.e) && a34.i(this.f, h94Var.f)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = (this.d.a.hashCode() + qx1.d(qx1.d(this.a * 31, this.b, 31), this.c, 31)) * 31;
        int i = 0;
        lv5 lv5Var = this.e;
        if (lv5Var == null) {
            hashCode = 0;
        } else {
            hashCode = lv5Var.x.hashCode();
        }
        int i2 = (hashCode2 + hashCode) * 31;
        Object obj = this.f;
        if (obj != null) {
            i = obj.hashCode();
        }
        return i2 + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NetworkResponse(code=");
        sb.append(this.a);
        sb.append(", requestMillis=");
        sb.append(this.b);
        qx1.w(sb, ", responseMillis=", this.c, ", headers=");
        sb.append(this.d);
        sb.append(", body=");
        sb.append(this.e);
        sb.append(", delegate=");
        sb.append(this.f);
        sb.append(")");
        return sb.toString();
    }
}
