package defpackage;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class vz7 implements ServiceConnection, o30, p30 {
    public volatile boolean x;
    public volatile xr7 y;
    public final /* synthetic */ zz7 z;

    public vz7(zz7 zz7Var) {
        this.z = zz7Var;
    }

    @Override // defpackage.p30
    public final void a(hw0 hw0Var) {
        zz7 zz7Var = this.z;
        au7 au7Var = ((gu7) zz7Var.x).D;
        gu7.l(au7Var);
        au7Var.Q();
        es7 es7Var = ((gu7) zz7Var.x).C;
        if (es7Var == null || !es7Var.y) {
            es7Var = null;
        }
        if (es7Var != null) {
            es7Var.K.b(hw0Var, "Service connection failed");
        }
        synchronized (this) {
            this.x = false;
            this.y = null;
        }
        au7 au7Var2 = ((gu7) this.z.x).D;
        gu7.l(au7Var2);
        au7Var2.U(new ly7(this, hw0Var, (byte) 3));
    }

    @Override // defpackage.o30
    public final void b(int i) {
        gu7 gu7Var = (gu7) this.z.x;
        au7 au7Var = gu7Var.D;
        gu7.l(au7Var);
        au7Var.Q();
        es7 es7Var = gu7Var.C;
        gu7.l(es7Var);
        es7Var.J.a("Service connection suspended");
        au7 au7Var2 = gu7Var.D;
        gu7.l(au7Var2);
        au7Var2.U(new la((Object) this, (byte) 21));
    }

    @Override // defpackage.o30
    public final void e(Bundle bundle) {
        au7 au7Var = ((gu7) this.z.x).D;
        gu7.l(au7Var);
        au7Var.Q();
        synchronized (this) {
            try {
                a34.x(this.y);
                cr7 cr7Var = (cr7) this.y.m();
                au7 au7Var2 = ((gu7) this.z.x).D;
                gu7.l(au7Var2);
                au7Var2.U(new mz7(this, cr7Var, (byte) 1));
            } catch (DeadObjectException | IllegalStateException unused) {
                this.y = null;
                this.x = false;
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        cr7 uq7Var;
        au7 au7Var = ((gu7) this.z.x).D;
        gu7.l(au7Var);
        au7Var.Q();
        synchronized (this) {
            byte b = 0;
            if (iBinder == null) {
                this.x = false;
                es7 es7Var = ((gu7) this.z.x).C;
                gu7.l(es7Var);
                es7Var.C.a("Service connected with null binder");
                return;
            }
            cr7 cr7Var = null;
            try {
                String interfaceDescriptor = iBinder.getInterfaceDescriptor();
                if ("com.google.android.gms.measurement.internal.IMeasurementService".equals(interfaceDescriptor)) {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.measurement.internal.IMeasurementService");
                    if (queryLocalInterface instanceof cr7) {
                        uq7Var = (cr7) queryLocalInterface;
                    } else {
                        uq7Var = new uq7(iBinder);
                    }
                    cr7Var = uq7Var;
                    es7 es7Var2 = ((gu7) this.z.x).C;
                    gu7.l(es7Var2);
                    es7Var2.K.a("Bound to IMeasurementService interface");
                } else {
                    es7 es7Var3 = ((gu7) this.z.x).C;
                    gu7.l(es7Var3);
                    es7Var3.C.b(interfaceDescriptor, "Got binder with a wrong descriptor");
                }
            } catch (RemoteException unused) {
                es7 es7Var4 = ((gu7) this.z.x).C;
                gu7.l(es7Var4);
                es7Var4.C.a("Service connect failed to get IMeasurementService");
            }
            if (cr7Var == null) {
                this.x = false;
                try {
                    af2 g = af2.g();
                    zz7 zz7Var = this.z;
                    g.u(((gu7) zz7Var.x).x, zz7Var.z);
                } catch (IllegalArgumentException unused2) {
                }
            } else {
                au7 au7Var2 = ((gu7) this.z.x).D;
                gu7.l(au7Var2);
                au7Var2.U(new mz7(this, cr7Var, b));
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        gu7 gu7Var = (gu7) this.z.x;
        au7 au7Var = gu7Var.D;
        gu7.l(au7Var);
        au7Var.Q();
        es7 es7Var = gu7Var.C;
        gu7.l(es7Var);
        es7Var.J.a("Service disconnected");
        au7 au7Var2 = gu7Var.D;
        gu7.l(au7Var2);
        au7Var2.U(new ly7(this, componentName, (byte) 2));
    }
}
