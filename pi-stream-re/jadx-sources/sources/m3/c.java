package m3;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final c0 f7181a;

    /* renamed from: e, reason: collision with root package name */
    public View f7185e;

    /* renamed from: d, reason: collision with root package name */
    public int f7184d = 0;

    /* renamed from: b, reason: collision with root package name */
    public final k2.c f7182b = new k2.c();

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f7183c = new ArrayList();

    public c(c0 c0Var) {
        this.f7181a = c0Var;
    }

    public final void a(View view, int i10, boolean z9) {
        int f10;
        c0 c0Var = this.f7181a;
        if (i10 < 0) {
            f10 = c0Var.c();
        } else {
            f10 = f(i10);
        }
        this.f7182b.e(f10, z9);
        if (z9) {
            i(view);
        }
        c0Var.f7186a.addView(view, f10);
        RecyclerView.L(view);
    }

    public final void b(View view, int i10, ViewGroup.LayoutParams layoutParams, boolean z9) {
        int f10;
        c0 c0Var = this.f7181a;
        if (i10 < 0) {
            f10 = c0Var.c();
        } else {
            f10 = f(i10);
        }
        this.f7182b.e(f10, z9);
        if (z9) {
            i(view);
        }
        c0Var.getClass();
        a1 L = RecyclerView.L(view);
        RecyclerView recyclerView = c0Var.f7186a;
        if (L != null) {
            if (!L.l() && !L.p()) {
                StringBuilder sb = new StringBuilder("Called attach on a child which is not detached: ");
                sb.append(L);
                throw new IllegalArgumentException(a3.g.m(recyclerView, sb));
            }
            if (RecyclerView.R0) {
                Log.d("RecyclerView", "reAttach " + L);
            }
            L.f7162j &= -257;
        } else if (RecyclerView.Q0) {
            StringBuilder sb2 = new StringBuilder("No ViewHolder found for child: ");
            sb2.append(view);
            sb2.append(", index: ");
            sb2.append(f10);
            throw new IllegalArgumentException(a3.g.m(recyclerView, sb2));
        }
        recyclerView.attachViewToParent(view, f10, layoutParams);
    }

    public final void c(int i10) {
        int f10 = f(i10);
        this.f7182b.f(f10);
        c0 c0Var = this.f7181a;
        View childAt = c0Var.f7186a.getChildAt(f10);
        RecyclerView recyclerView = c0Var.f7186a;
        if (childAt != null) {
            a1 L = RecyclerView.L(childAt);
            if (L != null) {
                if (L.l() && !L.p()) {
                    StringBuilder sb = new StringBuilder("called detach on an already detached child ");
                    sb.append(L);
                    throw new IllegalArgumentException(a3.g.m(recyclerView, sb));
                }
                if (RecyclerView.R0) {
                    Log.d("RecyclerView", "tmpDetach " + L);
                }
                L.b(256);
            }
        } else if (RecyclerView.Q0) {
            StringBuilder sb2 = new StringBuilder("No view at offset ");
            sb2.append(f10);
            throw new IllegalArgumentException(a3.g.m(recyclerView, sb2));
        }
        recyclerView.detachViewFromParent(f10);
    }

    public final View d(int i10) {
        return this.f7181a.f7186a.getChildAt(f(i10));
    }

    public final int e() {
        return this.f7181a.c() - this.f7183c.size();
    }

    public final int f(int i10) {
        if (i10 < 0) {
            return -1;
        }
        int c6 = this.f7181a.c();
        int i11 = i10;
        while (i11 < c6) {
            k2.c cVar = this.f7182b;
            int b10 = i10 - (i11 - cVar.b(i11));
            if (b10 == 0) {
                while (cVar.d(i11)) {
                    i11++;
                }
                return i11;
            }
            i11 += b10;
        }
        return -1;
    }

    public final View g(int i10) {
        return this.f7181a.f7186a.getChildAt(i10);
    }

    public final int h() {
        return this.f7181a.c();
    }

    public final void i(View view) {
        this.f7183c.add(view);
        c0 c0Var = this.f7181a;
        c0Var.getClass();
        a1 L = RecyclerView.L(view);
        if (L != null) {
            int i10 = L.f7168q;
            View view2 = L.f7153a;
            if (i10 != -1) {
                L.f7167p = i10;
            } else {
                WeakHashMap weakHashMap = g0.y0.f4277a;
                L.f7167p = g0.h0.c(view2);
            }
            RecyclerView recyclerView = c0Var.f7186a;
            if (recyclerView.N()) {
                L.f7168q = 4;
                recyclerView.K0.add(L);
            } else {
                WeakHashMap weakHashMap2 = g0.y0.f4277a;
                g0.h0.s(view2, 4);
            }
        }
    }

    public final boolean j(View view) {
        return this.f7183c.contains(view);
    }

    public final void k(View view) {
        if (this.f7183c.remove(view)) {
            c0 c0Var = this.f7181a;
            c0Var.getClass();
            a1 L = RecyclerView.L(view);
            if (L != null) {
                int i10 = L.f7167p;
                RecyclerView recyclerView = c0Var.f7186a;
                if (recyclerView.N()) {
                    L.f7168q = i10;
                    recyclerView.K0.add(L);
                } else {
                    WeakHashMap weakHashMap = g0.y0.f4277a;
                    g0.h0.s(L.f7153a, i10);
                }
                L.f7167p = 0;
            }
        }
    }

    public final String toString() {
        return this.f7182b.toString() + ", hidden list:" + this.f7183c.size();
    }
}
