package c1;

/* loaded from: classes.dex */
public final class t0 {

    /* renamed from: d, reason: collision with root package name */
    public static final t0 f1893d = new t0(1.0f, 1.0f);

    /* renamed from: a, reason: collision with root package name */
    public final float f1894a;

    /* renamed from: b, reason: collision with root package name */
    public final float f1895b;

    /* renamed from: c, reason: collision with root package name */
    public final int f1896c;

    static {
        f1.b0.J(0);
        f1.b0.J(1);
    }

    public t0(float f10, float f11) {
        boolean z9;
        if (f10 > 0.0f) {
            z9 = true;
        } else {
            z9 = false;
        }
        w7.b.g(z9);
        w7.b.g(f11 > 0.0f);
        this.f1894a = f10;
        this.f1895b = f11;
        this.f1896c = Math.round(f10 * 1000.0f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || t0.class != obj.getClass()) {
            return false;
        }
        t0 t0Var = (t0) obj;
        if (this.f1894a == t0Var.f1894a && this.f1895b == t0Var.f1895b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToRawIntBits(this.f1895b) + ((Float.floatToRawIntBits(this.f1894a) + 527) * 31);
    }

    public final String toString() {
        return f1.b0.m("PlaybackParameters(speed=%.2f, pitch=%.2f)", Float.valueOf(this.f1894a), Float.valueOf(this.f1895b));
    }
}
