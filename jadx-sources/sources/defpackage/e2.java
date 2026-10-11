package defpackage;

import java.util.List;
import java.util.ListIterator;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class e2 extends w1 implements ListIterator {
    public final /* synthetic */ f2 B;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e2(f2 f2Var, int i) {
        super(f2Var, ((List) f2Var.y).listIterator(i));
        this.B = f2Var;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        f2 f2Var = this.B;
        boolean isEmpty = f2Var.isEmpty();
        b().add(obj);
        f2Var.C.C++;
        if (isEmpty) {
            f2Var.b();
        }
    }

    public final ListIterator b() {
        a();
        return (ListIterator) this.y;
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
    public e2(f2 f2Var) {
        super(f2Var);
        this.B = f2Var;
    }
}
