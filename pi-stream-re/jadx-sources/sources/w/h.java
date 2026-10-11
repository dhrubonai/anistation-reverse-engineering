package w;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

/* loaded from: classes.dex */
public final class h implements Application.ActivityLifecycleCallbacks {

    /* renamed from: a, reason: collision with root package name */
    public Object f10700a;

    /* renamed from: b, reason: collision with root package name */
    public Activity f10701b;

    /* renamed from: c, reason: collision with root package name */
    public final int f10702c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f10703d = false;

    /* renamed from: e, reason: collision with root package name */
    public boolean f10704e = false;

    /* renamed from: f, reason: collision with root package name */
    public boolean f10705f = false;

    public h(Activity activity) {
        this.f10701b = activity;
        this.f10702c = activity.hashCode();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        if (this.f10701b == activity) {
            this.f10701b = null;
            this.f10704e = true;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    @Override // android.app.Application.ActivityLifecycleCallbacks
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onActivityPaused(android.app.Activity r6) {
        /*
            r5 = this;
            boolean r0 = r5.f10704e
            if (r0 == 0) goto L43
            boolean r0 = r5.f10705f
            if (r0 != 0) goto L43
            boolean r0 = r5.f10703d
            if (r0 != 0) goto L43
            java.lang.Object r0 = r5.f10700a
            r1 = 1
            java.lang.reflect.Field r2 = w.i.f10708c     // Catch: java.lang.Throwable -> L33
            java.lang.Object r2 = r2.get(r6)     // Catch: java.lang.Throwable -> L33
            if (r2 != r0) goto L3b
            int r0 = r6.hashCode()     // Catch: java.lang.Throwable -> L33
            int r3 = r5.f10702c
            if (r0 == r3) goto L20
            goto L3b
        L20:
            java.lang.reflect.Field r0 = w.i.f10707b     // Catch: java.lang.Throwable -> L33
            java.lang.Object r6 = r0.get(r6)     // Catch: java.lang.Throwable -> L33
            android.os.Handler r0 = w.i.f10712g     // Catch: java.lang.Throwable -> L33
            androidx.appcompat.widget.j r3 = new androidx.appcompat.widget.j     // Catch: java.lang.Throwable -> L33
            r4 = 3
            r3.<init>(r6, r2, r4)     // Catch: java.lang.Throwable -> L33
            r0.postAtFrontOfQueue(r3)     // Catch: java.lang.Throwable -> L33
            r6 = r1
            goto L3c
        L33:
            r6 = move-exception
            java.lang.String r0 = "ActivityRecreator"
            java.lang.String r2 = "Exception while fetching field values"
            android.util.Log.e(r0, r2, r6)
        L3b:
            r6 = 0
        L3c:
            if (r6 == 0) goto L43
            r5.f10705f = r1
            r6 = 0
            r5.f10700a = r6
        L43:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: w.h.onActivityPaused(android.app.Activity):void");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        if (this.f10701b == activity) {
            this.f10703d = true;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }
}
