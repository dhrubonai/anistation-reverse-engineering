package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Build;
import com.anistation.model.settings.SubtitleArgbColor;
import java.util.BitSet;
import java.util.Objects;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class go3 extends Drawable {
    public static final m18[] w;
    public final af2 a;
    public fo3 b;
    public final zm5[] c;
    public final zm5[] d;
    public final BitSet e;
    public boolean f;
    public boolean g;
    public final Matrix h;
    public final Path i;
    public final Path j;
    public final RectF k;
    public final RectF l;
    public final Region m;
    public final Region n;
    public final Paint o;
    public final Paint p;
    public final eo3 q;
    public final b25 r;
    public PorterDuffColorFilter s;
    public PorterDuffColorFilter t;
    public final RectF u;
    public pm5 v;

    static {
        Paint paint = new Paint(1);
        paint.setColor(-1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        w = new m18[4];
        int i = 0;
        while (true) {
            m18[] m18VarArr = w;
            if (i < m18VarArr.length) {
                m18VarArr[i] = new m18((byte) 24);
                i++;
            } else {
                return;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [mm5, java.lang.Object] */
    public go3(fo3 fo3Var) {
        this.a = new af2((Object) this, (byte) 28);
        this.c = new zm5[4];
        this.d = new zm5[4];
        this.e = new BitSet(8);
        this.h = new Matrix();
        this.i = new Path();
        this.j = new Path();
        this.k = new RectF();
        this.l = new RectF();
        this.m = new Region();
        this.n = new Region();
        Paint paint = new Paint(1);
        this.o = paint;
        Paint paint2 = new Paint(1);
        this.p = paint2;
        ?? obj = new Object();
        new Path();
        Paint paint3 = new Paint();
        Paint paint4 = new Paint();
        obj.x = up0.d(SubtitleArgbColor.BLACK, 68);
        up0.d(SubtitleArgbColor.BLACK, 20);
        up0.d(SubtitleArgbColor.BLACK, 0);
        paint4.setColor(obj.x);
        paint3.setColor(0);
        Paint paint5 = new Paint(4);
        paint5.setStyle(Paint.Style.FILL);
        new Paint(paint5);
        this.r = b25.h();
        this.u = new RectF();
        this.b = fo3Var;
        paint2.setStyle(Paint.Style.STROKE);
        paint.setStyle(Paint.Style.FILL);
        i();
        h(getState());
        this.q = new eo3((Object) this, (byte) 0);
    }

    public final void a(RectF rectF, Path path) {
        pm5 pm5Var = this.b.a;
        pm5Var.getClass();
        this.r.a(pm5Var, this.b.h, rectF, this.q, path);
        if (this.b.g != 1.0f) {
            Matrix matrix = this.h;
            matrix.reset();
            float f = this.b.g;
            matrix.setScale(f, f, rectF.width() / 2.0f, rectF.height() / 2.0f);
            path.transform(matrix);
        }
        path.computeBounds(this.u, true);
    }

    public final float b(RectF rectF, pm5 pm5Var) {
        if (pm5Var.e(rectF)) {
            return pm5Var.f.a(rectF);
        }
        return -1.0f;
    }

    public final int c(int i) {
        this.b.getClass();
        fo3 fo3Var = this.b;
        fo3Var.getClass();
        es1 es1Var = fo3Var.b;
        if (es1Var != null && es1Var.a && up0.d(i, 255) == es1Var.c) {
            return up0.d(up0.b(up0.d(es1Var.b, Math.round(Color.alpha(r3) * 0.0f)), up0.d(i, 255)), Color.alpha(i));
        }
        return i;
    }

    public final RectF d() {
        Rect bounds = getBounds();
        RectF rectF = this.k;
        rectF.set(bounds);
        return rectF;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Path path;
        float f;
        float f2;
        PorterDuffColorFilter porterDuffColorFilter = this.s;
        Paint paint = this.o;
        paint.setColorFilter(porterDuffColorFilter);
        int alpha = paint.getAlpha();
        int i = this.b.i;
        paint.setAlpha(((i + (i >>> 7)) * alpha) >>> 8);
        PorterDuffColorFilter porterDuffColorFilter2 = this.t;
        Paint paint2 = this.p;
        paint2.setColorFilter(porterDuffColorFilter2);
        this.b.getClass();
        paint2.setStrokeWidth(0.0f);
        int alpha2 = paint2.getAlpha();
        int i2 = this.b.i;
        paint2.setAlpha(((i2 + (i2 >>> 7)) * alpha2) >>> 8);
        e();
        pm5 pm5Var = this.b.a;
        getState();
        pm5Var.getClass();
        boolean e = pm5Var.e(d());
        Paint.Style style = this.b.l;
        if (style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.FILL) {
            boolean z = this.f;
            Path path2 = this.i;
            if (z) {
                if (!e) {
                    a(d(), path2);
                }
                this.f = false;
            }
            e();
            pm5 pm5Var2 = this.b.a;
            pm5Var2.getClass();
            RectF d = d();
            float b = b(d, pm5Var2);
            if (b >= 0.0f) {
                float f3 = b * this.b.h;
                canvas.drawRoundRect(d, f3, f3, paint);
            } else {
                canvas.drawPath(path2, paint);
            }
        }
        if (f()) {
            boolean z2 = this.g;
            RectF rectF = this.l;
            Path path3 = this.j;
            if (z2) {
                pm5 pm5Var3 = this.b.a;
                pm5Var3.getClass();
                pm5 f4 = pm5Var3.f();
                f11 f11Var = pm5Var3.f;
                af2 af2Var = this.a;
                f4.f = af2Var.b(f11Var);
                f4.g = af2Var.b(pm5Var3.g);
                f4.i = af2Var.b(pm5Var3.i);
                f4.h = af2Var.b(pm5Var3.h);
                pm5 a = f4.a();
                this.v = a;
                if (!e) {
                    float f5 = this.b.h;
                    rectF.set(d());
                    if (f()) {
                        f2 = paint2.getStrokeWidth() / 2.0f;
                    } else {
                        f2 = 0.0f;
                    }
                    rectF.inset(f2, f2);
                    this.r.a(a, f5, rectF, null, path3);
                    path = path3;
                } else {
                    path = path3;
                }
                this.g = false;
            } else {
                path = path3;
            }
            pm5 pm5Var4 = this.v;
            rectF.set(d());
            if (f()) {
                f = paint2.getStrokeWidth() / 2.0f;
            } else {
                f = 0.0f;
            }
            rectF.inset(f, f);
            float b2 = b(rectF, pm5Var4);
            if (b2 >= 0.0f) {
                float f6 = b2 * this.b.h;
                canvas.drawRoundRect(rectF, f6, f6, paint2);
            } else {
                canvas.drawPath(path, paint2);
            }
        }
        paint.setAlpha(alpha);
        paint2.setAlpha(alpha2);
    }

    public final boolean e() {
        fo3 fo3Var = this.b;
        fo3Var.getClass();
        if (fo3Var.j > 0) {
            pm5 pm5Var = this.b.a;
            getState();
            pm5Var.getClass();
            if (!pm5Var.e(d())) {
                this.i.isConvex();
                return false;
            }
            return false;
        }
        return false;
    }

    public final boolean f() {
        Paint.Style style = this.b.l;
        if ((style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.STROKE) && this.p.getStrokeWidth() > 0.0f) {
            return true;
        }
        return false;
    }

    public final void g(Context context) {
        this.b.b = new es1(context);
        this.b.getClass();
        this.b.j = (int) Math.ceil(0.0d);
        this.b.k = (int) Math.ceil(0.0d);
        i();
        e();
        pm5 pm5Var = this.b.a;
        getState();
        pm5Var.getClass();
        if (!pm5Var.e(d())) {
            invalidateSelf();
        } else {
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.b.i;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        return this.b;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        this.b.getClass();
        RectF d = d();
        if (d.isEmpty()) {
            return;
        }
        pm5 pm5Var = this.b.a;
        pm5Var.getClass();
        float b = b(d, pm5Var);
        if (b >= 0.0f) {
            outline.setRoundRect(getBounds(), b * this.b.h);
            return;
        }
        boolean z = this.f;
        Path path = this.i;
        if (z) {
            a(d, path);
            this.f = false;
        }
        if (Build.VERSION.SDK_INT >= 30) {
            lp1.a(outline, path);
        } else {
            try {
                kp1.a(outline, path);
            } catch (IllegalArgumentException unused) {
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(Rect rect) {
        Rect rect2 = this.b.f;
        if (rect2 != null) {
            rect.set(rect2);
            return true;
        }
        return super.getPadding(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public final Region getTransparentRegion() {
        Rect bounds = getBounds();
        Region region = this.m;
        region.set(bounds);
        RectF d = d();
        Path path = this.i;
        a(d, path);
        Region region2 = this.n;
        region2.setPath(path, region);
        region.op(region2, Region.Op.DIFFERENCE);
        return region;
    }

    public final boolean h(int[] iArr) {
        boolean z;
        Paint paint;
        int color;
        int colorForState;
        if (this.b.c != null && color != (colorForState = this.b.c.getColorForState(iArr, (color = (paint = this.o).getColor())))) {
            paint.setColor(colorForState);
            z = true;
        } else {
            z = false;
        }
        this.b.getClass();
        return z;
    }

    public final boolean i() {
        PorterDuffColorFilter porterDuffColorFilter;
        PorterDuffColorFilter porterDuffColorFilter2 = this.s;
        PorterDuffColorFilter porterDuffColorFilter3 = this.t;
        fo3 fo3Var = this.b;
        ColorStateList colorStateList = fo3Var.d;
        PorterDuff.Mode mode = fo3Var.e;
        if (colorStateList != null && mode != null) {
            porterDuffColorFilter = new PorterDuffColorFilter(c(colorStateList.getColorForState(getState(), 0)), mode);
        } else {
            int color = this.o.getColor();
            int c = c(color);
            if (c != color) {
                porterDuffColorFilter = new PorterDuffColorFilter(c, PorterDuff.Mode.SRC_IN);
            } else {
                porterDuffColorFilter = null;
            }
        }
        this.s = porterDuffColorFilter;
        this.b.getClass();
        this.t = null;
        this.b.getClass();
        if (Objects.equals(porterDuffColorFilter2, this.s) && Objects.equals(porterDuffColorFilter3, this.t)) {
            return false;
        }
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        this.f = true;
        this.g = true;
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        if (!super.isStateful()) {
            ColorStateList colorStateList = this.b.d;
            if (colorStateList == null || !colorStateList.isStateful()) {
                this.b.getClass();
                this.b.getClass();
                ColorStateList colorStateList2 = this.b.c;
                if (colorStateList2 == null || !colorStateList2.isStateful()) {
                    this.b.a.getClass();
                    return false;
                }
                return true;
            }
            return true;
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [android.graphics.drawable.Drawable$ConstantState, fo3] */
    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        fo3 fo3Var = this.b;
        ?? constantState = new Drawable.ConstantState();
        constantState.c = null;
        constantState.d = null;
        constantState.e = PorterDuff.Mode.SRC_IN;
        constantState.f = null;
        constantState.g = 1.0f;
        constantState.h = 1.0f;
        constantState.i = 255;
        constantState.j = 0;
        constantState.k = 0;
        constantState.l = Paint.Style.FILL_AND_STROKE;
        constantState.a = fo3Var.a;
        constantState.b = fo3Var.b;
        constantState.c = fo3Var.c;
        constantState.e = fo3Var.e;
        constantState.d = fo3Var.d;
        constantState.i = fo3Var.i;
        constantState.g = fo3Var.g;
        constantState.k = fo3Var.k;
        constantState.h = fo3Var.h;
        constantState.j = fo3Var.j;
        constantState.l = fo3Var.l;
        Rect rect = fo3Var.f;
        if (rect != null) {
            constantState.f = new Rect(rect);
        }
        this.b = constantState;
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        this.f = true;
        this.g = true;
        super.onBoundsChange(rect);
        this.b.a.getClass();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        boolean z;
        this.b.a.getClass();
        boolean h = h(iArr);
        boolean i = i();
        if (!h && !i) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            invalidateSelf();
        }
        return z;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        fo3 fo3Var = this.b;
        if (fo3Var.i != i) {
            fo3Var.i = i;
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.b.getClass();
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i) {
        setTintList(ColorStateList.valueOf(i));
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        this.b.d = colorStateList;
        i();
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        fo3 fo3Var = this.b;
        if (fo3Var.e != mode) {
            fo3Var.e = mode;
            i();
            super.invalidateSelf();
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Type inference failed for: r0v0, types: [android.graphics.drawable.Drawable$ConstantState, fo3] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public go3(defpackage.pm5 r4) {
        /*
            r3 = this;
            fo3 r0 = new fo3
            r0.<init>()
            r1 = 0
            r0.c = r1
            r0.d = r1
            android.graphics.PorterDuff$Mode r2 = android.graphics.PorterDuff.Mode.SRC_IN
            r0.e = r2
            r0.f = r1
            r2 = 1065353216(0x3f800000, float:1.0)
            r0.g = r2
            r0.h = r2
            r2 = 255(0xff, float:3.57E-43)
            r0.i = r2
            r2 = 0
            r0.j = r2
            r0.k = r2
            android.graphics.Paint$Style r2 = android.graphics.Paint.Style.FILL_AND_STROKE
            r0.l = r2
            r0.a = r4
            r0.b = r1
            r3.<init>(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.go3.<init>(pm5):void");
    }
}
