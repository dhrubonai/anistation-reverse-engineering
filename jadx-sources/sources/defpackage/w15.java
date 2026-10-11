package defpackage;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class w15 extends cx2 {
    public static final w15 E;
    public final transient nw2 D;

    static {
        z62 z62Var = nw2.y;
        E = new w15(o15.B, w64.y);
    }

    public w15(nw2 nw2Var, Comparator comparator) {
        super(comparator);
        this.D = nw2Var;
    }

    @Override // defpackage.zw2, defpackage.gw2
    public final nw2 b() {
        return this.D;
    }

    @Override // defpackage.gw2
    public final int c(Object[] objArr, int i) {
        return this.D.c(objArr, i);
    }

    @Override // java.util.NavigableSet
    public final Object ceiling(Object obj) {
        int v = v(obj, true);
        nw2 nw2Var = this.D;
        if (v == nw2Var.size()) {
            return null;
        }
        return nw2Var.get(v);
    }

    @Override // defpackage.gw2, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        if (obj != null) {
            try {
                if (Collections.binarySearch(this.D, obj, this.A) >= 0) {
                    return true;
                }
            } catch (ClassCastException unused) {
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        if (collection instanceof xw2) {
            collection = ((u15) ((xw2) collection)).j();
        }
        Comparator comparator = this.A;
        if (yu5.i(comparator, collection) && collection.size() > 1) {
            ho6 it = iterator();
            Iterator it2 = collection.iterator();
            k1 k1Var = (k1) it;
            if (k1Var.hasNext()) {
                Object next = it2.next();
                Object next2 = k1Var.next();
                while (true) {
                    try {
                        int compare = comparator.compare(next2, next);
                        if (compare < 0) {
                            if (k1Var.hasNext()) {
                                next2 = k1Var.next();
                            } else {
                                return false;
                            }
                        } else if (compare == 0) {
                            if (!it2.hasNext()) {
                                return true;
                            }
                            next = it2.next();
                        } else if (compare > 0) {
                            return false;
                        }
                    } catch (ClassCastException | NullPointerException unused) {
                        return false;
                    }
                }
            } else {
                return false;
            }
        } else {
            return super.containsAll(collection);
        }
    }

    @Override // defpackage.gw2
    public final Object[] d() {
        return this.D.d();
    }

    @Override // java.util.NavigableSet
    public final Iterator descendingIterator() {
        return this.D.v().listIterator(0);
    }

    @Override // defpackage.zw2, java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        Object next;
        Object next2;
        if (obj != this) {
            if (obj instanceof Set) {
                Set set = (Set) obj;
                if (this.D.size() == set.size()) {
                    if (!isEmpty()) {
                        Comparator comparator = this.A;
                        if (yu5.i(comparator, set)) {
                            Iterator it = set.iterator();
                            try {
                                ho6 it2 = iterator();
                                do {
                                    k1 k1Var = (k1) it2;
                                    if (k1Var.hasNext()) {
                                        next = k1Var.next();
                                        next2 = it.next();
                                        if (next2 == null) {
                                            return false;
                                        }
                                    } else {
                                        return true;
                                    }
                                } while (comparator.compare(next, next2) == 0);
                                return false;
                            } catch (ClassCastException | NoSuchElementException unused) {
                                return false;
                            }
                        }
                        return containsAll(set);
                    }
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    @Override // defpackage.gw2
    public final int f() {
        return this.D.f();
    }

    @Override // java.util.SortedSet
    public final Object first() {
        if (!isEmpty()) {
            return this.D.get(0);
        }
        qi2.e();
        return null;
    }

    @Override // java.util.NavigableSet
    public final Object floor(Object obj) {
        int u = u(obj, true) - 1;
        if (u == -1) {
            return null;
        }
        return this.D.get(u);
    }

    @Override // defpackage.gw2
    public final int g() {
        return this.D.g();
    }

    @Override // defpackage.gw2
    public final boolean h() {
        return this.D.h();
    }

    @Override // java.util.NavigableSet
    public final Object higher(Object obj) {
        int v = v(obj, false);
        nw2 nw2Var = this.D;
        if (v == nw2Var.size()) {
            return null;
        }
        return nw2Var.get(v);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet
    /* renamed from: i */
    public final ho6 iterator() {
        return this.D.listIterator(0);
    }

    @Override // java.util.SortedSet
    public final Object last() {
        if (!isEmpty()) {
            return this.D.get(r1.size() - 1);
        }
        qi2.e();
        return null;
    }

    @Override // java.util.NavigableSet
    public final Object lower(Object obj) {
        int u = u(obj, false) - 1;
        if (u == -1) {
            return null;
        }
        return this.D.get(u);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.D.size();
    }

    public final w15 t(int i, int i2) {
        nw2 nw2Var = this.D;
        if (i == 0 && i2 == nw2Var.size()) {
            return this;
        }
        Comparator comparator = this.A;
        if (i < i2) {
            return new w15(nw2Var.subList(i, i2), comparator);
        }
        return cx2.r(comparator);
    }

    public final int u(Object obj, boolean z) {
        obj.getClass();
        int binarySearch = Collections.binarySearch(this.D, obj, this.A);
        if (binarySearch >= 0) {
            if (z) {
                return binarySearch + 1;
            }
            return binarySearch;
        }
        return ~binarySearch;
    }

    public final int v(Object obj, boolean z) {
        obj.getClass();
        int binarySearch = Collections.binarySearch(this.D, obj, this.A);
        if (binarySearch >= 0) {
            if (z) {
                return binarySearch;
            }
            return binarySearch + 1;
        }
        return ~binarySearch;
    }
}
