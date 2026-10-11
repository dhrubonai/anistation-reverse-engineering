package t8;

import android.animation.ValueAnimator;
import android.view.View;

/* loaded from: classes.dex */
public final class c implements View.OnAttachStateChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10101a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ValueAnimator f10102b;

    public /* synthetic */ c(ValueAnimator valueAnimator, int i10) {
        this.f10101a = i10;
        this.f10102b = valueAnimator;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        int i10 = this.f10101a;
        ValueAnimator valueAnimator = this.f10102b;
        switch (i10) {
            case 0:
                valueAnimator.start();
                return;
            default:
                valueAnimator.start();
                return;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        int i10 = this.f10101a;
        ValueAnimator valueAnimator = this.f10102b;
        switch (i10) {
            case 0:
                valueAnimator.cancel();
                return;
            default:
                valueAnimator.cancel();
                return;
        }
    }
}
