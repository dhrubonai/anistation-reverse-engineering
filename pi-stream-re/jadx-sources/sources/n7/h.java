package n7;

import java.util.Iterator;

/* loaded from: classes.dex */
public final class h implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    public final Iterator f8019a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i f8020b;

    public h(i iVar) {
        this.f8020b = iVar;
        this.f8019a = iVar.f8021a.iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f8019a.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return this.f8020b.f8022b.invoke(this.f8019a.next());
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
