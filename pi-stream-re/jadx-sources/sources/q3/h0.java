package q3;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes.dex */
public final class h0 extends AnimatorListenerAdapter implements r {

    /* renamed from: a, reason: collision with root package name */
    public final View f9146a;

    /* renamed from: b, reason: collision with root package name */
    public final int f9147b;

    /* renamed from: c, reason: collision with root package name */
    public final ViewGroup f9148c;

    /* renamed from: e, reason: collision with root package name */
    public boolean f9150e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f9151f = false;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f9149d = true;

    public h0(View view, int i10) {
        this.f9146a = view;
        this.f9147b = i10;
        this.f9148c = (ViewGroup) view.getParent();
        f(true);
    }

    @Override // q3.r
    public final void a() {
        f(false);
    }

    @Override // q3.r
    public final void b() {
        f(true);
    }

    @Override // q3.r
    public final void c(s sVar) {
        if (!this.f9151f) {
            a0.f9121a.v(this.f9146a, this.f9147b);
            ViewGroup viewGroup = this.f9148c;
            if (viewGroup != null) {
                viewGroup.invalidate();
            }
        }
        f(false);
        sVar.w(this);
    }

    @Override // q3.r
    public final void d() {
    }

    @Override // q3.r
    public final void e(s sVar) {
    }

    public final void f(boolean z9) {
        ViewGroup viewGroup;
        if (this.f9149d && this.f9150e != z9 && (viewGroup = this.f9148c) != null) {
            this.f9150e = z9;
            p7.a0.X(viewGroup, z9);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.f9151f = true;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        if (!this.f9151f) {
            a0.f9121a.v(this.f9146a, this.f9147b);
            ViewGroup viewGroup = this.f9148c;
            if (viewGroup != null) {
                viewGroup.invalidate();
            }
        }
        f(false);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
    public final void onAnimationPause(Animator animator) {
        if (!this.f9151f) {
            a0.f9121a.v(this.f9146a, this.f9147b);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
    public final void onAnimationResume(Animator animator) {
        if (!this.f9151f) {
            a0.f9121a.v(this.f9146a, 0);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }
}
