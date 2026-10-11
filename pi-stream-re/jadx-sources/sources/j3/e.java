package j3;

import android.animation.ValueAnimator;

/* loaded from: classes.dex */
public final /* synthetic */ class e implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5988a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f5989b;

    public /* synthetic */ e(Object obj, int i10) {
        this.f5988a = i10;
        this.f5989b = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i10 = this.f5988a;
        Object obj = this.f5989b;
        switch (i10) {
            case 0:
                f fVar = (f) obj;
                fVar.getClass();
                fVar.W = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                fVar.invalidate(fVar.f5991a);
                return;
            case 1:
                m6.k kVar = (m6.k) obj;
                kVar.getClass();
                kVar.f7499d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                g8.c cVar = (g8.c) obj;
                int i11 = g8.c.f4485d;
                cVar.getClass();
                cVar.f4487b = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                cVar.invalidate();
                return;
        }
    }
}
