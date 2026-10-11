package com.google.android.material.carousel;

import a3.h;
import android.graphics.Rect;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import m3.a0;
import m3.k0;
import m3.l0;
import m3.w0;
import y5.a;
import y5.b;
import z3.e;

/* loaded from: classes.dex */
public class CarouselLayoutManager extends k0 {

    /* renamed from: p, reason: collision with root package name */
    public int f2695p;

    public CarouselLayoutManager() {
        new a();
        k0();
    }

    public static e A0(float f10, List list, boolean z9) {
        float f11 = Float.MAX_VALUE;
        int i10 = -1;
        int i11 = -1;
        int i12 = -1;
        int i13 = -1;
        float f12 = -3.4028235E38f;
        float f13 = Float.MAX_VALUE;
        float f14 = Float.MAX_VALUE;
        for (int i14 = 0; i14 < list.size(); i14++) {
            ((b) list.get(i14)).getClass();
            float abs = Math.abs(0.0f - f10);
            if (0.0f <= f10 && abs <= f11) {
                i10 = i14;
                f11 = abs;
            }
            if (0.0f > f10 && abs <= f13) {
                i12 = i14;
                f13 = abs;
            }
            if (0.0f <= f14) {
                i11 = i14;
                f14 = 0.0f;
            }
            if (0.0f > f12) {
                i13 = i14;
                f12 = 0.0f;
            }
        }
        if (i10 == -1) {
            i10 = i11;
        }
        if (i12 == -1) {
            i12 = i13;
        }
        return new e((b) list.get(i10), (b) list.get(i12));
    }

    public static float z0(float f10, e eVar) {
        b bVar = (b) eVar.f12044b;
        bVar.getClass();
        b bVar2 = (b) eVar.f12045c;
        bVar2.getClass();
        bVar.getClass();
        bVar2.getClass();
        return t5.a.a(0.0f, 0.0f, 0.0f, 0.0f, f10);
    }

    public final boolean B0() {
        if (A() == 1) {
            return true;
        }
        return false;
    }

    public final void C0() {
        B0();
        throw null;
    }

    @Override // m3.k0
    public final void R(AccessibilityEvent accessibilityEvent) {
        super.R(accessibilityEvent);
        if (v() > 0) {
            accessibilityEvent.setFromIndex(k0.F(u(0)));
            accessibilityEvent.setToIndex(k0.F(u(v() - 1)));
        }
    }

    @Override // m3.k0
    public final void a0(h hVar, w0 w0Var) {
        if (w0Var.b() <= 0) {
            f0(hVar);
        } else {
            B0();
            hVar.d(0);
            throw new IllegalStateException("All children of a RecyclerView using CarouselLayoutManager must use MaskableFrameLayout as their root ViewGroup.");
        }
    }

    @Override // m3.k0
    public final void b0(w0 w0Var) {
        if (v() != 0) {
            k0.F(u(0));
        }
    }

    @Override // m3.k0
    public final boolean d() {
        return true;
    }

    @Override // m3.k0
    public final int j(w0 w0Var) {
        throw null;
    }

    @Override // m3.k0
    public final boolean j0(RecyclerView recyclerView, View view, Rect rect, boolean z9, boolean z10) {
        return false;
    }

    @Override // m3.k0
    public final int k(w0 w0Var) {
        return this.f2695p;
    }

    @Override // m3.k0
    public final int l(w0 w0Var) {
        return 0 - 0;
    }

    @Override // m3.k0
    public final int l0(int i10, h hVar, w0 w0Var) {
        if (v() != 0 && i10 != 0) {
            int i11 = this.f2695p;
            int i12 = i11 + i10;
            if (i12 < 0 || i12 > 0) {
                i10 = 0 - i11;
            }
            this.f2695p = i11 + i10;
            C0();
            throw null;
        }
        return 0;
    }

    @Override // m3.k0
    public final void m0(int i10) {
    }

    @Override // m3.k0
    public final l0 r() {
        return new l0(-2, -2);
    }

    @Override // m3.k0
    public final void w0(RecyclerView recyclerView, int i10) {
        a0 a0Var = new a0(2, recyclerView.getContext(), this);
        a0Var.f7391a = i10;
        x0(a0Var);
    }

    @Override // m3.k0
    public final void y(View view, Rect rect) {
        super.y(view, rect);
        rect.centerX();
        throw null;
    }
}
