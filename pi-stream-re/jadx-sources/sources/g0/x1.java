package g0;

import android.os.Build;
import android.view.WindowInsetsAnimation;
import android.view.animation.DecelerateInterpolator;

/* loaded from: classes.dex */
public final class x1 {

    /* renamed from: a, reason: collision with root package name */
    public final w1 f4276a;

    public x1(int i10, DecelerateInterpolator decelerateInterpolator, long j4) {
        if (Build.VERSION.SDK_INT >= 30) {
            this.f4276a = new v1(b2.t.j(i10, decelerateInterpolator, j4));
        } else {
            this.f4276a = new t1(i10, decelerateInterpolator, j4);
        }
    }

    public x1(WindowInsetsAnimation windowInsetsAnimation) {
        this(0, null, 0L);
        if (Build.VERSION.SDK_INT >= 30) {
            this.f4276a = new v1(windowInsetsAnimation);
        }
    }
}
