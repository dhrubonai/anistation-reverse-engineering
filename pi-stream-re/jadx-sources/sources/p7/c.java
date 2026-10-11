package p7;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public final class c extends e1 {

    /* renamed from: y, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f8665y = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "_disposer");
    private volatile Object _disposer;

    /* renamed from: e, reason: collision with root package name */
    public final i f8666e;

    /* renamed from: f, reason: collision with root package name */
    public k0 f8667f;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ e f8668x;

    public c(e eVar, j jVar) {
        this.f8668x = eVar;
        this.f8666e = jVar;
    }

    @Override // h7.l
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        l((Throwable) obj);
        return w6.f.f11019a;
    }

    @Override // p7.e1
    public final void l(Throwable th) {
        i iVar = this.f8666e;
        if (th != null) {
            w4.o e10 = iVar.e(th);
            if (e10 != null) {
                iVar.g(e10);
                d dVar = (d) f8665y.get(this);
                if (dVar != null) {
                    dVar.b();
                    return;
                }
                return;
            }
            return;
        }
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = e.f8673b;
        e eVar = this.f8668x;
        if (atomicIntegerFieldUpdater.decrementAndGet(eVar) == 0) {
            d0[] d0VarArr = eVar.f8674a;
            ArrayList arrayList = new ArrayList(d0VarArr.length);
            for (d0 d0Var : d0VarArr) {
                arrayList.add(d0Var.f());
            }
            iVar.resumeWith(arrayList);
        }
    }
}
