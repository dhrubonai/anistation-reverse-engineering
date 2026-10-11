package i4;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.AsyncTask;
import android.util.Log;
import f.c0;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class u implements q {

    /* renamed from: x, reason: collision with root package name */
    public static final Executor f5371x = AsyncTask.SERIAL_EXECUTOR;

    /* renamed from: a, reason: collision with root package name */
    public final Context f5372a;

    /* renamed from: b, reason: collision with root package name */
    public final a f5373b;

    /* renamed from: c, reason: collision with root package name */
    public final p4.f f5374c;

    /* renamed from: d, reason: collision with root package name */
    public volatile boolean f5375d;

    /* renamed from: e, reason: collision with root package name */
    public volatile boolean f5376e;

    /* renamed from: f, reason: collision with root package name */
    public final c0 f5377f = new c0(this, 4);

    public u(Context context, x3.p pVar, p pVar2) {
        this.f5372a = context.getApplicationContext();
        this.f5374c = pVar;
        this.f5373b = pVar2;
    }

    @Override // i4.q
    public final boolean a() {
        f5371x.execute(new t(this, 0));
        return true;
    }

    @Override // i4.q
    public final void b() {
        f5371x.execute(new t(this, 1));
    }

    public final boolean c() {
        try {
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) this.f5374c.get()).getActiveNetworkInfo();
            if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
                return true;
            }
            return false;
        } catch (RuntimeException e10) {
            if (Log.isLoggable("ConnectivityMonitor", 5)) {
                Log.w("ConnectivityMonitor", "Failed to determine connectivity status when connectivity changed", e10);
            }
            return true;
        }
    }
}
