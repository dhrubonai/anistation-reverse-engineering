package defpackage;

import android.graphics.Insets;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class yz2 {
    public static final yz2 e = new yz2(0, 0, 0, 0);
    public final int a;
    public final int b;
    public final int c;
    public final int d;

    public yz2(int i, int i2, int i3, int i4) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
    }

    public static yz2 a(yz2 yz2Var, yz2 yz2Var2) {
        return b(Math.max(yz2Var.a, yz2Var2.a), Math.max(yz2Var.b, yz2Var2.b), Math.max(yz2Var.c, yz2Var2.c), Math.max(yz2Var.d, yz2Var2.d));
    }

    public static yz2 b(int i, int i2, int i3, int i4) {
        if (i == 0 && i2 == 0 && i3 == 0 && i4 == 0) {
            return e;
        }
        return new yz2(i, i2, i3, i4);
    }

    public static yz2 c(Insets insets) {
        return b(insets.left, insets.top, insets.right, insets.bottom);
    }

    public final Insets d() {
        return Insets.of(this.a, this.b, this.c, this.d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || yz2.class != obj.getClass()) {
            return false;
        }
        yz2 yz2Var = (yz2) obj;
        if (this.d == yz2Var.d && this.a == yz2Var.a && this.c == yz2Var.c && this.b == yz2Var.b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((((this.a * 31) + this.b) * 31) + this.c) * 31) + this.d;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Insets{left=");
        sb.append(this.a);
        sb.append(", top=");
        sb.append(this.b);
        sb.append(", right=");
        sb.append(this.c);
        sb.append(", bottom=");
        return qx1.o(sb, this.d, '}');
    }
}
