package defpackage;

import android.app.ActivityManager;
import android.app.AlarmManager;
import android.app.ApplicationExitInfo;
import android.app.PendingIntent;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.database.sqlite.SQLiteAccessPermException;
import android.database.sqlite.SQLiteCantOpenDatabaseException;
import android.database.sqlite.SQLiteConstraintException;
import android.database.sqlite.SQLiteDatabaseCorruptException;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteDiskIOException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteFullException;
import android.database.sqlite.SQLiteTableLockedException;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.utils.ForceStopRunnable$BroadcastReceiver;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class y92 implements Runnable {
    public static final String B = xk3.f("ForceStopRunnable");
    public static final long C = 315360000000L;
    public int A = 0;
    public final Context x;
    public final l77 y;
    public final ju2 z;

    public y92(Context context, l77 l77Var) {
        this.x = context.getApplicationContext();
        this.y = l77Var;
        this.z = l77Var.g;
    }

    public static void c(Context context) {
        int i;
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        if (Build.VERSION.SDK_INT >= 31) {
            i = 167772160;
        } else {
            i = 134217728;
        }
        Intent intent = new Intent();
        intent.setComponent(new ComponentName(context, (Class<?>) ForceStopRunnable$BroadcastReceiver.class));
        intent.setAction("ACTION_FORCE_STOP_RESCHEDULE");
        PendingIntent broadcast = PendingIntent.getBroadcast(context, -1, intent, i);
        long currentTimeMillis = System.currentTimeMillis() + C;
        if (alarmManager != null) {
            alarmManager.setExact(0, currentTimeMillis, broadcast);
        }
    }

    /* JADX WARN: Finally extract failed */
    public final void a() {
        int i;
        boolean z;
        boolean z2;
        boolean z3;
        int i2;
        int i3;
        PendingIntent broadcast;
        List historicalProcessExitReasons;
        int reason;
        long timestamp;
        ju2 ju2Var = this.z;
        l77 l77Var = this.y;
        pv0 pv0Var = l77Var.b;
        ju2 ju2Var2 = l77Var.g;
        WorkDatabase workDatabase = l77Var.c;
        String str = q46.B;
        Context context = this.x;
        JobScheduler a = l43.a(context);
        ArrayList b = q46.b(context, a);
        List workSpecIds = workDatabase.systemIdInfoDao().getWorkSpecIds();
        if (b != null) {
            i = b.size();
        } else {
            i = 0;
        }
        HashSet hashSet = new HashSet(i);
        if (b != null && !b.isEmpty()) {
            int size = b.size();
            int i4 = 0;
            while (i4 < size) {
                Object obj = b.get(i4);
                i4++;
                JobInfo jobInfo = (JobInfo) obj;
                i77 f = q46.f(jobInfo);
                if (f != null) {
                    hashSet.add(f.a);
                } else {
                    q46.a(a, jobInfo.getId());
                }
            }
        }
        Iterator it = workSpecIds.iterator();
        while (true) {
            if (it.hasNext()) {
                if (!hashSet.contains((String) it.next())) {
                    xk3.d().a(q46.B, "Reconciling jobs");
                    z = true;
                    break;
                }
            } else {
                z = false;
                break;
            }
        }
        if (z) {
            workDatabase.beginTransaction();
            try {
                a87 workSpecDao = workDatabase.workSpecDao();
                Iterator it2 = workSpecIds.iterator();
                while (it2.hasNext()) {
                    workSpecDao.markWorkSpecScheduled((String) it2.next(), -1L);
                }
                workDatabase.setTransactionSuccessful();
                workDatabase.endTransaction();
            } catch (Throwable th) {
                throw th;
            }
        }
        a87 workSpecDao2 = workDatabase.workSpecDao();
        t77 workProgressDao = workDatabase.workProgressDao();
        workDatabase.beginTransaction();
        try {
            List<z77> runningWork = workSpecDao2.getRunningWork();
            if (runningWork != null && !runningWork.isEmpty()) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                for (z77 z77Var : runningWork) {
                    j77 j77Var = j77.x;
                    String str2 = z77Var.a;
                    workSpecDao2.setState(j77Var, str2);
                    workSpecDao2.setStopReason(str2, -512);
                    workSpecDao2.markWorkSpecScheduled(str2, -1L);
                }
            }
            workProgressDao.deleteAll();
            workDatabase.setTransactionSuccessful();
            workDatabase.endTransaction();
            if (!z2 && !z) {
                z3 = false;
            } else {
                z3 = true;
            }
            Long longValue = ju2Var2.a.preferenceDao().getLongValue("reschedule_needed");
            long j = 0;
            String str3 = B;
            if (longValue != null && longValue.longValue() == 1) {
                xk3.d().a(str3, "Rescheduling Workers.");
                l77Var.d();
                ju2Var2.getClass();
                ju2Var2.a.preferenceDao().insertPreference(new ns4("reschedule_needed", 0L));
                return;
            }
            try {
                i2 = Build.VERSION.SDK_INT;
                if (i2 >= 31) {
                    i3 = 570425344;
                } else {
                    i3 = 536870912;
                }
                Intent intent = new Intent();
                intent.setComponent(new ComponentName(context, (Class<?>) ForceStopRunnable$BroadcastReceiver.class));
                intent.setAction("ACTION_FORCE_STOP_RESCHEDULE");
                broadcast = PendingIntent.getBroadcast(context, -1, intent, i3);
            } catch (IllegalArgumentException | SecurityException e) {
                xk3.d().h(str3, "Ignoring exception", e);
            }
            if (i2 >= 30) {
                if (broadcast != null) {
                    broadcast.cancel();
                }
                historicalProcessExitReasons = ((ActivityManager) context.getSystemService("activity")).getHistoricalProcessExitReasons(null, 0, 0);
                if (historicalProcessExitReasons != null && !historicalProcessExitReasons.isEmpty()) {
                    Long longValue2 = ju2Var.a.preferenceDao().getLongValue("last_force_stop_ms");
                    if (longValue2 != null) {
                        j = longValue2.longValue();
                    }
                    for (int i5 = 0; i5 < historicalProcessExitReasons.size(); i5++) {
                        ApplicationExitInfo e2 = y3.e(historicalProcessExitReasons.get(i5));
                        reason = e2.getReason();
                        if (reason == 10) {
                            timestamp = e2.getTimestamp();
                            if (timestamp >= j) {
                                xk3.d().a(str3, "Application was force-stopped, rescheduling.");
                                l77Var.d();
                                xb5 xb5Var = pv0Var.d;
                                long currentTimeMillis = System.currentTimeMillis();
                                ju2Var.getClass();
                                ju2Var.a.preferenceDao().insertPreference(new ns4("last_force_stop_ms", Long.valueOf(currentTimeMillis)));
                                return;
                            }
                        }
                    }
                }
            } else if (broadcast == null) {
                c(context);
                xk3.d().a(str3, "Application was force-stopped, rescheduling.");
                l77Var.d();
                xb5 xb5Var2 = pv0Var.d;
                long currentTimeMillis2 = System.currentTimeMillis();
                ju2Var.getClass();
                ju2Var.a.preferenceDao().insertPreference(new ns4("last_force_stop_ms", Long.valueOf(currentTimeMillis2)));
                return;
            }
            if (z3) {
                xk3.d().a(str3, "Found unfinished work, scheduling it.");
                wb5.b(pv0Var, workDatabase, l77Var.e);
            }
        } finally {
            workDatabase.endTransaction();
        }
    }

    public final boolean b() {
        pv0 pv0Var = this.y.b;
        pv0Var.getClass();
        boolean isEmpty = TextUtils.isEmpty(null);
        String str = B;
        if (isEmpty) {
            xk3.d().a(str, "The default process name was not specified.");
            return true;
        }
        boolean a = ou4.a(this.x, pv0Var);
        xk3.d().a(str, "Is default app process = " + a);
        return a;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Context context = this.x;
        l77 l77Var = this.y;
        pv0 pv0Var = l77Var.b;
        try {
            if (!b()) {
                return;
            }
            boolean o = lt5.o(context);
            String str = B;
            if (!o) {
                xk3.d().b(str, "WorkManager can't be accessed from direct boot, because credential encrypted storage isn't accessible.\nDon't access or initialize WorkManager from directBootAware components. See https://developer.android.com/training/articles/direct-boot");
                IllegalStateException illegalStateException = new IllegalStateException("WorkManager can't be accessed from direct boot, because credential encrypted storage isn't accessible.\nDon't access or initialize WorkManager from directBootAware components. See https://developer.android.com/training/articles/direct-boot");
                pv0Var.getClass();
                throw illegalStateException;
            }
            while (true) {
                try {
                    uv5.b(context);
                    xk3.d().a(str, "Performing cleanup operations.");
                    try {
                        a();
                        return;
                    } catch (SQLiteException e) {
                        this.A++;
                        if (this.A >= 3) {
                            if (!(e instanceof SQLiteAccessPermException) && !(e instanceof SQLiteCantOpenDatabaseException) && !(e instanceof SQLiteConstraintException) && !(e instanceof SQLiteDatabaseCorruptException) && !(e instanceof SQLiteDatabaseLockedException) && !(e instanceof SQLiteDiskIOException) && !(e instanceof SQLiteFullException) && !(e instanceof SQLiteTableLockedException)) {
                                throw e;
                            }
                            xk3.d().c(str, "The file system on the device is in a bad state. WorkManager cannot access the app's internal data store.", e);
                            IllegalStateException illegalStateException2 = new IllegalStateException("The file system on the device is in a bad state. WorkManager cannot access the app's internal data store.", e);
                            pv0Var.getClass();
                            throw illegalStateException2;
                        }
                        String str2 = "Retrying after " + (this.A * 300);
                        if (xk3.d().a <= 3) {
                            Log.d(str, str2, e);
                        }
                        try {
                            Thread.sleep(this.A * 300);
                        } catch (InterruptedException unused) {
                        }
                    }
                } catch (SQLiteException e2) {
                    xk3.d().b(str, "Unexpected SQLite exception during migrations");
                    IllegalStateException illegalStateException3 = new IllegalStateException("Unexpected SQLite exception during migrations", e2);
                    pv0Var.getClass();
                    throw illegalStateException3;
                }
            }
        } finally {
            l77Var.c();
        }
    }
}
