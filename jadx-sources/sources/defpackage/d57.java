package defpackage;

import android.view.WindowInsets;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public class d57 extends j57 {
    public final WindowInsets.Builder e;

    public d57(v57 v57Var) {
        super(v57Var);
        WindowInsets.Builder builder;
        WindowInsets b = v57Var.b();
        if (b != null) {
            builder = new WindowInsets.Builder(b);
        } else {
            builder = new WindowInsets.Builder();
        }
        this.e = builder;
    }

    @Override // defpackage.j57
    public v57 b() {
        a();
        v57 c = v57.c(this.e.build(), null);
        yz2[] yz2VarArr = this.b;
        s57 s57Var = c.a;
        s57Var.w(yz2VarArr);
        s57Var.v(null);
        s57Var.A(this.c);
        s57Var.B(this.d);
        return c;
    }

    @Override // defpackage.j57
    public void e(yz2 yz2Var) {
        this.e.setMandatorySystemGestureInsets(yz2Var.d());
    }

    @Override // defpackage.j57
    public void f(yz2 yz2Var) {
        this.e.setStableInsets(yz2Var.d());
    }

    @Override // defpackage.j57
    public void g(yz2 yz2Var) {
        this.e.setSystemGestureInsets(yz2Var.d());
    }

    @Override // defpackage.j57
    public void h(yz2 yz2Var) {
        this.e.setSystemWindowInsets(yz2Var.d());
    }

    @Override // defpackage.j57
    public void i(yz2 yz2Var) {
        this.e.setTappableElementInsets(yz2Var.d());
    }

    public d57() {
        this.e = new WindowInsets.Builder();
    }
}
