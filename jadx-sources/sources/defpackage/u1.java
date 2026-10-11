package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class u1 implements Iterator {
    public final /* synthetic */ t1 B;
    public final /* synthetic */ byte C;
    public final Iterator x;
    public Object y = null;
    public Collection z = null;
    public Iterator A = v33.x;

    public u1(t1 t1Var, byte b) {
        this.C = b;
        this.B = t1Var;
        this.x = t1Var.B.entrySet().iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (!this.x.hasNext() && !this.A.hasNext()) {
            return false;
        }
        return true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!this.A.hasNext()) {
            Map.Entry entry = (Map.Entry) this.x.next();
            this.y = entry.getKey();
            Collection collection = (Collection) entry.getValue();
            this.z = collection;
            this.A = collection.iterator();
        }
        Object obj = this.y;
        Object next = this.A.next();
        switch (this.C) {
            case 0:
                return next;
            default:
                return new hw2(obj, next);
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.A.remove();
        Collection collection = this.z;
        Objects.requireNonNull(collection);
        if (collection.isEmpty()) {
            this.x.remove();
        }
        t1 t1Var = this.B;
        t1Var.C--;
    }
}
