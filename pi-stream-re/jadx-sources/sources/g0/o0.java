package g0;

import android.view.View;
import android.view.WindowInsets;

/* loaded from: classes.dex */
public abstract class o0 {
    public static k2 a(View view) {
        WindowInsets rootWindowInsets = view.getRootWindowInsets();
        if (rootWindowInsets == null) {
            return null;
        }
        k2 h10 = k2.h(null, rootWindowInsets);
        i2 i2Var = h10.f4227a;
        i2Var.p(h10);
        i2Var.d(view.getRootView());
        return h10;
    }

    public static int b(View view) {
        return view.getScrollIndicators();
    }

    public static void c(View view, int i10) {
        view.setScrollIndicators(i10);
    }

    public static void d(View view, int i10, int i11) {
        view.setScrollIndicators(i10, i11);
    }
}
