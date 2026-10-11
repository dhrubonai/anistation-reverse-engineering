package n7;

import g0.d1;
import java.util.Iterator;
import java.util.NoSuchElementException;
import r6.h0;
import z6.j;

/* loaded from: classes.dex */
public final class d implements Iterator, z6.e {

    /* renamed from: a, reason: collision with root package name */
    public int f8014a;

    /* renamed from: b, reason: collision with root package name */
    public Object f8015b;

    /* renamed from: c, reason: collision with root package name */
    public Iterator f8016c;

    /* renamed from: d, reason: collision with root package name */
    public z6.e f8017d;

    public final RuntimeException a() {
        int i10 = this.f8014a;
        if (i10 != 4) {
            if (i10 != 5) {
                return new IllegalStateException("Unexpected state of the iterator: " + this.f8014a);
            }
            return new IllegalStateException("Iterator has failed.");
        }
        return new NoSuchElementException();
    }

    public final void b(Object obj, z6.e eVar) {
        this.f8015b = obj;
        this.f8014a = 3;
        this.f8017d = eVar;
        a7.a aVar = a7.a.f156a;
        h0.u(eVar, "frame");
    }

    public final Object f(d1 d1Var, z6.e eVar) {
        Object obj;
        Iterator it = d1Var.iterator();
        boolean hasNext = it.hasNext();
        w6.f fVar = w6.f.f11019a;
        if (!hasNext) {
            obj = fVar;
        } else {
            this.f8016c = it;
            this.f8014a = 2;
            this.f8017d = eVar;
            obj = a7.a.f156a;
            h0.u(eVar, "frame");
        }
        if (obj == a7.a.f156a) {
            return obj;
        }
        return fVar;
    }

    @Override // z6.e
    public final z6.i getContext() {
        return j.f12080a;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        while (true) {
            int i10 = this.f8014a;
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 == 2 || i10 == 3) {
                        return true;
                    }
                    if (i10 == 4) {
                        return false;
                    }
                    throw a();
                }
                Iterator it = this.f8016c;
                h0.q(it);
                if (it.hasNext()) {
                    this.f8014a = 2;
                    return true;
                }
                this.f8016c = null;
            }
            this.f8014a = 5;
            z6.e eVar = this.f8017d;
            h0.q(eVar);
            this.f8017d = null;
            eVar.resumeWith(w6.f.f11019a);
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i10 = this.f8014a;
        if (i10 != 0 && i10 != 1) {
            if (i10 != 2) {
                if (i10 == 3) {
                    this.f8014a = 0;
                    Object obj = this.f8015b;
                    this.f8015b = null;
                    return obj;
                }
                throw a();
            }
            this.f8014a = 1;
            Iterator it = this.f8016c;
            h0.q(it);
            return it.next();
        }
        if (hasNext()) {
            return next();
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // z6.e
    public final void resumeWith(Object obj) {
        h0.V0(obj);
        this.f8014a = 4;
    }
}
