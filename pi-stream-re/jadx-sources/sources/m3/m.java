package m3;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class m extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7302a = 1;

    /* renamed from: b, reason: collision with root package name */
    public boolean f7303b = false;

    /* renamed from: c, reason: collision with root package name */
    public final Object f7304c;

    public m(View view) {
        this.f7304c = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        switch (this.f7302a) {
            case 0:
                this.f7303b = true;
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        int i10 = this.f7302a;
        Object obj = this.f7304c;
        switch (i10) {
            case 0:
                if (this.f7303b) {
                    this.f7303b = false;
                    return;
                }
                o oVar = (o) obj;
                if (((Float) oVar.f7333z.getAnimatedValue()).floatValue() == 0.0f) {
                    oVar.A = 0;
                    oVar.e(0);
                    return;
                } else {
                    oVar.A = 2;
                    oVar.f7326s.invalidate();
                    return;
                }
            default:
                View view = (View) obj;
                q3.a0.f9121a.y(view, 1.0f);
                if (this.f7303b) {
                    view.setLayerType(0, null);
                    return;
                }
                return;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.f7302a) {
            case 1:
                View view = (View) this.f7304c;
                WeakHashMap weakHashMap = g0.y0.f4277a;
                if (g0.h0.h(view) && view.getLayerType() == 0) {
                    this.f7303b = true;
                    view.setLayerType(2, null);
                    return;
                }
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }

    public m(o oVar) {
        this.f7304c = oVar;
    }
}
