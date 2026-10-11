package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class hy {
    public final long a;
    public final oy b;
    public final xx c;

    public hy(long j, oy oyVar, xx xxVar) {
        this.a = j;
        this.b = oyVar;
        this.c = xxVar;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof hy) {
                hy hyVar = (hy) obj;
                if (this.a == hyVar.a && this.b.equals(hyVar.b) && this.c.equals(hyVar.c)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        long j = this.a;
        return this.c.hashCode() ^ ((((((int) ((j >>> 32) ^ j)) ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003);
    }

    public final String toString() {
        return "PersistedEvent{id=" + this.a + ", transportContext=" + this.b + ", event=" + this.c + "}";
    }
}
