package androidx.fragment.app;

import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.util.Log;
import android.view.Surface;
import android.view.View;
import android.view.WindowManager;

/* loaded from: classes.dex */
public class o implements androidx.lifecycle.d0, c0.c, b2.v, b2.g0, p6.g {

    /* renamed from: a, reason: collision with root package name */
    public final Object f947a;

    public /* synthetic */ o(Object obj) {
        this.f947a = obj;
    }

    @Override // p6.h
    public Object a() {
        return this.f947a;
    }

    @Override // b2.v
    public void b() {
    }

    @Override // b2.v
    public void c(w.f fVar) {
        fVar.h(((WindowManager) this.f947a).getDefaultDisplay());
    }

    @Override // b2.g0
    public void d() {
        b2.l lVar = (b2.l) this.f947a;
        w7.b.w(lVar.f1356g1);
        Surface surface = lVar.f1356g1;
        b2.e0 e0Var = lVar.Y0;
        Handler handler = e0Var.f1336a;
        if (handler != null) {
            handler.post(new b2.c0(e0Var, surface, SystemClock.elapsedRealtime(), 0));
        }
        lVar.f1359j1 = true;
    }

    @Override // b2.g0
    public void e() {
        ((b2.l) this.f947a).K0(0, 1);
    }

    @Override // androidx.lifecycle.d0
    public void f(Object obj) {
        if (((androidx.lifecycle.u) obj) != null) {
            q qVar = (q) this.f947a;
            if (qVar.f957t0) {
                View P = qVar.P();
                if (P.getParent() == null) {
                    if (qVar.f961x0 != null) {
                        if (s0.H(3)) {
                            Log.d("FragmentManager", "DialogFragment " + this + " setting the content view on " + qVar.f961x0);
                        }
                        qVar.f961x0.setContentView(P);
                        return;
                    }
                    return;
                }
                throw new IllegalStateException("DialogFragment can not be attached to a container view");
            }
        }
    }

    public h0.h g(int i10) {
        return null;
    }

    public h0.h h(int i10) {
        return null;
    }

    public boolean i(int i10, int i11, Bundle bundle) {
        return false;
    }

    @Override // b2.g0
    public void o() {
    }

    @Override // c0.c
    public void p() {
        ((m1) this.f947a).a();
    }

    public o() {
        if (Build.VERSION.SDK_INT >= 26) {
            this.f947a = new h0.k(this);
        } else {
            this.f947a = new h0.j(this);
        }
    }
}
