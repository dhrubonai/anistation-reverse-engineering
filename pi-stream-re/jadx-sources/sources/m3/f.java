package m3;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* loaded from: classes.dex */
public final class f extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ a1 f7205a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f7206b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ View f7207c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f7208d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ViewPropertyAnimator f7209e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ j f7210f;

    public f(j jVar, a1 a1Var, int i10, View view, int i11, ViewPropertyAnimator viewPropertyAnimator) {
        this.f7210f = jVar;
        this.f7205a = a1Var;
        this.f7206b = i10;
        this.f7207c = view;
        this.f7208d = i11;
        this.f7209e = viewPropertyAnimator;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        int i10 = this.f7206b;
        View view = this.f7207c;
        if (i10 != 0) {
            view.setTranslationX(0.0f);
        }
        if (this.f7208d != 0) {
            view.setTranslationY(0.0f);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.f7209e.setListener(null);
        j jVar = this.f7210f;
        a1 a1Var = this.f7205a;
        jVar.c(a1Var);
        jVar.f7263p.remove(a1Var);
        jVar.i();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.f7210f.getClass();
    }
}
