package defpackage;

import android.content.ComponentName;
import android.content.pm.ActivityInfo;
import android.content.pm.ComponentInfo;
import android.content.pm.PackageManager;
import java.util.HashMap;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final /* synthetic */ class nh4 extends uc2 implements ic2 {
    public static final nh4 x = new uc2(2, ph4.class, "isReceiverEnabled", "isReceiverEnabled(Landroid/content/pm/PackageManager;Landroid/content/ComponentName;)Z", 1);

    @Override // defpackage.ic2
    public final Object invoke(Object obj, Object obj2) {
        PackageManager packageManager = (PackageManager) obj;
        ComponentName componentName = (ComponentName) obj2;
        packageManager.getClass();
        componentName.getClass();
        String str = ph4.a;
        int componentEnabledSetting = packageManager.getComponentEnabledSetting(componentName);
        boolean z = false;
        if (componentEnabledSetting != 0) {
            if (componentEnabledSetting == 1) {
                z = true;
            }
        } else {
            HashMap hashMap = ph4.b;
            synchronized (hashMap) {
                Boolean bool = (Boolean) hashMap.get(componentName);
                if (bool != null) {
                    z = bool.booleanValue();
                } else {
                    try {
                        ActivityInfo receiverInfo = packageManager.getReceiverInfo(componentName, 512);
                        if (receiverInfo != null) {
                            z = ((ComponentInfo) receiverInfo).enabled;
                        }
                    } catch (PackageManager.NameNotFoundException e) {
                        xk3.d().h(ph4.a, componentName.getClassName() + " could not be found in manifest", e);
                    }
                    HashMap hashMap2 = ph4.b;
                    synchronized (hashMap2) {
                        hashMap2.put(componentName, Boolean.valueOf(z));
                    }
                }
            }
        }
        return Boolean.valueOf(z);
    }
}
