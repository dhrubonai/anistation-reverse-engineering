package f8;

import android.graphics.Matrix;
import android.graphics.drawable.BitmapDrawable;
import android.view.ViewTreeObserver;
import android.widget.ImageView;

/* loaded from: classes.dex */
public final class k implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ImageView f3964a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l f3965b;

    public k(l lVar, ImageView imageView) {
        this.f3965b = lVar;
        this.f3964a = imageView;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        ImageView imageView = this.f3964a;
        imageView.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        int i10 = l.f3966t0;
        this.f3965b.getClass();
        if (imageView.getDrawable() instanceof BitmapDrawable) {
            int width = imageView.getWidth();
            int height = imageView.getHeight();
            int intrinsicWidth = imageView.getDrawable().getIntrinsicWidth();
            int intrinsicHeight = imageView.getDrawable().getIntrinsicHeight();
            if (width != 0 && height != 0 && intrinsicWidth > 0 && intrinsicHeight > 0) {
                float f10 = width;
                float f11 = intrinsicWidth;
                float f12 = height;
                float f13 = intrinsicHeight;
                float max = Math.max(f10 / f11, f12 / f13) * 1.35f;
                float f14 = f13 * max;
                float f15 = (f10 - (f11 * max)) / 2.0f;
                float max2 = Math.max(f12 - f14, Math.min(0.0f, (0.3f * f12) - (0.62f * f14)));
                Matrix matrix = new Matrix();
                matrix.setScale(max, max);
                matrix.postTranslate(f15, max2);
                imageView.setImageMatrix(matrix);
            }
        }
    }
}
