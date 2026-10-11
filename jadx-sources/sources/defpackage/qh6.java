package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class qh6 {
    public static final qh6 b;
    public static final String c;
    public final nw2 a;

    static {
        z62 z62Var = nw2.y;
        b = new qh6(o15.B);
        String str = eq6.a;
        c = Integer.toString(0, 36);
    }

    public qh6(o15 o15Var) {
        this.a = nw2.o(o15Var);
    }

    public final boolean a(int i) {
        int i2 = 0;
        while (true) {
            nw2 nw2Var = this.a;
            if (i2 >= nw2Var.size()) {
                return false;
            }
            ph6 ph6Var = (ph6) nw2Var.get(i2);
            boolean[] zArr = ph6Var.e;
            int length = zArr.length;
            int i3 = 0;
            while (true) {
                if (i3 >= length) {
                    break;
                }
                if (zArr[i3]) {
                    if (ph6Var.b.c == i) {
                        return true;
                    }
                } else {
                    i3++;
                }
            }
            i2++;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && qh6.class == obj.getClass()) {
            return this.a.equals(((qh6) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
