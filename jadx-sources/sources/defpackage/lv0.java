package defpackage;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class lv0 implements Map, n73 {
    public final ConcurrentHashMap x = new ConcurrentHashMap(32);

    @Override // java.util.Map
    public final void clear() {
        this.x.clear();
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return this.x.containsKey(obj);
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return this.x.containsValue(obj);
    }

    @Override // java.util.Map
    public final Set entrySet() {
        Set entrySet = this.x.entrySet();
        entrySet.getClass();
        return entrySet;
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        if ((obj instanceof Map) && obj.equals(this.x)) {
            return true;
        }
        return false;
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        return this.x.get(obj);
    }

    @Override // java.util.Map
    public final int hashCode() {
        return this.x.hashCode();
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.x.isEmpty();
    }

    @Override // java.util.Map
    public final Set keySet() {
        Set keySet = this.x.keySet();
        keySet.getClass();
        return keySet;
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        return this.x.put(obj, obj2);
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        map.getClass();
        this.x.putAll(map);
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        return this.x.remove(obj);
    }

    @Override // java.util.Map
    public final int size() {
        return this.x.size();
    }

    public final String toString() {
        return "ConcurrentMapJvm by " + this.x;
    }

    @Override // java.util.Map
    public final Collection values() {
        Collection values = this.x.values();
        values.getClass();
        return values;
    }

    @Override // java.util.Map
    public final boolean remove(Object obj, Object obj2) {
        return this.x.remove(obj, obj2);
    }
}
