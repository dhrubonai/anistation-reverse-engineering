package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class e44 implements List, l73 {
    public int A;
    public final /* synthetic */ byte x;
    public final List y;
    public final int z;

    public /* synthetic */ e44(List list, int i, int i2, byte b) {
        this.x = b;
        this.y = list;
        this.z = i;
        this.A = i2;
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        byte b = this.x;
        int i2 = this.z;
        List list = this.y;
        switch (b) {
            case 0:
                list.add(i + i2, obj);
                this.A++;
                return;
            default:
                list.add(i + i2, obj);
                this.A++;
                return;
        }
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        byte b = this.x;
        int i2 = this.z;
        List list = this.y;
        switch (b) {
            case 0:
                collection.getClass();
                list.addAll(i + i2, collection);
                this.A = collection.size() + this.A;
                if (collection.size() <= 0) {
                    return false;
                }
                return true;
            default:
                list.addAll(i + i2, collection);
                int size = collection.size();
                this.A += size;
                if (size <= 0) {
                    return false;
                }
                return true;
        }
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        byte b = this.x;
        List list = this.y;
        int i = this.z;
        switch (b) {
            case 0:
                int i2 = this.A - 1;
                if (i <= i2) {
                    while (true) {
                        list.remove(i2);
                        if (i2 != i) {
                            i2--;
                        }
                    }
                }
                this.A = i;
                return;
            default:
                int i3 = this.A - 1;
                if (i <= i3) {
                    while (true) {
                        list.remove(i3);
                        if (i3 != i) {
                            i3--;
                        }
                    }
                }
                this.A = i;
                return;
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        byte b = this.x;
        List list = this.y;
        int i = this.z;
        switch (b) {
            case 0:
                int i2 = this.A;
                while (i < i2) {
                    if (a34.i(list.get(i), obj)) {
                        return true;
                    }
                    i++;
                }
                return false;
            default:
                int i3 = this.A;
                while (i < i3) {
                    if (a34.i(list.get(i), obj)) {
                        return true;
                    }
                    i++;
                }
                return false;
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        switch (this.x) {
            case 0:
                collection.getClass();
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    if (!contains(it.next())) {
                        return false;
                    }
                }
                return true;
            default:
                Iterator it2 = collection.iterator();
                while (it2.hasNext()) {
                    if (!contains(it2.next())) {
                        return false;
                    }
                }
                return true;
        }
    }

    @Override // java.util.List
    public final Object get(int i) {
        byte b = this.x;
        int i2 = this.z;
        List list = this.y;
        switch (b) {
            case 0:
                ec4.a(i, this);
                return list.get(i + i2);
            default:
                a54.a(i, this);
                return list.get(i + i2);
        }
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        byte b = this.x;
        List list = this.y;
        int i = this.z;
        switch (b) {
            case 0:
                int i2 = this.A;
                for (int i3 = i; i3 < i2; i3++) {
                    if (a34.i(list.get(i3), obj)) {
                        return i3 - i;
                    }
                }
                return -1;
            default:
                int i4 = this.A;
                for (int i5 = i; i5 < i4; i5++) {
                    if (a34.i(list.get(i5), obj)) {
                        return i5 - i;
                    }
                }
                return -1;
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        switch (this.x) {
            case 0:
                if (this.A == this.z) {
                    return true;
                }
                return false;
            default:
                if (this.A == this.z) {
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
        byte b = this.x;
        List list = this.y;
        int i = this.z;
        switch (b) {
            case 0:
                int i2 = this.A - 1;
                if (i > i2) {
                    return -1;
                }
                while (!a34.i(list.get(i2), obj)) {
                    if (i2 == i) {
                        return -1;
                    }
                    i2--;
                }
                return i2 - i;
            default:
                int i3 = this.A - 1;
                if (i > i3) {
                    return -1;
                }
                while (!a34.i(list.get(i3), obj)) {
                    if (i3 == i) {
                        return -1;
                    }
                    i3--;
                }
                return i3 - i;
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

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        byte b = this.x;
        int i = this.z;
        List list = this.y;
        switch (b) {
            case 0:
                int i2 = this.A;
                while (i < i2) {
                    if (a34.i(list.get(i), obj)) {
                        list.remove(i);
                        this.A--;
                        return true;
                    }
                    i++;
                }
                return false;
            default:
                int i3 = this.A;
                while (i < i3) {
                    if (a34.i(list.get(i), obj)) {
                        list.remove(i);
                        this.A--;
                        return true;
                    }
                    i++;
                }
                return false;
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        switch (this.x) {
            case 0:
                collection.getClass();
                int i = this.A;
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    remove(it.next());
                }
                if (i == this.A) {
                    return false;
                }
                return true;
            default:
                int i2 = this.A;
                Iterator it2 = collection.iterator();
                while (it2.hasNext()) {
                    remove(it2.next());
                }
                if (i2 == this.A) {
                    return false;
                }
                return true;
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        byte b = this.x;
        int i = this.z;
        List list = this.y;
        switch (b) {
            case 0:
                collection.getClass();
                int i2 = this.A;
                int i3 = i2 - 1;
                if (i <= i3) {
                    while (true) {
                        if (!collection.contains(list.get(i3))) {
                            list.remove(i3);
                            this.A--;
                        }
                        if (i3 != i) {
                            i3--;
                        }
                    }
                }
                if (i2 == this.A) {
                    return false;
                }
                return true;
            default:
                int i4 = this.A;
                int i5 = i4 - 1;
                if (i <= i5) {
                    while (true) {
                        if (!collection.contains(list.get(i5))) {
                            list.remove(i5);
                            this.A--;
                        }
                        if (i5 != i) {
                            i5--;
                        }
                    }
                }
                if (i4 == this.A) {
                    return false;
                }
                return true;
        }
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        byte b = this.x;
        int i2 = this.z;
        List list = this.y;
        switch (b) {
            case 0:
                ec4.a(i, this);
                return list.set(i + i2, obj);
            default:
                a54.a(i, this);
                return list.set(i + i2, obj);
        }
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        int i;
        int i2;
        switch (this.x) {
            case 0:
                i = this.A;
                i2 = this.z;
                break;
            default:
                i = this.A;
                i2 = this.z;
                break;
        }
        return i - i2;
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
    public final boolean add(Object obj) {
        byte b = this.x;
        List list = this.y;
        switch (b) {
            case 0:
                int i = this.A;
                this.A = i + 1;
                list.add(i, obj);
                return true;
            default:
                int i2 = this.A;
                this.A = i2 + 1;
                list.add(i2, obj);
                return true;
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        byte b = this.x;
        List list = this.y;
        switch (b) {
            case 0:
                collection.getClass();
                list.addAll(this.A, collection);
                this.A = collection.size() + this.A;
                return collection.size() > 0;
            default:
                list.addAll(this.A, collection);
                int size = collection.size();
                this.A += size;
                return size > 0;
        }
    }

    @Override // java.util.List
    public final Object remove(int i) {
        byte b = this.x;
        int i2 = this.z;
        List list = this.y;
        switch (b) {
            case 0:
                ec4.a(i, this);
                this.A--;
                return list.remove(i + i2);
            default:
                a54.a(i, this);
                this.A--;
                return list.remove(i + i2);
        }
    }
}
