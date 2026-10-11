package g0;

import android.view.WindowInsets;

/* loaded from: classes.dex */
public class a2 extends c2 {

    /* renamed from: c, reason: collision with root package name */
    public final WindowInsets.Builder f4165c;

    public a2() {
        this.f4165c = androidx.appcompat.widget.n1.d();
    }

    @Override // g0.c2
    public k2 b() {
        WindowInsets build;
        a();
        build = this.f4165c.build();
        k2 h10 = k2.h(null, build);
        h10.f4227a.o(this.f4174b);
        return h10;
    }

    @Override // g0.c2
    public void d(z.d dVar) {
        this.f4165c.setMandatorySystemGestureInsets(dVar.d());
    }

    @Override // g0.c2
    public void e(z.d dVar) {
        this.f4165c.setStableInsets(dVar.d());
    }

    @Override // g0.c2
    public void f(z.d dVar) {
        this.f4165c.setSystemGestureInsets(dVar.d());
    }

    @Override // g0.c2
    public void g(z.d dVar) {
        this.f4165c.setSystemWindowInsets(dVar.d());
    }

    @Override // g0.c2
    public void h(z.d dVar) {
        this.f4165c.setTappableElementInsets(dVar.d());
    }

    public a2(k2 k2Var) {
        super(k2Var);
        WindowInsets.Builder d10;
        WindowInsets g10 = k2Var.g();
        if (g10 != null) {
            d10 = androidx.appcompat.widget.n1.e(g10);
        } else {
            d10 = androidx.appcompat.widget.n1.d();
        }
        this.f4165c = d10;
    }
}
