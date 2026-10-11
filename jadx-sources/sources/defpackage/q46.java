package defpackage;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.net.NetworkRequest;
import android.os.Build;
import android.os.PersistableBundle;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemjob.SystemJobService;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Set;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class q46 implements tb5 {
    public static final String B = xk3.f("SystemJobScheduler");
    public final WorkDatabase A;
    public final Context x;
    public final JobScheduler y;
    public final p46 z;

    public q46(Context context, WorkDatabase workDatabase, pv0 pv0Var) {
        JobScheduler a = l43.a(context);
        p46 p46Var = new p46(context, pv0Var.d);
        this.x = context;
        this.y = a;
        this.z = p46Var;
        this.A = workDatabase;
    }

    public static void a(JobScheduler jobScheduler, int i) {
        try {
            jobScheduler.cancel(i);
        } catch (Throwable th) {
            xk3.d().c(B, String.format(Locale.getDefault(), "Exception while trying to cancel job (%d)", Integer.valueOf(i)), th);
        }
    }

    public static ArrayList b(Context context, JobScheduler jobScheduler) {
        List<JobInfo> list;
        String str = l43.a;
        jobScheduler.getClass();
        try {
            list = jobScheduler.getAllPendingJobs();
            list.getClass();
        } catch (Throwable th) {
            xk3.d().c(l43.a, "getAllPendingJobs() is not reliable on this device.", th);
            list = null;
        }
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        ComponentName componentName = new ComponentName(context, (Class<?>) SystemJobService.class);
        for (JobInfo jobInfo : list) {
            if (componentName.equals(jobInfo.getService())) {
                arrayList.add(jobInfo);
            }
        }
        return arrayList;
    }

    public static i77 f(JobInfo jobInfo) {
        PersistableBundle extras = jobInfo.getExtras();
        if (extras != null) {
            try {
                if (extras.containsKey("EXTRA_WORK_SPEC_ID")) {
                    return new i77(extras.getString("EXTRA_WORK_SPEC_ID"), extras.getInt("EXTRA_WORK_SPEC_GENERATION", 0));
                }
                return null;
            } catch (NullPointerException unused) {
                return null;
            }
        }
        return null;
    }

    @Override // defpackage.tb5
    public final boolean c() {
        return true;
    }

    @Override // defpackage.tb5
    public final void d(String str) {
        ArrayList arrayList;
        Context context = this.x;
        JobScheduler jobScheduler = this.y;
        ArrayList b = b(context, jobScheduler);
        int i = 0;
        if (b == null) {
            arrayList = null;
        } else {
            ArrayList arrayList2 = new ArrayList(2);
            int size = b.size();
            int i2 = 0;
            while (i2 < size) {
                Object obj = b.get(i2);
                i2++;
                JobInfo jobInfo = (JobInfo) obj;
                i77 f = f(jobInfo);
                if (f != null && str.equals(f.a)) {
                    arrayList2.add(Integer.valueOf(jobInfo.getId()));
                }
            }
            arrayList = arrayList2;
        }
        if (arrayList != null && !arrayList.isEmpty()) {
            int size2 = arrayList.size();
            while (i < size2) {
                Object obj2 = arrayList.get(i);
                i++;
                int intValue = ((Integer) obj2).intValue();
                xk3.d().a(B, "Cancelling work ID " + str + ", Job ID " + intValue);
                a(jobScheduler, intValue);
            }
            this.A.systemIdInfoDao().removeSystemIdInfo(str);
        }
    }

    @Override // defpackage.tb5
    public final void e(z77... z77VarArr) {
        int intValue;
        WorkDatabase workDatabase = this.A;
        ju2 ju2Var = new ju2(workDatabase);
        for (z77 z77Var : z77VarArr) {
            workDatabase.beginTransaction();
            try {
                a87 workSpecDao = workDatabase.workSpecDao();
                String str = z77Var.a;
                z77 workSpec = workSpecDao.getWorkSpec(str);
                String str2 = B;
                if (workSpec == null) {
                    xk3.d().g(str2, "Skipping scheduling " + str + " because it's no longer in the DB");
                    workDatabase.setTransactionSuccessful();
                } else if (workSpec.b != j77.x) {
                    xk3.d().g(str2, "Skipping scheduling " + str + " because it is no longer enqueued");
                    workDatabase.setTransactionSuccessful();
                } else {
                    i77 d = fy5.d(z77Var);
                    l46 systemIdInfo = workDatabase.systemIdInfoDao().getSystemIdInfo(d);
                    if (systemIdInfo != null) {
                        intValue = systemIdInfo.c;
                    } else {
                        Object runInTransaction = ju2Var.a.runInTransaction(new iu2(ju2Var, (byte) 0));
                        runInTransaction.getClass();
                        intValue = ((Number) runInTransaction).intValue();
                    }
                    if (systemIdInfo == null) {
                        workDatabase.systemIdInfoDao().insertSystemIdInfo(new l46(d.a, d.b, intValue));
                    }
                    g(z77Var, intValue);
                    workDatabase.setTransactionSuccessful();
                }
            } finally {
                workDatabase.endTransaction();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void g(z77 z77Var, int i) {
        int i2;
        Object[] objArr;
        int i3;
        List<JobInfo> list;
        int i4;
        String str;
        String str2;
        int i5;
        qx0 qx0Var = z77Var.j;
        PersistableBundle persistableBundle = new PersistableBundle();
        String str3 = z77Var.a;
        persistableBundle.putString("EXTRA_WORK_SPEC_ID", str3);
        persistableBundle.putInt("EXTRA_WORK_SPEC_GENERATION", z77Var.t);
        persistableBundle.putBoolean("EXTRA_IS_PERIODIC", z77Var.c());
        JobInfo.Builder builder = new JobInfo.Builder(i, this.z.a);
        boolean z = qx0Var.c;
        Set<px0> set = qx0Var.i;
        JobInfo.Builder requiresCharging = builder.setRequiresCharging(z);
        boolean z2 = qx0Var.d;
        JobInfo.Builder extras = requiresCharging.setRequiresDeviceIdle(z2).setExtras(persistableBundle);
        NetworkRequest a = qx0Var.a();
        int i6 = 0;
        boolean z3 = true;
        if (a != null) {
            extras.getClass();
            extras.setRequiredNetwork(a);
        } else {
            k94 k94Var = qx0Var.a;
            if (Build.VERSION.SDK_INT >= 30 && k94Var == k94.C) {
                extras.setRequiredNetwork(new NetworkRequest.Builder().addCapability(25).build());
            } else {
                int ordinal = k94Var.ordinal();
                if (ordinal != 0) {
                    if (ordinal != 1) {
                        i2 = 2;
                        if (ordinal != 2) {
                            i2 = 3;
                            if (ordinal != 3) {
                                i2 = 4;
                                if (ordinal != 4) {
                                    xk3.d().a(p46.b, "API version too low. Cannot convert network type value " + k94Var);
                                }
                            }
                        }
                    }
                    i2 = 1;
                } else {
                    i2 = 0;
                }
                extras.setRequiredNetworkType(i2);
            }
        }
        if (!z2) {
            if (z77Var.l == c00.y) {
                i5 = 0;
            } else {
                i5 = 1;
            }
            extras.setBackoffCriteria(z77Var.m, i5);
        }
        long max = Math.max(z77Var.a() - System.currentTimeMillis(), 0L);
        if (max > 0) {
            extras.setMinimumLatency(max);
        } else if (!z77Var.q) {
            extras.setImportantWhileForeground(true);
        }
        if (!set.isEmpty()) {
            for (px0 px0Var : set) {
                extras.addTriggerContentUri(new JobInfo.TriggerContentUri(px0Var.a, px0Var.b ? 1 : 0));
            }
            extras.setTriggerContentUpdateDelay(qx0Var.g);
            extras.setTriggerContentMaxDelay(qx0Var.h);
        }
        extras.setPersisted(false);
        extras.setRequiresBatteryNotLow(qx0Var.e);
        extras.setRequiresStorageNotLow(qx0Var.f);
        if (z77Var.k > 0) {
            objArr = true;
        } else {
            objArr = false;
        }
        if (max <= 0) {
            z3 = false;
        }
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 31 && z77Var.q && objArr == false && !z3) {
            extras.setExpedited(true);
        }
        if (i7 >= 35 && (str2 = z77Var.x) != null) {
            extras.setTraceTag(str2);
        }
        JobInfo build = extras.build();
        xk3 d = xk3.d();
        StringBuilder n = h11.n("Scheduling work ID ", str3, " (");
        n.append(z77Var.c);
        n.append("), Job ID ");
        n.append(i);
        String sb = n.toString();
        String str4 = B;
        d.a(str4, sb);
        try {
            if (this.y.schedule(build) == 0) {
                xk3.d().g(str4, "Unable to schedule work ID " + str3);
                if (z77Var.q && z77Var.r == wg4.x) {
                    z77Var.q = false;
                    xk3.d().a(str4, "Scheduling a non-expedited job (work ID " + str3 + ")");
                    g(z77Var, i);
                }
            }
        } catch (IllegalStateException e) {
            String str5 = l43.a;
            int i8 = Build.VERSION.SDK_INT;
            if (i8 >= 31) {
                i3 = 150;
            } else {
                i3 = 100;
            }
            int i9 = i3;
            int size = this.A.workSpecDao().getScheduledWorkWithContentUris().size();
            Context context = this.x;
            String str6 = "<faulty JobScheduler failed to getPendingJobs>";
            if (i8 >= 34) {
                JobScheduler a2 = l43.a(context);
                String str7 = null;
                try {
                    list = a2.getAllPendingJobs();
                    list.getClass();
                } catch (Throwable th) {
                    xk3.d().c(l43.a, "getAllPendingJobs() is not reliable on this device.", th);
                    list = null;
                }
                if (list != null) {
                    ArrayList b = b(context, a2);
                    if (b != null) {
                        i4 = list.size() - b.size();
                    } else {
                        i4 = 0;
                    }
                    if (i4 == 0) {
                        str = null;
                    } else {
                        str = i4 + " of which are not owned by WorkManager";
                    }
                    Object systemService = context.getSystemService("jobscheduler");
                    systemService.getClass();
                    ArrayList b2 = b(context, (JobScheduler) systemService);
                    if (b2 != null) {
                        i6 = b2.size();
                    }
                    if (i6 != 0) {
                        str7 = i6 + " from WorkManager in the default namespace";
                    }
                    str6 = yo0.q0(ms.H0(new String[]{list.size() + " jobs in \"androidx.work.systemjobscheduler\" namespace", str, str7}), ",\n", null, null, null, 62);
                }
            } else {
                ArrayList b3 = b(context, l43.a(context));
                if (b3 != null) {
                    str6 = b3.size() + " jobs from WorkManager";
                }
            }
            StringBuilder sb2 = new StringBuilder("JobScheduler ");
            sb2.append(i9);
            sb2.append(" job limit exceeded.\nIn JobScheduler there are ");
            sb2.append(str6);
            sb2.append(".\nThere are ");
            String k = zo5.k(size, " jobs tracked by WorkManager's database;\nthe Configuration limit is 20.", sb2);
            xk3.d().b(str4, k);
            throw new IllegalStateException(k, e);
        } catch (Throwable th2) {
            xk3.d().c(str4, "Unable to schedule " + z77Var, th2);
        }
    }
}
