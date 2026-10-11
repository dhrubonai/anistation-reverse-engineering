package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class ip5 {
    public nw2 A;
    public kf6 B;
    public qh6 C;
    public jr3 D;
    public jr3 E;
    public int F;
    public int G;
    public int H;
    public Long I;
    public hp5 J;
    public hp5 K;
    public hp5 L;
    public hp5 M;
    public hp5 N;
    public boolean O;
    public int P;
    public long Q;
    public go4 a;
    public boolean b;
    public int c;
    public int d;
    public int e;
    public yx1 f;
    public int g;
    public boolean h;
    public boolean i;
    public long j;
    public long k;
    public long l;
    public rn4 m;
    public hh6 n;
    public ru o;
    public int p;
    public float q;
    public float r;
    public hv6 s;
    public c31 t;
    public rf1 u;
    public int v;
    public boolean w;
    public sq5 x;
    public boolean y;
    public fy3 z;

    public final void a(int i, int i2) {
        boolean z;
        boolean z2;
        boolean z3 = false;
        if (i == -1) {
            z = true;
        } else {
            z = false;
        }
        if (i2 == -1) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z == z2) {
            z3 = true;
        }
        io3.n(z3);
        this.G = i;
        this.H = i2;
    }

    public final void b(int i) {
        boolean z;
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        io3.n(z);
        this.v = i;
    }

    public final void c(float f) {
        boolean z;
        float f2;
        if (f >= 0.0f && f <= 1.0f) {
            z = true;
        } else {
            z = false;
        }
        io3.n(z);
        if (f != 0.0f) {
            f2 = f;
        } else {
            f2 = this.q;
        }
        this.r = f2;
        this.q = f;
    }
}
