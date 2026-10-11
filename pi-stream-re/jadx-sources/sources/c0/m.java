package c0;

import android.os.Trace;

/* loaded from: classes.dex */
public abstract class m {
    public static void a(String str) {
        Trace.beginSection(str);
    }

    public static void b() {
        Trace.endSection();
    }
}
