package w8;

import android.animation.ValueAnimator;
import android.view.View;

/* loaded from: classes.dex */
public final class f implements View.OnAttachStateChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11057a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ValueAnimator f11058b;

    public /* synthetic */ f(ValueAnimator valueAnimator, int i10) {
        this.f11057a = i10;
        this.f11058b = valueAnimator;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        int i10 = this.f11057a;
        ValueAnimator valueAnimator = this.f11058b;
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
        int i10 = this.f11057a;
        ValueAnimator valueAnimator = this.f11058b;
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
