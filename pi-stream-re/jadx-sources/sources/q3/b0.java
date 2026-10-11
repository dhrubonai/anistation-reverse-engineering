package q3;

import android.view.View;

/* loaded from: classes.dex */
public abstract class b0 extends w1.o {

    /* renamed from: d, reason: collision with root package name */
    public static boolean f9124d = true;

    public b0() {
        super(16);
    }

    public float x(View view) {
        float transitionAlpha;
        if (f9124d) {
            try {
                transitionAlpha = view.getTransitionAlpha();
                return transitionAlpha;
            } catch (NoSuchMethodError unused) {
                f9124d = false;
            }
        }
        return view.getAlpha();
    }

    public void y(View view, float f10) {
        if (f9124d) {
            try {
                view.setTransitionAlpha(f10);
                return;
            } catch (NoSuchMethodError unused) {
                f9124d = false;
            }
        }
        view.setAlpha(f10);
    }
}
