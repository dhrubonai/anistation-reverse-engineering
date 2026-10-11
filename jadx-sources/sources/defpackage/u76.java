package defpackage;

import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.logging.Logger;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class u76 {
    public static final u76 h = new u76(new sn3(new cq6(h11.k(new StringBuilder(), dq6.g, " TaskRunner"), true)));
    public static final Logger i;
    public final sn3 a;
    public boolean c;
    public long d;
    public int b = UnityAdsConstants.AdOperations.SHOW_TIMEOUT_MS;
    public final ArrayList e = new ArrayList();
    public final ArrayList f = new ArrayList();
    public final la g = new la((Object) this, (byte) 7);

    static {
        Logger logger = Logger.getLogger(u76.class.getName());
        logger.getClass();
        i = logger;
    }

    public u76(sn3 sn3Var) {
        this.a = sn3Var;
    }

    public final void a(m76 m76Var, long j) {
        byte[] bArr = dq6.a;
        t76 t76Var = m76Var.c;
        t76Var.getClass();
        if (t76Var.d == m76Var) {
            boolean z = t76Var.f;
            t76Var.f = false;
            t76Var.d = null;
            this.e.remove(t76Var);
            if (j != -1 && !z && !t76Var.c) {
                t76Var.d(m76Var, j, true);
            }
            if (!t76Var.e.isEmpty()) {
                this.f.add(t76Var);
                return;
            }
            return;
        }
        ze0.m("Check failed.");
    }

    public final m76 b() {
        long j;
        m76 m76Var;
        boolean z;
        byte[] bArr = dq6.a;
        while (true) {
            ArrayList arrayList = this.f;
            if (arrayList.isEmpty()) {
                return null;
            }
            long nanoTime = System.nanoTime();
            int size = arrayList.size();
            long j2 = Long.MAX_VALUE;
            int i2 = 0;
            m76 m76Var2 = null;
            while (true) {
                if (i2 < size) {
                    Object obj = arrayList.get(i2);
                    i2++;
                    m76 m76Var3 = (m76) ((t76) obj).e.get(0);
                    j = nanoTime;
                    m76Var = null;
                    long max = Math.max(0L, m76Var3.d - j);
                    if (max > 0) {
                        j2 = Math.min(max, j2);
                    } else {
                        if (m76Var2 != null) {
                            z = true;
                            break;
                        }
                        m76Var2 = m76Var3;
                    }
                    nanoTime = j;
                } else {
                    j = nanoTime;
                    m76Var = null;
                    z = false;
                    break;
                }
            }
            ArrayList arrayList2 = this.e;
            if (m76Var2 != null) {
                byte[] bArr2 = dq6.a;
                m76Var2.d = -1L;
                t76 t76Var = m76Var2.c;
                t76Var.getClass();
                t76Var.e.remove(m76Var2);
                arrayList.remove(t76Var);
                t76Var.d = m76Var2;
                arrayList2.add(t76Var);
                if (z || (!this.c && !arrayList.isEmpty())) {
                    ((ThreadPoolExecutor) this.a.y).execute(this.g);
                }
                return m76Var2;
            }
            if (this.c) {
                if (j2 < this.d - j) {
                    notify();
                    return m76Var;
                }
                return m76Var;
            }
            this.c = true;
            this.d = j + j2;
            try {
                try {
                    long j3 = j2 / 1000000;
                    long j4 = j2 - (1000000 * j3);
                    if (j3 > 0 || j2 > 0) {
                        wait(j3, (int) j4);
                    }
                } catch (InterruptedException unused) {
                    for (int size2 = arrayList2.size() - 1; -1 < size2; size2--) {
                        ((t76) arrayList2.get(size2)).b();
                    }
                    for (int size3 = arrayList.size() - 1; -1 < size3; size3--) {
                        t76 t76Var2 = (t76) arrayList.get(size3);
                        t76Var2.b();
                        if (t76Var2.e.isEmpty()) {
                            arrayList.remove(size3);
                        }
                    }
                }
            } finally {
                this.c = false;
            }
        }
    }

    public final void c(t76 t76Var) {
        t76Var.getClass();
        byte[] bArr = dq6.a;
        if (t76Var.d == null) {
            boolean isEmpty = t76Var.e.isEmpty();
            ArrayList arrayList = this.f;
            if (!isEmpty) {
                if (!arrayList.contains(t76Var)) {
                    arrayList.add(t76Var);
                }
            } else {
                arrayList.remove(t76Var);
            }
        }
        if (this.c) {
            notify();
        } else {
            ((ThreadPoolExecutor) this.a.y).execute(this.g);
        }
    }

    public final t76 d() {
        int i2;
        synchronized (this) {
            i2 = this.b;
            this.b = i2 + 1;
        }
        return new t76(this, qx1.h(i2, "Q"));
    }

    public final void e(m76 m76Var) {
        byte[] bArr = dq6.a;
        Thread currentThread = Thread.currentThread();
        String name = currentThread.getName();
        currentThread.setName(m76Var.a);
        try {
            long a = m76Var.a();
            synchronized (this) {
                a(m76Var, a);
            }
            currentThread.setName(name);
        } catch (Throwable th) {
            synchronized (this) {
                a(m76Var, -1L);
                currentThread.setName(name);
                throw th;
            }
        }
    }
}
