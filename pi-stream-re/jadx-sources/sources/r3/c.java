package r3;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;

/* loaded from: classes.dex */
public final class c extends Drawable.ConstantState {

    /* renamed from: a, reason: collision with root package name */
    public final Drawable.ConstantState f9330a;

    public c(Drawable.ConstantState constantState) {
        this.f9330a = constantState;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final boolean canApplyTheme() {
        return this.f9330a.canApplyTheme();
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        return this.f9330a.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        d dVar = new d(null);
        Drawable newDrawable = this.f9330a.newDrawable();
        dVar.f9338a = newDrawable;
        newDrawable.setCallback(dVar.f9336f);
        return dVar;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        d dVar = new d(null);
        Drawable newDrawable = this.f9330a.newDrawable(resources);
        dVar.f9338a = newDrawable;
        newDrawable.setCallback(dVar.f9336f);
        return dVar;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources, Resources.Theme theme) {
        d dVar = new d(null);
        Drawable newDrawable = this.f9330a.newDrawable(resources, theme);
        dVar.f9338a = newDrawable;
        newDrawable.setCallback(dVar.f9336f);
        return dVar;
    }
}
