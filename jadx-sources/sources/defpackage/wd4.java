package defpackage;

import android.window.OnBackInvokedDispatcher;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class wd4 {
    public final Runnable a;
    public final d46 b = new d46(new vt0(this, 29));

    public wd4(Runnable runnable) {
        this.a = runnable;
    }

    public final void a(og3 og3Var, rd4 rd4Var) {
        final fg3 lifecycle = og3Var.getLifecycle();
        if (((rg3) lifecycle).i == eg3.x) {
            return;
        }
        qd4 qd4Var = new qd4(rd4Var, new sd4(og3Var, rd4Var));
        rd4Var.a.add(qd4Var);
        qd4Var.h(false);
        m74.a(b().c, qd4Var);
        final o91 o91Var = new o91(qd4Var, this, lifecycle);
        lifecycle.a(o91Var);
        rd4Var.c.add(new AutoCloseable() { // from class: td4
            @Override // java.lang.AutoCloseable
            public final void close() {
                fg3.this.b(o91Var);
            }
        });
    }

    public final ud4 b() {
        return (ud4) this.b.getValue();
    }

    public final void c(OnBackInvokedDispatcher onBackInvokedDispatcher) {
        b().c.c(new od4(onBackInvokedDispatcher, 0), 1);
        b().c.c(new od4(onBackInvokedDispatcher, 1000000), 0);
    }
}
