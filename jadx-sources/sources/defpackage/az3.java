package defpackage;

import android.content.Context;
import android.view.Window;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class az3 extends q0 implements fg1 {
    public final Window G;
    public final ti4 H;
    public boolean I;

    public az3(Context context, Window window) {
        super(context);
        this.G = window;
        this.H = xt5.g(ws0.a);
    }

    @Override // defpackage.q0
    public final void a(int i, kd2 kd2Var) {
        int i2;
        boolean z;
        kd2Var.f0(576708319);
        if (kd2Var.h(this)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i3 = i2 | i;
        if ((i3 & 3) != 2) {
            z = true;
        } else {
            z = false;
        }
        if (kd2Var.V(i3 & 1, z)) {
            ((ic2) this.H.getValue()).invoke(kd2Var, 0);
        } else {
            kd2Var.Y();
        }
        zz4 u = kd2Var.u();
        if (u != null) {
            u.d = new o0(this, i, (byte) 18);
        }
    }

    @Override // defpackage.q0
    public final boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.I;
    }

    @Override // defpackage.fg1
    public final Window getWindow() {
        return this.G;
    }
}
