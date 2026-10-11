package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class f70 implements b12 {
    public final /* synthetic */ byte a;
    public final Object b;

    public f70(byte b) {
        this.a = b;
        switch (b) {
            case 1:
                this.b = new cq5("image/png", 35152, 2);
                return;
            default:
                this.b = new cq5("image/bmp", 16973, 2);
                return;
        }
    }

    @Override // defpackage.b12
    public final int a(c12 c12Var, d42 d42Var) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                return ((cq5) obj).a(c12Var, d42Var);
            case 1:
                return ((cq5) obj).a(c12Var, d42Var);
            default:
                if (c12Var.n(Integer.MAX_VALUE) == -1) {
                    return -1;
                }
                return 0;
        }
    }

    @Override // defpackage.b12
    public final boolean b(c12 c12Var) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                return ((cq5) obj).b(c12Var);
            case 1:
                return ((cq5) obj).b(c12Var);
            default:
                return true;
        }
    }

    @Override // defpackage.b12
    public final void c(long j, long j2) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                ((cq5) obj).c(j, j2);
                return;
            case 1:
                ((cq5) obj).c(j, j2);
                return;
            default:
                return;
        }
    }

    @Override // defpackage.b12
    public final void e(d12 d12Var) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                ((cq5) obj).e(d12Var);
                return;
            case 1:
                ((cq5) obj).e(d12Var);
                return;
            default:
                bh6 G = d12Var.G(0, 3);
                d12Var.I(new zy(-9223372036854775807L));
                d12Var.t();
                ea2 ea2Var = (ea2) obj;
                da2 a = ea2Var.a();
                a.o = qy3.n("text/x-unknown");
                a.k = ea2Var.p;
                zo5.q(a, G);
                return;
        }
    }

    @Override // defpackage.b12
    public final void release() {
        byte b = this.a;
    }

    private final void f() {
    }

    private final void g() {
    }

    private final void h() {
    }

    public f70(ea2 ea2Var) {
        this.a = (byte) 2;
        this.b = ea2Var;
    }

    private final void i(long j, long j2) {
    }
}
