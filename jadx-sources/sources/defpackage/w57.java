package defpackage;

import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;
import com.google.protobuf.CodedOutputStream;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public class w57 extends iv5 {
    public final /* synthetic */ byte a;
    public final Window b;
    public final Object c;

    public w57(Window window, fq3 fq3Var, byte b) {
        WindowInsetsController insetsController;
        this.a = b;
        switch (b) {
            case 1:
                insetsController = window.getInsetsController();
                this.c = insetsController;
                this.b = window;
                return;
            default:
                this.b = window;
                this.c = fq3Var;
                return;
        }
    }

    @Override // defpackage.iv5
    public final void c(int i) {
        byte b = this.a;
        Object obj = this.c;
        switch (b) {
            case 0:
                for (int i2 = 1; i2 <= 512; i2 <<= 1) {
                    if ((i & i2) != 0) {
                        if (i2 != 1) {
                            if (i2 != 2) {
                                if (i2 == 8) {
                                    ((sn3) ((fq3) obj).y).I();
                                }
                            } else {
                                q(2);
                            }
                        } else {
                            q(4);
                        }
                    }
                }
                return;
            default:
                ((WindowInsetsController) obj).hide(i & (-9));
                return;
        }
    }

    @Override // defpackage.iv5
    public void e(boolean z) {
        byte b = this.a;
        Window window = this.b;
        switch (b) {
            case 0:
                if (z) {
                    window.clearFlags(134217728);
                    window.addFlags(Integer.MIN_VALUE);
                    q(16);
                    return;
                }
                r(16);
                return;
            default:
                if (window != null) {
                    if (z) {
                        View decorView = window.getDecorView();
                        decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 16);
                        return;
                    } else {
                        r(16);
                        return;
                    }
                }
                WindowInsetsController windowInsetsController = (WindowInsetsController) this.c;
                if (z) {
                    windowInsetsController.setSystemBarsAppearance(16, 16);
                    return;
                } else {
                    windowInsetsController.setSystemBarsAppearance(0, 16);
                    return;
                }
        }
    }

    @Override // defpackage.iv5
    public void f(boolean z) {
        byte b = this.a;
        Window window = this.b;
        switch (b) {
            case 0:
                if (z) {
                    window.clearFlags(67108864);
                    window.addFlags(Integer.MIN_VALUE);
                    q(8192);
                    return;
                }
                r(8192);
                return;
            default:
                if (window != null) {
                    if (z) {
                        View decorView = window.getDecorView();
                        decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 8192);
                        return;
                    } else {
                        r(8192);
                        return;
                    }
                }
                WindowInsetsController windowInsetsController = (WindowInsetsController) this.c;
                if (z) {
                    windowInsetsController.setSystemBarsAppearance(8, 8);
                    return;
                } else {
                    windowInsetsController.setSystemBarsAppearance(0, 8);
                    return;
                }
        }
    }

    @Override // defpackage.iv5
    public void g() {
        byte b = this.a;
        Window window = this.b;
        switch (b) {
            case 0:
                window.getDecorView().setTag(356039078, 2);
                r(2048);
                q(CodedOutputStream.DEFAULT_BUFFER_SIZE);
                return;
            default:
                if (window == null) {
                    ((WindowInsetsController) this.c).setSystemBarsBehavior(2);
                    return;
                }
                window.getDecorView().setTag(356039078, 2);
                r(2048);
                View decorView = window.getDecorView();
                decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | CodedOutputStream.DEFAULT_BUFFER_SIZE);
                return;
        }
    }

    @Override // defpackage.iv5
    public final void h() {
        byte b = this.a;
        Object obj = this.c;
        switch (b) {
            case 0:
                for (int i = 1; i <= 512; i <<= 1) {
                    if ((519 & i) != 0) {
                        if (i != 1) {
                            if (i != 2) {
                                if (i == 8) {
                                    ((sn3) ((fq3) obj).y).Q();
                                }
                            } else {
                                r(2);
                            }
                        } else {
                            r(4);
                            this.b.clearFlags(1024);
                        }
                    }
                }
                return;
            default:
                ((WindowInsetsController) obj).show(519);
                return;
        }
    }

    public void q(int i) {
        View decorView = this.b.getDecorView();
        decorView.setSystemUiVisibility(i | decorView.getSystemUiVisibility());
    }

    public final void r(int i) {
        byte b = this.a;
        Window window = this.b;
        switch (b) {
            case 0:
                View decorView = window.getDecorView();
                decorView.setSystemUiVisibility((~i) & decorView.getSystemUiVisibility());
                return;
            default:
                View decorView2 = window.getDecorView();
                decorView2.setSystemUiVisibility((~i) & decorView2.getSystemUiVisibility());
                return;
        }
    }
}
