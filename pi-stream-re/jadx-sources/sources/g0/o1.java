package g0;

import android.view.View;
import android.view.Window;

/* loaded from: classes.dex */
public abstract class o1 {
    public static void a(Window window, boolean z9) {
        int i10;
        View decorView = window.getDecorView();
        int systemUiVisibility = decorView.getSystemUiVisibility();
        if (z9) {
            i10 = systemUiVisibility & (-1793);
        } else {
            i10 = systemUiVisibility | 1792;
        }
        decorView.setSystemUiVisibility(i10);
    }
}
