package defpackage;

import java.util.Objects;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class rf1 {
    public static final rf1 e = new yq6(0).b();
    public static final String f;
    public static final String g;
    public static final String h;
    public static final String i;
    public final boolean a;
    public final int b = 0;
    public final int c;
    public final String d;

    static {
        String str = eq6.a;
        f = Integer.toString(0, 36);
        g = Integer.toString(1, 36);
        h = Integer.toString(2, 36);
        i = Integer.toString(3, 36);
    }

    public rf1(yq6 yq6Var) {
        this.a = yq6Var.a;
        this.c = yq6Var.b;
        this.d = (String) yq6Var.c;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof rf1) {
                rf1 rf1Var = (rf1) obj;
                if (this.a == rf1Var.a && this.b == rf1Var.b && this.c == rf1Var.c && Objects.equals(this.d, rf1Var.d)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        int i2 = (((((527 + (this.a ? 1 : 0)) * 31) + this.b) * 31) + this.c) * 31;
        String str = this.d;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return i2 + hashCode;
    }
}
