package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class z14 implements ey3 {
    public final long a;
    public final long b;
    public final long c;

    public z14(long j, long j2) {
        this.a = j;
        this.b = j2;
        this.c = -1L;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z14)) {
            return false;
        }
        z14 z14Var = (z14) obj;
        if (this.a == z14Var.a && this.b == z14Var.b && this.c == z14Var.c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return zz.K(this.c) + ((zz.K(this.b) + ((zz.K(this.a) + 527) * 31)) * 31);
    }

    public final String toString() {
        return "Mp4Timestamp: creation time=" + this.a + ", modification time=" + this.b + ", timescale=" + this.c;
    }

    public z14(long j, long j2, long j3) {
        this.a = j;
        this.b = j2;
        this.c = j3;
    }
}
