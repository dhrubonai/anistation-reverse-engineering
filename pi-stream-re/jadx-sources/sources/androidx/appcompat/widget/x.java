package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.util.Log;

/* loaded from: classes.dex */
public final class x {

    /* renamed from: b, reason: collision with root package name */
    public static final PorterDuff.Mode f697b = PorterDuff.Mode.SRC_IN;

    /* renamed from: c, reason: collision with root package name */
    public static x f698c;

    /* renamed from: a, reason: collision with root package name */
    public y2 f699a;

    public static synchronized x a() {
        x xVar;
        synchronized (x.class) {
            if (f698c == null) {
                d();
            }
            xVar = f698c;
        }
        return xVar;
    }

    public static synchronized PorterDuffColorFilter c(int i10, PorterDuff.Mode mode) {
        PorterDuffColorFilter h10;
        synchronized (x.class) {
            h10 = y2.h(i10, mode);
        }
        return h10;
    }

    public static synchronized void d() {
        synchronized (x.class) {
            if (f698c == null) {
                x xVar = new x();
                f698c = xVar;
                xVar.f699a = y2.d();
                f698c.f699a.l(new w());
            }
        }
    }

    public static void e(Drawable drawable, x3 x3Var, int[] iArr) {
        boolean z9;
        ColorStateList colorStateList;
        PorterDuff.Mode mode;
        PorterDuff.Mode mode2 = y2.f713h;
        int[] state = drawable.getState();
        int[] iArr2 = v1.f670a;
        if (drawable.mutate() == drawable) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (!z9) {
            Log.d("ResourceManagerInternal", "Mutated drawable is not the same instance as the input.");
            return;
        }
        if ((drawable instanceof LayerDrawable) && drawable.isStateful()) {
            drawable.setState(new int[0]);
            drawable.setState(state);
        }
        boolean z10 = x3Var.f706c;
        if (!z10 && !x3Var.f705b) {
            drawable.clearColorFilter();
        } else {
            PorterDuffColorFilter porterDuffColorFilter = null;
            if (z10) {
                colorStateList = (ColorStateList) x3Var.f707d;
            } else {
                colorStateList = null;
            }
            if (x3Var.f705b) {
                mode = (PorterDuff.Mode) x3Var.f708e;
            } else {
                mode = y2.f713h;
            }
            if (colorStateList != null && mode != null) {
                porterDuffColorFilter = y2.h(colorStateList.getColorForState(iArr, 0), mode);
            }
            drawable.setColorFilter(porterDuffColorFilter);
        }
        if (Build.VERSION.SDK_INT <= 23) {
            drawable.invalidateSelf();
        }
    }

    public final synchronized Drawable b(Context context, int i10) {
        return this.f699a.f(context, i10);
    }
}
