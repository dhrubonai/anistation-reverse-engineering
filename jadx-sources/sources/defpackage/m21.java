package defpackage;

import android.content.Context;
import android.util.Log;
import java.lang.reflect.Method;
import org.chromium.net.ApiVersion;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public abstract class m21 {
    public static final rh2 a = rh2.b;
    public static final Object b = new Object();
    public static yq1 c = null;
    public static String d = "0";

    public static v78 a(Context context) {
        yq1 yq1Var;
        a34.y(context, "Context must not be null");
        p76 p76Var = new p76();
        v78 v78Var = p76Var.a;
        synchronized (b) {
            yq1Var = c;
        }
        if (yq1Var != null) {
            p76Var.b(null);
            return v78Var;
        }
        new Thread(new yc2((Object) context, (Object) p76Var, (byte) 13)).start();
        return v78Var;
    }

    public static void b(Context context) {
        yq1 yq1Var;
        boolean z;
        Object obj = b;
        synchronized (obj) {
            try {
                synchronized (obj) {
                    yq1Var = c;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (yq1Var != null) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return;
        }
        a34.y(context, "Context must not be null");
        ClassLoader classLoader = m21.class.getClassLoader();
        a34.x(classLoader);
        try {
            classLoader.loadClass("org.chromium.net.CronetEngine");
            int apiLevel = ApiVersion.getApiLevel();
            rh2 rh2Var = a;
            rh2Var.getClass();
            xh2.a(context);
            try {
                yq1 c2 = yq1.c(context, yq1.b, "com.google.android.gms.cronet_dynamite");
                try {
                    Class<?> loadClass = c2.a.getClassLoader().loadClass("org.chromium.net.impl.ImplVersion");
                    if (loadClass.getClassLoader() != m21.class.getClassLoader()) {
                        Method method = loadClass.getMethod("getApiLevel", null);
                        Method method2 = loadClass.getMethod("getCronetVersion", null);
                        Integer num = (Integer) method.invoke(null, null);
                        a34.x(num);
                        int intValue = num.intValue();
                        String str = (String) method2.invoke(null, null);
                        a34.x(str);
                        d = str;
                        if (apiLevel > intValue) {
                            if (rh2Var.a(2, context, "cr") == null) {
                                Log.e("m21", "Unable to fetch error resolution intent");
                                throw new Exception();
                            }
                            String str2 = d;
                            StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 174);
                            sb.append("Google Play Services update is required. The API Level of the client is ");
                            sb.append(apiLevel);
                            sb.append(". The API Level of the implementation is ");
                            sb.append(intValue);
                            sb.append(". The Cronet implementation version is ");
                            sb.append(str2);
                            throw new Exception(sb.toString());
                        }
                        c = c2;
                        return;
                    }
                    Log.e("m21", "ImplVersion class is missing from Cronet module.");
                    throw new Exception();
                } catch (Exception e) {
                    Log.e("m21", "Unable to read Cronet version from the Cronet module ", e);
                    throw ((vh2) new Exception().initCause(e));
                }
            } catch (vq1 e2) {
                Log.e("m21", "Unable to load Cronet module", e2);
                throw ((vh2) new Exception().initCause(e2));
            }
        } catch (ClassNotFoundException e3) {
            Log.e("m21", "Cronet API is not available. Have you included all required dependencies?");
            throw ((vh2) new Exception().initCause(e3));
        }
    }
}
