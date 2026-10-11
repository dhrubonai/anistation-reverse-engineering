package defpackage;

import android.R;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.DialogFragment;
import android.app.FragmentManager;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.util.Log;
import android.util.TypedValue;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class qh2 extends rh2 {
    public static final Object c = new Object();
    public static final qh2 d = new Object();

    public static AlertDialog d(Activity activity, int i, jb7 jb7Var, DialogInterface.OnCancelListener onCancelListener) {
        String string;
        AlertDialog.Builder builder = null;
        if (i == 0) {
            return null;
        }
        TypedValue typedValue = new TypedValue();
        activity.getTheme().resolveAttribute(R.attr.alertDialogTheme, typedValue, true);
        if ("Theme.Dialog.Alert".equals(activity.getResources().getResourceEntryName(typedValue.resourceId))) {
            builder = new AlertDialog.Builder(activity, 5);
        }
        if (builder == null) {
            builder = new AlertDialog.Builder(activity);
        }
        builder.setMessage(cb7.b(activity, i));
        if (onCancelListener != null) {
            builder.setOnCancelListener(onCancelListener);
        }
        Resources resources = activity.getResources();
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    string = resources.getString(R.string.ok);
                } else {
                    string = resources.getString(com.anistation.android.R.string.common_google_play_services_enable_button);
                }
            } else {
                string = resources.getString(com.anistation.android.R.string.common_google_play_services_update_button);
            }
        } else {
            string = resources.getString(com.anistation.android.R.string.common_google_play_services_install_button);
        }
        if (string != null) {
            builder.setPositiveButton(string, jb7Var);
        }
        String a = cb7.a(activity, i);
        if (a != null) {
            builder.setTitle(a);
        }
        Log.w("GoogleApiAvailability", qx1.h(i, "Creating dialog for Google Play services availability issue. ConnectionResult="), new IllegalArgumentException());
        return builder.create();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [hw1, android.app.DialogFragment] */
    public static void g(Activity activity, AlertDialog alertDialog, String str, DialogInterface.OnCancelListener onCancelListener) {
        FragmentManager fragmentManager = activity.getFragmentManager();
        ?? dialogFragment = new DialogFragment();
        a34.y(alertDialog, "Cannot display null dialog");
        alertDialog.setOnCancelListener(null);
        alertDialog.setOnDismissListener(null);
        dialogFragment.x = alertDialog;
        if (onCancelListener != null) {
            dialogFragment.y = onCancelListener;
        }
        dialogFragment.show(fragmentManager, str);
    }

    @Override // defpackage.rh2
    public final Intent a(int i, Context context, String str) {
        return super.a(i, context, str);
    }

    public final void c(GoogleApiActivity googleApiActivity, int i, GoogleApiActivity googleApiActivity2) {
        AlertDialog d2 = d(googleApiActivity, i, new jb7(super.a(i, googleApiActivity, "d"), googleApiActivity, (byte) 0), googleApiActivity2);
        if (d2 == null) {
            return;
        }
        g(googleApiActivity, d2, "GooglePlayServicesErrorDialog", googleApiActivity2);
    }

    public final void e(Activity activity, ic7 ic7Var, int i, DialogInterface.OnCancelListener onCancelListener) {
        AlertDialog d2 = d(activity, i, new jb7(super.a(i, activity, "d"), ic7Var, (byte) 1), onCancelListener);
        if (d2 == null) {
            return;
        }
        g(activity, d2, "GooglePlayServicesErrorDialog", onCancelListener);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v7, types: [fb4, java.lang.Object, qt0] */
    public final void f(Context context, int i, PendingIntent pendingIntent) {
        String a;
        String d2;
        int i2;
        Log.w("GoogleApiAvailability", qx1.i(i, "GMS core API Availability. ConnectionResult=", ", tag=null"), new IllegalArgumentException());
        if (i == 18) {
            new lb7(this, context).sendEmptyMessageDelayed(1, UnityAdsConstants.Timeout.INIT_TIMEOUT_MS);
            return;
        }
        if (pendingIntent == null) {
            if (i == 6) {
                Log.w("GoogleApiAvailability", "Missing resolution for ConnectionResult.RESOLUTION_REQUIRED. Call GoogleApiAvailability#showErrorNotification(Context, ConnectionResult) instead.");
                return;
            }
            return;
        }
        if (i == 6) {
            a = cb7.e(context, "common_google_play_services_resolution_required_title");
        } else {
            a = cb7.a(context, i);
        }
        if (a == null) {
            a = context.getResources().getString(com.anistation.android.R.string.common_google_play_services_notification_ticker);
        }
        if (i != 6 && i != 19) {
            d2 = cb7.b(context, i);
        } else {
            d2 = cb7.d(context, "common_google_play_services_resolution_required_text", cb7.c(context));
        }
        Resources resources = context.getResources();
        Object systemService = context.getSystemService("notification");
        a34.x(systemService);
        NotificationManager notificationManager = (NotificationManager) systemService;
        gb4 gb4Var = new gb4(context, null);
        gb4Var.o = true;
        gb4Var.d(16, true);
        gb4Var.e = gb4.c(a);
        ?? obj = new Object();
        obj.y = gb4.c(d2);
        gb4Var.e(obj);
        PackageManager packageManager = context.getPackageManager();
        Boolean bool = h98.t;
        if (bool == null) {
            bool = Boolean.valueOf(packageManager.hasSystemFeature("android.hardware.type.watch"));
            h98.t = bool;
        }
        boolean booleanValue = bool.booleanValue();
        int i3 = R.drawable.stat_sys_warning;
        if (booleanValue) {
            int i4 = context.getApplicationInfo().icon;
            if (i4 != 0) {
                i3 = i4;
            }
            gb4Var.u.icon = i3;
            gb4Var.i = 2;
            if (h98.E(context)) {
                gb4Var.a(com.anistation.android.R.drawable.common_full_open_on_phone, pendingIntent, resources.getString(com.anistation.android.R.string.common_open_on_phone));
            } else {
                gb4Var.g = pendingIntent;
            }
        } else {
            gb4Var.u.icon = R.drawable.stat_sys_warning;
            String string = resources.getString(com.anistation.android.R.string.common_google_play_services_notification_ticker);
            gb4Var.u.tickerText = gb4.c(string);
            gb4Var.u.when = System.currentTimeMillis();
            gb4Var.g = pendingIntent;
            gb4Var.f = gb4.c(d2);
        }
        synchronized (c) {
        }
        NotificationChannel notificationChannel = notificationManager.getNotificationChannel("com.google.android.gms.availability");
        String string2 = context.getResources().getString(com.anistation.android.R.string.common_google_play_services_notification_channel_name);
        if (notificationChannel == null) {
            notificationManager.createNotificationChannel(new NotificationChannel("com.google.android.gms.availability", string2, 4));
        } else if (!string2.contentEquals(notificationChannel.getName())) {
            notificationChannel.setName(string2);
            notificationManager.createNotificationChannel(notificationChannel);
        }
        gb4Var.s = "com.google.android.gms.availability";
        Notification b = gb4Var.b();
        if (i != 1 && i != 2 && i != 3) {
            i2 = 39789;
        } else {
            xh2.a.set(false);
            i2 = 10436;
        }
        notificationManager.notify(i2, b);
    }
}
