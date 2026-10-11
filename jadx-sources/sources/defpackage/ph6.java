package defpackage;

import java.util.Arrays;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class ph6 {
    public static final String f;
    public static final String g;
    public static final String h;
    public static final String i;
    public final int a;
    public final yg6 b;
    public final boolean c;
    public final int[] d;
    public final boolean[] e;

    static {
        String str = eq6.a;
        f = Integer.toString(0, 36);
        g = Integer.toString(1, 36);
        h = Integer.toString(3, 36);
        i = Integer.toString(4, 36);
    }

    public ph6(yg6 yg6Var, boolean z, int[] iArr, boolean[] zArr) {
        boolean z2;
        int i2 = yg6Var.a;
        this.a = i2;
        boolean z3 = false;
        if (i2 == iArr.length && i2 == zArr.length) {
            z2 = true;
        } else {
            z2 = false;
        }
        io3.n(z2);
        this.b = yg6Var;
        if (z && i2 > 1) {
            z3 = true;
        }
        this.c = z3;
        this.d = (int[]) iArr.clone();
        this.e = (boolean[]) zArr.clone();
    }

    public final ea2 a(int i2) {
        return this.b.d[i2];
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && ph6.class == obj.getClass()) {
                ph6 ph6Var = (ph6) obj;
                if (this.c == ph6Var.c && this.b.equals(ph6Var.b) && Arrays.equals(this.d, ph6Var.d) && Arrays.equals(this.e, ph6Var.e)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.e) + ((Arrays.hashCode(this.d) + (((this.b.hashCode() * 31) + (this.c ? 1 : 0)) * 31)) * 31);
    }
}
