package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.function.Predicate;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class y06 implements Collection, j73 {
    public final /* synthetic */ byte x;
    public final Object y;

    public y06() {
        this.x = (byte) 0;
        this.y = pg4.a();
    }

    @Override // java.util.Collection
    public final boolean add(Object obj) {
        switch (this.x) {
            case 0:
                return ((g44) this.y).a(obj);
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection collection) {
        switch (this.x) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.Collection
    public final void clear() {
        switch (this.x) {
            case 0:
                ((g44) this.y).b();
                return;
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        byte b = this.x;
        Object obj2 = this.y;
        switch (b) {
            case 0:
                return ((g44) obj2).c(obj);
            default:
                return ((p44) obj2).d(obj);
        }
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection collection) {
        byte b = this.x;
        Object obj = this.y;
        switch (b) {
            case 0:
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    if (!((g44) obj).c(it.next())) {
                        return false;
                    }
                }
                return true;
            default:
                collection.getClass();
                Collection collection2 = collection;
                if (!collection2.isEmpty()) {
                    Iterator it2 = collection2.iterator();
                    while (it2.hasNext()) {
                        if (!((p44) obj).d(it2.next())) {
                            return false;
                        }
                    }
                }
                return true;
        }
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        byte b = this.x;
        Object obj = this.y;
        switch (b) {
            case 0:
                if (((g44) obj).g == 0) {
                    return true;
                }
                return false;
            default:
                return ((p44) obj).i();
        }
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        switch (this.x) {
            case 0:
                return new xd2(new i44((g44) this.y));
            default:
                return io3.V(new mv1(this, null, (byte) 3));
        }
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        switch (this.x) {
            case 0:
                return ((g44) this.y).h(obj);
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection collection) {
        switch (this.x) {
            case 0:
                return ((g44) this.y).h(collection);
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.Collection
    public final boolean removeIf(Predicate predicate) {
        switch (this.x) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection collection) {
        switch (this.x) {
            case 0:
                return ((g44) this.y).j(collection);
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.Collection
    public final int size() {
        byte b = this.x;
        Object obj = this.y;
        switch (b) {
            case 0:
                return ((g44) obj).g;
            default:
                return ((p44) obj).e;
        }
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        switch (this.x) {
            case 0:
                return v94.N(this, objArr);
            default:
                objArr.getClass();
                return v94.N(this, objArr);
        }
    }

    public y06(p44 p44Var) {
        this.x = (byte) 1;
        this.y = p44Var;
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        switch (this.x) {
            case 0:
                return v94.M(this);
            default:
                return v94.M(this);
        }
    }
}
