package j3;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes.dex */
public final class b0 extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5945a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d0 f5946b;

    public /* synthetic */ b0(d0 d0Var, int i10) {
        this.f5945a = i10;
        this.f5946b = d0Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        int i10 = this.f5945a;
        d0 d0Var = this.f5946b;
        switch (i10) {
            case 0:
                View view = d0Var.f5964b;
                if (view != null) {
                    view.setVisibility(4);
                }
                ViewGroup viewGroup = d0Var.f5965c;
                if (viewGroup != null) {
                    viewGroup.setVisibility(4);
                }
                ViewGroup viewGroup2 = d0Var.f5967e;
                if (viewGroup2 != null) {
                    viewGroup2.setVisibility(4);
                    return;
                }
                return;
            case 1:
            default:
                super.onAnimationEnd(animator);
                return;
            case 2:
                d0Var.i(0);
                return;
            case 3:
                d0Var.i(0);
                return;
            case 4:
                ViewGroup viewGroup3 = d0Var.f5968f;
                if (viewGroup3 != null) {
                    viewGroup3.setVisibility(4);
                    return;
                }
                return;
            case 5:
                ViewGroup viewGroup4 = d0Var.f5970h;
                if (viewGroup4 != null) {
                    viewGroup4.setVisibility(4);
                    return;
                }
                return;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        int i10 = this.f5945a;
        int i11 = 4;
        d0 d0Var = this.f5946b;
        switch (i10) {
            case 0:
                View view = d0Var.f5972j;
                if ((view instanceof f) && !d0Var.A) {
                    f fVar = (f) view;
                    ValueAnimator valueAnimator = fVar.V;
                    if (valueAnimator.isStarted()) {
                        valueAnimator.cancel();
                    }
                    valueAnimator.setFloatValues(fVar.W, 0.0f);
                    valueAnimator.setDuration(250L);
                    valueAnimator.start();
                    return;
                }
                return;
            case 1:
                View view2 = d0Var.f5964b;
                if (view2 != null) {
                    view2.setVisibility(0);
                }
                ViewGroup viewGroup = d0Var.f5965c;
                if (viewGroup != null) {
                    viewGroup.setVisibility(0);
                }
                ViewGroup viewGroup2 = d0Var.f5967e;
                if (viewGroup2 != null) {
                    if (d0Var.A) {
                        i11 = 0;
                    }
                    viewGroup2.setVisibility(i11);
                }
                View view3 = d0Var.f5972j;
                if ((view3 instanceof f) && !d0Var.A) {
                    f fVar2 = (f) view3;
                    ValueAnimator valueAnimator2 = fVar2.V;
                    if (valueAnimator2.isStarted()) {
                        valueAnimator2.cancel();
                    }
                    fVar2.f5992a0 = false;
                    valueAnimator2.setFloatValues(fVar2.W, 1.0f);
                    valueAnimator2.setDuration(250L);
                    valueAnimator2.start();
                    return;
                }
                return;
            case 2:
                d0Var.i(4);
                return;
            case 3:
                d0Var.i(4);
                return;
            case 4:
                ViewGroup viewGroup3 = d0Var.f5970h;
                if (viewGroup3 != null) {
                    viewGroup3.setVisibility(0);
                    ViewGroup viewGroup4 = d0Var.f5970h;
                    viewGroup4.setTranslationX(viewGroup4.getWidth());
                    viewGroup4.scrollTo(viewGroup4.getWidth(), 0);
                    return;
                }
                return;
            default:
                ViewGroup viewGroup5 = d0Var.f5968f;
                if (viewGroup5 != null) {
                    viewGroup5.setVisibility(0);
                    return;
                }
                return;
        }
    }
}
