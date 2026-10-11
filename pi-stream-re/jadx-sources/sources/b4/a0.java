package b4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class a0 implements com.bumptech.glide.load.data.e, com.bumptech.glide.load.data.d {

    /* renamed from: a, reason: collision with root package name */
    public final List f1429a;

    /* renamed from: b, reason: collision with root package name */
    public final f0.c f1430b;

    /* renamed from: c, reason: collision with root package name */
    public int f1431c;

    /* renamed from: d, reason: collision with root package name */
    public com.bumptech.glide.g f1432d;

    /* renamed from: e, reason: collision with root package name */
    public com.bumptech.glide.load.data.d f1433e;

    /* renamed from: f, reason: collision with root package name */
    public List f1434f;

    /* renamed from: x, reason: collision with root package name */
    public boolean f1435x;

    public a0(ArrayList arrayList, f0.c cVar) {
        this.f1430b = cVar;
        if (!arrayList.isEmpty()) {
            this.f1429a = arrayList;
            this.f1431c = 0;
            return;
        }
        throw new IllegalArgumentException("Must not be empty.");
    }

    @Override // com.bumptech.glide.load.data.e
    public final Class a() {
        return ((com.bumptech.glide.load.data.e) this.f1429a.get(0)).a();
    }

    public final void b() {
        if (this.f1435x) {
            return;
        }
        if (this.f1431c < this.f1429a.size() - 1) {
            this.f1431c++;
            e(this.f1432d, this.f1433e);
        } else {
            w7.b.q(this.f1434f);
            this.f1433e.n(new x3.a0("Fetch failed", new ArrayList(this.f1434f)));
        }
    }

    @Override // com.bumptech.glide.load.data.e
    public final void c() {
        List list = this.f1434f;
        if (list != null) {
            this.f1430b.b(list);
        }
        this.f1434f = null;
        Iterator it = this.f1429a.iterator();
        while (it.hasNext()) {
            ((com.bumptech.glide.load.data.e) it.next()).c();
        }
    }

    @Override // com.bumptech.glide.load.data.e
    public final void cancel() {
        this.f1435x = true;
        Iterator it = this.f1429a.iterator();
        while (it.hasNext()) {
            ((com.bumptech.glide.load.data.e) it.next()).cancel();
        }
    }

    @Override // com.bumptech.glide.load.data.e
    public final v3.a d() {
        return ((com.bumptech.glide.load.data.e) this.f1429a.get(0)).d();
    }

    @Override // com.bumptech.glide.load.data.e
    public final void e(com.bumptech.glide.g gVar, com.bumptech.glide.load.data.d dVar) {
        this.f1432d = gVar;
        this.f1433e = dVar;
        this.f1434f = (List) this.f1430b.j();
        ((com.bumptech.glide.load.data.e) this.f1429a.get(this.f1431c)).e(gVar, this);
        if (this.f1435x) {
            cancel();
        }
    }

    @Override // com.bumptech.glide.load.data.d
    public final void n(Exception exc) {
        List list = this.f1434f;
        w7.b.q(list);
        list.add(exc);
        b();
    }

    @Override // com.bumptech.glide.load.data.d
    public final void s(Object obj) {
        if (obj != null) {
            this.f1433e.s(obj);
        } else {
            b();
        }
    }
}
