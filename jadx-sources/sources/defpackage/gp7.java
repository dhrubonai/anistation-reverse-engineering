package defpackage;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class gp7 implements ServiceConnection {
    public final int x;
    public final /* synthetic */ r30 y;

    public gp7(r30 r30Var, int i) {
        this.y = r30Var;
        this.x = i;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        kc7 kc7Var;
        byte b;
        int i;
        r30 r30Var = this.y;
        if (iBinder == null) {
            synchronized (r30Var.h) {
                b = r30Var.o;
            }
            if (b == 3) {
                r30Var.w = true;
                i = 5;
            } else {
                i = 4;
            }
            rl7 rl7Var = r30Var.g;
            rl7Var.sendMessage(rl7Var.obtainMessage(i, r30Var.y.get(), 16));
            return;
        }
        synchronized (r30Var.i) {
            try {
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                if (queryLocalInterface != null && (queryLocalInterface instanceof kc7)) {
                    kc7Var = (kc7) queryLocalInterface;
                } else {
                    kc7Var = new kc7(iBinder);
                }
                r30Var.j = kc7Var;
            } catch (Throwable th) {
                throw th;
            }
        }
        r30 r30Var2 = this.y;
        int i2 = this.x;
        xq7 xq7Var = new xq7(r30Var2, 0, null);
        rl7 rl7Var2 = r30Var2.g;
        rl7Var2.sendMessage(rl7Var2.obtainMessage(7, i2, -1, xq7Var));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        r30 r30Var = this.y;
        synchronized (r30Var.i) {
            r30Var.j = null;
        }
        r30 r30Var2 = this.y;
        int i = this.x;
        rl7 rl7Var = r30Var2.g;
        rl7Var.sendMessage(rl7Var.obtainMessage(6, i, 1));
    }
}
