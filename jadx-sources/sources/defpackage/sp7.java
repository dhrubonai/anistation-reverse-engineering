package defpackage;

import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.unity3d.services.core.fid.Constants;
import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class sp7 {
    public static volatile sp7 g;
    public final ExecutorService a;
    public final AppMeasurementSdk b;
    public int c;
    public boolean d;
    public volatile wn7 e;
    public volatile long f;

    public sp7(Context context, Bundle bundle) {
        sa1 sa1Var = new sa1(this);
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), sa1Var);
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        this.a = Executors.unconfigurableExecutorService(threadPoolExecutor);
        this.b = new AppMeasurementSdk(this);
        new ArrayList();
        byte b = 0;
        try {
            if (ct5.q(context, lz5.h(context)) != null) {
                try {
                    Class.forName(Constants.FID_CLASS, false, sp7.class.getClassLoader());
                } catch (ClassNotFoundException unused) {
                    this.d = true;
                    Log.w("FA", "Disabling data collection. Found google_app_id in strings.xml but Google Analytics for Firebase is missing. Add Google Analytics for Firebase to resume data collection.");
                    return;
                }
            }
        } catch (IllegalStateException unused2) {
        }
        a(new xo7(this, context, bundle, b));
        Application application = (Application) context.getApplicationContext();
        if (application == null) {
            Log.w("FA", "Unable to register lifecycle notifications. Application null.");
        } else {
            application.registerActivityLifecycleCallbacks(new rp7(this, b));
        }
    }

    public static sp7 c(Context context, Bundle bundle) {
        Bundle bundle2;
        a34.x(context);
        if (g == null) {
            synchronized (sp7.class) {
                try {
                    if (g == null) {
                        if (bundle == null) {
                            bundle2 = new Bundle();
                        } else {
                            bundle2 = new Bundle(bundle);
                        }
                        g = new sp7(context, bundle2);
                    }
                } finally {
                }
            }
        }
        return g;
    }

    public final void a(kp7 kp7Var) {
        this.a.execute(kp7Var);
    }

    public final void b(Exception exc, boolean z, boolean z2) {
        this.d |= z;
        if (z) {
            Log.w("FA", "Data collection startup failed. No data will be collected.", exc);
            return;
        }
        if (z2) {
            a(new uo7(this, exc));
        }
        Log.w("FA", "Error with data collection. Data lost.", exc);
    }

    public final long d() {
        sn7 sn7Var = new sn7();
        a(new ap7(this, sn7Var, (byte) 2));
        Long l = (Long) sn7.K(sn7Var.b(500L), Long.class);
        if (l == null) {
            long nextLong = new Random(System.nanoTime() ^ System.currentTimeMillis()).nextLong();
            int i = this.c + 1;
            this.c = i;
            return nextLong + i;
        }
        return l.longValue();
    }
}
