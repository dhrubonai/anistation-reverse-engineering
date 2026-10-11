package b5;

import android.R;
import android.app.Activity;
import android.app.AlertDialog;
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
import android.os.Build;
import android.util.Log;
import android.util.TypedValue;
import androidx.fragment.app.b0;
import androidx.fragment.app.s0;
import com.google.android.gms.common.api.internal.a0;
import com.google.android.gms.common.internal.w;
import com.google.android.gms.common.internal.x;
import com.google.android.gms.common.internal.y;
import com.google.android.gms.common.internal.z;
import w.q;
import w.r;
import w.s;

/* loaded from: classes.dex */
public final class d extends e {

    /* renamed from: c, reason: collision with root package name */
    public static final Object f1516c = new Object();

    /* renamed from: d, reason: collision with root package name */
    public static final d f1517d = new d();

    public static AlertDialog e(Context context, int i10, z zVar, DialogInterface.OnCancelListener onCancelListener) {
        String string;
        AlertDialog.Builder builder = null;
        if (i10 == 0) {
            return null;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.alertDialogTheme, typedValue, true);
        if ("Theme.Dialog.Alert".equals(context.getResources().getResourceEntryName(typedValue.resourceId))) {
            builder = new AlertDialog.Builder(context, 5);
        }
        if (builder == null) {
            builder = new AlertDialog.Builder(context);
        }
        builder.setMessage(w.b(context, i10));
        if (onCancelListener != null) {
            builder.setOnCancelListener(onCancelListener);
        }
        Resources resources = context.getResources();
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    string = resources.getString(R.string.ok);
                } else {
                    string = resources.getString(msr.pistream.app.R.string.common_google_play_services_enable_button);
                }
            } else {
                string = resources.getString(msr.pistream.app.R.string.common_google_play_services_update_button);
            }
        } else {
            string = resources.getString(msr.pistream.app.R.string.common_google_play_services_install_button);
        }
        if (string != null) {
            builder.setPositiveButton(string, zVar);
        }
        String c6 = w.c(context, i10);
        if (c6 != null) {
            builder.setTitle(c6);
        }
        Log.w("GoogleApiAvailability", String.format("Creating dialog for Google Play services availability issue. ConnectionResult=%s", Integer.valueOf(i10)), new IllegalArgumentException());
        return builder.create();
    }

    public static void f(Activity activity, AlertDialog alertDialog, String str, DialogInterface.OnCancelListener onCancelListener) {
        try {
            if (activity instanceof b0) {
                s0 supportFragmentManager = ((b0) activity).getSupportFragmentManager();
                i iVar = new i();
                if (alertDialog != null) {
                    alertDialog.setOnCancelListener(null);
                    alertDialog.setOnDismissListener(null);
                    iVar.C0 = alertDialog;
                    if (onCancelListener != null) {
                        iVar.D0 = onCancelListener;
                    }
                    iVar.f963z0 = false;
                    iVar.A0 = true;
                    supportFragmentManager.getClass();
                    androidx.fragment.app.a aVar = new androidx.fragment.app.a(supportFragmentManager);
                    aVar.o = true;
                    aVar.g(0, iVar, str, 1);
                    aVar.d(false);
                    return;
                }
                throw new NullPointerException("Cannot display null dialog");
            }
        } catch (NoClassDefFoundError unused) {
        }
        FragmentManager fragmentManager = activity.getFragmentManager();
        b bVar = new b();
        if (alertDialog != null) {
            alertDialog.setOnCancelListener(null);
            alertDialog.setOnDismissListener(null);
            bVar.f1510a = alertDialog;
            if (onCancelListener != null) {
                bVar.f1511b = onCancelListener;
            }
            bVar.show(fragmentManager, str);
            return;
        }
        throw new NullPointerException("Cannot display null dialog");
    }

    @Override // b5.e
    public final Intent a(Context context, String str, int i10) {
        return super.a(context, str, i10);
    }

    @Override // b5.e
    public final int b(Context context) {
        return super.b(context);
    }

    @Override // b5.e
    public final int c(Context context, int i10) {
        return super.c(context, i10);
    }

    public final void d(Activity activity, int i10, DialogInterface.OnCancelListener onCancelListener) {
        AlertDialog e10 = e(activity, i10, new x(activity, super.a(activity, "d", i10)), onCancelListener);
        if (e10 == null) {
            return;
        }
        f(activity, e10, "GooglePlayServicesErrorDialog", onCancelListener);
    }

    public final void g(Context context, int i10, PendingIntent pendingIntent) {
        String c6;
        String d10;
        boolean z9;
        int i11;
        boolean z10;
        NotificationChannel notificationChannel;
        CharSequence name;
        Log.w("GoogleApiAvailability", String.format("GMS core API Availability. ConnectionResult=%s, tag=%s", Integer.valueOf(i10), null), new IllegalArgumentException());
        if (i10 == 18) {
            new j(this, context).sendEmptyMessageDelayed(1, 120000L);
            return;
        }
        if (pendingIntent == null) {
            if (i10 == 6) {
                Log.w("GoogleApiAvailability", "Missing resolution for ConnectionResult.RESOLUTION_REQUIRED. Call GoogleApiAvailability#showErrorNotification(Context, ConnectionResult) instead.");
                return;
            }
            return;
        }
        if (i10 == 6) {
            c6 = w.e(context, "common_google_play_services_resolution_required_title");
        } else {
            c6 = w.c(context, i10);
        }
        if (c6 == null) {
            c6 = context.getResources().getString(msr.pistream.app.R.string.common_google_play_services_notification_ticker);
        }
        if (i10 != 6 && i10 != 19) {
            d10 = w.b(context, i10);
        } else {
            d10 = w.d(context, "common_google_play_services_resolution_required_text", w.a(context));
        }
        Resources resources = context.getResources();
        Object systemService = context.getSystemService("notification");
        w7.b.s(systemService);
        NotificationManager notificationManager = (NotificationManager) systemService;
        s sVar = new s(context, null);
        sVar.f10738n = true;
        sVar.d(16, true);
        sVar.f10729e = s.c(c6);
        r rVar = new r();
        rVar.f10724d = s.c(d10);
        sVar.e(rVar);
        PackageManager packageManager = context.getPackageManager();
        if (j5.a.f6147e == null) {
            j5.a.f6147e = Boolean.valueOf(packageManager.hasSystemFeature("android.hardware.type.watch"));
        }
        if (j5.a.f6147e.booleanValue()) {
            sVar.f10741r.icon = context.getApplicationInfo().icon;
            sVar.f10732h = 2;
            if (j5.a.K(context)) {
                sVar.f10726b.add(new q(resources.getString(msr.pistream.app.R.string.common_open_on_phone), pendingIntent));
            } else {
                sVar.f10731g = pendingIntent;
            }
        } else {
            sVar.f10741r.icon = R.drawable.stat_sys_warning;
            sVar.f10741r.tickerText = s.c(resources.getString(msr.pistream.app.R.string.common_google_play_services_notification_ticker));
            sVar.f10741r.when = System.currentTimeMillis();
            sVar.f10731g = pendingIntent;
            sVar.f10730f = s.c(d10);
        }
        int i12 = Build.VERSION.SDK_INT;
        if (i12 >= 26) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (z9) {
            if (i12 >= 26) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                synchronized (f1516c) {
                }
                notificationChannel = notificationManager.getNotificationChannel("com.google.android.gms.availability");
                String string = context.getResources().getString(msr.pistream.app.R.string.common_google_play_services_notification_channel_name);
                if (notificationChannel == null) {
                    notificationManager.createNotificationChannel(b2.h.c(string));
                } else {
                    name = notificationChannel.getName();
                    if (!string.contentEquals(name)) {
                        notificationChannel.setName(string);
                        notificationManager.createNotificationChannel(notificationChannel);
                    }
                }
                sVar.f10739p = "com.google.android.gms.availability";
            } else {
                throw new IllegalStateException();
            }
        }
        Notification a10 = sVar.a();
        if (i10 != 1 && i10 != 2 && i10 != 3) {
            i11 = 39789;
        } else {
            g.f1521a.set(false);
            i11 = 10436;
        }
        notificationManager.notify(i11, a10);
    }

    public final void h(Activity activity, com.google.android.gms.common.api.internal.l lVar, int i10, a0 a0Var) {
        AlertDialog e10 = e(activity, i10, new y(super.a(activity, "d", i10), lVar), a0Var);
        if (e10 == null) {
            return;
        }
        f(activity, e10, "GooglePlayServicesErrorDialog", a0Var);
    }
}
