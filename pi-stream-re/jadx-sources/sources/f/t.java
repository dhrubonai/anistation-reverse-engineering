package f;

import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import g0.n1;
import g0.y0;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class t extends n1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3781a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f3782b;

    public /* synthetic */ t(Object obj, int i10) {
        this.f3781a = i10;
        this.f3782b = obj;
    }

    @Override // g0.m1
    public final void a() {
        int i10 = this.f3781a;
        Object obj = this.f3782b;
        switch (i10) {
            case 0:
                r rVar = (r) obj;
                rVar.f3773b.M.setAlpha(1.0f);
                g0 g0Var = rVar.f3773b;
                g0Var.P.d(null);
                g0Var.P = null;
                return;
            case 1:
                g0 g0Var2 = (g0) obj;
                g0Var2.M.setAlpha(1.0f);
                g0Var2.P.d(null);
                g0Var2.P = null;
                return;
            default:
                u uVar = (u) obj;
                uVar.f3789b.M.setVisibility(8);
                g0 g0Var3 = uVar.f3789b;
                PopupWindow popupWindow = g0Var3.N;
                if (popupWindow != null) {
                    popupWindow.dismiss();
                } else if (g0Var3.M.getParent() instanceof View) {
                    View view = (View) g0Var3.M.getParent();
                    WeakHashMap weakHashMap = y0.f4277a;
                    g0.l0.c(view);
                }
                g0Var3.M.e();
                g0Var3.P.d(null);
                g0Var3.P = null;
                ViewGroup viewGroup = g0Var3.S;
                WeakHashMap weakHashMap2 = y0.f4277a;
                g0.l0.c(viewGroup);
                return;
        }
    }

    @Override // g0.n1, g0.m1
    public final void c() {
        int i10 = this.f3781a;
        Object obj = this.f3782b;
        switch (i10) {
            case 0:
                ((r) obj).f3773b.M.setVisibility(0);
                return;
            case 1:
                g0 g0Var = (g0) obj;
                g0Var.M.setVisibility(0);
                if (g0Var.M.getParent() instanceof View) {
                    View view = (View) g0Var.M.getParent();
                    WeakHashMap weakHashMap = y0.f4277a;
                    g0.l0.c(view);
                    return;
                }
                return;
            default:
                return;
        }
    }
}
