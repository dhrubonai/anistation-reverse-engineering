package defpackage;

import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class dh6 {
    public static final String c;
    public static final String d;
    public final yg6 a;
    public final nw2 b;

    static {
        String str = eq6.a;
        c = Integer.toString(0, 36);
        d = Integer.toString(1, 36);
    }

    public dh6(yg6 yg6Var, List list) {
        if (!list.isEmpty() && (((Integer) Collections.min(list)).intValue() < 0 || ((Integer) Collections.max(list)).intValue() >= yg6Var.a)) {
            throw new IndexOutOfBoundsException();
        }
        this.a = yg6Var;
        this.b = nw2.o(list);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && dh6.class == obj.getClass()) {
            dh6 dh6Var = (dh6) obj;
            if (this.a.equals(dh6Var.a) && this.b.equals(dh6Var.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.b.hashCode() * 31) + this.a.hashCode();
    }

    public dh6(yg6 yg6Var, int i) {
        this(yg6Var, nw2.s(Integer.valueOf(i)));
    }
}
