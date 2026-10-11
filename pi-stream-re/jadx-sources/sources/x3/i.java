package x3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f11192a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f11193b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public com.bumptech.glide.f f11194c;

    /* renamed from: d, reason: collision with root package name */
    public Object f11195d;

    /* renamed from: e, reason: collision with root package name */
    public int f11196e;

    /* renamed from: f, reason: collision with root package name */
    public int f11197f;

    /* renamed from: g, reason: collision with root package name */
    public Class f11198g;

    /* renamed from: h, reason: collision with root package name */
    public p f11199h;

    /* renamed from: i, reason: collision with root package name */
    public v3.l f11200i;

    /* renamed from: j, reason: collision with root package name */
    public Map f11201j;

    /* renamed from: k, reason: collision with root package name */
    public Class f11202k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f11203l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f11204m;

    /* renamed from: n, reason: collision with root package name */
    public v3.i f11205n;
    public com.bumptech.glide.g o;

    /* renamed from: p, reason: collision with root package name */
    public o f11206p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f11207q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f11208r;

    public final ArrayList a() {
        boolean z9 = this.f11204m;
        ArrayList arrayList = this.f11193b;
        if (!z9) {
            this.f11204m = true;
            arrayList.clear();
            ArrayList b10 = b();
            int size = b10.size();
            for (int i10 = 0; i10 < size; i10++) {
                b4.w wVar = (b4.w) b10.get(i10);
                if (!arrayList.contains(wVar.f1501a)) {
                    arrayList.add(wVar.f1501a);
                }
                int i11 = 0;
                while (true) {
                    List list = wVar.f1502b;
                    if (i11 < list.size()) {
                        if (!arrayList.contains(list.get(i11))) {
                            arrayList.add(list.get(i11));
                        }
                        i11++;
                    }
                }
            }
        }
        return arrayList;
    }

    public final ArrayList b() {
        boolean z9 = this.f11203l;
        ArrayList arrayList = this.f11192a;
        if (!z9) {
            this.f11203l = true;
            arrayList.clear();
            List g10 = this.f11194c.b().g(this.f11195d);
            int size = g10.size();
            for (int i10 = 0; i10 < size; i10++) {
                b4.w a10 = ((b4.x) g10.get(i10)).a(this.f11195d, this.f11196e, this.f11197f, this.f11200i);
                if (a10 != null) {
                    arrayList.add(a10);
                }
            }
        }
        return arrayList;
    }

    public final c0 c(Class cls) {
        c0 c0Var;
        com.bumptech.glide.j b10 = this.f11194c.b();
        Class cls2 = this.f11198g;
        Class cls3 = this.f11202k;
        k4.b bVar = b10.f2238i;
        c0 c0Var2 = null;
        p4.k kVar = (p4.k) bVar.f6471b.getAndSet(null);
        if (kVar == null) {
            kVar = new p4.k();
        }
        kVar.f8571a = cls;
        kVar.f8572b = cls2;
        kVar.f8573c = cls3;
        synchronized (bVar.f6470a) {
            c0Var = (c0) bVar.f6470a.getOrDefault(kVar, null);
        }
        bVar.f6471b.set(kVar);
        b10.f2238i.getClass();
        if (k4.b.f6469c.equals(c0Var)) {
            return null;
        }
        if (c0Var == null) {
            ArrayList e10 = b10.e(cls, cls2, cls3);
            if (!e10.isEmpty()) {
                c0Var2 = new c0(cls, cls2, cls3, e10, b10.f2239j);
            }
            b10.f2238i.a(cls, cls2, cls3, c0Var2);
            return c0Var2;
        }
        return c0Var;
    }

    public final List d() {
        List list;
        com.bumptech.glide.j b10 = this.f11194c.b();
        Class<?> cls = this.f11195d.getClass();
        Class cls2 = this.f11198g;
        Class cls3 = this.f11202k;
        z3.e eVar = b10.f2237h;
        p4.k kVar = (p4.k) ((AtomicReference) eVar.f12044b).getAndSet(null);
        if (kVar == null) {
            kVar = new p4.k(cls, cls2, cls3);
        } else {
            kVar.f8571a = cls;
            kVar.f8572b = cls2;
            kVar.f8573c = cls3;
        }
        synchronized (((n.e) eVar.f12045c)) {
            list = (List) ((n.e) eVar.f12045c).getOrDefault(kVar, null);
        }
        ((AtomicReference) eVar.f12044b).set(kVar);
        List list2 = list;
        if (list == null) {
            ArrayList arrayList = new ArrayList();
            Iterator it = b10.f2230a.t(cls).iterator();
            while (it.hasNext()) {
                Iterator it2 = b10.f2232c.v((Class) it.next(), cls2).iterator();
                while (it2.hasNext()) {
                    Class cls4 = (Class) it2.next();
                    if (!b10.f2235f.e(cls4, cls3).isEmpty() && !arrayList.contains(cls4)) {
                        arrayList.add(cls4);
                    }
                }
            }
            b10.f2237h.B(cls, cls2, cls3, Collections.unmodifiableList(arrayList));
            list2 = arrayList;
        }
        return list2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0027, code lost:
    
        r1 = r3.f6468b;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final v3.c e(java.lang.Object r6) {
        /*
            r5 = this;
            com.bumptech.glide.f r0 = r5.f11194c
            com.bumptech.glide.j r0 = r0.b()
            h4.c r0 = r0.f2231b
            java.lang.Class r1 = r6.getClass()
            monitor-enter(r0)
            java.util.ArrayList r2 = r0.f5004a     // Catch: java.lang.Throwable -> L3b
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.Throwable -> L3b
        L13:
            boolean r3 = r2.hasNext()     // Catch: java.lang.Throwable -> L3b
            if (r3 == 0) goto L2b
            java.lang.Object r3 = r2.next()     // Catch: java.lang.Throwable -> L3b
            k4.a r3 = (k4.a) r3     // Catch: java.lang.Throwable -> L3b
            java.lang.Class r4 = r3.f6467a     // Catch: java.lang.Throwable -> L3b
            boolean r4 = r4.isAssignableFrom(r1)     // Catch: java.lang.Throwable -> L3b
            if (r4 == 0) goto L13
            v3.c r1 = r3.f6468b     // Catch: java.lang.Throwable -> L3b
            monitor-exit(r0)
            goto L2d
        L2b:
            monitor-exit(r0)
            r1 = 0
        L2d:
            if (r1 == 0) goto L30
            return r1
        L30:
            com.bumptech.glide.i r0 = new com.bumptech.glide.i
            java.lang.Class r6 = r6.getClass()
            r1 = 3
            r0.<init>(r1, r6)
            throw r0
        L3b:
            r6 = move-exception
            monitor-exit(r0)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: x3.i.e(java.lang.Object):v3.c");
    }

    public final v3.p f(Class cls) {
        v3.p pVar = (v3.p) this.f11201j.get(cls);
        if (pVar == null) {
            Iterator it = this.f11201j.entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry entry = (Map.Entry) it.next();
                if (((Class) entry.getKey()).isAssignableFrom(cls)) {
                    pVar = (v3.p) entry.getValue();
                    break;
                }
            }
        }
        if (pVar == null) {
            if (this.f11201j.isEmpty() && this.f11207q) {
                throw new IllegalArgumentException("Missing transformation for " + cls + ". If you wish to ignore unknown resource types, use the optional transformation methods.");
            }
            return d4.c.f3228b;
        }
        return pVar;
    }
}
