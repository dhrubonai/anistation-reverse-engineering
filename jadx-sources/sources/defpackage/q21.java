package defpackage;

import android.content.res.ColorStateList;
import android.graphics.BlendMode;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import java.util.ArrayList;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class q21 extends Drawable implements Drawable.Callback, Animatable {
    public final ArrayList A = new ArrayList();
    public final int B;
    public final int C;
    public long D;
    public int E;
    public byte F;
    public Drawable G;
    public final Drawable H;
    public final xa5 x;
    public final int y;
    public final boolean z;

    public q21(Drawable drawable, Drawable drawable2, xa5 xa5Var, int i, boolean z) {
        Integer num;
        Integer num2;
        Integer num3;
        Integer num4;
        Drawable drawable3;
        Drawable drawable4;
        this.x = xa5Var;
        this.y = i;
        this.z = z;
        if (drawable != null) {
            num = Integer.valueOf(drawable.getIntrinsicWidth());
        } else {
            num = null;
        }
        if (drawable2 != null) {
            num2 = Integer.valueOf(drawable2.getIntrinsicWidth());
        } else {
            num2 = null;
        }
        this.B = a(num, num2);
        if (drawable != null) {
            num3 = Integer.valueOf(drawable.getIntrinsicHeight());
        } else {
            num3 = null;
        }
        if (drawable2 != null) {
            num4 = Integer.valueOf(drawable2.getIntrinsicHeight());
        } else {
            num4 = null;
        }
        this.C = a(num3, num4);
        this.E = 255;
        if (drawable != null) {
            drawable3 = drawable.mutate();
        } else {
            drawable3 = null;
        }
        this.G = drawable3;
        if (drawable2 != null) {
            drawable4 = drawable2.mutate();
        } else {
            drawable4 = null;
        }
        this.H = drawable4;
        if (i > 0) {
            Drawable drawable5 = this.G;
            if (drawable5 != null) {
                drawable5.setCallback(this);
            }
            if (drawable4 != null) {
                drawable4.setCallback(this);
                return;
            }
            return;
        }
        ze0.k("durationMillis must be > 0.");
        throw null;
    }

    public final int a(Integer num, Integer num2) {
        int i;
        int i2 = -1;
        if (num != null && num.intValue() == -1) {
            return -1;
        }
        if (num2 != null && num2.intValue() == -1) {
            return -1;
        }
        if (num != null) {
            i = num.intValue();
        } else {
            i = -1;
        }
        if (num2 != null) {
            i2 = num2.intValue();
        }
        return Math.max(i, i2);
    }

    public final void b(Drawable drawable, Rect rect) {
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        if (intrinsicWidth > 0 && intrinsicHeight > 0) {
            int width = rect.width();
            int height = rect.height();
            double l = oi4.l(intrinsicWidth, intrinsicHeight, width, height, this.x, tq5.c);
            int g0 = io3.g0((width - (intrinsicWidth * l)) / 2.0d);
            int g02 = io3.g0((height - (l * intrinsicHeight)) / 2.0d);
            drawable.setBounds(rect.left + g0, rect.top + g02, rect.right - g0, rect.bottom - g02);
            return;
        }
        drawable.setBounds(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        boolean z;
        int save;
        Drawable drawable;
        byte b = this.F;
        if (b == 0) {
            Drawable drawable2 = this.G;
            if (drawable2 != null) {
                drawable2.setAlpha(this.E);
                save = canvas.save();
                try {
                    drawable2.draw(canvas);
                    return;
                } finally {
                }
            }
            return;
        }
        Drawable drawable3 = this.H;
        if (b == 2) {
            if (drawable3 != null) {
                drawable3.setAlpha(this.E);
                save = canvas.save();
                try {
                    drawable3.draw(canvas);
                    return;
                } finally {
                }
            }
            return;
        }
        double uptimeMillis = (SystemClock.uptimeMillis() - this.D) / this.y;
        double A = db.A(uptimeMillis, 0.0d, 1.0d);
        int i = this.E;
        int i2 = (int) (A * i);
        if (this.z) {
            i -= i2;
        }
        if (uptimeMillis >= 1.0d) {
            z = true;
        } else {
            z = false;
        }
        if (!z && (drawable = this.G) != null) {
            drawable.setAlpha(i);
            save = canvas.save();
            try {
                drawable.draw(canvas);
            } finally {
            }
        }
        if (drawable3 != null) {
            drawable3.setAlpha(i2);
            save = canvas.save();
            try {
                drawable3.draw(canvas);
            } finally {
            }
        }
        if (z) {
            this.F = (byte) 2;
            this.G = null;
            ArrayList arrayList = this.A;
            if (arrayList.size() <= 0) {
                return;
            }
            arrayList.get(0).getClass();
            ov3.d();
            return;
        }
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.E;
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        ColorFilter colorFilter;
        byte b = this.F;
        if (b != 0) {
            Drawable drawable = this.H;
            if (b != 1) {
                if (b == 2 && drawable != null) {
                    return drawable.getColorFilter();
                }
                return null;
            }
            if (drawable != null && (colorFilter = drawable.getColorFilter()) != null) {
                return colorFilter;
            }
            Drawable drawable2 = this.G;
            if (drawable2 != null) {
                return drawable2.getColorFilter();
            }
            return null;
        }
        Drawable drawable3 = this.G;
        if (drawable3 != null) {
            return drawable3.getColorFilter();
        }
        return null;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.C;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.B;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Drawable drawable = this.G;
        byte b = this.F;
        if (b == 0) {
            if (drawable != null) {
                return drawable.getOpacity();
            }
            return -2;
        }
        Drawable drawable2 = this.H;
        if (b == 2) {
            if (drawable2 != null) {
                return drawable2.getOpacity();
            }
            return -2;
        }
        if (drawable != null && drawable2 != null) {
            return Drawable.resolveOpacity(drawable.getOpacity(), drawable2.getOpacity());
        }
        if (drawable != null) {
            return drawable.getOpacity();
        }
        if (drawable2 != null) {
            return drawable2.getOpacity();
        }
        return -2;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        if (this.F == 1) {
            return true;
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        boolean z;
        boolean z2;
        Drawable drawable = this.G;
        if (drawable != null) {
            z = drawable.isStateful();
        } else {
            z = false;
        }
        if (!z) {
            Drawable drawable2 = this.H;
            if (drawable2 != null) {
                z2 = drawable2.isStateful();
            } else {
                z2 = false;
            }
            if (!z2) {
                return false;
            }
            return true;
        }
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.G;
        if (drawable != null) {
            b(drawable, rect);
        }
        Drawable drawable2 = this.H;
        if (drawable2 != null) {
            b(drawable2, rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i) {
        boolean z;
        boolean z2;
        Drawable drawable = this.G;
        if (drawable != null) {
            z = drawable.setLevel(i);
        } else {
            z = false;
        }
        Drawable drawable2 = this.H;
        if (drawable2 != null) {
            z2 = drawable2.setLevel(i);
        } else {
            z2 = false;
        }
        if (!z && !z2) {
            return false;
        }
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        boolean z;
        boolean z2;
        Drawable drawable = this.G;
        if (drawable != null) {
            z = drawable.setState(iArr);
        } else {
            z = false;
        }
        Drawable drawable2 = this.H;
        if (drawable2 != null) {
            z2 = drawable2.setState(iArr);
        } else {
            z2 = false;
        }
        if (!z && !z2) {
            return false;
        }
        return true;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        scheduleSelf(runnable, j);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        if (i >= 0 && i < 256) {
            this.E = i;
        } else {
            ze0.e(qx1.h(i, "Invalid alpha: "));
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.G;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        }
        Drawable drawable2 = this.H;
        if (drawable2 != null) {
            drawable2.setColorFilter(colorFilter);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i) {
        Drawable drawable = this.G;
        if (drawable != null) {
            drawable.setTint(i);
        }
        Drawable drawable2 = this.H;
        if (drawable2 != null) {
            drawable2.setTint(i);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintBlendMode(BlendMode blendMode) {
        Drawable drawable = this.G;
        if (drawable != null) {
            drawable.setTintBlendMode(blendMode);
        }
        Drawable drawable2 = this.H;
        if (drawable2 != null) {
            drawable2.setTintBlendMode(blendMode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.G;
        if (drawable != null) {
            drawable.setTintList(colorStateList);
        }
        Drawable drawable2 = this.H;
        if (drawable2 != null) {
            drawable2.setTintList(colorStateList);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.G;
        if (drawable != null) {
            drawable.setTintMode(mode);
        }
        Drawable drawable2 = this.H;
        if (drawable2 != null) {
            drawable2.setTintMode(mode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        boolean z3;
        boolean z4;
        boolean visible = super.setVisible(z, z2);
        Drawable drawable = this.G;
        if (drawable != null && drawable.setVisible(z, z2)) {
            z3 = true;
        } else {
            z3 = false;
        }
        Drawable drawable2 = this.H;
        if (drawable2 != null && drawable2.setVisible(z, z2)) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (!visible && !z3 && !z4) {
            return false;
        }
        return true;
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        Animatable animatable;
        Object obj = this.G;
        Animatable animatable2 = null;
        if (obj instanceof Animatable) {
            animatable = (Animatable) obj;
        } else {
            animatable = null;
        }
        if (animatable != null) {
            animatable.start();
        }
        Object obj2 = this.H;
        if (obj2 instanceof Animatable) {
            animatable2 = (Animatable) obj2;
        }
        if (animatable2 != null) {
            animatable2.start();
        }
        if (this.F != 0) {
            return;
        }
        this.F = (byte) 1;
        this.D = SystemClock.uptimeMillis();
        ArrayList arrayList = this.A;
        if (arrayList.size() <= 0) {
            invalidateSelf();
        } else {
            arrayList.get(0).getClass();
            ov3.d();
        }
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        Animatable animatable;
        Animatable animatable2;
        Object obj = this.G;
        if (obj instanceof Animatable) {
            animatable = (Animatable) obj;
        } else {
            animatable = null;
        }
        if (animatable != null) {
            animatable.stop();
        }
        Object obj2 = this.H;
        if (obj2 instanceof Animatable) {
            animatable2 = (Animatable) obj2;
        } else {
            animatable2 = null;
        }
        if (animatable2 != null) {
            animatable2.stop();
        }
        if (this.F != 2) {
            this.F = (byte) 2;
            this.G = null;
            ArrayList arrayList = this.A;
            if (arrayList.size() > 0) {
                arrayList.get(0).getClass();
                ov3.d();
            }
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }
}
