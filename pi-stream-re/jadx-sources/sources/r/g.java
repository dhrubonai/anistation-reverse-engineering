package r;

import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public class g implements d {

    /* renamed from: d, reason: collision with root package name */
    public final n f9273d;

    /* renamed from: f, reason: collision with root package name */
    public int f9275f;

    /* renamed from: g, reason: collision with root package name */
    public int f9276g;

    /* renamed from: a, reason: collision with root package name */
    public n f9270a = null;

    /* renamed from: b, reason: collision with root package name */
    public boolean f9271b = false;

    /* renamed from: c, reason: collision with root package name */
    public boolean f9272c = false;

    /* renamed from: e, reason: collision with root package name */
    public int f9274e = 1;

    /* renamed from: h, reason: collision with root package name */
    public int f9277h = 1;

    /* renamed from: i, reason: collision with root package name */
    public h f9278i = null;

    /* renamed from: j, reason: collision with root package name */
    public boolean f9279j = false;

    /* renamed from: k, reason: collision with root package name */
    public final ArrayList f9280k = new ArrayList();

    /* renamed from: l, reason: collision with root package name */
    public final ArrayList f9281l = new ArrayList();

    public g(n nVar) {
        this.f9273d = nVar;
    }

    @Override // r.d
    public final void a(d dVar) {
        ArrayList arrayList = this.f9281l;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (!((g) it.next()).f9279j) {
                return;
            }
        }
        this.f9272c = true;
        n nVar = this.f9270a;
        if (nVar != null) {
            nVar.a(this);
        }
        if (this.f9271b) {
            this.f9273d.a(this);
            return;
        }
        Iterator it2 = arrayList.iterator();
        g gVar = null;
        int i10 = 0;
        while (it2.hasNext()) {
            g gVar2 = (g) it2.next();
            if (!(gVar2 instanceof h)) {
                i10++;
                gVar = gVar2;
            }
        }
        if (gVar != null && i10 == 1 && gVar.f9279j) {
            h hVar = this.f9278i;
            if (hVar != null) {
                if (hVar.f9279j) {
                    this.f9275f = this.f9277h * hVar.f9276g;
                } else {
                    return;
                }
            }
            d(gVar.f9276g + this.f9275f);
        }
        n nVar2 = this.f9270a;
        if (nVar2 != null) {
            nVar2.a(this);
        }
    }

    public final void b(d dVar) {
        this.f9280k.add(dVar);
        if (this.f9279j) {
            dVar.a(dVar);
        }
    }

    public final void c() {
        this.f9281l.clear();
        this.f9280k.clear();
        this.f9279j = false;
        this.f9276g = 0;
        this.f9272c = false;
        this.f9271b = false;
    }

    public void d(int i10) {
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

    public final String toString() {
        Object obj;
        StringBuilder sb = new StringBuilder();
        sb.append(this.f9273d.f9289b.W);
        sb.append(":");
        sb.append(f.m(this.f9274e));
        sb.append("(");
        if (this.f9279j) {
            obj = Integer.valueOf(this.f9276g);
        } else {
            obj = "unresolved";
        }
        sb.append(obj);
        sb.append(") <t=");
        sb.append(this.f9281l.size());
        sb.append(":d=");
        sb.append(this.f9280k.size());
        sb.append(">");
        return sb.toString();
    }
}
