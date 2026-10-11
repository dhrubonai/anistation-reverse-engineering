package androidx.lifecycle;

import android.os.Looper;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class w extends p {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f1154a;

    /* renamed from: b, reason: collision with root package name */
    public l.a f1155b;

    /* renamed from: c, reason: collision with root package name */
    public o f1156c;

    /* renamed from: d, reason: collision with root package name */
    public final WeakReference f1157d;

    /* renamed from: e, reason: collision with root package name */
    public int f1158e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f1159f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f1160g;

    /* renamed from: h, reason: collision with root package name */
    public final ArrayList f1161h;

    /* renamed from: i, reason: collision with root package name */
    public final r7.b f1162i;

    public w(u uVar) {
        r6.h0.u(uVar, "provider");
        this.f1154a = true;
        this.f1155b = new l.a();
        o oVar = o.INITIALIZED;
        this.f1156c = oVar;
        this.f1161h = new ArrayList();
        this.f1157d = new WeakReference(uVar);
        this.f1162i = new r7.b(oVar);
    }

    @Override // androidx.lifecycle.p
    public final void a(t tVar) {
        u uVar;
        boolean z9;
        r6.h0.u(tVar, "observer");
        d("addObserver");
        o oVar = this.f1156c;
        o oVar2 = o.DESTROYED;
        if (oVar != oVar2) {
            oVar2 = o.INITIALIZED;
        }
        v vVar = new v(tVar, oVar2);
        if (((v) this.f1155b.d(tVar, vVar)) != null || (uVar = (u) this.f1157d.get()) == null) {
            return;
        }
        if (this.f1158e == 0 && !this.f1159f) {
            z9 = false;
        } else {
            z9 = true;
        }
        o c6 = c(tVar);
        this.f1158e++;
        while (vVar.f1150a.compareTo(c6) < 0 && this.f1155b.f6562e.containsKey(tVar)) {
            o oVar3 = vVar.f1150a;
            ArrayList arrayList = this.f1161h;
            arrayList.add(oVar3);
            l lVar = n.Companion;
            o oVar4 = vVar.f1150a;
            lVar.getClass();
            n b10 = l.b(oVar4);
            if (b10 != null) {
                vVar.a(uVar, b10);
                arrayList.remove(arrayList.size() - 1);
                c6 = c(tVar);
            } else {
                throw new IllegalStateException("no event up from " + vVar.f1150a);
            }
        }
        if (!z9) {
            h();
        }
        this.f1158e--;
    }

    @Override // androidx.lifecycle.p
    public final void b(t tVar) {
        r6.h0.u(tVar, "observer");
        d("removeObserver");
        this.f1155b.c(tVar);
    }

    public final o c(t tVar) {
        l.c cVar;
        o oVar;
        v vVar;
        l.a aVar = this.f1155b;
        o oVar2 = null;
        if (aVar.f6562e.containsKey(tVar)) {
            cVar = ((l.c) aVar.f6562e.get(tVar)).f6567d;
        } else {
            cVar = null;
        }
        if (cVar != null && (vVar = (v) cVar.f6565b) != null) {
            oVar = vVar.f1150a;
        } else {
            oVar = null;
        }
        ArrayList arrayList = this.f1161h;
        if (!arrayList.isEmpty()) {
            oVar2 = (o) arrayList.get(arrayList.size() - 1);
        }
        o oVar3 = this.f1156c;
        r6.h0.u(oVar3, "state1");
        if (oVar == null || oVar.compareTo(oVar3) >= 0) {
            oVar = oVar3;
        }
        if (oVar2 == null || oVar2.compareTo(oVar) >= 0) {
            return oVar;
        }
        return oVar2;
    }

    public final void d(String str) {
        boolean z9;
        if (this.f1154a) {
            k.b.y().f6283l.getClass();
            if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
                z9 = true;
            } else {
                z9 = false;
            }
            if (!z9) {
                throw new IllegalStateException(r.f.e("Method ", str, " must be called on the main thread").toString());
            }
        }
    }

    public final void e(n nVar) {
        r6.h0.u(nVar, "event");
        d("handleLifecycleEvent");
        f(nVar.a());
    }

    public final void f(o oVar) {
        boolean z9;
        o oVar2 = this.f1156c;
        if (oVar2 == oVar) {
            return;
        }
        o oVar3 = o.INITIALIZED;
        o oVar4 = o.DESTROYED;
        if (oVar2 == oVar3 && oVar == oVar4) {
            z9 = false;
        } else {
            z9 = true;
        }
        if (z9) {
            this.f1156c = oVar;
            if (!this.f1159f && this.f1158e == 0) {
                this.f1159f = true;
                h();
                this.f1159f = false;
                if (this.f1156c == oVar4) {
                    this.f1155b = new l.a();
                    return;
                }
                return;
            }
            this.f1160g = true;
            return;
        }
        throw new IllegalStateException(("no event down from " + this.f1156c + " in component " + this.f1157d.get()).toString());
    }

    public final void g() {
        o oVar = o.CREATED;
        d("setCurrentState");
        f(oVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0163 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void h() {
        /*
            Method dump skipped, instructions count: 373
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.w.h():void");
    }
}
