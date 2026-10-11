package defpackage;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class is implements Collection {
    public final /* synthetic */ js x;

    public is(js jsVar) {
        this.x = jsVar;
    }

    @Override // java.util.Collection
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public final void clear() {
        this.x.clear();
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        if (this.x.a(obj) >= 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return this.x.isEmpty();
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new fs(this.x, (byte) 1);
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        js jsVar = this.x;
        int a = jsVar.a(obj);
        if (a >= 0) {
            jsVar.f(a);
            return true;
        }
        return false;
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection collection) {
        js jsVar = this.x;
        int i = jsVar.z;
        int i2 = 0;
        boolean z = false;
        while (i2 < i) {
            if (collection.contains(jsVar.h(i2))) {
                jsVar.f(i2);
                i2--;
                i--;
                z = true;
            }
            i2++;
        }
        return z;
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection collection) {
        js jsVar = this.x;
        int i = jsVar.z;
        int i2 = 0;
        boolean z = false;
        while (i2 < i) {
            if (!collection.contains(jsVar.h(i2))) {
                jsVar.f(i2);
                i2--;
                i--;
                z = true;
            }
            i2++;
        }
        return z;
    }

    @Override // java.util.Collection
    public final int size() {
        return this.x.z;
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        js jsVar = this.x;
        int i = jsVar.z;
        if (objArr.length < i) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i);
        }
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = jsVar.h(i2);
        }
        if (objArr.length > i) {
            objArr[i] = null;
        }
        return objArr;
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        js jsVar = this.x;
        int i = jsVar.z;
        Object[] objArr = new Object[i];
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = jsVar.h(i2);
        }
        return objArr;
    }
}
