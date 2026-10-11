package defpackage;

import java.util.AbstractMap;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class v1 extends dl5 {
    public final /* synthetic */ byte y;
    public final /* synthetic */ AbstractMap z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v1(AbstractMap abstractMap, byte b) {
        super((byte) 0);
        this.y = b;
        this.z = abstractMap;
    }

    public final boolean b(Object obj) {
        Object obj2;
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Map c = c();
            c.getClass();
            try {
                obj2 = c.get(key);
            } catch (ClassCastException | NullPointerException unused) {
                obj2 = null;
            }
            if (tl7.r(obj2, entry.getValue())) {
                if (obj2 != null || c().containsKey(key)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public final Map c() {
        byte b = this.y;
        AbstractMap abstractMap = this.z;
        switch (b) {
            case 0:
                return (x1) abstractMap;
            default:
                return (un3) abstractMap;
        }
    }

    @Override // defpackage.dl5, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        c().clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        switch (this.y) {
            case 0:
                Set entrySet = ((x1) this.z).z.entrySet();
                entrySet.getClass();
                try {
                    return entrySet.contains(obj);
                } catch (ClassCastException | NullPointerException unused) {
                    return false;
                }
            default:
                return b(obj);
        }
    }

    public final boolean d(Object obj) {
        if (contains(obj) && (obj instanceof Map.Entry)) {
            return c().keySet().remove(((Map.Entry) obj).getKey());
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return c().isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        byte b = this.y;
        AbstractMap abstractMap = this.z;
        switch (b) {
            case 0:
                return new w1((x1) abstractMap);
            default:
                un3 un3Var = (un3) abstractMap;
                return new s33(un3Var.x.entrySet().iterator(), new qn3(un3Var.y, (byte) 0));
        }
    }

    @Override // defpackage.dl5, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        Object obj2;
        switch (this.y) {
            case 0:
                if (!contains(obj)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                Objects.requireNonNull(entry);
                t1 t1Var = ((x1) this.z).A;
                Object key = entry.getKey();
                Map map = t1Var.B;
                map.getClass();
                try {
                    obj2 = map.remove(key);
                } catch (ClassCastException | NullPointerException unused) {
                    obj2 = null;
                }
                Collection collection = (Collection) obj2;
                if (collection != null) {
                    int size = collection.size();
                    collection.clear();
                    t1Var.C -= size;
                }
                return true;
            default:
                return d(obj);
        }
    }

    @Override // defpackage.dl5, java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        try {
            collection.getClass();
            return super.removeAll(collection);
        } catch (UnsupportedOperationException unused) {
            Iterator it = collection.iterator();
            boolean z = false;
            while (it.hasNext()) {
                z |= this.remove(it.next());
            }
            return z;
        }
    }

    @Override // defpackage.dl5, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(Collection collection) {
        try {
            collection.getClass();
            return super.retainAll(collection);
        } catch (UnsupportedOperationException unused) {
            HashSet hashSet = new HashSet(t80.s(collection.size()));
            for (Object obj : collection) {
                if (this.contains(obj) && (obj instanceof Map.Entry)) {
                    hashSet.add(((Map.Entry) obj).getKey());
                }
            }
            return this.c().keySet().retainAll(hashSet);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return c().size();
    }
}
