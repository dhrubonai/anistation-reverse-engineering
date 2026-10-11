package androidx.appcompat.widget;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;

/* loaded from: classes.dex */
public final class z1 extends Drawable implements Drawable.Callback {

    /* renamed from: a, reason: collision with root package name */
    public Drawable f732a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f733b;

    public z1(Drawable drawable) {
        Drawable drawable2 = this.f732a;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f732a = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
        this.f733b = true;
    }

    @Override // android.graphics.drawable.Drawable
    /* renamed from: A, reason: merged with bridge method [inline-methods] */
    public final void setTintList(ColorStateList colorStateList) {
        a0.b.h(this.f732a, colorStateList);
    }

    @Override // android.graphics.drawable.Drawable
    /* renamed from: B, reason: merged with bridge method [inline-methods] */
    public final void setTintMode(PorterDuff.Mode mode) {
        a0.b.i(this.f732a, mode);
    }

    public final boolean C(boolean z9, boolean z10) {
        if (!super.setVisible(z9, z10) && !this.f732a.setVisible(z9, z10)) {
            return false;
        }
        return true;
    }

    public final void a(Canvas canvas) {
        this.f732a.draw(canvas);
    }

    @Override // android.graphics.drawable.Drawable
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final int getChangingConfigurations() {
        return this.f732a.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final Drawable getCurrent() {
        return this.f732a.getCurrent();
    }

    @Override // android.graphics.drawable.Drawable
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final int getIntrinsicHeight() {
        return this.f732a.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        if (this.f733b) {
            a(canvas);
        }
    }

    @Override // android.graphics.drawable.Drawable
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public final int getIntrinsicWidth() {
        return this.f732a.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public final int getMinimumHeight() {
        return this.f732a.getMinimumHeight();
    }

    @Override // android.graphics.drawable.Drawable
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public final int getMinimumWidth() {
        return this.f732a.getMinimumWidth();
    }

    @Override // android.graphics.drawable.Drawable
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public final int getOpacity() {
        return this.f732a.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public final boolean getPadding(Rect rect) {
        return this.f732a.getPadding(rect);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public final int[] getState() {
        return this.f732a.getState();
    }

    @Override // android.graphics.drawable.Drawable
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public final Region getTransparentRegion() {
        return this.f732a.getTransparentRegion();
    }

    @Override // android.graphics.drawable.Drawable
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public final boolean isAutoMirrored() {
        return a0.a.d(this.f732a);
    }

    @Override // android.graphics.drawable.Drawable
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public final boolean isStateful() {
        return this.f732a.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public final void jumpToCurrentState() {
        this.f732a.jumpToCurrentState();
    }

    @Override // android.graphics.drawable.Drawable
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public final void onBoundsChange(Rect rect) {
        this.f732a.setBounds(rect);
    }

    @Override // android.graphics.drawable.Drawable
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public final boolean onLevelChange(int i10) {
        return this.f732a.setLevel(i10);
    }

    @Override // android.graphics.drawable.Drawable
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public final void setAlpha(int i10) {
        this.f732a.setAlpha(i10);
    }

    @Override // android.graphics.drawable.Drawable
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public final void setAutoMirrored(boolean z9) {
        a0.a.e(this.f732a, z9);
    }

    @Override // android.graphics.drawable.Drawable
    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public final void setChangingConfigurations(int i10) {
        this.f732a.setChangingConfigurations(i10);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j4) {
        scheduleSelf(runnable, j4);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setHotspot(float f10, float f11) {
        if (this.f733b) {
            w(f10, f11);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setHotspotBounds(int i10, int i11, int i12, int i13) {
        if (this.f733b) {
            x(i10, i11, i12, i13);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setState(int[] iArr) {
        if (this.f733b) {
            return y(iArr);
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z9, boolean z10) {
        if (this.f733b) {
            return C(z9, z10);
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    /* renamed from: t, reason: merged with bridge method [inline-methods] */
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f732a.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    /* renamed from: u, reason: merged with bridge method [inline-methods] */
    public final void setDither(boolean z9) {
        this.f732a.setDither(z9);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }

    @Override // android.graphics.drawable.Drawable
    /* renamed from: v, reason: merged with bridge method [inline-methods] */
    public final void setFilterBitmap(boolean z9) {
        this.f732a.setFilterBitmap(z9);
    }

    public final void w(float f10, float f11) {
        a0.b.e(this.f732a, f10, f11);
    }

    public final void x(int i10, int i11, int i12, int i13) {
        a0.b.f(this.f732a, i10, i11, i12, i13);
    }

    public final boolean y(int[] iArr) {
        return this.f732a.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    /* renamed from: z, reason: merged with bridge method [inline-methods] */
    public final void setTint(int i10) {
        a0.b.g(this.f732a, i10);
    }
}
