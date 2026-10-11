package l5;

import android.content.Context;
import android.util.Log;
import com.google.android.gms.common.api.internal.d1;
import java.lang.reflect.Field;
import p7.a0;

/* loaded from: classes.dex */
public abstract class a {
    static {
        new ThreadLocal();
        new d1(1);
    }

    public static int a(Context context) {
        try {
            Class<?> loadClass = context.getApplicationContext().getClassLoader().loadClass("com.google.android.gms.dynamite.descriptors.com.google.android.gms.auth.api.fallback.ModuleDescriptor");
            Field declaredField = loadClass.getDeclaredField("MODULE_ID");
            Field declaredField2 = loadClass.getDeclaredField("MODULE_VERSION");
            if (!a0.q(declaredField.get(null), "com.google.android.gms.auth.api.fallback")) {
                Log.e("DynamiteModule", "Module descriptor id '" + String.valueOf(declaredField.get(null)) + "' didn't match expected id 'com.google.android.gms.auth.api.fallback'");
                return 0;
            }
            return declaredField2.getInt(null);
        } catch (ClassNotFoundException unused) {
            Log.w("DynamiteModule", "Local module descriptor class for com.google.android.gms.auth.api.fallback not found.");
            return 0;
        } catch (Exception e10) {
            Log.e("DynamiteModule", "Failed to load module descriptor class: ".concat(String.valueOf(e10.getMessage())));
            return 0;
        }
    }
}
