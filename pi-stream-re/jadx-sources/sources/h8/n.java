package h8;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.text.style.ImageSpan;

/* loaded from: classes.dex */
public final class n extends ImageSpan {

    /* renamed from: a, reason: collision with root package name */
    public final int f5060a;

    public n(Drawable drawable, int i10) {
        super(drawable);
        this.f5060a = i10;
    }

    @Override // android.text.style.DynamicDrawableSpan, android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i10, int i11, float f10, int i12, int i13, int i14, Paint paint) {
        Drawable drawable = getDrawable();
        canvas.save();
        canvas.translate(f10, (((i14 - i12) - drawable.getBounds().bottom) / 2) + i12 + this.f5060a);
        drawable.draw(canvas);
        canvas.restore();
    }
}
