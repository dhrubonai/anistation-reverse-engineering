package androidx.activity;

import android.view.View;
import android.view.Window;
import androidx.fragment.app.b0;
import androidx.lifecycle.u;

/* loaded from: classes.dex */
public final class g implements androidx.lifecycle.s {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f265a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j f266b;

    public /* synthetic */ g(b0 b0Var, int i10) {
        this.f265a = i10;
        this.f266b = b0Var;
    }

    @Override // androidx.lifecycle.s
    public final void onStateChanged(u uVar, androidx.lifecycle.n nVar) {
        View view = null;
        switch (this.f265a) {
            case 0:
                if (nVar == androidx.lifecycle.n.ON_DESTROY) {
                    this.f266b.mContextAwareHelper.f1276b = null;
                    if (!this.f266b.isChangingConfigurations()) {
                        this.f266b.getViewModelStore().a();
                        return;
                    }
                    return;
                }
                return;
            case 1:
                if (nVar == androidx.lifecycle.n.ON_STOP) {
                    Window window = this.f266b.getWindow();
                    if (window != null) {
                        view = window.peekDecorView();
                    }
                    if (view != null) {
                        view.cancelPendingInputEvents();
                        return;
                    }
                    return;
                }
                return;
            default:
                j jVar = this.f266b;
                jVar.ensureViewModelStore();
                jVar.getLifecycle().b(this);
                return;
        }
    }
}
