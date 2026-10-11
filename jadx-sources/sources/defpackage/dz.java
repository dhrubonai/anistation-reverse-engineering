package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class dz implements b12 {
    public final /* synthetic */ byte a;
    public final zi4 b;
    public final cq5 c;

    public dz(byte b) {
        this.a = b;
        switch (b) {
            case 1:
                this.b = new zi4(4);
                this.c = new cq5("image/webp", -1, -1);
                return;
            default:
                this.b = new zi4(4);
                this.c = new cq5("image/avif", -1, -1);
                return;
        }
    }

    @Override // defpackage.b12
    public final int a(c12 c12Var, d42 d42Var) {
        byte b = this.a;
        cq5 cq5Var = this.c;
        switch (b) {
            case 0:
                return cq5Var.a(c12Var, d42Var);
            default:
                return cq5Var.a(c12Var, d42Var);
        }
    }

    @Override // defpackage.b12
    public final boolean b(c12 c12Var) {
        byte b = this.a;
        zi4 zi4Var = this.b;
        switch (b) {
            case 0:
                p81 p81Var = (p81) c12Var;
                p81Var.x(4, false);
                zi4Var.K(4);
                p81Var.j(zi4Var.a, 0, 4, false);
                if (zi4Var.C() == 1718909296) {
                    zi4Var.K(4);
                    p81Var.j(zi4Var.a, 0, 4, false);
                    if (zi4Var.C() == 1635150182) {
                        return true;
                    }
                }
                return false;
            default:
                zi4Var.K(4);
                p81 p81Var2 = (p81) c12Var;
                p81Var2.j(zi4Var.a, 0, 4, false);
                if (zi4Var.C() == 1380533830) {
                    p81Var2.x(4, false);
                    zi4Var.K(4);
                    p81Var2.j(zi4Var.a, 0, 4, false);
                    if (zi4Var.C() == 1464156752) {
                        return true;
                    }
                }
                return false;
        }
    }

    @Override // defpackage.b12
    public final void c(long j, long j2) {
        byte b = this.a;
        cq5 cq5Var = this.c;
        switch (b) {
            case 0:
                cq5Var.c(j, j2);
                return;
            default:
                cq5Var.c(j, j2);
                return;
        }
    }

    @Override // defpackage.b12
    public final void e(d12 d12Var) {
        byte b = this.a;
        cq5 cq5Var = this.c;
        switch (b) {
            case 0:
                cq5Var.e(d12Var);
                return;
            default:
                cq5Var.e(d12Var);
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
}
