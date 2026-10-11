package defpackage;

import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import java.lang.ref.WeakReference;
import java.util.LinkedHashMap;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class te implements ComponentCallbacks2 {
    public final /* synthetic */ qb0 x;

    public te(qb0 qb0Var) {
        this.x = qb0Var;
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        qb0 qb0Var = this.x;
        synchronized (qb0Var) {
            if (((kz4) ((WeakReference) qb0Var.y).get()) == null) {
                qb0Var.q();
            }
        }
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        onTrimMemory(80);
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        nz4 c;
        long e;
        qb0 qb0Var = this.x;
        synchronized (qb0Var) {
            try {
                kz4 kz4Var = (kz4) ((WeakReference) qb0Var.y).get();
                if (kz4Var != null) {
                    hz4 hz4Var = kz4Var.a;
                    if (i >= 40) {
                        nz4 c2 = kz4Var.c();
                        if (c2 != null) {
                            synchronized (c2.c) {
                                ((g90) c2.a.c).h(-1L);
                                fr0 fr0Var = c2.b;
                                fr0Var.y = 0;
                                ((LinkedHashMap) fr0Var.z).clear();
                            }
                        }
                    } else if (i >= 20) {
                        ((se) qb0Var.z).a(hz4Var.a);
                    } else if (i >= 10 && (c = kz4Var.c()) != null) {
                        synchronized (c.c) {
                            e = ((g90) c.a.c).e();
                        }
                        long j = e / 2;
                        synchronized (c.c) {
                            ((g90) c.a.c).h(j);
                        }
                    }
                } else {
                    qb0Var.q();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
