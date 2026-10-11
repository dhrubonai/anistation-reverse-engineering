package g;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;

/* loaded from: classes.dex */
public abstract class k extends i {
    public j E;
    public boolean F;

    @Override // g.i, android.graphics.drawable.Drawable
    public final void applyTheme(Resources.Theme theme) {
        super.applyTheme(theme);
        onStateChange(getState());
    }

    @Override // g.i, android.graphics.drawable.Drawable
    public Drawable mutate() {
        if (!this.F) {
            super.mutate();
            this.E.e();
            this.F = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public abstract boolean onStateChange(int[] iArr);
}
