package com.google.android.material.focus;

import android.R;
import android.animation.ObjectAnimator;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableWrapper;
import android.graphics.drawable.RippleDrawable;
import android.util.AttributeSet;
import android.util.FloatProperty;
import android.util.StateSet;
import android.util.TypedValue;
import android.view.animation.OvershootInterpolator;
import com.anistation.model.settings.SubtitleArgbColor;
import defpackage.a82;
import defpackage.b25;
import defpackage.b82;
import defpackage.c82;
import defpackage.pm5;
import defpackage.sw0;
import defpackage.tx4;
import defpackage.w;
import org.xmlpull.v1.XmlPullParser;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public class FocusRingDrawable extends DrawableWrapper {
    public static final ColorDrawable L = new ColorDrawable(0);
    public static final int[] M = {R.attr.state_focused, R.attr.state_window_focused};
    public static final OvershootInterpolator N = new OvershootInterpolator(4.0f);
    public static final a82 O = new FloatProperty("interpolation");
    public final Path A;
    public final Path B;
    public final Matrix C;
    public final b25 D;
    public float E;
    public ObjectAnimator F;
    public float G;
    public boolean H;
    public boolean I;
    public boolean J;
    public c82 K;
    public final Paint x;
    public final RectF y;
    public final Rect z;

    public FocusRingDrawable(c82 c82Var, Resources resources) {
        super(null);
        Drawable newDrawable;
        Paint paint = new Paint(1);
        this.x = paint;
        this.y = new RectF();
        this.z = new Rect();
        this.A = new Path();
        this.B = new Path();
        this.C = new Matrix();
        this.D = b25.h();
        this.E = -1.0f;
        this.G = 1.0f;
        this.I = false;
        this.J = false;
        c82 c82Var2 = new c82(c82Var);
        this.K = c82Var2;
        Drawable.ConstantState constantState = c82Var2.a;
        if (constantState != null) {
            if (resources != null) {
                newDrawable = constantState.newDrawable(resources);
            } else {
                newDrawable = constantState.newDrawable();
            }
            setDrawable(newDrawable);
        }
        paint.setStyle(Paint.Style.STROKE);
        if (!Float.isNaN(this.K.j)) {
            paint.setStrokeWidth(this.K.j);
        }
    }

    public static int c(TypedArray typedArray, int i) {
        if (typedArray.getType(i) == 2) {
            TypedValue typedValue = new TypedValue();
            if (typedArray.getValue(i, typedValue)) {
                return typedValue.data;
            }
            return Integer.MIN_VALUE;
        }
        return Integer.MIN_VALUE;
    }

    public static float d(float f, Resources.Theme theme, int i, TypedArray typedArray, int i2, int i3) {
        if (!Float.isNaN(f)) {
            return f;
        }
        Resources resources = theme.getResources();
        if (i != Float.MIN_VALUE) {
            TypedValue typedValue = new TypedValue();
            if (theme.resolveAttribute(i, typedValue, true)) {
                return typedValue.getDimension(resources.getDisplayMetrics());
            }
        }
        float dimension = typedArray.getDimension(i2, Float.NaN);
        if (!Float.isNaN(dimension)) {
            return dimension;
        }
        if (i3 == 0) {
            return Float.NaN;
        }
        return resources.getDimension(i3);
    }

    public final void a(RectF rectF) {
        Rect rect = this.K.w;
        if (rect != null) {
            rectF.set(rect);
            return;
        }
        if (getDrawable() instanceof RippleDrawable) {
            RippleDrawable rippleDrawable = (RippleDrawable) getDrawable();
            Rect rect2 = this.z;
            rippleDrawable.getHotspotBounds(rect2);
            int radius = rippleDrawable.getRadius();
            if (radius > 0) {
                rect2.inset(Math.max(0, (rect2.width() / 2) - radius), Math.max(0, (rect2.height() / 2) - radius));
            }
            rectF.set(rect2);
            return;
        }
        rectF.set(getBounds());
    }

    @Override // android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    public final void applyTheme(Resources.Theme theme) {
        TypedValue G;
        boolean z;
        super.applyTheme(theme);
        TypedArray obtainStyledAttributes = theme.obtainStyledAttributes(tx4.e);
        int i = this.K.d;
        boolean z2 = false;
        if (i != Integer.MIN_VALUE && (G = sw0.G(theme, i)) != null) {
            c82 c82Var = this.K;
            if (G.data != 0) {
                z = true;
            } else {
                z = false;
            }
            c82Var.c = z;
            c82Var.e = true;
        }
        c82 c82Var2 = this.K;
        if (!c82Var2.e) {
            boolean z3 = c82Var2.c;
            TypedValue G2 = sw0.G(theme, com.anistation.android.R.attr.focusRingsEnabled);
            if (G2 != null && G2.type == 18) {
                if (G2.data != 0) {
                    z2 = true;
                }
            } else {
                z2 = z3;
            }
            c82Var2.c = z2;
        }
        c82 c82Var3 = this.K;
        if (c82Var3.c) {
            int i2 = c82Var3.f;
            int i3 = c82Var3.g;
            if (i2 == Integer.MIN_VALUE) {
                if (i3 != Integer.MIN_VALUE) {
                    TypedValue typedValue = new TypedValue();
                    if (theme.resolveAttribute(i3, typedValue, true)) {
                        i2 = typedValue.data;
                    }
                }
                i2 = obtainStyledAttributes.getColor(5, SubtitleArgbColor.BLACK);
            }
            c82Var3.f = i2;
            c82 c82Var4 = this.K;
            int i4 = c82Var4.h;
            int i5 = c82Var4.i;
            if (i4 == Integer.MIN_VALUE) {
                if (i5 != Integer.MIN_VALUE) {
                    TypedValue typedValue2 = new TypedValue();
                    if (theme.resolveAttribute(i5, typedValue2, true)) {
                        i4 = typedValue2.data;
                    }
                }
                i4 = obtainStyledAttributes.getColor(1, -1);
            }
            c82Var4.h = i4;
            c82 c82Var5 = this.K;
            c82Var5.j = d(c82Var5.j, theme, c82Var5.k, obtainStyledAttributes, 6, com.anistation.android.R.dimen.mtrl_focus_ring_outer_stroke_width);
            c82 c82Var6 = this.K;
            c82Var6.l = d(c82Var6.l, theme, c82Var6.m, obtainStyledAttributes, 3, com.anistation.android.R.dimen.mtrl_focus_ring_inner_stroke_width);
            c82 c82Var7 = this.K;
            c82Var7.n = d(c82Var7.n, theme, c82Var7.o, obtainStyledAttributes, 7, 0);
            c82 c82Var8 = this.K;
            c82Var8.p = d(c82Var8.p, theme, c82Var8.q, obtainStyledAttributes, 4, 0);
            if (Float.isNaN(this.K.p)) {
                this.K.p = 0.0f;
            }
            c82 c82Var9 = this.K;
            c82Var9.r = d(c82Var9.r, theme, c82Var9.s, obtainStyledAttributes, 2, com.anistation.android.R.dimen.mtrl_focus_ring_inner_stroke_inset);
            c82 c82Var10 = this.K;
            int i6 = c82Var10.u;
            int[] iArr = tx4.h;
            if (i6 != Integer.MIN_VALUE) {
                c82Var10.t = pm5.c(theme.obtainStyledAttributes(i6, iArr), new w(0.0f)).a();
            } else {
                int i7 = c82Var10.v;
                if (i7 == Integer.MIN_VALUE) {
                    i7 = com.anistation.android.R.attr.focusRingsShapeAppearance;
                }
                TypedValue G3 = sw0.G(theme, i7);
                if (G3 != null) {
                    this.K.t = pm5.c(theme.obtainStyledAttributes(G3.resourceId, iArr), new w(0.0f)).a();
                }
            }
        }
        obtainStyledAttributes.recycle();
        Paint.Style style = Paint.Style.STROKE;
        Paint paint = this.x;
        paint.setStyle(style);
        if (!Float.isNaN(this.K.j)) {
            paint.setStrokeWidth(this.K.j);
        }
    }

    public final void b(Canvas canvas, Path path, float f, float f2, int i) {
        RectF rectF = this.y;
        a(rectF);
        float f3 = f * 2.0f;
        float width = 1.0f - (f3 / rectF.width());
        float height = 1.0f - (f3 / rectF.height());
        Matrix matrix = this.C;
        matrix.reset();
        matrix.postScale(width, height, rectF.centerX(), rectF.centerY());
        Path path2 = this.A;
        path.transform(matrix, path2);
        float f4 = f2 * this.G;
        Paint paint = this.x;
        paint.setStrokeWidth(f4);
        paint.setColor(i);
        canvas.drawPath(path2, paint);
    }

    @Override // android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    public final boolean canApplyTheme() {
        return true;
    }

    @Override // android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        float f;
        int radius;
        super.draw(canvas);
        c82 c82Var = this.K;
        if (c82Var.c && this.I) {
            float f2 = c82Var.p;
            float f3 = c82Var.j / 2.0f;
            float f4 = this.G;
            float f5 = (f3 * f4) + f2;
            float f6 = ((c82Var.l / 2.0f) * f4) + f2 + c82Var.r;
            Path path = this.B;
            if (path.isEmpty()) {
                path = null;
            }
            Path path2 = path;
            c82 c82Var2 = this.K;
            if (path2 != null) {
                b(canvas, path2, f6, c82Var2.l, c82Var2.h);
                c82 c82Var3 = this.K;
                b(canvas, path2, f5, c82Var3.j, c82Var3.f);
                return;
            }
            if (!Float.isNaN(c82Var2.n)) {
                f = this.K.n;
            } else {
                f = this.E;
                if (f < 0.0f) {
                    Drawable drawable = getDrawable();
                    if ((drawable instanceof RippleDrawable) && (radius = ((RippleDrawable) drawable).getRadius()) >= 0) {
                        f = radius;
                    } else {
                        f = 0.0f;
                    }
                }
            }
            float max = Math.max(0.0f, f - (this.K.j / 2.0f));
            c82 c82Var4 = this.K;
            float f7 = c82Var4.l;
            int i = c82Var4.h;
            RectF rectF = this.y;
            a(rectF);
            rectF.inset(f6, f6);
            float f8 = f7 * this.G;
            Paint paint = this.x;
            paint.setStrokeWidth(f8);
            paint.setColor(i);
            canvas.drawRoundRect(rectF, max, max, paint);
            c82 c82Var5 = this.K;
            float f9 = c82Var5.j;
            int i2 = c82Var5.f;
            a(rectF);
            rectF.inset(f5, f5);
            paint.setStrokeWidth(f9 * this.G);
            paint.setColor(i2);
            canvas.drawRoundRect(rectF, f, f, paint);
        }
    }

    public final void e(pm5 pm5Var) {
        RectF rectF = this.y;
        a(rectF);
        pm5Var.getClass();
        boolean e = pm5Var.e(rectF);
        Path path = this.B;
        if (e) {
            c82 c82Var = this.K;
            float f = ((c82Var.j / 2.0f) * this.G) + c82Var.p;
            rectF.inset(f, f);
            this.E = pm5Var.f.a(rectF);
            path.reset();
            return;
        }
        this.D.a(pm5Var, 1.0f, rectF, null, path);
        this.E = -1.0f;
    }

    @Override // android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        c82 c82Var = this.K;
        if (c82Var.a != null) {
            c82Var.b = getChangingConfigurations();
            return this.K;
        }
        return null;
    }

    @Override // android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    public final boolean hasFocusStateSpecified() {
        try {
            if (!super.hasFocusStateSpecified()) {
                if (!this.K.c) {
                    return false;
                }
                return true;
            }
            return true;
        } catch (NoSuchMethodError unused) {
            return this.K.c;
        }
    }

    @Override // android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        TypedArray obtainAttributes;
        super.inflate(resources, xmlPullParser, attributeSet, theme);
        int[] iArr = tx4.e;
        if (theme != null) {
            obtainAttributes = theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
        } else {
            obtainAttributes = resources.obtainAttributes(attributeSet, iArr);
        }
        this.K.d = c(obtainAttributes, 0);
        int i = Integer.MIN_VALUE;
        if (this.K.d == Integer.MIN_VALUE && obtainAttributes.hasValue(0)) {
            c82 c82Var = this.K;
            c82Var.c = obtainAttributes.getBoolean(0, c82Var.c);
            this.K.e = true;
        }
        this.K.g = c(obtainAttributes, 5);
        c82 c82Var2 = this.K;
        if (c82Var2.g == Integer.MIN_VALUE) {
            c82Var2.f = obtainAttributes.getColor(5, Integer.MIN_VALUE);
        }
        this.K.i = c(obtainAttributes, 1);
        c82 c82Var3 = this.K;
        if (c82Var3.i == Integer.MIN_VALUE) {
            c82Var3.h = obtainAttributes.getColor(1, Integer.MIN_VALUE);
        }
        this.K.k = c(obtainAttributes, 6);
        c82 c82Var4 = this.K;
        if (c82Var4.k == Integer.MIN_VALUE) {
            c82Var4.j = obtainAttributes.getDimension(6, Float.NaN);
        }
        this.K.m = c(obtainAttributes, 3);
        c82 c82Var5 = this.K;
        if (c82Var5.m == Integer.MIN_VALUE) {
            c82Var5.l = obtainAttributes.getDimension(3, Float.NaN);
        }
        this.K.m = c(obtainAttributes, 3);
        c82 c82Var6 = this.K;
        if (c82Var6.m == Integer.MIN_VALUE) {
            c82Var6.l = obtainAttributes.getDimension(3, Float.NaN);
        }
        this.K.o = c(obtainAttributes, 7);
        c82 c82Var7 = this.K;
        if (c82Var7.o == Integer.MIN_VALUE) {
            c82Var7.n = obtainAttributes.getDimension(7, Float.NaN);
        }
        this.K.q = c(obtainAttributes, 4);
        c82 c82Var8 = this.K;
        if (c82Var8.q == Integer.MIN_VALUE) {
            c82Var8.p = obtainAttributes.getDimension(4, Float.NaN);
        }
        this.K.s = c(obtainAttributes, 2);
        c82 c82Var9 = this.K;
        if (c82Var9.s == Integer.MIN_VALUE) {
            c82Var9.r = obtainAttributes.getDimension(2, Float.NaN);
        }
        this.K.v = c(obtainAttributes, 8);
        c82 c82Var10 = this.K;
        if (obtainAttributes.getType(8) == 1) {
            i = obtainAttributes.getResourceId(8, Integer.MIN_VALUE);
        }
        c82Var10.u = i;
        obtainAttributes.recycle();
        int depth = xmlPullParser.getDepth();
        Drawable drawable = null;
        while (true) {
            int next = xmlPullParser.next();
            if (next == 1 || (next == 3 && xmlPullParser.getDepth() <= depth)) {
                break;
            } else if (next == 2) {
                drawable = Drawable.createFromXmlInner(resources, xmlPullParser, attributeSet, theme);
            }
        }
        if (drawable != null) {
            setDrawable(drawable);
            this.K.a = drawable.getConstantState();
        } else {
            ColorDrawable colorDrawable = L;
            setDrawable(colorDrawable);
            this.K.a = colorDrawable.getConstantState();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isProjected() {
        Drawable drawable = getDrawable();
        if (drawable != null && drawable.isProjected()) {
            return true;
        }
        return false;
    }

    @Override // android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    public final boolean isStateful() {
        if (!super.isStateful() && !this.K.c) {
            return false;
        }
        return true;
    }

    @Override // android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    public final void jumpToCurrentState() {
        super.jumpToCurrentState();
        ObjectAnimator objectAnimator = this.F;
        if (objectAnimator != null) {
            objectAnimator.end();
            this.F = null;
        }
    }

    @Override // android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    public final Drawable mutate() {
        if (!this.J && super.mutate() == this) {
            this.K = new c82(this.K);
            Drawable drawable = getDrawable();
            if (drawable != null) {
                this.K.a = drawable.getConstantState();
            }
            this.J = true;
        }
        return this;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x018f  */
    /* JADX WARN: Type inference failed for: r1v12, types: [java.lang.Object, wc7] */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.lang.Object, wc7] */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.lang.Object, wc7] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, wc7] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object, wc7] */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.lang.Object, wc7] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Object, wc7] */
    /* JADX WARN: Type inference failed for: r7v3, types: [java.lang.Object, wc7] */
    /* JADX WARN: Type inference failed for: r7v6, types: [java.lang.Object, wc7] */
    /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.Object, wc7] */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.Object, wc7] */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.lang.Object, wc7] */
    @Override // android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onBoundsChange(android.graphics.Rect r18) {
        /*
            Method dump skipped, instructions count: 407
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.focus.FocusRingDrawable.onBoundsChange(android.graphics.Rect):void");
    }

    @Override // android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        boolean z;
        boolean z2;
        c82 c82Var = this.K;
        if (!c82Var.c) {
            this.I = false;
            return super.onStateChange(iArr);
        }
        boolean stateSetMatches = StateSet.stateSetMatches(c82Var.x, iArr);
        if (this.I != stateSetMatches) {
            z = true;
        } else {
            z = false;
        }
        this.I = stateSetMatches;
        if (z && iArr.length > 0 && !this.H) {
            ObjectAnimator objectAnimator = this.F;
            if (objectAnimator != null) {
                objectAnimator.cancel();
                this.F = null;
            }
            if (stateSetMatches) {
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, O, 0.0f, 1.0f);
                ofFloat.setDuration(300L);
                ofFloat.setInterpolator(N);
                ofFloat.addListener(new b82(this));
                this.F = ofFloat;
                ofFloat.start();
            } else {
                this.G = 1.0f;
            }
        }
        if (iArr.length == 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.H = z2;
        if (!super.onStateChange(iArr) && !z) {
            return false;
        }
        return true;
    }

    public FocusRingDrawable() {
        super(null);
        this.x = new Paint(1);
        this.y = new RectF();
        this.z = new Rect();
        this.A = new Path();
        this.B = new Path();
        this.C = new Matrix();
        this.D = b25.h();
        this.E = -1.0f;
        this.G = 1.0f;
        this.I = false;
        this.J = false;
        this.K = new c82(null);
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        inflate(resources, xmlPullParser, attributeSet, null);
    }
}
