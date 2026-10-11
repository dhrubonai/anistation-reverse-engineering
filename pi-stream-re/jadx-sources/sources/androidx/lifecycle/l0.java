package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

/* loaded from: classes.dex */
public final class l0 implements Application.ActivityLifecycleCallbacks {
    public static final k0 Companion = new k0();

    public static final void registerIn(Activity activity) {
        Companion.getClass();
        r6.h0.u(activity, "activity");
        activity.registerActivityLifecycleCallbacks(new l0());
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        r6.h0.u(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        r6.h0.u(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        r6.h0.u(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPostCreated(Activity activity, Bundle bundle) {
        r6.h0.u(activity, "activity");
        int i10 = m0.f1109b;
        j6.e.n(activity, n.ON_CREATE);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPostResumed(Activity activity) {
        r6.h0.u(activity, "activity");
        int i10 = m0.f1109b;
        j6.e.n(activity, n.ON_RESUME);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPostStarted(Activity activity) {
        r6.h0.u(activity, "activity");
        int i10 = m0.f1109b;
        j6.e.n(activity, n.ON_START);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPreDestroyed(Activity activity) {
        r6.h0.u(activity, "activity");
        int i10 = m0.f1109b;
        j6.e.n(activity, n.ON_DESTROY);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPrePaused(Activity activity) {
        r6.h0.u(activity, "activity");
        int i10 = m0.f1109b;
        j6.e.n(activity, n.ON_PAUSE);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPreStopped(Activity activity) {
        r6.h0.u(activity, "activity");
        int i10 = m0.f1109b;
        j6.e.n(activity, n.ON_STOP);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        r6.h0.u(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        r6.h0.u(activity, "activity");
        r6.h0.u(bundle, "bundle");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        r6.h0.u(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        r6.h0.u(activity, "activity");
    }
}
