package b4;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class c0 {

    /* renamed from: e, reason: collision with root package name */
    public static final f9.x f1443e = new f9.x(3);

    /* renamed from: f, reason: collision with root package name */
    public static final h f1444f = new h(1);

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f1445a;

    /* renamed from: b, reason: collision with root package name */
    public final f9.x f1446b;

    /* renamed from: c, reason: collision with root package name */
    public final HashSet f1447c;

    /* renamed from: d, reason: collision with root package name */
    public final f0.c f1448d;

    public c0(f.c cVar) {
        f9.x xVar = f1443e;
        this.f1445a = new ArrayList();
        this.f1447c = new HashSet();
        this.f1448d = cVar;
        this.f1446b = xVar;
    }

    public final synchronized void a(Class cls, Class cls2, y yVar) {
        b0 b0Var = new b0(cls, cls2, yVar);
        ArrayList arrayList = this.f1445a;
        arrayList.add(arrayList.size(), b0Var);
    }

    public final synchronized x b(Class cls, Class cls2) {
        try {
            ArrayList arrayList = new ArrayList();
            Iterator it = this.f1445a.iterator();
            boolean z9 = false;
            while (true) {
                boolean z10 = true;
                if (!it.hasNext()) {
                    break;
                }
                b0 b0Var = (b0) it.next();
                if (this.f1447c.contains(b0Var)) {
                    z9 = true;
                } else {
                    if (!b0Var.f1438a.isAssignableFrom(cls) || !b0Var.f1439b.isAssignableFrom(cls2)) {
                        z10 = false;
                    }
                    if (z10) {
                        this.f1447c.add(b0Var);
                        x j4 = b0Var.f1440c.j(this);
                        w7.b.q(j4);
                        arrayList.add(j4);
                        this.f1447c.remove(b0Var);
                    }
                }
            }
            if (arrayList.size() > 1) {
                f9.x xVar = this.f1446b;
                f0.c cVar = this.f1448d;
                xVar.getClass();
                return new l(arrayList, cVar);
            }
            if (arrayList.size() == 1) {
                return (x) arrayList.get(0);
            }
            if (z9) {
                return f1444f;
            }
            throw new com.bumptech.glide.i(cls, cls2);
        } catch (Throwable th) {
            this.f1447c.clear();
            throw th;
        }
    }

    public final synchronized ArrayList c(Class cls) {
        ArrayList arrayList;
        try {
            arrayList = new ArrayList();
            Iterator it = this.f1445a.iterator();
            while (it.hasNext()) {
                b0 b0Var = (b0) it.next();
                if (!this.f1447c.contains(b0Var) && b0Var.f1438a.isAssignableFrom(cls)) {
                    this.f1447c.add(b0Var);
                    x j4 = b0Var.f1440c.j(this);
                    w7.b.q(j4);
                    arrayList.add(j4);
                    this.f1447c.remove(b0Var);
                }
            }
        } catch (Throwable th) {
            this.f1447c.clear();
            throw th;
        }
        return arrayList;
    }

    public final synchronized ArrayList d(Class cls) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        Iterator it = this.f1445a.iterator();
        while (it.hasNext()) {
            b0 b0Var = (b0) it.next();
            if (!arrayList.contains(b0Var.f1439b) && b0Var.f1438a.isAssignableFrom(cls)) {
                arrayList.add(b0Var.f1439b);
            }
        }
        return arrayList;
    }
}
