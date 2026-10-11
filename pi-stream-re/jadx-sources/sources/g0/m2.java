package g0;

import android.view.View;
import android.view.Window;

/* loaded from: classes.dex */
public class m2 extends l2 {
    @Override // j6.e
    public final void y(boolean z9) {
        Window window = this.f4229b;
        if (z9) {
            window.clearFlags(67108864);
            window.addFlags(Integer.MIN_VALUE);
            View decorView = window.getDecorView();
            decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 8192);
            return;
        }
        View decorView2 = window.getDecorView();
        decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() & (-8193));
    }
}
