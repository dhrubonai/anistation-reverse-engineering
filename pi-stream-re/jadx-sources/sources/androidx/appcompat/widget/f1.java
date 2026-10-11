package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import android.text.method.PasswordTransformationMethod;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.TextView;
import java.lang.ref.WeakReference;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class f1 {

    /* renamed from: a, reason: collision with root package name */
    public final TextView f469a;

    /* renamed from: b, reason: collision with root package name */
    public x3 f470b;

    /* renamed from: c, reason: collision with root package name */
    public x3 f471c;

    /* renamed from: d, reason: collision with root package name */
    public x3 f472d;

    /* renamed from: e, reason: collision with root package name */
    public x3 f473e;

    /* renamed from: f, reason: collision with root package name */
    public x3 f474f;

    /* renamed from: g, reason: collision with root package name */
    public x3 f475g;

    /* renamed from: h, reason: collision with root package name */
    public x3 f476h;

    /* renamed from: i, reason: collision with root package name */
    public final q1 f477i;

    /* renamed from: j, reason: collision with root package name */
    public int f478j = 0;

    /* renamed from: k, reason: collision with root package name */
    public int f479k = -1;

    /* renamed from: l, reason: collision with root package name */
    public Typeface f480l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f481m;

    public f1(TextView textView) {
        this.f469a = textView;
        this.f477i = new q1(textView);
    }

    public static x3 c(Context context, x xVar, int i10) {
        ColorStateList i11;
        synchronized (xVar) {
            i11 = xVar.f699a.i(context, i10);
        }
        if (i11 != null) {
            x3 x3Var = new x3(0);
            x3Var.f706c = true;
            x3Var.f707d = i11;
            return x3Var;
        }
        return null;
    }

    public static void h(TextView textView, InputConnection inputConnection, EditorInfo editorInfo) {
        int i10;
        int i11;
        boolean z9;
        int i12;
        CharSequence subSequence;
        int i13 = Build.VERSION.SDK_INT;
        if (i13 < 30 && inputConnection != null) {
            CharSequence text = textView.getText();
            if (i13 >= 30) {
                j0.b.a(editorInfo, text);
                return;
            }
            text.getClass();
            if (i13 >= 30) {
                j0.b.a(editorInfo, text);
                return;
            }
            int i14 = editorInfo.initialSelStart;
            int i15 = editorInfo.initialSelEnd;
            if (i14 > i15) {
                i10 = i15 + 0;
            } else {
                i10 = i14 + 0;
            }
            if (i14 > i15) {
                i11 = i14 - 0;
            } else {
                i11 = i15 + 0;
            }
            int length = text.length();
            if (i10 >= 0 && i11 <= length) {
                int i16 = editorInfo.inputType & 4095;
                if (i16 != 129 && i16 != 225 && i16 != 18) {
                    z9 = false;
                } else {
                    z9 = true;
                }
                if (z9) {
                    q6.g.i0(editorInfo, null, 0, 0);
                    return;
                }
                if (length <= 2048) {
                    q6.g.i0(editorInfo, text, i10, i11);
                    return;
                }
                int i17 = i11 - i10;
                if (i17 > 1024) {
                    i12 = 0;
                } else {
                    i12 = i17;
                }
                int i18 = 2048 - i12;
                int min = Math.min(text.length() - i11, i18 - Math.min(i10, (int) (i18 * 0.8d)));
                int min2 = Math.min(i10, i18 - min);
                int i19 = i10 - min2;
                if (Character.isLowSurrogate(text.charAt(i19))) {
                    i19++;
                    min2--;
                }
                if (Character.isHighSurrogate(text.charAt((i11 + min) - 1))) {
                    min--;
                }
                int i20 = min2 + i12 + min;
                if (i12 != i17) {
                    subSequence = TextUtils.concat(text.subSequence(i19, i19 + min2), text.subSequence(i11, min + i11));
                } else {
                    subSequence = text.subSequence(i19, i20 + i19);
                }
                int i21 = min2 + 0;
                q6.g.i0(editorInfo, subSequence, i21, i12 + i21);
                return;
            }
            q6.g.i0(editorInfo, null, 0, 0);
        }
    }

    public final void a(Drawable drawable, x3 x3Var) {
        if (drawable != null && x3Var != null) {
            x.e(drawable, x3Var, this.f469a.getDrawableState());
        }
    }

    public final void b() {
        x3 x3Var = this.f470b;
        TextView textView = this.f469a;
        if (x3Var != null || this.f471c != null || this.f472d != null || this.f473e != null) {
            Drawable[] compoundDrawables = textView.getCompoundDrawables();
            a(compoundDrawables[0], this.f470b);
            a(compoundDrawables[1], this.f471c);
            a(compoundDrawables[2], this.f472d);
            a(compoundDrawables[3], this.f473e);
        }
        if (this.f474f != null || this.f475g != null) {
            Drawable[] a10 = a1.a(textView);
            a(a10[0], this.f474f);
            a(a10[2], this.f475g);
        }
    }

    public final ColorStateList d() {
        x3 x3Var = this.f476h;
        if (x3Var != null) {
            return (ColorStateList) x3Var.f707d;
        }
        return null;
    }

    public final PorterDuff.Mode e() {
        x3 x3Var = this.f476h;
        if (x3Var != null) {
            return (PorterDuff.Mode) x3Var.f708e;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void f(AttributeSet attributeSet, int i10) {
        boolean z9;
        boolean z10;
        String str;
        String str2;
        float f10;
        float f11;
        float f12;
        Drawable drawable;
        Drawable drawable2;
        Drawable drawable3;
        Drawable drawable4;
        Drawable drawable5;
        Drawable drawable6;
        Paint.FontMetricsInt fontMetricsInt;
        int i11;
        int resourceId;
        int i12;
        TextView textView = this.f469a;
        Context context = textView.getContext();
        x a10 = x.a();
        int[] iArr = e.a.f3277h;
        o3 m5 = o3.m(context, attributeSet, iArr, i10);
        g0.y0.k(textView, textView.getContext(), iArr, attributeSet, (TypedArray) m5.f598b, i10);
        int i13 = m5.i(0, -1);
        if (m5.l(3)) {
            this.f470b = c(context, a10, m5.i(3, 0));
        }
        if (m5.l(1)) {
            this.f471c = c(context, a10, m5.i(1, 0));
        }
        if (m5.l(4)) {
            this.f472d = c(context, a10, m5.i(4, 0));
        }
        if (m5.l(2)) {
            this.f473e = c(context, a10, m5.i(2, 0));
        }
        int i14 = Build.VERSION.SDK_INT;
        if (m5.l(5)) {
            this.f474f = c(context, a10, m5.i(5, 0));
        }
        if (m5.l(6)) {
            this.f475g = c(context, a10, m5.i(6, 0));
        }
        m5.p();
        boolean z11 = textView.getTransformationMethod() instanceof PasswordTransformationMethod;
        int[] iArr2 = e.a.f3291w;
        if (i13 != -1) {
            o3 o3Var = new o3(context, context.obtainStyledAttributes(i13, iArr2));
            if (!z11 && o3Var.l(14)) {
                z9 = o3Var.a(14, false);
                z10 = true;
            } else {
                z9 = false;
                z10 = false;
            }
            n(context, o3Var);
            if (o3Var.l(15)) {
                str = o3Var.j(15);
                i12 = 26;
            } else {
                i12 = 26;
                str = null;
            }
            if (i14 >= i12 && o3Var.l(13)) {
                str2 = o3Var.j(13);
            } else {
                str2 = null;
            }
            o3Var.p();
        } else {
            z9 = false;
            z10 = false;
            str = null;
            str2 = null;
        }
        o3 o3Var2 = new o3(context, context.obtainStyledAttributes(attributeSet, iArr2, i10, 0));
        if (!z11 && o3Var2.l(14)) {
            z9 = o3Var2.a(14, false);
            z10 = true;
        }
        if (o3Var2.l(15)) {
            str = o3Var2.j(15);
        }
        String str3 = str;
        if (i14 >= 26 && o3Var2.l(13)) {
            str2 = o3Var2.j(13);
        }
        String str4 = str2;
        if (i14 >= 28 && o3Var2.l(0) && o3Var2.d(0, -1) == 0) {
            textView.setTextSize(0, 0.0f);
        }
        n(context, o3Var2);
        o3Var2.p();
        if (!z11 && z10) {
            textView.setAllCaps(z9);
        }
        Typeface typeface = this.f480l;
        if (typeface != null) {
            if (this.f479k == -1) {
                textView.setTypeface(typeface, this.f478j);
            } else {
                textView.setTypeface(typeface);
            }
        }
        if (str4 != null) {
            d1.d(textView, str4);
        }
        if (str3 != null) {
            if (i14 >= 24) {
                c1.b(textView, c1.a(str3));
            } else {
                a1.c(textView, b1.a(str3.split(",")[0]));
            }
        }
        int[] iArr3 = e.a.f3278i;
        q1 q1Var = this.f477i;
        Context context2 = q1Var.f620j;
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr3, i10, 0);
        TextView textView2 = q1Var.f619i;
        g0.y0.k(textView2, textView2.getContext(), iArr3, attributeSet, obtainStyledAttributes, i10);
        if (obtainStyledAttributes.hasValue(5)) {
            q1Var.f611a = obtainStyledAttributes.getInt(5, 0);
        }
        if (obtainStyledAttributes.hasValue(4)) {
            f10 = obtainStyledAttributes.getDimension(4, -1.0f);
        } else {
            f10 = -1.0f;
        }
        if (obtainStyledAttributes.hasValue(2)) {
            f11 = obtainStyledAttributes.getDimension(2, -1.0f);
        } else {
            f11 = -1.0f;
        }
        if (obtainStyledAttributes.hasValue(1)) {
            f12 = obtainStyledAttributes.getDimension(1, -1.0f);
        } else {
            f12 = -1.0f;
        }
        if (obtainStyledAttributes.hasValue(3) && (resourceId = obtainStyledAttributes.getResourceId(3, 0)) > 0) {
            TypedArray obtainTypedArray = obtainStyledAttributes.getResources().obtainTypedArray(resourceId);
            int length = obtainTypedArray.length();
            int[] iArr4 = new int[length];
            if (length > 0) {
                for (int i15 = 0; i15 < length; i15++) {
                    iArr4[i15] = obtainTypedArray.getDimensionPixelSize(i15, -1);
                }
                q1Var.f616f = q1.b(iArr4);
                q1Var.h();
            }
            obtainTypedArray.recycle();
        }
        obtainStyledAttributes.recycle();
        if (q1Var.i()) {
            if (q1Var.f611a == 1) {
                if (!q1Var.f617g) {
                    DisplayMetrics displayMetrics = context2.getResources().getDisplayMetrics();
                    if (f11 == -1.0f) {
                        i11 = 2;
                        f11 = TypedValue.applyDimension(2, 12.0f, displayMetrics);
                    } else {
                        i11 = 2;
                    }
                    if (f12 == -1.0f) {
                        f12 = TypedValue.applyDimension(i11, 112.0f, displayMetrics);
                    }
                    if (f10 == -1.0f) {
                        f10 = 1.0f;
                    }
                    q1Var.j(f11, f12, f10);
                }
                q1Var.g();
            }
        } else {
            q1Var.f611a = 0;
        }
        if (n4.f581b && q1Var.f611a != 0) {
            int[] iArr5 = q1Var.f616f;
            if (iArr5.length > 0) {
                if (d1.a(textView) != -1.0f) {
                    d1.b(textView, Math.round(q1Var.f614d), Math.round(q1Var.f615e), Math.round(q1Var.f613c), 0);
                } else {
                    d1.c(textView, iArr5, 0);
                }
            }
        }
        o3 o3Var3 = new o3(context, context.obtainStyledAttributes(attributeSet, iArr3));
        int i16 = o3Var3.i(8, -1);
        if (i16 != -1) {
            drawable = a10.b(context, i16);
        } else {
            drawable = null;
        }
        int i17 = o3Var3.i(13, -1);
        if (i17 != -1) {
            drawable2 = a10.b(context, i17);
        } else {
            drawable2 = null;
        }
        int i18 = o3Var3.i(9, -1);
        if (i18 != -1) {
            drawable3 = a10.b(context, i18);
        } else {
            drawable3 = null;
        }
        int i19 = o3Var3.i(6, -1);
        if (i19 != -1) {
            drawable4 = a10.b(context, i19);
        } else {
            drawable4 = null;
        }
        int i20 = o3Var3.i(10, -1);
        if (i20 != -1) {
            drawable5 = a10.b(context, i20);
        } else {
            drawable5 = null;
        }
        int i21 = o3Var3.i(7, -1);
        if (i21 != -1) {
            drawable6 = a10.b(context, i21);
        } else {
            drawable6 = null;
        }
        if (drawable5 == null && drawable6 == null) {
            if (drawable != null || drawable2 != null || drawable3 != null || drawable4 != null) {
                Drawable[] a11 = a1.a(textView);
                Drawable drawable7 = a11[0];
                if (drawable7 == null && a11[2] == null) {
                    Drawable[] compoundDrawables = textView.getCompoundDrawables();
                    if (drawable == null) {
                        drawable = compoundDrawables[0];
                    }
                    if (drawable2 == null) {
                        drawable2 = compoundDrawables[1];
                    }
                    if (drawable3 == null) {
                        drawable3 = compoundDrawables[2];
                    }
                    if (drawable4 == null) {
                        drawable4 = compoundDrawables[3];
                    }
                    textView.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
                } else {
                    if (drawable2 == null) {
                        drawable2 = a11[1];
                    }
                    Drawable drawable8 = a11[2];
                    if (drawable4 == null) {
                        drawable4 = a11[3];
                    }
                    a1.b(textView, drawable7, drawable2, drawable8, drawable4);
                }
            }
        } else {
            Drawable[] a12 = a1.a(textView);
            if (drawable5 == null) {
                drawable5 = a12[0];
            }
            if (drawable2 == null) {
                drawable2 = a12[1];
            }
            if (drawable6 == null) {
                drawable6 = a12[2];
            }
            if (drawable4 == null) {
                drawable4 = a12[3];
            }
            a1.b(textView, drawable5, drawable2, drawable6, drawable4);
        }
        if (o3Var3.l(11)) {
            ColorStateList b10 = o3Var3.b(11);
            if (Build.VERSION.SDK_INT >= 24) {
                k0.q.f(textView, b10);
            } else if (textView instanceof k0.w) {
                ((k0.w) textView).setSupportCompoundDrawablesTintList(b10);
            }
        }
        if (o3Var3.l(12)) {
            fontMetricsInt = null;
            PorterDuff.Mode b11 = v1.b(o3Var3.h(12, -1), null);
            if (Build.VERSION.SDK_INT >= 24) {
                k0.q.g(textView, b11);
            } else if (textView instanceof k0.w) {
                ((k0.w) textView).setSupportCompoundDrawablesTintMode(b11);
            }
        } else {
            fontMetricsInt = null;
        }
        int d10 = o3Var3.d(15, -1);
        int d11 = o3Var3.d(18, -1);
        int d12 = o3Var3.d(19, -1);
        o3Var3.p();
        if (d10 != -1) {
            com.bumptech.glide.d.a0(textView, d10);
        }
        if (d11 != -1) {
            com.bumptech.glide.d.b0(textView, d11);
        }
        if (d12 != -1) {
            com.bumptech.glide.d.j(d12);
            if (d12 != textView.getPaint().getFontMetricsInt(fontMetricsInt)) {
                textView.setLineSpacing(d12 - r1, 1.0f);
            }
        }
    }

    public final void g(Context context, int i10) {
        String j4;
        o3 o3Var = new o3(context, context.obtainStyledAttributes(i10, e.a.f3291w));
        boolean l10 = o3Var.l(14);
        TextView textView = this.f469a;
        if (l10) {
            textView.setAllCaps(o3Var.a(14, false));
        }
        int i11 = Build.VERSION.SDK_INT;
        if (o3Var.l(0) && o3Var.d(0, -1) == 0) {
            textView.setTextSize(0, 0.0f);
        }
        n(context, o3Var);
        if (i11 >= 26 && o3Var.l(13) && (j4 = o3Var.j(13)) != null) {
            d1.d(textView, j4);
        }
        o3Var.p();
        Typeface typeface = this.f480l;
        if (typeface != null) {
            textView.setTypeface(typeface, this.f478j);
        }
    }

    public final void i(int i10, int i11, int i12, int i13) {
        q1 q1Var = this.f477i;
        if (q1Var.i()) {
            DisplayMetrics displayMetrics = q1Var.f620j.getResources().getDisplayMetrics();
            q1Var.j(TypedValue.applyDimension(i13, i10, displayMetrics), TypedValue.applyDimension(i13, i11, displayMetrics), TypedValue.applyDimension(i13, i12, displayMetrics));
            if (q1Var.g()) {
                q1Var.a();
            }
        }
    }

    public final void j(int[] iArr, int i10) {
        q1 q1Var = this.f477i;
        if (q1Var.i()) {
            int length = iArr.length;
            if (length > 0) {
                int[] iArr2 = new int[length];
                if (i10 == 0) {
                    iArr2 = Arrays.copyOf(iArr, length);
                } else {
                    DisplayMetrics displayMetrics = q1Var.f620j.getResources().getDisplayMetrics();
                    for (int i11 = 0; i11 < length; i11++) {
                        iArr2[i11] = Math.round(TypedValue.applyDimension(i10, iArr[i11], displayMetrics));
                    }
                }
                q1Var.f616f = q1.b(iArr2);
                if (!q1Var.h()) {
                    throw new IllegalArgumentException("None of the preset sizes is valid: " + Arrays.toString(iArr));
                }
            } else {
                q1Var.f617g = false;
            }
            if (q1Var.g()) {
                q1Var.a();
            }
        }
    }

    public final void k(int i10) {
        q1 q1Var = this.f477i;
        if (q1Var.i()) {
            if (i10 != 0) {
                if (i10 == 1) {
                    DisplayMetrics displayMetrics = q1Var.f620j.getResources().getDisplayMetrics();
                    q1Var.j(TypedValue.applyDimension(2, 12.0f, displayMetrics), TypedValue.applyDimension(2, 112.0f, displayMetrics), 1.0f);
                    if (q1Var.g()) {
                        q1Var.a();
                        return;
                    }
                    return;
                }
                throw new IllegalArgumentException(a3.g.n("Unknown auto-size text type: ", i10));
            }
            q1Var.f611a = 0;
            q1Var.f614d = -1.0f;
            q1Var.f615e = -1.0f;
            q1Var.f613c = -1.0f;
            q1Var.f616f = new int[0];
            q1Var.f612b = false;
        }
    }

    public final void l(ColorStateList colorStateList) {
        boolean z9 = false;
        if (this.f476h == null) {
            this.f476h = new x3(0);
        }
        x3 x3Var = this.f476h;
        x3Var.f707d = colorStateList;
        if (colorStateList != null) {
            z9 = true;
        }
        x3Var.f706c = z9;
        this.f470b = x3Var;
        this.f471c = x3Var;
        this.f472d = x3Var;
        this.f473e = x3Var;
        this.f474f = x3Var;
        this.f475g = x3Var;
    }

    public final void m(PorterDuff.Mode mode) {
        boolean z9 = false;
        if (this.f476h == null) {
            this.f476h = new x3(0);
        }
        x3 x3Var = this.f476h;
        x3Var.f708e = mode;
        if (mode != null) {
            z9 = true;
        }
        x3Var.f705b = z9;
        this.f470b = x3Var;
        this.f471c = x3Var;
        this.f472d = x3Var;
        this.f473e = x3Var;
        this.f474f = x3Var;
        this.f475g = x3Var;
    }

    public final void n(Context context, o3 o3Var) {
        String j4;
        boolean z9;
        boolean z10;
        this.f478j = o3Var.h(2, this.f478j);
        int i10 = Build.VERSION.SDK_INT;
        boolean z11 = false;
        if (i10 >= 28) {
            int h10 = o3Var.h(11, -1);
            this.f479k = h10;
            if (h10 != -1) {
                this.f478j = (this.f478j & 2) | 0;
            }
        }
        int i11 = 10;
        if (!o3Var.l(10) && !o3Var.l(12)) {
            if (o3Var.l(1)) {
                this.f481m = false;
                int h11 = o3Var.h(1, 1);
                if (h11 != 1) {
                    if (h11 != 2) {
                        if (h11 == 3) {
                            this.f480l = Typeface.MONOSPACE;
                            return;
                        }
                        return;
                    }
                    this.f480l = Typeface.SERIF;
                    return;
                }
                this.f480l = Typeface.SANS_SERIF;
                return;
            }
            return;
        }
        this.f480l = null;
        if (o3Var.l(12)) {
            i11 = 12;
        }
        int i12 = this.f479k;
        int i13 = this.f478j;
        if (!context.isRestricted()) {
            try {
                Typeface g10 = o3Var.g(i11, this.f478j, new y0(this, i12, i13, new WeakReference(this.f469a)));
                if (g10 != null) {
                    if (i10 >= 28 && this.f479k != -1) {
                        Typeface create = Typeface.create(g10, 0);
                        int i14 = this.f479k;
                        if ((this.f478j & 2) != 0) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        this.f480l = e1.a(create, i14, z10);
                    } else {
                        this.f480l = g10;
                    }
                }
                if (this.f480l == null) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                this.f481m = z9;
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            }
        }
        if (this.f480l == null && (j4 = o3Var.j(i11)) != null) {
            if (Build.VERSION.SDK_INT >= 28 && this.f479k != -1) {
                Typeface create2 = Typeface.create(j4, 0);
                int i15 = this.f479k;
                if ((this.f478j & 2) != 0) {
                    z11 = true;
                }
                this.f480l = e1.a(create2, i15, z11);
                return;
            }
            this.f480l = Typeface.create(j4, this.f478j);
        }
    }
}
