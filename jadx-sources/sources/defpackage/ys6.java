package defpackage;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.os.Build;
import android.os.SystemClock;
import android.view.Choreographer;
import android.view.Surface;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class ys6 {
    public final aq3 a;
    public final et6 b;
    public final short c;
    public boolean d;
    public long g;
    public boolean i;
    public boolean l;
    public boolean m;
    public int e = 0;
    public long f = -9223372036854775807L;
    public long h = -9223372036854775807L;
    public float j = 1.0f;
    public f46 k = f46.a;

    /* JADX WARN: Type inference failed for: r2v1, types: [short, int] */
    public ys6(Context context, aq3 aq3Var, long j) {
        this.a = aq3Var;
        this.c = (int) j;
        this.b = new et6(context);
    }

    /* JADX WARN: Code restructure failed: missing block: B:113:0x00af, code lost:
    
        if (r18 > 100000) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x00bd, code lost:
    
        if (r31 >= r35) goto L46;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int a(long r29, long r31, long r33, long r35, boolean r37, boolean r38, long r39, long r41, defpackage.ss r43) {
        /*
            Method dump skipped, instructions count: 497
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ys6.a(long, long, long, long, boolean, boolean, long, long, ss):int");
    }

    public final boolean b(boolean z) {
        if (z && (this.e == 3 || (this.m && !this.l))) {
            this.h = -9223372036854775807L;
            return true;
        }
        if (this.h == -9223372036854775807L) {
            return false;
        }
        this.k.getClass();
        if (SystemClock.elapsedRealtime() < this.h) {
            return true;
        }
        this.h = -9223372036854775807L;
        return false;
    }

    public final void c(boolean z) {
        long j;
        this.i = z;
        long j2 = this.c;
        if (j2 > 0) {
            this.k.getClass();
            j = SystemClock.elapsedRealtime() + j2;
        } else {
            j = -9223372036854775807L;
        }
        this.h = j;
    }

    public final void d() {
        at6 at6Var;
        this.d = true;
        this.k.getClass();
        this.g = eq6.U(SystemClock.elapsedRealtime());
        et6 et6Var = this.b;
        et6Var.d = true;
        et6Var.b();
        if (!et6Var.b) {
            DisplayManager displayManager = (DisplayManager) et6Var.a.getSystemService("display");
            at6 at6Var2 = null;
            if (displayManager != null) {
                try {
                    Choreographer choreographer = Choreographer.getInstance();
                    if (Build.VERSION.SDK_INT >= 33) {
                        at6Var = new dt6(choreographer, displayManager);
                    } else {
                        at6Var = new at6(choreographer, displayManager);
                    }
                    at6Var2 = at6Var;
                } catch (RuntimeException e) {
                    kb0.P("VideoFrameReleaseHelper", "Vsync sampling disabled due to platform error", e);
                }
            }
            et6Var.c = at6Var2;
            et6Var.b = true;
        }
        at6 at6Var3 = et6Var.c;
        if (at6Var3 != null) {
            at6Var3.a();
        }
        et6Var.c(false);
    }

    public final void e(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    this.e = Math.min(this.e, 2);
                } else {
                    p65.l();
                    return;
                }
            } else {
                this.e = 0;
            }
        } else {
            this.e = 1;
        }
        this.b.b();
    }

    public final void f(Surface surface) {
        boolean z;
        if (surface != null) {
            z = true;
        } else {
            z = false;
        }
        this.l = z;
        this.m = false;
        et6 et6Var = this.b;
        if (et6Var.e != surface) {
            et6Var.a();
            et6Var.e = surface;
            et6Var.c(true);
        }
        this.e = Math.min(this.e, 1);
    }

    public final void g(float f) {
        boolean z;
        if (f > 0.0f) {
            z = true;
        } else {
            z = false;
        }
        io3.n(z);
        if (f == this.j) {
            return;
        }
        this.j = f;
        et6 et6Var = this.b;
        et6Var.h = f;
        et6Var.c(false);
    }
}
