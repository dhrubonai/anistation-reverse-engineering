package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.PathInterpolator;
import com.anistation.android.R;
import java.util.List;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class y47 extends b57 {
    public static final PathInterpolator e = new PathInterpolator(0.0f, 1.1f, 0.0f, 1.0f);
    public static final n12 f = new n12();
    public static final DecelerateInterpolator g = new DecelerateInterpolator(1.5f);
    public static final AccelerateInterpolator h = new AccelerateInterpolator(1.5f);

    public static void f(c57 c57Var, View view) {
        po0 j = j(view);
        if (j != null) {
            j.d(c57Var);
            if (j.x == 0) {
                return;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                f(c57Var, viewGroup.getChildAt(i));
            }
        }
    }

    public static void g(View view, c57 c57Var, v57 v57Var, boolean z) {
        po0 j = j(view);
        if (j != null) {
            j.y = v57Var;
            if (!z) {
                j.e(c57Var);
                if (j.x == 0) {
                    z = true;
                } else {
                    z = false;
                }
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                g(viewGroup.getChildAt(i), c57Var, v57Var, z);
            }
        }
    }

    public static void h(View view, v57 v57Var, List list) {
        po0 j = j(view);
        if (j != null) {
            v57Var = j.f(v57Var, list);
            if (j.x == 0) {
                return;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                h(viewGroup.getChildAt(i), v57Var, list);
            }
        }
    }

    public static void i(View view, c57 c57Var, l33 l33Var) {
        po0 j = j(view);
        if (j != null) {
            j.g(c57Var, l33Var);
            if (j.x == 0) {
                return;
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                i(viewGroup.getChildAt(i), c57Var, l33Var);
            }
        }
    }

    public static po0 j(View view) {
        Object tag = view.getTag(R.id.tag_window_insets_animation_callback);
        if (tag instanceof x47) {
            return ((x47) tag).a;
        }
        return null;
    }
}
