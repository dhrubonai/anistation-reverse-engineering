package r6;

import java.util.Iterator;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.SortedMap;
import java.util.SortedSet;

/* loaded from: classes.dex */
public final class k extends n implements NavigableSet {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ c f9486e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(c cVar, NavigableMap navigableMap) {
        super(cVar, navigableMap);
        this.f9486e = cVar;
    }

    @Override // java.util.NavigableSet
    public final Object ceiling(Object obj) {
        return e().ceilingKey(obj);
    }

    @Override // java.util.NavigableSet
    public final Iterator descendingIterator() {
        return ((i) descendingSet()).iterator();
    }

    @Override // java.util.NavigableSet
    public final NavigableSet descendingSet() {
        return new k(this.f9486e, e().descendingMap());
    }

    @Override // r6.n
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public final NavigableMap e() {
        return (NavigableMap) ((SortedMap) this.f9476b);
    }

    @Override // java.util.NavigableSet
    public final Object floor(Object obj) {
        return e().floorKey(obj);
    }

    @Override // r6.n, java.util.SortedSet, java.util.NavigableSet
    public final SortedSet headSet(Object obj) {
        return headSet(obj, false);
    }

    @Override // java.util.NavigableSet
    public final Object higher(Object obj) {
        return e().higherKey(obj);
    }

    @Override // java.util.NavigableSet
    public final Object lower(Object obj) {
        return e().lowerKey(obj);
    }

    @Override // java.util.NavigableSet
    public final Object pollFirst() {
        f fVar = (f) iterator();
        if (fVar.hasNext()) {
            Object next = fVar.next();
            fVar.remove();
            return next;
        }
        return null;
    }

    @Override // java.util.NavigableSet
    public final Object pollLast() {
        Iterator descendingIterator = descendingIterator();
        if (descendingIterator.hasNext()) {
            Object next = descendingIterator.next();
            descendingIterator.remove();
            return next;
        }
        return null;
    }

    @Override // r6.n, java.util.SortedSet, java.util.NavigableSet
    public final SortedSet subSet(Object obj, Object obj2) {
        return subSet(obj, true, obj2, false);
    }

    @Override // r6.n, java.util.SortedSet, java.util.NavigableSet
    public final SortedSet tailSet(Object obj) {
        return tailSet(obj, true);
    }

    @Override // java.util.NavigableSet
    public final NavigableSet headSet(Object obj, boolean z9) {
        return new k(this.f9486e, e().headMap(obj, z9));
    }

    @Override // java.util.NavigableSet
    public final NavigableSet subSet(Object obj, boolean z9, Object obj2, boolean z10) {
        return new k(this.f9486e, e().subMap(obj, z9, obj2, z10));
    }

    @Override // java.util.NavigableSet
    public final NavigableSet tailSet(Object obj, boolean z9) {
        return new k(this.f9486e, e().tailMap(obj, z9));
    }
}
