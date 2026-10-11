package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class za8 {
    public static final long d;
    public static final za8 e;
    public final int a;
    public final int b;
    public final int c;

    static {
        long j = 0;
        for (int i = 0; i < 7; i++) {
            j |= (i + 1) << ((int) ((" #(+,-0".charAt(i) - ' ') * 3));
        }
        d = j;
        e = new za8(0, -1, -1);
    }

    public za8(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
    }

    public static int e(String str, int i, int i2) {
        if (i != i2) {
            int i3 = 0;
            for (int i4 = i; i4 < i2; i4++) {
                char charAt = (char) (str.charAt(i4) - '0');
                if (charAt < '\n') {
                    i3 = (i3 * 10) + charAt;
                    if (i3 > 999999) {
                        throw er0.a("precision too large", str, i, i2);
                    }
                } else {
                    throw er0.b(i4, "invalid precision character", str);
                }
            }
            if (i3 == 0) {
                if (i2 == i + 1) {
                    return 0;
                }
                throw er0.a("invalid precision", str, i, i2);
            }
            return i3;
        }
        throw er0.b(i - 1, "missing precision", str);
    }

    public final boolean a() {
        if (this == e) {
            return true;
        }
        return false;
    }

    public final boolean b(int i, boolean z) {
        int i2;
        if (!a()) {
            int i3 = ~i;
            int i4 = this.a;
            if ((i3 & i4) == 0) {
                if ((z || this.c == -1) && (i4 & 9) != 9 && (i2 = i4 & 96) != 96) {
                    if (i2 != 0 && this.b == -1) {
                        return false;
                    }
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final boolean c() {
        if ((this.a & 128) != 0) {
            return true;
        }
        return false;
    }

    public final void d(StringBuilder sb) {
        if (!a()) {
            int i = 0;
            while (true) {
                int i2 = this.a & (-129);
                int i3 = 1 << i;
                if (i3 > i2) {
                    break;
                }
                if ((i2 & i3) != 0) {
                    sb.append(" #(+,-0".charAt(i));
                }
                i++;
            }
            int i4 = this.b;
            if (i4 != -1) {
                sb.append(i4);
            }
            int i5 = this.c;
            if (i5 != -1) {
                sb.append('.');
                sb.append(i5);
            }
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof za8) {
            za8 za8Var = (za8) obj;
            if (za8Var.a == this.a && za8Var.b == this.b && za8Var.c == this.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((this.a * 31) + this.b) * 31) + this.c;
    }
}
