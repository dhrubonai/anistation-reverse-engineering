package w8;

import android.animation.ValueAnimator;
import android.view.View;

/* loaded from: classes.dex */
public final /* synthetic */ class e implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11055a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f11056b;

    public /* synthetic */ e(View view, int i10) {
        this.f11055a = i10;
        this.f11056b = view;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i10 = this.f11055a;
        View view = this.f11056b;
        switch (i10) {
            case 0:
                view.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                int i11 = i.f11061a;
                view.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
