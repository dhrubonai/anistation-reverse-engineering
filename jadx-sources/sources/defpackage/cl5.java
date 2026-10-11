package defpackage;

import java.util.Comparator;
import java.util.Iterator;
import java.util.SortedSet;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class cl5 extends bl5 implements SortedSet {
    @Override // java.util.SortedSet
    public final Comparator comparator() {
        return ((SortedSet) this.x).comparator();
    }

    @Override // java.util.SortedSet
    public final Object first() {
        Iterator it = this.x.iterator();
        it.getClass();
        while (it.hasNext()) {
            Object next = it.next();
            if (this.y.apply(next)) {
                return next;
            }
        }
        qi2.e();
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.SortedSet, bl5] */
    @Override // java.util.SortedSet
    public final SortedSet headSet(Object obj) {
        return new bl5(((SortedSet) this.x).headSet(obj), this.y);
    }

    @Override // java.util.SortedSet
    public final Object last() {
        SortedSet sortedSet = (SortedSet) this.x;
        while (true) {
            Object last = sortedSet.last();
            if (this.y.apply(last)) {
                return last;
            }
            sortedSet = sortedSet.headSet(last);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.SortedSet, bl5] */
    @Override // java.util.SortedSet
    public final SortedSet subSet(Object obj, Object obj2) {
        return new bl5(((SortedSet) this.x).subSet(obj, obj2), this.y);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.SortedSet, bl5] */
    @Override // java.util.SortedSet
    public final SortedSet tailSet(Object obj) {
        return new bl5(((SortedSet) this.x).tailSet(obj), this.y);
    }
}
