package com.anistation.repository.backup;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import com.anistation.android.R;
import defpackage.gb4;
import defpackage.mb4;
import defpackage.t80;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class BackupWorker extends CoroutineWorker {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BackupWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        context.getClass();
        workerParameters.getClass();
    }

    public final void a(String str, String str2, boolean z) {
        PendingIntent pendingIntent;
        NotificationManager notificationManager = (NotificationManager) getApplicationContext().getSystemService(NotificationManager.class);
        if (notificationManager.getNotificationChannel("anistation_backup") == null) {
            NotificationChannel notificationChannel = new NotificationChannel("anistation_backup", getApplicationContext().getString(R.string.backup_notification_channel_name), 2);
            notificationChannel.setDescription(getApplicationContext().getString(R.string.backup_notification_channel_description));
            notificationManager.createNotificationChannel(notificationChannel);
        }
        if (Build.VERSION.SDK_INT < 33 || t80.A(getApplicationContext(), "android.permission.POST_NOTIFICATIONS") == 0) {
            Intent launchIntentForPackage = getApplicationContext().getPackageManager().getLaunchIntentForPackage(getApplicationContext().getPackageName());
            if (launchIntentForPackage != null) {
                pendingIntent = PendingIntent.getActivity(getApplicationContext(), 0, launchIntentForPackage, 201326592);
            } else {
                pendingIntent = null;
            }
            gb4 gb4Var = new gb4(getApplicationContext(), "anistation_backup");
            gb4Var.u.icon = R.drawable.backup;
            gb4Var.e = gb4.c(str);
            gb4Var.f = gb4.c(str2);
            gb4Var.i = -1;
            gb4Var.d(8, true);
            gb4Var.d(2, z);
            gb4Var.d(16, !z);
            gb4Var.g = pendingIntent;
            Notification b = gb4Var.b();
            b.getClass();
            try {
                new mb4(getApplicationContext()).a(b);
            } catch (Throwable unused) {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    @Override // androidx.work.CoroutineWorker
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object doWork(defpackage.vz0 r8) {
        /*
            Method dump skipped, instructions count: 294
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anistation.repository.backup.BackupWorker.doWork(vz0):java.lang.Object");
    }
}
