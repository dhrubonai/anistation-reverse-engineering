package r6;

import java.util.Collection;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* loaded from: classes.dex */
public class q extends o implements List {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ c f9515f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(c cVar, Object obj, List list, o oVar) {
        super(cVar, obj, list, oVar);
        this.f9515f = cVar;
    }

    @Override // java.util.List
    public final void add(int i10, Object obj) {
        c();
        boolean isEmpty = this.f9501b.isEmpty();
        ((List) this.f9501b).add(i10, obj);
        this.f9515f.f9444e++;
        if (isEmpty) {
            b();
        }
    }

    @Override // java.util.List
    public final boolean addAll(int i10, Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean addAll = ((List) this.f9501b).addAll(i10, collection);
        if (addAll) {
            this.f9515f.f9444e += this.f9501b.size() - size;
            if (size == 0) {
                b();
            }
        }
        return addAll;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        c();
        return ((List) this.f9501b).get(i10);
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        c();
        return ((List) this.f9501b).indexOf(obj);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        c();
        return ((List) this.f9501b).lastIndexOf(obj);
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        c();
        return new p(this);
    }

    @Override // java.util.List
    public final Object remove(int i10) {
        c();
        Object remove = ((List) this.f9501b).remove(i10);
        c cVar = this.f9515f;
        cVar.f9444e--;
        d();
        return remove;
    }

    @Override // java.util.List
    public final Object set(int i10, Object obj) {
        c();
        return ((List) this.f9501b).set(i10, obj);
    }

    @Override // java.util.List
    public final List subList(int i10, int i11) {
        c();
        List subList = ((List) this.f9501b).subList(i10, i11);
        o oVar = this.f9502c;
        if (oVar == null) {
            oVar = this;
        }
        c cVar = this.f9515f;
        cVar.getClass();
        boolean z9 = subList instanceof RandomAccess;
        Object obj = this.f9500a;
        if (z9) {
            return new l(cVar, obj, subList, oVar);
        }
        return new q(cVar, obj, subList, oVar);
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i10) {
        c();
        return new p(this, i10);
    }
}
