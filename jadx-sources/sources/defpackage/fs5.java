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
public final class fs5 extends AbstractMap {
    public static final /* synthetic */ int E = 0;
    public boolean A;
    public volatile es B;
    public Map C;
    public volatile is5 D;
    public final byte x;
    public List y = Collections.EMPTY_LIST;
    public Map z;

    /* JADX WARN: Multi-variable type inference failed */
    public fs5(int i) {
        this.x = i;
        Map map = Collections.EMPTY_MAP;
        this.z = map;
        this.C = map;
    }

    public final int a(Comparable comparable) {
        int i;
        int size = this.y.size();
        int i2 = size - 1;
        if (i2 >= 0) {
            int compareTo = comparable.compareTo(((ls5) this.y.get(i2)).x);
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
            int compareTo2 = comparable.compareTo(((ls5) this.y.get(i4)).x);
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
        if (!this.A) {
            return;
        }
        ze0.d();
    }

    public final Map.Entry c(int i) {
        return (Map.Entry) this.y.get(i);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        b();
        if (!this.y.isEmpty()) {
            this.y.clear();
        }
        if (!this.z.isEmpty()) {
            this.z.clear();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        if (a(comparable) < 0 && !this.z.containsKey(comparable)) {
            return false;
        }
        return true;
    }

    public final Iterable d() {
        if (this.z.isEmpty()) {
            return h41.f;
        }
        return this.z.entrySet();
    }

    public final SortedMap e() {
        b();
        if (this.z.isEmpty() && !(this.z instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.z = treeMap;
            this.C = treeMap.descendingMap();
        }
        return (SortedMap) this.z;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        if (this.B == null) {
            this.B = new es(this, (byte) 1);
        }
        return this.B;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof fs5)) {
                return super.equals(obj);
            }
            fs5 fs5Var = (fs5) obj;
            int size = size();
            if (size == fs5Var.size()) {
                int size2 = this.y.size();
                if (size2 != fs5Var.y.size()) {
                    return ((AbstractSet) entrySet()).equals(fs5Var.entrySet());
                }
                for (int i = 0; i < size2; i++) {
                    if (c(i).equals(fs5Var.c(i))) {
                    }
                }
                if (size2 != size) {
                    return this.z.equals(fs5Var.z);
                }
                return true;
            }
            return false;
        }
        return true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public final Object put(Comparable comparable, Object obj) {
        b();
        int a = a(comparable);
        if (a >= 0) {
            return ((ls5) this.y.get(a)).setValue(obj);
        }
        b();
        boolean isEmpty = this.y.isEmpty();
        byte b = this.x;
        if (isEmpty && !(this.y instanceof ArrayList)) {
            this.y = new ArrayList(b);
        }
        int i = -(a + 1);
        if (i >= b) {
            return e().put(comparable, obj);
        }
        if (this.y.size() == b) {
            ls5 ls5Var = (ls5) this.y.remove(b - 1);
            e().put(ls5Var.x, ls5Var.y);
        }
        this.y.add(i, new ls5(this, comparable, obj));
        return null;
    }

    public final Object g(int i) {
        b();
        Object obj = ((ls5) this.y.remove(i)).y;
        if (!this.z.isEmpty()) {
            Iterator it = e().entrySet().iterator();
            List list = this.y;
            Map.Entry entry = (Map.Entry) it.next();
            list.add(new ls5(this, (Comparable) entry.getKey(), entry.getValue()));
            it.remove();
        }
        return obj;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int a = a(comparable);
        if (a >= 0) {
            return ((ls5) this.y.get(a)).y;
        }
        return this.z.get(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int size = this.y.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += ((ls5) this.y.get(i2)).hashCode();
        }
        if (this.z.size() > 0) {
            return this.z.hashCode() + i;
        }
        return i;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        b();
        Comparable comparable = (Comparable) obj;
        int a = a(comparable);
        if (a >= 0) {
            return g(a);
        }
        if (this.z.isEmpty()) {
            return null;
        }
        return this.z.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.z.size() + this.y.size();
    }
}
