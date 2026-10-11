package defpackage;

import android.os.Build;
import android.util.Log;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Level;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class dd7 extends qt0 {
    public static final boolean A;
    public static final boolean B;
    public static final AtomicReference C;
    public static final AtomicLong D;
    public static final ConcurrentLinkedQueue E;
    public static final boolean z;
    public volatile qt0 y;

    static {
        boolean z2;
        boolean z3;
        String str = Build.FINGERPRINT;
        boolean z4 = false;
        if (str == null || "robolectric".equals(str)) {
            z2 = true;
        } else {
            z2 = false;
        }
        z = z2;
        String str2 = Build.HARDWARE;
        if ("goldfish".equals(str2) || "ranchu".equals(str2)) {
            z3 = true;
        } else {
            z3 = false;
        }
        A = z3;
        String str3 = Build.TYPE;
        if ("eng".equals(str3) || "userdebug".equals(str3)) {
            z4 = true;
        }
        B = z4;
        C = new AtomicReference();
        D = new AtomicLong();
        E = new ConcurrentLinkedQueue();
    }

    public static void M() {
        while (true) {
            bd7 bd7Var = (bd7) E.poll();
            if (bd7Var != null) {
                D.getAndDecrement();
                dd7 dd7Var = bd7Var.a;
                l98 l98Var = bd7Var.b;
                r98 r98Var = l98Var.c;
                if ((r98Var != null && Boolean.TRUE.equals(r98Var.l(p98.g))) || dd7Var.I(l98Var.a)) {
                    dd7Var.J(l98Var);
                }
            } else {
                return;
            }
        }
    }

    @Override // defpackage.qt0
    public final boolean I(Level level) {
        if (this.y != null && !this.y.I(level)) {
            return false;
        }
        return true;
    }

    @Override // defpackage.qt0
    public final void J(l98 l98Var) {
        if (this.y != null) {
            this.y.J(l98Var);
            return;
        }
        if (D.incrementAndGet() > 20) {
            E.poll();
            Log.w("ProxyAndroidLoggerBackend", "Too many Flogger logs received before configuration. Dropping old logs.");
        }
        E.offer(new bd7(this, l98Var));
        if (this.y != null) {
            M();
        }
    }

    @Override // defpackage.qt0
    public final void K(RuntimeException runtimeException, l98 l98Var) {
        if (this.y != null) {
            this.y.K(runtimeException, l98Var);
        } else {
            Log.e("ProxyAndroidLoggerBackend", "Internal logging error before configuration", runtimeException);
        }
    }
}
