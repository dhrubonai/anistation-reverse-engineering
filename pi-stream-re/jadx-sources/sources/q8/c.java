package q8;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.view.View;
import w8.i;

/* loaded from: classes.dex */
public final class c extends View {

    /* renamed from: a, reason: collision with root package name */
    public final Paint f9244a;

    /* renamed from: b, reason: collision with root package name */
    public final RectF f9245b;

    /* renamed from: c, reason: collision with root package name */
    public String f9246c;

    /* renamed from: d, reason: collision with root package name */
    public float f9247d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f9248e;

    public c(Context context) {
        super(context);
        this.f9244a = new Paint(1);
        this.f9245b = new RectF();
        this.f9246c = "Volume";
        this.f9247d = 0.5f;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        String str;
        super.onDraw(canvas);
        float width = getWidth();
        float height = getHeight();
        Paint paint = this.f9244a;
        paint.setTextAlign(Paint.Align.CENTER);
        paint.setTypeface(Typeface.DEFAULT_BOLD);
        paint.setColor(-1);
        paint.setShadowLayer(10.0f, 0.0f, 2.0f, -1442840576);
        if (this.f9248e) {
            paint.setTextSize(0.34f * width);
            canvas.drawText("2x", width / 2.0f, (width * 0.11f) + (height / 2.0f), paint);
            paint.clearShadowLayer();
            return;
        }
        paint.setTextSize(0.16f * width);
        if (this.f9246c.startsWith("B")) {
            str = "SUN";
        } else {
            str = "VOL";
        }
        float f10 = width / 2.0f;
        canvas.drawText(str, f10, 0.2f * height, paint);
        RectF rectF = this.f9245b;
        rectF.set(0.46f * width, 0.3f * height, 0.54f * width, 0.75f * height);
        paint.clearShadowLayer();
        paint.setColor(1728053247);
        float f11 = 0.06f * width;
        canvas.drawRoundRect(rectF, f11, f11, paint);
        RectF rectF2 = new RectF(rectF.left, rectF.bottom - (rectF.height() * this.f9247d), rectF.right, rectF.bottom);
        paint.setColor(i.f11065e);
        canvas.drawRoundRect(rectF2, f11, f11, paint);
        paint.setColor(-1);
        paint.setShadowLayer(8.0f, 0.0f, 2.0f, -1442840576);
        paint.setTextSize(width * 0.18f);
        canvas.drawText(Math.round(this.f9247d * 100.0f) + "%", f10, height * 0.91f, paint);
        paint.clearShadowLayer();
    }
}
