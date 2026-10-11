package f4;

import android.graphics.drawable.Drawable;
import x3.b0;
import x3.e0;

/* loaded from: classes.dex */
public abstract class c implements e0, b0 {

    /* renamed from: a, reason: collision with root package name */
    public final Drawable f3919a;

    public c(Drawable drawable) {
        w7.b.q(drawable);
        this.f3919a = drawable;
    }

    @Override // x3.e0
    public final Object get() {
        Drawable drawable = this.f3919a;
        Drawable.ConstantState constantState = drawable.getConstantState();
        if (constantState != null) {
            return constantState.newDrawable();
        }
        return drawable;
    }
}
