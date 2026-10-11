package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class cj1 {
    public final il1 a;
    public final int b;
    public final long c;
    public final long d;
    public final long e;
    public final int f;
    public final int g;
    public final pk1 h;

    public cj1(il1 il1Var, int i, long j, long j2, long j3, int i2, int i3, pk1 pk1Var) {
        boolean z;
        boolean z2;
        boolean z3;
        pk1Var.getClass();
        boolean z4 = false;
        if (i3 == 0) {
            z = true;
        } else {
            z = false;
        }
        if (i != 4) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z == z2) {
            z3 = true;
        } else {
            z3 = false;
        }
        io3.n(z3);
        if (i2 != 0) {
            if (i != 2 && i != 0) {
                z4 = true;
            }
            io3.n(z4);
        }
        this.a = il1Var;
        this.b = i;
        this.c = j;
        this.d = j2;
        this.e = j3;
        this.f = i2;
        this.g = i3;
        this.h = pk1Var;
    }

    /* JADX WARN: Type inference failed for: r11v0, types: [pk1, java.lang.Object] */
    public cj1(il1 il1Var, int i, long j, long j2, int i2) {
        this(il1Var, i, j, j2, -1L, i2, 0, new Object());
    }
}
