package g0;

import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public final Runnable f4247a;

    /* renamed from: b, reason: collision with root package name */
    public final CopyOnWriteArrayList f4248b = new CopyOnWriteArrayList();

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f4249c = new HashMap();

    public r(Runnable runnable) {
        this.f4247a = runnable;
    }

    public final boolean a() {
        Iterator it = this.f4248b.iterator();
        while (it.hasNext()) {
            if (((androidx.fragment.app.l0) ((t) it.next())).f925a.o()) {
                return true;
            }
        }
        return false;
    }

    public final void b(t tVar) {
        this.f4248b.remove(tVar);
        q qVar = (q) this.f4249c.remove(tVar);
        if (qVar != null) {
            qVar.f4240a.b(qVar.f4241b);
            qVar.f4241b = null;
        }
        this.f4247a.run();
    }
}
