package r6;

import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.SortedSet;

/* loaded from: classes.dex */
public final class y1 extends x1 implements SortedSet {
    public y1(SortedSet sortedSet, q6.h hVar) {
        super(sortedSet, hVar);
    }

    @Override // java.util.SortedSet
    public final Comparator comparator() {
        return ((SortedSet) this.f9569a).comparator();
    }

    @Override // java.util.SortedSet
    public final Object first() {
        Iterator it = this.f9569a.iterator();
        it.getClass();
        q6.h hVar = this.f9570b;
        hVar.getClass();
        while (it.hasNext()) {
            Object next = it.next();
            if (hVar.apply(next)) {
                return next;
            }
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.SortedSet
    public final SortedSet headSet(Object obj) {
        return new y1(((SortedSet) this.f9569a).headSet(obj), this.f9570b);
    }

    @Override // java.util.SortedSet
    public final Object last() {
        SortedSet sortedSet = (SortedSet) this.f9569a;
        while (true) {
            Object last = sortedSet.last();
            if (this.f9570b.apply(last)) {
                return last;
            }
            sortedSet = sortedSet.headSet(last);
        }
    }

    @Override // java.util.SortedSet
    public final SortedSet subSet(Object obj, Object obj2) {
        return new y1(((SortedSet) this.f9569a).subSet(obj, obj2), this.f9570b);
    }

    @Override // java.util.SortedSet
    public final SortedSet tailSet(Object obj) {
        return new y1(((SortedSet) this.f9569a).tailSet(obj), this.f9570b);
    }
}
