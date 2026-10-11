package defpackage;

import android.window.BackEvent;
import android.window.OnBackAnimationCallback;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class pd4 implements OnBackAnimationCallback {
    public final /* synthetic */ od4 a;

    public pd4(od4 od4Var) {
        this.a = od4Var;
    }

    public final void onBackCancelled() {
        od4 od4Var = this.a;
        m74 m74Var = od4Var.a;
        if (m74Var != null) {
            if (!od4Var.b) {
                m74Var.d(od4Var, null);
            }
            v74 v74Var = m74Var.b;
            if (od4Var.equals(v74Var.h) && -1 == v74Var.g) {
                o74 o74Var = v74Var.f;
                if (o74Var == null) {
                    o74Var = v74Var.c(-1);
                }
                v74Var.f = null;
                v74Var.g = 0;
                v74Var.h = null;
                x74 x74Var = x74.a;
                if (o74Var != null) {
                    o74Var.d = x74Var;
                    o74Var.a();
                }
                v74Var.a.l(null, x74Var);
            }
            od4Var.b = false;
            return;
        }
        ze0.m("This input is not added to any dispatcher.");
    }

    public final void onBackInvoked() {
        this.a.a();
    }

    public final void onBackProgressed(BackEvent backEvent) {
        backEvent.getClass();
        l74 I = wk6.I(backEvent);
        od4 od4Var = this.a;
        m74 m74Var = od4Var.a;
        if (m74Var != null) {
            if (od4Var.b) {
                v74 v74Var = m74Var.b;
                if (od4Var.equals(v74Var.h) && -1 == v74Var.g) {
                    o74 o74Var = v74Var.f;
                    if (o74Var == null) {
                        o74Var = v74Var.c(-1);
                    }
                    if (o74Var != null) {
                        o74Var.d = new y74(I, -1);
                        o74Var.c(I);
                    }
                    v74Var.a.l(null, new y74(I, -1));
                    return;
                }
                return;
            }
            return;
        }
        ze0.m("This input is not added to any dispatcher.");
    }

    public final void onBackStarted(BackEvent backEvent) {
        backEvent.getClass();
        l74 I = wk6.I(backEvent);
        od4 od4Var = this.a;
        m74 m74Var = od4Var.a;
        if (m74Var != null) {
            if (!od4Var.b) {
                m74Var.d(od4Var, I);
                od4Var.b = true;
                return;
            }
            return;
        }
        ze0.m("This input is not added to any dispatcher.");
    }
}
