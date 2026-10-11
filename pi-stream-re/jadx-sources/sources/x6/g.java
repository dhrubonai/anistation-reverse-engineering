package x6;

import g0.f1;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import p7.a0;
import r6.h0;

/* loaded from: classes.dex */
public final class g implements Collection {

    /* renamed from: a, reason: collision with root package name */
    public final Object[] f11311a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f11312b;

    public g(Object[] objArr, boolean z9) {
        h0.u(objArr, "values");
        this.f11311a = objArr;
        this.f11312b = z9;
    }

    @Override // java.util.Collection
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        int i10;
        Object[] objArr = this.f11311a;
        h0.u(objArr, "<this>");
        if (obj == null) {
            int length = objArr.length;
            i10 = 0;
            while (i10 < length) {
                if (objArr[i10] == null) {
                    break;
                }
                i10++;
            }
            i10 = -1;
        } else {
            int length2 = objArr.length;
            for (int i11 = 0; i11 < length2; i11++) {
                if (h0.g(obj, objArr[i11])) {
                    i10 = i11;
                    break;
                }
            }
            i10 = -1;
        }
        if (i10 < 0) {
            return false;
        }
        return true;
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection collection) {
        h0.u(collection, "elements");
        Collection collection2 = collection;
        if (collection2.isEmpty()) {
            return true;
        }
        Iterator it = collection2.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        if (this.f11311a.length == 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        Object[] objArr = this.f11311a;
        h0.u(objArr, "array");
        return new f1(objArr);
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection
    public final int size() {
        return this.f11311a.length;
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        Object[] objArr = this.f11311a;
        h0.u(objArr, "<this>");
        if (this.f11312b && h0.g(objArr.getClass(), Object[].class)) {
            return objArr;
        }
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length, Object[].class);
        h0.s(copyOf, "copyOf(...)");
        return copyOf;
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        h0.u(objArr, "array");
        return a0.Z(this, objArr);
    }
}
