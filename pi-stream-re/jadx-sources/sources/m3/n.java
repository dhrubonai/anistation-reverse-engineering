package m3;

import android.animation.ValueAnimator;

/* loaded from: classes.dex */
public final class n implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ o f7308a;

    public n(o oVar) {
        this.f7308a = oVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int floatValue = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f);
        o oVar = this.f7308a;
        oVar.f7311c.setAlpha(floatValue);
        oVar.f7312d.setAlpha(floatValue);
        oVar.f7326s.invalidate();
    }
}
