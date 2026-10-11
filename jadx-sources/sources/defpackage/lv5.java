package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class lv5 implements AutoCloseable {
    public final db0 x;

    public /* synthetic */ lv5(db0 db0Var) {
        this.x = db0Var;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.x.close();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof lv5) {
            if (!this.x.equals(((lv5) obj).x)) {
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
        return "SourceResponseBody(source=" + this.x + ")";
    }
}
