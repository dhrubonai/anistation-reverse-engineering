package r6;

import java.util.List;
import java.util.ListIterator;

/* loaded from: classes.dex */
public final class p extends f implements ListIterator {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ q f9507e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(q qVar) {
        super(qVar);
        this.f9507e = qVar;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        q qVar = this.f9507e;
        boolean isEmpty = qVar.isEmpty();
        b().add(obj);
        qVar.f9515f.f9444e++;
        if (isEmpty) {
            qVar.b();
        }
    }

    public final ListIterator b() {
        a();
        return (ListIterator) this.f9454b;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return b().hasPrevious();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return b().nextIndex();
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        return b().previous();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return b().previousIndex();
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        b().set(obj);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(q qVar, int i10) {
        super(qVar, ((List) qVar.f9501b).listIterator(i10));
        this.f9507e = qVar;
    }
}
