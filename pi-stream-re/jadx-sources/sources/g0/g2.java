package g0;

import android.graphics.Insets;
import android.view.WindowInsets;

/* loaded from: classes.dex */
public class g2 extends f2 {

    /* renamed from: n, reason: collision with root package name */
    public z.d f4214n;
    public z.d o;

    /* renamed from: p, reason: collision with root package name */
    public z.d f4215p;

    public g2(k2 k2Var, WindowInsets windowInsets) {
        super(k2Var, windowInsets);
        this.f4214n = null;
        this.o = null;
        this.f4215p = null;
    }

    @Override // g0.i2
    public z.d g() {
        Insets mandatorySystemGestureInsets;
        if (this.o == null) {
            mandatorySystemGestureInsets = this.f4184c.getMandatorySystemGestureInsets();
            this.o = z.d.c(mandatorySystemGestureInsets);
        }
        return this.o;
    }

    @Override // g0.i2
    public z.d i() {
        Insets systemGestureInsets;
        if (this.f4214n == null) {
            systemGestureInsets = this.f4184c.getSystemGestureInsets();
            this.f4214n = z.d.c(systemGestureInsets);
        }
        return this.f4214n;
    }

    @Override // g0.i2
    public z.d k() {
        Insets tappableElementInsets;
        if (this.f4215p == null) {
            tappableElementInsets = this.f4184c.getTappableElementInsets();
            this.f4215p = z.d.c(tappableElementInsets);
        }
        return this.f4215p;
    }

    @Override // g0.d2, g0.i2
    public k2 l(int i10, int i11, int i12, int i13) {
        WindowInsets inset;
        inset = this.f4184c.inset(i10, i11, i12, i13);
        return k2.h(null, inset);
    }

    @Override // g0.e2, g0.i2
    public void q(z.d dVar) {
    }
}
