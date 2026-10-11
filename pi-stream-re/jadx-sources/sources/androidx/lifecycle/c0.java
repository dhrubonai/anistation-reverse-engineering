package androidx.lifecycle;

import android.os.Looper;
import java.util.Map;

/* loaded from: classes.dex */
public class c0 {

    /* renamed from: k, reason: collision with root package name */
    public static final Object f1078k = new Object();

    /* renamed from: a, reason: collision with root package name */
    public final Object f1079a;

    /* renamed from: b, reason: collision with root package name */
    public final l.g f1080b;

    /* renamed from: c, reason: collision with root package name */
    public int f1081c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f1082d;

    /* renamed from: e, reason: collision with root package name */
    public volatile Object f1083e;

    /* renamed from: f, reason: collision with root package name */
    public volatile Object f1084f;

    /* renamed from: g, reason: collision with root package name */
    public int f1085g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f1086h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f1087i;

    /* renamed from: j, reason: collision with root package name */
    public final g.f f1088j;

    public c0(Object obj) {
        this.f1079a = new Object();
        this.f1080b = new l.g();
        this.f1081c = 0;
        this.f1084f = f1078k;
        this.f1088j = new g.f(this, 5);
        this.f1083e = obj;
        this.f1085g = 0;
    }

    public static void a(String str) {
        boolean z9;
        k.b.y().f6283l.getClass();
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (z9) {
        } else {
            throw new IllegalStateException(r.f.e("Cannot invoke ", str, " on a background thread"));
        }
    }

    public final void b(a0 a0Var) {
        if (a0Var.f1066b) {
            if (!a0Var.d()) {
                a0Var.a(false);
                return;
            }
            int i10 = a0Var.f1067c;
            int i11 = this.f1085g;
            if (i10 < i11) {
                a0Var.f1067c = i11;
                a0Var.f1065a.f(this.f1083e);
            }
        }
    }

    public final void c(a0 a0Var) {
        if (this.f1086h) {
            this.f1087i = true;
            return;
        }
        this.f1086h = true;
        do {
            this.f1087i = false;
            if (a0Var != null) {
                b(a0Var);
                a0Var = null;
            } else {
                l.g gVar = this.f1080b;
                gVar.getClass();
                l.d dVar = new l.d(gVar);
                gVar.f6575c.put(dVar, Boolean.FALSE);
                while (dVar.hasNext()) {
                    b((a0) ((Map.Entry) dVar.next()).getValue());
                    if (this.f1087i) {
                        break;
                    }
                }
            }
        } while (this.f1087i);
        this.f1086h = false;
    }

    public final Object d() {
        Object obj = this.f1083e;
        if (obj == f1078k) {
            return null;
        }
        return obj;
    }

    public final void e(u uVar, d0 d0Var) {
        Object obj;
        a("observe");
        if (((w) uVar.getLifecycle()).f1156c != o.DESTROYED) {
            z zVar = new z(this, uVar, d0Var);
            l.g gVar = this.f1080b;
            l.c b10 = gVar.b(d0Var);
            if (b10 != null) {
                obj = b10.f6565b;
            } else {
                l.c cVar = new l.c(d0Var, zVar);
                gVar.f6576d++;
                l.c cVar2 = gVar.f6574b;
                if (cVar2 == null) {
                    gVar.f6573a = cVar;
                    gVar.f6574b = cVar;
                } else {
                    cVar2.f6566c = cVar;
                    cVar.f6567d = cVar2;
                    gVar.f6574b = cVar;
                }
                obj = null;
            }
            a0 a0Var = (a0) obj;
            if (a0Var != null && !a0Var.c(uVar)) {
                throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
            }
            if (a0Var == null) {
                uVar.getLifecycle().a(zVar);
            }
        }
    }

    public /* bridge */ /* synthetic */ void f() {
    }

    public /* bridge */ /* synthetic */ void g() {
    }

    public final void h(Object obj) {
        boolean z9;
        synchronized (this.f1079a) {
            if (this.f1084f == f1078k) {
                z9 = true;
            } else {
                z9 = false;
            }
            this.f1084f = obj;
        }
        if (z9) {
            k.b.y().z(this.f1088j);
        }
    }

    public void i(d0 d0Var) {
        a("removeObserver");
        a0 a0Var = (a0) this.f1080b.c(d0Var);
        if (a0Var != null) {
            a0Var.b();
            a0Var.a(false);
        }
    }

    public void j(Object obj) {
        a("setValue");
        this.f1085g++;
        this.f1083e = obj;
        c(null);
    }

    public c0() {
        this.f1079a = new Object();
        this.f1080b = new l.g();
        this.f1081c = 0;
        Object obj = f1078k;
        this.f1084f = obj;
        this.f1088j = new g.f(this, 5);
        this.f1083e = obj;
        this.f1085g = -1;
    }
}
