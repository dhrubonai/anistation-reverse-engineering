package r6;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Comparator;

/* loaded from: classes.dex */
public final class f0 extends m1 implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    public final Comparator[] f9457a;

    public f0(u uVar, u uVar2) {
        this.f9457a = new Comparator[]{uVar, uVar2};
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int i10 = 0;
        while (true) {
            Comparator[] comparatorArr = this.f9457a;
            if (i10 >= comparatorArr.length) {
                return 0;
            }
            int compare = comparatorArr[i10].compare(obj, obj2);
            if (compare != 0) {
                return compare;
            }
            i10++;
        }
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof f0) {
            return Arrays.equals(this.f9457a, ((f0) obj).f9457a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f9457a);
    }

    public final String toString() {
        return a3.g.t(new StringBuilder("Ordering.compound("), Arrays.toString(this.f9457a), ")");
    }
}
