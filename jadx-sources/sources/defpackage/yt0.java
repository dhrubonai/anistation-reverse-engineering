package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.util.Log;
import android.view.View;
import android.view.ViewConfiguration;
import com.anistation.android.R;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class yt0 {
    public final View a;
    public boolean b;
    public qu0 c;
    public og3 d;
    public ga5 e;
    public ew6 f;
    public final rv2 g;
    public final f45 h;
    public final Configuration i;
    public final w44 j;
    public final k9 k;
    public final wf l;
    public final pz2 m;
    public final kn0 n;
    public final o82 o;
    public final w44 p;
    public final sj2 q;
    public final ag r;
    public final bb3 s;
    public final lf3 t;
    public final yg0 u;
    public int v;
    public final vt0 w;
    public qe x;
    public final xt0 y;

    /* JADX WARN: Multi-variable type inference failed */
    public yt0(yt0 yt0Var, View view, qu0 qu0Var, og3 og3Var, ga5 ga5Var, ew6 ew6Var) {
        Context context;
        rv2 rv2Var;
        f45 f45Var;
        Configuration configuration;
        w44 g;
        k9 k9Var;
        wf wfVar;
        pz2 pz2Var;
        kn0 x9Var;
        o82 m18Var;
        w44 ti4Var;
        sj2 mm4Var;
        ag agVar;
        bb3 bb3Var;
        yg0 yg0Var;
        if (yt0Var != null) {
            context = yt0Var.a.getContext();
        } else {
            context = null;
        }
        boolean i = a34.i(context, view.getContext());
        this.a = view;
        this.c = qu0Var;
        this.d = og3Var;
        this.e = ga5Var;
        this.f = ew6Var;
        if (i) {
            yt0Var.getClass();
            rv2Var = yt0Var.g;
        } else {
            rv2Var = new rv2();
        }
        this.g = rv2Var;
        if (yt0Var != null) {
            f45Var = yt0Var.h;
        } else {
            f45Var = new f45();
        }
        this.h = f45Var;
        if (i) {
            yt0Var.getClass();
            configuration = yt0Var.i;
        } else {
            configuration = new Configuration(view.getContext().getResources().getConfiguration());
        }
        this.i = configuration;
        if (i) {
            yt0Var.getClass();
            g = yt0Var.j;
        } else {
            g = xt5.g(new Configuration(configuration));
        }
        this.j = g;
        if (i) {
            yt0Var.getClass();
            k9Var = yt0Var.k;
        } else {
            Context context2 = view.getContext();
            Object obj = new Object();
            Object systemService = context2.getSystemService("accessibility");
            systemService.getClass();
            k9Var = obj;
        }
        this.k = k9Var;
        if (i) {
            yt0Var.getClass();
            wfVar = yt0Var.l;
        } else {
            wfVar = new wf(view.getContext());
        }
        this.l = wfVar;
        if (i) {
            yt0Var.getClass();
            pz2Var = yt0Var.m;
        } else {
            pz2Var = new pz2(view.getContext(), (byte) 3);
        }
        this.m = pz2Var;
        if (i) {
            yt0Var.getClass();
            x9Var = yt0Var.n;
        } else {
            x9Var = new x9(pz2Var);
        }
        this.n = x9Var;
        if (i) {
            yt0Var.getClass();
            m18Var = yt0Var.o;
        } else {
            view.getContext();
            m18Var = new m18((byte) 5);
        }
        this.o = m18Var;
        if (i) {
            yt0Var.getClass();
            ti4Var = yt0Var.p;
        } else {
            ti4Var = new ti4(te4.x(view.getContext()), pk2.c0);
        }
        this.p = ti4Var;
        if (view == (yt0Var != null ? yt0Var.a : null)) {
            mm4Var = yt0Var.q;
        } else {
            mm4Var = new mm4(view);
        }
        this.q = mm4Var;
        if (i) {
            yt0Var.getClass();
            agVar = yt0Var.r;
        } else {
            agVar = new ag(ViewConfiguration.get(view.getContext()));
        }
        this.r = agVar;
        if (yt0Var != null) {
            bb3Var = yt0Var.s;
        } else {
            bb3Var = new bb3();
        }
        this.s = bb3Var;
        this.t = new lf3();
        if (yt0Var != null) {
            yg0Var = yt0Var.u;
        } else {
            yg0Var = new yg0();
        }
        this.u = yg0Var;
        this.w = new vt0(this, (byte) 0);
        this.y = new xt0(this);
    }

    public final void a(oa oaVar, os0 os0Var, kd2 kd2Var, int i) {
        int i2;
        int i3;
        int i4;
        boolean z;
        Set set;
        View view;
        Object obj;
        kd2Var.f0(123858079);
        if (kd2Var.h(oaVar)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i5 = i2 | i;
        if (kd2Var.h(os0Var)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i6 = i5 | i3;
        if (kd2Var.h(this)) {
            i4 = 256;
        } else {
            i4 = 128;
        }
        int i7 = i6 | i4;
        if ((i7 & 147) != 146) {
            z = true;
        } else {
            z = false;
        }
        if (kd2Var.V(i7 & 1, z)) {
            Object tag = oaVar.getTag(R.id.inspection_slot_table_set);
            Set set2 = null;
            if ((tag instanceof Set) && (!(tag instanceof j73) || (tag instanceof q73))) {
                set = (Set) tag;
            } else {
                set = null;
            }
            if (set == null) {
                Object parent = oaVar.getParent();
                if (parent instanceof View) {
                    view = (View) parent;
                } else {
                    view = null;
                }
                if (view != null) {
                    obj = view.getTag(R.id.inspection_slot_table_set);
                } else {
                    obj = null;
                }
                if ((obj instanceof Set) && (!(obj instanceof j73) || (obj instanceof q73))) {
                    set2 = (Set) obj;
                }
            } else {
                set2 = set;
            }
            if (set2 != null) {
                set2.add(kd2Var.z());
                kd2Var.q = true;
                kd2Var.C = true;
                kd2Var.c.c();
                kd2Var.H.c();
                bs5 bs5Var = kd2Var.I;
                yr5 yr5Var = bs5Var.a;
                bs5Var.e = yr5Var.G;
                bs5Var.f = yr5Var.H;
            }
            boolean f = kd2Var.f(oaVar.getView());
            Object Q = kd2Var.Q();
            q18 q18Var = au0.a;
            if (f || Q == q18Var) {
                Q = new qw6(oaVar.getView());
                kd2Var.n0(Q);
            }
            qw6 qw6Var = (qw6) Q;
            mw4 a = vj3.a.a(d());
            jw4 jw4Var = ck3.a;
            g();
            ga5 ga5Var = this.e;
            ga5Var.getClass();
            mw4 a2 = jw4Var.a(ga5Var);
            mw4 a3 = eb.d.a(this.g);
            mw4 a4 = eb.e.a(this.h);
            tq1 tq1Var = bv0.v;
            boolean h = kd2Var.h(this);
            Object Q2 = kd2Var.Q();
            if (h || Q2 == q18Var) {
                Q2 = new l0(this, (byte) 28);
                kd2Var.n0(Q2);
            }
            mw4 c = tq1Var.c((ub2) Q2);
            mw4 a5 = eb.b.a(oaVar.getContext());
            mw4 a6 = j03.a.a(set2);
            mw4 a7 = eb.a.a(oaVar.getConfiguration());
            tq1 tq1Var2 = p95.a;
            boolean h2 = kd2Var.h(oaVar);
            Object Q3 = kd2Var.Q();
            if (h2 || Q3 == q18Var) {
                Q3 = new y9(oaVar, (byte) 3);
                kd2Var.n0(Q3);
            }
            mw4 c2 = tq1Var2.c((ub2) Q3);
            mw4 a8 = eb.f.a(oaVar.getView());
            tq1 tq1Var3 = bv0.x;
            boolean h3 = kd2Var.h(oaVar);
            Object Q4 = kd2Var.Q();
            if (h3 || Q4 == q18Var) {
                Q4 = new y9(oaVar, (byte) 4);
                kd2Var.n0(Q4);
            }
            kb0.c(new mw4[]{a, a2, a3, a4, c, a5, a6, a7, c2, a8, tq1Var3.c((ub2) Q4), bv0.t.a(oaVar.getViewConfiguration()), do2.a.a(qw6Var)}, nx7.R(1317454175, new wt0(oaVar, this, os0Var), kd2Var), kd2Var, 56);
        } else {
            kd2Var.Y();
        }
        zz4 u = kd2Var.u();
        if (u != null) {
            u.d = new wt0(this, oaVar, os0Var, i);
        }
    }

    public final void b() {
        int i = this.v - 1;
        this.v = i;
        if (i < 0) {
            Log.e("ComposeViewContext", "View count has dropped below 0");
            i = 0;
            this.v = 0;
        }
        if (i == 0) {
            View view = this.a;
            Context context = view.getContext();
            xt0 xt0Var = this.y;
            context.unregisterComponentCallbacks(xt0Var);
            lf3 lf3Var = this.t;
            if (lf3Var.b == null) {
                lf3Var.a = null;
            }
            view.getViewTreeObserver().removeOnWindowFocusChangeListener(xt0Var);
        }
    }

    public final qu0 c() {
        g();
        qu0 qu0Var = this.c;
        qu0Var.getClass();
        return qu0Var;
    }

    public final og3 d() {
        g();
        og3 og3Var = this.d;
        og3Var.getClass();
        return og3Var;
    }

    public final void e() {
        int i = this.v + 1;
        this.v = i;
        if (i == 1) {
            View view = this.a;
            Context context = view.getContext();
            xt0 xt0Var = this.y;
            context.registerComponentCallbacks(xt0Var);
            f(view.getResources().getConfiguration());
            boolean hasWindowFocus = view.hasWindowFocus();
            lf3 lf3Var = this.t;
            lf3Var.c.setValue(Boolean.valueOf(hasWindowFocus));
            ti4 ti4Var = lf3Var.b;
            vt0 vt0Var = this.w;
            if (ti4Var == null) {
                lf3Var.a = vt0Var;
            }
            if (ti4Var != null) {
                ti4Var.setValue(vt0Var.invoke());
            }
            view.getViewTreeObserver().addOnWindowFocusChangeListener(xt0Var);
        }
    }

    public final void f(Configuration configuration) {
        int updateFrom = this.i.updateFrom(configuration);
        if (updateFrom != 0) {
            Iterator it = this.g.a.entrySet().iterator();
            while (it.hasNext()) {
                pv2 pv2Var = (pv2) ((WeakReference) ((Map.Entry) it.next()).getValue()).get();
                if (pv2Var == null || Configuration.needNewResources(updateFrom, pv2Var.b)) {
                    it.remove();
                }
            }
            this.j.setValue(new Configuration(configuration));
            f45 f45Var = this.h;
            synchronized (f45Var) {
                f45Var.a.c();
            }
            if ((268435456 & updateFrom) != 0) {
                this.p.setValue(te4.x(this.a.getContext()));
            }
            if ((805248384 & updateFrom) != 0) {
                lf3 lf3Var = this.t;
                vt0 vt0Var = this.w;
                ti4 ti4Var = lf3Var.b;
                if (ti4Var != null) {
                    ti4Var.setValue(vt0Var.invoke());
                }
            }
        }
    }

    public final void g() {
        if (!this.b) {
            this.b = true;
            qu0 qu0Var = this.c;
            View view = this.a;
            if (qu0Var == null) {
                qu0 a = p67.a(view);
                if (a == null) {
                    Object parent = view.getParent();
                    while (a == null && (parent instanceof View)) {
                        View view2 = (View) parent;
                        a = p67.a(view2);
                        parent = nz5.d(view2);
                    }
                }
                if (a == null) {
                    a = p67.b(view);
                }
                this.c = a;
            }
            if (this.d == null) {
                og3 c = rz5.c(view);
                if (c != null) {
                    this.d = c;
                } else {
                    ze0.m("Composed into a View which doesn't propagate ViewTreeLifecycleOwner!");
                    return;
                }
            }
            if (this.e == null) {
                ga5 f = qs5.f(view);
                if (f != null) {
                    this.e = f;
                } else {
                    ze0.m("Composed into a View which doesn't propagate ViewTreeSavedStateRegistryOwner!");
                    return;
                }
            }
            if (this.f == null) {
                this.f = ss5.d(view);
            }
        }
    }
}
