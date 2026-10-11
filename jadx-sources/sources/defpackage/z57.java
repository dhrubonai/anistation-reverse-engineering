package defpackage;

import android.graphics.Path;
import android.os.Build;
import android.view.View;
import com.anistation.android.R;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class z57 {
    public static final WeakHashMap w = new WeakHashMap();
    public final qg a;
    public final qg b;
    public final qg c;
    public final qg d;
    public final qg e;
    public final qg f;
    public final qg g;
    public final qg h;
    public final qg i;
    public final xq6 j;
    public final ti4 k;
    public final mn6 l;
    public final xq6 m;
    public final xq6 n;
    public final xq6 o;
    public final xq6 p;
    public final xq6 q;
    public final xq6 r;
    public final xq6 s;
    public final boolean t;
    public int u;
    public final c03 v;

    public z57(View view) {
        View view2;
        Object obj;
        Boolean bool;
        boolean z;
        qg qgVar = new qg(4, "captionBar");
        this.a = qgVar;
        qg qgVar2 = new qg(128, "displayCutout");
        this.b = qgVar2;
        qg qgVar3 = new qg(8, "ime");
        this.c = qgVar3;
        qg qgVar4 = new qg(32, "mandatorySystemGestures");
        this.d = qgVar4;
        qg qgVar5 = new qg(2, "navigationBars");
        this.e = qgVar5;
        qg qgVar6 = new qg(1, "statusBars");
        this.f = qgVar6;
        qg qgVar7 = new qg(519, "systemBars");
        this.g = qgVar7;
        qg qgVar8 = new qg(16, "systemGestures");
        this.h = qgVar8;
        qg qgVar9 = new qg(64, "tappableElement");
        this.i = qgVar9;
        xq6 xq6Var = new xq6(new h03(0, 0, 0, 0), "waterfall");
        this.j = xq6Var;
        this.k = xt5.g(null);
        mn6 mn6Var = new mn6(new mn6(qgVar7, qgVar3), qgVar2);
        this.l = mn6Var;
        new mn6(mn6Var, new mn6(new mn6(new mn6(qgVar9, qgVar4), qgVar8), xq6Var));
        this.m = mv5.i(4, "captionBarIgnoringVisibility");
        this.n = mv5.i(2, "navigationBarsIgnoringVisibility");
        this.o = mv5.i(1, "statusBarsIgnoringVisibility");
        this.p = mv5.i(519, "systemBarsIgnoringVisibility");
        this.q = mv5.i(64, "tappableElementIgnoringVisibility");
        this.r = new xq6(new h03(0, 0, 0, 0), "imeAnimationTarget");
        this.s = new xq6(new h03(0, 0, 0, 0), "imeAnimationSource");
        Object parent = view.getParent();
        if (parent instanceof View) {
            view2 = (View) parent;
        } else {
            view2 = null;
        }
        if (view2 != null) {
            obj = view2.getTag(R.id.consume_window_insets_tag);
        } else {
            obj = null;
        }
        if (obj instanceof Boolean) {
            bool = (Boolean) obj;
        } else {
            bool = null;
        }
        if (bool != null) {
            z = bool.booleanValue();
        } else {
            z = false;
        }
        this.t = z;
        this.v = new c03(this);
        int i = pv6.a;
        v57 a = lv6.a(view);
        if (a != null) {
            s57 s57Var = a.a;
            qgVar.f(s57Var.u(4));
            qgVar2.f(s57Var.u(128));
            qgVar3.f(s57Var.u(8));
            qgVar4.f(s57Var.u(32));
            qgVar5.f(s57Var.u(2));
            qgVar6.f(s57Var.u(1));
            qgVar7.f(s57Var.u(519));
            qgVar8.f(s57Var.u(16));
            qgVar9.f(s57Var.u(64));
        }
    }

    public static void b(z57 z57Var, v57 v57Var) {
        yz2 yz2Var;
        Path path;
        boolean z = false;
        z57Var.a.g(v57Var, 0);
        z57Var.c.g(v57Var, 0);
        z57Var.b.g(v57Var, 0);
        z57Var.e.g(v57Var, 0);
        z57Var.f.g(v57Var, 0);
        z57Var.g.g(v57Var, 0);
        z57Var.h.g(v57Var, 0);
        z57Var.i.g(v57Var, 0);
        z57Var.d.g(v57Var, 0);
        z57Var.m.f(ov5.h(v57Var.a.j(4)));
        z57Var.n.f(ov5.h(v57Var.a.j(2)));
        z57Var.o.f(ov5.h(v57Var.a.j(1)));
        z57Var.p.f(ov5.h(v57Var.a.j(519)));
        z57Var.q.f(ov5.h(v57Var.a.j(64)));
        th1 h = v57Var.a.h();
        xq6 xq6Var = z57Var.j;
        if (h != null) {
            yz2Var = h.a();
        } else {
            yz2Var = yz2.e;
        }
        xq6Var.f(ov5.h(yz2Var));
        id idVar = null;
        if (h != null) {
            if (Build.VERSION.SDK_INT >= 31) {
                path = hb.c(h.a);
            } else {
                path = null;
            }
            if (path != null) {
                idVar = new id(path);
            }
        }
        z57Var.k.setValue(idVar);
        synchronized (mt5.c) {
            q44 q44Var = mt5.j.h;
            if (q44Var != null) {
                if (q44Var.h()) {
                    z = true;
                }
            }
        }
        if (z) {
            mt5.c();
        }
    }

    public final void a(View view) {
        if (this.u == 0) {
            c03 c03Var = this.v;
            c03Var.A = false;
            c03Var.B = false;
            c03Var.C = null;
            int i = pv6.a;
            kv6.b(view, c03Var);
            if (view.isAttachedToWindow()) {
                view.requestApplyInsets();
            }
            view.addOnAttachStateChangeListener(c03Var);
            c57.a(view, c03Var);
        }
        this.u++;
    }
}
