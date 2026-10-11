package defpackage;

import java.util.Objects;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class hf6 {
    public static final String h;
    public static final String i;
    public static final String j;
    public static final String k;
    public static final String l;
    public static final String m;
    public static final String n;
    public Object a;
    public Object b;
    public int c;
    public long d;
    public long e;
    public boolean f;
    public y5 g = y5.c;

    static {
        String str = eq6.a;
        h = Integer.toString(0, 36);
        i = Integer.toString(1, 36);
        j = Integer.toString(2, 36);
        k = Integer.toString(3, 36);
        l = Integer.toString(4, 36);
        m = Integer.toString(5, 36);
        n = Integer.toString(6, 36);
    }

    public final long a(int i2, int i3) {
        w5 a = this.g.a(i2);
        if (a.a != -1) {
            return a.e[i3];
        }
        return -9223372036854775807L;
    }

    public final int b(long j2) {
        w5 a;
        int i2;
        y5 y5Var = this.g;
        long j3 = this.d;
        int i3 = y5Var.a;
        if (j2 != Long.MIN_VALUE && (j3 == -9223372036854775807L || j2 < j3)) {
            int i4 = 0;
            while (i4 < i3) {
                y5Var.a(i4).getClass();
                y5Var.a(i4).getClass();
                if (0 > j2 && ((i2 = (a = y5Var.a(i4)).a) == -1 || a.a(-1) < i2)) {
                    break;
                }
                i4++;
            }
            if (i4 < i3) {
                if (j3 != -9223372036854775807L) {
                    y5Var.a(i4).getClass();
                    if (0 <= j3) {
                    }
                }
                return i4;
            }
        }
        return -1;
    }

    public final int c(long j2) {
        y5 y5Var = this.g;
        int i2 = y5Var.a;
        int i3 = i2 - 1;
        if (i3 == i2 - 1) {
            y5Var.a(i3).getClass();
        }
        while (i3 >= 0 && j2 != Long.MIN_VALUE) {
            y5Var.a(i3).getClass();
            if (j2 >= 0) {
                break;
            }
            i3--;
        }
        if (i3 >= 0) {
            w5 a = y5Var.a(i3);
            int i4 = a.a;
            if (i4 != -1) {
                for (int i5 = 0; i5 < i4; i5++) {
                    int i6 = a.d[i5];
                    if (i6 != 0 && i6 != 1) {
                    }
                }
            }
            return i3;
        }
        return -1;
    }

    public final long d(int i2) {
        this.g.a(i2).getClass();
        return 0L;
    }

    public final int e(int i2) {
        return this.g.a(i2).a(-1);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && hf6.class.equals(obj.getClass())) {
                hf6 hf6Var = (hf6) obj;
                if (Objects.equals(this.a, hf6Var.a) && Objects.equals(this.b, hf6Var.b) && this.c == hf6Var.c && this.d == hf6Var.d && this.e == hf6Var.e && this.f == hf6Var.f && Objects.equals(this.g, hf6Var.g)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final boolean f(int i2) {
        y5 y5Var = this.g;
        int i3 = y5Var.a;
        if (i2 == i3 - 1 && i2 == i3 - 1) {
            y5Var.a(i2).getClass();
            return false;
        }
        return false;
    }

    public final boolean g(int i2) {
        this.g.a(i2).getClass();
        return false;
    }

    public final void h(Object obj, Object obj2, int i2, long j2, long j3, y5 y5Var, boolean z) {
        this.a = obj;
        this.b = obj2;
        this.c = i2;
        this.d = j2;
        this.e = j3;
        this.g = y5Var;
        this.f = z;
    }

    public final int hashCode() {
        int hashCode;
        Object obj = this.a;
        int i2 = 0;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        int i3 = (217 + hashCode) * 31;
        Object obj2 = this.b;
        if (obj2 != null) {
            i2 = obj2.hashCode();
        }
        int i4 = (((i3 + i2) * 31) + this.c) * 31;
        long j2 = this.d;
        int i5 = (i4 + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        long j3 = this.e;
        return this.g.hashCode() + ((((i5 + ((int) (j3 ^ (j3 >>> 32)))) * 31) + (this.f ? 1 : 0)) * 31);
    }
}
