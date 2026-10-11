package j;

import android.view.ActionProvider;
import android.view.MenuItem;
import android.view.View;
import f.p0;

/* loaded from: classes.dex */
public final class s extends r implements ActionProvider.VisibilityListener {

    /* renamed from: c, reason: collision with root package name */
    public p0 f5599c;

    @Override // j.r
    public final boolean a() {
        return this.f5597a.isVisible();
    }

    @Override // j.r
    public final View b(MenuItem menuItem) {
        return this.f5597a.onCreateActionView(menuItem);
    }

    @Override // j.r
    public final boolean c() {
        return this.f5597a.overridesItemVisibility();
    }

    @Override // j.r
    public final void d(p0 p0Var) {
        this.f5599c = p0Var;
        this.f5597a.setVisibilityListener(this);
    }

    @Override // android.view.ActionProvider.VisibilityListener
    public final void onActionProviderVisibilityChanged(boolean z9) {
        p0 p0Var = this.f5599c;
        if (p0Var != null) {
            o oVar = ((q) p0Var.f3762b).f5585n;
            oVar.f5553h = true;
            oVar.p(true);
        }
    }
}
