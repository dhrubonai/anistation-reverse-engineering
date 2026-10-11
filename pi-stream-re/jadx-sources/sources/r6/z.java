package r6;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
public final class z extends AbstractCollection {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9576a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final Map f9577b;

    public z(a0 a0Var) {
        this.f9577b = a0Var;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        int i10 = this.f9576a;
        Map map = this.f9577b;
        switch (i10) {
            case 0:
                ((a0) map).clear();
                return;
            default:
                map.clear();
                return;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        switch (this.f9576a) {
            case 1:
                return this.f9577b.containsValue(obj);
            default:
                return super.contains(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean isEmpty() {
        switch (this.f9576a) {
            case 1:
                return this.f9577b.isEmpty();
            default:
                return super.isEmpty();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        int i10 = this.f9576a;
        Map map = this.f9577b;
        switch (i10) {
            case 0:
                a0 a0Var = (a0) map;
                Map a10 = a0Var.a();
                if (a10 != null) {
                    return a10.values().iterator();
                }
                return new v(a0Var, 2);
            default:
                return new a1(map.entrySet().iterator());
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean remove(Object obj) {
        switch (this.f9576a) {
            case 1:
                try {
                    return super.remove(obj);
                } catch (UnsupportedOperationException unused) {
                    Map map = this.f9577b;
                    for (Map.Entry entry : map.entrySet()) {
                        if (q6.g.x(obj, entry.getValue())) {
                            map.remove(entry.getKey());
                            return true;
                        }
                    }
                    return false;
                }
            default:
                return super.remove(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean removeAll(Collection collection) {
        switch (this.f9576a) {
            case 1:
                try {
                    collection.getClass();
                    return super.removeAll(collection);
                } catch (UnsupportedOperationException unused) {
                    HashSet hashSet = new HashSet();
                    Map map = this.f9577b;
                    for (Map.Entry entry : map.entrySet()) {
                        if (collection.contains(entry.getValue())) {
                            hashSet.add(entry.getKey());
                        }
                    }
                    return map.keySet().removeAll(hashSet);
                }
            default:
                return super.removeAll(collection);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean retainAll(Collection collection) {
        switch (this.f9576a) {
            case 1:
                try {
                    collection.getClass();
                    return super.retainAll(collection);
                } catch (UnsupportedOperationException unused) {
                    HashSet hashSet = new HashSet();
                    Map map = this.f9577b;
                    for (Map.Entry entry : map.entrySet()) {
                        if (collection.contains(entry.getValue())) {
                            hashSet.add(entry.getKey());
                        }
                    }
                    return map.keySet().retainAll(hashSet);
                }
            default:
                return super.retainAll(collection);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        int i10 = this.f9576a;
        Map map = this.f9577b;
        switch (i10) {
            case 0:
                return ((a0) map).size();
            default:
                return map.size();
        }
    }

    public z(Map map) {
        map.getClass();
        this.f9577b = map;
    }
}
