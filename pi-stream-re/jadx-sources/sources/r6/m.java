package r6;

import java.util.Comparator;
import java.util.SortedMap;
import java.util.SortedSet;

/* loaded from: classes.dex */
public class m extends g implements SortedMap {

    /* renamed from: e, reason: collision with root package name */
    public SortedSet f9490e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ c f9491f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(c cVar, SortedMap sortedMap) {
        super(cVar, sortedMap);
        this.f9491f = cVar;
    }

    @Override // java.util.SortedMap
    public final Comparator comparator() {
        return f().comparator();
    }

    public SortedSet d() {
        return new n(this.f9491f, f());
    }

    @Override // r6.g, java.util.AbstractMap, java.util.Map
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public SortedSet keySet() {
        SortedSet sortedSet = this.f9490e;
        if (sortedSet == null) {
            SortedSet d10 = d();
            this.f9490e = d10;
            return d10;
        }
        return sortedSet;
    }

    public SortedMap f() {
        return (SortedMap) this.f9461c;
    }

    @Override // java.util.SortedMap
    public final Object firstKey() {
        return f().firstKey();
    }

    public SortedMap headMap(Object obj) {
        return new m(this.f9491f, f().headMap(obj));
    }

    @Override // java.util.SortedMap
    public final Object lastKey() {
        return f().lastKey();
    }

    public SortedMap subMap(Object obj, Object obj2) {
        return new m(this.f9491f, f().subMap(obj, obj2));
    }

    public SortedMap tailMap(Object obj) {
        return new m(this.f9491f, f().tailMap(obj));
    }
}
