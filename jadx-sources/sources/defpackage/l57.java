package defpackage;

import android.view.WindowInsets;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public class l57 extends k57 {
    public yz2 s;

    public l57(v57 v57Var, l57 l57Var) {
        super(v57Var, l57Var);
        this.s = null;
        this.s = l57Var.s;
    }

    @Override // defpackage.s57
    public v57 b() {
        return v57.c(this.c.consumeStableInsets(), null);
    }

    @Override // defpackage.s57
    public v57 c() {
        return v57.c(this.c.consumeSystemWindowInsets(), null);
    }

    @Override // defpackage.s57
    public final yz2 l() {
        yz2 yz2Var = this.s;
        if (yz2Var == null) {
            WindowInsets windowInsets = this.c;
            yz2 b = yz2.b(windowInsets.getStableInsetLeft(), windowInsets.getStableInsetTop(), windowInsets.getStableInsetRight(), windowInsets.getStableInsetBottom());
            this.s = b;
            return b;
        }
        return yz2Var;
    }

    @Override // defpackage.s57
    public boolean s() {
        return this.c.isConsumed();
    }

    public l57(v57 v57Var, WindowInsets windowInsets) {
        super(v57Var, windowInsets);
        this.s = null;
    }
}
