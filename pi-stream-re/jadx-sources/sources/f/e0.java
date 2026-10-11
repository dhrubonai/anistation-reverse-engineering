package f;

import android.view.KeyEvent;
import android.view.MotionEvent;
import androidx.appcompat.widget.ContentFrameLayout;

/* loaded from: classes.dex */
public final class e0 extends ContentFrameLayout {

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ g0 f3660z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(g0 g0Var, i.e eVar) {
        super(eVar, null);
        this.f3660z = g0Var;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (!this.f3660z.v(keyEvent) && !super.dispatchKeyEvent(keyEvent)) {
            return false;
        }
        return true;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z9;
        if (motionEvent.getAction() == 0) {
            int x9 = (int) motionEvent.getX();
            int y9 = (int) motionEvent.getY();
            if (x9 >= -5 && y9 >= -5 && x9 <= getWidth() + 5 && y9 <= getHeight() + 5) {
                z9 = false;
            } else {
                z9 = true;
            }
            if (z9) {
                g0 g0Var = this.f3660z;
                g0Var.t(g0Var.B(0), true);
                return true;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public final void setBackgroundResource(int i10) {
        setBackgroundDrawable(w7.b.G(getContext(), i10));
    }
}
