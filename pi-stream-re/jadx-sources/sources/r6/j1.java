package r6;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.NavigableMap;
import java.util.SortedMap;

/* loaded from: classes.dex */
public final class j1 extends c {

    /* renamed from: f, reason: collision with root package name */
    public final transient q6.m f9485f;

    public j1(Map map, h1 h1Var) {
        super(map);
        this.f9485f = h1Var;
    }

    @Override // r6.c
    public final g c() {
        Map map = this.f9443d;
        if (map instanceof NavigableMap) {
            return new j(this, (NavigableMap) map);
        }
        if (map instanceof SortedMap) {
            return new m(this, (SortedMap) map);
        }
        return new g(this, map);
    }

    @Override // r6.c
    public final Collection d() {
        return (List) this.f9485f.get();
    }

    @Override // r6.c
    public final i e() {
        Map map = this.f9443d;
        if (map instanceof NavigableMap) {
            return new k(this, (NavigableMap) map);
        }
        if (map instanceof SortedMap) {
            return new n(this, (SortedMap) map);
        }
        return new i(this, map);
    }
}
