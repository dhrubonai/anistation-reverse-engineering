package g0;

import android.view.WindowInsets;

/* loaded from: classes.dex */
public class e2 extends d2 {

    /* renamed from: m, reason: collision with root package name */
    public z.d f4197m;

    public e2(k2 k2Var, WindowInsets windowInsets) {
        super(k2Var, windowInsets);
        this.f4197m = null;
    }

    @Override // g0.i2
    public k2 b() {
        return k2.h(null, this.f4184c.consumeStableInsets());
    }

    @Override // g0.i2
    public k2 c() {
        return k2.h(null, this.f4184c.consumeSystemWindowInsets());
    }

    @Override // g0.i2
    public final z.d h() {
        if (this.f4197m == null) {
            WindowInsets windowInsets = this.f4184c;
            this.f4197m = z.d.b(windowInsets.getStableInsetLeft(), windowInsets.getStableInsetTop(), windowInsets.getStableInsetRight(), windowInsets.getStableInsetBottom());
        }
        return this.f4197m;
    }

    @Override // g0.i2
    public boolean m() {
        return this.f4184c.isConsumed();
    }

    @Override // g0.i2
    public void q(z.d dVar) {
        this.f4197m = dVar;
    }
}
