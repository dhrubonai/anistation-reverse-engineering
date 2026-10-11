package com.google.android.gms.measurement;

import android.app.Service;
import android.app.job.JobParameters;
import android.content.Intent;
import android.os.IBinder;
import android.os.PowerManager;
import android.util.Log;
import android.util.SparseArray;
import defpackage.es7;
import defpackage.f08;
import defpackage.gu7;
import defpackage.jx6;
import defpackage.ly7;
import defpackage.nv7;
import defpackage.qb7;
import defpackage.vx7;
import defpackage.z18;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class AppMeasurementService extends Service implements f08 {
    public qb7 x;

    @Override // defpackage.f08
    public final boolean a(int i) {
        return stopSelfResult(i);
    }

    @Override // defpackage.f08
    public final void b(Intent intent) {
        SparseArray sparseArray = jx6.a;
        int intExtra = intent.getIntExtra("androidx.contentpager.content.wakelockid", 0);
        if (intExtra == 0) {
            return;
        }
        SparseArray sparseArray2 = jx6.a;
        synchronized (sparseArray2) {
            try {
                PowerManager.WakeLock wakeLock = (PowerManager.WakeLock) sparseArray2.get(intExtra);
                if (wakeLock != null) {
                    wakeLock.release();
                    sparseArray2.remove(intExtra);
                } else {
                    Log.w("WakefulBroadcastReceiv.", "No active wake lock id #" + intExtra);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.f08
    public final void c(JobParameters jobParameters) {
        throw new UnsupportedOperationException();
    }

    public final qb7 d() {
        qb7 qb7Var = this.x;
        if (qb7Var == null) {
            qb7 qb7Var2 = new qb7(this, (byte) 9);
            this.x = qb7Var2;
            return qb7Var2;
        }
        return qb7Var;
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        qb7 d = d();
        if (intent == null) {
            Log.e("FA", "onBind called with null intent");
            return null;
        }
        String action = intent.getAction();
        if ("com.google.android.gms.measurement.START".equals(action)) {
            return new nv7(z18.C((Service) d.y));
        }
        Log.w("FA", "onBind received unknown action: ".concat(String.valueOf(action)));
        return null;
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        Log.v("FA", ((Service) d().y).getClass().getSimpleName().concat(" is starting up."));
    }

    @Override // android.app.Service
    public final void onDestroy() {
        Log.v("FA", ((Service) d().y).getClass().getSimpleName().concat(" is shutting down."));
        super.onDestroy();
    }

    @Override // android.app.Service
    public final void onRebind(Intent intent) {
        d();
        if (intent == null) {
            Log.e("FA", "onRebind called with null intent");
        } else {
            Log.v("FA", "onRebind called. action: ".concat(String.valueOf(intent.getAction())));
        }
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        qb7 d = d();
        if (intent == null) {
            Log.w("FA", "AppMeasurementService started with null intent");
            return 2;
        }
        Service service = (Service) d.y;
        es7 es7Var = gu7.q(service, null, null, null).C;
        gu7.l(es7Var);
        String action = intent.getAction();
        es7Var.K.c("Local AppMeasurementService called. startId, action", Integer.valueOf(i2), action);
        if ("com.google.android.gms.measurement.UPLOAD".equals(action)) {
            vx7 vx7Var = new vx7(d, i2, es7Var, intent);
            z18 C = z18.C(service);
            C.f().U(new ly7(d, C, vx7Var, (byte) 4));
            return 2;
        }
        return 2;
    }

    @Override // android.app.Service
    public final boolean onUnbind(Intent intent) {
        d();
        if (intent == null) {
            Log.e("FA", "onUnbind called with null intent");
            return true;
        }
        Log.v("FA", "onUnbind called for intent. action: ".concat(String.valueOf(intent.getAction())));
        return true;
    }
}
