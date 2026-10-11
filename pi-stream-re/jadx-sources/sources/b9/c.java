package b9;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.RejectedExecutionException;
import java.util.logging.Level;
import r6.h0;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final f f1554a;

    /* renamed from: b, reason: collision with root package name */
    public final String f1555b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f1556c;

    /* renamed from: d, reason: collision with root package name */
    public a f1557d;

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f1558e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f1559f;

    public c(f fVar, String str) {
        h0.u(fVar, "taskRunner");
        h0.u(str, "name");
        this.f1554a = fVar;
        this.f1555b = str;
        this.f1558e = new ArrayList();
    }

    public final void a() {
        byte[] bArr = z8.b.f12133a;
        synchronized (this.f1554a) {
            if (b()) {
                this.f1554a.e(this);
            }
        }
    }

    public final boolean b() {
        a aVar = this.f1557d;
        if (aVar != null && aVar.f1549b) {
            this.f1559f = true;
        }
        ArrayList arrayList = this.f1558e;
        boolean z9 = false;
        for (int size = arrayList.size() - 1; -1 < size; size--) {
            if (((a) arrayList.get(size)).f1549b) {
                a aVar2 = (a) arrayList.get(size);
                if (f.f1562h.m().isLoggable(Level.FINE)) {
                    h0.b(aVar2, this, "canceled");
                }
                arrayList.remove(size);
                z9 = true;
            }
        }
        return z9;
    }

    public final void c(a aVar, long j4) {
        h0.u(aVar, "task");
        synchronized (this.f1554a) {
            if (this.f1556c) {
                if (aVar.f1549b) {
                    if (f.f1562h.m().isLoggable(Level.FINE)) {
                        h0.b(aVar, this, "schedule canceled (queue is shutdown)");
                    }
                    return;
                } else {
                    if (f.f1562h.m().isLoggable(Level.FINE)) {
                        h0.b(aVar, this, "schedule failed (queue is shutdown)");
                    }
                    throw new RejectedExecutionException();
                }
            }
            if (d(aVar, j4, false)) {
                this.f1554a.e(this);
            }
        }
    }

    public final boolean d(a aVar, long j4, boolean z9) {
        boolean z10;
        String concat;
        boolean z11;
        h0.u(aVar, "task");
        c cVar = aVar.f1550c;
        if (cVar != this) {
            if (cVar == null) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11) {
                aVar.f1550c = this;
            } else {
                throw new IllegalStateException("task is in multiple queues".toString());
            }
        }
        this.f1554a.f1565a.getClass();
        long nanoTime = System.nanoTime();
        long j10 = nanoTime + j4;
        ArrayList arrayList = this.f1558e;
        int indexOf = arrayList.indexOf(aVar);
        if (indexOf != -1) {
            if (aVar.f1551d <= j10) {
                if (f.f1562h.m().isLoggable(Level.FINE)) {
                    h0.b(aVar, this, "already scheduled");
                }
                return false;
            }
            arrayList.remove(indexOf);
        }
        aVar.f1551d = j10;
        if (f.f1562h.m().isLoggable(Level.FINE)) {
            if (z9) {
                concat = "run again after ".concat(h0.T(j10 - nanoTime));
            } else {
                concat = "scheduled after ".concat(h0.T(j10 - nanoTime));
            }
            h0.b(aVar, this, concat);
        }
        Iterator it = arrayList.iterator();
        int i10 = 0;
        while (true) {
            if (it.hasNext()) {
                if (((a) it.next()).f1551d - nanoTime > j4) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    break;
                }
                i10++;
            } else {
                i10 = -1;
                break;
            }
        }
        if (i10 == -1) {
            i10 = arrayList.size();
        }
        arrayList.add(i10, aVar);
        if (i10 == 0) {
            return true;
        }
        return false;
    }

    public final void e() {
        byte[] bArr = z8.b.f12133a;
        synchronized (this.f1554a) {
            this.f1556c = true;
            if (b()) {
                this.f1554a.e(this);
            }
        }
    }

    public final String toString() {
        return this.f1555b;
    }
}
