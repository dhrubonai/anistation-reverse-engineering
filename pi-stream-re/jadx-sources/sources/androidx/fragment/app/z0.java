package androidx.fragment.app;

import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.internal.p002firebaseauthapi.zzaja;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.WeakHashMap;
import msr.pistream.app.R;

/* loaded from: classes.dex */
public final class z0 {

    /* renamed from: a, reason: collision with root package name */
    public final h0 f1060a;

    /* renamed from: b, reason: collision with root package name */
    public final i.g f1061b;

    /* renamed from: c, reason: collision with root package name */
    public final y f1062c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f1063d = false;

    /* renamed from: e, reason: collision with root package name */
    public int f1064e = -1;

    public z0(h0 h0Var, i.g gVar, y yVar) {
        this.f1060a = h0Var;
        this.f1061b = gVar;
        this.f1062c = yVar;
    }

    public final void a() {
        boolean H = s0.H(3);
        y yVar = this.f1062c;
        if (H) {
            Log.d("FragmentManager", "moveto ACTIVITY_CREATED: " + yVar);
        }
        Bundle bundle = yVar.f1031b;
        yVar.K.M();
        yVar.f1029a = 3;
        yVar.T = false;
        yVar.t();
        if (yVar.T) {
            if (s0.H(3)) {
                Log.d("FragmentManager", "moveto RESTORE_VIEW_STATE: " + yVar);
            }
            View view = yVar.V;
            if (view != null) {
                Bundle bundle2 = yVar.f1031b;
                SparseArray<Parcelable> sparseArray = yVar.f1033c;
                if (sparseArray != null) {
                    view.restoreHierarchyState(sparseArray);
                    yVar.f1033c = null;
                }
                if (yVar.V != null) {
                    yVar.f1038e0.f915e.b(yVar.f1035d);
                    yVar.f1035d = null;
                }
                yVar.T = false;
                yVar.J(bundle2);
                if (yVar.T) {
                    if (yVar.V != null) {
                        yVar.f1038e0.a(androidx.lifecycle.n.ON_CREATE);
                    }
                } else {
                    throw new o1(a3.g.r("Fragment ", yVar, " did not call through to super.onViewStateRestored()"));
                }
            }
            yVar.f1031b = null;
            t0 t0Var = yVar.K;
            t0Var.E = false;
            t0Var.F = false;
            t0Var.L.f1027f = false;
            t0Var.t(4);
            this.f1060a.a(false);
            return;
        }
        throw new o1(a3.g.r("Fragment ", yVar, " did not call through to super.onActivityCreated()"));
    }

    public final void b() {
        View view;
        View view2;
        i.g gVar = this.f1061b;
        gVar.getClass();
        y yVar = this.f1062c;
        ViewGroup viewGroup = yVar.U;
        int i10 = -1;
        if (viewGroup != null) {
            int indexOf = ((ArrayList) gVar.f5198d).indexOf(yVar);
            int i11 = indexOf - 1;
            while (true) {
                if (i11 < 0) {
                    while (true) {
                        indexOf++;
                        if (indexOf >= ((ArrayList) gVar.f5198d).size()) {
                            break;
                        }
                        y yVar2 = (y) ((ArrayList) gVar.f5198d).get(indexOf);
                        if (yVar2.U == viewGroup && (view = yVar2.V) != null) {
                            i10 = viewGroup.indexOfChild(view);
                            break;
                        }
                    }
                } else {
                    y yVar3 = (y) ((ArrayList) gVar.f5198d).get(i11);
                    if (yVar3.U == viewGroup && (view2 = yVar3.V) != null) {
                        i10 = viewGroup.indexOfChild(view2) + 1;
                        break;
                    }
                    i11--;
                }
            }
        }
        yVar.U.addView(yVar.V, i10);
    }

    public final void c() {
        boolean H = s0.H(3);
        y yVar = this.f1062c;
        if (H) {
            Log.d("FragmentManager", "moveto ATTACHED: " + yVar);
        }
        y yVar2 = yVar.f1046x;
        z0 z0Var = null;
        i.g gVar = this.f1061b;
        if (yVar2 != null) {
            z0 z0Var2 = (z0) ((HashMap) gVar.f5196b).get(yVar2.f1037e);
            if (z0Var2 != null) {
                yVar.f1047y = yVar.f1046x.f1037e;
                yVar.f1046x = null;
                z0Var = z0Var2;
            } else {
                throw new IllegalStateException("Fragment " + yVar + " declared target fragment " + yVar.f1046x + " that does not belong to this FragmentManager!");
            }
        } else {
            String str = yVar.f1047y;
            if (str != null && (z0Var = (z0) ((HashMap) gVar.f5196b).get(str)) == null) {
                StringBuilder sb = new StringBuilder("Fragment ");
                sb.append(yVar);
                sb.append(" declared target fragment ");
                throw new IllegalStateException(a3.g.t(sb, yVar.f1047y, " that does not belong to this FragmentManager!"));
            }
        }
        if (z0Var != null) {
            z0Var.k();
        }
        s0 s0Var = yVar.I;
        yVar.J = s0Var.f986t;
        yVar.L = s0Var.f988v;
        h0 h0Var = this.f1060a;
        h0Var.g(false);
        ArrayList arrayList = yVar.f1044j0;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((x) it.next()).a();
        }
        arrayList.clear();
        yVar.K.b(yVar.J, yVar.f(), yVar);
        yVar.f1029a = 0;
        yVar.T = false;
        yVar.w(yVar.J.D);
        if (yVar.T) {
            Iterator it2 = yVar.I.f980m.iterator();
            while (it2.hasNext()) {
                ((x0) it2.next()).a(yVar);
            }
            t0 t0Var = yVar.K;
            t0Var.E = false;
            t0Var.F = false;
            t0Var.L.f1027f = false;
            t0Var.t(0);
            h0Var.b(false);
            return;
        }
        throw new o1(a3.g.r("Fragment ", yVar, " did not call through to super.onAttach()"));
    }

    public final int d() {
        m1 m1Var;
        y yVar = this.f1062c;
        if (yVar.I == null) {
            return yVar.f1029a;
        }
        int i10 = this.f1064e;
        int ordinal = yVar.f1034c0.ordinal();
        int i11 = 0;
        if (ordinal != 1) {
            if (ordinal != 2) {
                if (ordinal != 3) {
                    if (ordinal != 4) {
                        i10 = Math.min(i10, -1);
                    }
                } else {
                    i10 = Math.min(i10, 5);
                }
            } else {
                i10 = Math.min(i10, 1);
            }
        } else {
            i10 = Math.min(i10, 0);
        }
        if (yVar.D) {
            if (yVar.E) {
                i10 = Math.max(this.f1064e, 2);
                View view = yVar.V;
                if (view != null && view.getParent() == null) {
                    i10 = Math.min(i10, 2);
                }
            } else {
                i10 = this.f1064e < 4 ? Math.min(i10, yVar.f1029a) : Math.min(i10, 1);
            }
        }
        if (!yVar.B) {
            i10 = Math.min(i10, 1);
        }
        ViewGroup viewGroup = yVar.U;
        if (viewGroup != null) {
            n1 f10 = n1.f(viewGroup, yVar.m().F());
            f10.getClass();
            m1 d10 = f10.d(yVar);
            if (d10 != null) {
                i11 = d10.f933b;
            }
            Iterator it = f10.f944c.iterator();
            while (true) {
                if (it.hasNext()) {
                    m1Var = (m1) it.next();
                    if (m1Var.f934c.equals(yVar) && !m1Var.f937f) {
                        break;
                    }
                } else {
                    m1Var = null;
                    break;
                }
            }
            if (m1Var != null && (i11 == 0 || i11 == 1)) {
                i11 = m1Var.f933b;
            }
        }
        if (i11 == 2) {
            i10 = Math.min(i10, 6);
        } else if (i11 == 3) {
            i10 = Math.max(i10, 3);
        } else if (yVar.C) {
            if (yVar.s()) {
                i10 = Math.min(i10, 1);
            } else {
                i10 = Math.min(i10, -1);
            }
        }
        if (yVar.W && yVar.f1029a < 5) {
            i10 = Math.min(i10, 4);
        }
        if (s0.H(2)) {
            Log.v("FragmentManager", "computeExpectedState() of " + i10 + " for " + yVar);
        }
        return i10;
    }

    public final void e() {
        boolean H = s0.H(3);
        y yVar = this.f1062c;
        if (H) {
            Log.d("FragmentManager", "moveto CREATED: " + yVar);
        }
        if (!yVar.f1030a0) {
            h0 h0Var = this.f1060a;
            h0Var.h(false);
            Bundle bundle = yVar.f1031b;
            yVar.K.M();
            yVar.f1029a = 1;
            yVar.T = false;
            yVar.f1036d0.a(new t(yVar));
            yVar.f1042h0.b(bundle);
            yVar.x(bundle);
            yVar.f1030a0 = true;
            if (yVar.T) {
                yVar.f1036d0.e(androidx.lifecycle.n.ON_CREATE);
                h0Var.c(false);
                return;
            }
            throw new o1(a3.g.r("Fragment ", yVar, " did not call through to super.onCreate()"));
        }
        yVar.Q(yVar.f1031b);
        yVar.f1029a = 1;
    }

    public final void f() {
        String str;
        y yVar = this.f1062c;
        if (yVar.D) {
            return;
        }
        if (s0.H(3)) {
            Log.d("FragmentManager", "moveto CREATE_VIEW: " + yVar);
        }
        LayoutInflater C = yVar.C(yVar.f1031b);
        ViewGroup viewGroup = yVar.U;
        if (viewGroup == null) {
            int i10 = yVar.N;
            if (i10 != 0) {
                if (i10 != -1) {
                    viewGroup = (ViewGroup) yVar.I.f987u.P(i10);
                    if (viewGroup == null) {
                        if (!yVar.F) {
                            try {
                                str = yVar.O().getResources().getResourceName(yVar.N);
                            } catch (Resources.NotFoundException unused) {
                                str = "unknown";
                            }
                            throw new IllegalArgumentException("No view found for id 0x" + Integer.toHexString(yVar.N) + " (" + str + ") for fragment " + yVar);
                        }
                    } else if (!(viewGroup instanceof FragmentContainerView)) {
                        v0.b bVar = v0.c.f10351a;
                        v0.d dVar = new v0.d(yVar, viewGroup, 1);
                        v0.c.c(dVar);
                        v0.b a10 = v0.c.a(yVar);
                        if (a10.f10349a.contains(v0.a.DETECT_WRONG_FRAGMENT_CONTAINER) && v0.c.e(a10, yVar.getClass(), v0.d.class)) {
                            v0.c.b(a10, dVar);
                        }
                    }
                } else {
                    throw new IllegalArgumentException(a3.g.r("Cannot create fragment ", yVar, " for a container view with no id"));
                }
            } else {
                viewGroup = null;
            }
        }
        yVar.U = viewGroup;
        yVar.L(C, viewGroup, yVar.f1031b);
        View view = yVar.V;
        if (view != null) {
            view.setSaveFromParentEnabled(false);
            yVar.V.setTag(R.id.fragment_container_view_tag, yVar);
            if (viewGroup != null) {
                b();
            }
            if (yVar.P) {
                yVar.V.setVisibility(8);
            }
            View view2 = yVar.V;
            WeakHashMap weakHashMap = g0.y0.f4277a;
            if (g0.k0.b(view2)) {
                g0.l0.c(yVar.V);
            } else {
                View view3 = yVar.V;
                view3.addOnAttachStateChangeListener(new f0(this, view3));
            }
            yVar.I();
            yVar.K.t(2);
            this.f1060a.m(false);
            int visibility = yVar.V.getVisibility();
            yVar.h().f1018l = yVar.V.getAlpha();
            if (yVar.U != null && visibility == 0) {
                View findFocus = yVar.V.findFocus();
                if (findFocus != null) {
                    yVar.h().f1019m = findFocus;
                    if (s0.H(2)) {
                        Log.v("FragmentManager", "requestFocus: Saved focused view " + findFocus + " for Fragment " + yVar);
                    }
                }
                yVar.V.setAlpha(0.0f);
            }
        }
        yVar.f1029a = 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00dd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void g() {
        /*
            Method dump skipped, instructions count: 240
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.z0.g():void");
    }

    public final void h() {
        boolean z9;
        View view;
        boolean H = s0.H(3);
        y yVar = this.f1062c;
        if (H) {
            Log.d("FragmentManager", "movefrom CREATE_VIEW: " + yVar);
        }
        ViewGroup viewGroup = yVar.U;
        if (viewGroup != null && (view = yVar.V) != null) {
            viewGroup.removeView(view);
        }
        yVar.K.t(1);
        if (yVar.V != null) {
            j1 j1Var = yVar.f1038e0;
            j1Var.b();
            if (j1Var.f914d.f1156c.compareTo(androidx.lifecycle.o.CREATED) >= 0) {
                z9 = true;
            } else {
                z9 = false;
            }
            if (z9) {
                yVar.f1038e0.a(androidx.lifecycle.n.ON_DESTROY);
            }
        }
        yVar.f1029a = 1;
        yVar.T = false;
        yVar.A();
        if (yVar.T) {
            n.l lVar = z0.a.a(yVar).f11887b.f11884a;
            int i10 = lVar.f7895c;
            for (int i11 = 0; i11 < i10; i11++) {
                ((z0.b) lVar.f7894b[i11]).k();
            }
            yVar.G = false;
            this.f1060a.n(false);
            yVar.U = null;
            yVar.V = null;
            yVar.f1038e0 = null;
            yVar.f1040f0.j(null);
            yVar.E = false;
            return;
        }
        throw new o1(a3.g.r("Fragment ", yVar, " did not call through to super.onDestroyView()"));
    }

    public final void i() {
        boolean H = s0.H(3);
        y yVar = this.f1062c;
        if (H) {
            Log.d("FragmentManager", "movefrom ATTACHED: " + yVar);
        }
        yVar.f1029a = -1;
        boolean z9 = false;
        yVar.T = false;
        yVar.B();
        if (yVar.T) {
            t0 t0Var = yVar.K;
            if (!t0Var.G) {
                t0Var.k();
                yVar.K = new t0();
            }
            this.f1060a.e(false);
            yVar.f1029a = -1;
            yVar.J = null;
            yVar.L = null;
            yVar.I = null;
            boolean z10 = true;
            if (yVar.C && !yVar.s()) {
                z9 = true;
            }
            if (!z9) {
                w0 w0Var = (w0) this.f1061b.f5199e;
                if (w0Var.f1022a.containsKey(yVar.f1037e) && w0Var.f1025d) {
                    z10 = w0Var.f1026e;
                }
                if (!z10) {
                    return;
                }
            }
            if (s0.H(3)) {
                Log.d("FragmentManager", "initState called for fragment: " + yVar);
            }
            yVar.p();
            return;
        }
        throw new o1(a3.g.r("Fragment ", yVar, " did not call through to super.onDetach()"));
    }

    public final void j() {
        y yVar = this.f1062c;
        if (yVar.D && yVar.E && !yVar.G) {
            if (s0.H(3)) {
                Log.d("FragmentManager", "moveto CREATE_VIEW: " + yVar);
            }
            yVar.L(yVar.C(yVar.f1031b), null, yVar.f1031b);
            View view = yVar.V;
            if (view != null) {
                view.setSaveFromParentEnabled(false);
                yVar.V.setTag(R.id.fragment_container_view_tag, yVar);
                if (yVar.P) {
                    yVar.V.setVisibility(8);
                }
                yVar.I();
                yVar.K.t(2);
                this.f1060a.m(false);
                yVar.f1029a = 2;
            }
        }
    }

    public final void k() {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        ViewGroup viewGroup3;
        i.g gVar = this.f1061b;
        boolean z9 = this.f1063d;
        y yVar = this.f1062c;
        if (z9) {
            if (s0.H(2)) {
                Log.v("FragmentManager", "Ignoring re-entrant call to moveToExpectedState() for " + yVar);
                return;
            }
            return;
        }
        try {
            this.f1063d = true;
            boolean z10 = false;
            while (true) {
                int d10 = d();
                int i10 = yVar.f1029a;
                if (d10 != i10) {
                    if (d10 > i10) {
                        switch (i10 + 1) {
                            case 0:
                                c();
                                break;
                            case 1:
                                e();
                                break;
                            case 2:
                                j();
                                f();
                                break;
                            case 3:
                                a();
                                break;
                            case 4:
                                if (yVar.V != null && (viewGroup3 = yVar.U) != null) {
                                    n1 f10 = n1.f(viewGroup3, yVar.m().F());
                                    int c6 = a3.g.c(yVar.V.getVisibility());
                                    f10.getClass();
                                    if (s0.H(2)) {
                                        Log.v("FragmentManager", "SpecialEffectsController: Enqueuing add operation for fragment " + yVar);
                                    }
                                    f10.a(c6, 2, this);
                                }
                                yVar.f1029a = 4;
                                break;
                            case 5:
                                q();
                                break;
                            case 6:
                                yVar.f1029a = 6;
                                break;
                            case zzaja.zze.zzg /* 7 */:
                                n();
                                break;
                        }
                    } else {
                        switch (i10 - 1) {
                            case -1:
                                i();
                                break;
                            case 0:
                                g();
                                break;
                            case 1:
                                h();
                                yVar.f1029a = 1;
                                break;
                            case 2:
                                yVar.E = false;
                                yVar.f1029a = 2;
                                break;
                            case 3:
                                if (s0.H(3)) {
                                    Log.d("FragmentManager", "movefrom ACTIVITY_CREATED: " + yVar);
                                }
                                if (yVar.V != null && yVar.f1033c == null) {
                                    p();
                                }
                                if (yVar.V != null && (viewGroup2 = yVar.U) != null) {
                                    n1 f11 = n1.f(viewGroup2, yVar.m().F());
                                    f11.getClass();
                                    if (s0.H(2)) {
                                        Log.v("FragmentManager", "SpecialEffectsController: Enqueuing remove operation for fragment " + yVar);
                                    }
                                    f11.a(1, 3, this);
                                }
                                yVar.f1029a = 3;
                                break;
                            case 4:
                                r();
                                break;
                            case 5:
                                yVar.f1029a = 5;
                                break;
                            case 6:
                                l();
                                break;
                        }
                    }
                    z10 = true;
                } else {
                    if (!z10 && i10 == -1 && yVar.C && !yVar.s()) {
                        if (s0.H(3)) {
                            Log.d("FragmentManager", "Cleaning up state of never attached fragment: " + yVar);
                        }
                        ((w0) gVar.f5199e).b(yVar);
                        gVar.H(this);
                        if (s0.H(3)) {
                            Log.d("FragmentManager", "initState called for fragment: " + yVar);
                        }
                        yVar.p();
                    }
                    if (yVar.Z) {
                        if (yVar.V != null && (viewGroup = yVar.U) != null) {
                            n1 f12 = n1.f(viewGroup, yVar.m().F());
                            if (yVar.P) {
                                f12.getClass();
                                if (s0.H(2)) {
                                    Log.v("FragmentManager", "SpecialEffectsController: Enqueuing hide operation for fragment " + yVar);
                                }
                                f12.a(3, 1, this);
                            } else {
                                f12.getClass();
                                if (s0.H(2)) {
                                    Log.v("FragmentManager", "SpecialEffectsController: Enqueuing show operation for fragment " + yVar);
                                }
                                f12.a(2, 1, this);
                            }
                        }
                        s0 s0Var = yVar.I;
                        if (s0Var != null && yVar.B && s0.I(yVar)) {
                            s0Var.D = true;
                        }
                        yVar.Z = false;
                        yVar.K.n();
                    }
                    return;
                }
            }
        } finally {
            this.f1063d = false;
        }
    }

    public final void l() {
        boolean H = s0.H(3);
        y yVar = this.f1062c;
        if (H) {
            Log.d("FragmentManager", "movefrom RESUMED: " + yVar);
        }
        yVar.K.t(5);
        if (yVar.V != null) {
            yVar.f1038e0.a(androidx.lifecycle.n.ON_PAUSE);
        }
        yVar.f1036d0.e(androidx.lifecycle.n.ON_PAUSE);
        yVar.f1029a = 6;
        yVar.T = true;
        this.f1060a.f(false);
    }

    public final void m(ClassLoader classLoader) {
        y yVar = this.f1062c;
        Bundle bundle = yVar.f1031b;
        if (bundle == null) {
            return;
        }
        bundle.setClassLoader(classLoader);
        yVar.f1033c = yVar.f1031b.getSparseParcelableArray("android:view_state");
        yVar.f1035d = yVar.f1031b.getBundle("android:view_registry_state");
        String string = yVar.f1031b.getString("android:target_state");
        yVar.f1047y = string;
        if (string != null) {
            yVar.f1048z = yVar.f1031b.getInt("android:target_req_state", 0);
        }
        boolean z9 = yVar.f1031b.getBoolean("android:user_visible_hint", true);
        yVar.X = z9;
        if (!z9) {
            yVar.W = true;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0042  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void n() {
        /*
            r9 = this;
            r0 = 3
            boolean r0 = androidx.fragment.app.s0.H(r0)
            java.lang.String r1 = "FragmentManager"
            androidx.fragment.app.y r2 = r9.f1062c
            if (r0 == 0) goto L1c
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r3 = "moveto RESUMED: "
            r0.<init>(r3)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            android.util.Log.d(r1, r0)
        L1c:
            androidx.fragment.app.v r0 = r2.Y
            r3 = 0
            if (r0 != 0) goto L23
            r0 = r3
            goto L25
        L23:
            android.view.View r0 = r0.f1019m
        L25:
            r4 = 0
            r5 = 1
            if (r0 == 0) goto L83
            android.view.View r6 = r2.V
            if (r0 != r6) goto L2e
            goto L38
        L2e:
            android.view.ViewParent r6 = r0.getParent()
        L32:
            if (r6 == 0) goto L3f
            android.view.View r7 = r2.V
            if (r6 != r7) goto L3a
        L38:
            r6 = r5
            goto L40
        L3a:
            android.view.ViewParent r6 = r6.getParent()
            goto L32
        L3f:
            r6 = r4
        L40:
            if (r6 == 0) goto L83
            boolean r6 = r0.requestFocus()
            r7 = 2
            boolean r7 = androidx.fragment.app.s0.H(r7)
            if (r7 == 0) goto L83
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r8 = "requestFocus: Restoring focused view "
            r7.<init>(r8)
            r7.append(r0)
            java.lang.String r0 = " "
            r7.append(r0)
            if (r6 == 0) goto L61
            java.lang.String r0 = "succeeded"
            goto L63
        L61:
            java.lang.String r0 = "failed"
        L63:
            r7.append(r0)
            java.lang.String r0 = " on Fragment "
            r7.append(r0)
            r7.append(r2)
            java.lang.String r0 = " resulting in focused view "
            r7.append(r0)
            android.view.View r0 = r2.V
            android.view.View r0 = r0.findFocus()
            r7.append(r0)
            java.lang.String r0 = r7.toString()
            android.util.Log.v(r1, r0)
        L83:
            androidx.fragment.app.v r0 = r2.h()
            r0.f1019m = r3
            androidx.fragment.app.t0 r0 = r2.K
            r0.M()
            androidx.fragment.app.t0 r0 = r2.K
            r0.x(r5)
            r0 = 7
            r2.f1029a = r0
            r2.T = r4
            r2.E()
            boolean r1 = r2.T
            if (r1 == 0) goto Lca
            androidx.lifecycle.w r1 = r2.f1036d0
            androidx.lifecycle.n r5 = androidx.lifecycle.n.ON_RESUME
            r1.e(r5)
            android.view.View r1 = r2.V
            if (r1 == 0) goto Lb1
            androidx.fragment.app.j1 r1 = r2.f1038e0
            androidx.lifecycle.w r1 = r1.f914d
            r1.e(r5)
        Lb1:
            androidx.fragment.app.t0 r1 = r2.K
            r1.E = r4
            r1.F = r4
            androidx.fragment.app.w0 r5 = r1.L
            r5.f1027f = r4
            r1.t(r0)
            androidx.fragment.app.h0 r0 = r9.f1060a
            r0.i(r4)
            r2.f1031b = r3
            r2.f1033c = r3
            r2.f1035d = r3
            return
        Lca:
            androidx.fragment.app.o1 r0 = new androidx.fragment.app.o1
            java.lang.String r1 = "Fragment "
            java.lang.String r3 = " did not call through to super.onResume()"
            java.lang.String r1 = a3.g.r(r1, r2, r3)
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.z0.n():void");
    }

    public final void o() {
        y yVar = this.f1062c;
        y0 y0Var = new y0(yVar);
        if (yVar.f1029a > -1 && y0Var.D == null) {
            Bundle bundle = new Bundle();
            yVar.F(bundle);
            yVar.f1042h0.c(bundle);
            bundle.putParcelable("android:support:fragments", yVar.K.T());
            this.f1060a.j(false);
            if (bundle.isEmpty()) {
                bundle = null;
            }
            if (yVar.V != null) {
                p();
            }
            if (yVar.f1033c != null) {
                if (bundle == null) {
                    bundle = new Bundle();
                }
                bundle.putSparseParcelableArray("android:view_state", yVar.f1033c);
            }
            if (yVar.f1035d != null) {
                if (bundle == null) {
                    bundle = new Bundle();
                }
                bundle.putBundle("android:view_registry_state", yVar.f1035d);
            }
            if (!yVar.X) {
                if (bundle == null) {
                    bundle = new Bundle();
                }
                bundle.putBoolean("android:user_visible_hint", yVar.X);
            }
            y0Var.D = bundle;
            if (yVar.f1047y != null) {
                if (bundle == null) {
                    y0Var.D = new Bundle();
                }
                y0Var.D.putString("android:target_state", yVar.f1047y);
                int i10 = yVar.f1048z;
                if (i10 != 0) {
                    y0Var.D.putInt("android:target_req_state", i10);
                }
            }
        } else {
            y0Var.D = yVar.f1031b;
        }
        this.f1061b.R(yVar.f1037e, y0Var);
    }

    public final void p() {
        y yVar = this.f1062c;
        if (yVar.V == null) {
            return;
        }
        if (s0.H(2)) {
            Log.v("FragmentManager", "Saving view state for fragment " + yVar + " with view " + yVar.V);
        }
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        yVar.V.saveHierarchyState(sparseArray);
        if (sparseArray.size() > 0) {
            yVar.f1033c = sparseArray;
        }
        Bundle bundle = new Bundle();
        yVar.f1038e0.f915e.c(bundle);
        if (!bundle.isEmpty()) {
            yVar.f1035d = bundle;
        }
    }

    public final void q() {
        boolean H = s0.H(3);
        y yVar = this.f1062c;
        if (H) {
            Log.d("FragmentManager", "moveto STARTED: " + yVar);
        }
        yVar.K.M();
        yVar.K.x(true);
        yVar.f1029a = 5;
        yVar.T = false;
        yVar.G();
        if (yVar.T) {
            androidx.lifecycle.w wVar = yVar.f1036d0;
            androidx.lifecycle.n nVar = androidx.lifecycle.n.ON_START;
            wVar.e(nVar);
            if (yVar.V != null) {
                yVar.f1038e0.f914d.e(nVar);
            }
            t0 t0Var = yVar.K;
            t0Var.E = false;
            t0Var.F = false;
            t0Var.L.f1027f = false;
            t0Var.t(5);
            this.f1060a.k(false);
            return;
        }
        throw new o1(a3.g.r("Fragment ", yVar, " did not call through to super.onStart()"));
    }

    public final void r() {
        boolean H = s0.H(3);
        y yVar = this.f1062c;
        if (H) {
            Log.d("FragmentManager", "movefrom STARTED: " + yVar);
        }
        t0 t0Var = yVar.K;
        t0Var.F = true;
        t0Var.L.f1027f = true;
        t0Var.t(4);
        if (yVar.V != null) {
            yVar.f1038e0.a(androidx.lifecycle.n.ON_STOP);
        }
        yVar.f1036d0.e(androidx.lifecycle.n.ON_STOP);
        yVar.f1029a = 4;
        yVar.T = false;
        yVar.H();
        if (yVar.T) {
            this.f1060a.l(false);
            return;
        }
        throw new o1(a3.g.r("Fragment ", yVar, " did not call through to super.onStop()"));
    }

    public z0(h0 h0Var, i.g gVar, ClassLoader classLoader, m0 m0Var, y0 y0Var) {
        this.f1060a = h0Var;
        this.f1061b = gVar;
        y a10 = m0Var.a(y0Var.f1049a);
        Bundle bundle = y0Var.A;
        if (bundle != null) {
            bundle.setClassLoader(classLoader);
        }
        a10.S(bundle);
        a10.f1037e = y0Var.f1050b;
        a10.D = y0Var.f1051c;
        a10.F = true;
        a10.M = y0Var.f1052d;
        a10.N = y0Var.f1053e;
        a10.O = y0Var.f1054f;
        a10.R = y0Var.f1055x;
        a10.C = y0Var.f1056y;
        a10.Q = y0Var.f1057z;
        a10.P = y0Var.B;
        a10.f1034c0 = androidx.lifecycle.o.values()[y0Var.C];
        Bundle bundle2 = y0Var.D;
        if (bundle2 != null) {
            a10.f1031b = bundle2;
        } else {
            a10.f1031b = new Bundle();
        }
        this.f1062c = a10;
        if (s0.H(2)) {
            Log.v("FragmentManager", "Instantiated fragment " + a10);
        }
    }

    public z0(h0 h0Var, i.g gVar, y yVar, y0 y0Var) {
        this.f1060a = h0Var;
        this.f1061b = gVar;
        this.f1062c = yVar;
        yVar.f1033c = null;
        yVar.f1035d = null;
        yVar.H = 0;
        yVar.E = false;
        yVar.B = false;
        y yVar2 = yVar.f1046x;
        yVar.f1047y = yVar2 != null ? yVar2.f1037e : null;
        yVar.f1046x = null;
        Bundle bundle = y0Var.D;
        if (bundle != null) {
            yVar.f1031b = bundle;
        } else {
            yVar.f1031b = new Bundle();
        }
    }
}
