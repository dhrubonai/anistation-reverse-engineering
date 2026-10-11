package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import com.anistation.android.R;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public abstract class p67 {
    public static final p44 a;

    static {
        long[] jArr = cb5.a;
        a = new p44();
    }

    public static final qu0 a(View view) {
        Object tag = view.getTag(R.id.androidx_compose_ui_view_composition_context);
        if (tag instanceof qu0) {
            return (qu0) tag;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.Object, w05] */
    public static final h05 b(View view) {
        l11 l11Var;
        uf ufVar;
        fg3 fg3Var;
        if (!view.isAttachedToWindow()) {
            ez2.b("Cannot locate windowRecomposer; View " + view + " is not attached to a window");
        }
        Object d = nz5.d(view);
        while (d instanceof View) {
            View view2 = (View) d;
            if (view2.getId() == 16908290) {
                break;
            }
            d = view2.getParent();
            view = view2;
        }
        qu0 a2 = a(view);
        vz0 vz0Var = null;
        if (a2 == null) {
            ((j67) k67.a.get()).getClass();
            it1 it1Var = it1.x;
            d46 d46Var = sf.I;
            if (Looper.myLooper() == Looper.getMainLooper()) {
                l11Var = (l11) sf.I.getValue();
            } else {
                l11Var = (l11) sf.J.get();
                if (l11Var == null) {
                    ze0.m("no AndroidUiDispatcher for this thread");
                    return null;
                }
            }
            l11 plus = l11Var.plus(it1Var);
            uf ufVar2 = (uf) plus.get(pk2.Z);
            if (ufVar2 != null) {
                uf ufVar3 = new uf(ufVar2);
                tu tuVar = (tu) ufVar3.z;
                synchronized (tuVar.y) {
                    tuVar.x = false;
                    ufVar = ufVar3;
                }
            } else {
                ufVar = 0;
            }
            ?? obj = new Object();
            l11 l11Var2 = (q04) plus.get(h95.G);
            if (l11Var2 == null) {
                l11Var2 = new r04(view.getContext().getApplicationContext());
                obj.x = l11Var2;
            }
            if (ufVar != 0) {
                it1Var = ufVar;
            }
            l11 plus2 = plus.plus(it1Var).plus(l11Var2);
            h05 h05Var = new h05(plus2);
            synchronized (h05Var.c) {
                h05Var.t = true;
            }
            ke0 b = db.b(plus2);
            og3 c = rz5.c(view);
            if (c != null) {
                fg3Var = c.getLifecycle();
            } else {
                fg3Var = null;
            }
            if (fg3Var != null) {
                view.addOnAttachStateChangeListener(new l67(view, h05Var));
                fg3Var.a(new n67(b, ufVar, h05Var, obj));
                view.setTag(R.id.androidx_compose_ui_view_composition_context, h05Var);
                jf2 jf2Var = jf2.x;
                Handler handler = view.getHandler();
                int i = kj2.a;
                view.addOnAttachStateChangeListener(new nc(tl7.z(jf2Var, new jj2(handler, "windowRecomposer cleanup", false).B, null, new vj6(h05Var, view, vz0Var, (byte) 7), 2), (byte) 2));
                return h05Var;
            }
            ez2.c("ViewTreeLifecycleOwner not found from " + view);
            v71.e();
            return null;
        }
        if (a2 instanceof h05) {
            return (h05) a2;
        }
        ze0.m("root viewTreeParentCompositionContext is not a Recomposer");
        return null;
    }
}
