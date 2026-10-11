package defpackage;

import java.util.List;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class et3 {
    public final nw2 a;
    public final int b;
    public final long c;

    public et3(List list, int i, long j) {
        this.a = nw2.o(list);
        this.b = i;
        this.c = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof et3)) {
            return false;
        }
        et3 et3Var = (et3) obj;
        if (this.a.equals(et3Var.a) && this.b == et3Var.b && this.c == et3Var.c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return zz.K(this.c) + (((this.a.hashCode() * 31) + this.b) * 31);
    }
}
