package defpackage;

import android.os.DeadObjectException;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class yt3 extends Handler {
    public boolean a;
    public boolean b;
    public final /* synthetic */ bu3 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yt3(bu3 bu3Var, Looper looper) {
        super(looper);
        this.c = bu3Var;
        this.a = true;
        this.b = true;
    }

    public final void a(boolean z, boolean z2) {
        boolean z3;
        boolean z4 = false;
        if (this.a && z) {
            z3 = true;
        } else {
            z3 = false;
        }
        this.a = z3;
        if (this.b && z2) {
            z4 = true;
        }
        this.b = z4;
        if (!hasMessages(1)) {
            sendEmptyMessage(1);
        }
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        bu3 bu3Var;
        boolean z;
        nw2 nw2Var;
        js jsVar;
        int i;
        dt3 dt3Var;
        boolean z2;
        qh6 qh6Var;
        boolean z3;
        int i2;
        go4 go4Var;
        kf6 kf6Var;
        qh6 qh6Var2;
        bu3 bu3Var2 = this.c;
        gw3 gw3Var = bu3Var2.g;
        boolean z4 = true;
        if (message.what == 1) {
            ep4 ep4Var = bu3Var2.s;
            bu3Var2.t();
            kf6 f1 = bu3Var2.t.f1();
            bu3Var2.t();
            ep4 c = ep4Var.c(f1, bu3Var2.t.d1(), bu3Var2.s.k);
            bu3Var2.s = c;
            boolean z5 = this.a;
            boolean z6 = this.b;
            ep4 a0 = gw3Var.a0(c);
            st3 st3Var = gw3Var.f;
            ep4 Z = gw3Var.Z(a0);
            qh6 qh6Var3 = Z.F;
            kf6 kf6Var2 = Z.j;
            nw2 p = st3Var.p();
            js jsVar2 = (js) st3Var.y;
            int i3 = 0;
            while (i3 < p.size()) {
                dt3 dt3Var2 = (dt3) p.get(i3);
                try {
                    if (!st3Var.v(dt3Var2)) {
                        bu3Var = bu3Var2;
                        z = z5;
                        nw2Var = p;
                        jsVar = jsVar2;
                        i = i3;
                    } else {
                        st3Var.M();
                        xv0 xv0Var = (xv0) jsVar2.get(dt3Var2);
                        xv0Var.getClass();
                        kf6 kf6Var3 = xv0Var.h;
                        st3Var.M();
                        xv0 xv0Var2 = (xv0) jsVar2.get(dt3Var2);
                        xv0Var2.getClass();
                        qh6 qh6Var4 = xv0Var2.i;
                        if (z5 && kf6Var2.equals(kf6Var3)) {
                            z2 = z4;
                        } else {
                            z2 = false;
                        }
                        if (z6 && qh6Var3.equals(qh6Var4)) {
                            qh6Var = qh6Var4;
                            z3 = z4;
                        } else {
                            qh6Var = qh6Var4;
                            z3 = false;
                        }
                        i90 t = st3Var.t(dt3Var2);
                        if (t != null) {
                            i2 = t.b();
                        } else if (!bu3Var2.g(dt3Var2)) {
                            break;
                        } else {
                            i2 = 0;
                        }
                        st3Var.M();
                        st3Var.M();
                        st3Var.M();
                        xv0 xv0Var3 = (xv0) jsVar2.get(dt3Var2);
                        if (xv0Var3 != null) {
                            go4Var = xv0Var3.e;
                        } else {
                            go4Var = null;
                        }
                        bu3Var2.t();
                        go4 F = x97.F(go4Var, bu3Var2.t.l());
                        nw2Var = p;
                        try {
                            ct3 ct3Var = dt3Var2.e;
                            ct3Var.getClass();
                            z = z5;
                            dt3Var = dt3Var2;
                            boolean z7 = z2;
                            bu3Var = bu3Var2;
                            jsVar = jsVar2;
                            int i4 = i2;
                            i = i3;
                            try {
                                ct3Var.g(i4, Z, F, z7, z3);
                                if (z7) {
                                    kf6Var = kf6Var3;
                                } else {
                                    kf6Var = kf6Var2;
                                }
                                if (z3) {
                                    qh6Var2 = qh6Var;
                                } else {
                                    qh6Var2 = qh6Var3;
                                }
                                st3Var.M();
                                xv0 xv0Var4 = (xv0) jsVar.get(dt3Var);
                                if (xv0Var4 != null) {
                                    xv0Var4.h = kf6Var;
                                    xv0Var4.i = qh6Var2;
                                }
                            } catch (DeadObjectException unused) {
                                gw3Var.f.D(dt3Var);
                                i3 = i + 1;
                                z5 = z;
                                jsVar2 = jsVar;
                                p = nw2Var;
                                bu3Var2 = bu3Var;
                                z4 = true;
                            } catch (RemoteException e) {
                                e = e;
                                kb0.P("MediaSessionImpl", "Exception in " + dt3Var, e);
                                i3 = i + 1;
                                z5 = z;
                                jsVar2 = jsVar;
                                p = nw2Var;
                                bu3Var2 = bu3Var;
                                z4 = true;
                            }
                        } catch (DeadObjectException unused2) {
                            bu3Var = bu3Var2;
                            z = z5;
                            jsVar = jsVar2;
                            i = i3;
                            dt3Var = dt3Var2;
                            gw3Var.f.D(dt3Var);
                            i3 = i + 1;
                            z5 = z;
                            jsVar2 = jsVar;
                            p = nw2Var;
                            bu3Var2 = bu3Var;
                            z4 = true;
                        } catch (RemoteException e2) {
                            e = e2;
                            bu3Var = bu3Var2;
                            z = z5;
                            jsVar = jsVar2;
                            i = i3;
                            dt3Var = dt3Var2;
                            kb0.P("MediaSessionImpl", "Exception in " + dt3Var, e);
                            i3 = i + 1;
                            z5 = z;
                            jsVar2 = jsVar;
                            p = nw2Var;
                            bu3Var2 = bu3Var;
                            z4 = true;
                        }
                    }
                } catch (DeadObjectException unused3) {
                    bu3Var = bu3Var2;
                    z = z5;
                    nw2Var = p;
                } catch (RemoteException e3) {
                    e = e3;
                    bu3Var = bu3Var2;
                    z = z5;
                    nw2Var = p;
                }
                i3 = i + 1;
                z5 = z;
                jsVar2 = jsVar;
                p = nw2Var;
                bu3Var2 = bu3Var;
                z4 = true;
            }
            boolean z8 = z4;
            this.a = z8;
            this.b = z8;
            return;
        }
        qi2.h(message.what, "Invalid message what=");
    }
}
