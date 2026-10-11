package i4;

import androidx.lifecycle.e0;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class i implements h, androidx.lifecycle.t {

    /* renamed from: a, reason: collision with root package name */
    public final HashSet f5352a = new HashSet();

    /* renamed from: b, reason: collision with root package name */
    public final androidx.lifecycle.p f5353b;

    public i(androidx.lifecycle.p pVar) {
        this.f5353b = pVar;
        pVar.a(this);
    }

    @Override // i4.h
    public final void c(j jVar) {
        boolean z9;
        this.f5352a.add(jVar);
        androidx.lifecycle.o oVar = ((androidx.lifecycle.w) this.f5353b).f1156c;
        if (oVar == androidx.lifecycle.o.DESTROYED) {
            jVar.k();
            return;
        }
        if (oVar.compareTo(androidx.lifecycle.o.STARTED) >= 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (z9) {
            jVar.j();
        } else {
            jVar.c();
        }
    }

    @Override // i4.h
    public final void e(j jVar) {
        this.f5352a.remove(jVar);
    }

    @e0(androidx.lifecycle.n.ON_DESTROY)
    public void onDestroy(androidx.lifecycle.u uVar) {
        Iterator it = p4.m.d(this.f5352a).iterator();
        while (it.hasNext()) {
            ((j) it.next()).k();
        }
        uVar.getLifecycle().b(this);
    }

    @e0(androidx.lifecycle.n.ON_START)
    public void onStart(androidx.lifecycle.u uVar) {
        Iterator it = p4.m.d(this.f5352a).iterator();
        while (it.hasNext()) {
            ((j) it.next()).j();
        }
    }

    @e0(androidx.lifecycle.n.ON_STOP)
    public void onStop(androidx.lifecycle.u uVar) {
        Iterator it = p4.m.d(this.f5352a).iterator();
        while (it.hasNext()) {
            ((j) it.next()).c();
        }
    }
}
