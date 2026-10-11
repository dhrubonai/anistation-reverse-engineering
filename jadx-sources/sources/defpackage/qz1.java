package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class qz1 {
    public jw2 a;
    public long b;
    public long c;
    public int d;
    public int e;
    public int f;
    public String g;
    public String h;
    public int i;
    public hp0 j;
    public int k;
    public int l;
    public int m;
    public String n;
    public String o;
    public byte p;
    public oz1 q;

    public qz1() {
        b();
    }

    public final sz1 a() {
        return new sz1(this.a.g(), this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, this.q);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [ew2, jw2] */
    public final void b() {
        this.a = new ew2(4);
        this.b = -9223372036854775807L;
        this.c = -1L;
        this.d = -2147483647;
        this.e = -1;
        this.f = -2147483647;
        this.g = null;
        this.i = -2147483647;
        this.j = null;
        this.k = -1;
        this.l = -1;
        this.m = 0;
        this.n = null;
        this.p = (byte) 0;
        this.q = null;
    }

    public final void c(long j) {
        boolean z;
        if (j < 0 && j != -9223372036854775807L) {
            z = false;
        } else {
            z = true;
        }
        io3.n(z);
        this.b = j;
    }

    public final void d(long j) {
        boolean z;
        if (j <= 0 && j != -1) {
            z = false;
        } else {
            z = true;
        }
        io3.l(j, "Invalid file size = %s", z);
        this.c = j;
    }
}
