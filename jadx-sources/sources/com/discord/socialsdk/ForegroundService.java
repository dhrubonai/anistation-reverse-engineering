package com.discord.socialsdk;

import android.app.Activity;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;
import defpackage.gb4;
import defpackage.t80;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public class ForegroundService extends Service {
    private static final String CHANNEL_ID = "DiscordSocialSDKChannel";
    private static final int NOTIFICATION_ID = 1;

    private void createNotificationChannel() {
        ((NotificationManager) getSystemService(NotificationManager.class)).createNotificationChannel(new NotificationChannel(CHANNEL_ID, "Discord Social SDK Service", 2));
    }

    public static void start(Activity activity) {
        Log.d("DiscordSocialSdk", "Starting ForegroundService");
        activity.startForegroundService(new Intent(activity, (Class<?>) ForegroundService.class));
    }

    public static void stop(Activity activity) {
        Log.d("DiscordSocialSdk", "Stopping ForegroundService");
        activity.stopService(new Intent(activity, (Class<?>) ForegroundService.class));
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        int i3;
        createNotificationChannel();
        gb4 gb4Var = new gb4(this, CHANNEL_ID);
        gb4Var.e = gb4.c("Discord Social SDK");
        gb4Var.f = gb4.c("Voice connected");
        gb4Var.u.icon = android.R.drawable.ic_dialog_info;
        Notification b = gb4Var.b();
        if (t80.A(this, "android.permission.RECORD_AUDIO") == 0) {
            i3 = 130;
        } else {
            i3 = 2;
        }
        startForeground(1, b, i3);
        return 1;
    }
}
