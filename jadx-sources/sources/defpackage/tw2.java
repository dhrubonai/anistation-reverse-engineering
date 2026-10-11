package defpackage;

import java.util.Collection;
import java.util.Map;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class tw2 extends gw2 {
    public final ow2 y;

    public tw2(ow2 ow2Var) {
        this.y = ow2Var;
    }

    @Override // defpackage.gw2, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            Collection collection = (Collection) this.y.a().get(key);
            if (collection != null && collection.contains(value)) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* renamed from: i */
    public final ho6 iterator() {
        return new sw2(this.y);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return this.y.C;
    }
}
