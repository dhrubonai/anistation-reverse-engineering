package l;

import java.util.Iterator;

/* loaded from: classes.dex */
public abstract class e extends f implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    public c f6571a;

    /* renamed from: b, reason: collision with root package name */
    public c f6572b;

    public e(c cVar, c cVar2) {
        this.f6571a = cVar2;
        this.f6572b = cVar;
    }

    @Override // l.f
    public final void a(c cVar) {
        c cVar2;
        if (this.f6571a == cVar && cVar == this.f6572b) {
            this.f6572b = null;
            this.f6571a = null;
        }
        c cVar3 = this.f6571a;
        if (cVar3 == cVar) {
            switch (((b) this).f6563c) {
                case 0:
                    cVar2 = cVar3.f6567d;
                    break;
                default:
                    cVar2 = cVar3.f6566c;
                    break;
            }
            this.f6571a = cVar2;
        }
        if (this.f6572b == cVar) {
            this.f6572b = b();
        }
    }

    public final c b() {
        c cVar = this.f6572b;
        c cVar2 = this.f6571a;
        if (cVar != cVar2 && cVar2 != null) {
            switch (((b) this).f6563c) {
                case 0:
                    return cVar.f6566c;
                default:
                    return cVar.f6567d;
            }
        }
        return null;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f6572b != null) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        c cVar = this.f6572b;
        this.f6572b = b();
        return cVar;
    }
}
