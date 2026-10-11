package r6;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public class s extends AbstractCollection {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9529a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t f9530b;

    public s(t tVar, int i10) {
        this.f9529a = i10;
        if (i10 != 1) {
            this.f9530b = tVar;
        } else {
            this.f9530b = tVar;
        }
    }

    public final void b() {
        ((c) this.f9530b).b();
    }

    public final boolean c(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Object key = entry.getKey();
        Object value = entry.getValue();
        Collection collection = (Collection) this.f9530b.a().get(key);
        if (collection == null || !collection.contains(value)) {
            return false;
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        switch (this.f9529a) {
            case 0:
                ((c) this.f9530b).b();
                return;
            default:
                b();
                return;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        switch (this.f9529a) {
            case 0:
                Iterator it = this.f9530b.a().values().iterator();
                while (it.hasNext()) {
                    if (((Collection) it.next()).contains(obj)) {
                        return true;
                    }
                }
                return false;
            default:
                return c(obj);
        }
    }

    public final boolean d(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Object key = entry.getKey();
        Object value = entry.getValue();
        Collection collection = (Collection) this.f9530b.a().get(key);
        if (collection == null || !collection.remove(value)) {
            return false;
        }
        return true;
    }

    public final int e() {
        return ((c) this.f9530b).f9444e;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        int i10 = this.f9529a;
        t tVar = this.f9530b;
        switch (i10) {
            case 0:
                c cVar = (c) tVar;
                cVar.getClass();
                return new d(cVar, 0);
            default:
                c cVar2 = (c) tVar;
                cVar2.getClass();
                return new d(cVar2, 1);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final /* bridge */ /* synthetic */ boolean remove(Object obj) {
        switch (this.f9529a) {
            case 1:
                return d(obj);
            default:
                return super.remove(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        switch (this.f9529a) {
            case 0:
                return ((c) this.f9530b).f9444e;
            default:
                return e();
        }
    }
}
