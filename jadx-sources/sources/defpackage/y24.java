package defpackage;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.NavigableMap;
import java.util.Set;
import java.util.SortedMap;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class y24 extends t1 {
    public transient x24 D;

    @Override // defpackage.t1, defpackage.j2
    public final Map d() {
        Map map = this.B;
        if (map instanceof NavigableMap) {
            return new z1(this, (NavigableMap) map);
        }
        if (map instanceof SortedMap) {
            return new c2(this, (SortedMap) map);
        }
        return new x1(this, map);
    }

    @Override // defpackage.t1, defpackage.j2
    public final Set f() {
        Map map = this.B;
        if (map instanceof NavigableMap) {
            return new a2(this, (NavigableMap) map);
        }
        if (map instanceof SortedMap) {
            return new d2(this, (SortedMap) map);
        }
        return new y1(this, map);
    }

    @Override // defpackage.t1
    public final Collection m() {
        return (List) this.D.get();
    }
}
