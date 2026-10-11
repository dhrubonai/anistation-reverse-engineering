package defpackage;

import java.util.Iterator;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class oe7 implements Iterator {
    public final /* synthetic */ Iterator x;
    public final /* synthetic */ Iterator y;

    public oe7(rf7 rf7Var, Iterator it, Iterator it2) {
        this.x = it;
        this.y = it2;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.x.hasNext()) {
            return true;
        }
        return this.y.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        Iterator it = this.x;
        if (it.hasNext()) {
            return new tk7(((Integer) it.next()).toString());
        }
        Iterator it2 = this.y;
        if (it2.hasNext()) {
            return new tk7((String) it2.next());
        }
        qi2.e();
        return null;
    }
}
