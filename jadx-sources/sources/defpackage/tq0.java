package defpackage;

import java.io.Serializable;
import java.util.Comparator;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class tq0 extends qg4 implements Serializable {
    public final Comparator x;

    public tq0(Comparator comparator) {
        comparator.getClass();
        this.x = comparator;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return this.x.compare(obj, obj2);
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof tq0) {
            return this.x.equals(((tq0) obj).x);
        }
        return false;
    }

    public final int hashCode() {
        return this.x.hashCode();
    }

    public final String toString() {
        return this.x.toString();
    }
}
