package defpackage;

import java.util.Comparator;
import java.util.SortedMap;
import java.util.SortedSet;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public class c2 extends x1 implements SortedMap {
    public SortedSet B;
    public final /* synthetic */ y24 C;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c2(y24 y24Var, SortedMap sortedMap) {
        super(y24Var, sortedMap);
        this.C = y24Var;
    }

    public SortedSet b() {
        return new d2(this.C, d());
    }

    @Override // defpackage.x1, java.util.AbstractMap, java.util.Map, java.util.SortedMap
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public SortedSet keySet() {
        SortedSet sortedSet = this.B;
        if (sortedSet == null) {
            SortedSet b = b();
            this.B = b;
            return b;
        }
        return sortedSet;
    }

    @Override // java.util.SortedMap
    public final Comparator comparator() {
        return d().comparator();
    }

    public SortedMap d() {
        return (SortedMap) this.z;
    }

    @Override // java.util.SortedMap
    public final Object firstKey() {
        return d().firstKey();
    }

    @Override // java.util.SortedMap
    public SortedMap headMap(Object obj) {
        return new c2(this.C, d().headMap(obj));
    }

    @Override // java.util.SortedMap
    public final Object lastKey() {
        return d().lastKey();
    }

    @Override // java.util.SortedMap
    public SortedMap subMap(Object obj, Object obj2) {
        return new c2(this.C, d().subMap(obj, obj2));
    }

    @Override // java.util.SortedMap
    public SortedMap tailMap(Object obj) {
        return new c2(this.C, d().tailMap(obj));
    }
}
