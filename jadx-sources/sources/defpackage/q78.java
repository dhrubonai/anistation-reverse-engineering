package defpackage;

import android.os.Trace;
import java.util.ArrayDeque;
import java.util.UUID;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public abstract class q78 {
    public static final AtomicReference a;
    public static final WeakHashMap b;
    public static final qf c;

    static {
        zw2.k(new Object[]{"androidx.fragment.app.FragmentViewLifecycleOwner.handleLifecycleEvent", "com.google.android.libraries.logging.logger.transmitters.clearcut", "com.google.android.libraries.performance.primes.transmitter.clearcut", "com.google.android.libraries.performance.primes.metrics.crash.CrashMetricServiceImpl", "com.google.android.libraries.performance.primes.metrics.crash.applicationexit.ApplicationExitMetricServiceImpl"}, 5);
        a = new AtomicReference(v15.G);
        b = new WeakHashMap();
        c = new qf((byte) 6);
        new ArrayDeque();
        new ArrayDeque();
    }

    public static h78 a() {
        q88 c2 = c();
        h78 h78Var = c2.b;
        if (h78Var != null && h78Var != i88.D) {
            return h78Var;
        }
        nw nwVar = h88.C;
        r78 r78Var = r78.c;
        long a2 = r78Var.a() & (-61441);
        long a3 = r78Var.a() >>> 2;
        UUID uuid = r78Var.a;
        UUID uuid2 = new UUID(a2 ^ uuid.getMostSignificantBits(), a3 ^ uuid.getLeastSignificantBits());
        String a4 = h78.a(uuid2);
        zw2 zw2Var = (zw2) a.get();
        if (!zw2Var.isEmpty()) {
            zw2Var.forEach(new Object());
        }
        nw nwVar2 = h88.C;
        return new h78("<missing root>", uuid2, a4, c2);
    }

    public static h78 b(q88 q88Var, h78 h78Var) {
        q88Var.getClass();
        h78 h78Var2 = q88Var.b;
        if (h78Var2 != h78Var) {
            if (h78Var2 == null) {
                q88Var.a = Trace.isEnabled();
            }
            if (q88Var.a) {
                if (h78Var2 != null) {
                    if (h78Var != null) {
                        if (h78Var2.x == h78Var && !gv5.o(h78Var2)) {
                            Trace.endSection();
                        } else if (h78Var2 == h78Var.x && !gv5.o(h78Var)) {
                            gv5.p(h78Var);
                        }
                    }
                    gv5.n(h78Var2);
                }
                if (h78Var != null) {
                    gv5.m(h78Var);
                }
            }
            if (h78Var2 != h78Var) {
                q88Var.b = h78Var;
                return h78Var2;
            }
        }
        return h78Var;
    }

    public static q88 c() {
        return (q88) c.get();
    }
}
