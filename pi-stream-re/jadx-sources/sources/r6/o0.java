package r6;

import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* loaded from: classes.dex */
public abstract class o0 extends j0 implements List, RandomAccess {

    /* renamed from: b, reason: collision with root package name */
    public static final m0 f9505b = new m0(0, n1.f9497e);

    public static n1 h(int i10, Object[] objArr) {
        if (i10 == 0) {
            return n1.f9497e;
        }
        return new n1(objArr, i10);
    }

    public static l0 i() {
        return new l0();
    }

    public static o0 j(Collection collection) {
        if (collection instanceof j0) {
            o0 b10 = ((j0) collection).b();
            if (b10.g()) {
                Object[] array = b10.toArray();
                return h(array.length, array);
            }
            return b10;
        }
        Object[] array2 = collection.toArray();
        h0.o(array2.length, array2);
        return h(array2.length, array2);
    }

    public static n1 k(Object[] objArr) {
        if (objArr.length == 0) {
            return n1.f9497e;
        }
        Object[] objArr2 = (Object[]) objArr.clone();
        h0.o(objArr2.length, objArr2);
        return h(objArr2.length, objArr2);
    }

    public static n1 m() {
        return n1.f9497e;
    }

    public static n1 n(Long l10, Long l11, Long l12, Long l13, Long l14) {
        Object[] objArr = {l10, l11, l12, l13, l14};
        h0.o(5, objArr);
        return h(5, objArr);
    }

    public static n1 o(Object obj) {
        Object[] objArr = {obj};
        h0.o(1, objArr);
        return h(1, objArr);
    }

    public static n1 p(Object obj, Object obj2) {
        Object[] objArr = {obj, obj2};
        h0.o(2, objArr);
        return h(2, objArr);
    }

    public static n1 q(m1 m1Var, AbstractCollection abstractCollection) {
        m1Var.getClass();
        if (!(abstractCollection instanceof Collection)) {
            Iterator it = abstractCollection.iterator();
            ArrayList arrayList = new ArrayList();
            it.getClass();
            while (it.hasNext()) {
                arrayList.add(it.next());
            }
            abstractCollection = arrayList;
        }
        Object[] array = abstractCollection.toArray();
        h0.o(array.length, array);
        Arrays.sort(array, m1Var);
        return h(array.length, array);
    }

    @Override // java.util.List
    public final void add(int i10, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public final boolean addAll(int i10, Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // r6.j0
    public final o0 b() {
        return this;
    }

    @Override // r6.j0
    public int c(int i10, Object[] objArr) {
        int size = size();
        for (int i11 = 0; i11 < size; i11++) {
            objArr[i10 + i11] = get(i11);
        }
        return i10 + size;
    }

    @Override // r6.j0, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (indexOf(obj) >= 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            List list = (List) obj;
            int size = size();
            if (size == list.size()) {
                if (list instanceof RandomAccess) {
                    for (int i10 = 0; i10 < size; i10++) {
                        if (q6.g.x(get(i10), list.get(i10))) {
                        }
                    }
                    return true;
                }
                Iterator it = iterator();
                Iterator it2 = list.iterator();
                while (it.hasNext()) {
                    if (it2.hasNext() && q6.g.x(it.next(), it2.next())) {
                    }
                }
                return !it2.hasNext();
            }
        }
        return false;
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        int size = size();
        int i10 = 1;
        for (int i11 = 0; i11 < size; i11++) {
            i10 = ~(~(get(i11).hashCode() + (i10 * 31)));
        }
        return i10;
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        int size = size();
        for (int i10 = 0; i10 < size; i10++) {
            if (obj.equals(get(i10))) {
                return i10;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator iterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public final m0 listIterator(int i10) {
        h0.v(i10, size());
        if (isEmpty()) {
            return f9505b;
        }
        return new m0(i10, this);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
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

    @Override // java.util.List
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public o0 subList(int i10, int i11) {
        h0.w(i10, i11, size());
        int i12 = i11 - i10;
        if (i12 == size()) {
            return this;
        }
        if (i12 == 0) {
            return n1.f9497e;
        }
        return new n0(this, i10, i12);
    }

    @Override // java.util.List
    public final Object remove(int i10) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public final Object set(int i10, Object obj) {
        throw new UnsupportedOperationException();
    }

    public ListIterator listIterator() {
        return listIterator(0);
    }
}
