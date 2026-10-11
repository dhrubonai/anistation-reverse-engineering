package defpackage;

import java.util.AbstractList;
import java.util.ListIterator;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class yi3 extends ci6 implements ListIterator {
    public final /* synthetic */ byte y;
    public final /* synthetic */ AbstractList z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ yi3(AbstractList abstractList, ListIterator listIterator, byte b) {
        super(listIterator);
        this.y = b;
        this.z = abstractList;
    }

    @Override // defpackage.ci6
    public final Object a(Object obj) {
        byte b = this.y;
        AbstractList abstractList = this.z;
        switch (b) {
            case 0:
                return ((zi3) abstractList).y.apply(obj);
            default:
                return ((aj3) abstractList).y.apply(obj);
        }
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return ((ListIterator) this.x).hasPrevious();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return ((ListIterator) this.x).nextIndex();
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        return a(((ListIterator) this.x).previous());
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return ((ListIterator) this.x).previousIndex();
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
