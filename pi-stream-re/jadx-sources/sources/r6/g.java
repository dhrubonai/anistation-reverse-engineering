package r6;

import java.util.AbstractMap;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.RandomAccess;
import java.util.Set;

/* loaded from: classes.dex */
public class g extends AbstractMap {

    /* renamed from: a, reason: collision with root package name */
    public transient e f9459a;

    /* renamed from: b, reason: collision with root package name */
    public transient z f9460b;

    /* renamed from: c, reason: collision with root package name */
    public final transient Map f9461c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ c f9462d;

    public g(c cVar, Map map) {
        this.f9462d = cVar;
        this.f9461c = map;
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Set entrySet() {
        e eVar = this.f9459a;
        if (eVar == null) {
            e eVar2 = new e(this);
            this.f9459a = eVar2;
            return eVar2;
        }
        return eVar;
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Collection values() {
        z zVar = this.f9460b;
        if (zVar == null) {
            z zVar2 = new z(this);
            this.f9460b = zVar2;
            return zVar2;
        }
        return zVar;
    }

    public final k0 c(Map.Entry entry) {
        Object qVar;
        Object key = entry.getKey();
        Collection collection = (Collection) entry.getValue();
        c cVar = this.f9462d;
        cVar.getClass();
        List list = (List) collection;
        if (list instanceof RandomAccess) {
            qVar = new l(cVar, key, list, null);
        } else {
            qVar = new q(cVar, key, list, null);
        }
        return new k0(key, qVar);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        c cVar = this.f9462d;
        if (this.f9461c == cVar.f9443d) {
            cVar.b();
            return;
        }
        f fVar = new f(this);
        while (fVar.hasNext()) {
            fVar.next();
            fVar.remove();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Map map = this.f9461c;
        map.getClass();
        try {
            return map.containsKey(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (this != obj && !this.f9461c.equals(obj)) {
            return false;
        }
        return true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Object obj2;
        Object qVar;
        Map map = this.f9461c;
        map.getClass();
        try {
            obj2 = map.get(obj);
        } catch (ClassCastException | NullPointerException unused) {
            obj2 = null;
        }
        Collection collection = (Collection) obj2;
        if (collection == null) {
            return null;
        }
        c cVar = this.f9462d;
        cVar.getClass();
        List list = (List) collection;
        if (list instanceof RandomAccess) {
            qVar = new l(cVar, obj, list, null);
        } else {
            qVar = new q(cVar, obj, list, null);
        }
        return qVar;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        return this.f9461c.hashCode();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set keySet() {
        c cVar = this.f9462d;
        Set set = cVar.f9535a;
        if (set == null) {
            i e10 = cVar.e();
            cVar.f9535a = e10;
            return e10;
        }
        return set;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        Collection collection = (Collection) this.f9461c.remove(obj);
        if (collection == null) {
            return null;
        }
        c cVar = this.f9462d;
        Collection d10 = cVar.d();
        d10.addAll(collection);
        cVar.f9444e -= collection.size();
        collection.clear();
        return d10;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f9461c.size();
    }

    @Override // java.util.AbstractMap
    public final String toString() {
        return this.f9461c.toString();
    }
}
