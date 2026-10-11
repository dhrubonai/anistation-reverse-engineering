package defpackage;

import android.os.SystemClock;
import java.util.LinkedHashMap;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public abstract class a61 {
    public static final LinkedHashMap a = new LinkedHashMap();

    static {
        SystemClock.elapsedRealtime();
    }

    public static synchronized void a() {
        synchronized (a61.class) {
            synchronized (a61.class) {
            }
        }
    }

    public static synchronized void b() {
        synchronized (a61.class) {
            a.clear();
            SystemClock.elapsedRealtime();
        }
    }
}
