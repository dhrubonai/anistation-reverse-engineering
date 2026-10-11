package w8;

import android.view.View;
import android.view.ViewPropertyAnimator;

/* loaded from: classes.dex */
public final /* synthetic */ class g implements View.OnFocusChangeListener {
    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z9) {
        float f10;
        view.animate().cancel();
        ViewPropertyAnimator animate = view.animate();
        float f11 = 1.08f;
        if (z9) {
            f10 = 1.08f;
        } else {
            f10 = 1.0f;
        }
        ViewPropertyAnimator scaleX = animate.scaleX(f10);
        if (!z9) {
            f11 = 1.0f;
        }
        scaleX.scaleY(f11).setDuration(150L).start();
    }
}
