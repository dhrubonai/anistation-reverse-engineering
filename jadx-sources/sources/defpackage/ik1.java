package defpackage;

import android.content.Context;
import android.net.ConnectivityManager;
import android.os.Handler;
import android.os.HandlerThread;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class ik1 {
    public static final u35 o = new u35(1);
    public final Context a;
    public final fk1 b;
    public final h5 c;
    public int e;
    public int f;
    public boolean g;
    public int k;
    public boolean l;
    public x35 n;
    public byte i = 3;
    public byte j = 5;
    public boolean h = true;
    public List m = Collections.EMPTY_LIST;
    public final CopyOnWriteArraySet d = new CopyOnWriteArraySet();

    public ik1(Context context, x71 x71Var, dn0 dn0Var) {
        this.a = context.getApplicationContext();
        Handler q = eq6.q(new jj1(this, (byte) 1));
        HandlerThread handlerThread = new HandlerThread("ExoPlayer:DownloadManager");
        handlerThread.start();
        fk1 fk1Var = new fk1(handlerThread, x71Var, dn0Var, q, this.i, this.j, this.h);
        this.b = fk1Var;
        h5 h5Var = new h5((Object) this, (byte) 15);
        this.c = h5Var;
        x35 x35Var = new x35(context, h5Var, o);
        this.n = x35Var;
        int b = x35Var.b();
        this.k = b;
        this.e = 1;
        fk1Var.obtainMessage(1, b, 0).sendToTarget();
    }

    public final void a() {
        Iterator it = this.d.iterator();
        while (it.hasNext()) {
            ((gk1) it.next()).e(this, this.l);
        }
    }

    public final void b(x35 x35Var, int i) {
        u35 u35Var = x35Var.c;
        if (this.k != i) {
            this.k = i;
            this.e++;
            this.b.obtainMessage(3, i, 0).sendToTarget();
        }
        boolean e = e();
        Iterator it = this.d.iterator();
        while (it.hasNext()) {
            ((gk1) it.next()).c();
        }
        if (e) {
            a();
        }
    }

    public final void c(boolean z) {
        if (this.h != z) {
            this.h = z;
            this.e++;
            this.b.obtainMessage(2, z ? 1 : 0, 0).sendToTarget();
            boolean e = e();
            Iterator it = this.d.iterator();
            while (it.hasNext()) {
                ((gk1) it.next()).getClass();
            }
            if (e) {
                a();
            }
        }
    }

    public final void d(u35 u35Var) {
        if (u35Var.equals(this.n.c)) {
            return;
        }
        x35 x35Var = this.n;
        Context context = x35Var.a;
        o9 o9Var = x35Var.e;
        o9Var.getClass();
        context.unregisterReceiver(o9Var);
        x35Var.e = null;
        if (x35Var.g != null) {
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
            connectivityManager.getClass();
            w35 w35Var = x35Var.g;
            w35Var.getClass();
            connectivityManager.unregisterNetworkCallback(w35Var);
            x35Var.g = null;
        }
        x35 x35Var2 = new x35(this.a, this.c, u35Var);
        this.n = x35Var2;
        b(this.n, x35Var2.b());
    }

    public final boolean e() {
        boolean z;
        boolean z2 = true;
        if (!this.h && this.k != 0) {
            for (int i = 0; i < this.m.size(); i++) {
                if (((cj1) this.m.get(i)).b == 0) {
                    z = true;
                    break;
                }
            }
        }
        z = false;
        if (this.l == z) {
            z2 = false;
        }
        this.l = z;
        return z2;
    }
}
