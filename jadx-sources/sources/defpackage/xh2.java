package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.util.Log;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public abstract class xh2 {
    public static boolean b = false;
    public static boolean c = false;
    public static final /* synthetic */ int e = 0;
    public static final AtomicBoolean a = new AtomicBoolean();
    public static final AtomicBoolean d = new AtomicBoolean();

    public static void a(Context context) {
        rh2 rh2Var = rh2.b;
        int b2 = rh2Var.b(context, 11925000);
        if (b2 != 0) {
            Intent a2 = rh2Var.a(b2, context, "e");
            StringBuilder sb = new StringBuilder(String.valueOf(b2).length() + 46);
            sb.append("GooglePlayServices not available due to error ");
            sb.append(b2);
            Log.e("GooglePlayServicesUtil", sb.toString());
            if (a2 == null) {
                throw new Exception();
            }
            throw new Exception("Google Play Services not available");
        }
    }

    public static boolean b(Context context) {
        try {
            if (!c) {
                try {
                    PackageInfo c2 = f97.a(context).c(134217792, "com.google.android.gms");
                    yh2.a(context);
                    if (c2 != null && !yh2.e(c2, false) && yh2.e(c2, true)) {
                        b = true;
                    } else {
                        b = false;
                    }
                    c = true;
                } catch (PackageManager.NameNotFoundException e2) {
                    Log.w("GooglePlayServicesUtil", "Cannot find Google Play services package name.", e2);
                    c = true;
                }
            }
            if (!b && "user".equals(Build.TYPE)) {
                return false;
            }
            return true;
        } catch (Throwable th) {
            c = true;
            throw th;
        }
    }
}
