package androidx.work.impl.background.systemalarm;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import defpackage.l77;
import defpackage.xk3;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public class RescheduleReceiver extends BroadcastReceiver {
    public static final String a = xk3.f("RescheduleReceiver");

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        xk3.d().a(a, "Received intent " + intent);
        try {
            l77 b = l77.b(context);
            BroadcastReceiver.PendingResult goAsync = goAsync();
            synchronized (l77.m) {
                try {
                    BroadcastReceiver.PendingResult pendingResult = b.i;
                    if (pendingResult != null) {
                        pendingResult.finish();
                    }
                    b.i = goAsync;
                    if (b.h) {
                        goAsync.finish();
                        b.i = null;
                    }
                } finally {
                }
            }
        } catch (IllegalStateException e) {
            xk3.d().c(a, "Cannot reschedule jobs. WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().", e);
        }
    }
}
