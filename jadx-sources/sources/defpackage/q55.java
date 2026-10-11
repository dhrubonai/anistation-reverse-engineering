package defpackage;

import java.io.Serializable;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class q55 extends qg4 implements Serializable {
    public final qg4 x;

    public q55(qg4 qg4Var) {
        this.x = qg4Var;
    }

    @Override // defpackage.qg4
    public final qg4 a() {
        return this.x;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return this.x.compare(obj2, obj);
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof q55) {
            return this.x.equals(((q55) obj).x);
        }
        return false;
    }

    public final int hashCode() {
        return -this.x.hashCode();
    }

    public final String toString() {
        return this.x + ".reverse()";
    }
}
