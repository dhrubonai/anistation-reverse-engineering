package defpackage;

import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class bw2 extends eb2 {
    @Override // defpackage.eb2
    public final eb2 C(Iterable iterable) {
        super.C(iterable);
        return this;
    }

    @Override // defpackage.eb2
    public final eb2 D(Map map) {
        C(((rw2) map).entrySet());
        return this;
    }

    @Override // defpackage.eb2
    /* renamed from: G, reason: merged with bridge method [inline-methods] */
    public final n15 g() {
        if (this.y == 0) {
            return n15.F;
        }
        return new n15((Object[]) this.z, this.y);
    }

    public final void I(Object obj, Object obj2) {
        super.y(obj, obj2);
    }

    public final void K(Set set) {
        super.C(set);
    }

    @Override // defpackage.eb2
    public final rw2 f() {
        throw new UnsupportedOperationException("Not supported for bimaps");
    }

    @Override // defpackage.eb2
    public final eb2 y(Object obj, Object obj2) {
        super.y(obj, obj2);
        return this;
    }
}
