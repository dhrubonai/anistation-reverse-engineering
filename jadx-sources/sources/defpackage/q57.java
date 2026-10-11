package defpackage;

import android.graphics.Insets;
import android.view.View;
import android.view.WindowInsets;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public class q57 extends p57 {
    public static final v57 x;

    static {
        WindowInsets windowInsets;
        windowInsets = WindowInsets.CONSUMED;
        x = v57.c(windowInsets, null);
    }

    public q57(v57 v57Var, WindowInsets windowInsets) {
        super(v57Var, windowInsets);
    }

    @Override // defpackage.o57, defpackage.k57, defpackage.s57
    public yz2 i(int i) {
        Insets insets;
        insets = this.c.getInsets(u57.a(i));
        return yz2.c(insets);
    }

    @Override // defpackage.o57, defpackage.k57, defpackage.s57
    public yz2 j(int i) {
        Insets insetsIgnoringVisibility;
        insetsIgnoringVisibility = this.c.getInsetsIgnoringVisibility(u57.a(i));
        return yz2.c(insetsIgnoringVisibility);
    }

    @Override // defpackage.o57, defpackage.k57, defpackage.s57
    public boolean u(int i) {
        boolean isVisible;
        isVisible = this.c.isVisible(u57.a(i));
        return isVisible;
    }

    public q57(v57 v57Var, q57 q57Var) {
        super(v57Var, q57Var);
    }

    @Override // defpackage.k57, defpackage.s57
    public void p(View view) {
    }
}
