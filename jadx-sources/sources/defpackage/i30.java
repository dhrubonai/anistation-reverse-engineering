package defpackage;

import android.os.SystemClock;
import com.unity3d.ads.core.domain.WebViewScreenCapture;
import java.util.ArrayList;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public abstract class i30 implements q41 {
    public v41 A;
    public final boolean x;
    public final ArrayList y = new ArrayList(1);
    public int z;

    public i30(boolean z) {
        this.x = z;
    }

    public final void a(int i) {
        boolean z;
        v41 v41Var = this.A;
        String str = eq6.a;
        for (int i2 = 0; i2 < this.z; i2++) {
            n71 n71Var = (n71) this.y.get(i2);
            boolean z2 = this.x;
            synchronized (n71Var) {
                o15 o15Var = n71.M;
                if (z2 && (v41Var.i & 8) != 8) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    n71Var.F += i;
                }
            }
        }
    }

    public final void b() {
        boolean z;
        boolean z2;
        v41 v41Var = this.A;
        String str = eq6.a;
        for (int i = 0; i < this.z; i++) {
            n71 n71Var = (n71) this.y.get(i);
            boolean z3 = this.x;
            synchronized (n71Var) {
                try {
                    o15 o15Var = n71.M;
                    if (z3 && (v41Var.i & 8) != 8) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        if (n71Var.D > 0) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        io3.B(z2);
                        n71Var.A.getClass();
                        long elapsedRealtime = SystemClock.elapsedRealtime();
                        int i2 = (int) (elapsedRealtime - n71Var.E);
                        n71Var.G += i2;
                        long j = n71Var.H;
                        long j2 = n71Var.F;
                        n71Var.H = j + j2;
                        if (i2 > 0) {
                            n71Var.C.a((int) Math.sqrt(j2), (((float) j2) * 8000.0f) / i2);
                            if (n71Var.G < WebViewScreenCapture.CACHE_TTL_MS) {
                                if (n71Var.H >= 524288) {
                                }
                                n71Var.b(n71Var.F, i2, n71Var.I);
                                n71Var.E = elapsedRealtime;
                                n71Var.F = 0L;
                            }
                            n71Var.I = n71Var.C.b();
                            n71Var.b(n71Var.F, i2, n71Var.I);
                            n71Var.E = elapsedRealtime;
                            n71Var.F = 0L;
                        }
                        n71Var.D--;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        this.A = null;
    }

    public final void c() {
        for (int i = 0; i < this.z; i++) {
            ((n71) this.y.get(i)).getClass();
        }
    }

    public final void d(v41 v41Var) {
        boolean z;
        this.A = v41Var;
        for (int i = 0; i < this.z; i++) {
            n71 n71Var = (n71) this.y.get(i);
            boolean z2 = this.x;
            synchronized (n71Var) {
                try {
                    o15 o15Var = n71.M;
                    if (z2 && (v41Var.i & 8) != 8) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        if (n71Var.D == 0) {
                            n71Var.A.getClass();
                            n71Var.E = SystemClock.elapsedRealtime();
                        }
                        n71Var.D++;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Override // defpackage.q41
    public final void z(n71 n71Var) {
        n71Var.getClass();
        ArrayList arrayList = this.y;
        if (!arrayList.contains(n71Var)) {
            arrayList.add(n71Var);
            this.z++;
        }
    }
}
