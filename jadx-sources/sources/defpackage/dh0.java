package defpackage;

import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public final class dh0 extends l2 {
    public final /* synthetic */ byte x;
    public final /* synthetic */ gh0 y;

    public /* synthetic */ dh0(gh0 gh0Var, byte b) {
        this.x = b;
        this.y = gh0Var;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        switch (this.x) {
            case 0:
                ((Map.Entry) obj).getClass();
                throw new UnsupportedOperationException("CaseInsensitiveMap.entries does not support add");
            default:
                ((String) obj).getClass();
                throw new UnsupportedOperationException("CaseInsensitiveMap.keys does not support add");
        }
    }

    @Override // defpackage.l2
    public final int b() {
        byte b = this.x;
        gh0 gh0Var = this.y;
        switch (b) {
            case 0:
                return gh0Var.z;
            default:
                return gh0Var.z;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        switch (this.x) {
            case 0:
                if (!wk6.v(obj)) {
                    return false;
                }
                return super.contains((Map.Entry) obj);
            default:
                if (!(obj instanceof String)) {
                    return false;
                }
                return this.y.containsKey((String) obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        byte b = this.x;
        gh0 gh0Var = this.y;
        switch (b) {
            case 0:
                return new ch0(gh0Var, (byte) 0);
            default:
                return new ch0(gh0Var, (byte) 1);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        switch (this.x) {
            case 0:
                if (!wk6.v(obj)) {
                    return false;
                }
                return super.remove((Map.Entry) obj);
            default:
                if (!(obj instanceof String)) {
                    return false;
                }
                if (this.y.remove((String) obj) == null) {
                    return false;
                }
                return true;
        }
    }
}
