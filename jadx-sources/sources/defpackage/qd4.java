package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class qd4 extends o74 {
    public final rd4 h;
    public boolean i;

    public qd4(rd4 rd4Var, sd4 sd4Var) {
        super(sd4Var, rd4Var.b);
        this.h = rd4Var;
        this.i = true;
    }

    @Override // defpackage.o74
    public final void a() {
        this.h.a();
    }

    @Override // defpackage.o74
    public final void b() {
        this.h.b();
    }

    @Override // defpackage.o74
    public final void c(l74 l74Var) {
        this.h.c(new lz(l74Var));
    }

    @Override // defpackage.o74
    public final void d(l74 l74Var) {
        l74Var.getClass();
        this.h.d(new lz(l74Var));
    }

    public final void h(boolean z) {
        boolean z2;
        this.i = z;
        if (z && this.h.b) {
            z2 = true;
        } else {
            z2 = false;
        }
        g(z2);
    }
}
