package defpackage;

import android.content.ComponentName;
import android.content.pm.PackageManager;
import android.util.Log;
import java.util.HashMap;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public abstract class ph4 {
    public static final String a = xk3.f("PackageManagerHelper");
    public static final HashMap b = new HashMap();

    public static final void a(PackageManager packageManager, ComponentName componentName, boolean z, ic2 ic2Var) {
        int i;
        String str;
        String str2 = "disabled";
        String str3 = a;
        try {
            if (z != ((Boolean) ic2Var.invoke(packageManager, componentName)).booleanValue()) {
                if (z) {
                    i = 1;
                } else {
                    i = 2;
                }
                packageManager.setComponentEnabledSetting(componentName, i, 1);
                xk3 d = xk3.d();
                String className = componentName.getClassName();
                if (!z) {
                    str = "disabled";
                } else {
                    str = "enabled";
                }
                d.a(str3, className + " " + str);
            }
        } catch (Exception e) {
            xk3 d2 = xk3.d();
            String className2 = componentName.getClassName();
            if (z) {
                str2 = "enabled";
            }
            String str4 = className2 + " could not be " + str2;
            if (d2.a <= 3) {
                Log.d(str3, str4, e);
            }
        }
    }
}
