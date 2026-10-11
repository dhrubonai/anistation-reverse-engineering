package n7;

import g0.d1;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class a implements c {

    /* renamed from: a, reason: collision with root package name */
    public final AtomicReference f8011a;

    public a(d1 d1Var) {
        this.f8011a = new AtomicReference(d1Var);
    }

    @Override // n7.c
    public final Iterator iterator() {
        c cVar = (c) this.f8011a.getAndSet(null);
        if (cVar != null) {
            return cVar.iterator();
        }
        throw new IllegalStateException("This sequence can be consumed only once.");
    }
}
