package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class w04 implements ey3 {
    public final long a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;

    public w04(long j, long j2, long j3, long j4, long j5) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
        this.e = j5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && w04.class == obj.getClass()) {
            w04 w04Var = (w04) obj;
            if (this.a == w04Var.a && this.b == w04Var.b && this.c == w04Var.c && this.d == w04Var.d && this.e == w04Var.e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return zz.K(this.e) + ((zz.K(this.d) + ((zz.K(this.c) + ((zz.K(this.b) + ((zz.K(this.a) + 527) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "Motion photo metadata: photoStartPosition=" + this.a + ", photoSize=" + this.b + ", photoPresentationTimestampUs=" + this.c + ", videoStartPosition=" + this.d + ", videoSize=" + this.e;
    }
}
