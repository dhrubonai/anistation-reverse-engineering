package defpackage;

import android.os.Parcel;
import android.os.RemoteException;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final /* synthetic */ class fm7 implements Runnable {
    public final /* synthetic */ byte x;
    public final /* synthetic */ pm7 y;
    public final /* synthetic */ int z;

    public /* synthetic */ fm7(pm7 pm7Var, int i, byte b) {
        this.x = b;
        this.y = pm7Var;
        this.z = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Iterator it;
        Iterator it2;
        Iterator it3;
        switch (this.x) {
            case 0:
                int i = this.z;
                pm7 pm7Var = this.y;
                sm7 sm7Var = pm7Var.g;
                if (i == 0) {
                    sm7Var.F = (byte) 3;
                    sm7Var.m = true;
                    sm7Var.n = true;
                    synchronized (sm7Var.E) {
                        try {
                            Iterator it4 = sm7Var.E.iterator();
                            while (it4.hasNext()) {
                                ((ya8) it4.next()).a();
                            }
                        } finally {
                        }
                    }
                    return;
                }
                sm7Var.F = (byte) 1;
                synchronized (sm7Var.E) {
                    try {
                        it = sm7Var.E.iterator();
                    } catch (RemoteException e) {
                        gi0.m.a(e, "Unable to call %s on %s.", "onConnectionFailed", xj7.class.getSimpleName());
                    } finally {
                    }
                    while (it.hasNext()) {
                        xj7 xj7Var = ((ya8) it.next()).a.e;
                        if (xj7Var != null) {
                            hw0 hw0Var = new hw0(i, null, null);
                            oj7 oj7Var = (oj7) xj7Var;
                            Parcel K = oj7Var.K();
                            nn7.b(K, hw0Var);
                            oj7Var.M(K, 3);
                        }
                    }
                }
                pm7Var.g.i();
                return;
            case 1:
                sm7 sm7Var2 = this.y.g;
                sm7Var2.F = (byte) 4;
                List list = sm7Var2.E;
                int i2 = this.z;
                synchronized (list) {
                    try {
                        it2 = sm7Var2.E.iterator();
                    } catch (RemoteException e2) {
                        gi0.m.a(e2, "Unable to call %s on %s.", "onConnectionSuspended", xj7.class.getSimpleName());
                    } finally {
                    }
                    while (it2.hasNext()) {
                        xj7 xj7Var2 = ((ya8) it2.next()).a.e;
                        if (xj7Var2 != null) {
                            oj7 oj7Var2 = (oj7) xj7Var2;
                            Parcel K2 = oj7Var2.K();
                            K2.writeInt(i2);
                            oj7Var2.M(K2, 2);
                        }
                    }
                }
                return;
            case 2:
                this.y.g.D.c(this.z);
                return;
            default:
                pm7 pm7Var2 = this.y;
                sm7 sm7Var3 = pm7Var2.g;
                sm7Var3.x = -1;
                sm7Var3.y = -1;
                sm7Var3.t = null;
                sm7Var3.u = null;
                sm7Var3.v = 0.0d;
                sm7Var3.m();
                sm7Var3.w = false;
                sm7Var3.z = null;
                sm7Var3.F = (byte) 1;
                List list2 = sm7Var3.E;
                int i3 = this.z;
                synchronized (list2) {
                    try {
                        it3 = sm7Var3.E.iterator();
                    } catch (RemoteException e3) {
                        gi0.m.a(e3, "Unable to call %s on %s.", "onDisconnected", xj7.class.getSimpleName());
                    } finally {
                    }
                    while (it3.hasNext()) {
                        xj7 xj7Var3 = ((ya8) it3.next()).a.e;
                        if (xj7Var3 != null) {
                            hw0 hw0Var2 = new hw0(i3, null, null);
                            oj7 oj7Var3 = (oj7) xj7Var3;
                            Parcel K3 = oj7Var3.K();
                            nn7.b(K3, hw0Var2);
                            oj7Var3.M(K3, 3);
                        }
                    }
                }
                sm7 sm7Var4 = pm7Var2.g;
                sm7Var4.i();
                sm7Var4.h(sm7Var4.k);
                return;
        }
    }
}
