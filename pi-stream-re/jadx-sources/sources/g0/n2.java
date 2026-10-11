package g0;

import android.view.View;
import android.view.Window;

/* loaded from: classes.dex */
public final class n2 extends m2 {
    @Override // j6.e
    public final void x(boolean z9) {
        Window window = this.f4229b;
        if (z9) {
            window.clearFlags(134217728);
            window.addFlags(Integer.MIN_VALUE);
            View decorView = window.getDecorView();
            decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 16);
            return;
        }
        View decorView2 = window.getDecorView();
        decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() & (-17));
    }
}
