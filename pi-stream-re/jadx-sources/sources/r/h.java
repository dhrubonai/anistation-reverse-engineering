package r;

import java.util.Iterator;

/* loaded from: classes.dex */
public class h extends g {

    /* renamed from: m, reason: collision with root package name */
    public int f9282m;

    public h(n nVar) {
        super(nVar);
        if (nVar instanceof k) {
            this.f9274e = 2;
        } else {
            this.f9274e = 3;
        }
    }

    @Override // r.g
    public final void d(int i10) {
        if (this.f9279j) {
            return;
        }
        this.f9279j = true;
        this.f9276g = i10;
        Iterator it = this.f9280k.iterator();
        while (it.hasNext()) {
            d dVar = (d) it.next();
            dVar.a(dVar);
        }
    }
}
