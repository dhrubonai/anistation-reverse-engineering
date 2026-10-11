package defpackage;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class hs5 implements Iterator {
    public int x;
    public Iterator y;
    public final /* synthetic */ fs5 z;

    public hs5(fs5 fs5Var) {
        this.z = fs5Var;
        this.x = fs5Var.y.size();
    }

    public final Iterator a() {
        Iterator it = this.y;
        if (it == null) {
            Iterator it2 = this.z.C.entrySet().iterator();
            this.y = it2;
            return it2;
        }
        return it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i = this.x;
        if ((i > 0 && i <= this.z.y.size()) || a().hasNext()) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (a().hasNext()) {
            return (Map.Entry) a().next();
        }
        List list = this.z.y;
        int i = this.x - 1;
        this.x = i;
        return (Map.Entry) list.get(i);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
