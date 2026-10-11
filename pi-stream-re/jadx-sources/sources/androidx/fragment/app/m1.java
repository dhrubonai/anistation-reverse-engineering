package androidx.fragment.app;

import android.util.Log;
import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class m1 {

    /* renamed from: a, reason: collision with root package name */
    public int f932a;

    /* renamed from: b, reason: collision with root package name */
    public int f933b;

    /* renamed from: c, reason: collision with root package name */
    public final y f934c;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f935d;

    /* renamed from: e, reason: collision with root package name */
    public final HashSet f936e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f937f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f938g;

    /* renamed from: h, reason: collision with root package name */
    public final z0 f939h;

    public m1(int i10, int i11, z0 z0Var, c0.d dVar) {
        y yVar = z0Var.f1062c;
        this.f935d = new ArrayList();
        this.f936e = new HashSet();
        this.f937f = false;
        this.f938g = false;
        this.f932a = i10;
        this.f933b = i11;
        this.f934c = yVar;
        dVar.a(new o(this));
        this.f939h = z0Var;
    }

    public final void a() {
        if (!this.f937f) {
            this.f937f = true;
            if (this.f936e.isEmpty()) {
                b();
                return;
            }
            Iterator it = new ArrayList(this.f936e).iterator();
            while (it.hasNext()) {
                c0.d dVar = (c0.d) it.next();
                synchronized (dVar) {
                    if (!dVar.f1602a) {
                        dVar.f1602a = true;
                        dVar.f1604c = true;
                        c0.c cVar = dVar.f1603b;
                        if (cVar != null) {
                            try {
                                cVar.p();
                            } catch (Throwable th) {
                                synchronized (dVar) {
                                    dVar.f1604c = false;
                                    dVar.notifyAll();
                                    throw th;
                                }
                            }
                        }
                        synchronized (dVar) {
                            dVar.f1604c = false;
                            dVar.notifyAll();
                        }
                    }
                }
            }
        }
    }

    public final void b() {
        if (!this.f938g) {
            if (s0.H(2)) {
                Log.v("FragmentManager", "SpecialEffectsController: " + this + " has called complete.");
            }
            this.f938g = true;
            Iterator it = this.f935d.iterator();
            while (it.hasNext()) {
                ((Runnable) it.next()).run();
            }
        }
        this.f939h.k();
    }

    public final void c(int i10, int i11) {
        if (i11 != 0) {
            int i12 = i11 - 1;
            y yVar = this.f934c;
            if (i12 != 0) {
                if (i12 != 1) {
                    if (i12 == 2) {
                        if (s0.H(2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: For fragment " + yVar + " mFinalState = " + a3.g.E(this.f932a) + " -> REMOVED. mLifecycleImpact  = " + a3.g.D(this.f933b) + " to REMOVING.");
                        }
                        this.f932a = 1;
                        this.f933b = 3;
                        return;
                    }
                    return;
                }
                if (this.f932a == 1) {
                    if (s0.H(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: For fragment " + yVar + " mFinalState = REMOVED -> VISIBLE. mLifecycleImpact = " + a3.g.D(this.f933b) + " to ADDING.");
                    }
                    this.f932a = 2;
                    this.f933b = 2;
                    return;
                }
                return;
            }
            if (this.f932a != 1) {
                if (s0.H(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: For fragment " + yVar + " mFinalState = " + a3.g.E(this.f932a) + " -> " + a3.g.E(i10) + ". ");
                }
                this.f932a = i10;
                return;
            }
            return;
        }
        throw null;
    }

    public final void d() {
        float f10;
        int i10 = this.f933b;
        z0 z0Var = this.f939h;
        if (i10 == 2) {
            y yVar = z0Var.f1062c;
            View findFocus = yVar.V.findFocus();
            if (findFocus != null) {
                yVar.h().f1019m = findFocus;
                if (s0.H(2)) {
                    Log.v("FragmentManager", "requestFocus: Saved focused view " + findFocus + " for Fragment " + yVar);
                }
            }
            View P = this.f934c.P();
            if (P.getParent() == null) {
                z0Var.b();
                P.setAlpha(0.0f);
            }
            if (P.getAlpha() == 0.0f && P.getVisibility() == 0) {
                P.setVisibility(4);
            }
            v vVar = yVar.Y;
            if (vVar == null) {
                f10 = 1.0f;
            } else {
                f10 = vVar.f1018l;
            }
            P.setAlpha(f10);
            return;
        }
        if (i10 == 3) {
            y yVar2 = z0Var.f1062c;
            View P2 = yVar2.P();
            if (s0.H(2)) {
                Log.v("FragmentManager", "Clearing focus " + P2.findFocus() + " on view " + P2 + " for Fragment " + yVar2);
            }
            P2.clearFocus();
        }
    }

    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public final String toString() {
        return "Operation {" + Integer.toHexString(System.identityHashCode(this)) + "} {mFinalState = " + a3.g.E(this.f932a) + "} {mLifecycleImpact = " + a3.g.D(this.f933b) + "} {mFragment = " + this.f934c + "}";
    }
}
