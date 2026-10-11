package defpackage;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class jv6 implements View.OnApplyWindowInsetsListener {
    public v57 a = null;
    public final /* synthetic */ View b;
    public final /* synthetic */ nd4 c;

    public jv6(View view, nd4 nd4Var) {
        this.b = view;
        this.c = nd4Var;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        v57 c = v57.c(windowInsets, view);
        int i = Build.VERSION.SDK_INT;
        nd4 nd4Var = this.c;
        if (i < 30) {
            kv6.a(windowInsets, this.b);
            if (c.equals(this.a)) {
                return nd4Var.i(view, c).b();
            }
        }
        this.a = c;
        v57 i2 = nd4Var.i(view, c);
        if (i >= 30) {
            return i2.b();
        }
        int i3 = pv6.a;
        view.requestApplyInsets();
        return i2.b();
    }
}
