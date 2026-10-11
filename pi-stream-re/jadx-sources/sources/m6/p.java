package m6;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.TextView;
import androidx.appcompat.widget.i1;

/* loaded from: classes.dex */
public final class p extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7500a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TextView f7501b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f7502c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ TextView f7503d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r f7504e;

    public p(r rVar, int i10, TextView textView, int i11, TextView textView2) {
        this.f7504e = rVar;
        this.f7500a = i10;
        this.f7501b = textView;
        this.f7502c = i11;
        this.f7503d = textView2;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        i1 i1Var;
        int i10 = this.f7500a;
        r rVar = this.f7504e;
        rVar.f7519n = i10;
        rVar.f7517l = null;
        TextView textView = this.f7501b;
        if (textView != null) {
            textView.setVisibility(4);
            if (this.f7502c == 1 && (i1Var = rVar.f7522r) != null) {
                i1Var.setText((CharSequence) null);
            }
        }
        TextView textView2 = this.f7503d;
        if (textView2 != null) {
            textView2.setTranslationY(0.0f);
            textView2.setAlpha(1.0f);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        TextView textView = this.f7503d;
        if (textView != null) {
            textView.setVisibility(0);
            textView.setAlpha(0.0f);
        }
    }
}
