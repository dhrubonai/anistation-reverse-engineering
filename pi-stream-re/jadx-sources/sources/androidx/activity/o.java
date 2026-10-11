package androidx.activity;

import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import java.util.Objects;

/* loaded from: classes.dex */
public abstract class o {
    public static OnBackInvokedCallback a(Runnable runnable) {
        Objects.requireNonNull(runnable);
        return new n(runnable, 0);
    }

    public static void b(Object obj, int i10, Object obj2) {
        ((OnBackInvokedDispatcher) obj).registerOnBackInvokedCallback(i10, (OnBackInvokedCallback) obj2);
    }

    public static void c(Object obj, Object obj2) {
        ((OnBackInvokedDispatcher) obj).unregisterOnBackInvokedCallback((OnBackInvokedCallback) obj2);
    }
}
