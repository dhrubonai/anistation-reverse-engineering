package m3;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* loaded from: classes.dex */
public final class e extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7197a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a1 f7198b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ View f7199c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ViewPropertyAnimator f7200d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ j f7201e;

    public e(j jVar, a1 a1Var, ViewPropertyAnimator viewPropertyAnimator, View view) {
        this.f7201e = jVar;
        this.f7198b = a1Var;
        this.f7200d = viewPropertyAnimator;
        this.f7199c = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        switch (this.f7197a) {
            case 1:
                this.f7199c.setAlpha(1.0f);
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        int i10 = this.f7197a;
        a1 a1Var = this.f7198b;
        j jVar = this.f7201e;
        ViewPropertyAnimator viewPropertyAnimator = this.f7200d;
        switch (i10) {
            case 0:
                viewPropertyAnimator.setListener(null);
                this.f7199c.setAlpha(1.0f);
                jVar.c(a1Var);
                jVar.f7264q.remove(a1Var);
                jVar.i();
                return;
            default:
                viewPropertyAnimator.setListener(null);
                jVar.c(a1Var);
                jVar.o.remove(a1Var);
                jVar.i();
                return;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        int i10 = this.f7197a;
        j jVar = this.f7201e;
        switch (i10) {
            case 0:
                jVar.getClass();
                return;
            default:
                jVar.getClass();
                return;
        }
    }

    public e(j jVar, a1 a1Var, View view, ViewPropertyAnimator viewPropertyAnimator) {
        this.f7201e = jVar;
        this.f7198b = a1Var;
        this.f7199c = view;
        this.f7200d = viewPropertyAnimator;
    }
}
