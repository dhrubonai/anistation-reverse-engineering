package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public abstract class nw2 extends gw2 implements List, RandomAccess {
    public static final z62 y = new z62(o15.B, 0);

    public static o15 j(Object[] objArr, int i) {
        if (i == 0) {
            return o15.B;
        }
        return new o15(objArr, i);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [ew2, jw2] */
    public static jw2 k() {
        return new ew2(4);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [ew2, jw2] */
    public static jw2 m(int i) {
        io3.t(i, "expectedSize");
        return new ew2(i);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [ew2, jw2] */
    public static nw2 n(Iterable iterable) {
        if (iterable instanceof Collection) {
            return o((Collection) iterable);
        }
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            return o15.B;
        }
        Object next = it.next();
        if (!it.hasNext()) {
            return s(next);
        }
        ?? ew2Var = new ew2(4);
        ew2Var.c(next);
        while (it.hasNext()) {
            ew2Var.c(it.next());
        }
        return ew2Var.g();
    }

    public static nw2 o(Collection collection) {
        if (collection instanceof gw2) {
            nw2 b = ((gw2) collection).b();
            if (b.h()) {
                Object[] array = b.toArray(gw2.x);
                return j(array, array.length);
            }
            return b;
        }
        Object[] array2 = collection.toArray();
        jf7.p(array2, array2.length);
        return j(array2, array2.length);
    }

    public static o15 p(Object[] objArr) {
        if (objArr.length == 0) {
            return o15.B;
        }
        Object[] objArr2 = (Object[]) objArr.clone();
        jf7.p(objArr2, objArr2.length);
        return j(objArr2, objArr2.length);
    }

    public static o15 r(Long l, Long l2, Long l3, Long l4, Long l5) {
        Object[] objArr = {l, l2, l3, l4, l5};
        jf7.p(objArr, 5);
        return j(objArr, 5);
    }

    public static o15 s(Object obj) {
        Object[] objArr = {obj};
        jf7.p(objArr, 1);
        return j(objArr, 1);
    }

    public static o15 t(Object obj, Object obj2) {
        Object[] objArr = {obj, obj2};
        jf7.p(objArr, 2);
        return j(objArr, 2);
    }

    public static o15 u(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, Object... objArr) {
        boolean z;
        if (objArr.length <= 2147483635) {
            z = true;
        } else {
            z = false;
        }
        io3.m("the total number of elements must fit in an int", z);
        int length = objArr.length + 12;
        Object[] objArr2 = new Object[length];
        objArr2[0] = obj;
        objArr2[1] = obj2;
        objArr2[2] = obj3;
        objArr2[3] = obj4;
        objArr2[4] = obj5;
        objArr2[5] = obj6;
        objArr2[6] = obj7;
        objArr2[7] = obj8;
        objArr2[8] = obj9;
        objArr2[9] = obj10;
        objArr2[10] = obj11;
        objArr2[11] = obj12;
        System.arraycopy(objArr, 0, objArr2, 12, objArr.length);
        jf7.p(objArr2, length);
        return j(objArr2, length);
    }

    public static o15 w(Iterable iterable, Comparator comparator) {
        Collection collection;
        comparator.getClass();
        if (iterable instanceof Collection) {
            collection = (Collection) iterable;
        } else {
            Iterator it = iterable.iterator();
            ArrayList arrayList = new ArrayList();
            it.getClass();
            while (it.hasNext()) {
                arrayList.add(it.next());
            }
            collection = arrayList;
        }
        Object[] array = collection.toArray();
        jf7.p(array, array.length);
        Arrays.sort(array, comparator);
        return j(array, array.length);
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.gw2
    public int c(Object[] objArr, int i) {
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            objArr[i + i2] = get(i2);
        }
        return i + size;
    }

    @Override // defpackage.gw2, java.util.AbstractCollection, java.util.Collection
    public boolean contains(Object obj) {
        if (indexOf(obj) >= 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof List) {
                List list = (List) obj;
                int size = size();
                if (size == list.size()) {
                    if (list instanceof RandomAccess) {
                        for (int i = 0; i < size; i++) {
                            if (tl7.r(get(i), list.get(i))) {
                            }
                        }
                    } else {
                        Iterator it = iterator();
                        Iterator it2 = list.iterator();
                        while (it.hasNext()) {
                            if (it2.hasNext() && tl7.r(it.next(), it2.next())) {
                            }
                        }
                        return !it2.hasNext();
                    }
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        int size = size();
        int i = 1;
        for (int i2 = 0; i2 < size; i2++) {
            i = ~(~(get(i2).hashCode() + (i * 31)));
        }
        return i;
    }

    @Override // defpackage.gw2
    public final ho6 i() {
        return listIterator(0);
    }

    public int indexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        int size = size();
        for (int i = 0; i < size; i++) {
            if (obj.equals(get(i))) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator iterator() {
        return listIterator(0);
    }

    public int lastIndexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        for (int size = size() - 1; size >= 0; size--) {
            if (obj.equals(get(size))) {
                return size;
            }
        }
        return -1;
    }

    public ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public final z62 listIterator(int i) {
        io3.x(i, size());
        if (isEmpty()) {
            return y;
        }
        return new z62(this, i);
    }

    @Override // java.util.List
    public final Object remove(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        throw new UnsupportedOperationException();
    }

    public nw2 v() {
        if (size() <= 1) {
            return this;
        }
        return new kw2(this);
    }

    @Override // java.util.List
    /* renamed from: x, reason: merged with bridge method [inline-methods] */
    public nw2 subList(int i, int i2) {
        io3.y(i, i2, size());
        int i3 = i2 - i;
        if (i3 == size()) {
            return this;
        }
        if (i3 == 0) {
            return o15.B;
        }
        return new lw2(this, i, i3);
    }

    @Override // defpackage.gw2
    public final nw2 b() {
        return this;
    }
}
