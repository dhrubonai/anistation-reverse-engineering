package r6;

import java.util.Map;

/* loaded from: classes.dex */
public abstract class r implements Map.Entry {
    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        if (!q6.g.x(getKey(), entry.getKey()) || !q6.g.x(getValue(), entry.getValue())) {
            return false;
        }
        return true;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        int hashCode;
        Object key = getKey();
        Object value = getValue();
        int i10 = 0;
        if (key == null) {
            hashCode = 0;
        } else {
            hashCode = key.hashCode();
        }
        if (value != null) {
            i10 = value.hashCode();
        }
        return hashCode ^ i10;
    }

    public final String toString() {
        return getKey() + "=" + getValue();
    }
}
