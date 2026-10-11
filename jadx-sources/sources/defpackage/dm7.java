package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class dm7 {
    public final String a;
    public final String b;
    public final long c;
    public final long d;
    public final long e;
    public final long f;
    public final long g;
    public final Long h;
    public final Long i;
    public final Long j;
    public final Boolean k;

    public dm7(String str, String str2, long j, long j2, long j3, long j4, long j5, Long l, Long l2, Long l3, Boolean bool) {
        boolean z;
        boolean z2;
        boolean z3;
        a34.u(str);
        a34.u(str2);
        if (j >= 0) {
            z = true;
        } else {
            z = false;
        }
        a34.n(z);
        if (j2 >= 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        a34.n(z2);
        if (j3 >= 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        a34.n(z3);
        a34.n(j5 >= 0);
        this.a = str;
        this.b = str2;
        this.c = j;
        this.d = j2;
        this.e = j3;
        this.f = j4;
        this.g = j5;
        this.h = l;
        this.i = l2;
        this.j = l3;
        this.k = bool;
    }

    public final dm7 a(long j) {
        return new dm7(this.a, this.b, this.c, this.d, this.e, j, this.g, this.h, this.i, this.j, this.k);
    }

    public final dm7 b(Long l, Long l2, Boolean bool) {
        return new dm7(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, l, l2, bool);
    }
}
