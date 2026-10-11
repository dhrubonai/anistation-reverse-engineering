package defpackage;

import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public class dn3 implements Map.Entry, j73 {
    public final /* synthetic */ byte x;
    public final Object y;
    public final Object z;

    public dn3(String str, List list) {
        this.x = (byte) 2;
        str.getClass();
        list.getClass();
        this.y = str;
        this.z = list;
    }

    @Override // java.util.Map.Entry
    public boolean equals(Object obj) {
        Map.Entry entry;
        byte b = this.x;
        Object obj2 = this.y;
        switch (b) {
            case 0:
                if (obj instanceof Map.Entry) {
                    entry = (Map.Entry) obj;
                } else {
                    entry = null;
                }
                if (entry == null || !a34.i(entry.getKey(), obj2) || !a34.i(entry.getValue(), getValue())) {
                    return false;
                }
                return true;
            case 1:
            default:
                return super.equals(obj);
            case 2:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry2 = (Map.Entry) obj;
                if (!a34.i(entry2.getKey(), (String) obj2) || !a34.i(entry2.getValue(), (List) this.z)) {
                    return false;
                }
                return true;
        }
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        switch (this.x) {
            case 0:
                return this.y;
            case 1:
                return this.y;
            default:
                return (String) this.y;
        }
    }

    @Override // java.util.Map.Entry
    public Object getValue() {
        switch (this.x) {
            case 0:
                return this.z;
            case 1:
                return this.z;
            default:
                return (List) this.z;
        }
    }

    @Override // java.util.Map.Entry
    public int hashCode() {
        int i;
        byte b = this.x;
        Object obj = this.y;
        switch (b) {
            case 0:
                int i2 = 0;
                if (obj != null) {
                    i = obj.hashCode();
                } else {
                    i = 0;
                }
                Object value = getValue();
                if (value != null) {
                    i2 = value.hashCode();
                }
                return i ^ i2;
            case 1:
            default:
                return super.hashCode();
            case 2:
                return ((List) this.z).hashCode() ^ ((String) obj).hashCode();
        }
    }

    @Override // java.util.Map.Entry
    public Object setValue(Object obj) {
        switch (this.x) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public String toString() {
        byte b = this.x;
        Object obj = this.y;
        switch (b) {
            case 0:
                return obj + "=" + getValue();
            case 1:
            default:
                return super.toString();
            case 2:
                return ((String) obj) + '=' + ((List) this.z);
        }
    }

    public /* synthetic */ dn3(Object obj, Object obj2, byte b) {
        this.x = b;
        this.y = obj;
        this.z = obj2;
    }
}
