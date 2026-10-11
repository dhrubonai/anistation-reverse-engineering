package r6;

import java.util.Comparator;
import java.util.SortedMap;
import java.util.SortedSet;

/* loaded from: classes.dex */
public class n extends i implements SortedSet {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ c f9493d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(c cVar, SortedMap sortedMap) {
        super(cVar, sortedMap);
        this.f9493d = cVar;
    }

    @Override // java.util.SortedSet
    public final Comparator comparator() {
        return e().comparator();
    }

    public SortedMap e() {
        return (SortedMap) this.f9476b;
    }

    @Override // java.util.SortedSet
    public final Object first() {
        return e().firstKey();
    }

    public SortedSet headSet(Object obj) {
        return new n(this.f9493d, e().headMap(obj));
    }

    @Override // java.util.SortedSet
    public final Object last() {
        return e().lastKey();
    }

    public SortedSet subSet(Object obj, Object obj2) {
        return new n(this.f9493d, e().subMap(obj, obj2));
    }

    public SortedSet tailSet(Object obj) {
        return new n(this.f9493d, e().tailMap(obj));
    }
}
