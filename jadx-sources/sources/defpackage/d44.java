package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class d44 implements List, l73 {
    public final /* synthetic */ byte x;
    public final Object y;

    public /* synthetic */ d44(Object obj, byte b) {
        this.x = b;
        this.y = obj;
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        int i2;
        byte b = this.x;
        Object obj2 = this.y;
        switch (b) {
            case 0:
                f44 f44Var = (f44) obj2;
                if (i >= 0 && i <= (i2 = f44Var.b)) {
                    int i3 = i2 + 1;
                    Object[] objArr = f44Var.a;
                    if (objArr.length < i3) {
                        f44Var.n(objArr, i3);
                    }
                    Object[] objArr2 = f44Var.a;
                    int i4 = f44Var.b;
                    if (i != i4) {
                        ms.x0(i + 1, i, i4, objArr2, objArr2);
                    }
                    objArr2[i] = obj;
                    f44Var.b++;
                    return;
                }
                f44Var.q(i);
                throw null;
            default:
                ((z44) obj2).a(i, obj);
                return;
        }
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        byte b = this.x;
        Object obj = this.y;
        switch (b) {
            case 0:
                collection.getClass();
                f44 f44Var = (f44) obj;
                if (i >= 0 && i <= f44Var.b) {
                    int i2 = 0;
                    if (collection.isEmpty()) {
                        return false;
                    }
                    int size = collection.size() + f44Var.b;
                    Object[] objArr = f44Var.a;
                    if (objArr.length < size) {
                        f44Var.n(objArr, size);
                    }
                    Object[] objArr2 = f44Var.a;
                    if (i != f44Var.b) {
                        ms.x0(collection.size() + i, i, f44Var.b, objArr2, objArr2);
                    }
                    for (Object obj2 : collection) {
                        int i3 = i2 + 1;
                        if (i2 >= 0) {
                            objArr2[i2 + i] = obj2;
                            i2 = i3;
                        } else {
                            te4.R();
                            throw null;
                        }
                    }
                    f44Var.b = collection.size() + f44Var.b;
                    return true;
                }
                f44Var.q(i);
                throw null;
            default:
                return ((z44) obj).f(i, collection);
        }
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        byte b = this.x;
        Object obj = this.y;
        switch (b) {
            case 0:
                ((f44) obj).d();
                return;
            default:
                ((z44) obj).h();
                return;
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        byte b = this.x;
        Object obj2 = this.y;
        switch (b) {
            case 0:
                return ((f44) obj2).e(obj);
            default:
                return ((z44) obj2).i(obj);
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        byte b = this.x;
        Object obj = this.y;
        switch (b) {
            case 0:
                collection.getClass();
                f44 f44Var = (f44) obj;
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    if (!f44Var.e(it.next())) {
                        return false;
                    }
                }
                return true;
            default:
                z44 z44Var = (z44) obj;
                Iterator it2 = collection.iterator();
                while (it2.hasNext()) {
                    if (!z44Var.i(it2.next())) {
                        return false;
                    }
                }
                return true;
        }
    }

    @Override // java.util.List
    public final Object get(int i) {
        byte b = this.x;
        Object obj = this.y;
        switch (b) {
            case 0:
                ec4.a(i, this);
                return ((f44) obj).g(i);
            default:
                a54.a(i, this);
                return ((z44) obj).x[i];
        }
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        byte b = this.x;
        Object obj2 = this.y;
        switch (b) {
            case 0:
                return ((f44) obj2).h(obj);
            default:
                return ((z44) obj2).j(obj);
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        byte b = this.x;
        Object obj = this.y;
        switch (b) {
            case 0:
                return ((f44) obj).i();
            default:
                if (((z44) obj).z == 0) {
                    return true;
                }
                return false;
        }
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        switch (this.x) {
            case 0:
                return new c44(this, 0, (byte) 0);
            default:
                return new c44(this, 0, (byte) 1);
        }
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        int i;
        byte b = this.x;
        Object obj2 = this.y;
        switch (b) {
            case 0:
                f44 f44Var = (f44) obj2;
                Object[] objArr = f44Var.a;
                int i2 = f44Var.b;
                if (obj == null) {
                    i = i2 - 1;
                    while (-1 < i) {
                        if (objArr[i] != null) {
                            i--;
                        }
                    }
                    return -1;
                }
                i = i2 - 1;
                while (-1 < i) {
                    if (!obj.equals(objArr[i])) {
                        i--;
                    }
                }
                return -1;
                return i;
            default:
                z44 z44Var = (z44) obj2;
                Object[] objArr2 = z44Var.x;
                for (int i3 = z44Var.z - 1; i3 >= 0; i3--) {
                    if (a34.i(obj, objArr2[i3])) {
                        return i3;
                    }
                }
                return -1;
        }
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        switch (this.x) {
            case 0:
                return new c44(this, 0, (byte) 0);
            default:
                return new c44(this, 0, (byte) 1);
        }
    }

    @Override // java.util.List
    public final Object remove(int i) {
        byte b = this.x;
        Object obj = this.y;
        switch (b) {
            case 0:
                ec4.a(i, this);
                return ((f44) obj).l(i);
            default:
                a54.a(i, this);
                return ((z44) obj).m(i);
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        byte b = this.x;
        Object obj = this.y;
        switch (b) {
            case 0:
                collection.getClass();
                f44 f44Var = (f44) obj;
                int i = f44Var.b;
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    f44Var.k(it.next());
                }
                if (i != f44Var.b) {
                    return true;
                }
                return false;
            default:
                z44 z44Var = (z44) obj;
                if (!collection.isEmpty()) {
                    int i2 = z44Var.z;
                    Iterator it2 = collection.iterator();
                    while (it2.hasNext()) {
                        z44Var.k(it2.next());
                    }
                    if (i2 != z44Var.z) {
                        return true;
                    }
                }
                return false;
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        byte b = this.x;
        Object obj = this.y;
        switch (b) {
            case 0:
                collection.getClass();
                f44 f44Var = (f44) obj;
                int i = f44Var.b;
                Object[] objArr = f44Var.a;
                for (int i2 = i - 1; -1 < i2; i2--) {
                    if (!collection.contains(objArr[i2])) {
                        f44Var.l(i2);
                    }
                }
                if (i == f44Var.b) {
                    return false;
                }
                return true;
            default:
                z44 z44Var = (z44) obj;
                int i3 = z44Var.z;
                for (int i4 = i3 - 1; -1 < i4; i4--) {
                    if (!collection.contains(z44Var.x[i4])) {
                        z44Var.m(i4);
                    }
                }
                if (i3 == z44Var.z) {
                    return false;
                }
                return true;
        }
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        byte b = this.x;
        Object obj2 = this.y;
        switch (b) {
            case 0:
                ec4.a(i, this);
                return ((f44) obj2).o(i, obj);
            default:
                a54.a(i, this);
                Object[] objArr = ((z44) obj2).x;
                Object obj3 = objArr[i];
                objArr[i] = obj;
                return obj3;
        }
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        byte b = this.x;
        Object obj = this.y;
        switch (b) {
            case 0:
                return ((f44) obj).b;
            default:
                return ((z44) obj).z;
        }
    }

    @Override // java.util.List
    public final List subList(int i, int i2) {
        switch (this.x) {
            case 0:
                ec4.b(this, i, i2);
                return new e44(this, i, i2, (byte) 0);
            default:
                a54.b(this, i, i2);
                return new e44(this, i, i2, (byte) 1);
        }
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        switch (this.x) {
            case 0:
                objArr.getClass();
                return v94.N(this, objArr);
            default:
                return v94.N(this, objArr);
        }
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        switch (this.x) {
            case 0:
                return v94.M(this);
            default:
                return v94.M(this);
        }
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i) {
        switch (this.x) {
            case 0:
                return new c44(this, i, (byte) 0);
            default:
                return new c44(this, i, (byte) 1);
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        byte b = this.x;
        Object obj2 = this.y;
        switch (b) {
            case 0:
                return ((f44) obj2).k(obj);
            default:
                return ((z44) obj2).k(obj);
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(Object obj) {
        byte b = this.x;
        Object obj2 = this.y;
        switch (b) {
            case 0:
                ((f44) obj2).a(obj);
                return true;
            default:
                ((z44) obj2).b(obj);
                return true;
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        byte b = this.x;
        Object obj = this.y;
        switch (b) {
            case 0:
                collection.getClass();
                f44 f44Var = (f44) obj;
                int i = f44Var.b;
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    f44Var.a(it.next());
                }
                return i != f44Var.b;
            default:
                z44 z44Var = (z44) obj;
                return z44Var.f(z44Var.z, collection);
        }
    }
}
