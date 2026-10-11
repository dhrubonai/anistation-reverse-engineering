package g8;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import android.view.animation.LinearInterpolator;
import j3.e;
import w8.i;

/* loaded from: classes.dex */
public final class c extends View {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f4485d = 0;

    /* renamed from: a, reason: collision with root package name */
    public final Paint f4486a;

    /* renamed from: b, reason: collision with root package name */
    public float f4487b;

    /* renamed from: c, reason: collision with root package name */
    public ValueAnimator f4488c;

    public c(Context context) {
        super(context);
        Paint paint = new Paint(1);
        this.f4486a = paint;
        this.f4487b = 0.0f;
        paint.setColor(i.f11065e);
        paint.setStyle(Paint.Style.FILL);
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ValueAnimator valueAnimator = this.f4488c;
        if (valueAnimator == null || !valueAnimator.isRunning()) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 360.0f);
            this.f4488c = ofFloat;
            ofFloat.setDuration(1200L);
            this.f4488c.setRepeatCount(-1);
            this.f4488c.setInterpolator(new LinearInterpolator());
            this.f4488c.addUpdateListener(new e(this, 2));
            this.f4488c.start();
        }
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ValueAnimator valueAnimator = this.f4488c;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f4488c = null;
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float width = getWidth() / 2.0f;
        float height = getHeight() / 2.0f;
        float min = Math.min(width, height);
        float f10 = 0.6f * min;
        float f11 = min * 0.14f;
        for (int i10 = 0; i10 < 10; i10++) {
            double radians = (float) Math.toRadians((i10 * 36.0f) + this.f4487b);
            float cos = (((float) Math.cos(radians)) * f10) + width;
            float sin = (((float) Math.sin(radians)) * f10) + height;
            float sin2 = (((float) Math.sin(radians)) + 1.0f) / 2.0f;
            Paint paint = this.f4486a;
            paint.setAlpha((int) (((0.75f * sin2) + 0.25f) * 255.0f));
            canvas.drawCircle(cos, sin, ((sin2 * 0.3f) + 0.7f) * f11, paint);
        }
    }
}
