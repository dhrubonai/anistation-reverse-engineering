package androidx.appcompat.widget;

import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.View;
import java.lang.reflect.Method;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public abstract class n4 {

    /* renamed from: a, reason: collision with root package name */
    public static final Method f580a;

    /* renamed from: b, reason: collision with root package name */
    public static final boolean f581b;

    static {
        boolean z9;
        if (Build.VERSION.SDK_INT >= 27) {
            z9 = true;
        } else {
            z9 = false;
        }
        f581b = z9;
        try {
            Method declaredMethod = View.class.getDeclaredMethod("computeFitSystemWindows", Rect.class, Rect.class);
            f580a = declaredMethod;
            if (!declaredMethod.isAccessible()) {
                declaredMethod.setAccessible(true);
            }
        } catch (NoSuchMethodException unused) {
            Log.d("ViewUtils", "Could not find method computeFitSystemWindows. Oh well.");
        }
    }

    public static boolean a(View view) {
        WeakHashMap weakHashMap = g0.y0.f4277a;
        if (g0.i0.d(view) == 1) {
            return true;
        }
        return false;
    }
}
