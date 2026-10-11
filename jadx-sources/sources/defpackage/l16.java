package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class l16 {
    public final String a;
    public final long b;

    public l16(long j, String str) {
        this.a = str;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof l16) {
                l16 l16Var = (l16) obj;
                if (this.a.equals(l16Var.a)) {
                    long j = l16Var.b;
                    int i = ep0.j;
                    if (!cm6.a(this.b, j)) {
                        return false;
                    }
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        int i = ep0.j;
        return Long.hashCode(this.b) + hashCode;
    }

    public final String toString() {
        return qx1.n("SubtitleColorOption(name=", this.a, ", color=", ep0.h(this.b), ")");
    }
}
