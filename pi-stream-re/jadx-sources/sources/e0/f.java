package e0;

import android.os.Build;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Locale;

/* loaded from: classes.dex */
public abstract class f {

    /* renamed from: a, reason: collision with root package name */
    public static final Method f3310a;

    static {
        if (Build.VERSION.SDK_INT < 24) {
            try {
                f3310a = Class.forName("libcore.icu.ICU").getMethod("addLikelySubtags", Locale.class);
            } catch (Exception e10) {
                throw new IllegalStateException(e10);
            }
        }
    }

    public static String a(Locale locale) {
        if (Build.VERSION.SDK_INT >= 24) {
            return e.c(e.a(e.b(locale)));
        }
        try {
            return d.a((Locale) f3310a.invoke(null, locale));
        } catch (IllegalAccessException e10) {
            Log.w("ICUCompat", e10);
            return d.a(locale);
        } catch (InvocationTargetException e11) {
            Log.w("ICUCompat", e11);
            return d.a(locale);
        }
    }
}
