package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class cq5 implements b12 {
    public final int a;
    public final int b;
    public final String c;
    public int d;
    public byte e;
    public d12 f;
    public bh6 g;

    public cq5(String str, int i, int i2) {
        this.a = i;
        this.b = i2;
        this.c = str;
    }

    @Override // defpackage.b12
    public final int a(c12 c12Var, d42 d42Var) {
        byte b = this.e;
        if (b != 1) {
            if (b == 2) {
                return -1;
            }
            p65.l();
            return 0;
        }
        bh6 bh6Var = this.g;
        bh6Var.getClass();
        int f = bh6Var.f(c12Var, 1024, true);
        if (f == -1) {
            this.e = (byte) 2;
            this.g.a(0L, 1, this.d, 0, null);
            this.d = 0;
            return 0;
        }
        this.d += f;
        return 0;
    }

    @Override // defpackage.b12
    public final boolean b(c12 c12Var) {
        boolean z;
        int i = this.b;
        int i2 = this.a;
        if (i2 != -1 && i != -1) {
            z = true;
        } else {
            z = false;
        }
        io3.B(z);
        zi4 zi4Var = new zi4(i);
        ((p81) c12Var).j(zi4Var.a, 0, i, false);
        if (zi4Var.H() == i2) {
            return true;
        }
        return false;
    }

    @Override // defpackage.b12
    public final void c(long j, long j2) {
        if (j != 0 && this.e != 1) {
            return;
        }
        this.e = (byte) 1;
        this.d = 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [hf5, java.lang.Object] */
    @Override // defpackage.b12
    public final void e(d12 d12Var) {
        this.f = d12Var;
        bh6 G = d12Var.G(1024, 4);
        this.g = G;
        da2 da2Var = new da2();
        String str = this.c;
        da2Var.n = qy3.n(str);
        da2Var.o = qy3.n(str);
        zo5.q(da2Var, G);
        this.f.t();
        this.f.I(new Object());
        this.e = (byte) 1;
    }

    @Override // defpackage.b12
    public final void release() {
    }
}
