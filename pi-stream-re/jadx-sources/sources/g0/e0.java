package g0;

import android.os.Build;
import android.view.View;
import android.view.ViewTreeObserver;
import java.util.Map;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class e0 implements ViewTreeObserver.OnGlobalLayoutListener, View.OnAttachStateChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final WeakHashMap f4189a = new WeakHashMap();

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        boolean z9;
        int i10;
        if (Build.VERSION.SDK_INT < 28) {
            WeakHashMap weakHashMap = this.f4189a;
            for (Map.Entry entry : weakHashMap.entrySet()) {
                View view = (View) entry.getKey();
                boolean booleanValue = ((Boolean) entry.getValue()).booleanValue();
                if (view.isShown() && view.getWindowVisibility() == 0) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                if (booleanValue != z9) {
                    if (z9) {
                        i10 = 16;
                    } else {
                        i10 = 32;
                    }
                    y0.g(view, i10);
                    weakHashMap.put(view, Boolean.valueOf(z9));
                }
            }
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        view.getViewTreeObserver().addOnGlobalLayoutListener(this);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }
}
