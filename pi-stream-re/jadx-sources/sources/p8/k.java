package p8;

import android.animation.ValueAnimator;
import android.view.View;

/* loaded from: classes.dex */
public final class k implements View.OnAttachStateChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8782a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ValueAnimator f8783b;

    public /* synthetic */ k(ValueAnimator valueAnimator, int i10) {
        this.f8782a = i10;
        this.f8783b = valueAnimator;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        int i10 = this.f8782a;
        ValueAnimator valueAnimator = this.f8783b;
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
        int i10 = this.f8782a;
        ValueAnimator valueAnimator = this.f8783b;
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
