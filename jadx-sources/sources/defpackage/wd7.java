package defpackage;

import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class wd7 {
    public static final w66 b = new w66(5);
    public static final wd7 c;
    public final ud7 a;

    static {
        List list = Collections.EMPTY_LIST;
        c = new wd7(new ud7());
    }

    public wd7(ud7 ud7Var) {
        this.a = ud7Var;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof wd7) && ((wd7) obj).a.equals(this.a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return ~this.a.hashCode();
    }

    public final String toString() {
        return this.a.toString();
    }
}
