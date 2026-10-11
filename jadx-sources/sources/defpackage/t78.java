package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class t78 extends ig7 {
    public final AtomicReference g;
    public final h15 h;

    public t78(y88 y88Var) {
        super((byte) 1);
        this.g = new AtomicReference(y88Var);
        this.h = new h15(y88Var.d, (byte) 4);
    }

    @Override // defpackage.ig7
    public final void L(int i) {
        y88 y88Var = null;
        y88 y88Var2 = (y88) this.g.getAndSet(null);
        if (y88Var2 != null) {
            y88Var2.N = -1;
            y88Var2.O = -1;
            y88Var2.B = null;
            y88Var2.H = null;
            y88Var2.L = 0.0d;
            y88Var2.y();
            y88Var2.I = false;
            y88Var2.M = null;
            y88Var = y88Var2;
        }
        if (y88Var != null) {
            y88.T.b("ICastDeviceControllerListener.onDisconnected: %d", Integer.valueOf(i));
            if (i != 0) {
                int i2 = y88Var.y.get();
                rl7 rl7Var = y88Var.g;
                rl7Var.sendMessage(rl7Var.obtainMessage(6, i2, 2));
            }
        }
    }

    @Override // defpackage.ig7
    public final void O(mr mrVar, String str, String str2, boolean z) {
        y88 y88Var = (y88) this.g.get();
        if (y88Var == null) {
            return;
        }
        y88Var.B = mrVar;
        y88Var.P = mrVar.x;
        y88Var.Q = str2;
        y88Var.H = str;
        synchronized (y88.U) {
        }
    }

    @Override // defpackage.ig7
    public final void P(int i) {
        if (((y88) this.g.get()) == null) {
            return;
        }
        synchronized (y88.U) {
        }
    }

    @Override // defpackage.ig7
    public final void Q(int i) {
        if (((y88) this.g.get()) == null) {
            return;
        }
        synchronized (y88.V) {
        }
    }

    @Override // defpackage.ig7
    public final void R(int i) {
        if (((y88) this.g.get()) == null) {
            return;
        }
        synchronized (y88.V) {
        }
    }

    @Override // defpackage.ig7
    public final void S(int i) {
        y88 y88Var = (y88) this.g.get();
        if (y88Var != null) {
            y88Var.P = null;
            y88Var.Q = null;
            synchronized (y88.V) {
            }
            if (y88Var.D != null) {
                this.h.post(new ag0(this, y88Var, i));
            }
        }
    }

    @Override // defpackage.ig7
    public final void T() {
        y88.T.b("Deprecated callback: \"onStatusreceived\"", new Object[0]);
    }

    @Override // defpackage.ig7
    public final void U(le7 le7Var) {
        y88 y88Var = (y88) this.g.get();
        if (y88Var == null) {
            return;
        }
        y88.T.b("onDeviceStatusChanged", new Object[0]);
        this.h.post(new ly7((Object) this, (Object) y88Var, (Object) le7Var, (byte) 8));
    }

    @Override // defpackage.ig7
    public final void V(fc7 fc7Var) {
        y88 y88Var = (y88) this.g.get();
        if (y88Var == null) {
            return;
        }
        y88.T.b("onApplicationStatusChanged", new Object[0]);
        this.h.post(new ly7((Object) this, (Object) y88Var, (Object) fc7Var, (byte) 9));
    }

    @Override // defpackage.ig7
    public final void W(String str, String str2) {
        y88 y88Var = (y88) this.g.get();
        if (y88Var == null) {
            return;
        }
        y88.T.b("Receive (type=text, ns=%s) %s", str, str2);
        this.h.post(new t35(this, y88Var, str, str2));
    }

    @Override // defpackage.ig7
    public final void X(String str, byte[] bArr) {
        if (((y88) this.g.get()) == null) {
            return;
        }
        zk3 zk3Var = y88.T;
        y88.T.b("IGNORING: Receive (type=binary, ns=%s) <%d bytes>", str, Integer.valueOf(bArr.length));
    }

    @Override // defpackage.ig7
    public final void Y(int i, long j) {
        y88 y88Var = (y88) this.g.get();
        if (y88Var == null) {
            return;
        }
        y88Var.A(j);
    }

    @Override // defpackage.ig7
    public final void Z(long j) {
        y88 y88Var = (y88) this.g.get();
        if (y88Var == null) {
            return;
        }
        y88Var.A(j);
    }
}
