package e6;

import android.view.View;
import g0.l0;
import g0.y0;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class k implements View.OnAttachStateChangeListener {
    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        view.removeOnAttachStateChangeListener(this);
        WeakHashMap weakHashMap = y0.f4277a;
        l0.c(view);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }
}
