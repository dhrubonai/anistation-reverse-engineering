package com.google.android.gms.measurement;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import android.util.SparseArray;
import defpackage.es7;
import defpackage.gu7;
import defpackage.jx6;
import defpackage.qp7;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class AppMeasurementReceiver extends jx6 {
    public qp7 c;

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (this.c == null) {
            this.c = new qp7(this);
        }
        es7 es7Var = gu7.q(context, null, null, null).C;
        gu7.l(es7Var);
        if (intent == null) {
            es7Var.F.a("Receiver called with null intent");
            return;
        }
        String action = intent.getAction();
        es7Var.K.b(action, "Local receiver got");
        if ("com.google.android.gms.measurement.UPLOAD".equals(action)) {
            Intent className = new Intent().setClassName(context, "com.google.android.gms.measurement.AppMeasurementService");
            className.setAction("com.google.android.gms.measurement.UPLOAD");
            es7Var.K.a("Starting wakeful intent.");
            SparseArray sparseArray = jx6.a;
            synchronized (sparseArray) {
                try {
                    int i = jx6.b;
                    int i2 = i + 1;
                    jx6.b = i2;
                    if (i2 <= 0) {
                        jx6.b = 1;
                    }
                    className.putExtra("androidx.contentpager.content.wakelockid", i);
                    ComponentName startService = context.startService(className);
                    if (startService == null) {
                        return;
                    }
                    PowerManager.WakeLock newWakeLock = ((PowerManager) context.getSystemService("power")).newWakeLock(1, "androidx.core:wake:" + startService.flattenToShortString());
                    newWakeLock.setReferenceCounted(false);
                    newWakeLock.acquire(60000L);
                    sparseArray.put(i, newWakeLock);
                    return;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        if ("com.android.vending.INSTALL_REFERRER".equals(action)) {
            es7Var.F.a("Install Referrer Broadcasts are deprecated");
        }
    }
}
