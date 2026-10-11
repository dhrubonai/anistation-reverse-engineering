package g0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* loaded from: classes.dex */
public final class j1 extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4222a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f4223b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f4224c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f4225d;

    public /* synthetic */ j1(Object obj, Object obj2, Object obj3, int i10) {
        this.f4222a = i10;
        this.f4225d = obj;
        this.f4224c = obj2;
        this.f4223b = obj3;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        switch (this.f4222a) {
            case 0:
                ((m1) this.f4224c).b((View) this.f4223b);
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        int i10 = this.f4222a;
        Object obj = this.f4224c;
        switch (i10) {
            case 0:
                ((m1) obj).a();
                return;
            default:
                ((x1) obj).f4276a.d(1.0f);
                t1.e((View) this.f4223b);
                return;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.f4222a) {
            case 0:
                ((m1) this.f4224c).c();
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
