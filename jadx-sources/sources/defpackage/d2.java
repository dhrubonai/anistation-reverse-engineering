package defpackage;

import java.util.Comparator;
import java.util.SortedMap;
import java.util.SortedSet;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public class d2 extends y1 implements SortedSet {
    public final /* synthetic */ y24 A;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d2(y24 y24Var, SortedMap sortedMap) {
        super(y24Var, sortedMap);
        this.A = y24Var;
    }

    public SortedMap b() {
        return (SortedMap) this.y;
    }

    @Override // java.util.SortedSet
    public final Comparator comparator() {
        return b().comparator();
    }

    @Override // java.util.SortedSet
    public final Object first() {
        return b().firstKey();
    }

    public SortedSet headSet(Object obj) {
        return new d2(this.A, b().headMap(obj));
    }

    @Override // java.util.SortedSet
    public final Object last() {
        return b().lastKey();
    }

    public SortedSet subSet(Object obj, Object obj2) {
        return new d2(this.A, b().subMap(obj, obj2));
    }

    public SortedSet tailSet(Object obj) {
        return new d2(this.A, b().tailMap(obj));
    }
}
