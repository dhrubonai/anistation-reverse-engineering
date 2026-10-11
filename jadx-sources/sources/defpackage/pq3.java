package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public class pq3 {
    public static final pq3 i = new pq3(new oq3());
    public static final String j = Integer.toString(0, 36);
    public static final String k = Integer.toString(1, 36);
    public static final String l = Integer.toString(2, 36);
    public static final String m = Integer.toString(3, 36);
    public static final String n = Integer.toString(4, 36);
    public static final String o = Integer.toString(5, 36);
    public static final String p = Integer.toString(6, 36);
    public static final String q = Integer.toString(7, 36);
    public final long a;
    public final long b;
    public final long c;
    public final long d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final boolean h;

    public pq3(oq3 oq3Var) {
        this.a = eq6.l0(oq3Var.a);
        this.c = eq6.l0(oq3Var.b);
        this.b = oq3Var.a;
        this.d = oq3Var.b;
        this.e = oq3Var.c;
        this.f = oq3Var.d;
        this.g = oq3Var.e;
        this.h = oq3Var.f;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [oq3, java.lang.Object] */
    public final oq3 a() {
        ?? obj = new Object();
        obj.a = this.b;
        obj.b = this.d;
        obj.c = this.e;
        obj.d = this.f;
        obj.e = this.g;
        obj.f = this.h;
        return obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pq3)) {
            return false;
        }
        pq3 pq3Var = (pq3) obj;
        if (this.b == pq3Var.b && this.d == pq3Var.d && this.e == pq3Var.e && this.f == pq3Var.f && this.g == pq3Var.g && this.h == pq3Var.h) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long j2 = this.b;
        int i2 = ((int) (j2 ^ (j2 >>> 32))) * 31;
        long j3 = this.d;
        return ((((((((i2 + ((int) ((j3 >>> 32) ^ j3))) * 31) + (this.e ? 1 : 0)) * 31) + (this.f ? 1 : 0)) * 31) + (this.g ? 1 : 0)) * 31) + (this.h ? 1 : 0);
    }
}
