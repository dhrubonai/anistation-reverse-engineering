package defpackage;

import java.util.Iterator;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class nj7 implements Iterator {
    public final /* synthetic */ Iterator x;

    public nj7(Iterator it) {
        this.x = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.x.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        return new tk7((String) this.x.next());
    }
}
