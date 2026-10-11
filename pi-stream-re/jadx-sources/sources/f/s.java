package f;

import android.os.Build;
import android.view.View;
import android.view.Window;
import android.view.WindowInsets;
import androidx.appcompat.widget.c2;
import androidx.appcompat.widget.s1;
import g0.a2;
import g0.b2;
import g0.k2;
import g0.y0;
import g0.z1;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class s implements g0.y, c2, s1, j.b0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3777a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g0 f3778b;

    public /* synthetic */ s(g0 g0Var, int i10) {
        this.f3777a = i10;
        this.f3778b = g0Var;
    }

    @Override // j.b0
    public final void a(j.o oVar, boolean z9) {
        boolean z10;
        int i10;
        f0 f0Var;
        int i11 = this.f3777a;
        g0 g0Var = this.f3778b;
        switch (i11) {
            case 3:
                g0Var.s(oVar);
                return;
            default:
                j.o k10 = oVar.k();
                int i12 = 0;
                if (k10 != oVar) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    oVar = k10;
                }
                f0[] f0VarArr = g0Var.f3682d0;
                if (f0VarArr != null) {
                    i10 = f0VarArr.length;
                } else {
                    i10 = 0;
                }
                while (true) {
                    if (i12 < i10) {
                        f0Var = f0VarArr[i12];
                        if (f0Var == null || f0Var.f3670h != oVar) {
                            i12++;
                        }
                    } else {
                        f0Var = null;
                    }
                }
                if (f0Var != null) {
                    if (z10) {
                        g0Var.r(f0Var.f3663a, f0Var, k10);
                        g0Var.t(f0Var, true);
                        return;
                    } else {
                        g0Var.t(f0Var, z9);
                        return;
                    }
                }
                return;
        }
    }

    @Override // j.b0
    public final boolean m(j.o oVar) {
        Window.Callback C;
        int i10 = this.f3777a;
        g0 g0Var = this.f3778b;
        switch (i10) {
            case 3:
                Window.Callback C2 = g0Var.C();
                if (C2 != null) {
                    C2.onMenuOpened(108, oVar);
                }
                return true;
            default:
                if (oVar == oVar.k() && g0Var.X && (C = g0Var.C()) != null && !g0Var.f3687i0) {
                    C.onMenuOpened(108, oVar);
                }
                return true;
        }
    }

    @Override // g0.y
    public final k2 o(View view, k2 k2Var) {
        g0.c2 z1Var;
        int e10 = k2Var.e();
        int L = this.f3778b.L(k2Var, null);
        if (e10 != L) {
            int c6 = k2Var.c();
            int d10 = k2Var.d();
            int b10 = k2Var.b();
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 30) {
                z1Var = new b2(k2Var);
            } else if (i10 >= 29) {
                z1Var = new a2(k2Var);
            } else {
                z1Var = new z1(k2Var);
            }
            z1Var.g(z.d.b(c6, L, d10, b10));
            k2Var = z1Var.b();
        }
        WeakHashMap weakHashMap = y0.f4277a;
        WindowInsets g10 = k2Var.g();
        if (g10 != null) {
            WindowInsets b11 = g0.l0.b(view, g10);
            if (!b11.equals(g10)) {
                return k2.h(view, b11);
            }
            return k2Var;
        }
        return k2Var;
    }
}
