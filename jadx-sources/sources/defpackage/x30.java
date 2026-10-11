package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class x30 implements q35 {
    public final h43 x;

    public /* synthetic */ x30(h43 h43Var) {
        this.x = h43Var;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof x30) {
            if (!this.x.equals(((x30) obj).x)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.x.hashCode();
    }

    public final String toString() {
        return "BaseRequestDelegate(job=" + this.x + ")";
    }
}
