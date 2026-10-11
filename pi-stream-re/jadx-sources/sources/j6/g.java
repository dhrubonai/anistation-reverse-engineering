package j6;

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
import android.os.Looper;
import android.util.AttributeSet;
import android.util.Log;
import java.util.BitSet;

/* loaded from: classes.dex */
public class g extends Drawable implements v {
    public static final Paint N;
    public final RectF A;
    public final Region B;
    public final Region C;
    public k D;
    public final Paint E;
    public final Paint F;
    public final i6.a G;
    public final k3.d H;
    public final m I;
    public PorterDuffColorFilter J;
    public PorterDuffColorFilter K;
    public final RectF L;
    public final boolean M;

    /* renamed from: a, reason: collision with root package name */
    public f f6194a;

    /* renamed from: b, reason: collision with root package name */
    public final t[] f6195b;

    /* renamed from: c, reason: collision with root package name */
    public final t[] f6196c;

    /* renamed from: d, reason: collision with root package name */
    public final BitSet f6197d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f6198e;

    /* renamed from: f, reason: collision with root package name */
    public final Matrix f6199f;

    /* renamed from: x, reason: collision with root package name */
    public final Path f6200x;

    /* renamed from: y, reason: collision with root package name */
    public final Path f6201y;

    /* renamed from: z, reason: collision with root package name */
    public final RectF f6202z;

    static {
        Paint paint = new Paint(1);
        N = paint;
        paint.setColor(-1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
    }

    public g() {
        this(new k());
    }

    public final void a(RectF rectF, Path path) {
        m mVar = this.I;
        f fVar = this.f6194a;
        mVar.a(fVar.f6174a, fVar.f6183j, rectF, this.H, path);
        if (this.f6194a.f6182i != 1.0f) {
            Matrix matrix = this.f6199f;
            matrix.reset();
            float f10 = this.f6194a.f6182i;
            matrix.setScale(f10, f10, rectF.width() / 2.0f, rectF.height() / 2.0f);
            path.transform(matrix);
        }
        path.computeBounds(this.L, true);
    }

    public final PorterDuffColorFilter b(ColorStateList colorStateList, PorterDuff.Mode mode, Paint paint, boolean z9) {
        PorterDuffColorFilter porterDuffColorFilter;
        int color;
        int c6;
        if (colorStateList != null && mode != null) {
            int colorForState = colorStateList.getColorForState(getState(), 0);
            if (z9) {
                colorForState = c(colorForState);
            }
            return new PorterDuffColorFilter(colorForState, mode);
        }
        if (z9 && (c6 = c((color = paint.getColor()))) != color) {
            porterDuffColorFilter = new PorterDuffColorFilter(c6, PorterDuff.Mode.SRC_IN);
        } else {
            porterDuffColorFilter = null;
        }
        return porterDuffColorFilter;
    }

    public final int c(int i10) {
        boolean z9;
        float f10;
        int i11;
        f fVar = this.f6194a;
        float f11 = fVar.f6187n + fVar.o + fVar.f6186m;
        d6.a aVar = fVar.f6175b;
        if (aVar != null && aVar.f3233a) {
            if (z.a.c(i10, 255) == aVar.f3236d) {
                z9 = true;
            } else {
                z9 = false;
            }
            if (z9) {
                if (aVar.f3237e > 0.0f && f11 > 0.0f) {
                    f10 = Math.min(((((float) Math.log1p(f11 / r3)) * 4.5f) + 2.0f) / 100.0f, 1.0f);
                } else {
                    f10 = 0.0f;
                }
                int alpha = Color.alpha(i10);
                int F = q6.g.F(f10, z.a.c(i10, 255), aVar.f3234b);
                if (f10 > 0.0f && (i11 = aVar.f3235c) != 0) {
                    F = z.a.b(z.a.c(i11, d6.a.f3232f), F);
                }
                return z.a.c(F, alpha);
            }
            return i10;
        }
        return i10;
    }

    public final void d(Canvas canvas) {
        if (this.f6197d.cardinality() > 0) {
            Log.w("g", "Compatibility shadow requested but can't be drawn for all operations in this shape.");
        }
        int i10 = this.f6194a.f6190r;
        Path path = this.f6200x;
        i6.a aVar = this.G;
        if (i10 != 0) {
            canvas.drawPath(path, aVar.f5390a);
        }
        for (int i11 = 0; i11 < 4; i11++) {
            t tVar = this.f6195b[i11];
            int i12 = this.f6194a.f6189q;
            Matrix matrix = t.f6257b;
            tVar.a(matrix, aVar, i12, canvas);
            this.f6196c[i11].a(matrix, aVar, this.f6194a.f6189q, canvas);
        }
        if (this.M) {
            f fVar = this.f6194a;
            int sin = (int) (Math.sin(Math.toRadians(fVar.f6191s)) * fVar.f6190r);
            f fVar2 = this.f6194a;
            int cos = (int) (Math.cos(Math.toRadians(fVar2.f6191s)) * fVar2.f6190r);
            canvas.translate(-sin, -cos);
            canvas.drawPath(path, N);
            canvas.translate(sin, cos);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x0128, code lost:
    
        if (r0 != false) goto L58;
     */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0214  */
    @Override // android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void draw(android.graphics.Canvas r22) {
        /*
            Method dump skipped, instructions count: 550
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: j6.g.draw(android.graphics.Canvas):void");
    }

    public final void e(Canvas canvas, Paint paint, Path path, k kVar, RectF rectF) {
        if (kVar.d(rectF)) {
            float a10 = kVar.f6221f.a(rectF) * this.f6194a.f6183j;
            canvas.drawRoundRect(rectF, a10, a10, paint);
        } else {
            canvas.drawPath(path, paint);
        }
    }

    public void f(Canvas canvas) {
        boolean z9;
        Paint paint = this.F;
        Path path = this.f6201y;
        k kVar = this.D;
        RectF rectF = this.A;
        rectF.set(g());
        Paint.Style style = this.f6194a.f6193u;
        float f10 = 0.0f;
        if ((style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.STROKE) && paint.getStrokeWidth() > 0.0f) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (z9) {
            f10 = paint.getStrokeWidth() / 2.0f;
        }
        rectF.inset(f10, f10);
        e(canvas, paint, path, kVar, rectF);
    }

    public final RectF g() {
        RectF rectF = this.f6202z;
        rectF.set(getBounds());
        return rectF;
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f6194a.f6185l;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        return this.f6194a;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        f fVar = this.f6194a;
        if (fVar.f6188p == 2) {
            return;
        }
        if (fVar.f6174a.d(g())) {
            outline.setRoundRect(getBounds(), this.f6194a.f6174a.f6220e.a(g()) * this.f6194a.f6183j);
            return;
        }
        RectF g10 = g();
        Path path = this.f6200x;
        a(g10, path);
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 30) {
            outline.setPath(path);
            return;
        }
        if (i10 >= 29) {
            try {
                outline.setConvexPath(path);
            } catch (IllegalArgumentException unused) {
            }
        } else if (path.isConvex()) {
            outline.setConvexPath(path);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(Rect rect) {
        Rect rect2 = this.f6194a.f6181h;
        if (rect2 != null) {
            rect.set(rect2);
            return true;
        }
        return super.getPadding(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public final Region getTransparentRegion() {
        Rect bounds = getBounds();
        Region region = this.B;
        region.set(bounds);
        RectF g10 = g();
        Path path = this.f6200x;
        a(g10, path);
        Region region2 = this.C;
        region2.setPath(path, region);
        region.op(region2, Region.Op.DIFFERENCE);
        return region;
    }

    public final void h(Context context) {
        this.f6194a.f6175b = new d6.a(context);
        m();
    }

    public final void i(float f10) {
        f fVar = this.f6194a;
        if (fVar.f6187n != f10) {
            fVar.f6187n = f10;
            m();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        this.f6198e = true;
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        ColorStateList colorStateList3;
        ColorStateList colorStateList4;
        if (!super.isStateful() && (((colorStateList = this.f6194a.f6179f) == null || !colorStateList.isStateful()) && (((colorStateList2 = this.f6194a.f6178e) == null || !colorStateList2.isStateful()) && (((colorStateList3 = this.f6194a.f6177d) == null || !colorStateList3.isStateful()) && ((colorStateList4 = this.f6194a.f6176c) == null || !colorStateList4.isStateful()))))) {
            return false;
        }
        return true;
    }

    public final void j(ColorStateList colorStateList) {
        f fVar = this.f6194a;
        if (fVar.f6176c != colorStateList) {
            fVar.f6176c = colorStateList;
            onStateChange(getState());
        }
    }

    public final boolean k(int[] iArr) {
        boolean z9;
        Paint paint;
        int color;
        int colorForState;
        Paint paint2;
        int color2;
        int colorForState2;
        if (this.f6194a.f6176c != null && color2 != (colorForState2 = this.f6194a.f6176c.getColorForState(iArr, (color2 = (paint2 = this.E).getColor())))) {
            paint2.setColor(colorForState2);
            z9 = true;
        } else {
            z9 = false;
        }
        if (this.f6194a.f6177d != null && color != (colorForState = this.f6194a.f6177d.getColorForState(iArr, (color = (paint = this.F).getColor())))) {
            paint.setColor(colorForState);
            return true;
        }
        return z9;
    }

    public final boolean l() {
        PorterDuffColorFilter porterDuffColorFilter = this.J;
        PorterDuffColorFilter porterDuffColorFilter2 = this.K;
        f fVar = this.f6194a;
        this.J = b(fVar.f6179f, fVar.f6180g, this.E, true);
        f fVar2 = this.f6194a;
        this.K = b(fVar2.f6178e, fVar2.f6180g, this.F, false);
        f fVar3 = this.f6194a;
        if (fVar3.f6192t) {
            this.G.a(fVar3.f6179f.getColorForState(getState(), 0));
        }
        if (!f0.b.a(porterDuffColorFilter, this.J) || !f0.b.a(porterDuffColorFilter2, this.K)) {
            return true;
        }
        return false;
    }

    public final void m() {
        f fVar = this.f6194a;
        float f10 = fVar.f6187n + fVar.o;
        fVar.f6189q = (int) Math.ceil(0.75f * f10);
        this.f6194a.f6190r = (int) Math.ceil(f10 * 0.25f);
        l();
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        this.f6194a = new f(this.f6194a);
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        this.f6198e = true;
        super.onBoundsChange(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        boolean z9;
        boolean k10 = k(iArr);
        boolean l10 = l();
        if (!k10 && !l10) {
            z9 = false;
        } else {
            z9 = true;
        }
        if (z9) {
            invalidateSelf();
        }
        return z9;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        f fVar = this.f6194a;
        if (fVar.f6185l != i10) {
            fVar.f6185l = i10;
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f6194a.getClass();
        super.invalidateSelf();
    }

    @Override // j6.v
    public final void setShapeAppearanceModel(k kVar) {
        this.f6194a.f6174a = kVar;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i10) {
        setTintList(ColorStateList.valueOf(i10));
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        this.f6194a.f6179f = colorStateList;
        l();
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        f fVar = this.f6194a;
        if (fVar.f6180g != mode) {
            fVar.f6180g = mode;
            l();
            super.invalidateSelf();
        }
    }

    public g(Context context, AttributeSet attributeSet, int i10, int i11) {
        this(k.b(context, attributeSet, i10, i11).a());
    }

    public g(k kVar) {
        this(new f(kVar));
    }

    public g(f fVar) {
        m mVar;
        this.f6195b = new t[4];
        this.f6196c = new t[4];
        this.f6197d = new BitSet(8);
        this.f6199f = new Matrix();
        this.f6200x = new Path();
        this.f6201y = new Path();
        this.f6202z = new RectF();
        this.A = new RectF();
        this.B = new Region();
        this.C = new Region();
        Paint paint = new Paint(1);
        this.E = paint;
        Paint paint2 = new Paint(1);
        this.F = paint2;
        this.G = new i6.a();
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            mVar = l.f6228a;
        } else {
            mVar = new m();
        }
        this.I = mVar;
        this.L = new RectF();
        this.M = true;
        this.f6194a = fVar;
        paint2.setStyle(Paint.Style.STROKE);
        paint.setStyle(Paint.Style.FILL);
        l();
        k(getState());
        this.H = new k3.d(this, 24);
    }
}
