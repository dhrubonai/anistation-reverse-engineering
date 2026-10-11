package e6;

import android.animation.TimeInterpolator;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.view.animation.LinearInterpolator;
import e0.l;
import g0.h0;
import g0.i0;
import g0.y0;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class b {
    public CharSequence A;
    public CharSequence B;
    public boolean C;
    public Bitmap E;
    public float F;
    public float G;
    public float H;
    public float I;
    public float J;
    public int K;
    public int[] L;
    public boolean M;
    public final TextPaint N;
    public final TextPaint O;
    public TimeInterpolator P;
    public TimeInterpolator Q;
    public float R;
    public float S;
    public float T;
    public ColorStateList U;
    public float V;
    public float W;
    public float X;
    public StaticLayout Y;
    public float Z;

    /* renamed from: a, reason: collision with root package name */
    public final View f3542a;

    /* renamed from: a0, reason: collision with root package name */
    public float f3543a0;

    /* renamed from: b, reason: collision with root package name */
    public float f3544b;

    /* renamed from: b0, reason: collision with root package name */
    public float f3545b0;

    /* renamed from: c, reason: collision with root package name */
    public final Rect f3546c;

    /* renamed from: c0, reason: collision with root package name */
    public CharSequence f3547c0;

    /* renamed from: d, reason: collision with root package name */
    public final Rect f3548d;

    /* renamed from: e, reason: collision with root package name */
    public final RectF f3550e;

    /* renamed from: j, reason: collision with root package name */
    public ColorStateList f3557j;

    /* renamed from: k, reason: collision with root package name */
    public ColorStateList f3558k;

    /* renamed from: l, reason: collision with root package name */
    public float f3559l;

    /* renamed from: m, reason: collision with root package name */
    public float f3560m;

    /* renamed from: n, reason: collision with root package name */
    public float f3561n;
    public float o;

    /* renamed from: p, reason: collision with root package name */
    public float f3562p;

    /* renamed from: q, reason: collision with root package name */
    public float f3563q;

    /* renamed from: r, reason: collision with root package name */
    public Typeface f3564r;

    /* renamed from: s, reason: collision with root package name */
    public Typeface f3565s;

    /* renamed from: t, reason: collision with root package name */
    public Typeface f3566t;

    /* renamed from: u, reason: collision with root package name */
    public Typeface f3567u;

    /* renamed from: v, reason: collision with root package name */
    public Typeface f3568v;

    /* renamed from: w, reason: collision with root package name */
    public Typeface f3569w;

    /* renamed from: x, reason: collision with root package name */
    public Typeface f3570x;

    /* renamed from: y, reason: collision with root package name */
    public g6.a f3571y;

    /* renamed from: f, reason: collision with root package name */
    public int f3552f = 16;

    /* renamed from: g, reason: collision with root package name */
    public int f3554g = 16;

    /* renamed from: h, reason: collision with root package name */
    public float f3555h = 15.0f;

    /* renamed from: i, reason: collision with root package name */
    public float f3556i = 15.0f;

    /* renamed from: z, reason: collision with root package name */
    public final TextUtils.TruncateAt f3572z = TextUtils.TruncateAt.END;
    public final boolean D = true;

    /* renamed from: d0, reason: collision with root package name */
    public final int f3549d0 = 1;

    /* renamed from: e0, reason: collision with root package name */
    public final float f3551e0 = 1.0f;

    /* renamed from: f0, reason: collision with root package name */
    public final int f3553f0 = 1;

    public b(View view) {
        this.f3542a = view;
        TextPaint textPaint = new TextPaint(129);
        this.N = textPaint;
        this.O = new TextPaint(textPaint);
        this.f3548d = new Rect();
        this.f3546c = new Rect();
        this.f3550e = new RectF();
        g(view.getContext().getResources().getConfiguration());
    }

    public static int a(float f10, int i10, int i11) {
        float f11 = 1.0f - f10;
        return Color.argb(Math.round((Color.alpha(i11) * f10) + (Color.alpha(i10) * f11)), Math.round((Color.red(i11) * f10) + (Color.red(i10) * f11)), Math.round((Color.green(i11) * f10) + (Color.green(i10) * f11)), Math.round((Color.blue(i11) * f10) + (Color.blue(i10) * f11)));
    }

    public static float f(float f10, float f11, float f12, TimeInterpolator timeInterpolator) {
        if (timeInterpolator != null) {
            f12 = timeInterpolator.getInterpolation(f12);
        }
        LinearInterpolator linearInterpolator = t5.a.f10034a;
        return ((f11 - f10) * f12) + f10;
    }

    public final boolean b(CharSequence charSequence) {
        e0.k kVar;
        WeakHashMap weakHashMap = y0.f4277a;
        boolean z9 = true;
        if (i0.d(this.f3542a) != 1) {
            z9 = false;
        }
        if (this.D) {
            if (z9) {
                kVar = l.f3320d;
            } else {
                kVar = l.f3319c;
            }
            return kVar.i(charSequence, charSequence.length());
        }
        return z9;
    }

    public final void c(float f10, boolean z9) {
        boolean z10;
        boolean z11;
        float f11;
        float f12;
        Typeface typeface;
        boolean z12;
        boolean z13;
        StaticLayout staticLayout;
        Layout.Alignment alignment;
        boolean z14;
        boolean z15;
        boolean z16;
        boolean z17;
        boolean z18;
        boolean z19;
        if (this.A == null) {
            return;
        }
        float width = this.f3548d.width();
        float width2 = this.f3546c.width();
        if (Math.abs(f10 - 1.0f) < 1.0E-5f) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            f11 = this.f3556i;
            f12 = this.V;
            this.F = 1.0f;
            typeface = this.f3564r;
        } else {
            float f13 = this.f3555h;
            float f14 = this.W;
            Typeface typeface2 = this.f3567u;
            if (Math.abs(f10 - 0.0f) < 1.0E-5f) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11) {
                this.F = 1.0f;
            } else {
                this.F = f(this.f3555h, this.f3556i, f10, this.Q) / this.f3555h;
            }
            float f15 = this.f3556i / this.f3555h;
            float f16 = width2 * f15;
            if (!z9 && f16 > width) {
                width = Math.min(width / f15, width2);
            } else {
                width = width2;
            }
            f11 = f13;
            f12 = f14;
            typeface = typeface2;
        }
        TextPaint textPaint = this.N;
        if (width > 0.0f) {
            if (this.G != f11) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (this.X != f12) {
                z15 = true;
            } else {
                z15 = false;
            }
            if (this.f3570x != typeface) {
                z16 = true;
            } else {
                z16 = false;
            }
            if (this.Y != null && width != r10.getWidth()) {
                z17 = true;
            } else {
                z17 = false;
            }
            if (!z14 && !z15 && !z17 && !z16 && !this.M) {
                z18 = false;
            } else {
                z18 = true;
            }
            this.G = f11;
            this.X = f12;
            this.f3570x = typeface;
            this.M = false;
            if (this.F != 1.0f) {
                z19 = true;
            } else {
                z19 = false;
            }
            textPaint.setLinearText(z19);
            z12 = z18;
        } else {
            z12 = false;
        }
        if (this.B == null || z12) {
            textPaint.setTextSize(this.G);
            textPaint.setTypeface(this.f3570x);
            textPaint.setLetterSpacing(this.X);
            boolean b10 = b(this.A);
            this.C = b10;
            int i10 = this.f3549d0;
            if (i10 > 1 && !b10) {
                z13 = true;
            } else {
                z13 = false;
            }
            if (!z13) {
                i10 = 1;
            }
            try {
                if (i10 == 1) {
                    alignment = Layout.Alignment.ALIGN_NORMAL;
                } else {
                    int absoluteGravity = Gravity.getAbsoluteGravity(this.f3552f, b10 ? 1 : 0) & 7;
                    if (absoluteGravity != 1) {
                        if (absoluteGravity != 5) {
                            if (this.C) {
                                alignment = Layout.Alignment.ALIGN_OPPOSITE;
                            } else {
                                alignment = Layout.Alignment.ALIGN_NORMAL;
                            }
                        } else if (this.C) {
                            alignment = Layout.Alignment.ALIGN_NORMAL;
                        } else {
                            alignment = Layout.Alignment.ALIGN_OPPOSITE;
                        }
                    } else {
                        alignment = Layout.Alignment.ALIGN_CENTER;
                    }
                }
                g gVar = new g(this.A, textPaint, (int) width);
                gVar.f3586l = this.f3572z;
                gVar.f3585k = b10;
                gVar.f3579e = alignment;
                gVar.f3584j = false;
                gVar.f3580f = i10;
                float f17 = this.f3551e0;
                gVar.f3581g = 0.0f;
                gVar.f3582h = f17;
                gVar.f3583i = this.f3553f0;
                staticLayout = gVar.a();
            } catch (f e10) {
                Log.e("CollapsingTextHelper", e10.getCause().getMessage(), e10);
                staticLayout = null;
            }
            staticLayout.getClass();
            this.Y = staticLayout;
            this.B = staticLayout.getText();
        }
    }

    public final float d() {
        TextPaint textPaint = this.O;
        textPaint.setTextSize(this.f3556i);
        textPaint.setTypeface(this.f3564r);
        textPaint.setLetterSpacing(this.V);
        return -textPaint.ascent();
    }

    public final int e(ColorStateList colorStateList) {
        if (colorStateList == null) {
            return 0;
        }
        int[] iArr = this.L;
        if (iArr != null) {
            return colorStateList.getColorForState(iArr, 0);
        }
        return colorStateList.getDefaultColor();
    }

    public final void g(Configuration configuration) {
        if (Build.VERSION.SDK_INT >= 31) {
            Typeface typeface = this.f3566t;
            if (typeface != null) {
                this.f3565s = j5.a.M(configuration, typeface);
            }
            Typeface typeface2 = this.f3569w;
            if (typeface2 != null) {
                this.f3568v = j5.a.M(configuration, typeface2);
            }
            Typeface typeface3 = this.f3565s;
            if (typeface3 == null) {
                typeface3 = this.f3566t;
            }
            this.f3564r = typeface3;
            Typeface typeface4 = this.f3568v;
            if (typeface4 == null) {
                typeface4 = this.f3569w;
            }
            this.f3567u = typeface4;
            h(true);
        }
    }

    public final void h(boolean z9) {
        float f10;
        float f11;
        StaticLayout staticLayout;
        View view = this.f3542a;
        if ((view.getHeight() > 0 && view.getWidth() > 0) || z9) {
            c(1.0f, z9);
            CharSequence charSequence = this.B;
            TextPaint textPaint = this.N;
            if (charSequence != null && (staticLayout = this.Y) != null) {
                this.f3547c0 = TextUtils.ellipsize(charSequence, textPaint, staticLayout.getWidth(), this.f3572z);
            }
            CharSequence charSequence2 = this.f3547c0;
            if (charSequence2 != null) {
                this.Z = textPaint.measureText(charSequence2, 0, charSequence2.length());
            } else {
                this.Z = 0.0f;
            }
            int absoluteGravity = Gravity.getAbsoluteGravity(this.f3554g, this.C ? 1 : 0);
            int i10 = absoluteGravity & 112;
            Rect rect = this.f3548d;
            if (i10 != 48) {
                if (i10 != 80) {
                    this.f3560m = rect.centerY() - ((textPaint.descent() - textPaint.ascent()) / 2.0f);
                } else {
                    this.f3560m = textPaint.ascent() + rect.bottom;
                }
            } else {
                this.f3560m = rect.top;
            }
            int i11 = absoluteGravity & 8388615;
            if (i11 != 1) {
                if (i11 != 5) {
                    this.o = rect.left;
                } else {
                    this.o = rect.right - this.Z;
                }
            } else {
                this.o = rect.centerX() - (this.Z / 2.0f);
            }
            c(0.0f, z9);
            StaticLayout staticLayout2 = this.Y;
            if (staticLayout2 != null) {
                f10 = staticLayout2.getHeight();
            } else {
                f10 = 0.0f;
            }
            StaticLayout staticLayout3 = this.Y;
            if (staticLayout3 != null && this.f3549d0 > 1) {
                f11 = staticLayout3.getWidth();
            } else {
                CharSequence charSequence3 = this.B;
                if (charSequence3 != null) {
                    f11 = textPaint.measureText(charSequence3, 0, charSequence3.length());
                } else {
                    f11 = 0.0f;
                }
            }
            StaticLayout staticLayout4 = this.Y;
            if (staticLayout4 != null) {
                staticLayout4.getLineCount();
            }
            int absoluteGravity2 = Gravity.getAbsoluteGravity(this.f3552f, this.C ? 1 : 0);
            int i12 = absoluteGravity2 & 112;
            Rect rect2 = this.f3546c;
            if (i12 != 48) {
                if (i12 != 80) {
                    this.f3559l = rect2.centerY() - (f10 / 2.0f);
                } else {
                    this.f3559l = textPaint.descent() + (rect2.bottom - f10);
                }
            } else {
                this.f3559l = rect2.top;
            }
            int i13 = absoluteGravity2 & 8388615;
            if (i13 != 1) {
                if (i13 != 5) {
                    this.f3561n = rect2.left;
                } else {
                    this.f3561n = rect2.right - f11;
                }
            } else {
                this.f3561n = rect2.centerX() - (f11 / 2.0f);
            }
            Bitmap bitmap = this.E;
            if (bitmap != null) {
                bitmap.recycle();
                this.E = null;
            }
            l(this.f3544b);
            float f12 = this.f3544b;
            float f13 = f(rect2.left, rect.left, f12, this.P);
            RectF rectF = this.f3550e;
            rectF.left = f13;
            rectF.top = f(this.f3559l, this.f3560m, f12, this.P);
            rectF.right = f(rect2.right, rect.right, f12, this.P);
            rectF.bottom = f(rect2.bottom, rect.bottom, f12, this.P);
            this.f3562p = f(this.f3561n, this.o, f12, this.P);
            this.f3563q = f(this.f3559l, this.f3560m, f12, this.P);
            l(f12);
            x0.b bVar = t5.a.f10035b;
            this.f3543a0 = 1.0f - f(0.0f, 1.0f, 1.0f - f12, bVar);
            WeakHashMap weakHashMap = y0.f4277a;
            h0.k(view);
            this.f3545b0 = f(1.0f, 0.0f, f12, bVar);
            h0.k(view);
            ColorStateList colorStateList = this.f3558k;
            ColorStateList colorStateList2 = this.f3557j;
            if (colorStateList != colorStateList2) {
                textPaint.setColor(a(f12, e(colorStateList2), e(this.f3558k)));
            } else {
                textPaint.setColor(e(colorStateList));
            }
            float f14 = this.V;
            float f15 = this.W;
            if (f14 != f15) {
                textPaint.setLetterSpacing(f(f15, f14, f12, bVar));
            } else {
                textPaint.setLetterSpacing(f14);
            }
            this.H = f(0.0f, this.R, f12, null);
            this.I = f(0.0f, this.S, f12, null);
            this.J = f(0.0f, this.T, f12, null);
            int a10 = a(f12, e(null), e(this.U));
            this.K = a10;
            textPaint.setShadowLayer(this.H, this.I, this.J, a10);
            h0.k(view);
        }
    }

    public final void i(ColorStateList colorStateList) {
        if (this.f3558k != colorStateList || this.f3557j != colorStateList) {
            this.f3558k = colorStateList;
            this.f3557j = colorStateList;
            h(false);
        }
    }

    public final boolean j(Typeface typeface) {
        g6.a aVar = this.f3571y;
        if (aVar != null) {
            aVar.f4463w = true;
        }
        if (this.f3566t != typeface) {
            this.f3566t = typeface;
            Typeface M = j5.a.M(this.f3542a.getContext().getResources().getConfiguration(), typeface);
            this.f3565s = M;
            if (M == null) {
                M = this.f3566t;
            }
            this.f3564r = M;
            return true;
        }
        return false;
    }

    public final void k(float f10) {
        if (f10 < 0.0f) {
            f10 = 0.0f;
        } else if (f10 > 1.0f) {
            f10 = 1.0f;
        }
        if (f10 != this.f3544b) {
            this.f3544b = f10;
            float f11 = this.f3546c.left;
            Rect rect = this.f3548d;
            float f12 = f(f11, rect.left, f10, this.P);
            RectF rectF = this.f3550e;
            rectF.left = f12;
            rectF.top = f(this.f3559l, this.f3560m, f10, this.P);
            rectF.right = f(r1.right, rect.right, f10, this.P);
            rectF.bottom = f(r1.bottom, rect.bottom, f10, this.P);
            this.f3562p = f(this.f3561n, this.o, f10, this.P);
            this.f3563q = f(this.f3559l, this.f3560m, f10, this.P);
            l(f10);
            x0.b bVar = t5.a.f10035b;
            this.f3543a0 = 1.0f - f(0.0f, 1.0f, 1.0f - f10, bVar);
            WeakHashMap weakHashMap = y0.f4277a;
            View view = this.f3542a;
            h0.k(view);
            this.f3545b0 = f(1.0f, 0.0f, f10, bVar);
            h0.k(view);
            ColorStateList colorStateList = this.f3558k;
            ColorStateList colorStateList2 = this.f3557j;
            TextPaint textPaint = this.N;
            if (colorStateList != colorStateList2) {
                textPaint.setColor(a(f10, e(colorStateList2), e(this.f3558k)));
            } else {
                textPaint.setColor(e(colorStateList));
            }
            float f13 = this.V;
            float f14 = this.W;
            if (f13 != f14) {
                textPaint.setLetterSpacing(f(f14, f13, f10, bVar));
            } else {
                textPaint.setLetterSpacing(f13);
            }
            this.H = f(0.0f, this.R, f10, null);
            this.I = f(0.0f, this.S, f10, null);
            this.J = f(0.0f, this.T, f10, null);
            int a10 = a(f10, e(null), e(this.U));
            this.K = a10;
            textPaint.setShadowLayer(this.H, this.I, this.J, a10);
            h0.k(view);
        }
    }

    public final void l(float f10) {
        c(f10, false);
        WeakHashMap weakHashMap = y0.f4277a;
        h0.k(this.f3542a);
    }

    public final void m(Typeface typeface) {
        boolean z9;
        boolean j4 = j(typeface);
        if (this.f3569w != typeface) {
            this.f3569w = typeface;
            Typeface M = j5.a.M(this.f3542a.getContext().getResources().getConfiguration(), typeface);
            this.f3568v = M;
            if (M == null) {
                M = this.f3569w;
            }
            this.f3567u = M;
            z9 = true;
        } else {
            z9 = false;
        }
        if (j4 || z9) {
            h(false);
        }
    }
}
