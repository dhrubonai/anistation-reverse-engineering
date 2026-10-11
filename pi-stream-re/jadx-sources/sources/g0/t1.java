package g0;

import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import java.util.List;
import msr.pistream.app.R;

/* loaded from: classes.dex */
public final class t1 extends w1 {
    public static void e(View view) {
        w5.d j4 = j(view);
        if (j4 != null) {
            j4.f11006b.setTranslationY(0.0f);
            return;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                e(viewGroup.getChildAt(i10));
            }
        }
    }

    public static void f(View view, WindowInsets windowInsets, boolean z9) {
        w5.d j4 = j(view);
        if (j4 != null) {
            j4.f11005a = windowInsets;
            if (!z9) {
                View view2 = j4.f11006b;
                int[] iArr = j4.f11009e;
                view2.getLocationOnScreen(iArr);
                z9 = true;
                j4.f11007c = iArr[1];
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                f(viewGroup.getChildAt(i10), windowInsets, z9);
            }
        }
    }

    public static void g(View view, k2 k2Var, List list) {
        w5.d j4 = j(view);
        if (j4 != null) {
            j4.a(k2Var, list);
            return;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                g(viewGroup.getChildAt(i10), k2Var, list);
            }
        }
    }

    public static void h(View view, androidx.appcompat.widget.a0 a0Var) {
        w5.d j4 = j(view);
        if (j4 != null) {
            View view2 = j4.f11006b;
            int[] iArr = j4.f11009e;
            view2.getLocationOnScreen(iArr);
            int i10 = j4.f11007c - iArr[1];
            j4.f11008d = i10;
            view2.setTranslationY(i10);
            return;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i11 = 0; i11 < viewGroup.getChildCount(); i11++) {
                h(viewGroup.getChildAt(i11), a0Var);
            }
        }
    }

    public static WindowInsets i(View view, WindowInsets windowInsets) {
        if (view.getTag(R.id.tag_on_apply_window_listener) != null) {
            return windowInsets;
        }
        return view.onApplyWindowInsets(windowInsets);
    }

    public static w5.d j(View view) {
        Object tag = view.getTag(R.id.tag_window_insets_animation_callback);
        if (tag instanceof s1) {
            return ((s1) tag).f4253a;
        }
        return null;
    }
}
