package defpackage;

import java.util.List;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
@jj5
/* loaded from: classes.dex */
public final class h02 {
    public static final g02 Companion = new Object();
    public static final rb3[] c = {null, bx7.B(jf3.y, new vj1(11))};
    public final int a;
    public final List b;

    public /* synthetic */ h02(List list, int i, int i2) {
        this.a = (i & 1) == 0 ? 1 : i2;
        if ((i & 2) == 0) {
            this.b = nt1.x;
        } else {
            this.b = list;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h02)) {
            return false;
        }
        h02 h02Var = (h02) obj;
        if (this.a == h02Var.a && a34.i(this.b, h02Var.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "StoreData(version=" + this.a + ", records=" + this.b + ")";
    }

    public h02(int i, List list) {
        this.a = i;
        this.b = list;
    }

    public /* synthetic */ h02() {
        this(1, nt1.x);
    }
}
