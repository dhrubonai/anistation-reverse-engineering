package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public abstract class n2 extends r1 {
    public abstract n2 c(int i, Object obj);

    @Override // defpackage.m0, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        if (indexOf(obj) != -1) {
            return true;
        }
        return false;
    }

    @Override // defpackage.m0, java.util.Collection
    public final boolean containsAll(Collection collection) {
        Collection collection2 = collection;
        if ((collection2 instanceof Collection) && collection2.isEmpty()) {
            return true;
        }
        Iterator it = collection2.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    public abstract n2 d(Object obj);

    public n2 f(Collection collection) {
        ml4 g = g();
        g.addAll(collection);
        return g.d();
    }

    public abstract ml4 g();

    public abstract n2 h(m2 m2Var);

    public abstract n2 i(int i);

    @Override // defpackage.r1, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    public abstract n2 j(int i, Object obj);

    @Override // defpackage.r1, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // defpackage.r1, java.util.List
    public final List subList(int i, int i2) {
        return new mw2(this, i, i2);
    }
}
