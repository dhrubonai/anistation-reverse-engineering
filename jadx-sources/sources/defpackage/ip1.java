package defpackage;

import android.graphics.BlendModeColorFilter;
import android.graphics.Canvas;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimatedImageDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class ip1 extends xh4 implements c25 {
    public final Drawable C;
    public final ti4 E;
    public final ti4 D = xt5.g(0);
    public final d46 F = new d46(new vt0(this, 7));

    public ip1(Drawable drawable) {
        this.C = drawable;
        this.E = xt5.g(new uq5(jp1.a(drawable)));
        if (drawable.getIntrinsicWidth() >= 0 && drawable.getIntrinsicHeight() >= 0) {
            drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        }
    }

    @Override // defpackage.c25
    public final void a() {
        b();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.c25
    public final void b() {
        Drawable drawable = this.C;
        if (drawable instanceof Animatable) {
            ((Animatable) drawable).stop();
        }
        drawable.setVisible(false, false);
        drawable.setCallback(null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.c25
    public final void c() {
        Drawable.Callback callback = (Drawable.Callback) this.F.getValue();
        Drawable drawable = this.C;
        drawable.setCallback(callback);
        drawable.setVisible(true, true);
        if (drawable instanceof Animatable) {
            ((Animatable) drawable).start();
        }
    }

    @Override // defpackage.xh4
    public final boolean d(float f) {
        this.C.setAlpha(db.C(io3.h0(f * 255.0f), 0, 255));
        return true;
    }

    @Override // defpackage.xh4
    public final boolean e(w60 w60Var) {
        BlendModeColorFilter blendModeColorFilter;
        if (w60Var != null) {
            blendModeColorFilter = w60Var.a;
        } else {
            blendModeColorFilter = null;
        }
        this.C.setColorFilter(blendModeColorFilter);
        return true;
    }

    @Override // defpackage.xh4
    public final void f(ia3 ia3Var) {
        int i;
        ia3Var.getClass();
        int ordinal = ia3Var.ordinal();
        if (ordinal != 0) {
            i = 1;
            if (ordinal != 1) {
                ze0.l();
                return;
            }
        } else {
            i = 0;
        }
        this.C.setLayoutDirection(i);
    }

    @Override // defpackage.xh4
    public final long h() {
        return ((uq5) this.E.getValue()).a;
    }

    @Override // defpackage.xh4
    public final void i(bp1 bp1Var) {
        vg0 y = bp1Var.n0().y();
        ((Number) this.D.getValue()).intValue();
        try {
            y.h();
            int i = Build.VERSION.SDK_INT;
            Drawable drawable = this.C;
            if (i < 31 && (drawable instanceof AnimatedImageDrawable)) {
                y.b(uq5.e(bp1Var.g()) / uq5.e(h()), uq5.c(bp1Var.g()) / uq5.c(h()));
            } else {
                drawable.setBounds(0, 0, io3.h0(uq5.e(bp1Var.g())), io3.h0(uq5.c(bp1Var.g())));
            }
            Canvas canvas = u9.a;
            drawable.draw(((t9) y).a);
            y.p();
        } catch (Throwable th) {
            y.p();
            throw th;
        }
    }
}
