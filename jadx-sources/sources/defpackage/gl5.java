package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class gl5 {
    public final int a;
    public final ic2 b;
    public final String c;
    public final il5 d;
    public final boolean e;
    public final boolean f;
    public final ub2 g;

    public gl5(int i, os0 os0Var, String str, il5 il5Var, ub2 ub2Var, int i2) {
        boolean z;
        os0Var = (i2 & 2) != 0 ? null : os0Var;
        if ((i2 & 32) != 0) {
            z = false;
        } else {
            z = true;
        }
        boolean z2 = (i2 & 64) != 0;
        ub2Var = (i2 & 128) != 0 ? new tg5((byte) 9) : ub2Var;
        str.getClass();
        il5Var.getClass();
        ub2Var.getClass();
        this.a = i;
        this.b = os0Var;
        this.c = str;
        this.d = il5Var;
        this.e = z;
        this.f = z2;
        this.g = ub2Var;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof gl5) {
                gl5 gl5Var = (gl5) obj;
                if (this.a != gl5Var.a || !a34.i(this.b, gl5Var.b) || !a34.i(this.c, gl5Var.c) || this.d != gl5Var.d || this.e != gl5Var.e || this.f != gl5Var.f || !this.g.equals(gl5Var.g)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = Integer.hashCode(this.a) * 31;
        ic2 ic2Var = this.b;
        if (ic2Var == null) {
            hashCode = 0;
        } else {
            hashCode = ic2Var.hashCode();
        }
        return this.g.hashCode() + zo5.g(zo5.g((this.d.hashCode() + zo5.i(this.c, (hashCode2 + hashCode) * 31, 961)) * 31, 31, this.e), 31, this.f);
    }

    public final String toString() {
        return "Setting(icon=" + this.a + ", trailingIcon=" + this.b + ", title=" + this.c + ", summary=null, settingType=" + this.d + ", isButton=" + this.e + ", enable=" + this.f + ", onClick=" + this.g + ")";
    }
}
