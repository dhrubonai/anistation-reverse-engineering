package defpackage;

import android.os.Looper;
import java.util.Locale;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class bl7 {
    public static final Object i = new Object();
    public final zk3 a;
    public final int b;
    public final String c;
    public wk7 g;
    public la h;
    public long e = -1;
    public long f = 0;
    public final h15 d = new h15(Looper.getMainLooper(), (byte) 4);

    public bl7(long j, String str) {
        this.b = (int) j;
        this.c = str;
        this.a = new zk3("RequestTracker", str);
    }

    public final void a(long j, wk7 wk7Var) {
        wk7 wk7Var2;
        long j2;
        long j3;
        long currentTimeMillis = System.currentTimeMillis();
        Object obj = i;
        synchronized (obj) {
            wk7Var2 = this.g;
            j2 = this.e;
            j3 = this.f;
            this.e = j;
            this.g = wk7Var;
            this.f = currentTimeMillis;
        }
        if (wk7Var2 != null) {
            wk7Var2.m(this.c, j2, j3, currentTimeMillis);
        }
        synchronized (obj) {
            try {
                la laVar = this.h;
                if (laVar != null) {
                    this.d.removeCallbacks(laVar);
                }
                la laVar2 = new la((Object) this, (byte) 15);
                this.h = laVar2;
                this.d.postDelayed(laVar2, this.b);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean b() {
        boolean z;
        synchronized (i) {
            if (this.e != -1) {
                z = true;
            } else {
                z = false;
            }
        }
        return z;
    }

    public final boolean c(long j) {
        boolean z;
        synchronized (i) {
            long j2 = this.e;
            z = false;
            if (j2 != -1 && j2 == j) {
                z = true;
            }
        }
        return z;
    }

    public final void d(long j, int i2, y95 y95Var) {
        synchronized (i) {
            try {
                if (c(j)) {
                    Locale locale = Locale.ROOT;
                    f("request " + j + " completed", i2, y95Var);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean e(int i2) {
        synchronized (i) {
            try {
                if (b()) {
                    Locale locale = Locale.ROOT;
                    f("clearing request " + this.e, i2, null);
                    return true;
                }
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void f(String str, int i2, Object obj) {
        this.a.b(str, new Object[0]);
        Object obj2 = i;
        synchronized (obj2) {
            try {
                if (this.g != null) {
                    long currentTimeMillis = System.currentTimeMillis();
                    wk7 wk7Var = this.g;
                    a34.x(wk7Var);
                    wk7Var.x(this.c, this.e, i2, obj, this.f, currentTimeMillis);
                }
                this.e = -1L;
                this.g = null;
                synchronized (obj2) {
                    la laVar = this.h;
                    if (laVar != null) {
                        this.d.removeCallbacks(laVar);
                        this.h = null;
                    }
                }
            } catch (Throwable th) {
                throw th;
            } finally {
            }
        }
    }
}
