package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public final class vk6 {
    public final e73 a;
    public final boolean b;
    public final y73 c;

    public vk6(e73 e73Var, boolean z, y73 y73Var) {
        this.a = e73Var;
        this.b = z;
        this.c = y73Var;
        if (!z && y73Var != null && y73Var.a()) {
            ov3.m("TypeInfo for nullable kotlinType ", y73Var, " must have isNullable set to true");
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof vk6) {
            vk6 vk6Var = (vk6) obj;
            y73 y73Var = vk6Var.c;
            if (this.b != vk6Var.b) {
                return false;
            }
            y73 y73Var2 = this.c;
            if (y73Var2 == null && y73Var == null) {
                return this.a.equals(vk6Var.a);
            }
            return a34.i(y73Var2, y73Var);
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        y73 y73Var = this.c;
        if (y73Var != null) {
            hashCode = y73Var.hashCode();
        } else {
            hashCode = ((im0) this.a).hashCode();
        }
        return Boolean.hashCode(this.b) + (hashCode * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TypeInfo(");
        Object obj = this.c;
        if (obj == null) {
            obj = this.a;
        }
        sb.append(obj);
        sb.append(')');
        return sb.toString();
    }
}
