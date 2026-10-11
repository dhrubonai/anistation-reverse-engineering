package j3;

import android.content.Context;
import android.view.MotionEvent;
import android.webkit.WebView;

/* loaded from: classes.dex */
public final class s0 extends WebView {
    public s0(Context context) {
        super(context, null);
    }

    @Override // android.webkit.WebView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return false;
    }

    @Override // android.view.View
    public final boolean performClick() {
        super.performClick();
        return false;
    }
}
