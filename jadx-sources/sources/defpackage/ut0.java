package defpackage;

import com.anistation.android.MainActivity;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class ut0 extends q0 {
    public final ti4 G;
    public boolean H;

    public ut0(MainActivity mainActivity) {
        super(mainActivity);
        this.G = xt5.g(null);
    }

    @Override // defpackage.q0
    public final void a(int i, kd2 kd2Var) {
        int i2;
        boolean z;
        kd2Var.f0(420213850);
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
            ic2 ic2Var = (ic2) this.G.getValue();
            if (ic2Var == null) {
                kd2Var.e0(-1238823553);
            } else {
                kd2Var.e0(98585282);
                ic2Var.invoke(kd2Var, 0);
            }
            kd2Var.q(false);
        } else {
            kd2Var.Y();
        }
        zz4 u = kd2Var.u();
        if (u != null) {
            u.d = new o0(this, i, (byte) 6);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return ut0.class.getName();
    }

    @Override // defpackage.q0
    public boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.H;
    }

    public final void setContent(ic2 ic2Var) {
        this.H = true;
        this.G.setValue(ic2Var);
        if (!isAttachedToWindow() && getComposeViewContext$ui() == null) {
            return;
        }
        d();
    }

    public static /* synthetic */ void getShouldCreateCompositionOnAttachedToWindow$annotations() {
    }
}
