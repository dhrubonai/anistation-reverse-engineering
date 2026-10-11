package defpackage;

import java.util.Arrays;
import java.util.Collection;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public abstract class xw2 extends gw2 implements Collection {
    public static final /* synthetic */ int A = 0;
    public transient o15 y;
    public transient zw2 z;

    @Override // defpackage.gw2
    public final nw2 b() {
        o15 o15Var = this.y;
        if (o15Var == null) {
            nw2 b = super.b();
            this.y = (o15) b;
            return b;
        }
        return o15Var;
    }

    @Override // defpackage.gw2
    public final int c(Object[] objArr, int i) {
        ho6 it = k().iterator();
        while (it.hasNext()) {
            yb4 yb4Var = (yb4) it.next();
            Arrays.fill(objArr, i, yb4Var.a() + i, yb4Var.a);
            i += yb4Var.a();
        }
        return i;
    }

    @Override // java.util.Collection
    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof xw2) {
                xw2 xw2Var = (xw2) obj;
                u15 u15Var = (u15) this;
                if (u15Var.size() == xw2Var.size() && k().size() == xw2Var.k().size()) {
                    for (yb4 yb4Var : xw2Var.k()) {
                        if (u15Var.B.b(yb4Var.a) != yb4Var.a()) {
                            return false;
                        }
                    }
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    @Override // java.util.Collection
    public final int hashCode() {
        return bb4.G(k());
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* renamed from: i */
    public final ho6 iterator() {
        return new uw2(k().iterator());
    }

    public abstract zw2 j();

    public final zw2 k() {
        zw2 zw2Var = this.z;
        if (zw2Var == null) {
            if (isEmpty()) {
                zw2Var = v15.G;
            } else {
                zw2Var = new ww2(this, (byte) 0);
            }
            this.z = zw2Var;
        }
        return zw2Var;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return k().toString();
    }
}
