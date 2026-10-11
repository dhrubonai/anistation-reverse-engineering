package defpackage;

import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class hs implements Iterator, Map.Entry {
    public final /* synthetic */ js A;
    public int x;
    public int y = -1;
    public boolean z;

    public hs(js jsVar) {
        this.A = jsVar;
        this.x = jsVar.z - 1;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (this.z) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                int i = this.y;
                js jsVar = this.A;
                if (a34.i(key, jsVar.e(i)) && a34.i(entry.getValue(), jsVar.h(this.y))) {
                    return true;
                }
            }
            return false;
        }
        ze0.m("This container does not support retaining Map.Entry objects");
        return false;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        if (this.z) {
            return this.A.e(this.y);
        }
        ze0.m("This container does not support retaining Map.Entry objects");
        return null;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        if (this.z) {
            return this.A.h(this.y);
        }
        ze0.m("This container does not support retaining Map.Entry objects");
        return null;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.y < this.x) {
            return true;
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        int hashCode;
        int i = 0;
        if (this.z) {
            int i2 = this.y;
            js jsVar = this.A;
            Object e = jsVar.e(i2);
            Object h = jsVar.h(this.y);
            if (e == null) {
                hashCode = 0;
            } else {
                hashCode = e.hashCode();
            }
            if (h != null) {
                i = h.hashCode();
            }
            return hashCode ^ i;
        }
        ze0.m("This container does not support retaining Map.Entry objects");
        return 0;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (hasNext()) {
            this.y++;
            this.z = true;
            return this;
        }
        qi2.e();
        return null;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (this.z) {
            this.A.f(this.y);
            this.y--;
            this.x--;
            this.z = false;
            return;
        }
        p65.l();
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (this.z) {
            return this.A.g(this.y, obj);
        }
        ze0.m("This container does not support retaining Map.Entry objects");
        return null;
    }

    public final String toString() {
        return getKey() + "=" + getValue();
    }
}
