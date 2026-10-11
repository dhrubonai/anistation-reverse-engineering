package com.bumptech.glide;

import androidx.lifecycle.b0;
import b4.c0;
import b4.y;
import b4.z;
import f9.x;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final z3.e f2230a;

    /* renamed from: b, reason: collision with root package name */
    public final h4.c f2231b;

    /* renamed from: c, reason: collision with root package name */
    public final z3.e f2232c;

    /* renamed from: d, reason: collision with root package name */
    public final h4.c f2233d;

    /* renamed from: e, reason: collision with root package name */
    public final com.bumptech.glide.load.data.i f2234e;

    /* renamed from: f, reason: collision with root package name */
    public final h4.c f2235f;

    /* renamed from: g, reason: collision with root package name */
    public final h4.c f2236g;

    /* renamed from: h, reason: collision with root package name */
    public final z3.e f2237h = new z3.e(7);

    /* renamed from: i, reason: collision with root package name */
    public final k4.b f2238i = new k4.b();

    /* renamed from: j, reason: collision with root package name */
    public final f.c f2239j;

    public j() {
        f.c cVar = new f.c(new f0.d(20), new x(24), new x(25), 17);
        this.f2239j = cVar;
        this.f2230a = new z3.e(cVar);
        this.f2231b = new h4.c(1);
        this.f2232c = new z3.e(8);
        this.f2233d = new h4.c(3);
        this.f2234e = new com.bumptech.glide.load.data.i();
        this.f2235f = new h4.c(0);
        this.f2236g = new h4.c(2);
        List asList = Arrays.asList("Animation", "Bitmap", "BitmapDrawable");
        ArrayList arrayList = new ArrayList(asList.size());
        arrayList.add("legacy_prepend_all");
        Iterator it = asList.iterator();
        while (it.hasNext()) {
            arrayList.add((String) it.next());
        }
        arrayList.add("legacy_append");
        z3.e eVar = this.f2232c;
        synchronized (eVar) {
            ArrayList arrayList2 = new ArrayList((List) eVar.f12044b);
            ((List) eVar.f12044b).clear();
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                ((List) eVar.f12044b).add((String) it2.next());
            }
            Iterator it3 = arrayList2.iterator();
            while (it3.hasNext()) {
                String str = (String) it3.next();
                if (!arrayList.contains(str)) {
                    ((List) eVar.f12044b).add(str);
                }
            }
        }
    }

    public final void a(Class cls, Class cls2, y yVar) {
        z3.e eVar = this.f2230a;
        synchronized (eVar) {
            ((c0) eVar.f12044b).a(cls, cls2, yVar);
            ((b0) eVar.f12045c).f1074a.clear();
        }
    }

    public final void b(Class cls, v3.c cVar) {
        h4.c cVar2 = this.f2231b;
        synchronized (cVar2) {
            cVar2.f5004a.add(new k4.a(cls, cVar));
        }
    }

    public final void c(Class cls, v3.o oVar) {
        h4.c cVar = this.f2233d;
        synchronized (cVar) {
            cVar.f5004a.add(new k4.d(cls, oVar));
        }
    }

    public final void d(v3.n nVar, Class cls, Class cls2, String str) {
        z3.e eVar = this.f2232c;
        synchronized (eVar) {
            eVar.u(str).add(new k4.c(cls, cls2, nVar));
        }
    }

    public final ArrayList e(Class cls, Class cls2, Class cls3) {
        ArrayList arrayList;
        boolean z9;
        ArrayList arrayList2 = new ArrayList();
        Iterator it = this.f2232c.v(cls, cls2).iterator();
        while (it.hasNext()) {
            Class cls4 = (Class) it.next();
            Iterator it2 = this.f2235f.e(cls4, cls3).iterator();
            while (it2.hasNext()) {
                Class cls5 = (Class) it2.next();
                z3.e eVar = this.f2232c;
                synchronized (eVar) {
                    arrayList = new ArrayList();
                    Iterator it3 = ((List) eVar.f12044b).iterator();
                    while (it3.hasNext()) {
                        List<k4.c> list = (List) ((Map) eVar.f12045c).get((String) it3.next());
                        if (list != null) {
                            for (k4.c cVar : list) {
                                if (cVar.f6472a.isAssignableFrom(cls) && cls4.isAssignableFrom(cVar.f6473b)) {
                                    z9 = true;
                                } else {
                                    z9 = false;
                                }
                                if (z9) {
                                    arrayList.add(cVar.f6474c);
                                }
                            }
                        }
                    }
                }
                arrayList2.add(new x3.m(cls, cls4, cls5, arrayList, this.f2235f.c(cls4, cls5), this.f2239j));
            }
        }
        return arrayList2;
    }

    public final ArrayList f() {
        ArrayList arrayList;
        h4.c cVar = this.f2236g;
        synchronized (cVar) {
            arrayList = cVar.f5004a;
        }
        if (!arrayList.isEmpty()) {
            return arrayList;
        }
        throw new i();
    }

    public final List g(Object obj) {
        List list;
        z3.e eVar = this.f2230a;
        eVar.getClass();
        Class<?> cls = obj.getClass();
        synchronized (eVar) {
            z zVar = (z) ((b0) eVar.f12045c).f1074a.get(cls);
            if (zVar == null) {
                list = null;
            } else {
                list = zVar.f1504a;
            }
            if (list == null) {
                list = Collections.unmodifiableList(((c0) eVar.f12044b).c(cls));
                b0 b0Var = (b0) eVar.f12045c;
                b0Var.getClass();
                if (((z) b0Var.f1074a.put(cls, new z(list))) != null) {
                    throw new IllegalStateException("Already cached loaders for model: " + cls);
                }
            }
        }
        if (!list.isEmpty()) {
            int size = list.size();
            List emptyList = Collections.emptyList();
            boolean z9 = true;
            for (int i10 = 0; i10 < size; i10++) {
                b4.x xVar = (b4.x) list.get(i10);
                if (xVar.b(obj)) {
                    if (z9) {
                        emptyList = new ArrayList(size - i10);
                        z9 = false;
                    }
                    emptyList.add(xVar);
                }
            }
            if (!emptyList.isEmpty()) {
                return emptyList;
            }
            throw new i(obj, list);
        }
        throw new i(obj);
    }

    public final com.bumptech.glide.load.data.g h(Object obj) {
        com.bumptech.glide.load.data.g b10;
        com.bumptech.glide.load.data.i iVar = this.f2234e;
        synchronized (iVar) {
            w7.b.q(obj);
            com.bumptech.glide.load.data.f fVar = (com.bumptech.glide.load.data.f) iVar.f2258a.get(obj.getClass());
            if (fVar == null) {
                Iterator it = iVar.f2258a.values().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    com.bumptech.glide.load.data.f fVar2 = (com.bumptech.glide.load.data.f) it.next();
                    if (fVar2.a().isAssignableFrom(obj.getClass())) {
                        fVar = fVar2;
                        break;
                    }
                }
            }
            if (fVar == null) {
                fVar = com.bumptech.glide.load.data.i.f2257b;
            }
            b10 = fVar.b(obj);
        }
        return b10;
    }

    public final void i(com.bumptech.glide.load.data.f fVar) {
        com.bumptech.glide.load.data.i iVar = this.f2234e;
        synchronized (iVar) {
            iVar.f2258a.put(fVar.a(), fVar);
        }
    }

    public final void j(Class cls, Class cls2, h4.a aVar) {
        h4.c cVar = this.f2235f;
        synchronized (cVar) {
            cVar.f5004a.add(new h4.b(cls, cls2, aVar));
        }
    }

    public final void k(v3.e eVar) {
        h4.c cVar = this.f2236g;
        synchronized (cVar) {
            cVar.f5004a.add(eVar);
        }
    }
}
