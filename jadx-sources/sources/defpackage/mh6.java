package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class mh6 {
    public final long a;
    public final long b;
    public final boolean c;

    public mh6(long j, long j2, boolean z) {
        this.a = j;
        this.b = j2;
        this.c = z;
    }

    public final mh6 a(mh6 mh6Var) {
        boolean z;
        long f = xc4.f(this.a, mh6Var.a);
        long max = Math.max(this.b, mh6Var.b);
        if (!this.c && !mh6Var.c) {
            z = false;
        } else {
            z = true;
        }
        return new mh6(f, max, z);
    }
}
