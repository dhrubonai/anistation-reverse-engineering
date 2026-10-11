package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.method.PasswordTransformationMethod;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.widget.TextView;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class bq {
    public final TextView a;
    public pn0 b;
    public pn0 c;
    public pn0 d;
    public pn0 e;
    public pn0 f;
    public pn0 g;
    public pn0 h;
    public final iq i;
    public int j = 0;
    public int k = -1;
    public Typeface l;
    public boolean m;

    public bq(TextView textView) {
        this.a = textView;
        this.i = new iq(textView);
    }

    public static pn0 c(Context context, up upVar, int i) {
        ColorStateList g;
        synchronized (upVar) {
            g = upVar.a.g(context, i);
        }
        if (g != null) {
            pn0 pn0Var = new pn0((byte) 5);
            pn0Var.z = true;
            pn0Var.A = g;
            return pn0Var;
        }
        return null;
    }

    public final void a(Drawable drawable, pn0 pn0Var) {
        if (drawable != null && pn0Var != null) {
            int[] drawableState = this.a.getDrawableState();
            PorterDuff.Mode mode = up.b;
            h45.i(drawable, pn0Var, drawableState);
        }
    }

    public final void b() {
        pn0 pn0Var = this.b;
        TextView textView = this.a;
        if (pn0Var != null || this.c != null || this.d != null || this.e != null) {
            Drawable[] compoundDrawables = textView.getCompoundDrawables();
            a(compoundDrawables[0], this.b);
            a(compoundDrawables[1], this.c);
            a(compoundDrawables[2], this.d);
            a(compoundDrawables[3], this.e);
        }
        if (this.f == null && this.g == null) {
            return;
        }
        Drawable[] compoundDrawablesRelative = textView.getCompoundDrawablesRelative();
        a(compoundDrawablesRelative[0], this.f);
        a(compoundDrawablesRelative[2], this.g);
    }

    public final void d(AttributeSet attributeSet, int i) {
        up upVar;
        boolean z;
        boolean z2;
        String str;
        String str2;
        float f;
        float f2;
        float f3;
        boolean z3;
        Drawable drawable;
        Drawable drawable2;
        Drawable drawable3;
        Drawable drawable4;
        Drawable drawable5;
        int i2;
        int i3;
        float f4;
        int i4;
        ColorStateList colorStateList;
        int resourceId;
        int i5;
        int resourceId2;
        boolean z4;
        int[] iArr = ux4.b;
        int[] iArr2 = ux4.g;
        iq iqVar = this.i;
        TextView textView = this.a;
        Context context = textView.getContext();
        PorterDuff.Mode mode = up.b;
        synchronized (up.class) {
            try {
                if (up.c == null) {
                    up.b();
                }
                upVar = up.c;
            } catch (Throwable th) {
                throw th;
            }
        }
        int[] iArr3 = ux4.a;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr3, i, 0);
        TextView textView2 = this.a;
        Context context2 = textView2.getContext();
        int i6 = pv6.a;
        nv6.b(textView2, context2, iArr3, attributeSet, obtainStyledAttributes, i, 0);
        int resourceId3 = obtainStyledAttributes.getResourceId(0, -1);
        if (obtainStyledAttributes.hasValue(3)) {
            this.b = c(context, upVar, obtainStyledAttributes.getResourceId(3, 0));
        }
        if (obtainStyledAttributes.hasValue(1)) {
            this.c = c(context, upVar, obtainStyledAttributes.getResourceId(1, 0));
        }
        if (obtainStyledAttributes.hasValue(4)) {
            this.d = c(context, upVar, obtainStyledAttributes.getResourceId(4, 0));
        }
        if (obtainStyledAttributes.hasValue(2)) {
            this.e = c(context, upVar, obtainStyledAttributes.getResourceId(2, 0));
        }
        if (obtainStyledAttributes.hasValue(5)) {
            this.f = c(context, upVar, obtainStyledAttributes.getResourceId(5, 0));
        }
        if (obtainStyledAttributes.hasValue(6)) {
            this.g = c(context, upVar, obtainStyledAttributes.getResourceId(6, 0));
        }
        obtainStyledAttributes.recycle();
        boolean z5 = textView.getTransformationMethod() instanceof PasswordTransformationMethod;
        Drawable drawable6 = null;
        if (resourceId3 != -1) {
            TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(resourceId3, iArr2);
            xf6 xf6Var = new xf6(context, obtainStyledAttributes2);
            if (!z5 && obtainStyledAttributes2.hasValue(14)) {
                z = obtainStyledAttributes2.getBoolean(14, false);
                z2 = true;
            } else {
                z = false;
                z2 = false;
            }
            f(context, xf6Var);
            if (obtainStyledAttributes2.hasValue(15)) {
                str2 = obtainStyledAttributes2.getString(15);
            } else {
                str2 = null;
            }
            if (obtainStyledAttributes2.hasValue(13)) {
                str = obtainStyledAttributes2.getString(13);
            } else {
                str = null;
            }
            xf6Var.d();
        } else {
            z = false;
            z2 = false;
            str = null;
            str2 = null;
        }
        TypedArray obtainStyledAttributes3 = context.obtainStyledAttributes(attributeSet, iArr2, i, 0);
        xf6 xf6Var2 = new xf6(context, obtainStyledAttributes3);
        if (!z5 && obtainStyledAttributes3.hasValue(14)) {
            z = obtainStyledAttributes3.getBoolean(14, false);
            z2 = true;
        }
        boolean z6 = z;
        if (obtainStyledAttributes3.hasValue(15)) {
            str2 = obtainStyledAttributes3.getString(15);
        }
        if (obtainStyledAttributes3.hasValue(13)) {
            str = obtainStyledAttributes3.getString(13);
        }
        if (obtainStyledAttributes3.hasValue(0) && obtainStyledAttributes3.getDimensionPixelSize(0, -1) == 0) {
            textView.setTextSize(0, 0.0f);
        }
        f(context, xf6Var2);
        xf6Var2.d();
        if (!z5 && z2) {
            this.a.setAllCaps(z6);
        }
        Typeface typeface = this.l;
        if (typeface != null) {
            if (this.k == -1) {
                textView.setTypeface(typeface, this.j);
            } else {
                textView.setTypeface(typeface);
            }
        }
        if (str != null) {
            zp.d(textView, str);
        }
        if (str2 != null) {
            yp.b(textView, yp.a(str2));
        }
        Context context3 = iqVar.h;
        TypedArray obtainStyledAttributes4 = context3.obtainStyledAttributes(attributeSet, iArr, i, 0);
        TextView textView3 = iqVar.g;
        nv6.b(textView3, textView3.getContext(), iArr, attributeSet, obtainStyledAttributes4, i, 0);
        if (obtainStyledAttributes4.hasValue(5)) {
            iqVar.a = obtainStyledAttributes4.getInt(5, 0);
        }
        if (obtainStyledAttributes4.hasValue(4)) {
            f = obtainStyledAttributes4.getDimension(4, -1.0f);
        } else {
            f = -1.0f;
        }
        if (obtainStyledAttributes4.hasValue(2)) {
            f2 = obtainStyledAttributes4.getDimension(2, -1.0f);
        } else {
            f2 = -1.0f;
        }
        if (obtainStyledAttributes4.hasValue(1)) {
            f3 = obtainStyledAttributes4.getDimension(1, -1.0f);
        } else {
            f3 = -1.0f;
        }
        if (obtainStyledAttributes4.hasValue(3) && (resourceId2 = obtainStyledAttributes4.getResourceId(3, 0)) > 0) {
            TypedArray obtainTypedArray = obtainStyledAttributes4.getResources().obtainTypedArray(resourceId2);
            int length = obtainTypedArray.length();
            z3 = false;
            int[] iArr4 = new int[length];
            if (length > 0) {
                for (int i7 = 0; i7 < length; i7++) {
                    iArr4[i7] = obtainTypedArray.getDimensionPixelSize(i7, -1);
                }
                int[] a = iq.a(iArr4);
                iqVar.e = a;
                if (a.length > 0) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                iqVar.f = z4;
                if (z4) {
                    iqVar.a = 1;
                    iqVar.c = a[0];
                    iqVar.d = a[r9 - 1];
                    iqVar.b = -1.0f;
                }
            }
            obtainTypedArray.recycle();
        } else {
            z3 = false;
        }
        obtainStyledAttributes4.recycle();
        int i8 = iqVar.a;
        if (i8 == 1) {
            boolean z7 = iqVar.f;
            if (!z7) {
                DisplayMetrics displayMetrics = context3.getResources().getDisplayMetrics();
                if (f2 == -1.0f) {
                    i5 = 2;
                    f2 = TypedValue.applyDimension(2, 12.0f, displayMetrics);
                } else {
                    i5 = 2;
                }
                if (f3 == -1.0f) {
                    f3 = TypedValue.applyDimension(i5, 112.0f, displayMetrics);
                }
                if (f == -1.0f) {
                    f = 1.0f;
                }
                if (f2 > 0.0f) {
                    if (f3 > f2) {
                        if (f > 0.0f) {
                            iqVar.a = 1;
                            iqVar.c = f2;
                            iqVar.d = f3;
                            iqVar.b = f;
                            iqVar.f = z3;
                            z7 = false;
                            i8 = 1;
                        } else {
                            throw new IllegalArgumentException("The auto-size step granularity (" + f + "px) is less or equal to (0px)");
                        }
                    } else {
                        throw new IllegalArgumentException("Maximum auto-size text size (" + f3 + "px) is less or equal to minimum auto-size text size (" + f2 + "px)");
                    }
                } else {
                    throw new IllegalArgumentException("Minimum auto-size text size (" + f2 + "px) is less or equal to (0px)");
                }
            }
            if (i8 == 1 && (!z7 || iqVar.e.length == 0)) {
                int floor = ((int) Math.floor((iqVar.d - iqVar.c) / iqVar.b)) + 1;
                int[] iArr5 = new int[floor];
                for (int i9 = 0; i9 < floor; i9++) {
                    iArr5[i9] = Math.round((i9 * iqVar.b) + iqVar.c);
                }
                iqVar.e = iq.a(iArr5);
            }
        }
        if (iqVar.a != 0) {
            int[] iArr6 = iqVar.e;
            if (iArr6.length > 0) {
                if (zp.a(textView) != -1.0f) {
                    zp.b(textView, Math.round(iqVar.c), Math.round(iqVar.d), Math.round(iqVar.b), 0);
                } else {
                    zp.c(textView, iArr6, 0);
                }
            }
        }
        TypedArray obtainStyledAttributes5 = context.obtainStyledAttributes(attributeSet, iArr);
        int resourceId4 = obtainStyledAttributes5.getResourceId(8, -1);
        if (resourceId4 != -1) {
            drawable = upVar.a(context, resourceId4);
        } else {
            drawable = null;
        }
        int resourceId5 = obtainStyledAttributes5.getResourceId(13, -1);
        if (resourceId5 != -1) {
            drawable2 = upVar.a(context, resourceId5);
        } else {
            drawable2 = null;
        }
        int resourceId6 = obtainStyledAttributes5.getResourceId(9, -1);
        if (resourceId6 != -1) {
            drawable3 = upVar.a(context, resourceId6);
        } else {
            drawable3 = null;
        }
        int resourceId7 = obtainStyledAttributes5.getResourceId(6, -1);
        if (resourceId7 != -1) {
            drawable4 = upVar.a(context, resourceId7);
        } else {
            drawable4 = null;
        }
        int resourceId8 = obtainStyledAttributes5.getResourceId(10, -1);
        if (resourceId8 != -1) {
            drawable5 = upVar.a(context, resourceId8);
        } else {
            drawable5 = null;
        }
        int resourceId9 = obtainStyledAttributes5.getResourceId(7, -1);
        if (resourceId9 != -1) {
            drawable6 = upVar.a(context, resourceId9);
        }
        if (drawable5 == null && drawable6 == null) {
            if (drawable != null || drawable2 != null || drawable3 != null || drawable4 != null) {
                Drawable[] compoundDrawablesRelative = textView.getCompoundDrawablesRelative();
                Drawable drawable7 = compoundDrawablesRelative[0];
                if (drawable7 == null && compoundDrawablesRelative[2] == null) {
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
                        drawable2 = compoundDrawablesRelative[1];
                    }
                    if (drawable4 == null) {
                        drawable4 = compoundDrawablesRelative[3];
                    }
                    textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable7, drawable2, compoundDrawablesRelative[2], drawable4);
                }
            }
        } else {
            Drawable[] compoundDrawablesRelative2 = textView.getCompoundDrawablesRelative();
            if (drawable5 == null) {
                drawable5 = compoundDrawablesRelative2[0];
            }
            if (drawable2 == null) {
                drawable2 = compoundDrawablesRelative2[1];
            }
            if (drawable6 == null) {
                drawable6 = compoundDrawablesRelative2[2];
            }
            Drawable drawable8 = drawable6;
            if (drawable4 == null) {
                drawable4 = compoundDrawablesRelative2[3];
            }
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable5, drawable2, drawable8, drawable4);
        }
        if (obtainStyledAttributes5.hasValue(11)) {
            if (!obtainStyledAttributes5.hasValue(11) || (resourceId = obtainStyledAttributes5.getResourceId(11, 0)) == 0 || (colorStateList = t80.I(context, resourceId)) == null) {
                colorStateList = obtainStyledAttributes5.getColorStateList(11);
            }
            textView.setCompoundDrawableTintList(colorStateList);
        }
        if (obtainStyledAttributes5.hasValue(12)) {
            textView.setCompoundDrawableTintMode(mp1.a(obtainStyledAttributes5.getInt(12, -1)));
        }
        int dimensionPixelSize = obtainStyledAttributes5.getDimensionPixelSize(15, -1);
        int dimensionPixelSize2 = obtainStyledAttributes5.getDimensionPixelSize(18, -1);
        if (obtainStyledAttributes5.hasValue(19)) {
            TypedValue peekValue = obtainStyledAttributes5.peekValue(19);
            if (peekValue != null && peekValue.type == 5) {
                int i10 = peekValue.data;
                i3 = i10 & 15;
                f4 = TypedValue.complexToFloat(i10);
                i2 = -1;
            } else {
                i2 = -1;
                f4 = obtainStyledAttributes5.getDimensionPixelSize(19, -1);
                i3 = -1;
            }
        } else {
            i2 = -1;
            i3 = -1;
            f4 = -1.0f;
        }
        obtainStyledAttributes5.recycle();
        if (dimensionPixelSize != i2) {
            if (dimensionPixelSize >= 0) {
                textView.setFirstBaselineToTopHeight(dimensionPixelSize);
            } else {
                p65.b();
                return;
            }
        }
        if (dimensionPixelSize2 != i2) {
            if (dimensionPixelSize2 >= 0) {
                Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
                if (textView.getIncludeFontPadding()) {
                    i4 = fontMetricsInt.bottom;
                } else {
                    i4 = fontMetricsInt.descent;
                }
                if (dimensionPixelSize2 > Math.abs(i4)) {
                    textView.setPadding(textView.getPaddingLeft(), textView.getPaddingTop(), textView.getPaddingRight(), dimensionPixelSize2 - i4);
                }
            } else {
                p65.b();
                return;
            }
        }
        if (f4 != -1.0f) {
            if (i3 == -1) {
                iz5.k(textView, (int) f4);
            } else if (Build.VERSION.SDK_INT >= 34) {
                s3.n(textView, i3, f4);
            } else {
                iz5.k(textView, Math.round(TypedValue.applyDimension(i3, f4, textView.getResources().getDisplayMetrics())));
            }
        }
    }

    public final void e(Context context, int i) {
        String string;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i, ux4.g);
        xf6 xf6Var = new xf6(context, obtainStyledAttributes);
        boolean hasValue = obtainStyledAttributes.hasValue(14);
        TextView textView = this.a;
        if (hasValue) {
            textView.setAllCaps(obtainStyledAttributes.getBoolean(14, false));
        }
        if (obtainStyledAttributes.hasValue(0) && obtainStyledAttributes.getDimensionPixelSize(0, -1) == 0) {
            textView.setTextSize(0, 0.0f);
        }
        f(context, xf6Var);
        if (obtainStyledAttributes.hasValue(13) && (string = obtainStyledAttributes.getString(13)) != null) {
            zp.d(textView, string);
        }
        xf6Var.d();
        Typeface typeface = this.l;
        if (typeface != null) {
            textView.setTypeface(typeface, this.j);
        }
    }

    public final void f(Context context, xf6 xf6Var) {
        String string;
        boolean z;
        boolean z2;
        int i = this.j;
        TypedArray typedArray = (TypedArray) xf6Var.z;
        this.j = typedArray.getInt(2, i);
        int i2 = typedArray.getInt(11, -1);
        this.k = i2;
        if (i2 != -1) {
            this.j &= 2;
        }
        int i3 = 10;
        boolean z3 = true;
        if (!typedArray.hasValue(10) && !typedArray.hasValue(12)) {
            if (typedArray.hasValue(1)) {
                this.m = false;
                int i4 = typedArray.getInt(1, 1);
                if (i4 != 1) {
                    if (i4 != 2) {
                        if (i4 == 3) {
                            this.l = Typeface.MONOSPACE;
                            return;
                        }
                        return;
                    }
                    this.l = Typeface.SERIF;
                    return;
                }
                this.l = Typeface.SANS_SERIF;
                return;
            }
            return;
        }
        this.l = null;
        if (typedArray.hasValue(12)) {
            i3 = 12;
        }
        int i5 = this.k;
        int i6 = this.j;
        if (!context.isRestricted()) {
            try {
                Typeface c = xf6Var.c(i3, this.j, new wp(this, i5, i6, new WeakReference(this.a)));
                if (c != null) {
                    if (this.k != -1) {
                        Typeface create = Typeface.create(c, 0);
                        int i7 = this.k;
                        if ((this.j & 2) != 0) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        this.l = aq.a(create, i7, z2);
                    } else {
                        this.l = c;
                    }
                }
                if (this.l == null) {
                    z = true;
                } else {
                    z = false;
                }
                this.m = z;
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            }
        }
        if (this.l == null && (string = typedArray.getString(i3)) != null) {
            if (this.k != -1) {
                Typeface create2 = Typeface.create(string, 0);
                int i8 = this.k;
                if ((this.j & 2) == 0) {
                    z3 = false;
                }
                this.l = aq.a(create2, i8, z3);
                return;
            }
            this.l = Typeface.create(string, this.j);
        }
    }
}
