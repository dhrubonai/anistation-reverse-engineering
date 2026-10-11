package r6;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes.dex */
public final class w1 extends z1 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Set f9561b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Set f9562c;

    public w1(t0 t0Var, t0 t0Var2) {
        this.f9561b = t0Var;
        this.f9562c = t0Var2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (this.f9561b.contains(obj) && this.f9562c.contains(obj)) {
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        if (this.f9561b.containsAll(collection) && this.f9562c.containsAll(collection)) {
            return true;
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return Collections.disjoint(this.f9562c, this.f9561b);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new u0(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        Iterator it = this.f9561b.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            if (this.f9562c.contains(it.next())) {
                i10++;
            }
        }
        return i10;
    }
}
