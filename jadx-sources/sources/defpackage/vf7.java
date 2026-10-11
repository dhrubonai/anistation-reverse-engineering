package defpackage;

import java.util.AbstractList;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class vf7 extends AbstractList {
    public final tf7 x;
    public final uf7 y;

    public vf7(tf7 tf7Var, uf7 uf7Var) {
        this.x = tf7Var;
        this.y = uf7Var;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        int d = ((nf7) this.x).d(i);
        ((lp7) this.y).getClass();
        ke7 b = ke7.b(d);
        if (b == null) {
            return ke7.UNKNOWN;
        }
        return b;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return ((nf7) this.x).z;
    }
}
