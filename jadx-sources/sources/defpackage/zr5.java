package defpackage;

import java.util.Iterator;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class zr5 implements su0, Iterable, j73 {
    public final yr5 x;
    public final int y;
    public final int z;

    public zr5(yr5 yr5Var, int i, int i2) {
        this.x = yr5Var;
        this.y = i;
        this.z = i2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zr5) {
            zr5 zr5Var = (zr5) obj;
            if (zr5Var.y == this.y && zr5Var.z == this.z && zr5Var.x == this.x) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return (this.x.hashCode() * 31) + this.y;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        yr5 yr5Var = this.x;
        if (yr5Var.E != this.z) {
            as5.e();
        }
        int i = this.y;
        yr5Var.j(i);
        return new pi2(yr5Var, i + 1, yr5Var.x[(i * 5) + 3] + i);
    }
}
