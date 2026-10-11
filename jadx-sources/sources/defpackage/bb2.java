package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class bb2 {
    public final ea2 a;
    public final long b;

    public bb2(ea2 ea2Var, long j) {
        boolean z;
        boolean z2;
        if (ea2Var.H != null) {
            z = true;
        } else {
            z = false;
        }
        io3.m("format colorInfo must be set", z);
        int i = ea2Var.w;
        if (i > 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        io3.k(i, "format width must be positive, but is: %s", z2);
        int i2 = ea2Var.x;
        io3.k(i2, "format height must be positive, but is: %s", i2 > 0);
        this.a = ea2Var;
        this.b = j;
    }
}
