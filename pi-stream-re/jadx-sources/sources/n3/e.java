package n3;

import android.os.Bundle;
import f.k;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import r6.h0;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: b, reason: collision with root package name */
    public boolean f7998b;

    /* renamed from: c, reason: collision with root package name */
    public Bundle f7999c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f8000d;

    /* renamed from: e, reason: collision with root package name */
    public k f8001e;

    /* renamed from: a, reason: collision with root package name */
    public final l.g f7997a = new l.g();

    /* renamed from: f, reason: collision with root package name */
    public boolean f8002f = true;

    public final Bundle a(String str) {
        boolean z9;
        if (this.f8000d) {
            Bundle bundle = this.f7999c;
            if (bundle == null) {
                return null;
            }
            Bundle bundle2 = bundle.getBundle(str);
            Bundle bundle3 = this.f7999c;
            if (bundle3 != null) {
                bundle3.remove(str);
            }
            Bundle bundle4 = this.f7999c;
            if (bundle4 != null && !bundle4.isEmpty()) {
                z9 = true;
            } else {
                z9 = false;
            }
            if (!z9) {
                this.f7999c = null;
            }
            return bundle2;
        }
        throw new IllegalStateException("You can consumeRestoredStateForKey only after super.onCreate of corresponding component".toString());
    }

    public final d b() {
        String str;
        d dVar;
        Iterator it = this.f7997a.iterator();
        do {
            l.e eVar = (l.e) it;
            if (eVar.hasNext()) {
                Map.Entry entry = (Map.Entry) eVar.next();
                h0.s(entry, "components");
                str = (String) entry.getKey();
                dVar = (d) entry.getValue();
            } else {
                return null;
            }
        } while (!h0.g(str, "androidx.lifecycle.internal.SavedStateHandlesProvider"));
        return dVar;
    }

    public final void c(String str, d dVar) {
        Object obj;
        h0.u(str, "key");
        h0.u(dVar, "provider");
        l.g gVar = this.f7997a;
        l.c b10 = gVar.b(str);
        boolean z9 = true;
        if (b10 != null) {
            obj = b10.f6565b;
        } else {
            l.c cVar = new l.c(str, dVar);
            gVar.f6576d++;
            l.c cVar2 = gVar.f6574b;
            if (cVar2 == null) {
                gVar.f6573a = cVar;
                gVar.f6574b = cVar;
            } else {
                cVar2.f6566c = cVar;
                cVar.f6567d = cVar2;
                gVar.f6574b = cVar;
            }
            obj = null;
        }
        if (((d) obj) != null) {
            z9 = false;
        }
        if (z9) {
        } else {
            throw new IllegalArgumentException("SavedStateProvider with the given key is already registered".toString());
        }
    }

    public final void d() {
        if (this.f8002f) {
            k kVar = this.f8001e;
            if (kVar == null) {
                kVar = new k(this);
            }
            this.f8001e = kVar;
            try {
                androidx.lifecycle.k.class.getDeclaredConstructor(new Class[0]);
                k kVar2 = this.f8001e;
                if (kVar2 != null) {
                    ((Set) kVar2.f3748b).add(androidx.lifecycle.k.class.getName());
                    return;
                }
                return;
            } catch (NoSuchMethodException e10) {
                throw new IllegalArgumentException("Class " + androidx.lifecycle.k.class.getSimpleName() + " must have default constructor in order to be automatically recreated", e10);
            }
        }
        throw new IllegalStateException("Can not perform this action after onSaveInstanceState".toString());
    }
}
