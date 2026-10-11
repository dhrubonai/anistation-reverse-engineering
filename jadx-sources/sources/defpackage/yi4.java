package defpackage;

import android.app.ActivityManager;
import android.os.Build;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public abstract class yi4 {
    public static final boolean a;

    static {
        ClassLoader classLoader;
        char[] cArr = zi4.d;
        boolean z = true;
        if (!wc7.p("robolectric", Build.FINGERPRINT) && (((classLoader = zi4.class.getClassLoader()) == null || (classLoader.getResource("androidx/test/espresso/Espresso.class") == null && classLoader.getResource("org/junit/runner/Runner.class") == null && classLoader.getResource("androidx/test/platform/app/InstrumentationRegistry.class") == null)) && !ActivityManager.isRunningInTestHarness())) {
            z = false;
        }
        a = z;
    }
}
