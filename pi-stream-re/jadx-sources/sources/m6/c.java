package m6;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* loaded from: classes.dex */
public final class c extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7457a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f7458b;

    public /* synthetic */ c(d dVar, int i10) {
        this.f7457a = i10;
        this.f7458b = dVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.f7457a) {
            case 1:
                this.f7458b.f7497b.g(false);
                return;
            default:
                super.onAnimationEnd(animator);
                return;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.f7457a) {
            case 0:
                this.f7458b.f7497b.g(true);
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
