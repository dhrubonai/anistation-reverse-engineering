package androidx.appcompat.widget;

import android.view.MotionEvent;
import android.view.View;

/* loaded from: classes.dex */
public final class n2 implements View.OnTouchListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ o2 f579a;

    public n2(o2 o2Var) {
        this.f579a = o2Var;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        g0 g0Var;
        int action = motionEvent.getAction();
        int x9 = (int) motionEvent.getX();
        int y9 = (int) motionEvent.getY();
        o2 o2Var = this.f579a;
        if (action == 0 && (g0Var = o2Var.Q) != null && g0Var.isShowing() && x9 >= 0) {
            g0 g0Var2 = o2Var.Q;
            if (x9 < g0Var2.getWidth() && y9 >= 0 && y9 < g0Var2.getHeight()) {
                o2Var.M.postDelayed(o2Var.I, 250L);
                return false;
            }
        }
        if (action == 1) {
            o2Var.M.removeCallbacks(o2Var.I);
            return false;
        }
        return false;
    }
}
