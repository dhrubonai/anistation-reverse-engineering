package defpackage;

import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public abstract class ci6 implements Iterator {
    public final Iterator x;

    public ci6(Iterator it) {
        it.getClass();
        this.x = it;
    }

    public Object a(Object obj) {
        return ((Map.Entry) obj).getValue();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.x.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return a(this.x.next());
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.x.remove();
    }
}
