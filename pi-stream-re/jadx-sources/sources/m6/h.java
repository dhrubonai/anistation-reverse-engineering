package m6;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* loaded from: classes.dex */
public abstract class h extends j6.g {
    public static final /* synthetic */ int P = 0;
    public f O;

    public h(f fVar) {
        super(fVar);
        this.O = fVar;
    }

    @Override // j6.g, android.graphics.drawable.Drawable
    public final Drawable mutate() {
        this.O = new f(this.O);
        return this;
    }

    public final void n(float f10, float f11, float f12, float f13) {
        RectF rectF = this.O.f7469v;
        if (f10 != rectF.left || f11 != rectF.top || f12 != rectF.right || f13 != rectF.bottom) {
            rectF.set(f10, f11, f12, f13);
            invalidateSelf();
        }
    }
}
