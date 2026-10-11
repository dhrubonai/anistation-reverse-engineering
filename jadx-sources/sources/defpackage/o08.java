package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Build;
import android.os.IBinder;
import android.os.StrictMode;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class o08 implements ServiceConnection {
    public IBinder A;
    public final oz7 B;
    public ComponentName C;
    public final /* synthetic */ o28 D;
    public final HashMap x = new HashMap();
    public byte y = 2;
    public boolean z;

    public o08(o28 o28Var, oz7 oz7Var) {
        this.D = o28Var;
        this.B = oz7Var;
    }

    public final hw0 a(String str, Executor executor) {
        try {
            Intent a = vh7.a(this.D.b, this.B);
            this.y = (byte) 3;
            StrictMode.VmPolicy vmPolicy = StrictMode.getVmPolicy();
            if (Build.VERSION.SDK_INT >= 31) {
                StrictMode.setVmPolicy(kn7.a(new StrictMode.VmPolicy.Builder(vmPolicy)).build());
            }
            try {
                o28 o28Var = this.D;
                af2 af2Var = o28Var.d;
                Context context = o28Var.b;
                oz7 oz7Var = this.B;
                boolean v = af2Var.v(context, str, a, this, 4225, executor);
                this.z = v;
                if (v) {
                    o28Var.c.sendMessageDelayed(o28Var.c.obtainMessage(1, oz7Var), o28Var.f);
                    hw0 hw0Var = hw0.C;
                    StrictMode.setVmPolicy(vmPolicy);
                    return hw0Var;
                }
                this.y = (byte) 2;
                try {
                    o28Var.d.u(o28Var.b, this);
                } catch (IllegalArgumentException unused) {
                }
                hw0 hw0Var2 = new hw0(16, null, null);
                StrictMode.setVmPolicy(vmPolicy);
                return hw0Var2;
            } catch (Throwable th) {
                StrictMode.setVmPolicy(vmPolicy);
                throw th;
            }
        } catch (jg7 e) {
            return e.x;
        }
    }

    @Override // android.content.ServiceConnection
    public final void onBindingDied(ComponentName componentName) {
        onServiceDisconnected(componentName);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        o28 o28Var = this.D;
        synchronized (o28Var.a) {
            try {
                o28Var.c.removeMessages(1, this.B);
                this.A = iBinder;
                this.C = componentName;
                Iterator it = this.x.values().iterator();
                while (it.hasNext()) {
                    ((ServiceConnection) it.next()).onServiceConnected(componentName, iBinder);
                }
                this.y = (byte) 1;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        o28 o28Var = this.D;
        synchronized (o28Var.a) {
            try {
                o28Var.c.removeMessages(1, this.B);
                this.A = null;
                this.C = componentName;
                Iterator it = this.x.values().iterator();
                while (it.hasNext()) {
                    ((ServiceConnection) it.next()).onServiceDisconnected(componentName);
                }
                this.y = (byte) 2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
