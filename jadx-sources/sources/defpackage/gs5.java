package defpackage;

import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class gs5 extends AbstractMap {
    public static final /* synthetic */ int C = 0;
    public volatile es A;
    public Map B;
    public List x;
    public Map y;
    public boolean z;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.AbstractMap, gs5] */
    public static gs5 f() {
        ?? abstractMap = new AbstractMap();
        abstractMap.x = Collections.EMPTY_LIST;
        Map map = Collections.EMPTY_MAP;
        abstractMap.y = map;
        abstractMap.B = map;
        return abstractMap;
    }

    public final int a(Comparable comparable) {
        int i;
        int size = this.x.size();
        int i2 = size - 1;
        if (i2 >= 0) {
            int compareTo = comparable.compareTo(((ms5) this.x.get(i2)).x);
            if (compareTo > 0) {
                i = size + 1;
                return -i;
            }
            if (compareTo == 0) {
                return i2;
            }
        }
        int i3 = 0;
        while (i3 <= i2) {
            int i4 = (i3 + i2) / 2;
            int compareTo2 = comparable.compareTo(((ms5) this.x.get(i4)).x);
            if (compareTo2 < 0) {
                i2 = i4 - 1;
            } else if (compareTo2 > 0) {
                i3 = i4 + 1;
            } else {
                return i4;
            }
        }
        i = i3 + 1;
        return -i;
    }

    public final void b() {
        if (!this.z) {
            return;
        }
        ze0.d();
    }

    public final Map.Entry c(int i) {
        return (Map.Entry) this.x.get(i);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        b();
        if (!this.x.isEmpty()) {
            this.x.clear();
        }
        if (!this.y.isEmpty()) {
            this.y.clear();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        if (a(comparable) < 0 && !this.y.containsKey(comparable)) {
            return false;
        }
        return true;
    }

    public final Set d() {
        Set entrySet;
        if (this.y.isEmpty()) {
            entrySet = Collections.EMPTY_SET;
        } else {
            entrySet = this.y.entrySet();
        }
        return entrySet;
    }

    public final SortedMap e() {
        b();
        if (this.y.isEmpty() && !(this.y instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.y = treeMap;
            this.B = treeMap.descendingMap();
        }
        return (SortedMap) this.y;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        if (this.A == null) {
            this.A = new es(this, (byte) 2);
        }
        return this.A;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof gs5)) {
                return super.equals(obj);
            }
            gs5 gs5Var = (gs5) obj;
            int size = size();
            if (size == gs5Var.size()) {
                int size2 = this.x.size();
                if (size2 != gs5Var.x.size()) {
                    return ((AbstractSet) entrySet()).equals(gs5Var.entrySet());
                }
                for (int i = 0; i < size2; i++) {
                    if (c(i).equals(gs5Var.c(i))) {
                    }
                }
                if (size2 != size) {
                    return this.y.equals(gs5Var.y);
                }
                return true;
            }
            return false;
        }
        return true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public final Object put(Comparable comparable, Object obj) {
        b();
        int a = a(comparable);
        if (a >= 0) {
            return ((ms5) this.x.get(a)).setValue(obj);
        }
        b();
        if (this.x.isEmpty() && !(this.x instanceof ArrayList)) {
            this.x = new ArrayList(16);
        }
        int i = -(a + 1);
        if (i >= 16) {
            return e().put(comparable, obj);
        }
        if (this.x.size() == 16) {
            ms5 ms5Var = (ms5) this.x.remove(15);
            e().put(ms5Var.x, ms5Var.y);
        }
        this.x.add(i, new ms5(this, comparable, obj));
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int a = a(comparable);
        if (a >= 0) {
            return ((ms5) this.x.get(a)).y;
        }
        return this.y.get(comparable);
    }

    public final Object h(int i) {
        b();
        Object obj = ((ms5) this.x.remove(i)).y;
        if (!this.y.isEmpty()) {
            Iterator it = e().entrySet().iterator();
            List list = this.x;
            Map.Entry entry = (Map.Entry) it.next();
            list.add(new ms5(this, (Comparable) entry.getKey(), entry.getValue()));
            it.remove();
        }
        return obj;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int size = this.x.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += ((ms5) this.x.get(i2)).hashCode();
        }
        if (this.y.size() > 0) {
            return this.y.hashCode() + i;
        }
        return i;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        b();
        Comparable comparable = (Comparable) obj;
        int a = a(comparable);
        if (a >= 0) {
            return h(a);
        }
        if (this.y.isEmpty()) {
            return null;
        }
        return this.y.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.y.size() + this.x.size();
    }
}
