package defpackage;

import android.view.View;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class ow6 implements View.OnAttachStateChangeListener {
    public nw6 A;
    public boolean B;
    public final View x;
    public yh2 y;
    public bx5 z;

    public ow6(View view) {
        this.x = view;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        nw6 nw6Var = this.A;
        if (nw6Var == null) {
            return;
        }
        this.B = true;
        kz4 kz4Var = nw6Var.x;
        ev2 ev2Var = nw6Var.y;
        iv.z(ev2Var, tl7.i(kz4Var.b, (l11) kz4Var.a.c.getValue(), new iz4(kz4Var, ev2Var, null, (byte) 0), 2));
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        nw6 nw6Var = this.A;
        if (nw6Var != null) {
            fg3 fg3Var = nw6Var.A;
            nw6Var.B.l(null);
            zd2 zd2Var = nw6Var.z;
            if (zd2Var != null && fg3Var != null) {
                fg3Var.b(zd2Var);
            }
            if (fg3Var != null) {
                fg3Var.b(nw6Var);
            }
        }
    }
}
