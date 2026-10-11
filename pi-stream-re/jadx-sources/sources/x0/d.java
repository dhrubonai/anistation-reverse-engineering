package x0;

import android.view.animation.Interpolator;

/* loaded from: classes.dex */
public abstract class d implements Interpolator {

    /* renamed from: a, reason: collision with root package name */
    public final float[] f11076a;

    /* renamed from: b, reason: collision with root package name */
    public final float f11077b;

    public d(float[] fArr) {
        this.f11076a = fArr;
        this.f11077b = 1.0f / (fArr.length - 1);
    }

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f10) {
        if (f10 >= 1.0f) {
            return 1.0f;
        }
        if (f10 <= 0.0f) {
            return 0.0f;
        }
        float[] fArr = this.f11076a;
        int min = Math.min((int) ((fArr.length - 1) * f10), fArr.length - 2);
        float f11 = this.f11077b;
        float f12 = (f10 - (min * f11)) / f11;
        float f13 = fArr[min];
        return ((fArr[min + 1] - f13) * f12) + f13;
    }
}
