package m6;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* loaded from: classes.dex */
public final class f extends j6.f {

    /* renamed from: v, reason: collision with root package name */
    public final RectF f7469v;

    public f(j6.k kVar, RectF rectF) {
        super(kVar);
        this.f7469v = rectF;
    }

    @Override // j6.f, android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        g gVar = new g(this);
        gVar.invalidateSelf();
        return gVar;
    }

    public f(f fVar) {
        super(fVar);
        this.f7469v = fVar.f7469v;
    }
}
