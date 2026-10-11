package defpackage;

import android.net.Uri;
import java.util.Objects;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class jf6 {
    public static final String A;
    public static final String B;
    public static final String C;
    public static final String D;
    public static final String E;
    public static final String F;
    public static final Object q = new Object();
    public static final ar3 r;
    public static final String s;
    public static final String t;
    public static final String u;
    public static final String v;
    public static final String w;
    public static final String x;
    public static final String y;
    public static final String z;
    public Object b;
    public Object d;
    public long e;
    public long f;
    public long g;
    public boolean h;
    public boolean i;
    public uq3 j;
    public boolean k;
    public long l;
    public long m;
    public int n;
    public int o;
    public long p;
    public Object a = q;
    public ar3 c = r;

    static {
        nq3 nq3Var = new nq3();
        nq3Var.b = "androidx.media3.common.Timeline";
        nq3Var.e = Uri.EMPTY;
        r = nq3Var.a();
        s = Integer.toString(1, 36);
        t = Integer.toString(2, 36);
        u = Integer.toString(3, 36);
        v = Integer.toString(4, 36);
        w = Integer.toString(5, 36);
        x = Integer.toString(6, 36);
        y = Integer.toString(7, 36);
        z = Integer.toString(8, 36);
        A = Integer.toString(9, 36);
        B = Integer.toString(10, 36);
        C = Integer.toString(11, 36);
        D = Integer.toString(12, 36);
        E = Integer.toString(13, 36);
        F = Integer.toString(14, 36);
    }

    public final boolean a() {
        if (this.j != null) {
            return true;
        }
        return false;
    }

    public final void b(Object obj, ar3 ar3Var, Object obj2, long j, long j2, long j3, boolean z2, boolean z3, uq3 uq3Var, long j4, long j5, int i, int i2, long j6) {
        ar3 ar3Var2;
        this.a = obj;
        if (ar3Var != null) {
            ar3Var2 = ar3Var;
        } else {
            ar3Var2 = r;
        }
        this.c = ar3Var2;
        if (ar3Var != null) {
            vq3 vq3Var = ar3Var.b;
        }
        this.b = null;
        this.d = obj2;
        this.e = j;
        this.f = j2;
        this.g = j3;
        this.h = z2;
        this.i = z3;
        this.j = uq3Var;
        this.l = j4;
        this.m = j5;
        this.n = i;
        this.o = i2;
        this.p = j6;
        this.k = false;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && jf6.class.equals(obj.getClass())) {
                jf6 jf6Var = (jf6) obj;
                if (Objects.equals(this.a, jf6Var.a) && Objects.equals(this.c, jf6Var.c) && Objects.equals(this.d, jf6Var.d) && Objects.equals(this.j, jf6Var.j) && this.e == jf6Var.e && this.f == jf6Var.f && this.g == jf6Var.g && this.h == jf6Var.h && this.i == jf6Var.i && this.k == jf6Var.k && this.l == jf6Var.l && this.m == jf6Var.m && this.n == jf6Var.n && this.o == jf6Var.o && this.p == jf6Var.p) {
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
        int hashCode2 = (this.c.hashCode() + ((this.a.hashCode() + 217) * 31)) * 31;
        Object obj = this.d;
        int i = 0;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        int i2 = (hashCode2 + hashCode) * 31;
        uq3 uq3Var = this.j;
        if (uq3Var != null) {
            i = uq3Var.hashCode();
        }
        int i3 = (i2 + i) * 31;
        long j = this.e;
        int i4 = (i3 + ((int) (j ^ (j >>> 32)))) * 31;
        long j2 = this.f;
        int i5 = (i4 + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        long j3 = this.g;
        int i6 = (((((((i5 + ((int) (j3 ^ (j3 >>> 32)))) * 31) + (this.h ? 1 : 0)) * 31) + (this.i ? 1 : 0)) * 31) + (this.k ? 1 : 0)) * 31;
        long j4 = this.l;
        int i7 = (i6 + ((int) (j4 ^ (j4 >>> 32)))) * 31;
        long j5 = this.m;
        int i8 = (((((i7 + ((int) (j5 ^ (j5 >>> 32)))) * 31) + this.n) * 31) + this.o) * 31;
        long j6 = this.p;
        return i8 + ((int) (j6 ^ (j6 >>> 32)));
    }
}
