package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class er5 {
    public final boolean a;
    public final int b;
    public final long c;

    public er5(int i, long j, boolean z) {
        this.a = z;
        this.b = i;
        this.c = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof er5)) {
            return false;
        }
        er5 er5Var = (er5) obj;
        if (this.a == er5Var.a && this.b == er5Var.b && this.c == er5Var.c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.c) + qx1.c(this.b, Boolean.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SkipState(isForward=");
        sb.append(this.a);
        sb.append(", seconds=");
        sb.append(this.b);
        sb.append(", triggerTime=");
        return qx1.k(this.c, ")", sb);
    }
}
