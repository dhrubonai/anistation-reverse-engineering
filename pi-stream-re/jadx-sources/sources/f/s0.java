package f;

import android.view.View;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import g0.n1;
import g0.y0;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class s0 extends n1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3779a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ u0 f3780b;

    public /* synthetic */ s0(u0 u0Var, int i10) {
        this.f3779a = i10;
        this.f3780b = u0Var;
    }

    @Override // g0.m1
    public final void a() {
        View view;
        int i10 = this.f3779a;
        u0 u0Var = this.f3780b;
        switch (i10) {
            case 0:
                if (u0Var.Q && (view = u0Var.I) != null) {
                    view.setTranslationY(0.0f);
                    u0Var.F.setTranslationY(0.0f);
                }
                u0Var.F.setVisibility(8);
                u0Var.F.setTransitioning(false);
                u0Var.U = null;
                i.a aVar = u0Var.M;
                if (aVar != null) {
                    aVar.c(u0Var.L);
                    u0Var.L = null;
                    u0Var.M = null;
                }
                ActionBarOverlayLayout actionBarOverlayLayout = u0Var.E;
                if (actionBarOverlayLayout != null) {
                    WeakHashMap weakHashMap = y0.f4277a;
                    g0.l0.c(actionBarOverlayLayout);
                    return;
                }
                return;
            default:
                u0Var.U = null;
                u0Var.F.requestLayout();
                return;
        }
    }
}
