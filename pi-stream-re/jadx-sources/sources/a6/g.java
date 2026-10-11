package a6;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import com.google.android.material.chip.Chip;
import e6.h;
import e6.i;
import j6.j;
import j6.k;
import j6.m;
import java.lang.ref.WeakReference;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class g extends j6.g implements Drawable.Callback, h {
    public static final int[] X0 = {R.attr.state_enabled};
    public static final ShapeDrawable Y0 = new ShapeDrawable(new OvalShape());
    public final Path A0;
    public final i B0;
    public int C0;
    public int D0;
    public int E0;
    public int F0;
    public int G0;
    public int H0;
    public boolean I0;
    public int J0;
    public int K0;
    public ColorFilter L0;
    public PorterDuffColorFilter M0;
    public ColorStateList N0;
    public ColorStateList O;
    public PorterDuff.Mode O0;
    public ColorStateList P;
    public int[] P0;
    public float Q;
    public boolean Q0;
    public float R;
    public ColorStateList R0;
    public ColorStateList S;
    public WeakReference S0;
    public float T;
    public TextUtils.TruncateAt T0;
    public ColorStateList U;
    public boolean U0;
    public CharSequence V;
    public int V0;
    public boolean W;
    public boolean W0;
    public Drawable X;
    public ColorStateList Y;
    public float Z;

    /* renamed from: a0, reason: collision with root package name */
    public boolean f130a0;

    /* renamed from: b0, reason: collision with root package name */
    public boolean f131b0;

    /* renamed from: c0, reason: collision with root package name */
    public Drawable f132c0;

    /* renamed from: d0, reason: collision with root package name */
    public RippleDrawable f133d0;

    /* renamed from: e0, reason: collision with root package name */
    public ColorStateList f134e0;

    /* renamed from: f0, reason: collision with root package name */
    public float f135f0;

    /* renamed from: g0, reason: collision with root package name */
    public SpannableStringBuilder f136g0;

    /* renamed from: h0, reason: collision with root package name */
    public boolean f137h0;

    /* renamed from: i0, reason: collision with root package name */
    public boolean f138i0;

    /* renamed from: j0, reason: collision with root package name */
    public Drawable f139j0;

    /* renamed from: k0, reason: collision with root package name */
    public ColorStateList f140k0;

    /* renamed from: l0, reason: collision with root package name */
    public t5.b f141l0;

    /* renamed from: m0, reason: collision with root package name */
    public t5.b f142m0;

    /* renamed from: n0, reason: collision with root package name */
    public float f143n0;

    /* renamed from: o0, reason: collision with root package name */
    public float f144o0;

    /* renamed from: p0, reason: collision with root package name */
    public float f145p0;

    /* renamed from: q0, reason: collision with root package name */
    public float f146q0;

    /* renamed from: r0, reason: collision with root package name */
    public float f147r0;

    /* renamed from: s0, reason: collision with root package name */
    public float f148s0;

    /* renamed from: t0, reason: collision with root package name */
    public float f149t0;

    /* renamed from: u0, reason: collision with root package name */
    public float f150u0;

    /* renamed from: v0, reason: collision with root package name */
    public final Context f151v0;

    /* renamed from: w0, reason: collision with root package name */
    public final Paint f152w0;

    /* renamed from: x0, reason: collision with root package name */
    public final Paint.FontMetrics f153x0;

    /* renamed from: y0, reason: collision with root package name */
    public final RectF f154y0;

    /* renamed from: z0, reason: collision with root package name */
    public final PointF f155z0;

    public g(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, msr.pistream.app.R.attr.chipStyle, msr.pistream.app.R.style.Widget_MaterialComponents_Chip_Action);
        this.R = -1.0f;
        this.f152w0 = new Paint(1);
        this.f153x0 = new Paint.FontMetrics();
        this.f154y0 = new RectF();
        this.f155z0 = new PointF();
        this.A0 = new Path();
        this.K0 = 255;
        this.O0 = PorterDuff.Mode.SRC_IN;
        this.S0 = new WeakReference(null);
        h(context);
        this.f151v0 = context;
        i iVar = new i(this);
        this.B0 = iVar;
        this.V = "";
        iVar.f3587a.density = context.getResources().getDisplayMetrics().density;
        int[] iArr = X0;
        setState(iArr);
        if (!Arrays.equals(this.P0, iArr)) {
            this.P0 = iArr;
            if (T()) {
                v(getState(), iArr);
            }
        }
        this.U0 = true;
        int[] iArr2 = h6.a.f5008a;
        Y0.setTint(-1);
    }

    public static void U(Drawable drawable) {
        if (drawable != null) {
            drawable.setCallback(null);
        }
    }

    public static boolean s(ColorStateList colorStateList) {
        if (colorStateList != null && colorStateList.isStateful()) {
            return true;
        }
        return false;
    }

    public static boolean t(Drawable drawable) {
        if (drawable != null && drawable.isStateful()) {
            return true;
        }
        return false;
    }

    public final void A(float f10) {
        if (this.R != f10) {
            this.R = f10;
            k kVar = this.f6194a.f6174a;
            kVar.getClass();
            j jVar = new j(kVar);
            jVar.f6208e = new j6.a(f10);
            jVar.f6209f = new j6.a(f10);
            jVar.f6210g = new j6.a(f10);
            jVar.f6211h = new j6.a(f10);
            setShapeAppearanceModel(new k(jVar));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void B(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.X;
        Drawable drawable4 = null;
        if (drawable3 != 0) {
            boolean z9 = drawable3 instanceof a0.h;
            drawable2 = drawable3;
            if (z9) {
                ((a0.i) ((a0.h) drawable3)).getClass();
                drawable2 = null;
            }
        } else {
            drawable2 = null;
        }
        if (drawable2 != drawable) {
            float p3 = p();
            if (drawable != null) {
                drawable4 = drawable.mutate();
            }
            this.X = drawable4;
            float p9 = p();
            U(drawable2);
            if (S()) {
                n(this.X);
            }
            invalidateSelf();
            if (p3 != p9) {
                u();
            }
        }
    }

    public final void C(float f10) {
        if (this.Z != f10) {
            float p3 = p();
            this.Z = f10;
            float p9 = p();
            invalidateSelf();
            if (p3 != p9) {
                u();
            }
        }
    }

    public final void D(ColorStateList colorStateList) {
        this.f130a0 = true;
        if (this.Y != colorStateList) {
            this.Y = colorStateList;
            if (S()) {
                a0.b.h(this.X, colorStateList);
            }
            onStateChange(getState());
        }
    }

    public final void E(boolean z9) {
        boolean z10;
        if (this.W != z9) {
            boolean S = S();
            this.W = z9;
            boolean S2 = S();
            if (S != S2) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                if (S2) {
                    n(this.X);
                } else {
                    U(this.X);
                }
                invalidateSelf();
                u();
            }
        }
    }

    public final void F(ColorStateList colorStateList) {
        if (this.S != colorStateList) {
            this.S = colorStateList;
            if (this.W0) {
                j6.f fVar = this.f6194a;
                if (fVar.f6177d != colorStateList) {
                    fVar.f6177d = colorStateList;
                    onStateChange(getState());
                }
            }
            onStateChange(getState());
        }
    }

    public final void G(float f10) {
        if (this.T != f10) {
            this.T = f10;
            this.f152w0.setStrokeWidth(f10);
            if (this.W0) {
                this.f6194a.f6184k = f10;
                invalidateSelf();
            }
            invalidateSelf();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void H(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f132c0;
        Drawable drawable4 = null;
        if (drawable3 != 0) {
            boolean z9 = drawable3 instanceof a0.h;
            drawable2 = drawable3;
            if (z9) {
                ((a0.i) ((a0.h) drawable3)).getClass();
                drawable2 = null;
            }
        } else {
            drawable2 = null;
        }
        if (drawable2 != drawable) {
            float q9 = q();
            if (drawable != null) {
                drawable4 = drawable.mutate();
            }
            this.f132c0 = drawable4;
            int[] iArr = h6.a.f5008a;
            this.f133d0 = new RippleDrawable(h6.a.a(this.U), this.f132c0, Y0);
            float q10 = q();
            U(drawable2);
            if (T()) {
                n(this.f132c0);
            }
            invalidateSelf();
            if (q9 != q10) {
                u();
            }
        }
    }

    public final void I(float f10) {
        if (this.f149t0 != f10) {
            this.f149t0 = f10;
            invalidateSelf();
            if (T()) {
                u();
            }
        }
    }

    public final void J(float f10) {
        if (this.f135f0 != f10) {
            this.f135f0 = f10;
            invalidateSelf();
            if (T()) {
                u();
            }
        }
    }

    public final void K(float f10) {
        if (this.f148s0 != f10) {
            this.f148s0 = f10;
            invalidateSelf();
            if (T()) {
                u();
            }
        }
    }

    public final void L(ColorStateList colorStateList) {
        if (this.f134e0 != colorStateList) {
            this.f134e0 = colorStateList;
            if (T()) {
                a0.b.h(this.f132c0, colorStateList);
            }
            onStateChange(getState());
        }
    }

    public final void M(boolean z9) {
        boolean z10;
        if (this.f131b0 != z9) {
            boolean T = T();
            this.f131b0 = z9;
            boolean T2 = T();
            if (T != T2) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                if (T2) {
                    n(this.f132c0);
                } else {
                    U(this.f132c0);
                }
                invalidateSelf();
                u();
            }
        }
    }

    public final void N(float f10) {
        if (this.f145p0 != f10) {
            float p3 = p();
            this.f145p0 = f10;
            float p9 = p();
            invalidateSelf();
            if (p3 != p9) {
                u();
            }
        }
    }

    public final void O(float f10) {
        if (this.f144o0 != f10) {
            float p3 = p();
            this.f144o0 = f10;
            float p9 = p();
            invalidateSelf();
            if (p3 != p9) {
                u();
            }
        }
    }

    public final void P(ColorStateList colorStateList) {
        ColorStateList colorStateList2;
        if (this.U != colorStateList) {
            this.U = colorStateList;
            if (this.Q0) {
                colorStateList2 = h6.a.a(colorStateList);
            } else {
                colorStateList2 = null;
            }
            this.R0 = colorStateList2;
            onStateChange(getState());
        }
    }

    public final void Q(g6.d dVar) {
        i iVar = this.B0;
        if (iVar.f3592f != dVar) {
            iVar.f3592f = dVar;
            if (dVar != null) {
                TextPaint textPaint = iVar.f3587a;
                Context context = this.f151v0;
                c cVar = iVar.f3588b;
                dVar.f(context, textPaint, cVar);
                h hVar = (h) iVar.f3591e.get();
                if (hVar != null) {
                    textPaint.drawableState = hVar.getState();
                }
                dVar.e(context, textPaint, cVar);
                iVar.f3590d = true;
            }
            h hVar2 = (h) iVar.f3591e.get();
            if (hVar2 != null) {
                g gVar = (g) hVar2;
                gVar.u();
                gVar.invalidateSelf();
                gVar.onStateChange(hVar2.getState());
            }
        }
    }

    public final boolean R() {
        if (this.f138i0 && this.f139j0 != null && this.I0) {
            return true;
        }
        return false;
    }

    public final boolean S() {
        if (this.W && this.X != null) {
            return true;
        }
        return false;
    }

    public final boolean T() {
        if (this.f131b0 && this.f132c0 != null) {
            return true;
        }
        return false;
    }

    @Override // j6.g, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        int i10;
        int i11;
        RectF rectF;
        int i12;
        int i13;
        int i14;
        RectF rectF2;
        float f10;
        boolean z9;
        int i15;
        Rect bounds = getBounds();
        if (!bounds.isEmpty() && (i10 = this.K0) != 0) {
            if (i10 < 255) {
                i11 = canvas.saveLayerAlpha(bounds.left, bounds.top, bounds.right, bounds.bottom, i10);
            } else {
                i11 = 0;
            }
            boolean z10 = this.W0;
            Paint paint = this.f152w0;
            RectF rectF3 = this.f154y0;
            if (!z10) {
                paint.setColor(this.C0);
                paint.setStyle(Paint.Style.FILL);
                rectF3.set(bounds);
                canvas.drawRoundRect(rectF3, r(), r(), paint);
            }
            if (!this.W0) {
                paint.setColor(this.D0);
                paint.setStyle(Paint.Style.FILL);
                ColorFilter colorFilter = this.L0;
                if (colorFilter == null) {
                    colorFilter = this.M0;
                }
                paint.setColorFilter(colorFilter);
                rectF3.set(bounds);
                canvas.drawRoundRect(rectF3, r(), r(), paint);
            }
            if (this.W0) {
                super.draw(canvas);
            }
            float f11 = 0.0f;
            if (this.T > 0.0f && !this.W0) {
                paint.setColor(this.F0);
                paint.setStyle(Paint.Style.STROKE);
                if (!this.W0) {
                    ColorFilter colorFilter2 = this.L0;
                    if (colorFilter2 == null) {
                        colorFilter2 = this.M0;
                    }
                    paint.setColorFilter(colorFilter2);
                }
                float f12 = bounds.left;
                float f13 = this.T / 2.0f;
                rectF3.set(f12 + f13, bounds.top + f13, bounds.right - f13, bounds.bottom - f13);
                float f14 = this.R - (this.T / 2.0f);
                canvas.drawRoundRect(rectF3, f14, f14, paint);
            }
            paint.setColor(this.G0);
            paint.setStyle(Paint.Style.FILL);
            rectF3.set(bounds);
            if (!this.W0) {
                canvas.drawRoundRect(rectF3, r(), r(), paint);
            } else {
                RectF rectF4 = new RectF(bounds);
                Path path = this.A0;
                m mVar = this.I;
                j6.f fVar = this.f6194a;
                mVar.a(fVar.f6174a, fVar.f6183j, rectF4, this.H, path);
                e(canvas, paint, path, this.f6194a.f6174a, g());
            }
            if (S()) {
                o(bounds, rectF3);
                float f15 = rectF3.left;
                float f16 = rectF3.top;
                canvas.translate(f15, f16);
                this.X.setBounds(0, 0, (int) rectF3.width(), (int) rectF3.height());
                this.X.draw(canvas);
                canvas.translate(-f15, -f16);
            }
            if (R()) {
                o(bounds, rectF3);
                float f17 = rectF3.left;
                float f18 = rectF3.top;
                canvas.translate(f17, f18);
                this.f139j0.setBounds(0, 0, (int) rectF3.width(), (int) rectF3.height());
                this.f139j0.draw(canvas);
                canvas.translate(-f17, -f18);
            }
            if (this.U0 && this.V != null) {
                PointF pointF = this.f155z0;
                pointF.set(0.0f, 0.0f);
                Paint.Align align = Paint.Align.LEFT;
                CharSequence charSequence = this.V;
                i iVar = this.B0;
                if (charSequence != null) {
                    float p3 = p() + this.f143n0 + this.f146q0;
                    if (a0.c.a(this) == 0) {
                        pointF.x = bounds.left + p3;
                        align = Paint.Align.LEFT;
                    } else {
                        pointF.x = bounds.right - p3;
                        align = Paint.Align.RIGHT;
                    }
                    float centerY = bounds.centerY();
                    TextPaint textPaint = iVar.f3587a;
                    Paint.FontMetrics fontMetrics = this.f153x0;
                    textPaint.getFontMetrics(fontMetrics);
                    pointF.y = centerY - ((fontMetrics.descent + fontMetrics.ascent) / 2.0f);
                }
                rectF3.setEmpty();
                if (this.V != null) {
                    float p9 = p() + this.f143n0 + this.f146q0;
                    float q9 = q() + this.f150u0 + this.f147r0;
                    if (a0.c.a(this) == 0) {
                        rectF3.left = bounds.left + p9;
                        rectF3.right = bounds.right - q9;
                    } else {
                        rectF3.left = bounds.left + q9;
                        rectF3.right = bounds.right - p9;
                    }
                    rectF3.top = bounds.top;
                    rectF3.bottom = bounds.bottom;
                }
                g6.d dVar = iVar.f3592f;
                TextPaint textPaint2 = iVar.f3587a;
                if (dVar != null) {
                    textPaint2.drawableState = getState();
                    iVar.f3592f.e(this.f151v0, textPaint2, iVar.f3588b);
                }
                textPaint2.setTextAlign(align);
                String charSequence2 = this.V.toString();
                if (!iVar.f3590d) {
                    f10 = iVar.f3589c;
                } else {
                    if (charSequence2 != null) {
                        f11 = textPaint2.measureText((CharSequence) charSequence2, 0, charSequence2.length());
                    }
                    iVar.f3589c = f11;
                    iVar.f3590d = false;
                    f10 = f11;
                }
                if (Math.round(f10) > Math.round(rectF3.width())) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                if (z9) {
                    i15 = canvas.save();
                    canvas.clipRect(rectF3);
                } else {
                    i15 = 0;
                }
                CharSequence charSequence3 = this.V;
                if (z9 && this.T0 != null) {
                    charSequence3 = TextUtils.ellipsize(charSequence3, textPaint2, rectF3.width(), this.T0);
                }
                CharSequence charSequence4 = charSequence3;
                int length = charSequence4.length();
                float f19 = pointF.x;
                float f20 = pointF.y;
                rectF = rectF3;
                i12 = i11;
                i13 = 255;
                i14 = 0;
                canvas.drawText(charSequence4, 0, length, f19, f20, textPaint2);
                if (z9) {
                    canvas.restoreToCount(i15);
                }
            } else {
                rectF = rectF3;
                i12 = i11;
                i13 = 255;
                i14 = 0;
            }
            if (T()) {
                rectF.setEmpty();
                if (T()) {
                    float f21 = this.f150u0 + this.f149t0;
                    if (a0.c.a(this) == 0) {
                        float f22 = bounds.right - f21;
                        rectF2 = rectF;
                        rectF2.right = f22;
                        rectF2.left = f22 - this.f135f0;
                    } else {
                        rectF2 = rectF;
                        float f23 = bounds.left + f21;
                        rectF2.left = f23;
                        rectF2.right = f23 + this.f135f0;
                    }
                    float exactCenterY = bounds.exactCenterY();
                    float f24 = this.f135f0;
                    float f25 = exactCenterY - (f24 / 2.0f);
                    rectF2.top = f25;
                    rectF2.bottom = f25 + f24;
                } else {
                    rectF2 = rectF;
                }
                float f26 = rectF2.left;
                float f27 = rectF2.top;
                canvas.translate(f26, f27);
                this.f132c0.setBounds(i14, i14, (int) rectF2.width(), (int) rectF2.height());
                int[] iArr = h6.a.f5008a;
                this.f133d0.setBounds(this.f132c0.getBounds());
                this.f133d0.jumpToCurrentState();
                this.f133d0.draw(canvas);
                canvas.translate(-f26, -f27);
            }
            if (this.K0 < i13) {
                canvas.restoreToCount(i12);
            }
        }
    }

    @Override // j6.g, android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.K0;
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        return this.L0;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return (int) this.Q;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        float measureText;
        float p3 = p() + this.f143n0 + this.f146q0;
        String charSequence = this.V.toString();
        i iVar = this.B0;
        if (!iVar.f3590d) {
            measureText = iVar.f3589c;
        } else {
            if (charSequence == null) {
                measureText = 0.0f;
            } else {
                measureText = iVar.f3587a.measureText((CharSequence) charSequence, 0, charSequence.length());
            }
            iVar.f3589c = measureText;
            iVar.f3590d = false;
        }
        return Math.min(Math.round(q() + measureText + p3 + this.f147r0 + this.f150u0), this.V0);
    }

    @Override // j6.g, android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // j6.g, android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        if (this.W0) {
            super.getOutline(outline);
            return;
        }
        Rect bounds = getBounds();
        if (!bounds.isEmpty()) {
            outline.setRoundRect(bounds, this.R);
        } else {
            outline.setRoundRect(0, 0, getIntrinsicWidth(), (int) this.Q, this.R);
        }
        outline.setAlpha(this.K0 / 255.0f);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    @Override // j6.g, android.graphics.drawable.Drawable
    public final boolean isStateful() {
        boolean z9;
        boolean z10;
        ColorStateList colorStateList;
        if (s(this.O) || s(this.P) || s(this.S)) {
            return true;
        }
        if (this.Q0 && s(this.R0)) {
            return true;
        }
        g6.d dVar = this.B0.f3592f;
        if (dVar != null && (colorStateList = dVar.f4479j) != null && colorStateList.isStateful()) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (z9) {
            return true;
        }
        if (this.f138i0 && this.f139j0 != null && this.f137h0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10 || t(this.X) || t(this.f139j0) || s(this.N0)) {
            return true;
        }
        return false;
    }

    public final void n(Drawable drawable) {
        if (drawable == null) {
            return;
        }
        drawable.setCallback(this);
        a0.c.b(drawable, a0.c.a(this));
        drawable.setLevel(getLevel());
        drawable.setVisible(isVisible(), false);
        if (drawable == this.f132c0) {
            if (drawable.isStateful()) {
                drawable.setState(this.P0);
            }
            a0.b.h(drawable, this.f134e0);
            return;
        }
        Drawable drawable2 = this.X;
        if (drawable == drawable2 && this.f130a0) {
            a0.b.h(drawable2, this.Y);
        }
        if (drawable.isStateful()) {
            drawable.setState(getState());
        }
    }

    public final void o(Rect rect, RectF rectF) {
        Drawable drawable;
        Drawable drawable2;
        float f10;
        rectF.setEmpty();
        if (S() || R()) {
            float f11 = this.f143n0 + this.f144o0;
            if (this.I0) {
                drawable = this.f139j0;
            } else {
                drawable = this.X;
            }
            float f12 = this.Z;
            if (f12 <= 0.0f && drawable != null) {
                f12 = drawable.getIntrinsicWidth();
            }
            if (a0.c.a(this) == 0) {
                float f13 = rect.left + f11;
                rectF.left = f13;
                rectF.right = f13 + f12;
            } else {
                float f14 = rect.right - f11;
                rectF.right = f14;
                rectF.left = f14 - f12;
            }
            if (this.I0) {
                drawable2 = this.f139j0;
            } else {
                drawable2 = this.X;
            }
            float f15 = this.Z;
            if (f15 <= 0.0f && drawable2 != null) {
                f15 = (float) Math.ceil(TypedValue.applyDimension(1, 24, this.f151v0.getResources().getDisplayMetrics()));
                if (drawable2.getIntrinsicHeight() <= f15) {
                    f10 = drawable2.getIntrinsicHeight();
                    float exactCenterY = rect.exactCenterY() - (f10 / 2.0f);
                    rectF.top = exactCenterY;
                    rectF.bottom = exactCenterY + f10;
                }
            }
            f10 = f15;
            float exactCenterY2 = rect.exactCenterY() - (f10 / 2.0f);
            rectF.top = exactCenterY2;
            rectF.bottom = exactCenterY2 + f10;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLayoutDirectionChanged(int i10) {
        boolean onLayoutDirectionChanged = super.onLayoutDirectionChanged(i10);
        if (S()) {
            onLayoutDirectionChanged |= a0.c.b(this.X, i10);
        }
        if (R()) {
            onLayoutDirectionChanged |= a0.c.b(this.f139j0, i10);
        }
        if (T()) {
            onLayoutDirectionChanged |= a0.c.b(this.f132c0, i10);
        }
        if (onLayoutDirectionChanged) {
            invalidateSelf();
            return true;
        }
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i10) {
        boolean onLevelChange = super.onLevelChange(i10);
        if (S()) {
            onLevelChange |= this.X.setLevel(i10);
        }
        if (R()) {
            onLevelChange |= this.f139j0.setLevel(i10);
        }
        if (T()) {
            onLevelChange |= this.f132c0.setLevel(i10);
        }
        if (onLevelChange) {
            invalidateSelf();
        }
        return onLevelChange;
    }

    @Override // j6.g, android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        if (this.W0) {
            super.onStateChange(iArr);
        }
        return v(iArr, this.P0);
    }

    public final float p() {
        Drawable drawable;
        if (!S() && !R()) {
            return 0.0f;
        }
        float f10 = this.f144o0;
        if (this.I0) {
            drawable = this.f139j0;
        } else {
            drawable = this.X;
        }
        float f11 = this.Z;
        if (f11 <= 0.0f && drawable != null) {
            f11 = drawable.getIntrinsicWidth();
        }
        return f11 + f10 + this.f145p0;
    }

    public final float q() {
        if (T()) {
            return this.f148s0 + this.f135f0 + this.f149t0;
        }
        return 0.0f;
    }

    public final float r() {
        if (this.W0) {
            return this.f6194a.f6174a.f6220e.a(g());
        }
        return this.R;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j4) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.scheduleDrawable(this, runnable, j4);
        }
    }

    @Override // j6.g, android.graphics.drawable.Drawable
    public final void setAlpha(int i10) {
        if (this.K0 != i10) {
            this.K0 = i10;
            invalidateSelf();
        }
    }

    @Override // j6.g, android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        if (this.L0 != colorFilter) {
            this.L0 = colorFilter;
            invalidateSelf();
        }
    }

    @Override // j6.g, android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        if (this.N0 != colorStateList) {
            this.N0 = colorStateList;
            onStateChange(getState());
        }
    }

    @Override // j6.g, android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        PorterDuffColorFilter porterDuffColorFilter;
        if (this.O0 != mode) {
            this.O0 = mode;
            ColorStateList colorStateList = this.N0;
            if (colorStateList != null && mode != null) {
                porterDuffColorFilter = new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
            } else {
                porterDuffColorFilter = null;
            }
            this.M0 = porterDuffColorFilter;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z9, boolean z10) {
        boolean visible = super.setVisible(z9, z10);
        if (S()) {
            visible |= this.X.setVisible(z9, z10);
        }
        if (R()) {
            visible |= this.f139j0.setVisible(z9, z10);
        }
        if (T()) {
            visible |= this.f132c0.setVisible(z9, z10);
        }
        if (visible) {
            invalidateSelf();
        }
        return visible;
    }

    public final void u() {
        f fVar = (f) this.S0.get();
        if (fVar != null) {
            Chip chip = (Chip) fVar;
            chip.b(chip.G);
            chip.requestLayout();
            chip.invalidateOutline();
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.unscheduleDrawable(this, runnable);
        }
    }

    public final boolean v(int[] iArr, int[] iArr2) {
        int i10;
        int i11;
        boolean z9;
        boolean z10;
        int i12;
        int i13;
        int i14;
        boolean z11;
        boolean z12;
        boolean z13;
        int i15;
        PorterDuffColorFilter porterDuffColorFilter;
        ColorStateList colorStateList;
        boolean onStateChange = super.onStateChange(iArr);
        ColorStateList colorStateList2 = this.O;
        if (colorStateList2 != null) {
            i10 = colorStateList2.getColorForState(iArr, this.C0);
        } else {
            i10 = 0;
        }
        int c6 = c(i10);
        boolean z14 = true;
        if (this.C0 != c6) {
            this.C0 = c6;
            onStateChange = true;
        }
        ColorStateList colorStateList3 = this.P;
        if (colorStateList3 != null) {
            i11 = colorStateList3.getColorForState(iArr, this.D0);
        } else {
            i11 = 0;
        }
        int c10 = c(i11);
        if (this.D0 != c10) {
            this.D0 = c10;
            onStateChange = true;
        }
        int b10 = z.a.b(c10, c6);
        if (this.E0 != b10) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (this.f6194a.f6176c == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z9 | z10) {
            this.E0 = b10;
            j(ColorStateList.valueOf(b10));
            onStateChange = true;
        }
        ColorStateList colorStateList4 = this.S;
        if (colorStateList4 != null) {
            i12 = colorStateList4.getColorForState(iArr, this.F0);
        } else {
            i12 = 0;
        }
        if (this.F0 != i12) {
            this.F0 = i12;
            onStateChange = true;
        }
        if (this.R0 != null && h6.a.b(iArr)) {
            i13 = this.R0.getColorForState(iArr, this.G0);
        } else {
            i13 = 0;
        }
        if (this.G0 != i13) {
            this.G0 = i13;
            if (this.Q0) {
                onStateChange = true;
            }
        }
        g6.d dVar = this.B0.f3592f;
        if (dVar != null && (colorStateList = dVar.f4479j) != null) {
            i14 = colorStateList.getColorForState(iArr, this.H0);
        } else {
            i14 = 0;
        }
        if (this.H0 != i14) {
            this.H0 = i14;
            onStateChange = true;
        }
        int[] state = getState();
        if (state != null) {
            for (int i16 : state) {
                if (i16 == 16842912) {
                    z11 = true;
                    break;
                }
            }
        }
        z11 = false;
        if (z11 && this.f137h0) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (this.I0 != z12 && this.f139j0 != null) {
            float p3 = p();
            this.I0 = z12;
            if (p3 != p()) {
                onStateChange = true;
                z13 = true;
            } else {
                z13 = false;
                onStateChange = true;
            }
        } else {
            z13 = false;
        }
        ColorStateList colorStateList5 = this.N0;
        if (colorStateList5 != null) {
            i15 = colorStateList5.getColorForState(iArr, this.J0);
        } else {
            i15 = 0;
        }
        if (this.J0 != i15) {
            this.J0 = i15;
            ColorStateList colorStateList6 = this.N0;
            PorterDuff.Mode mode = this.O0;
            if (colorStateList6 != null && mode != null) {
                porterDuffColorFilter = new PorterDuffColorFilter(colorStateList6.getColorForState(getState(), 0), mode);
            } else {
                porterDuffColorFilter = null;
            }
            this.M0 = porterDuffColorFilter;
        } else {
            z14 = onStateChange;
        }
        if (t(this.X)) {
            z14 |= this.X.setState(iArr);
        }
        if (t(this.f139j0)) {
            z14 |= this.f139j0.setState(iArr);
        }
        if (t(this.f132c0)) {
            int[] iArr3 = new int[iArr.length + iArr2.length];
            System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
            System.arraycopy(iArr2, 0, iArr3, iArr.length, iArr2.length);
            z14 |= this.f132c0.setState(iArr3);
        }
        int[] iArr4 = h6.a.f5008a;
        if (t(this.f133d0)) {
            z14 |= this.f133d0.setState(iArr2);
        }
        if (z14) {
            invalidateSelf();
        }
        if (z13) {
            u();
        }
        return z14;
    }

    public final void w(boolean z9) {
        if (this.f137h0 != z9) {
            this.f137h0 = z9;
            float p3 = p();
            if (!z9 && this.I0) {
                this.I0 = false;
            }
            float p9 = p();
            invalidateSelf();
            if (p3 != p9) {
                u();
            }
        }
    }

    public final void x(Drawable drawable) {
        if (this.f139j0 != drawable) {
            float p3 = p();
            this.f139j0 = drawable;
            float p9 = p();
            U(this.f139j0);
            n(this.f139j0);
            invalidateSelf();
            if (p3 != p9) {
                u();
            }
        }
    }

    public final void y(ColorStateList colorStateList) {
        boolean z9;
        if (this.f140k0 != colorStateList) {
            this.f140k0 = colorStateList;
            if (this.f138i0 && this.f139j0 != null && this.f137h0) {
                z9 = true;
            } else {
                z9 = false;
            }
            if (z9) {
                a0.b.h(this.f139j0, colorStateList);
            }
            onStateChange(getState());
        }
    }

    public final void z(boolean z9) {
        boolean z10;
        if (this.f138i0 != z9) {
            boolean R = R();
            this.f138i0 = z9;
            boolean R2 = R();
            if (R != R2) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                if (R2) {
                    n(this.f139j0);
                } else {
                    U(this.f139j0);
                }
                invalidateSelf();
                u();
            }
        }
    }
}
