package defpackage;

import android.view.ViewTreeObserver;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class mw6 implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ qg0 A;
    public boolean x;
    public final /* synthetic */ sz4 y;
    public final /* synthetic */ ViewTreeObserver z;

    public mw6(sz4 sz4Var, ViewTreeObserver viewTreeObserver, qg0 qg0Var) {
        this.y = sz4Var;
        this.z = viewTreeObserver;
        this.A = qg0Var;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        sz4 sz4Var = this.y;
        tq5 c = sz4Var.c();
        if (c != null) {
            ViewTreeObserver viewTreeObserver = this.z;
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.removeOnPreDrawListener(this);
            } else {
                sz4Var.x.getViewTreeObserver().removeOnPreDrawListener(this);
            }
            if (!this.x) {
                this.x = true;
                this.A.resumeWith(c);
            }
        }
        return true;
    }
}
