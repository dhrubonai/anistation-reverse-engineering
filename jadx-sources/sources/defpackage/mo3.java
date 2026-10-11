package defpackage;

import java.util.Objects;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class mo3 implements Comparable {
    public final long x;
    public final long y;
    public final long z;

    public mo3(long j, long j2, long j3) {
        this.x = j;
        this.y = j2;
        this.z = j3;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return Long.compare(this.x, ((mo3) obj).x);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mo3)) {
            return false;
        }
        mo3 mo3Var = (mo3) obj;
        if (this.x == mo3Var.x && this.y == mo3Var.y && this.z == mo3Var.z) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.x), Long.valueOf(this.y), Long.valueOf(this.z));
    }
}
