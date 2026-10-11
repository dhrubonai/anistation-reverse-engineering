package defpackage;

import java.io.Serializable;
import java.util.Arrays;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class rb0 extends qg4 implements Serializable {
    public final qc2 x;
    public final qg4 y;

    public rb0(qc2 qc2Var, qg4 qg4Var) {
        this.x = qc2Var;
        this.y = qg4Var;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        qc2 qc2Var = this.x;
        return this.y.compare(qc2Var.apply(obj), qc2Var.apply(obj2));
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof rb0) {
                rb0 rb0Var = (rb0) obj;
                if (this.x.equals(rb0Var.x) && this.y.equals(rb0Var.y)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.x, this.y});
    }

    public final String toString() {
        return this.y + ".onResultOf(" + this.x + ")";
    }
}
