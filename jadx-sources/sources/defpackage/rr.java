package defpackage;

import android.os.Handler;
import android.os.Looper;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class rr extends jy5 {
    public static volatile rr b;
    public static final qr c = new qr((byte) 0);
    public final ta1 a = new ta1();

    public static rr n() {
        if (b != null) {
            return b;
        }
        synchronized (rr.class) {
            try {
                if (b == null) {
                    b = new rr();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return b;
    }

    public final void o(Runnable runnable) {
        ta1 ta1Var = this.a;
        if (ta1Var.c == null) {
            synchronized (ta1Var.a) {
                try {
                    if (ta1Var.c == null) {
                        ta1Var.c = Handler.createAsync(Looper.getMainLooper());
                    }
                } finally {
                }
            }
        }
        ta1Var.c.post(runnable);
    }
}
