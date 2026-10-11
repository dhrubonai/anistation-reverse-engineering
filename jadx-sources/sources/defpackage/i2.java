package defpackage;

import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public class i2 extends AbstractCollection {
    public final /* synthetic */ byte x;
    public final Object y;

    public i2(AbstractMap abstractMap) {
        this.x = (byte) 3;
        this.y = abstractMap;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        byte b = this.x;
        Object obj = this.y;
        switch (b) {
            case 0:
                ((j2) obj).b();
                return;
            case 1:
                ((t1) obj).b();
                return;
            case 2:
                ((sq0) obj).clear();
                return;
            default:
                ((AbstractMap) obj).clear();
                return;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean contains(Object obj) {
        byte b = this.x;
        Object obj2 = this.y;
        switch (b) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                Object value = entry.getValue();
                Collection collection = (Collection) ((j2) obj2).a().get(key);
                if (collection == null || !collection.contains(value)) {
                    return false;
                }
                return true;
            case 1:
                return ((t1) obj2).c(obj);
            case 2:
            default:
                return super.contains(obj);
            case 3:
                return ((AbstractMap) obj2).containsValue(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean isEmpty() {
        switch (this.x) {
            case 3:
                return ((AbstractMap) this.y).isEmpty();
            default:
                return super.isEmpty();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        byte b = this.x;
        Object obj = this.y;
        switch (b) {
            case 0:
                return ((j2) obj).h();
            case 1:
                return new u1((t1) obj, (byte) 0);
            case 2:
                sq0 sq0Var = (sq0) obj;
                Map c = sq0Var.c();
                if (c != null) {
                    return c.values().iterator();
                }
                return new pq0(sq0Var, (byte) 2);
            default:
                return new ci6(((AbstractMap) obj).entrySet().iterator());
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean remove(Object obj) {
        byte b = this.x;
        Object obj2 = this.y;
        switch (b) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                return ((j2) obj2).k(entry.getKey(), entry.getValue());
            case 3:
                AbstractMap abstractMap = (AbstractMap) obj2;
                try {
                    return super.remove(obj);
                } catch (UnsupportedOperationException unused) {
                    for (Map.Entry entry2 : abstractMap.entrySet()) {
                        if (tl7.r(obj, entry2.getValue())) {
                            abstractMap.remove(entry2.getKey());
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
    public boolean removeAll(Collection collection) {
        switch (this.x) {
            case 3:
                AbstractMap abstractMap = (AbstractMap) this.y;
                try {
                    collection.getClass();
                    return super.removeAll(collection);
                } catch (UnsupportedOperationException unused) {
                    HashSet hashSet = new HashSet();
                    for (Map.Entry entry : abstractMap.entrySet()) {
                        if (collection.contains(entry.getValue())) {
                            hashSet.add(entry.getKey());
                        }
                    }
                    return abstractMap.keySet().removeAll(hashSet);
                }
            default:
                return super.removeAll(collection);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean retainAll(Collection collection) {
        switch (this.x) {
            case 3:
                AbstractMap abstractMap = (AbstractMap) this.y;
                try {
                    collection.getClass();
                    return super.retainAll(collection);
                } catch (UnsupportedOperationException unused) {
                    HashSet hashSet = new HashSet();
                    for (Map.Entry entry : abstractMap.entrySet()) {
                        if (collection.contains(entry.getValue())) {
                            hashSet.add(entry.getKey());
                        }
                    }
                    return abstractMap.keySet().retainAll(hashSet);
                }
            default:
                return super.retainAll(collection);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        byte b = this.x;
        Object obj = this.y;
        switch (b) {
            case 0:
                return ((j2) obj).l();
            case 1:
                return ((t1) obj).C;
            case 2:
                return ((sq0) obj).size();
            default:
                return ((AbstractMap) obj).size();
        }
    }

    public /* synthetic */ i2(Object obj, byte b) {
        this.x = b;
        this.y = obj;
    }
}
