package k;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* loaded from: classes.dex */
public final class e extends z7.c {

    /* renamed from: l, reason: collision with root package name */
    public final Object f6285l = new Object();

    /* renamed from: m, reason: collision with root package name */
    public final ExecutorService f6286m = Executors.newFixedThreadPool(4, new c());

    /* renamed from: n, reason: collision with root package name */
    public volatile Handler f6287n;

    public static Handler y(Looper looper) {
        if (Build.VERSION.SDK_INT >= 28) {
            return d.a(looper);
        }
        try {
            return (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(looper, null, Boolean.TRUE);
        } catch (IllegalAccessException | InstantiationException | NoSuchMethodException unused) {
            return new Handler(looper);
        } catch (InvocationTargetException unused2) {
            return new Handler(looper);
        }
    }
}
