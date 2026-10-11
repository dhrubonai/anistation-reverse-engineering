package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class wq5 {
    public final wj a;
    public long b;

    public wq5(wj wjVar, long j) {
        this.a = wjVar;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof wq5) {
                wq5 wq5Var = (wq5) obj;
                if (this.a == wq5Var.a && k13.a(this.b, wq5Var.b)) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "AnimData(anim=" + this.a + ", startSize=" + k13.b(this.b) + ")";
    }
}
