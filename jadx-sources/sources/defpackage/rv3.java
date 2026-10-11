package defpackage;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.IBinder;
import java.util.Objects;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final /* synthetic */ class rv3 implements Runnable {
    public final /* synthetic */ int A;
    public final /* synthetic */ Object B;
    public final /* synthetic */ byte x;
    public final /* synthetic */ Object y;
    public final /* synthetic */ Object z;

    public /* synthetic */ rv3(gw3 gw3Var, IBinder iBinder, cw3 cw3Var, int i) {
        this.x = (byte) 1;
        this.y = gw3Var;
        this.z = iBinder;
        this.B = cw3Var;
        this.A = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        xv0 xv0Var;
        switch (this.x) {
            case 0:
                gw3 gw3Var = (gw3) this.y;
                IBinder iBinder = (IBinder) this.z;
                int i = this.A;
                tk5 tk5Var = (tk5) this.B;
                st3 st3Var = gw3Var.f;
                st3Var.M();
                dt3 q = st3Var.q(iBinder);
                i90 i90Var = null;
                if (q != null) {
                    xv0Var = (xv0) ((js) st3Var.y).get(q);
                } else {
                    xv0Var = null;
                }
                if (xv0Var != null) {
                    i90Var = xv0Var.b;
                }
                if (i90Var != null) {
                    synchronized (i90Var.c) {
                        try {
                            vi5 vi5Var = (vi5) ((js) i90Var.d).remove(Integer.valueOf(i));
                            if (vi5Var != null) {
                                if (vi5Var.F.getClass() == tk5.class) {
                                    vi5Var.l(tk5Var);
                                } else {
                                    kb0.O("SequencedFutureManager", "Type mismatch, expected " + vi5Var.F.getClass() + ", but was " + tk5.class);
                                }
                            }
                        } finally {
                        }
                    }
                    return;
                }
                return;
            case 1:
                gw3 gw3Var2 = (gw3) this.y;
                IBinder iBinder2 = (IBinder) this.z;
                cw3 cw3Var = (cw3) this.B;
                int i2 = this.A;
                dt3 q2 = gw3Var2.f.q(iBinder2);
                if (q2 != null) {
                    cw3Var.a(q2, i2);
                    return;
                }
                return;
            default:
                kp6 kp6Var = (kp6) this.y;
                oy oyVar = (oy) this.z;
                int i3 = this.A;
                Runnable runnable = (Runnable) this.B;
                l85 l85Var = kp6Var.f;
                byte b = 1;
                try {
                    try {
                        l85 l85Var2 = kp6Var.c;
                        Objects.requireNonNull(l85Var2);
                        l85Var.t(new ip6(l85Var2, b));
                        NetworkInfo activeNetworkInfo = ((ConnectivityManager) kp6Var.a.getSystemService("connectivity")).getActiveNetworkInfo();
                        if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
                            kp6Var.a(oyVar, i3);
                        } else {
                            l85Var.t(new dv3(i3, kp6Var, oyVar));
                        }
                    } catch (b46 unused) {
                        kp6Var.d.N(oyVar, i3 + 1, false);
                    }
                    runnable.run();
                    return;
                } catch (Throwable th) {
                    runnable.run();
                    throw th;
                }
        }
    }

    public /* synthetic */ rv3(byte b, int i, Object obj, Object obj2, Object obj3) {
        this.x = b;
        this.y = obj;
        this.z = obj2;
        this.A = i;
        this.B = obj3;
    }
}
