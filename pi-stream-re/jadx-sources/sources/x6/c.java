package x6;

import g0.f1;
import java.util.ListIterator;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class c extends f1 implements ListIterator {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e f11307d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(e eVar, int i10) {
        super(eVar, 1);
        this.f11307d = eVar;
        int b10 = eVar.b();
        if (i10 >= 0 && i10 <= b10) {
            this.f4209b = i10;
            return;
        }
        throw new IndexOutOfBoundsException(a3.g.p("index: ", i10, ", size: ", b10));
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        if (this.f4209b > 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f4209b;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (hasPrevious()) {
            int i10 = this.f4209b - 1;
            this.f4209b = i10;
            return this.f11307d.get(i10);
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f4209b - 1;
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
