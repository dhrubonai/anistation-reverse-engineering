package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.dynamite.descriptors.com.google.firebase.auth.ModuleDescriptor;
import com.google.android.gms.internal.p002firebaseauthapi.zzaja;
import java.util.Locale;
import msr.pistream.app.R;

/* loaded from: classes.dex */
public abstract class w {

    /* renamed from: a, reason: collision with root package name */
    public static final n.k f2604a = new n.k();

    /* renamed from: b, reason: collision with root package name */
    public static Locale f2605b;

    public static String a(Context context) {
        String packageName = context.getPackageName();
        try {
            Context context2 = j5.b.a(context).f1527b;
            return context2.getPackageManager().getApplicationLabel(context2.getPackageManager().getApplicationInfo(packageName, 0)).toString();
        } catch (PackageManager.NameNotFoundException | NullPointerException unused) {
            String str = context.getApplicationInfo().name;
            if (TextUtils.isEmpty(str)) {
                return packageName;
            }
            return str;
        }
    }

    public static String b(Context context, int i10) {
        Resources resources = context.getResources();
        String a10 = a(context);
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    if (i10 != 5) {
                        if (i10 != 7) {
                            if (i10 != 9) {
                                if (i10 != 20) {
                                    switch (i10) {
                                        case 16:
                                            return d(context, "common_google_play_services_api_unavailable_text", a10);
                                        case 17:
                                            return d(context, "common_google_play_services_sign_in_failed_text", a10);
                                        case 18:
                                            return resources.getString(R.string.common_google_play_services_updating_text, a10);
                                        default:
                                            return resources.getString(R.string.common_google_play_services_unknown_issue, a10);
                                    }
                                }
                                return d(context, "common_google_play_services_restricted_profile_text", a10);
                            }
                            return resources.getString(R.string.common_google_play_services_unsupported_text, a10);
                        }
                        return d(context, "common_google_play_services_network_error_text", a10);
                    }
                    return d(context, "common_google_play_services_invalid_account_text", a10);
                }
                return resources.getString(R.string.common_google_play_services_enable_text, a10);
            }
            if (j5.a.K(context)) {
                return resources.getString(R.string.common_google_play_services_wear_update_text);
            }
            return resources.getString(R.string.common_google_play_services_update_text, a10);
        }
        return resources.getString(R.string.common_google_play_services_install_text, a10);
    }

    public static String c(Context context, int i10) {
        Resources resources = context.getResources();
        switch (i10) {
            case 1:
                return resources.getString(R.string.common_google_play_services_install_title);
            case 2:
                return resources.getString(R.string.common_google_play_services_update_title);
            case 3:
                return resources.getString(R.string.common_google_play_services_enable_title);
            case 4:
            case 6:
            case 18:
                return null;
            case 5:
                Log.e("GoogleApiAvailability", "An invalid account was specified when connecting. Please provide a valid account.");
                return e(context, "common_google_play_services_invalid_account_title");
            case zzaja.zze.zzg /* 7 */:
                Log.e("GoogleApiAvailability", "Network error occurred. Please retry request later.");
                return e(context, "common_google_play_services_network_error_title");
            case 8:
                Log.e("GoogleApiAvailability", "Internal error occurred. Please see logs for detailed information");
                return null;
            case 9:
                Log.e("GoogleApiAvailability", "Google Play services is invalid. Cannot recover.");
                return null;
            case 10:
                Log.e("GoogleApiAvailability", "Developer error occurred. Please see logs for detailed information");
                return null;
            case ModuleDescriptor.MODULE_VERSION /* 11 */:
                Log.e("GoogleApiAvailability", "The application is not licensed to the user.");
                return null;
            case 12:
            case 13:
            case 14:
            case 15:
            case 19:
            default:
                StringBuilder sb = new StringBuilder(33);
                sb.append("Unexpected error code ");
                sb.append(i10);
                Log.e("GoogleApiAvailability", sb.toString());
                return null;
            case 16:
                Log.e("GoogleApiAvailability", "One of the API components you attempted to connect to is not available.");
                return null;
            case 17:
                Log.e("GoogleApiAvailability", "The specified account could not be signed in.");
                return e(context, "common_google_play_services_sign_in_failed_title");
            case 20:
                Log.e("GoogleApiAvailability", "The current user profile is restricted and could not use authenticated features.");
                return e(context, "common_google_play_services_restricted_profile_title");
        }
    }

    public static String d(Context context, String str, String str2) {
        Resources resources = context.getResources();
        String e10 = e(context, str);
        if (e10 == null) {
            e10 = resources.getString(R.string.common_google_play_services_unknown_issue);
        }
        return String.format(resources.getConfiguration().locale, e10, str2);
    }

    public static String e(Context context, String str) {
        c0.i a10;
        Resources resources;
        String str2;
        String str3;
        n.k kVar = f2604a;
        synchronized (kVar) {
            try {
                Configuration configuration = context.getResources().getConfiguration();
                if (Build.VERSION.SDK_INT >= 24) {
                    a10 = new c0.i(new c0.l(c0.e.a(configuration)));
                } else {
                    a10 = c0.i.a(configuration.locale);
                }
                Locale c6 = a10.c(0);
                if (!c6.equals(f2605b)) {
                    kVar.clear();
                    f2605b = c6;
                }
                String str4 = (String) kVar.getOrDefault(str, null);
                if (str4 != null) {
                    return str4;
                }
                int i10 = b5.f.f1520e;
                try {
                    resources = context.getPackageManager().getResourcesForApplication("com.google.android.gms");
                } catch (PackageManager.NameNotFoundException unused) {
                    resources = null;
                }
                if (resources == null) {
                    return null;
                }
                int identifier = resources.getIdentifier(str, "string", "com.google.android.gms");
                if (identifier == 0) {
                    if (str.length() != 0) {
                        str3 = "Missing resource: ".concat(str);
                    } else {
                        str3 = new String("Missing resource: ");
                    }
                    Log.w("GoogleApiAvailability", str3);
                    return null;
                }
                String string = resources.getString(identifier);
                if (TextUtils.isEmpty(string)) {
                    if (str.length() != 0) {
                        str2 = "Got empty resource: ".concat(str);
                    } else {
                        str2 = new String("Got empty resource: ");
                    }
                    Log.w("GoogleApiAvailability", str2);
                    return null;
                }
                f2604a.put(str, string);
                return string;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
