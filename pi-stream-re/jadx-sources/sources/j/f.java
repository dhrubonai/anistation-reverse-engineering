package j;

import android.view.View;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityManager;
import g0.k0;
import g0.y0;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class f implements View.OnAttachStateChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5503a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f5504b;

    public /* synthetic */ f(Object obj, int i10) {
        this.f5503a = i10;
        this.f5504b = obj;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        AccessibilityManager accessibilityManager;
        switch (this.f5503a) {
            case 0:
            case 1:
                return;
            default:
                m6.n nVar = (m6.n) this.f5504b;
                int i10 = m6.n.N;
                if (nVar.L != null && (accessibilityManager = nVar.K) != null) {
                    WeakHashMap weakHashMap = y0.f4277a;
                    if (k0.b(nVar)) {
                        h0.c.a(accessibilityManager, nVar.L);
                        return;
                    }
                    return;
                }
                return;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        AccessibilityManager accessibilityManager;
        int i10 = this.f5503a;
        Object obj = this.f5504b;
        switch (i10) {
            case 0:
                i iVar = (i) obj;
                ViewTreeObserver viewTreeObserver = iVar.P;
                if (viewTreeObserver != null) {
                    if (!viewTreeObserver.isAlive()) {
                        iVar.P = view.getViewTreeObserver();
                    }
                    iVar.P.removeGlobalOnLayoutListener(iVar.A);
                }
                view.removeOnAttachStateChangeListener(this);
                return;
            case 1:
                h0 h0Var = (h0) obj;
                ViewTreeObserver viewTreeObserver2 = h0Var.G;
                if (viewTreeObserver2 != null) {
                    if (!viewTreeObserver2.isAlive()) {
                        h0Var.G = view.getViewTreeObserver();
                    }
                    h0Var.G.removeGlobalOnLayoutListener(h0Var.A);
                }
                view.removeOnAttachStateChangeListener(this);
                return;
            default:
                m6.n nVar = (m6.n) obj;
                int i11 = m6.n.N;
                h0.d dVar = nVar.L;
                if (dVar != null && (accessibilityManager = nVar.K) != null) {
                    h0.c.b(accessibilityManager, dVar);
                    return;
                }
                return;
        }
    }
}
