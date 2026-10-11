package defpackage;

import android.view.WindowInsetsController;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class y57 extends w57 {
    @Override // defpackage.w57, defpackage.iv5
    public final void e(boolean z) {
        int i;
        WindowInsetsController windowInsetsController = (WindowInsetsController) this.c;
        if (z) {
            i = 16;
        } else {
            i = 0;
        }
        windowInsetsController.setSystemBarsAppearance(i, 16);
    }

    @Override // defpackage.w57, defpackage.iv5
    public final void f(boolean z) {
        int i;
        WindowInsetsController windowInsetsController = (WindowInsetsController) this.c;
        if (z) {
            i = 8;
        } else {
            i = 0;
        }
        windowInsetsController.setSystemBarsAppearance(i, 8);
    }

    @Override // defpackage.w57, defpackage.iv5
    public final void g() {
        ((WindowInsetsController) this.c).setSystemBarsBehavior(2);
    }
}
