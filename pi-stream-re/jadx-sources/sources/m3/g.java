package m3;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* loaded from: classes.dex */
public final class g extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7218a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h f7219b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ViewPropertyAnimator f7220c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ View f7221d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ j f7222e;

    public /* synthetic */ g(j jVar, h hVar, ViewPropertyAnimator viewPropertyAnimator, View view, int i10) {
        this.f7218a = i10;
        this.f7222e = jVar;
        this.f7219b = hVar;
        this.f7220c = viewPropertyAnimator;
        this.f7221d = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        int i10 = this.f7218a;
        j jVar = this.f7222e;
        h hVar = this.f7219b;
        View view = this.f7221d;
        ViewPropertyAnimator viewPropertyAnimator = this.f7220c;
        switch (i10) {
            case 0:
                viewPropertyAnimator.setListener(null);
                view.setAlpha(1.0f);
                view.setTranslationX(0.0f);
                view.setTranslationY(0.0f);
                jVar.c(hVar.f7224a);
                jVar.f7265r.remove(hVar.f7224a);
                jVar.i();
                return;
            default:
                viewPropertyAnimator.setListener(null);
                view.setAlpha(1.0f);
                view.setTranslationX(0.0f);
                view.setTranslationY(0.0f);
                jVar.c(hVar.f7225b);
                jVar.f7265r.remove(hVar.f7225b);
                jVar.i();
                return;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        int i10 = this.f7218a;
        j jVar = this.f7222e;
        h hVar = this.f7219b;
        switch (i10) {
            case 0:
                a1 a1Var = hVar.f7224a;
                jVar.getClass();
                return;
            default:
                a1 a1Var2 = hVar.f7225b;
                jVar.getClass();
                return;
        }
    }
}
