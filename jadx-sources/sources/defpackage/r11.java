package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class r11 extends t0 {
    public static final q18 y = new q18((byte) 11);
    public final String x;

    public r11(String str) {
        super(y);
        this.x = str;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof r11) || !this.x.equals(((r11) obj).x)) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final int hashCode() {
        return this.x.hashCode();
    }

    public final String toString() {
        return qx1.p(new StringBuilder("CoroutineName("), this.x, ')');
    }
}
