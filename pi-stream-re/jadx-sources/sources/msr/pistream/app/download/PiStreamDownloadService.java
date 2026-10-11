package msr.pistream.app.download;

import a3.g;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.IBinder;
import android.util.Log;
import java.util.Iterator;
import msr.pistream.app.R;
import msr.pistream.app.ui.home.screens.MainActivity;
import w.s;
import x.j;
import z7.b;
import z7.d;
import z7.f;

/* loaded from: classes.dex */
public class PiStreamDownloadService extends Service {
    public static final String ACTION_CANCEL = "msr.pistream.app.download.CANCEL";
    public static final String ACTION_KICK = "msr.pistream.app.download.KICK";
    public static final String ACTION_PAUSE = "msr.pistream.app.download.PAUSE";
    public static final String ACTION_RESUME = "msr.pistream.app.download.RESUME";
    private static final String CH = "pistream_downloads";
    public static final String EXTRA_ID = "id";
    private static final int FG_ID = 4401;

    public static void action(Context context, String str, String str2) {
        try {
            j.startForegroundService(context.getApplicationContext(), new Intent(context.getApplicationContext(), (Class<?>) PiStreamDownloadService.class).setAction(str).putExtra(EXTRA_ID, str2));
        } catch (Exception e10) {
            Log.e("DLService", "action", e10);
        }
    }

    private Notification buildIdleNotification() {
        s sVar = new s(this, CH);
        sVar.f10729e = s.c("PiStream Downloads");
        sVar.f10730f = s.c("Ready");
        sVar.f10741r.icon = R.drawable.ic_download_fill;
        sVar.d(2, false);
        return sVar.a();
    }

    private Notification buildSummary() {
        String str;
        boolean z9;
        Iterator it = d.a(this).iterator();
        String str2 = "Downloads";
        int i10 = 0;
        int i11 = 0;
        while (it.hasNext()) {
            b bVar = (b) it.next();
            int i12 = bVar.f12101u;
            if (i12 == 2 || i12 == 1) {
                i10++;
                i11 = Math.max(i11, bVar.f12098r);
                if ("subs".equals(bVar.f12105y)) {
                    str2 = bVar.f12083b + " • " + bVar.f12084c + " — subs " + bVar.f12106z + "/" + Math.max(1, bVar.A) + "…";
                } else if ("copy".equals(bVar.f12105y)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(bVar.f12083b);
                    sb.append(" • ");
                    str2 = g.t(sb, bVar.f12084c, " — saving…");
                } else {
                    str2 = bVar.f12083b + " • " + bVar.f12084c + " " + bVar.f12098r + "%";
                }
            }
        }
        Intent action = new Intent(this, (Class<?>) MainActivity.class).setAction("pistream.show_downloads");
        action.addFlags(603979776);
        PendingIntent activity = PendingIntent.getActivity(this, 99, action, 201326592);
        s sVar = new s(this, CH);
        if (i10 > 0) {
            str = g.o("Downloading (", i10, ")");
        } else {
            str = "PiStream Downloads";
        }
        sVar.f10729e = s.c(str);
        sVar.f10730f = s.c(str2);
        sVar.f10741r.icon = R.drawable.ic_download_fill;
        sVar.f10731g = activity;
        if (i10 > 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        sVar.d(2, z9);
        sVar.d(8, true);
        if (i10 > 0) {
            sVar.f10735k = 100;
            sVar.f10736l = i11;
            sVar.f10737m = false;
        }
        return sVar.a();
    }

    private void ensureChannel() {
        NotificationManager notificationManager;
        try {
            if (Build.VERSION.SDK_INT >= 26 && (notificationManager = (NotificationManager) getSystemService(NotificationManager.class)) != null && z7.g.b(notificationManager) == null) {
                z7.g.c();
                notificationManager.createNotificationChannel(z7.g.a());
            }
        } catch (Exception unused) {
        }
    }

    private boolean isIdle() {
        try {
            Iterator it = d.a(this).iterator();
            while (it.hasNext()) {
                int i10 = ((b) it.next()).f12101u;
                if (i10 == 1 || i10 == 2) {
                    return false;
                }
            }
            return true;
        } catch (Exception unused) {
            return true;
        }
    }

    public static void refresh(Context context) {
        startAction(context.getApplicationContext(), ACTION_KICK);
    }

    public static void startAction(Context context, String str) {
        try {
            j.startForegroundService(context.getApplicationContext(), new Intent(context.getApplicationContext(), (Class<?>) PiStreamDownloadService.class).setAction(str));
        } catch (Exception e10) {
            Log.e("DLService", "start", e10);
        }
    }

    private void updateForeground() {
        try {
            if (isIdle()) {
                try {
                    stopForeground(true);
                } catch (Exception unused) {
                }
            } else {
                Notification buildSummary = buildSummary();
                if (Build.VERSION.SDK_INT >= 29) {
                    startForeground(4401, buildSummary, 1);
                } else {
                    startForeground(FG_ID, buildSummary);
                }
            }
        } catch (Exception e10) {
            Log.e("DLService", "fg", e10);
        }
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        ensureChannel();
        try {
            if (Build.VERSION.SDK_INT >= 29) {
                startForeground(4401, buildIdleNotification(), 1);
            } else {
                startForeground(FG_ID, buildIdleNotification());
            }
        } catch (Exception e10) {
            Log.e("DLService", "fg-create", e10);
        }
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i10, int i11) {
        String action;
        String str;
        try {
            if (Build.VERSION.SDK_INT >= 29) {
                startForeground(4401, buildIdleNotification(), 1);
            } else {
                startForeground(FG_ID, buildIdleNotification());
            }
        } catch (Exception e10) {
            Log.e("DLService", "fg-cmd", e10);
        }
        if (intent != null) {
            try {
                action = intent.getAction();
            } catch (Exception e11) {
                Log.e("DLService", "cmd", e11);
            }
        } else {
            action = ACTION_KICK;
        }
        if (intent != null) {
            str = intent.getStringExtra(EXTRA_ID);
        } else {
            str = null;
        }
        if (ACTION_PAUSE.equals(action) && str != null) {
            f.o().t(this, str);
        } else if (ACTION_RESUME.equals(action) && str != null) {
            f.o().z(this, str);
        } else if (ACTION_CANCEL.equals(action) && str != null) {
            f.o().d(this, str);
        } else {
            f.o().x(this);
        }
        updateForeground();
        if (!isIdle()) {
            return 1;
        }
        try {
            stopForeground(true);
        } catch (Exception unused) {
        }
        stopSelf();
        return 2;
    }
}
