package t5;

import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final LinearInterpolator f10034a = new LinearInterpolator();

    /* renamed from: b, reason: collision with root package name */
    public static final x0.b f10035b = new x0.b();

    /* renamed from: c, reason: collision with root package name */
    public static final x0.a f10036c = new x0.a();

    /* renamed from: d, reason: collision with root package name */
    public static final x0.c f10037d = new x0.c();

    static {
        new DecelerateInterpolator();
    }

    public static float a(float f10, float f11, float f12, float f13, float f14) {
        if (f14 <= f12) {
            return f10;
        }
        if (f14 >= f13) {
            return f11;
        }
        return ((f11 - f10) * ((f14 - f12) / (f13 - f12))) + f10;
    }
}
