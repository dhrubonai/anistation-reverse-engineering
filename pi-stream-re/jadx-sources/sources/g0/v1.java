package g0;

import android.view.WindowInsetsAnimation;

/* loaded from: classes.dex */
public final class v1 extends w1 {

    /* renamed from: e, reason: collision with root package name */
    public final WindowInsetsAnimation f4265e;

    public v1(WindowInsetsAnimation windowInsetsAnimation) {
        super(0, null, 0L);
        this.f4265e = windowInsetsAnimation;
    }

    @Override // g0.w1
    public final long a() {
        long durationMillis;
        durationMillis = this.f4265e.getDurationMillis();
        return durationMillis;
    }

    @Override // g0.w1
    public final float b() {
        float interpolatedFraction;
        interpolatedFraction = this.f4265e.getInterpolatedFraction();
        return interpolatedFraction;
    }

    @Override // g0.w1
    public final int c() {
        int typeMask;
        typeMask = this.f4265e.getTypeMask();
        return typeMask;
    }

    @Override // g0.w1
    public final void d(float f10) {
        this.f4265e.setFraction(f10);
    }
}
