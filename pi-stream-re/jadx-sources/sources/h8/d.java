package h8;

import android.view.animation.Animation;

/* loaded from: classes.dex */
public final class d implements Animation.AnimationListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e f5032a;

    public d(e eVar) {
        this.f5032a = eVar;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        e eVar = this.f5032a;
        eVar.f5034b.setVisibility(8);
        eVar.f5034b.setAnimation(null);
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
    }
}
