package defpackage;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class se implements Application.ActivityLifecycleCallbacks {
    public final double x;
    public final /* synthetic */ qb0 y;

    public se(qb0 qb0Var, kz4 kz4Var) {
        this.y = qb0Var;
        hz4 hz4Var = kz4Var.a;
        w4 w4Var = wu2.a;
        Object obj = hz4Var.b.n.a.get(wu2.d);
        this.x = ((Number) (obj == null ? Double.valueOf(1.0d) : obj)).doubleValue();
    }

    public final void a(Context context) {
        long j;
        double d = this.x;
        if (d != 1.0d) {
            Context applicationContext = context.getApplicationContext();
            applicationContext.getClass();
            ((Application) applicationContext).registerActivityLifecycleCallbacks(this);
            qb0 qb0Var = this.y;
            kz4 kz4Var = (kz4) ((WeakReference) qb0Var.y).get();
            if (kz4Var != null) {
                nz4 c = kz4Var.c();
                if (c != null) {
                    synchronized (c.c) {
                        j = c.a.a;
                    }
                    c.a((long) (d * j));
                    return;
                }
                return;
            }
            qb0Var.q();
        }
    }

    public final void b(Context context) {
        long j;
        if (this.x != 1.0d) {
            Context applicationContext = context.getApplicationContext();
            applicationContext.getClass();
            ((Application) applicationContext).unregisterActivityLifecycleCallbacks(this);
            qb0 qb0Var = this.y;
            kz4 kz4Var = (kz4) ((WeakReference) qb0Var.y).get();
            if (kz4Var != null) {
                nz4 c = kz4Var.c();
                if (c != null) {
                    synchronized (c.c) {
                        j = c.a.a;
                    }
                    c.a(j);
                    return;
                }
                return;
            }
            qb0Var.q();
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        b(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }
}
