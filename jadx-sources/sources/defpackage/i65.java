package defpackage;

import android.R;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.animation.AnimationUtils;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class i65 extends View {
    public static final int[] C = {R.attr.state_pressed, R.attr.state_enabled};
    public static final int[] D = new int[0];
    public a92 A;
    public y7 B;
    public ko6 x;
    public Boolean y;
    public Long z;

    public static /* synthetic */ void a(i65 i65Var) {
        setRippleState$lambda$1(i65Var);
    }

    private final void setRippleState(boolean z) {
        long j;
        int[] iArr;
        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        Runnable runnable = this.A;
        if (runnable != null) {
            removeCallbacks(runnable);
            runnable.run();
        }
        Long l = this.z;
        if (l != null) {
            j = l.longValue();
        } else {
            j = 0;
        }
        long j2 = currentAnimationTimeMillis - j;
        if (!z && j2 < 5) {
            a92 a92Var = new a92(this, (byte) 14);
            this.A = a92Var;
            postDelayed(a92Var, 50L);
        } else {
            if (z) {
                iArr = C;
            } else {
                iArr = D;
            }
            ko6 ko6Var = this.x;
            if (ko6Var != null) {
                ko6Var.setState(iArr);
            }
        }
        this.z = Long.valueOf(currentAnimationTimeMillis);
    }

    public static final void setRippleState$lambda$1(i65 i65Var) {
        ko6 ko6Var = i65Var.x;
        if (ko6Var != null) {
            ko6Var.setState(D);
        }
        i65Var.A = null;
    }

    public final void b(qt4 qt4Var, boolean z, long j, int i, long j2, y7 y7Var) {
        long j3 = qt4Var.a;
        if (this.x == null || !Boolean.valueOf(z).equals(this.y)) {
            ko6 ko6Var = new ko6(z);
            setBackground(ko6Var);
            this.x = ko6Var;
            this.y = Boolean.valueOf(z);
        }
        ko6 ko6Var2 = this.x;
        ko6Var2.getClass();
        this.B = y7Var;
        e(j, i, j2);
        if (z) {
            ko6Var2.setHotspot(Float.intBitsToFloat((int) (j3 >> 32)), Float.intBitsToFloat((int) (4294967295L & j3)));
        } else {
            ko6Var2.setHotspot(ko6Var2.getBounds().centerX(), ko6Var2.getBounds().centerY());
        }
        setRippleState(true);
    }

    public final void c() {
        this.B = null;
        a92 a92Var = this.A;
        if (a92Var != null) {
            removeCallbacks(a92Var);
            a92 a92Var2 = this.A;
            a92Var2.getClass();
            a92Var2.run();
        } else {
            ko6 ko6Var = this.x;
            if (ko6Var != null) {
                ko6Var.setState(D);
            }
        }
        ko6 ko6Var2 = this.x;
        if (ko6Var2 == null) {
            return;
        }
        ko6Var2.setVisible(false, false);
        unscheduleDrawable(ko6Var2);
    }

    public final void d() {
        setRippleState(false);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        if (!isAttachedToWindow()) {
            c();
        } else {
            super.draw(canvas);
        }
    }

    public final void e(long j, int i, long j2) {
        boolean a;
        ko6 ko6Var = this.x;
        if (ko6Var == null) {
            return;
        }
        if (ko6Var.getRadius() != i) {
            ko6Var.setRadius(i);
        }
        long b = ep0.b(0.1f, j2);
        ep0 ep0Var = ko6Var.y;
        if (ep0Var == null) {
            a = false;
        } else {
            a = cm6.a(ep0Var.a, b);
        }
        if (!a) {
            ko6Var.y = new ep0(b);
            ko6Var.setColor(ColorStateList.valueOf(w65.U(b)));
        }
        Rect rect = new Rect(0, 0, io3.h0(uq5.e(j)), io3.h0(uq5.c(j)));
        setLeft(rect.left);
        setTop(rect.top);
        setRight(rect.right);
        setBottom(rect.bottom);
        ko6Var.setBounds(rect);
    }

    @Override // android.view.View, android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        y7 y7Var = this.B;
        if (y7Var != null) {
            y7Var.invoke();
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    @Override // android.view.View
    public final void refreshDrawableState() {
    }

    @Override // android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }
}
