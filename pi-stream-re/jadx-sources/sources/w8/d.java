package w8;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import android.util.Log;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.Thread;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* loaded from: classes.dex */
public final class d implements Thread.UncaughtExceptionHandler {

    /* renamed from: d, reason: collision with root package name */
    public static String f11048d = "";

    /* renamed from: e, reason: collision with root package name */
    public static String f11049e = "";

    /* renamed from: f, reason: collision with root package name */
    public static int f11050f = 0;

    /* renamed from: g, reason: collision with root package name */
    public static String f11051g = "";

    /* renamed from: a, reason: collision with root package name */
    public final Context f11052a;

    /* renamed from: c, reason: collision with root package name */
    public final ExecutorService f11054c = Executors.newSingleThreadExecutor();

    /* renamed from: b, reason: collision with root package name */
    public final Thread.UncaughtExceptionHandler f11053b = Thread.getDefaultUncaughtExceptionHandler();

    public d(Context context) {
        this.f11052a = context.getApplicationContext();
    }

    public static void b(Exception exc) {
        Log.e("PlayerActivity", "exception", exc);
    }

    public static File c(Context context) {
        Context applicationContext = context.getApplicationContext();
        File externalFilesDir = applicationContext.getExternalFilesDir(null);
        if (externalFilesDir != null) {
            return new File(externalFilesDir, "crash_logs");
        }
        return new File(applicationContext.getFilesDir(), "crash_logs");
    }

    public static File[] d(Context context) {
        File c6 = c(context);
        if (!c6.exists()) {
            return new File[0];
        }
        File[] listFiles = c6.listFiles(new b(2));
        if (listFiles != null && listFiles.length != 0) {
            Arrays.sort(listFiles, new d0.b(26));
            return listFiles;
        }
        return new File[0];
    }

    public final String a(Thread thread, Throwable th) {
        Context context = this.f11052a;
        StringBuilder sb = new StringBuilder("========================================\n           PI STREAM CRASH REPORT           \n========================================\n\n--- APP INFO ---\n");
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
            sb.append("Version    : ");
            sb.append(packageInfo.versionName);
            sb.append(" (");
            sb.append(packageInfo.versionCode);
            sb.append(")\n");
        } catch (PackageManager.NameNotFoundException unused) {
            sb.append("Version    : unknown\n");
        }
        sb.append("Package    : ");
        sb.append(context.getPackageName());
        sb.append("\n\n--- DEVICE INFO ---\nAndroid    : ");
        sb.append(Build.VERSION.RELEASE);
        sb.append(" (API ");
        sb.append(Build.VERSION.SDK_INT);
        sb.append(")\nDevice     : ");
        sb.append(Build.MANUFACTURER);
        sb.append(" ");
        sb.append(Build.MODEL);
        sb.append("\nBoard      : ");
        sb.append(Build.BOARD);
        sb.append("\nBrand      : ");
        sb.append(Build.BRAND);
        sb.append("\n\n--- TIME & LOCALE ---\nTimestamp  : ");
        sb.append(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss Z", Locale.US).format(new Date()));
        sb.append("\nLocale     : ");
        sb.append(Locale.getDefault());
        sb.append("\n\n--- MEMORY ---\nMax        : ");
        Runtime runtime = Runtime.getRuntime();
        sb.append(runtime.maxMemory() / 1048576);
        sb.append(" MB\nTotal      : ");
        sb.append(runtime.totalMemory() / 1048576);
        sb.append(" MB\nFree       : ");
        sb.append(runtime.freeMemory() / 1048576);
        sb.append(" MB\n");
        try {
            StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
            sb.append("Disk Free  : ");
            sb.append((statFs.getAvailableBlocks() * statFs.getBlockSize()) / 1048576);
            sb.append(" MB\n");
        } catch (Exception unused2) {
        }
        sb.append("\n--- THREAD ---\nName       : ");
        sb.append(thread.getName());
        sb.append("\nPriority   : ");
        sb.append(thread.getPriority());
        sb.append("\nDaemon     : ");
        sb.append(thread.isDaemon());
        sb.append("\n\n--- SCREEN ---\nCurrent    : ");
        sb.append(f11048d);
        sb.append("\nLast action: ");
        sb.append(f11049e);
        sb.append("\n\n--- APP STATE ---\nSources    : ");
        sb.append(f11050f);
        sb.append("\nPlayer     : ");
        sb.append(f11051g);
        sb.append("\n--- EXCEPTION ---\n");
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        th.printStackTrace(printWriter);
        printWriter.flush();
        sb.append(stringWriter);
        sb.append("\n");
        Throwable cause = th.getCause();
        for (int i10 = 0; cause != null && i10 < 5; i10++) {
            sb.append("Caused by  : ");
            sb.append(cause.getClass().getName());
            sb.append(": ");
            sb.append(cause.getMessage());
            sb.append("\n");
            cause = cause.getCause();
        }
        sb.append("\n========================================\n  End of report — ");
        sb.append(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.US).format(new Date()));
        sb.append("\n========================================\n");
        return sb.toString();
    }

    public final void e(Thread thread, Throwable th) {
        Comparator comparingLong;
        Context context = this.f11052a;
        File c6 = c(context);
        if (!c6.exists()) {
            c6.mkdirs();
        }
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(new File(c6, r.f.e("crash_", new SimpleDateFormat("yyyy-MM-dd_HH-mm-ss", Locale.US).format(new Date()), ".txt"))));
            try {
                bufferedWriter.write(a(thread, th));
                bufferedWriter.flush();
                bufferedWriter.close();
            } finally {
            }
        } catch (Exception unused) {
        }
        context.getSharedPreferences("crash_logger", 0).edit().putBoolean("has_new_crash", true).apply();
        File[] listFiles = c6.listFiles(new b(0));
        if (listFiles != null) {
            long currentTimeMillis = System.currentTimeMillis();
            for (File file : listFiles) {
                if (currentTimeMillis - file.lastModified() > 604800000) {
                    file.delete();
                }
            }
            File[] listFiles2 = c6.listFiles(new b(1));
            if (listFiles2 != null && listFiles2.length > 20) {
                comparingLong = Comparator.comparingLong(new c());
                Arrays.sort(listFiles2, comparingLong);
                for (int i10 = 0; i10 < listFiles2.length - 20; i10++) {
                    listFiles2[i10].delete();
                }
            }
        }
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th) {
        try {
            e(thread, th);
        } catch (Exception unused) {
        }
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.f11053b;
        if (uncaughtExceptionHandler != null) {
            uncaughtExceptionHandler.uncaughtException(thread, th);
        }
    }
}
