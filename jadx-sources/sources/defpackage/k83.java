package defpackage;

import android.view.KeyEvent;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class k83 extends xz3 implements j83 {
    public ub2 L;
    public ub2 M;

    @Override // defpackage.j83
    public final boolean E(KeyEvent keyEvent) {
        ub2 ub2Var = this.L;
        if (ub2Var != null) {
            return ((Boolean) ub2Var.invoke(new g83(keyEvent))).booleanValue();
        }
        return false;
    }

    @Override // defpackage.j83
    public final boolean m(KeyEvent keyEvent) {
        ub2 ub2Var = this.M;
        if (ub2Var != null) {
            return ((Boolean) ub2Var.invoke(new g83(keyEvent))).booleanValue();
        }
        return false;
    }
}
