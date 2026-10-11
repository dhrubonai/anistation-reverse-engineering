package androidx.fragment.app;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes.dex */
public final class d extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ViewGroup f855a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f856b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f857c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ m1 f858d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ j f859e;

    public d(ViewGroup viewGroup, View view, boolean z9, m1 m1Var, j jVar) {
        this.f855a = viewGroup;
        this.f856b = view;
        this.f857c = z9;
        this.f858d = m1Var;
        this.f859e = jVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        ViewGroup viewGroup = this.f855a;
        View view = this.f856b;
        viewGroup.endViewTransition(view);
        boolean z9 = this.f857c;
        m1 m1Var = this.f858d;
        if (z9) {
            a3.g.b(m1Var.f932a, view);
        }
        this.f859e.b();
        if (s0.H(2)) {
            Log.v("FragmentManager", "Animator from operation " + m1Var + " has ended.");
        }
    }
}
