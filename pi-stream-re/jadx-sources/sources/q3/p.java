package q3;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* loaded from: classes.dex */
public final class p extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f9171a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f9172b;

    public /* synthetic */ p(Object obj, n.e eVar) {
        this.f9172b = obj;
        this.f9171a = eVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        ((n.e) this.f9171a).remove(animator);
        ((s) this.f9172b).D.remove(animator);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        ((s) this.f9172b).D.add(animator);
    }
}
