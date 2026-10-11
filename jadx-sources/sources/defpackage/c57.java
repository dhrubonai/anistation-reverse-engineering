package defpackage;

import android.os.Build;
import android.view.View;
import android.view.animation.Interpolator;
import android.view.animation.PathInterpolator;
import com.anistation.android.R;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class c57 {
    public b57 a;

    public c57(int i, Interpolator interpolator, long j) {
        if (Build.VERSION.SDK_INT >= 30) {
            this.a = new a57(pu5.i(i, interpolator, j));
        } else {
            this.a = new b57(i, interpolator, j);
        }
    }

    public static void a(View view, po0 po0Var) {
        View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = null;
        z47 z47Var = null;
        if (Build.VERSION.SDK_INT >= 30) {
            if (po0Var != null) {
                z47Var = new z47(po0Var);
            }
            view.setWindowInsetsAnimationCallback(z47Var);
            return;
        }
        PathInterpolator pathInterpolator = y47.e;
        if (po0Var != null) {
            onApplyWindowInsetsListener = new x47(view, po0Var);
        }
        view.setTag(R.id.tag_window_insets_animation_callback, onApplyWindowInsetsListener);
        if (view.getTag(R.id.tag_compat_insets_dispatch) == null && view.getTag(R.id.tag_on_apply_window_listener) == null) {
            view.setOnApplyWindowInsetsListener(onApplyWindowInsetsListener);
        }
    }
}
