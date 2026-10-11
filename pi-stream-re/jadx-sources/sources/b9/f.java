package b9;

import a3.g;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.logging.Logger;
import r6.h0;
import y8.j;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: h, reason: collision with root package name */
    public static final j f1562h = new j(16, 0);

    /* renamed from: i, reason: collision with root package name */
    public static final f f1563i;

    /* renamed from: j, reason: collision with root package name */
    public static final Logger f1564j;

    /* renamed from: a, reason: collision with root package name */
    public final d f1565a;

    /* renamed from: c, reason: collision with root package name */
    public boolean f1567c;

    /* renamed from: d, reason: collision with root package name */
    public long f1568d;

    /* renamed from: b, reason: collision with root package name */
    public int f1566b = 10000;

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f1569e = new ArrayList();

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f1570f = new ArrayList();

    /* renamed from: g, reason: collision with root package name */
    public final e f1571g = new e(this);

    static {
        String str = z8.b.f12139g + " TaskRunner";
        h0.u(str, "name");
        f1563i = new f(new d(new z8.a(str, true)));
        Logger logger = Logger.getLogger(f.class.getName());
        h0.s(logger, "getLogger(TaskRunner::class.java.name)");
        f1564j = logger;
    }

    public f(d dVar) {
        this.f1565a = dVar;
    }

    public static final void a(f fVar, a aVar) {
        fVar.getClass();
        byte[] bArr = z8.b.f12133a;
        Thread currentThread = Thread.currentThread();
        String name = currentThread.getName();
        currentThread.setName(aVar.f1548a);
        try {
            long a10 = aVar.a();
            synchronized (fVar) {
                fVar.b(aVar, a10);
            }
            currentThread.setName(name);
        } catch (Throwable th) {
            synchronized (fVar) {
                fVar.b(aVar, -1L);
                currentThread.setName(name);
                throw th;
            }
        }
    }

    public final void b(a aVar, long j4) {
        boolean z9;
        byte[] bArr = z8.b.f12133a;
        c cVar = aVar.f1550c;
        h0.q(cVar);
        if (cVar.f1557d == aVar) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (z9) {
            boolean z10 = cVar.f1559f;
            cVar.f1559f = false;
            cVar.f1557d = null;
            this.f1569e.remove(cVar);
            if (j4 != -1 && !z10 && !cVar.f1556c) {
                cVar.d(aVar, j4, true);
            }
            if (!cVar.f1558e.isEmpty()) {
                this.f1570f.add(cVar);
                return;
            }
            return;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    /* JADX WARN: Finally extract failed */
    public final a c() {
        boolean z9;
        byte[] bArr = z8.b.f12133a;
        while (true) {
            ArrayList arrayList = this.f1570f;
            if (arrayList.isEmpty()) {
                return null;
            }
            d dVar = this.f1565a;
            dVar.getClass();
            long nanoTime = System.nanoTime();
            Iterator it = arrayList.iterator();
            long j4 = Long.MAX_VALUE;
            a aVar = null;
            while (true) {
                if (it.hasNext()) {
                    a aVar2 = (a) ((c) it.next()).f1558e.get(0);
                    long max = Math.max(0L, aVar2.f1551d - nanoTime);
                    if (max > 0) {
                        j4 = Math.min(max, j4);
                    } else {
                        if (aVar != null) {
                            z9 = true;
                            break;
                        }
                        aVar = aVar2;
                    }
                } else {
                    z9 = false;
                    break;
                }
            }
            if (aVar != null) {
                byte[] bArr2 = z8.b.f12133a;
                aVar.f1551d = -1L;
                c cVar = aVar.f1550c;
                h0.q(cVar);
                cVar.f1558e.remove(aVar);
                arrayList.remove(cVar);
                cVar.f1557d = aVar;
                this.f1569e.add(cVar);
                if (z9 || (!this.f1567c && (!arrayList.isEmpty()))) {
                    e eVar = this.f1571g;
                    h0.u(eVar, "runnable");
                    dVar.f1560a.execute(eVar);
                }
                return aVar;
            }
            if (this.f1567c) {
                if (j4 < this.f1568d - nanoTime) {
                    notify();
                }
                return null;
            }
            this.f1567c = true;
            this.f1568d = nanoTime + j4;
            try {
                try {
                    long j10 = j4 / 1000000;
                    Long.signum(j10);
                    long j11 = j4 - (1000000 * j10);
                    if (j10 > 0 || j4 > 0) {
                        wait(j10, (int) j11);
                    }
                } catch (InterruptedException unused) {
                    d();
                }
                this.f1567c = false;
            } catch (Throwable th) {
                this.f1567c = false;
                throw th;
            }
        }
    }

    public final void d() {
        ArrayList arrayList = this.f1569e;
        for (int size = arrayList.size() - 1; -1 < size; size--) {
            ((c) arrayList.get(size)).b();
        }
        ArrayList arrayList2 = this.f1570f;
        for (int size2 = arrayList2.size() - 1; -1 < size2; size2--) {
            c cVar = (c) arrayList2.get(size2);
            cVar.b();
            if (cVar.f1558e.isEmpty()) {
                arrayList2.remove(size2);
            }
        }
    }

    public final void e(c cVar) {
        h0.u(cVar, "taskQueue");
        byte[] bArr = z8.b.f12133a;
        if (cVar.f1557d == null) {
            boolean z9 = !cVar.f1558e.isEmpty();
            ArrayList arrayList = this.f1570f;
            if (z9) {
                h0.u(arrayList, "<this>");
                if (!arrayList.contains(cVar)) {
                    arrayList.add(cVar);
                }
            } else {
                arrayList.remove(cVar);
            }
        }
        boolean z10 = this.f1567c;
        d dVar = this.f1565a;
        if (z10) {
            dVar.getClass();
            notify();
        } else {
            dVar.getClass();
            e eVar = this.f1571g;
            h0.u(eVar, "runnable");
            dVar.f1560a.execute(eVar);
        }
    }

    public final c f() {
        int i10;
        synchronized (this) {
            i10 = this.f1566b;
            this.f1566b = i10 + 1;
        }
        return new c(this, g.n("Q", i10));
    }
}
