package g0;

import android.graphics.Insets;
import android.view.View;
import android.view.WindowInsets;

/* loaded from: classes.dex */
public final class h2 extends g2 {

    /* renamed from: q, reason: collision with root package name */
    public static final k2 f4217q;

    static {
        WindowInsets windowInsets;
        windowInsets = WindowInsets.CONSUMED;
        f4217q = k2.h(null, windowInsets);
    }

    public h2(k2 k2Var, WindowInsets windowInsets) {
        super(k2Var, windowInsets);
    }

    @Override // g0.d2, g0.i2
    public final void d(View view) {
    }

    @Override // g0.d2, g0.i2
    public z.d f(int i10) {
        Insets insets;
        insets = this.f4184c.getInsets(j2.a(i10));
        return z.d.c(insets);
    }
}
