package h8;

import android.view.ViewTreeObserver;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import msr.pistream.app.R;
import msr.pistream.app.ui.detail.DetailActivity;

/* loaded from: classes.dex */
public final class e implements ViewTreeObserver.OnPreDrawListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ FrameLayout f5033a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ProgressBar f5034b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ DetailActivity f5035c;

    public e(DetailActivity detailActivity, FrameLayout frameLayout, ProgressBar progressBar) {
        this.f5035c = detailActivity;
        this.f5033a = frameLayout;
        this.f5034b = progressBar;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        this.f5033a.getViewTreeObserver().removeOnPreDrawListener(this);
        Animation loadAnimation = AnimationUtils.loadAnimation(this.f5035c, R.anim.fade_out);
        loadAnimation.setAnimationListener(new d(this));
        this.f5034b.startAnimation(loadAnimation);
        return true;
    }
}
