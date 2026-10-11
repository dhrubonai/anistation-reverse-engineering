package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class f90 {
    public final int a;
    public int b;
    public int c;
    public long d;
    public final boolean e;
    public final zi4 f;
    public final zi4 g;
    public int h;
    public int i;

    public f90(zi4 zi4Var, zi4 zi4Var2, boolean z) {
        this.g = zi4Var;
        this.f = zi4Var2;
        this.e = z;
        zi4Var2.N(12);
        this.a = zi4Var2.E();
        zi4Var.N(12);
        this.i = zi4Var.E();
        w65.r("first_chunk must be 1", zi4Var.m() == 1);
        this.b = -1;
    }

    public final boolean a() {
        long C;
        int i;
        int i2 = this.b + 1;
        this.b = i2;
        if (i2 == this.a) {
            return false;
        }
        boolean z = this.e;
        zi4 zi4Var = this.f;
        if (z) {
            C = zi4Var.G();
        } else {
            C = zi4Var.C();
        }
        this.d = C;
        if (this.b == this.h) {
            zi4 zi4Var2 = this.g;
            this.c = zi4Var2.E();
            zi4Var2.O(4);
            int i3 = this.i - 1;
            this.i = i3;
            if (i3 > 0) {
                i = zi4Var2.E() - 1;
            } else {
                i = -1;
            }
            this.h = i;
        }
        return true;
    }
}
