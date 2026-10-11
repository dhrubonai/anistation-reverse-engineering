package g6;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.util.Log;
import android.util.TypedValue;
import p7.a0;
import y.p;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final ColorStateList f4470a;

    /* renamed from: b, reason: collision with root package name */
    public final String f4471b;

    /* renamed from: c, reason: collision with root package name */
    public final int f4472c;

    /* renamed from: d, reason: collision with root package name */
    public final int f4473d;

    /* renamed from: e, reason: collision with root package name */
    public final float f4474e;

    /* renamed from: f, reason: collision with root package name */
    public final float f4475f;

    /* renamed from: g, reason: collision with root package name */
    public final float f4476g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f4477h;

    /* renamed from: i, reason: collision with root package name */
    public final float f4478i;

    /* renamed from: j, reason: collision with root package name */
    public ColorStateList f4479j;

    /* renamed from: k, reason: collision with root package name */
    public float f4480k;

    /* renamed from: l, reason: collision with root package name */
    public final int f4481l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f4482m = false;

    /* renamed from: n, reason: collision with root package name */
    public Typeface f4483n;

    public d(Context context, int i10) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i10, s5.a.f9922x);
        this.f4480k = obtainStyledAttributes.getDimension(0, 0.0f);
        this.f4479j = a0.u(context, obtainStyledAttributes, 3);
        a0.u(context, obtainStyledAttributes, 4);
        a0.u(context, obtainStyledAttributes, 5);
        this.f4472c = obtainStyledAttributes.getInt(2, 0);
        this.f4473d = obtainStyledAttributes.getInt(1, 1);
        int i11 = obtainStyledAttributes.hasValue(12) ? 12 : 10;
        this.f4481l = obtainStyledAttributes.getResourceId(i11, 0);
        this.f4471b = obtainStyledAttributes.getString(i11);
        obtainStyledAttributes.getBoolean(14, false);
        this.f4470a = a0.u(context, obtainStyledAttributes, 6);
        this.f4474e = obtainStyledAttributes.getFloat(7, 0.0f);
        this.f4475f = obtainStyledAttributes.getFloat(8, 0.0f);
        this.f4476g = obtainStyledAttributes.getFloat(9, 0.0f);
        obtainStyledAttributes.recycle();
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(i10, s5.a.f9914p);
        this.f4477h = obtainStyledAttributes2.hasValue(0);
        this.f4478i = obtainStyledAttributes2.getFloat(0, 0.0f);
        obtainStyledAttributes2.recycle();
    }

    public final void a() {
        String str;
        Typeface typeface = this.f4483n;
        int i10 = this.f4472c;
        if (typeface == null && (str = this.f4471b) != null) {
            this.f4483n = Typeface.create(str, i10);
        }
        if (this.f4483n == null) {
            int i11 = this.f4473d;
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 != 3) {
                        this.f4483n = Typeface.DEFAULT;
                    } else {
                        this.f4483n = Typeface.MONOSPACE;
                    }
                } else {
                    this.f4483n = Typeface.SERIF;
                }
            } else {
                this.f4483n = Typeface.SANS_SERIF;
            }
            this.f4483n = Typeface.create(this.f4483n, i10);
        }
    }

    public final Typeface b(Context context) {
        Typeface b10;
        if (this.f4482m) {
            return this.f4483n;
        }
        if (!context.isRestricted()) {
            try {
                int i10 = this.f4481l;
                ThreadLocal threadLocal = p.f11448a;
                if (context.isRestricted()) {
                    b10 = null;
                } else {
                    b10 = p.b(context, i10, new TypedValue(), 0, null, false, false);
                }
                this.f4483n = b10;
                if (b10 != null) {
                    this.f4483n = Typeface.create(b10, this.f4472c);
                }
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            } catch (Exception e10) {
                Log.d("TextAppearance", "Error loading font " + this.f4471b, e10);
            }
        }
        a();
        this.f4482m = true;
        return this.f4483n;
    }

    public final void c(Context context, w7.b bVar) {
        if (d(context)) {
            b(context);
        } else {
            a();
        }
        int i10 = this.f4481l;
        if (i10 == 0) {
            this.f4482m = true;
        }
        if (this.f4482m) {
            bVar.P(this.f4483n, true);
            return;
        }
        try {
            b bVar2 = new b(this, bVar);
            ThreadLocal threadLocal = p.f11448a;
            if (context.isRestricted()) {
                bVar2.d(-4);
            } else {
                p.b(context, i10, new TypedValue(), 0, bVar2, false, false);
            }
        } catch (Resources.NotFoundException unused) {
            this.f4482m = true;
            bVar.O(1);
        } catch (Exception e10) {
            Log.d("TextAppearance", "Error loading font " + this.f4471b, e10);
            this.f4482m = true;
            bVar.O(-3);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x001f A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021 A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean d(android.content.Context r8) {
        /*
            r7 = this;
            int r1 = r7.f4481l
            if (r1 == 0) goto L1c
            java.lang.ThreadLocal r0 = y.p.f11448a
            boolean r0 = r8.isRestricted()
            if (r0 == 0) goto Ld
            goto L1c
        Ld:
            android.util.TypedValue r2 = new android.util.TypedValue
            r2.<init>()
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 1
            r0 = r8
            android.graphics.Typeface r8 = y.p.b(r0, r1, r2, r3, r4, r5, r6)
            goto L1d
        L1c:
            r8 = 0
        L1d:
            if (r8 == 0) goto L21
            r8 = 1
            goto L22
        L21:
            r8 = 0
        L22:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: g6.d.d(android.content.Context):boolean");
    }

    public final void e(Context context, TextPaint textPaint, w7.b bVar) {
        int i10;
        int i11;
        f(context, textPaint, bVar);
        ColorStateList colorStateList = this.f4479j;
        if (colorStateList != null) {
            i10 = colorStateList.getColorForState(textPaint.drawableState, colorStateList.getDefaultColor());
        } else {
            i10 = -16777216;
        }
        textPaint.setColor(i10);
        ColorStateList colorStateList2 = this.f4470a;
        if (colorStateList2 != null) {
            i11 = colorStateList2.getColorForState(textPaint.drawableState, colorStateList2.getDefaultColor());
        } else {
            i11 = 0;
        }
        textPaint.setShadowLayer(this.f4476g, this.f4474e, this.f4475f, i11);
    }

    public final void f(Context context, TextPaint textPaint, w7.b bVar) {
        if (d(context)) {
            g(context, textPaint, b(context));
            return;
        }
        a();
        g(context, textPaint, this.f4483n);
        c(context, new c(this, context, textPaint, bVar));
    }

    public final void g(Context context, TextPaint textPaint, Typeface typeface) {
        boolean z9;
        float f10;
        Typeface M = j5.a.M(context.getResources().getConfiguration(), typeface);
        if (M != null) {
            typeface = M;
        }
        textPaint.setTypeface(typeface);
        int i10 = (~typeface.getStyle()) & this.f4472c;
        if ((i10 & 1) != 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        textPaint.setFakeBoldText(z9);
        if ((i10 & 2) != 0) {
            f10 = -0.25f;
        } else {
            f10 = 0.0f;
        }
        textPaint.setTextSkewX(f10);
        textPaint.setTextSize(this.f4480k);
        if (this.f4477h) {
            textPaint.setLetterSpacing(this.f4478i);
        }
    }
}
