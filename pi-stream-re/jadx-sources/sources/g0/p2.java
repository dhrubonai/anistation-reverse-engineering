package g0;

import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;

/* loaded from: classes.dex */
public final class p2 extends j6.e {

    /* renamed from: b, reason: collision with root package name */
    public final WindowInsetsController f4238b;

    /* renamed from: c, reason: collision with root package name */
    public final Window f4239c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p2(Window window) {
        super(5);
        WindowInsetsController insetsController;
        insetsController = window.getInsetsController();
        this.f4238b = insetsController;
        this.f4239c = window;
    }

    @Override // j6.e
    public final void x(boolean z9) {
        WindowInsetsController windowInsetsController = this.f4238b;
        Window window = this.f4239c;
        if (z9) {
            if (window != null) {
                View decorView = window.getDecorView();
                decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 16);
            }
            windowInsetsController.setSystemBarsAppearance(16, 16);
            return;
        }
        if (window != null) {
            View decorView2 = window.getDecorView();
            decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() & (-17));
        }
        windowInsetsController.setSystemBarsAppearance(0, 16);
    }

    @Override // j6.e
    public final void y(boolean z9) {
        WindowInsetsController windowInsetsController = this.f4238b;
        Window window = this.f4239c;
        if (z9) {
            if (window != null) {
                View decorView = window.getDecorView();
                decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 8192);
            }
            windowInsetsController.setSystemBarsAppearance(8, 8);
            return;
        }
        if (window != null) {
            View decorView2 = window.getDecorView();
            decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() & (-8193));
        }
        windowInsetsController.setSystemBarsAppearance(0, 8);
    }
}
