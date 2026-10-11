package defpackage;

import android.view.View;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class j82 extends xz3 implements v72 {
    @Override // defpackage.v72
    public final void D(s72 s72Var) {
        boolean z;
        View L = io3.L(this);
        if (this.x.K && io3.L(this).hasFocusable()) {
            z = true;
        } else {
            z = false;
        }
        s72Var.c(z);
        View findFocus = L.findFocus();
        if (findFocus != null) {
            s72Var.d(m72.a(findFocus, L));
        }
    }
}
