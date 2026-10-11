package r6;

import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;

/* loaded from: classes.dex */
public class f implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9453a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final Iterator f9454b;

    /* renamed from: c, reason: collision with root package name */
    public Object f9455c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f9456d;

    public f(o oVar) {
        Iterator it;
        this.f9456d = oVar;
        Collection collection = oVar.f9501b;
        this.f9455c = collection;
        if (collection instanceof List) {
            it = ((List) collection).listIterator();
        } else {
            it = collection.iterator();
        }
        this.f9454b = it;
    }

    public final void a() {
        Object obj = this.f9456d;
        ((o) obj).c();
        if (((o) obj).f9501b == ((Collection) this.f9455c)) {
        } else {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i10 = this.f9453a;
        Iterator it = this.f9454b;
        switch (i10) {
            case 0:
                return it.hasNext();
            case 1:
                return it.hasNext();
            default:
                a();
                return it.hasNext();
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i10 = this.f9453a;
        Iterator it = this.f9454b;
        switch (i10) {
            case 0:
                Map.Entry entry = (Map.Entry) it.next();
                this.f9455c = (Collection) entry.getValue();
                return ((g) this.f9456d).c(entry);
            case 1:
                Map.Entry entry2 = (Map.Entry) it.next();
                this.f9455c = entry2;
                return entry2.getKey();
            default:
                a();
                return it.next();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        int i10 = this.f9453a;
        boolean z9 = true;
        Object obj = this.f9456d;
        Iterator it = this.f9454b;
        switch (i10) {
            case 0:
                if (((Collection) this.f9455c) == null) {
                    z9 = false;
                }
                h0.x("no calls to next() since the last call to remove()", z9);
                it.remove();
                ((g) obj).f9462d.f9444e -= ((Collection) this.f9455c).size();
                ((Collection) this.f9455c).clear();
                this.f9455c = null;
                return;
            case 1:
                if (((Map.Entry) this.f9455c) == null) {
                    z9 = false;
                }
                h0.x("no calls to next() since the last call to remove()", z9);
                Collection collection = (Collection) ((Map.Entry) this.f9455c).getValue();
                it.remove();
                ((i) obj).f9477c.f9444e -= collection.size();
                collection.clear();
                this.f9455c = null;
                return;
            default:
                it.remove();
                o oVar = (o) obj;
                c cVar = oVar.f9504e;
                cVar.f9444e--;
                oVar.d();
                return;
        }
    }

    public f(o oVar, ListIterator listIterator) {
        this.f9456d = oVar;
        this.f9455c = oVar.f9501b;
        this.f9454b = listIterator;
    }

    public f(i iVar, Iterator it) {
        this.f9456d = iVar;
        this.f9454b = it;
    }

    public f(g gVar) {
        this.f9456d = gVar;
        this.f9454b = gVar.f9461c.entrySet().iterator();
    }
}
