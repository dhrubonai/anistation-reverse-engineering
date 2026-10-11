package defpackage;

import com.google.protobuf.LazyField;
import com.google.protobuf.MessageLite;
import java.util.Map;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class ub3 implements Map.Entry {
    public Map.Entry x;

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.x.getKey();
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        LazyField lazyField = (LazyField) this.x.getValue();
        if (lazyField == null) {
            return null;
        }
        return lazyField.getValue();
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (obj instanceof MessageLite) {
            return ((LazyField) this.x.getValue()).setValue((MessageLite) obj);
        }
        ze0.k("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
        return null;
    }
}
