package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public final class fu0 extends mn0 {
    public int A;
    public final y43 z;

    public fu0(b23 b23Var, y43 y43Var) {
        super(b23Var);
        this.z = y43Var;
    }

    @Override // defpackage.mn0
    public final void e() {
        this.x = true;
        this.A++;
    }

    @Override // defpackage.mn0
    public final void g() {
        this.x = false;
        b23 b23Var = (b23) this.y;
        b23Var.i("\n");
        int i = this.A;
        for (int i2 = 0; i2 < i; i2++) {
            b23Var.i(this.z.a.g);
        }
    }

    @Override // defpackage.mn0
    public final void i() {
        if (this.x) {
            this.x = false;
        } else {
            g();
        }
    }

    @Override // defpackage.mn0
    public final void s() {
        l(' ');
    }

    @Override // defpackage.mn0
    public final void t() {
        this.A--;
    }
}
