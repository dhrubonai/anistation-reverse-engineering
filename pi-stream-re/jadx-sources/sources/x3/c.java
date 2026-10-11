package x3;

import java.lang.ref.ReferenceQueue;
import java.util.HashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f11149a;

    /* renamed from: b, reason: collision with root package name */
    public final Executor f11150b;

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f11151c;

    /* renamed from: d, reason: collision with root package name */
    public final ReferenceQueue f11152d;

    /* renamed from: e, reason: collision with root package name */
    public x f11153e;

    public c() {
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor(new a(0));
        this.f11151c = new HashMap();
        this.f11152d = new ReferenceQueue();
        this.f11149a = false;
        this.f11150b = newSingleThreadExecutor;
        newSingleThreadExecutor.execute(new g.f(this, 8));
    }

    public final synchronized void a(v3.i iVar, y yVar) {
        b bVar = (b) this.f11151c.put(iVar, new b(iVar, yVar, this.f11152d, this.f11149a));
        if (bVar != null) {
            bVar.f11148c = null;
            bVar.clear();
        }
    }

    public final void b(b bVar) {
        e0 e0Var;
        synchronized (this) {
            this.f11151c.remove(bVar.f11146a);
            if (bVar.f11147b && (e0Var = bVar.f11148c) != null) {
                ((q) this.f11153e).f(bVar.f11146a, new y(e0Var, true, false, bVar.f11146a, this.f11153e));
            }
        }
    }
}
