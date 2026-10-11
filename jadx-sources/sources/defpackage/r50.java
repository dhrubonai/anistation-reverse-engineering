package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class r50 {
    public final qx4 a;
    public final im0 b;
    public final kz5 c;
    public final ic2 d;
    public final v83 e;
    public final ArrayList f;

    public r50(qx4 qx4Var, im0 im0Var, kz5 kz5Var, ic2 ic2Var, v83 v83Var) {
        qx4Var.getClass();
        this.a = qx4Var;
        this.b = im0Var;
        this.c = kz5Var;
        this.d = ic2Var;
        this.e = v83Var;
        this.f = new ArrayList(nt1.x);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            obj.getClass();
            r50 r50Var = (r50) obj;
            if (!this.b.equals(r50Var.b) || !a34.i(this.c, r50Var.c) || !a34.i(this.a, r50Var.a)) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final int hashCode() {
        int i;
        kz5 kz5Var = this.c;
        if (kz5Var != null) {
            i = kz5Var.a.hashCode();
        } else {
            i = 0;
        }
        int hashCode = this.b.hashCode();
        return this.a.hashCode() + ((hashCode + (i * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append('[');
        sb.append(this.e);
        sb.append(": '");
        sb.append(f73.a(this.b));
        sb.append('\'');
        kz5 kz5Var = this.c;
        if (kz5Var != null) {
            sb.append(",qualifier:");
            sb.append(kz5Var);
        }
        kz5 kz5Var2 = zp2.C;
        qx4 qx4Var = this.a;
        if (!a34.i(qx4Var, kz5Var2)) {
            sb.append(",scope:");
            sb.append(qx4Var);
        }
        ArrayList arrayList = this.f;
        if (!arrayList.isEmpty()) {
            sb.append(",binds:");
            yo0.p0(arrayList, sb, ",", new ui((byte) 19), 60);
        }
        sb.append(']');
        return sb.toString();
    }
}
