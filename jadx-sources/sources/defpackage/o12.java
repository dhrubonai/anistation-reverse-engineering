package defpackage;

import java.util.Map;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class o12 implements Map.Entry, j73 {
    public o12 A;
    public boolean B;
    public final ng3 x;
    public final qg3 y;
    public o12 z;

    public o12(ng3 ng3Var, qg3 qg3Var) {
        this.x = ng3Var;
        this.y = qg3Var;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof o12) {
            o12 o12Var = (o12) obj;
            if (this.x.equals(o12Var.x) && this.y == o12Var.y) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.x;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.y;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        return this.y.hashCode() + (this.x.hashCode() * 31);
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final String toString() {
        return "Entry(key=" + this.x + ", value=" + this.y + ")";
    }
}
