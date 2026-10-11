package defpackage;

import java.util.Iterator;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public abstract class vv6 {
    public final wv6 a = new wv6();

    public final void a(String str, AutoCloseable autoCloseable) {
        AutoCloseable autoCloseable2;
        wv6 wv6Var = this.a;
        if (wv6Var.d) {
            wv6.a(autoCloseable);
            return;
        }
        synchronized (wv6Var.a) {
            autoCloseable2 = (AutoCloseable) wv6Var.b.put(str, autoCloseable);
        }
        wv6.a(autoCloseable2);
    }

    public final void b() {
        wv6 wv6Var = this.a;
        if (!wv6Var.d) {
            wv6Var.d = true;
            synchronized (wv6Var.a) {
                try {
                    Iterator it = wv6Var.b.values().iterator();
                    while (it.hasNext()) {
                        wv6.a((AutoCloseable) it.next());
                    }
                    Iterator it2 = wv6Var.c.iterator();
                    while (it2.hasNext()) {
                        wv6.a((AutoCloseable) it2.next());
                    }
                    wv6Var.c.clear();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        d();
    }

    public final AutoCloseable c(String str) {
        AutoCloseable autoCloseable;
        wv6 wv6Var = this.a;
        synchronized (wv6Var.a) {
            autoCloseable = (AutoCloseable) wv6Var.b.get(str);
        }
        return autoCloseable;
    }

    public void d() {
    }
}
