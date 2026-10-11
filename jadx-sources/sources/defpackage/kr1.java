package defpackage;

import android.os.Build;
import android.view.View;
import android.view.Window;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public class kr1 extends jr1 {
    @Override // defpackage.ir1
    public void b(e46 e46Var, e46 e46Var2, Window window, View view, boolean z, boolean z2) {
        w57 w57Var;
        e46Var.getClass();
        e46Var2.getClass();
        window.getClass();
        view.getClass();
        yu5.k(window, false);
        window.setStatusBarColor(0);
        window.setNavigationBarColor(0);
        window.setStatusBarContrastEnforced(false);
        window.setNavigationBarContrastEnforced(true);
        fq3 fq3Var = new fq3(view);
        int i = Build.VERSION.SDK_INT;
        if (i >= 35) {
            w57Var = new w57(window, fq3Var, (byte) 1);
        } else if (i >= 30) {
            w57Var = new w57(window, fq3Var, (byte) 1);
        } else {
            w57Var = new w57(window, fq3Var, (byte) 0);
        }
        w57Var.f(!z);
        w57Var.e(true ^ z2);
    }
}
