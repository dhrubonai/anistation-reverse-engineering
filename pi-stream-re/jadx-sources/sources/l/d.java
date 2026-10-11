package l;

import java.util.Iterator;

/* loaded from: classes.dex */
public final class d extends f implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    public c f6568a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f6569b = true;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ g f6570c;

    public d(g gVar) {
        this.f6570c = gVar;
    }

    @Override // l.f
    public final void a(c cVar) {
        boolean z9;
        c cVar2 = this.f6568a;
        if (cVar == cVar2) {
            c cVar3 = cVar2.f6567d;
            this.f6568a = cVar3;
            if (cVar3 == null) {
                z9 = true;
            } else {
                z9 = false;
            }
            this.f6569b = z9;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f6569b) {
            if (this.f6570c.f6573a != null) {
                return true;
            }
            return false;
        }
        c cVar = this.f6568a;
        if (cVar != null && cVar.f6566c != null) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        c cVar;
        if (this.f6569b) {
            this.f6569b = false;
            this.f6568a = this.f6570c.f6573a;
        } else {
            c cVar2 = this.f6568a;
            if (cVar2 != null) {
                cVar = cVar2.f6566c;
            } else {
                cVar = null;
            }
            this.f6568a = cVar;
        }
        return this.f6568a;
    }
}
