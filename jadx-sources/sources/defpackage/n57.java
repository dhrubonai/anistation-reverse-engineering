package defpackage;

import android.view.WindowInsets;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public class n57 extends m57 {
    public yz2 t;
    public yz2 u;
    public yz2 v;

    public n57(v57 v57Var, WindowInsets windowInsets) {
        super(v57Var, windowInsets);
        this.t = null;
        this.u = null;
        this.v = null;
    }

    @Override // defpackage.s57
    public yz2 k() {
        yz2 yz2Var = this.u;
        if (yz2Var == null) {
            yz2 c = yz2.c(this.c.getMandatorySystemGestureInsets());
            this.u = c;
            return c;
        }
        return yz2Var;
    }

    @Override // defpackage.s57
    public yz2 m() {
        yz2 yz2Var = this.t;
        if (yz2Var == null) {
            yz2 c = yz2.c(this.c.getSystemGestureInsets());
            this.t = c;
            return c;
        }
        return yz2Var;
    }

    @Override // defpackage.s57
    public yz2 o() {
        yz2 yz2Var = this.v;
        if (yz2Var == null) {
            yz2 c = yz2.c(this.c.getTappableElementInsets());
            this.v = c;
            return c;
        }
        return yz2Var;
    }

    @Override // defpackage.k57, defpackage.s57
    public v57 r(int i, int i2, int i3, int i4) {
        return v57.c(this.c.inset(i, i2, i3, i4), null);
    }

    public n57(v57 v57Var, n57 n57Var) {
        super(v57Var, n57Var);
        this.t = null;
        this.u = null;
        this.v = null;
    }
}
