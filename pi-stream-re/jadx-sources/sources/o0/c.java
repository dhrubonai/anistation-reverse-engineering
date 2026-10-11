package o0;

import android.view.animation.Interpolator;

/* loaded from: classes.dex */
public final class c implements Interpolator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8078a;

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f10) {
        switch (this.f8078a) {
            case 0:
            default:
                float f11 = f10 - 1.0f;
                return (f11 * f11 * f11 * f11 * f11) + 1.0f;
        }
    }
}
