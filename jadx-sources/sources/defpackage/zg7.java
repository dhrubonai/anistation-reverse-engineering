package defpackage;

import java.util.AbstractMap;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class zg7 extends AbstractMap {
    public boolean A;
    public volatile es B;
    public Map C;
    public Object[] x;
    public int y;
    public Map z;

    public zg7() {
        Map map = Collections.EMPTY_MAP;
        this.z = map;
        this.C = map;
    }

    public final ah7 a(int i) {
        if (i < this.y) {
            return (ah7) this.x[i];
        }
        throw new ArrayIndexOutOfBoundsException(i);
    }

    public final Set b() {
        Set entrySet;
        if (this.z.isEmpty()) {
            entrySet = Collections.EMPTY_SET;
        } else {
            entrySet = this.z.entrySet();
        }
        return entrySet;
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final Object put(Comparable comparable, Object obj) {
        f();
        int e = e(comparable);
        if (e >= 0) {
            return ((ah7) this.x[e]).setValue(obj);
        }
        f();
        Object[] objArr = this.x;
        if (objArr == null) {
            objArr = new Object[16];
            this.x = objArr;
        }
        int i = -(e + 1);
        if (i >= 16) {
            return g().put(comparable, obj);
        }
        if (this.y == 16) {
            ah7 ah7Var = (ah7) objArr[15];
            this.y = 15;
            g().put(ah7Var.x, ah7Var.y);
        }
        Object[] objArr2 = this.x;
        int length = objArr2.length;
        System.arraycopy(objArr2, i, objArr2, i + 1, 15 - i);
        this.x[i] = new ah7(this, comparable, obj);
        this.y++;
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        f();
        if (this.y != 0) {
            this.x = null;
            this.y = 0;
        }
        if (!this.z.isEmpty()) {
            this.z.clear();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        if (e(comparable) < 0 && !this.z.containsKey(comparable)) {
            return false;
        }
        return true;
    }

    public final Object d(int i) {
        f();
        Object[] objArr = this.x;
        Object obj = ((ah7) objArr[i]).y;
        System.arraycopy(objArr, i + 1, objArr, i, (this.y - i) - 1);
        this.y--;
        if (!this.z.isEmpty()) {
            Iterator it = g().entrySet().iterator();
            Object[] objArr2 = this.x;
            int i2 = this.y;
            Map.Entry entry = (Map.Entry) it.next();
            objArr2[i2] = new ah7(this, (Comparable) entry.getKey(), entry.getValue());
            this.y++;
            it.remove();
        }
        return obj;
    }

    public final int e(Comparable comparable) {
        int i = this.y;
        int i2 = i - 1;
        int i3 = 0;
        if (i2 >= 0) {
            int compareTo = comparable.compareTo(((ah7) this.x[i2]).x);
            if (compareTo > 0) {
                return -(i + 1);
            }
            if (compareTo == 0) {
                return i2;
            }
        }
        while (i3 <= i2) {
            int i4 = (i3 + i2) / 2;
            int compareTo2 = comparable.compareTo(((ah7) this.x[i4]).x);
            if (compareTo2 < 0) {
                i2 = i4 - 1;
            } else if (compareTo2 > 0) {
                i3 = i4 + 1;
            } else {
                return i4;
            }
        }
        return -(i3 + 1);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        if (this.B == null) {
            this.B = new es(this, (byte) 3);
        }
        return this.B;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof zg7)) {
                return super.equals(obj);
            }
            zg7 zg7Var = (zg7) obj;
            int size = size();
            if (size == zg7Var.size()) {
                int i = this.y;
                if (i == zg7Var.y) {
                    for (int i2 = 0; i2 < i; i2++) {
                        if (a(i2).equals(zg7Var.a(i2))) {
                        }
                    }
                    if (i != size) {
                        return this.z.equals(zg7Var.z);
                    }
                    return true;
                }
                return entrySet().equals(zg7Var.entrySet());
            }
            return false;
        }
        return true;
    }

    public final void f() {
        if (!this.A) {
            return;
        }
        ze0.d();
    }

    public final SortedMap g() {
        f();
        if (this.z.isEmpty() && !(this.z instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.z = treeMap;
            this.C = treeMap.descendingMap();
        }
        return (SortedMap) this.z;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int e = e(comparable);
        if (e >= 0) {
            return ((ah7) this.x[e]).y;
        }
        return this.z.get(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int i = this.y;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            i2 += this.x[i3].hashCode();
        }
        if (this.z.size() > 0) {
            return this.z.hashCode() + i2;
        }
        return i2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        f();
        Comparable comparable = (Comparable) obj;
        int e = e(comparable);
        if (e >= 0) {
            return d(e);
        }
        if (this.z.isEmpty()) {
            return null;
        }
        return this.z.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.z.size() + this.y;
    }
}
