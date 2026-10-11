package n3;

import android.os.Bundle;
import androidx.lifecycle.n;
import androidx.lifecycle.o;
import androidx.lifecycle.p;
import androidx.lifecycle.s;
import androidx.lifecycle.u;
import androidx.lifecycle.w;
import java.util.Map;
import r6.h0;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final g f8003a;

    /* renamed from: b, reason: collision with root package name */
    public final e f8004b = new e();

    /* renamed from: c, reason: collision with root package name */
    public boolean f8005c;

    public f(g gVar) {
        this.f8003a = gVar;
    }

    public final void a() {
        boolean z9;
        g gVar = this.f8003a;
        p lifecycle = gVar.getLifecycle();
        if (((w) lifecycle).f1156c == o.INITIALIZED) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (z9) {
            lifecycle.a(new a(gVar));
            final e eVar = this.f8004b;
            eVar.getClass();
            if (!eVar.f7998b) {
                lifecycle.a(new s() { // from class: n3.b
                    @Override // androidx.lifecycle.s
                    public final void onStateChanged(u uVar, n nVar) {
                        e eVar2 = e.this;
                        h0.u(eVar2, "this$0");
                        if (nVar == n.ON_START) {
                            eVar2.f8002f = true;
                        } else if (nVar == n.ON_STOP) {
                            eVar2.f8002f = false;
                        }
                    }
                });
                eVar.f7998b = true;
                this.f8005c = true;
                return;
            }
            throw new IllegalStateException("SavedStateRegistry was already attached.".toString());
        }
        throw new IllegalStateException("Restarter must be created only during owner's initialization stage".toString());
    }

    public final void b(Bundle bundle) {
        boolean z9;
        Bundle bundle2;
        if (!this.f8005c) {
            a();
        }
        w wVar = (w) this.f8003a.getLifecycle();
        if (wVar.f1156c.compareTo(o.STARTED) >= 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (!z9) {
            e eVar = this.f8004b;
            if (eVar.f7998b) {
                if (!eVar.f8000d) {
                    if (bundle != null) {
                        bundle2 = bundle.getBundle("androidx.lifecycle.BundlableSavedStateRegistry.key");
                    } else {
                        bundle2 = null;
                    }
                    eVar.f7999c = bundle2;
                    eVar.f8000d = true;
                    return;
                }
                throw new IllegalStateException("SavedStateRegistry was already restored.".toString());
            }
            throw new IllegalStateException("You must call performAttach() before calling performRestore(Bundle).".toString());
        }
        throw new IllegalStateException(("performRestore cannot be called when owner is " + wVar.f1156c).toString());
    }

    public final void c(Bundle bundle) {
        h0.u(bundle, "outBundle");
        e eVar = this.f8004b;
        eVar.getClass();
        Bundle bundle2 = new Bundle();
        Bundle bundle3 = eVar.f7999c;
        if (bundle3 != null) {
            bundle2.putAll(bundle3);
        }
        l.g gVar = eVar.f7997a;
        gVar.getClass();
        l.d dVar = new l.d(gVar);
        gVar.f6575c.put(dVar, Boolean.FALSE);
        while (dVar.hasNext()) {
            Map.Entry entry = (Map.Entry) dVar.next();
            bundle2.putBundle((String) entry.getKey(), ((d) entry.getValue()).a());
        }
        if (!bundle2.isEmpty()) {
            bundle.putBundle("androidx.lifecycle.BundlableSavedStateRegistry.key", bundle2);
        }
    }
}
