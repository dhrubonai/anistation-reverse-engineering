package r6;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public class i extends z1 {

    /* renamed from: b, reason: collision with root package name */
    public final Map f9476b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ c f9477c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(c cVar, Map map) {
        super(0);
        this.f9477c = cVar;
        map.getClass();
        this.f9476b = map;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final boolean contains(Object obj) {
        return this.f9476b.containsKey(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final boolean isEmpty() {
        return this.f9476b.isEmpty();
    }

    @Override // r6.z1, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        f fVar = (f) iterator();
        while (fVar.hasNext()) {
            fVar.next();
            fVar.remove();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        return this.f9476b.keySet().containsAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final int size() {
        return this.f9476b.size();
    }

    @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (this != obj && !this.f9476b.keySet().equals(obj)) {
            return false;
        }
        return true;
    }

    @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f9476b.keySet().hashCode();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new f(this, this.f9476b.entrySet().iterator());
    }

    @Override // r6.z1, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        int i10;
        Collection collection = (Collection) this.f9476b.remove(obj);
        if (collection != null) {
            i10 = collection.size();
            collection.clear();
            this.f9477c.f9444e -= i10;
        } else {
            i10 = 0;
        }
        if (i10 <= 0) {
            return false;
        }
        return true;
    }
}
