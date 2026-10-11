package g0;

import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;

/* loaded from: classes.dex */
public abstract class w1 {

    /* renamed from: a, reason: collision with root package name */
    public final int f4266a;

    /* renamed from: b, reason: collision with root package name */
    public float f4267b;

    /* renamed from: c, reason: collision with root package name */
    public final Interpolator f4268c;

    /* renamed from: d, reason: collision with root package name */
    public final long f4269d;

    public w1(int i10, DecelerateInterpolator decelerateInterpolator, long j4) {
        this.f4266a = i10;
        this.f4268c = decelerateInterpolator;
        this.f4269d = j4;
    }

    public long a() {
        return this.f4269d;
    }

    public float b() {
        Interpolator interpolator = this.f4268c;
        if (interpolator != null) {
            return interpolator.getInterpolation(this.f4267b);
        }
        return this.f4267b;
    }

    public int c() {
        return this.f4266a;
    }

    public void d(float f10) {
        this.f4267b = f10;
    }
}
