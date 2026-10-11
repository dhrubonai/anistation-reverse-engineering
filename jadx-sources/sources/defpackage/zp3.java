package defpackage;

import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import android.view.Surface;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class zp3 implements Handler.Callback {
    public final Handler x;
    public final /* synthetic */ aq3 y;

    public zp3(aq3 aq3Var, hp3 hp3Var) {
        this.y = aq3Var;
        Handler p = eq6.p(this);
        this.x = p;
        hp3Var.O(this, p);
    }

    public final void a(long j) {
        boolean z;
        Surface surface;
        aq3 aq3Var = this.y;
        l33 l33Var = aq3Var.g1;
        if (this == aq3Var.U1 && aq3Var.i0 != null) {
            if (j == Long.MAX_VALUE) {
                aq3Var.Q0 = true;
                return;
            }
            try {
                aq3Var.F0(j);
                hv6 hv6Var = aq3Var.P1;
                if (!hv6Var.equals(hv6.d) && !hv6Var.equals(aq3Var.Q1)) {
                    aq3Var.Q1 = hv6Var;
                    l33Var.v(hv6Var);
                }
                aq3Var.S0.e++;
                ys6 ys6Var = aq3Var.j1;
                if (ys6Var.e != 3) {
                    z = true;
                } else {
                    z = false;
                }
                ys6Var.e = 3;
                ys6Var.k.getClass();
                ys6Var.g = eq6.U(SystemClock.elapsedRealtime());
                if (z && (surface = aq3Var.z1) != null) {
                    Handler handler = (Handler) l33Var.y;
                    if (handler != null) {
                        handler.post(new c61(l33Var, surface, SystemClock.elapsedRealtime(), (byte) 2));
                    }
                    aq3Var.C1 = true;
                }
                aq3Var.k0(j);
            } catch (yx1 e) {
                aq3Var.R0 = e;
            }
        }
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what != 0) {
            return false;
        }
        int i = message.arg1;
        int i2 = message.arg2;
        String str = eq6.a;
        a(((i & 4294967295L) << 32) | (4294967295L & i2));
        return true;
    }
}
