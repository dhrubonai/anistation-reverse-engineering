package defpackage;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class c91 extends x97 implements Map {
    public final Map G;

    public c91(Map map) {
        this.G = map;
    }

    @Override // java.util.Map
    public final void clear() {
        this.G.clear();
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        if (obj != null && this.G.containsKey(obj)) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x002e, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0020, code lost:
    
        if (r0.hasNext() == false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002a, code lost:
    
        if (r2.equals(r0.next()) == false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:?, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:?, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:2:0x000d, code lost:
    
        if (r2 == null) goto L4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0013, code lost:
    
        if (r0.hasNext() == false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0019, code lost:
    
        if (r0.next() != null) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x002c, code lost:
    
        return true;
     */
    @Override // java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean containsValue(java.lang.Object r2) {
        /*
            r1 = this;
            java.util.Set r1 = r1.entrySet()
            java.util.Iterator r1 = r1.iterator()
            rn3 r0 = new rn3
            r0.<init>(r1)
            if (r2 != 0) goto L1c
        Lf:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L2e
            java.lang.Object r1 = r0.next()
            if (r1 != 0) goto Lf
            goto L2c
        L1c:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L2e
            java.lang.Object r1 = r0.next()
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L1c
        L2c:
            r1 = 1
            return r1
        L2e:
            r1 = 0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.c91.containsValue(java.lang.Object):boolean");
    }

    @Override // java.util.Map
    public final Set entrySet() {
        return bb4.x(this.G.entrySet(), new dv((byte) 1));
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        if (obj != null && t80.F(obj, this)) {
            return true;
        }
        return false;
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        if (obj == null) {
            return null;
        }
        return (List) this.G.get(obj);
    }

    @Override // java.util.Map
    public final int hashCode() {
        return bb4.G(entrySet());
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        Map map = this.G;
        if (map.isEmpty() || (map.size() == 1 && map.containsKey(null))) {
            return true;
        }
        return false;
    }

    @Override // java.util.Map
    public final Set keySet() {
        return bb4.x(this.G.keySet(), new dv((byte) 2));
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        return this.G.put(obj, obj2);
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        this.G.putAll(map);
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        return this.G.remove(obj);
    }

    @Override // java.util.Map
    public final int size() {
        Map map = this.G;
        return map.size() - (map.containsKey(null) ? 1 : 0);
    }

    @Override // java.util.Map
    public final Collection values() {
        return this.G.values();
    }

    @Override // defpackage.x97
    public final Object w() {
        return this.G;
    }
}
