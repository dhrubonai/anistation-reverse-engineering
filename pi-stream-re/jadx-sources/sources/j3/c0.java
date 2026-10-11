package j3;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* loaded from: classes.dex */
public final class c0 extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5953a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x f5954b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ d0 f5955c;

    public /* synthetic */ c0(d0 d0Var, x xVar, int i10) {
        this.f5953a = i10;
        this.f5955c = d0Var;
        this.f5954b = xVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        int i10 = this.f5953a;
        x xVar = this.f5954b;
        d0 d0Var = this.f5955c;
        switch (i10) {
            case 0:
                d0Var.i(1);
                if (d0Var.B) {
                    xVar.post(d0Var.f5980s);
                    d0Var.B = false;
                    return;
                }
                return;
            case 1:
                d0Var.i(2);
                if (d0Var.B) {
                    xVar.post(d0Var.f5980s);
                    d0Var.B = false;
                    return;
                }
                return;
            default:
                d0Var.i(2);
                if (d0Var.B) {
                    xVar.post(d0Var.f5980s);
                    d0Var.B = false;
                    return;
                }
                return;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        int i10 = this.f5953a;
        d0 d0Var = this.f5955c;
        switch (i10) {
            case 0:
                d0Var.i(3);
                return;
            case 1:
                d0Var.i(3);
                return;
            default:
                d0Var.i(3);
                return;
        }
    }
}
