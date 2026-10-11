package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;

/* loaded from: classes.dex */
public abstract class v3 {

    /* renamed from: a, reason: collision with root package name */
    public static final ThreadLocal f673a = new ThreadLocal();

    /* renamed from: b, reason: collision with root package name */
    public static final int[] f674b = {-16842910};

    /* renamed from: c, reason: collision with root package name */
    public static final int[] f675c = {R.attr.state_focused};

    /* renamed from: d, reason: collision with root package name */
    public static final int[] f676d = {R.attr.state_pressed};

    /* renamed from: e, reason: collision with root package name */
    public static final int[] f677e = {R.attr.state_checked};

    /* renamed from: f, reason: collision with root package name */
    public static final int[] f678f = new int[0];

    /* renamed from: g, reason: collision with root package name */
    public static final int[] f679g = new int[1];

    public static void a(Context context, View view) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(e.a.f3279j);
        try {
            if (!obtainStyledAttributes.hasValue(117)) {
                Log.e("ThemeUtils", "View " + view.getClass() + " is an AppCompat widget that can only be used with a Theme.AppCompat theme (or descendant).");
            }
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public static int b(Context context, int i10) {
        ColorStateList d10 = d(context, i10);
        if (d10 != null && d10.isStateful()) {
            return d10.getColorForState(f674b, d10.getDefaultColor());
        }
        ThreadLocal threadLocal = f673a;
        TypedValue typedValue = (TypedValue) threadLocal.get();
        if (typedValue == null) {
            typedValue = new TypedValue();
            threadLocal.set(typedValue);
        }
        context.getTheme().resolveAttribute(R.attr.disabledAlpha, typedValue, true);
        float f10 = typedValue.getFloat();
        return z.a.c(c(context, i10), Math.round(Color.alpha(r4) * f10));
    }

    public static int c(Context context, int i10) {
        int[] iArr = f679g;
        iArr[0] = i10;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, iArr);
        try {
            return obtainStyledAttributes.getColor(0, 0);
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public static ColorStateList d(Context context, int i10) {
        ColorStateList colorStateList;
        int resourceId;
        int[] iArr = f679g;
        iArr[0] = i10;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, iArr);
        try {
            if (!obtainStyledAttributes.hasValue(0) || (resourceId = obtainStyledAttributes.getResourceId(0, 0)) == 0 || (colorStateList = x.j.getColorStateList(context, resourceId)) == null) {
                colorStateList = obtainStyledAttributes.getColorStateList(0);
            }
            return colorStateList;
        } finally {
            obtainStyledAttributes.recycle();
        }
    }
}
