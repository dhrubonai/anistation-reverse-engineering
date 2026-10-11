package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class sq5 {
    public static final sq5 c = new sq5(-1, -1);
    public static final sq5 d = new sq5(0, 0);
    public final int a;
    public final int b;

    static {
        Integer.toString(0, 36);
        Integer.toString(1, 36);
    }

    public sq5(int i, int i2) {
        boolean z;
        if ((i != -1 && i < 0) || (i2 != -1 && i2 < 0)) {
            z = false;
        } else {
            z = true;
        }
        io3.n(z);
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof sq5) {
            sq5 sq5Var = (sq5) obj;
            if (this.a == sq5Var.a && this.b == sq5Var.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.a;
        int i2 = i << 16;
        return this.b ^ ((i >>> 16) | i2);
    }

    public final String toString() {
        return this.a + "x" + this.b;
    }
}
