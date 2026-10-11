package defpackage;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Comparator;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class cv0 extends qg4 implements Serializable {
    public final Comparator[] x;

    public cv0(rb0 rb0Var, rb0 rb0Var2) {
        this.x = new Comparator[]{rb0Var, rb0Var2};
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int i = 0;
        while (true) {
            Comparator[] comparatorArr = this.x;
            if (i >= comparatorArr.length) {
                return 0;
            }
            int compare = comparatorArr[i].compare(obj, obj2);
            if (compare != 0) {
                return compare;
            }
            i++;
        }
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof cv0) {
            return Arrays.equals(this.x, ((cv0) obj).x);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.x);
    }

    public final String toString() {
        return h11.k(new StringBuilder("Ordering.compound("), Arrays.toString(this.x), ")");
    }
}
