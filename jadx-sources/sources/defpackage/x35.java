package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.os.Handler;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class x35 {
    public final Context a;
    public final h5 b;
    public final u35 c;
    public final Handler d = eq6.q(null);
    public o9 e;
    public int f;
    public w35 g;

    public x35(Context context, h5 h5Var, u35 u35Var) {
        this.a = context.getApplicationContext();
        this.b = h5Var;
        this.c = u35Var;
    }

    public final void a() {
        int a = this.c.a(this.a);
        if (this.f != a) {
            this.f = a;
            ((ik1) this.b.y).b(this, a);
        }
    }

    public final int b() {
        u35 u35Var = this.c;
        Context context = this.a;
        this.f = u35Var.a(context);
        IntentFilter intentFilter = new IntentFilter();
        int i = u35Var.x;
        if ((i & 1) != 0) {
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
            connectivityManager.getClass();
            w35 w35Var = new w35(this);
            this.g = w35Var;
            connectivityManager.registerDefaultNetworkCallback(w35Var);
        }
        if ((i & 8) != 0) {
            intentFilter.addAction("android.intent.action.ACTION_POWER_CONNECTED");
            intentFilter.addAction("android.intent.action.ACTION_POWER_DISCONNECTED");
        }
        if ((i & 4) != 0) {
            intentFilter.addAction("android.os.action.DEVICE_IDLE_MODE_CHANGED");
        }
        if ((i & 16) != 0) {
            intentFilter.addAction("android.intent.action.DEVICE_STORAGE_LOW");
            intentFilter.addAction("android.intent.action.DEVICE_STORAGE_OK");
        }
        o9 o9Var = new o9(this, (byte) 6);
        this.e = o9Var;
        context.registerReceiver(o9Var, intentFilter, null, this.d);
        return this.f;
    }
}
