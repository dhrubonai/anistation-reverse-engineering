package c1;

import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class g1 {

    /* renamed from: a, reason: collision with root package name */
    public final f1 f1706a;

    /* renamed from: b, reason: collision with root package name */
    public final r6.o0 f1707b;

    static {
        f1.b0.J(0);
        f1.b0.J(1);
    }

    public g1(f1 f1Var, int i10) {
        this(f1Var, r6.o0.o(Integer.valueOf(i10)));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || g1.class != obj.getClass()) {
            return false;
        }
        g1 g1Var = (g1) obj;
        if (this.f1706a.equals(g1Var.f1706a) && this.f1707b.equals(g1Var.f1707b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.f1707b.hashCode() * 31) + this.f1706a.hashCode();
    }

    public g1(f1 f1Var, List list) {
        if (!list.isEmpty() && (((Integer) Collections.min(list)).intValue() < 0 || ((Integer) Collections.max(list)).intValue() >= f1Var.f1690a)) {
            throw new IndexOutOfBoundsException();
        }
        this.f1706a = f1Var;
        this.f1707b = r6.o0.j(list);
    }
}
