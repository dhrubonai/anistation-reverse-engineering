package c9;

import java.lang.ref.Reference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;
import r6.h0;

/* loaded from: classes.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final int f2153a;

    /* renamed from: b, reason: collision with root package name */
    public final long f2154b;

    /* renamed from: c, reason: collision with root package name */
    public final b9.c f2155c;

    /* renamed from: d, reason: collision with root package name */
    public final b9.b f2156d;

    /* renamed from: e, reason: collision with root package name */
    public final ConcurrentLinkedQueue f2157e;

    public l(b9.f fVar, TimeUnit timeUnit) {
        h0.u(fVar, "taskRunner");
        h0.u(timeUnit, "timeUnit");
        this.f2153a = 5;
        this.f2154b = timeUnit.toNanos(5L);
        this.f2155c = fVar.f();
        this.f2156d = new b9.b(this, a3.g.t(new StringBuilder(), z8.b.f12139g, " ConnectionPool"));
        this.f2157e = new ConcurrentLinkedQueue();
    }

    public final boolean a(y8.a aVar, i iVar, List list, boolean z9) {
        h0.u(aVar, "address");
        h0.u(iVar, "call");
        Iterator it = this.f2157e.iterator();
        while (true) {
            boolean z10 = false;
            if (!it.hasNext()) {
                return false;
            }
            k kVar = (k) it.next();
            h0.s(kVar, "connection");
            synchronized (kVar) {
                if (z9) {
                    if (kVar.f2143g != null) {
                        z10 = true;
                    }
                    if (!z10) {
                        continue;
                    }
                }
                if (kVar.i(aVar, list)) {
                    iVar.a(kVar);
                    return true;
                }
            }
        }
    }

    public final int b(k kVar, long j4) {
        byte[] bArr = z8.b.f12133a;
        ArrayList arrayList = kVar.f2151p;
        int i10 = 0;
        while (i10 < arrayList.size()) {
            Reference reference = (Reference) arrayList.get(i10);
            if (reference.get() != null) {
                i10++;
            } else {
                String str = "A connection to " + kVar.f2138b.f11730a.f11655i + " was leaked. Did you forget to close a response body?";
                g9.l lVar = g9.l.f4517a;
                g9.l.f4517a.j(((g) reference).f2126a, str);
                arrayList.remove(i10);
                kVar.f2146j = true;
                if (arrayList.isEmpty()) {
                    kVar.f2152q = j4 - this.f2154b;
                    return 0;
                }
            }
        }
        return arrayList.size();
    }
}
