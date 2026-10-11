package g;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import n.l;

/* loaded from: classes.dex */
public final class b extends j {
    public static final /* synthetic */ int K = 0;
    public n.i I;
    public l J;

    public b(b bVar, e eVar, Resources resources) {
        super(bVar, eVar, resources);
        if (bVar != null) {
            this.I = bVar.I;
            this.J = bVar.J;
        } else {
            this.I = new n.i();
            this.J = new l();
        }
    }

    @Override // g.h
    public final void e() {
        this.I = this.I.clone();
        this.J = this.J.clone();
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        return new e(this, null);
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        return new e(this, resources);
    }
}
