package x;

import android.app.AppOpsManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ApplicationInfo;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Process;
import android.text.TextUtils;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.Executor;
import w.u;
import y.p;

/* loaded from: classes.dex */
public abstract class j {
    private static final String DYNAMIC_RECEIVER_NOT_EXPORTED_PERMISSION_SUFFIX = ".DYNAMIC_RECEIVER_NOT_EXPORTED_PERMISSION";
    public static final int RECEIVER_EXPORTED = 2;
    public static final int RECEIVER_NOT_EXPORTED = 4;
    public static final int RECEIVER_VISIBLE_TO_INSTANT_APPS = 1;
    private static final String TAG = "ContextCompat";
    private static final Object sLock = new Object();
    private static final Object sSync = new Object();
    private static TypedValue sTempValue;

    public static int checkSelfPermission(Context context, String str) {
        boolean z9;
        if (str != null) {
            if (!com.bumptech.glide.d.G() && TextUtils.equals("android.permission.POST_NOTIFICATIONS", str)) {
                u uVar = new u(context);
                if (Build.VERSION.SDK_INT >= 24) {
                    z9 = uVar.f10744a.areNotificationsEnabled();
                } else {
                    AppOpsManager appOpsManager = (AppOpsManager) context.getSystemService("appops");
                    ApplicationInfo applicationInfo = context.getApplicationInfo();
                    String packageName = context.getApplicationContext().getPackageName();
                    int i10 = applicationInfo.uid;
                    try {
                        Class<?> cls = Class.forName(AppOpsManager.class.getName());
                        Class<?> cls2 = Integer.TYPE;
                        if (((Integer) cls.getMethod("checkOpNoThrow", cls2, cls2, String.class).invoke(appOpsManager, Integer.valueOf(((Integer) cls.getDeclaredField("OP_POST_NOTIFICATION").get(Integer.class)).intValue()), Integer.valueOf(i10), packageName)).intValue() != 0) {
                            z9 = false;
                        }
                    } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException | NoSuchMethodException | RuntimeException | InvocationTargetException unused) {
                    }
                    z9 = true;
                }
                if (z9) {
                    return 0;
                }
                return -1;
            }
            return context.checkPermission(str, Process.myPid(), Process.myUid());
        }
        throw new NullPointerException("permission must be non-null");
    }

    public static Context createDeviceProtectedStorageContext(Context context) {
        if (Build.VERSION.SDK_INT >= 24) {
            return e.a(context);
        }
        return null;
    }

    public static String getAttributionTag(Context context) {
        if (Build.VERSION.SDK_INT >= 30) {
            return h.a(context);
        }
        return null;
    }

    public static File getCodeCacheDir(Context context) {
        return c.a(context);
    }

    public static int getColor(Context context, int i10) {
        return d.a(context, i10);
    }

    public static ColorStateList getColorStateList(Context context, int i10) {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        y.k kVar;
        Resources resources = context.getResources();
        Resources.Theme theme = context.getTheme();
        y.l lVar = new y.l(resources, theme);
        synchronized (p.f11450c) {
            SparseArray sparseArray = (SparseArray) p.f11449b.get(lVar);
            colorStateList = null;
            if (sparseArray != null && sparseArray.size() > 0 && (kVar = (y.k) sparseArray.get(i10)) != null) {
                if (kVar.f11438b.equals(resources.getConfiguration()) && ((theme == null && kVar.f11439c == 0) || (theme != null && kVar.f11439c == theme.hashCode()))) {
                    colorStateList2 = kVar.f11437a;
                } else {
                    sparseArray.remove(i10);
                }
            }
            colorStateList2 = null;
        }
        if (colorStateList2 == null) {
            ThreadLocal threadLocal = p.f11448a;
            TypedValue typedValue = (TypedValue) threadLocal.get();
            if (typedValue == null) {
                typedValue = new TypedValue();
                threadLocal.set(typedValue);
            }
            boolean z9 = true;
            resources.getValue(i10, typedValue, true);
            int i11 = typedValue.type;
            if (i11 < 28 || i11 > 31) {
                z9 = false;
            }
            if (!z9) {
                try {
                    colorStateList = y.b.a(resources, resources.getXml(i10), theme);
                } catch (Exception e10) {
                    Log.w("ResourcesCompat", "Failed to inflate ColorStateList, leaving it to the framework", e10);
                }
            }
            if (colorStateList != null) {
                p.a(lVar, i10, colorStateList, theme);
                return colorStateList;
            }
            return y.j.b(resources, i10, theme);
        }
        return colorStateList2;
    }

    public static File getDataDir(Context context) {
        if (Build.VERSION.SDK_INT >= 24) {
            return e.b(context);
        }
        String str = context.getApplicationInfo().dataDir;
        if (str != null) {
            return new File(str);
        }
        return null;
    }

    public static Drawable getDrawable(Context context, int i10) {
        return c.b(context, i10);
    }

    public static File[] getExternalCacheDirs(Context context) {
        return b.a(context);
    }

    public static File[] getExternalFilesDirs(Context context, String str) {
        return b.b(context, str);
    }

    public static Executor getMainExecutor(Context context) {
        if (Build.VERSION.SDK_INT >= 28) {
            return g.a(context);
        }
        return new c0.f(new Handler(context.getMainLooper()));
    }

    public static File getNoBackupFilesDir(Context context) {
        return c.c(context);
    }

    public static File[] getObbDirs(Context context) {
        return b.c(context);
    }

    public static <T> T getSystemService(Context context, Class<T> cls) {
        return (T) d.b(context, cls);
    }

    public static String getSystemServiceName(Context context, Class<?> cls) {
        return d.c(context, cls);
    }

    public static boolean isDeviceProtectedStorage(Context context) {
        if (Build.VERSION.SDK_INT >= 24) {
            return e.c(context);
        }
        return false;
    }

    public static String obtainAndCheckReceiverPermission(Context context) {
        String str = context.getPackageName() + DYNAMIC_RECEIVER_NOT_EXPORTED_PERMISSION_SUFFIX;
        if (com.bumptech.glide.c.j(context, str) == 0) {
            return str;
        }
        throw new RuntimeException(r.f.e("Permission ", str, " is required by your application to receive broadcasts, please add it to your manifest"));
    }

    public static Intent registerReceiver(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, int i10) {
        return registerReceiver(context, broadcastReceiver, intentFilter, null, null, i10);
    }

    public static boolean startActivities(Context context, Intent[] intentArr) {
        return startActivities(context, intentArr, null);
    }

    public static void startActivity(Context context, Intent intent, Bundle bundle) {
        a.b(context, intent, bundle);
    }

    public static void startForegroundService(Context context, Intent intent) {
        if (Build.VERSION.SDK_INT >= 26) {
            f.b(context, intent);
        } else {
            context.startService(intent);
        }
    }

    public static Intent registerReceiver(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, String str, Handler handler, int i10) {
        int i11 = i10 & 1;
        if (i11 != 0 && (i10 & 4) != 0) {
            throw new IllegalArgumentException("Cannot specify both RECEIVER_VISIBLE_TO_INSTANT_APPS and RECEIVER_NOT_EXPORTED");
        }
        if (i11 != 0) {
            i10 |= 2;
        }
        int i12 = i10;
        int i13 = i12 & 2;
        if (i13 == 0 && (i12 & 4) == 0) {
            throw new IllegalArgumentException("One of either RECEIVER_EXPORTED or RECEIVER_NOT_EXPORTED is required");
        }
        if (i13 != 0 && (i12 & 4) != 0) {
            throw new IllegalArgumentException("Cannot specify both RECEIVER_EXPORTED and RECEIVER_NOT_EXPORTED");
        }
        if (com.bumptech.glide.d.G()) {
            return i.a(context, broadcastReceiver, intentFilter, str, handler, i12);
        }
        if (Build.VERSION.SDK_INT >= 26) {
            return f.a(context, broadcastReceiver, intentFilter, str, handler, i12);
        }
        if ((i12 & 4) != 0 && str == null) {
            return context.registerReceiver(broadcastReceiver, intentFilter, obtainAndCheckReceiverPermission(context), handler);
        }
        return context.registerReceiver(broadcastReceiver, intentFilter, str, handler);
    }

    public static boolean startActivities(Context context, Intent[] intentArr, Bundle bundle) {
        a.a(context, intentArr, bundle);
        return true;
    }
}
