package defpackage;

import java.util.AbstractMap;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class un3 extends AbstractMap {
    public final Map x;
    public final tn3 y;

    public un3(Map map, tn3 tn3Var) {
        map.getClass();
        this.x = map;
        this.y = tn3Var;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        this.x.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        return this.x.containsKey(obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        return new v1(this, (byte) 1);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Map map = this.x;
        Object obj2 = map.get(obj);
        if (obj2 == null && !map.containsKey(obj)) {
            return null;
        }
        return this.y.j(obj, obj2);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        return this.x.keySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        Map map = this.x;
        if (map.containsKey(obj)) {
            return this.y.j(obj, map.remove(obj));
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.x.size();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        return new i2(this);
    }
}
