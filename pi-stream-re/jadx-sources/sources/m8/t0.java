package m8;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.widget.LinearLayout;

/* loaded from: classes.dex */
public final class t0 extends AnimatorListenerAdapter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean[] f7708a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Boolean f7709b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ LinearLayout f7710c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Runnable f7711d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ View[] f7712e;

    public t0(boolean[] zArr, Boolean bool, LinearLayout linearLayout, Runnable runnable, View[] viewArr) {
        this.f7708a = zArr;
        this.f7709b = bool;
        this.f7710c = linearLayout;
        this.f7711d = runnable;
        this.f7712e = viewArr;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        int i10;
        this.f7708a[0] = false;
        Boolean bool = this.f7709b;
        if (!bool.booleanValue()) {
            this.f7710c.setVisibility(8);
        } else {
            this.f7711d.run();
        }
        View[] viewArr = this.f7712e;
        for (View view : viewArr) {
            if (bool.booleanValue()) {
                i10 = 4;
            } else {
                i10 = 0;
            }
            view.setVisibility(i10);
        }
        if (!bool.booleanValue()) {
            for (View view2 : viewArr) {
                view2.setAlpha(1.0f);
            }
        }
    }
}
