package defpackage;

import android.view.View;
import android.view.WindowInsets;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public abstract class lv6 {
    public static v57 a(View view) {
        WindowInsets rootWindowInsets = view.getRootWindowInsets();
        if (rootWindowInsets == null) {
            return null;
        }
        v57 c = v57.c(rootWindowInsets, null);
        s57 s57Var = c.a;
        s57Var.y(c);
        View rootView = view.getRootView();
        s57Var.d(rootView);
        s57Var.p(rootView);
        s57Var.q();
        return c;
    }
}
