package defpackage;

import java.util.Iterator;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class jv5 implements su0, Iterable, j73 {
    public final yr5 x;
    public final int y;
    public final y15 z;

    public jv5(yr5 yr5Var, int i, md2 md2Var, y15 y15Var) {
        this.x = yr5Var;
        this.y = i;
        this.z = y15Var;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof jv5) {
            jv5 jv5Var = (jv5) obj;
            if (jv5Var.y == this.y && jv5Var.x == this.x && jv5Var.z.equals(this.z)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return this.z.hashCode() + ((this.x.hashCode() + (this.y * 31)) * 31);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new hv5(this.x, this.y, null, this.z);
    }
}
