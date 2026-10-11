package androidx.work.impl.foreground;

import android.app.ForegroundServiceStartNotAllowedException;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.Service;
import android.content.Intent;
import android.os.Build;
import android.os.IBinder;
import android.text.TextUtils;
import defpackage.dg3;
import defpackage.dn0;
import defpackage.ej5;
import defpackage.fg3;
import defpackage.h46;
import defpackage.l77;
import defpackage.m18;
import defpackage.n;
import defpackage.o77;
import defpackage.og3;
import defpackage.q76;
import defpackage.rg3;
import defpackage.sw0;
import defpackage.xk3;
import defpackage.yc2;
import java.util.UUID;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public class SystemForegroundService extends Service implements og3 {
    public static final String B = xk3.f("SystemFgService");
    public NotificationManager A;
    public final dn0 x = new dn0(this);
    public boolean y;
    public h46 z;

    public final void a() {
        this.A = (NotificationManager) getApplicationContext().getSystemService("notification");
        h46 h46Var = new h46(getApplicationContext());
        this.z = h46Var;
        if (h46Var.F != null) {
            xk3.d().b(h46.G, "A callback already exists.");
        } else {
            h46Var.F = this;
        }
    }

    public final void b() {
        dn0 dn0Var = this.x;
        dn0Var.getClass();
        dn0Var.J(dg3.ON_CREATE);
        super.onCreate();
    }

    public final void c() {
        dn0 dn0Var = this.x;
        dn0Var.getClass();
        dn0Var.J(dg3.ON_STOP);
        dn0Var.J(dg3.ON_DESTROY);
        super.onDestroy();
    }

    public final void d(int i, int i2, Notification notification) {
        String str = B;
        if (Build.VERSION.SDK_INT >= 31) {
            try {
                startForeground(i, notification, i2);
                return;
            } catch (ForegroundServiceStartNotAllowedException e) {
                xk3.d().h(str, "Unable to start foreground service", e);
                return;
            } catch (SecurityException e2) {
                xk3.d().h(str, "Unable to start foreground service", e2);
                return;
            }
        }
        startForeground(i, notification, i2);
    }

    @Override // defpackage.og3
    public final fg3 getLifecycle() {
        return (rg3) this.x.y;
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        intent.getClass();
        dn0 dn0Var = this.x;
        dn0Var.getClass();
        dn0Var.J(dg3.ON_START);
        return null;
    }

    @Override // android.app.Service
    public final void onCreate() {
        b();
        a();
    }

    @Override // android.app.Service
    public final void onDestroy() {
        c();
        this.z.e();
    }

    @Override // android.app.Service
    public final void onStart(Intent intent, int i) {
        dn0 dn0Var = this.x;
        dn0Var.getClass();
        dn0Var.J(dg3.ON_START);
        super.onStart(intent, i);
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        super.onStartCommand(intent, i, i2);
        boolean z = this.y;
        boolean z2 = false;
        String str = B;
        if (z) {
            xk3.d().e(str, "Re-initializing SystemForegroundService after a request to shut-down.");
            this.z.e();
            a();
            this.y = false;
        }
        if (intent != null) {
            h46 h46Var = this.z;
            h46Var.getClass();
            String str2 = h46.G;
            String action = intent.getAction();
            if ("ACTION_START_FOREGROUND".equals(action)) {
                xk3.d().e(str2, "Started foreground service " + intent);
                String stringExtra = intent.getStringExtra("KEY_WORKSPEC_ID");
                q76 q76Var = h46Var.y;
                yc2 yc2Var = new yc2((byte) 8, h46Var, stringExtra, z2);
                q76Var.getClass();
                ((o77) q76Var).a.execute(yc2Var);
                h46Var.d(intent);
                return 3;
            }
            if ("ACTION_NOTIFY".equals(action)) {
                h46Var.d(intent);
                return 3;
            }
            if ("ACTION_CANCEL_WORK".equals(action)) {
                xk3.d().e(str2, "Stopping foreground work for " + intent);
                String stringExtra2 = intent.getStringExtra("KEY_WORKSPEC_ID");
                if (stringExtra2 != null && !TextUtils.isEmpty(stringExtra2)) {
                    l77 l77Var = h46Var.x;
                    UUID fromString = UUID.fromString(stringExtra2);
                    l77Var.getClass();
                    fromString.getClass();
                    m18 m18Var = l77Var.b.f;
                    ej5 ej5Var = ((o77) l77Var.d).a;
                    ej5Var.getClass();
                    sw0.A(m18Var, "CancelWorkById", ej5Var, new n(l77Var, fromString, (byte) 23));
                    return 3;
                }
                return 3;
            }
            if ("ACTION_STOP_FOREGROUND".equals(action)) {
                xk3.d().e(str2, "Stopping foreground service");
                SystemForegroundService systemForegroundService = h46Var.F;
                if (systemForegroundService != null) {
                    systemForegroundService.y = true;
                    xk3.d().a(str, "Shutting down.");
                    systemForegroundService.stopForeground(true);
                    systemForegroundService.stopSelf(i2);
                    return 3;
                }
                return 3;
            }
            return 3;
        }
        return 3;
    }

    @Override // android.app.Service
    public final void onTimeout(int i) {
        if (Build.VERSION.SDK_INT >= 35) {
            return;
        }
        this.z.f(i, 2048);
    }

    public final void onTimeout(int i, int i2) {
        this.z.f(i, i2);
    }
}
