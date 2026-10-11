package r6;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes.dex */
public abstract class h implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    public final Iterator f9464a;

    /* renamed from: b, reason: collision with root package name */
    public Object f9465b = null;

    /* renamed from: c, reason: collision with root package name */
    public Collection f9466c = null;

    /* renamed from: d, reason: collision with root package name */
    public Iterator f9467d = w0.f9559a;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ c f9468e;

    public h(c cVar) {
        this.f9468e = cVar;
        this.f9464a = cVar.f9443d.entrySet().iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (!this.f9464a.hasNext() && !this.f9467d.hasNext()) {
            return false;
        }
        return true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!this.f9467d.hasNext()) {
            Map.Entry entry = (Map.Entry) this.f9464a.next();
            this.f9465b = entry.getKey();
            Collection collection = (Collection) entry.getValue();
            this.f9466c = collection;
            this.f9467d = collection.iterator();
        }
        Object obj = this.f9465b;
        Object next = this.f9467d.next();
        switch (((d) this).f9445f) {
            case 0:
                return next;
            default:
                return new k0(obj, next);
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f9467d.remove();
        Collection collection = this.f9466c;
        Objects.requireNonNull(collection);
        if (collection.isEmpty()) {
            this.f9464a.remove();
        }
        c cVar = this.f9468e;
        cVar.f9444e--;
    }
}
