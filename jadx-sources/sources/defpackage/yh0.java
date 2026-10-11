package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class yh0 {
    public final String a;
    public final y7 b;

    public yh0(String str, y7 y7Var) {
        this.a = str;
        this.b = y7Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof yh0) {
            yh0 yh0Var = (yh0) obj;
            if (this.a.equals(yh0Var.a) && this.b == yh0Var.b) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "CastDevice(name=" + this.a + ", onSelect=" + this.b + ")";
    }
}
