package f;

import android.view.MenuItem;
import android.view.ViewGroup;
import g0.l1;
import g0.y0;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class u implements i.a {

    /* renamed from: a, reason: collision with root package name */
    public final i.a f3788a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g0 f3789b;

    public u(g0 g0Var, i.g gVar) {
        this.f3789b = g0Var;
        this.f3788a = gVar;
    }

    @Override // i.a
    public final boolean a(i.b bVar, MenuItem menuItem) {
        return this.f3788a.a(bVar, menuItem);
    }

    @Override // i.a
    public final boolean b(i.b bVar, j.o oVar) {
        ViewGroup viewGroup = this.f3789b.S;
        WeakHashMap weakHashMap = y0.f4277a;
        g0.l0.c(viewGroup);
        return this.f3788a.b(bVar, oVar);
    }

    @Override // i.a
    public final void c(i.b bVar) {
        this.f3788a.c(bVar);
        g0 g0Var = this.f3789b;
        if (g0Var.N != null) {
            g0Var.C.getDecorView().removeCallbacks(g0Var.O);
        }
        if (g0Var.M != null) {
            l1 l1Var = g0Var.P;
            if (l1Var != null) {
                l1Var.b();
            }
            l1 a10 = y0.a(g0Var.M);
            a10.a(0.0f);
            g0Var.P = a10;
            a10.d(new t(this, 2));
        }
        m mVar = g0Var.E;
        if (mVar != null) {
            mVar.a();
        }
        g0Var.L = null;
        ViewGroup viewGroup = g0Var.S;
        WeakHashMap weakHashMap = y0.f4277a;
        g0.l0.c(viewGroup);
        g0Var.K();
    }

    @Override // i.a
    public final boolean d(i.b bVar, j.o oVar) {
        return this.f3788a.d(bVar, oVar);
    }
}
