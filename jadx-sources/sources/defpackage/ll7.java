package defpackage;

import android.os.Handler;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public abstract class ll7 {
    public static volatile h15 d;
    public final rv7 a;
    public final yc2 b;
    public volatile long c;

    public ll7(rv7 rv7Var) {
        a34.x(rv7Var);
        this.a = rv7Var;
        this.b = new yc2((byte) 14, this, rv7Var, false);
    }

    public abstract void a();

    public final void b(long j) {
        c();
        if (j >= 0) {
            rv7 rv7Var = this.a;
            rv7Var.d().getClass();
            this.c = System.currentTimeMillis();
            if (!d().postDelayed(this.b, j)) {
                rv7Var.c().C.b(Long.valueOf(j), "Failed to schedule delayed post. time");
            }
        }
    }

    public final void c() {
        this.c = 0L;
        d().removeCallbacks(this.b);
    }

    public final Handler d() {
        h15 h15Var;
        if (d != null) {
            return d;
        }
        synchronized (ll7.class) {
            try {
                if (d == null) {
                    d = new h15(this.a.g().getMainLooper(), (byte) 3);
                }
                h15Var = d;
            } catch (Throwable th) {
                throw th;
            }
        }
        return h15Var;
    }
}
