package defpackage;

import android.os.Handler;
import android.os.SystemClock;
import android.view.Surface;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class wp3 implements dv6 {
    public final /* synthetic */ aq3 b;

    public wp3(aq3 aq3Var) {
        this.b = aq3Var;
    }

    @Override // defpackage.dv6
    public final void b() {
        aq3 aq3Var = this.b;
        if (aq3Var.z1 != null) {
            aq3Var.U0(0, 1);
        }
    }

    @Override // defpackage.dv6
    public final void c(fv6 fv6Var) {
        ea2 ea2Var = fv6Var.x;
        aq3 aq3Var = this.b;
        aq3Var.R0 = aq3Var.d(fv6Var, ea2Var, false, 7001);
    }

    @Override // defpackage.dv6
    public final void d() {
        zy1 zy1Var = this.b.e0;
        if (zy1Var != null) {
            zy1Var.a();
        }
    }

    @Override // defpackage.dv6
    public final void onFirstFrameRendered() {
        aq3 aq3Var = this.b;
        Surface surface = aq3Var.z1;
        if (surface != null) {
            l33 l33Var = aq3Var.g1;
            Handler handler = (Handler) l33Var.y;
            if (handler != null) {
                handler.post(new c61(l33Var, surface, SystemClock.elapsedRealtime(), (byte) 2));
            }
            aq3Var.C1 = true;
        }
    }

    @Override // defpackage.dv6
    public final void a(hv6 hv6Var) {
    }
}
