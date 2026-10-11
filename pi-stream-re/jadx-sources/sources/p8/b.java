package p8;

import android.animation.ValueAnimator;
import android.widget.TextView;

/* loaded from: classes.dex */
public final /* synthetic */ class b implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8764a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TextView f8765b;

    public /* synthetic */ b(TextView textView, int i10) {
        this.f8764a = i10;
        this.f8765b = textView;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i10 = this.f8764a;
        TextView textView = this.f8765b;
        switch (i10) {
            case 0:
                textView.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 1:
                textView.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 2:
                textView.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                textView.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
