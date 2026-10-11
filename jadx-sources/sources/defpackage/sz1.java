package defpackage;

import java.util.Objects;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class sz1 {
    public final long a;
    public final long b;
    public final int c;
    public final int d;
    public final int e;
    public final String f;
    public final String g;
    public final int h;
    public final hp0 i;
    public final int j;
    public final int k;
    public final int l;
    public final String m;
    public final String n;
    public final byte o;
    public final oz1 p;
    public final nw2 q;

    /* JADX WARN: Multi-variable type inference failed */
    public sz1(o15 o15Var, long j, long j2, int i, int i2, int i3, String str, String str2, int i4, hp0 hp0Var, int i5, int i6, int i7, String str3, String str4, int i8, oz1 oz1Var) {
        this.q = o15Var;
        this.a = j;
        this.b = j2;
        this.c = i;
        this.d = i2;
        this.e = i3;
        this.f = str;
        this.g = str2;
        this.h = i4;
        this.i = hp0Var;
        this.j = i5;
        this.k = i6;
        this.l = i7;
        this.m = str3;
        this.n = str4;
        this.o = i8;
        this.p = oz1Var;
        a(str2, i8, o15Var, 1);
        a(str4, i8, o15Var, 2);
    }

    public static void a(String str, int i, o15 o15Var, int i2) {
        String str2;
        if (str != null && i != 1) {
            char c = 0;
            z62 listIterator = o15Var.listIterator(0);
            while (listIterator.hasNext()) {
                rz1 rz1Var = (rz1) listIterator.next();
                if (i2 == 1) {
                    str2 = rz1Var.d;
                } else {
                    str2 = rz1Var.e;
                }
                if (str2 == null) {
                    if (c != 1) {
                        c = 2;
                    } else {
                        return;
                    }
                } else if (c != 2) {
                    c = 1;
                } else {
                    return;
                }
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof sz1) {
                sz1 sz1Var = (sz1) obj;
                if (Objects.equals(this.q, sz1Var.q) && this.a == sz1Var.a && this.b == sz1Var.b && this.c == sz1Var.c && this.d == sz1Var.d && this.e == sz1Var.e && Objects.equals(this.f, sz1Var.f) && Objects.equals(this.g, sz1Var.g) && this.h == sz1Var.h && Objects.equals(this.i, sz1Var.i) && this.j == sz1Var.j && this.k == sz1Var.k && this.l == sz1Var.l && Objects.equals(this.m, sz1Var.m) && Objects.equals(this.n, sz1Var.n) && this.o == sz1Var.o && this.p == sz1Var.p) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hashCode(this.p) + ((((Objects.hashCode(this.n) + ((Objects.hashCode(this.m) + ((((((((Objects.hashCode(this.i) + ((((Objects.hashCode(this.g) + ((Objects.hashCode(this.f) + (((((((((((Objects.hashCode(this.q) * 31) + ((int) this.a)) * 31) + ((int) this.b)) * 31) + this.c) * 31) + this.d) * 31) + this.e) * 31)) * 31)) * 31) + this.h) * 31)) * 31) + this.j) * 31) + this.k) * 31) + this.l) * 31)) * 31)) * 31) + this.o) * 31);
    }
}
