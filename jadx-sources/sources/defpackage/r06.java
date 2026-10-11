package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class r06 implements List, l73 {
    public int A;
    public final zt5 x;
    public final int y;
    public int z;

    public r06(zt5 zt5Var, int i, int i2) {
        this.x = zt5Var;
        this.y = i;
        this.z = n03.x(zt5Var);
        this.A = i2 - i;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(Object obj) {
        b();
        int i = this.y + this.A;
        zt5 zt5Var = this.x;
        zt5Var.add(i, obj);
        this.A++;
        this.z = n03.x(zt5Var);
        return true;
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        b();
        int i2 = i + this.y;
        zt5 zt5Var = this.x;
        boolean addAll = zt5Var.addAll(i2, collection);
        if (addAll) {
            this.A = collection.size() + this.A;
            this.z = n03.x(zt5Var);
        }
        return addAll;
    }

    public final void b() {
        if (n03.x(this.x) == this.z) {
            return;
        }
        ze0.j();
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        if (this.A > 0) {
            b();
            int i = this.A;
            int i2 = this.y;
            zt5 zt5Var = this.x;
            zt5Var.d(i2, i + i2);
            this.A = 0;
            this.z = n03.x(zt5Var);
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        if (indexOf(obj) >= 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        Collection collection2 = collection;
        if ((collection2 instanceof Collection) && collection2.isEmpty()) {
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

    @Override // java.util.List
    public final Object get(int i) {
        b();
        n03.K(i, this.A);
        return this.x.get(this.y + i);
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        int nextInt;
        b();
        int i = this.A;
        int i2 = this.y;
        Iterator it = db.r0(i2, i + i2).iterator();
        do {
            e13 e13Var = (e13) it;
            if (e13Var.z) {
                nextInt = e13Var.nextInt();
            } else {
                return -1;
            }
        } while (!a34.i(obj, this.x.get(nextInt)));
        return nextInt - i2;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        if (this.A == 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        b();
        int i = this.A;
        int i2 = this.y;
        for (int i3 = (i + i2) - 1; i3 >= i2; i3--) {
            if (a34.i(obj, this.x.get(i3))) {
                return i3 - i2;
            }
        }
        return -1;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, u05] */
    @Override // java.util.List
    public final ListIterator listIterator(int i) {
        b();
        ?? obj = new Object();
        obj.x = i - 1;
        return new r55((u05) obj, this);
    }

    @Override // java.util.List
    public final Object remove(int i) {
        b();
        int i2 = this.y + i;
        zt5 zt5Var = this.x;
        Object remove = zt5Var.remove(i2);
        this.A--;
        this.z = n03.x(zt5Var);
        return remove;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        Iterator it = collection.iterator();
        while (true) {
            boolean z = false;
            while (it.hasNext()) {
                if (remove(it.next()) || z) {
                    z = true;
                }
            }
            return z;
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        int i;
        n2 n2Var;
        ft5 h;
        boolean j;
        b();
        zt5 zt5Var = this.x;
        int i2 = this.y;
        int i3 = this.A + i2;
        int size = zt5Var.size();
        do {
            synchronized (n03.u) {
                vx5 vx5Var = zt5Var.x;
                vx5Var.getClass();
                vx5 vx5Var2 = (vx5) mt5.f(vx5Var);
                i = vx5Var2.d;
                n2Var = vx5Var2.c;
            }
            n2Var.getClass();
            ml4 g = n2Var.g();
            g.subList(i2, i3).retainAll(collection);
            n2 d = g.d();
            if (a34.i(d, n2Var)) {
                break;
            }
            vx5 vx5Var3 = zt5Var.x;
            vx5Var3.getClass();
            synchronized (mt5.c) {
                h = mt5.h();
                j = n03.j((vx5) mt5.w(vx5Var3, zt5Var, h), i, d, true);
            }
            mt5.l(h, zt5Var);
        } while (!j);
        int size2 = size - zt5Var.size();
        if (size2 > 0) {
            this.z = n03.x(this.x);
            this.A -= size2;
        }
        if (size2 > 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        n03.K(i, this.A);
        b();
        int i2 = i + this.y;
        zt5 zt5Var = this.x;
        Object obj2 = zt5Var.set(i2, obj);
        this.z = n03.x(zt5Var);
        return obj2;
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return this.A;
    }

    @Override // java.util.List
    public final List subList(int i, int i2) {
        if (i < 0 || i > i2 || i2 > this.A) {
            ds4.a("fromIndex or toIndex are out of bounds");
        }
        b();
        int i3 = this.y;
        return new r06(this.x, i + i3, i2 + i3);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return v94.M(this);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return v94.N(this, objArr);
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        int indexOf = indexOf(obj);
        if (indexOf < 0) {
            return false;
        }
        remove(indexOf);
        return true;
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        b();
        int i2 = this.y + i;
        zt5 zt5Var = this.x;
        zt5Var.add(i2, obj);
        this.A++;
        this.z = n03.x(zt5Var);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        return addAll(this.A, collection);
    }
}
