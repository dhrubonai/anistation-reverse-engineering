package androidx.fragment.app;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;

/* loaded from: classes.dex */
public final class f implements Animation.AnimationListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ m1 f877a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ViewGroup f878b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ View f879c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ j f880d;

    public f(View view, ViewGroup viewGroup, j jVar, m1 m1Var) {
        this.f877a = m1Var;
        this.f878b = viewGroup;
        this.f879c = view;
        this.f880d = jVar;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        this.f878b.post(new e(this, 0));
        if (s0.H(2)) {
            Log.v("FragmentManager", "Animation from operation " + this.f877a + " has ended.");
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
        if (s0.H(2)) {
            Log.v("FragmentManager", "Animation from operation " + this.f877a + " has reached onAnimationStart.");
        }
    }
}
