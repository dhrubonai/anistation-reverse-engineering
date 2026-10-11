package b2;

import android.graphics.Insets;
import android.view.WindowInsetsAnimation;
import android.view.animation.DecelerateInterpolator;

/* loaded from: classes.dex */
public abstract /* synthetic */ class t {
    public static /* synthetic */ WindowInsetsAnimation.Bounds i(Insets insets, Insets insets2) {
        return new WindowInsetsAnimation.Bounds(insets, insets2);
    }

    public static /* synthetic */ WindowInsetsAnimation j(int i10, DecelerateInterpolator decelerateInterpolator, long j4) {
        return new WindowInsetsAnimation(i10, decelerateInterpolator, j4);
    }

    public static /* bridge */ /* synthetic */ WindowInsetsAnimation k(Object obj) {
        return (WindowInsetsAnimation) obj;
    }

    public static /* synthetic */ void m() {
    }
}
