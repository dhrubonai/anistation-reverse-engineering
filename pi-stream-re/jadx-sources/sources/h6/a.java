package h6;

import android.R;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Build;
import android.util.Log;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final int[] f5008a = {R.attr.state_enabled, R.attr.state_pressed};

    /* renamed from: b, reason: collision with root package name */
    public static final String f5009b = a.class.getSimpleName();

    public static ColorStateList a(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (Build.VERSION.SDK_INT <= 27 && Color.alpha(colorStateList.getDefaultColor()) == 0 && Color.alpha(colorStateList.getColorForState(f5008a, 0)) != 0) {
                Log.w(f5009b, "Use a non-transparent color for the default color as it will be used to finish ripple animations.");
            }
            return colorStateList;
        }
        return ColorStateList.valueOf(0);
    }

    public static boolean b(int[] iArr) {
        boolean z9 = false;
        boolean z10 = false;
        for (int i10 : iArr) {
            if (i10 == 16842910) {
                z9 = true;
            } else if (i10 == 16842908 || i10 == 16842919 || i10 == 16843623) {
                z10 = true;
            }
        }
        if (!z9 || !z10) {
            return false;
        }
        return true;
    }
}
