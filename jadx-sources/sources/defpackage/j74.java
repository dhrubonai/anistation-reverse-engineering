package defpackage;

import java.util.Map;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class j74 {
    public final Object a;
    public final Object b;
    public final Map c;
    public final os0 d;

    public j74(Object obj, Object obj2, Map map, os0 os0Var) {
        this.a = obj;
        this.b = obj2;
        this.c = map;
        this.d = os0Var;
    }

    public final void a(int i, kd2 kd2Var) {
        int i2;
        boolean z;
        int i3;
        kd2Var.f0(295512821);
        byte b = 2;
        if ((i & 6) == 0) {
            if (kd2Var.f(this)) {
                i3 = 4;
            } else {
                i3 = 2;
            }
            i2 = i3 | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2) {
            z = true;
        } else {
            z = false;
        }
        if (kd2Var.V(i2 & 1, z)) {
            this.d.invoke(this.a, kd2Var, 0);
        } else {
            kd2Var.Y();
        }
        zz4 u = kd2Var.u();
        if (u != null) {
            u.d = new cc3(this, i, b);
        }
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && j74.class == obj.getClass()) {
                j74 j74Var = (j74) obj;
                if (a34.i(this.a, j74Var.a) && a34.i(this.b, j74Var.b) && a34.i(this.c, j74Var.c) && this.d == j74Var.d) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (this.d.hashCode() * 31) + (this.c.hashCode() * 31) + (this.b.hashCode() * 31) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "NavEntry(key=" + this.a + ", contentKey=" + this.b + ", metadata=" + this.c + ", content=" + this.d + ")";
    }

    public j74(j74 j74Var, os0 os0Var) {
        this(j74Var.a, j74Var.b, j74Var.c, os0Var);
    }
}
