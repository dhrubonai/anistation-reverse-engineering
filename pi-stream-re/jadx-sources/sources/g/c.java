package g;

import android.animation.ObjectAnimator;
import android.graphics.drawable.AnimationDrawable;

/* loaded from: classes.dex */
public final class c extends q6.g {

    /* renamed from: c, reason: collision with root package name */
    public final ObjectAnimator f4121c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f4122d;

    public c(AnimationDrawable animationDrawable, boolean z9, boolean z10) {
        super(0);
        int i10;
        int numberOfFrames = animationDrawable.getNumberOfFrames();
        if (z9) {
            i10 = numberOfFrames - 1;
        } else {
            i10 = 0;
        }
        int i11 = z9 ? 0 : numberOfFrames - 1;
        d dVar = new d(animationDrawable, z9);
        ObjectAnimator ofInt = ObjectAnimator.ofInt(animationDrawable, "currentIndex", i10, i11);
        h.a.a(ofInt, true);
        ofInt.setDuration(dVar.f4125c);
        ofInt.setInterpolator(dVar);
        this.f4122d = z10;
        this.f4121c = ofInt;
    }

    @Override // q6.g
    public final boolean f() {
        return this.f4122d;
    }

    @Override // q6.g
    public final void f0() {
        this.f4121c.reverse();
    }

    @Override // q6.g
    public final void m0() {
        this.f4121c.start();
    }

    @Override // q6.g
    public final void n0() {
        this.f4121c.cancel();
    }
}
