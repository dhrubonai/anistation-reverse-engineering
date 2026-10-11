package defpackage;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.LinkProperties;
import android.net.Network;
import android.os.Build;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class jp7 {
    public static final zk3 l = new zk3("ConnectivityMonitor", null);
    public final p88 a;
    public final ConnectivityManager c;
    public boolean f;
    public final Context g;
    public final boolean i;
    public final o9 j;
    public final HashSet k;
    public final lk1 b = new lk1(this, (byte) 2);
    public final HashMap d = new HashMap();
    public final ArrayList e = new ArrayList();
    public final Object h = new Object();

    public jp7(Context context, p88 p88Var) {
        boolean z;
        if (Build.VERSION.SDK_INT >= 31) {
            z = true;
        } else {
            z = false;
        }
        this.i = z;
        this.j = new o9(this, (byte) 7);
        this.k = new HashSet();
        this.a = p88Var;
        this.g = context;
        this.c = (ConnectivityManager) context.getSystemService("connectivity");
    }

    public final void a(Network network, LinkProperties linkProperties) {
        synchronized (this.h) {
            try {
                l.b("a new network is available", new Object[0]);
                HashMap hashMap = this.d;
                if (hashMap.containsKey(network)) {
                    this.e.remove(network);
                }
                hashMap.put(network, linkProperties);
                this.e.add(network);
            } catch (Throwable th) {
                throw th;
            }
        }
        b();
    }

    public final void b() {
        p88 p88Var = this.a;
        if (p88Var == null) {
            return;
        }
        HashSet hashSet = this.k;
        synchronized (hashSet) {
            try {
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    if (it.next() == null) {
                        if (!p88Var.x.isShutdown()) {
                            p88Var.execute(new la(this, (byte) 17));
                        }
                    } else {
                        throw new ClassCastException();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
