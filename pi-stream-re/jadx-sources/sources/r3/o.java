package r3;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes.dex */
public final class o extends f {
    public static final PorterDuff.Mode A = PorterDuff.Mode.SRC_IN;

    /* renamed from: b, reason: collision with root package name */
    public m f9393b;

    /* renamed from: c, reason: collision with root package name */
    public PorterDuffColorFilter f9394c;

    /* renamed from: d, reason: collision with root package name */
    public ColorFilter f9395d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f9396e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f9397f;

    /* renamed from: x, reason: collision with root package name */
    public final float[] f9398x;

    /* renamed from: y, reason: collision with root package name */
    public final Matrix f9399y;

    /* renamed from: z, reason: collision with root package name */
    public final Rect f9400z;

    public o() {
        this.f9397f = true;
        this.f9398x = new float[9];
        this.f9399y = new Matrix();
        this.f9400z = new Rect();
        this.f9393b = new m();
    }

    public final PorterDuffColorFilter a(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList != null && mode != null) {
            return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
        }
        return null;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean canApplyTheme() {
        Drawable drawable = this.f9338a;
        if (drawable != null) {
            a0.b.b(drawable);
            return false;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x00bb, code lost:
    
        if (r10 == false) goto L40;
     */
    @Override // android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void draw(android.graphics.Canvas r19) {
        /*
            Method dump skipped, instructions count: 382
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: r3.o.draw(android.graphics.Canvas):void");
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        Drawable drawable = this.f9338a;
        if (drawable != null) {
            return a0.a.a(drawable);
        }
        return this.f9393b.f9381b.getRootAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        Drawable drawable = this.f9338a;
        if (drawable != null) {
            return drawable.getChangingConfigurations();
        }
        return super.getChangingConfigurations() | this.f9393b.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        Drawable drawable = this.f9338a;
        if (drawable != null) {
            return a0.b.c(drawable);
        }
        return this.f9395d;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        if (this.f9338a != null && Build.VERSION.SDK_INT >= 24) {
            return new n(this.f9338a.getConstantState());
        }
        this.f9393b.f9380a = getChangingConfigurations();
        return this.f9393b;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        Drawable drawable = this.f9338a;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return (int) this.f9393b.f9381b.f9374i;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        Drawable drawable = this.f9338a;
        if (drawable != null) {
            return drawable.getIntrinsicWidth();
        }
        return (int) this.f9393b.f9381b.f9373h;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Drawable drawable = this.f9338a;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        Drawable drawable = this.f9338a;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet);
        } else {
            inflate(resources, xmlPullParser, attributeSet, null);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        Drawable drawable = this.f9338a;
        if (drawable != null) {
            drawable.invalidateSelf();
        } else {
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        Drawable drawable = this.f9338a;
        if (drawable != null) {
            return a0.a.d(drawable);
        }
        return this.f9393b.f9384e;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        ColorStateList colorStateList;
        Drawable drawable = this.f9338a;
        if (drawable != null) {
            return drawable.isStateful();
        }
        if (!super.isStateful()) {
            m mVar = this.f9393b;
            if (mVar != null) {
                l lVar = mVar.f9381b;
                if (lVar.f9379n == null) {
                    lVar.f9379n = Boolean.valueOf(lVar.f9372g.a());
                }
                if (lVar.f9379n.booleanValue() || ((colorStateList = this.f9393b.f9382c) != null && colorStateList.isStateful())) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        Drawable drawable = this.f9338a;
        if (drawable != null) {
            drawable.mutate();
            return this;
        }
        if (!this.f9396e && super.mutate() == this) {
            this.f9393b = new m(this.f9393b);
            this.f9396e = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.f9338a;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        boolean z9;
        PorterDuff.Mode mode;
        Drawable drawable = this.f9338a;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        m mVar = this.f9393b;
        ColorStateList colorStateList = mVar.f9382c;
        if (colorStateList != null && (mode = mVar.f9383d) != null) {
            this.f9394c = a(colorStateList, mode);
            invalidateSelf();
            z9 = true;
        } else {
            z9 = false;
        }
        l lVar = mVar.f9381b;
        if (lVar.f9379n == null) {
            lVar.f9379n = Boolean.valueOf(lVar.f9372g.a());
        }
        if (lVar.f9379n.booleanValue()) {
            boolean b10 = mVar.f9381b.f9372g.b(iArr);
            mVar.f9390k |= b10;
            if (b10) {
                invalidateSelf();
                return true;
            }
        }
        return z9;
    }

    @Override // android.graphics.drawable.Drawable
    public final void scheduleSelf(Runnable runnable, long j4) {
        Drawable drawable = this.f9338a;
        if (drawable != null) {
            drawable.scheduleSelf(runnable, j4);
        } else {
            super.scheduleSelf(runnable, j4);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i10) {
        Drawable drawable = this.f9338a;
        if (drawable != null) {
            drawable.setAlpha(i10);
        } else if (this.f9393b.f9381b.getRootAlpha() != i10) {
            this.f9393b.f9381b.setRootAlpha(i10);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z9) {
        Drawable drawable = this.f9338a;
        if (drawable != null) {
            a0.a.e(drawable, z9);
        } else {
            this.f9393b.f9384e = z9;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f9338a;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.f9395d = colorFilter;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i10) {
        Drawable drawable = this.f9338a;
        if (drawable != null) {
            w7.b.V(drawable, i10);
        } else {
            setTintList(ColorStateList.valueOf(i10));
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f9338a;
        if (drawable != null) {
            a0.b.h(drawable, colorStateList);
            return;
        }
        m mVar = this.f9393b;
        if (mVar.f9382c != colorStateList) {
            mVar.f9382c = colorStateList;
            this.f9394c = a(colorStateList, mVar.f9383d);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f9338a;
        if (drawable != null) {
            a0.b.i(drawable, mode);
            return;
        }
        m mVar = this.f9393b;
        if (mVar.f9383d != mode) {
            mVar.f9383d = mode;
            this.f9394c = a(mVar.f9382c, mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z9, boolean z10) {
        Drawable drawable = this.f9338a;
        if (drawable != null) {
            return drawable.setVisible(z9, z10);
        }
        return super.setVisible(z9, z10);
    }

    @Override // android.graphics.drawable.Drawable
    public final void unscheduleSelf(Runnable runnable) {
        Drawable drawable = this.f9338a;
        if (drawable != null) {
            drawable.unscheduleSelf(runnable);
        } else {
            super.unscheduleSelf(runnable);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:130:0x03c9  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00d8  */
    @Override // android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void inflate(android.content.res.Resources r22, org.xmlpull.v1.XmlPullParser r23, android.util.AttributeSet r24, android.content.res.Resources.Theme r25) {
        /*
            Method dump skipped, instructions count: 1006
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: r3.o.inflate(android.content.res.Resources, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.content.res.Resources$Theme):void");
    }

    public o(m mVar) {
        this.f9397f = true;
        this.f9398x = new float[9];
        this.f9399y = new Matrix();
        this.f9400z = new Rect();
        this.f9393b = mVar;
        this.f9394c = a(mVar.f9382c, mVar.f9383d);
    }
}
