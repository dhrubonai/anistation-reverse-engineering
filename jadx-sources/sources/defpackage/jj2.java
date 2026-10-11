package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class jj2 extends n11 implements vc1 {
    public final boolean A;
    public final jj2 B;
    public final Handler y;
    public final String z;

    public jj2(Handler handler, String str, boolean z) {
        jj2 jj2Var;
        this.y = handler;
        this.z = str;
        this.A = z;
        if (z) {
            jj2Var = this;
        } else {
            jj2Var = new jj2(handler, str, true);
        }
        this.B = jj2Var;
    }

    @Override // defpackage.vc1
    public final ei1 a(long j, final Runnable runnable, l11 l11Var) {
        if (j > 4611686018427387903L) {
            j = 4611686018427387903L;
        }
        if (this.y.postDelayed(runnable, j)) {
            return new ei1() { // from class: ij2
                @Override // defpackage.ei1
                public final void dispose() {
                    jj2.this.y.removeCallbacks(runnable);
                }
            };
        }
        y0(l11Var, runnable);
        return ma4.x;
    }

    @Override // defpackage.vc1
    public final void d0(long j, qg0 qg0Var) {
        f32 f32Var = new f32((Object) qg0Var, (Object) this, (byte) 4);
        if (j > 4611686018427387903L) {
            j = 4611686018427387903L;
        }
        if (this.y.postDelayed(f32Var, j)) {
            qg0Var.v(new r82(this, f32Var, (byte) 1));
        } else {
            y0(qg0Var.B, f32Var);
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof jj2) {
            jj2 jj2Var = (jj2) obj;
            if (jj2Var.y == this.y && jj2Var.A == this.A) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int identityHashCode = System.identityHashCode(this.y);
        if (this.A) {
            i = 1231;
        } else {
            i = 1237;
        }
        return i ^ identityHashCode;
    }

    @Override // defpackage.n11
    public final String toString() {
        jj2 jj2Var;
        String str;
        ja1 ja1Var = rh1.a;
        jj2 jj2Var2 = qm3.a;
        if (this == jj2Var2) {
            str = "Dispatchers.Main";
        } else {
            try {
                jj2Var = jj2Var2.B;
            } catch (UnsupportedOperationException unused) {
                jj2Var = null;
            }
            if (this == jj2Var) {
                str = "Dispatchers.Main.immediate";
            } else {
                str = null;
            }
        }
        if (str == null) {
            String str2 = this.z;
            if (str2 == null) {
                str2 = this.y.toString();
            }
            if (this.A) {
                return h11.j(str2, ".immediate");
            }
            return str2;
        }
        return str;
    }

    @Override // defpackage.n11
    public final void u0(l11 l11Var, Runnable runnable) {
        if (!this.y.post(runnable)) {
            y0(l11Var, runnable);
        }
    }

    @Override // defpackage.n11
    public final boolean w0(l11 l11Var) {
        if (this.A && a34.i(Looper.myLooper(), this.y.getLooper())) {
            return false;
        }
        return true;
    }

    @Override // defpackage.n11
    public final n11 x0(int i) {
        wk6.k(i);
        return this;
    }

    public final void y0(l11 l11Var, Runnable runnable) {
        h98.i(l11Var, new CancellationException("The task was rejected, the handler underlying the dispatcher '" + this + "' was closed"));
        ja1 ja1Var = rh1.a;
        j91.y.u0(l11Var, runnable);
    }

    public jj2(Handler handler) {
        this(handler, null, false);
    }
}
