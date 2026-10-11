package defpackage;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.TextUtils;
import com.unity3d.services.UnityAdsConstants;
import java.lang.reflect.InvocationTargetException;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class ak7 extends qt0 {
    public vj7 A;
    public Boolean B;
    public Boolean y;
    public String z;

    public final boolean M(String str) {
        gu7.j(((gu7) this.x).F);
        if (!i28.n0((String) tq7.g1.a(null), str) && !i28.n0((String) tq7.h1.a(null), str) && !i28.n0((String) tq7.i1.a(null), str)) {
            return UnityAdsConstants.OpenMeasurement.OM_PARTNER_VERSION.equals(this.A.e(str, "gaia_collection_enabled"));
        }
        return true;
    }

    public final boolean N(String str) {
        return UnityAdsConstants.OpenMeasurement.OM_PARTNER_VERSION.equals(this.A.e(str, "measurement.event_sampling_enabled"));
    }

    public final boolean O() {
        Boolean bool = this.y;
        if (bool == null) {
            bool = Y("app_measurement_lite");
            this.y = bool;
            if (bool == null) {
                bool = Boolean.FALSE;
                this.y = bool;
            }
        }
        if (!bool.booleanValue() && ((gu7) this.x).y) {
            return false;
        }
        return true;
    }

    public final String P(String str) {
        gu7 gu7Var = (gu7) this.x;
        try {
            String str2 = (String) Class.forName("android.os.SystemProperties").getMethod("get", String.class, String.class).invoke(null, str, "");
            a34.x(str2);
            return str2;
        } catch (ClassNotFoundException e) {
            es7 es7Var = gu7Var.C;
            gu7.l(es7Var);
            es7Var.C.b(e, "Could not find SystemProperties class");
            return "";
        } catch (IllegalAccessException e2) {
            es7 es7Var2 = gu7Var.C;
            gu7.l(es7Var2);
            es7Var2.C.b(e2, "Could not access SystemProperties.get()");
            return "";
        } catch (NoSuchMethodException e3) {
            es7 es7Var3 = gu7Var.C;
            gu7.l(es7Var3);
            es7Var3.C.b(e3, "Could not find SystemProperties.get() method");
            return "";
        } catch (InvocationTargetException e4) {
            es7 es7Var4 = gu7Var.C;
            gu7.l(es7Var4);
            es7Var4.C.b(e4, "SystemProperties.get() threw an exception");
            return "";
        }
    }

    public final int Q(String str, boolean z) {
        int i = UnityAdsConstants.RequestPolicy.RETRY_WAIT_BASE;
        if (z) {
            i = Math.max(Math.min(U(str, tq7.g0), UnityAdsConstants.RequestPolicy.RETRY_WAIT_BASE), 100);
        }
        return Math.max(i, 256);
    }

    public final void R() {
        ((gu7) this.x).getClass();
    }

    public final String S(String str, sq7 sq7Var) {
        if (TextUtils.isEmpty(str)) {
            return (String) sq7Var.a(null);
        }
        return (String) sq7Var.a(this.A.e(str, sq7Var.a));
    }

    public final long T(String str, sq7 sq7Var) {
        if (TextUtils.isEmpty(str)) {
            return ((Long) sq7Var.a(null)).longValue();
        }
        String e = this.A.e(str, sq7Var.a);
        if (TextUtils.isEmpty(e)) {
            return ((Long) sq7Var.a(null)).longValue();
        }
        try {
            return ((Long) sq7Var.a(Long.valueOf(Long.parseLong(e)))).longValue();
        } catch (NumberFormatException unused) {
            return ((Long) sq7Var.a(null)).longValue();
        }
    }

    public final int U(String str, sq7 sq7Var) {
        if (TextUtils.isEmpty(str)) {
            return ((Integer) sq7Var.a(null)).intValue();
        }
        String e = this.A.e(str, sq7Var.a);
        if (TextUtils.isEmpty(e)) {
            return ((Integer) sq7Var.a(null)).intValue();
        }
        try {
            return ((Integer) sq7Var.a(Integer.valueOf(Integer.parseInt(e)))).intValue();
        } catch (NumberFormatException unused) {
            return ((Integer) sq7Var.a(null)).intValue();
        }
    }

    public final double V(String str, sq7 sq7Var) {
        if (TextUtils.isEmpty(str)) {
            return ((Double) sq7Var.a(null)).doubleValue();
        }
        String e = this.A.e(str, sq7Var.a);
        if (TextUtils.isEmpty(e)) {
            return ((Double) sq7Var.a(null)).doubleValue();
        }
        try {
            return ((Double) sq7Var.a(Double.valueOf(Double.parseDouble(e)))).doubleValue();
        } catch (NumberFormatException unused) {
            return ((Double) sq7Var.a(null)).doubleValue();
        }
    }

    public final boolean W(String str, sq7 sq7Var) {
        if (TextUtils.isEmpty(str)) {
            return ((Boolean) sq7Var.a(null)).booleanValue();
        }
        String e = this.A.e(str, sq7Var.a);
        if (TextUtils.isEmpty(e)) {
            return ((Boolean) sq7Var.a(null)).booleanValue();
        }
        return ((Boolean) sq7Var.a(Boolean.valueOf(UnityAdsConstants.OpenMeasurement.OM_PARTNER_VERSION.equals(e)))).booleanValue();
    }

    public final Bundle X() {
        gu7 gu7Var = (gu7) this.x;
        try {
            Context context = gu7Var.x;
            Context context2 = gu7Var.x;
            es7 es7Var = gu7Var.C;
            if (context.getPackageManager() == null) {
                gu7.l(es7Var);
                es7Var.C.a("Failed to load metadata: PackageManager is null");
                return null;
            }
            ApplicationInfo a = f97.a(context2).a(128, context2.getPackageName());
            if (a == null) {
                gu7.l(es7Var);
                es7Var.C.a("Failed to load metadata: ApplicationInfo is null");
                return null;
            }
            return a.metaData;
        } catch (PackageManager.NameNotFoundException e) {
            es7 es7Var2 = gu7Var.C;
            gu7.l(es7Var2);
            es7Var2.C.b(e, "Failed to load metadata: Package name not found");
            return null;
        }
    }

    public final Boolean Y(String str) {
        a34.u(str);
        Bundle X = X();
        if (X == null) {
            es7 es7Var = ((gu7) this.x).C;
            gu7.l(es7Var);
            es7Var.C.a("Failed to load metadata: Metadata bundle is null");
            return null;
        }
        if (!X.containsKey(str)) {
            return null;
        }
        return Boolean.valueOf(X.getBoolean(str));
    }

    public final boolean Z() {
        ((gu7) this.x).getClass();
        Boolean Y = Y("firebase_analytics_collection_deactivated");
        if (Y != null && Y.booleanValue()) {
            return true;
        }
        return false;
    }

    public final boolean a0() {
        Boolean Y = Y("google_analytics_automatic_screen_reporting_enabled");
        if (Y != null && !Y.booleanValue()) {
            return false;
        }
        return true;
    }

    public final tv7 b0(String str, boolean z) {
        Object obj;
        a34.u(str);
        gu7 gu7Var = (gu7) this.x;
        Bundle X = X();
        if (X == null) {
            es7 es7Var = gu7Var.C;
            gu7.l(es7Var);
            es7Var.C.a("Failed to load metadata: Metadata bundle is null");
            obj = null;
        } else {
            obj = X.get(str);
        }
        tv7 tv7Var = tv7.UNINITIALIZED;
        if (obj == null) {
            return tv7Var;
        }
        if (Boolean.TRUE.equals(obj)) {
            return tv7.GRANTED;
        }
        if (Boolean.FALSE.equals(obj)) {
            return tv7.DENIED;
        }
        if (z && "eu_consent_policy".equals(obj)) {
            return tv7.POLICY;
        }
        es7 es7Var2 = gu7Var.C;
        gu7.l(es7Var2);
        es7Var2.F.b(str, "Invalid manifest metadata for");
        return tv7Var;
    }
}
