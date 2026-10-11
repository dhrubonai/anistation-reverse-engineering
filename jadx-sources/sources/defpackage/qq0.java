package defpackage;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class qq0 extends AbstractSet {
    public final /* synthetic */ byte x;
    public final /* synthetic */ sq0 y;

    public /* synthetic */ qq0(sq0 sq0Var, byte b) {
        this.x = b;
        this.y = sq0Var;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        byte b = this.x;
        sq0 sq0Var = this.y;
        switch (b) {
            case 0:
                sq0Var.clear();
                return;
            default:
                sq0Var.clear();
                return;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        byte b = this.x;
        sq0 sq0Var = this.y;
        switch (b) {
            case 0:
                Map c = sq0Var.c();
                if (c != null) {
                    return c.entrySet().contains(obj);
                }
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    int e = sq0Var.e(entry.getKey());
                    if (e != -1 && tl7.r(sq0Var.k()[e], entry.getValue())) {
                        return true;
                    }
                }
                return false;
            default:
                return sq0Var.containsKey(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        byte b = this.x;
        sq0 sq0Var = this.y;
        switch (b) {
            case 0:
                Map c = sq0Var.c();
                if (c != null) {
                    return c.entrySet().iterator();
                }
                return new pq0(sq0Var, (byte) 1);
            default:
                Map c2 = sq0Var.c();
                if (c2 != null) {
                    return c2.keySet().iterator();
                }
                return new pq0(sq0Var, (byte) 0);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        byte b = this.x;
        sq0 sq0Var = this.y;
        switch (b) {
            case 0:
                Map c = sq0Var.c();
                if (c != null) {
                    return c.entrySet().remove(obj);
                }
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                if (sq0Var.g()) {
                    return false;
                }
                int d = sq0Var.d();
                Object key = entry.getKey();
                Object value = entry.getValue();
                Object obj2 = sq0Var.x;
                Objects.requireNonNull(obj2);
                int K = wc7.K(key, value, d, obj2, sq0Var.i(), sq0Var.j(), sq0Var.k());
                if (K == -1) {
                    return false;
                }
                sq0Var.f(K, d);
                sq0Var.C--;
                sq0Var.B += 32;
                return true;
            default:
                Map c2 = sq0Var.c();
                if (c2 != null) {
                    return c2.keySet().remove(obj);
                }
                if (sq0Var.h(obj) == sq0.G) {
                    return false;
                }
                return true;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        byte b = this.x;
        sq0 sq0Var = this.y;
        switch (b) {
            case 0:
                return sq0Var.size();
            default:
                return sq0Var.size();
        }
    }
}
