package h5;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.os.Build;
import android.util.Log;
import com.google.android.gms.common.internal.p0;
import j5.b;
import java.util.NoSuchElementException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: b, reason: collision with root package name */
    public static final Object f5005b = new Object();

    /* renamed from: c, reason: collision with root package name */
    public static volatile a f5006c;

    /* renamed from: a, reason: collision with root package name */
    public final ConcurrentHashMap f5007a = new ConcurrentHashMap();

    public final void a(Context context, ServiceConnection serviceConnection) {
        if (!(serviceConnection instanceof p0)) {
            ConcurrentHashMap concurrentHashMap = this.f5007a;
            if (concurrentHashMap.containsKey(serviceConnection)) {
                try {
                    try {
                        context.unbindService((ServiceConnection) concurrentHashMap.get(serviceConnection));
                    } catch (IllegalArgumentException | IllegalStateException | NoSuchElementException unused) {
                    }
                    return;
                } finally {
                    concurrentHashMap.remove(serviceConnection);
                }
            }
        }
        try {
            context.unbindService(serviceConnection);
        } catch (IllegalArgumentException | IllegalStateException | NoSuchElementException unused2) {
        }
    }

    public final boolean b(Context context, String str, Intent intent, ServiceConnection serviceConnection, Executor executor) {
        boolean bindService;
        ComponentName component = intent.getComponent();
        boolean z9 = false;
        if (component != null) {
            String packageName = component.getPackageName();
            "com.google.android.gms".equals(packageName);
            try {
                if ((b.a(context).f1527b.getPackageManager().getApplicationInfo(packageName, 0).flags & 2097152) != 0) {
                    Log.w("ConnectionTracker", "Attempted to bind to a service in a STOPPED package.");
                    return false;
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        boolean z10 = true;
        if (!(serviceConnection instanceof p0)) {
            ConcurrentHashMap concurrentHashMap = this.f5007a;
            ServiceConnection serviceConnection2 = (ServiceConnection) concurrentHashMap.putIfAbsent(serviceConnection, serviceConnection);
            if (serviceConnection2 != null && serviceConnection != serviceConnection2) {
                Log.w("ConnectionTracker", String.format("Duplicate binding with the same ServiceConnection: %s, %s, %s.", serviceConnection, str, intent.getAction()));
            }
            try {
                if (Build.VERSION.SDK_INT < 29) {
                    z10 = false;
                }
                if (z10 && executor != null) {
                    bindService = context.bindService(intent, 4225, executor, serviceConnection);
                } else {
                    bindService = context.bindService(intent, serviceConnection, 4225);
                }
                if (!bindService) {
                    concurrentHashMap.remove(serviceConnection, serviceConnection);
                    return false;
                }
            } catch (Throwable th) {
                concurrentHashMap.remove(serviceConnection, serviceConnection);
                throw th;
            }
        } else {
            if (Build.VERSION.SDK_INT >= 29) {
                z9 = true;
            }
            if (z9 && executor != null) {
                bindService = context.bindService(intent, 4225, executor, serviceConnection);
            } else {
                bindService = context.bindService(intent, serviceConnection, 4225);
            }
        }
        return bindService;
    }
}
