package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class cb6 {
    public static final y23 g = x97.G(new ao5((byte) 2), new ka6((byte) 2));
    public final pi4 a;
    public final pi4 b = new pi4(0.0f);
    public final qi4 c = new qi4(0);
    public n05 d = n05.e;
    public long e = nd6.b;
    public final ti4 f;

    public cb6(rg4 rg4Var, float f) {
        this.a = new pi4(f);
        this.f = new ti4(rg4Var, p7.S);
    }

    public final void a(rg4 rg4Var, n05 n05Var, int i, int i2) {
        boolean z;
        float f;
        float f2;
        float f3 = i2 - i;
        this.b.i(f3);
        float f4 = n05Var.a;
        float f5 = n05Var.b;
        n05 n05Var2 = this.d;
        float f6 = n05Var2.a;
        pi4 pi4Var = this.a;
        if (f4 != f6 || f5 != n05Var2.b) {
            if (rg4Var == rg4.x) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                f4 = f5;
            }
            if (z) {
                f = n05Var.d;
            } else {
                f = n05Var.c;
            }
            float h = pi4Var.h();
            float f7 = i;
            float f8 = h + f7;
            if (f > f8 || (f4 < h && f - f4 > f7)) {
                f2 = f - f8;
            } else if (f4 < h && f - f4 <= f7) {
                f2 = f4 - h;
            } else {
                f2 = 0.0f;
            }
            pi4Var.i(pi4Var.h() + f2);
            this.d = n05Var;
        }
        pi4Var.i(db.B(pi4Var.h(), 0.0f, f3));
        this.c.i(i);
    }
}
