package r6;

import java.util.Iterator;

/* loaded from: classes.dex */
public abstract class b2 implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    public final Iterator f9442a;

    public b2(Iterator it) {
        it.getClass();
        this.f9442a = it;
    }

    public abstract Object a(Object obj);

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f9442a.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return a(this.f9442a.next());
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f9442a.remove();
    }
}
