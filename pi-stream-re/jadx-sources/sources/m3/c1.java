package m3;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public final class c1 extends g0.c {

    /* renamed from: d, reason: collision with root package name */
    public final RecyclerView f7187d;

    /* renamed from: e, reason: collision with root package name */
    public final b1 f7188e;

    public c1(RecyclerView recyclerView) {
        this.f7187d = recyclerView;
        b1 b1Var = this.f7188e;
        if (b1Var != null) {
            this.f7188e = b1Var;
        } else {
            this.f7188e = new b1(this);
        }
    }

    @Override // g0.c
    public final void c(View view, AccessibilityEvent accessibilityEvent) {
        boolean z9;
        super.c(view, accessibilityEvent);
        if (view instanceof RecyclerView) {
            RecyclerView recyclerView = this.f7187d;
            if (recyclerView.L && !recyclerView.T && !recyclerView.f1236e.g()) {
                z9 = false;
            } else {
                z9 = true;
            }
            if (!z9) {
                RecyclerView recyclerView2 = (RecyclerView) view;
                if (recyclerView2.getLayoutManager() != null) {
                    recyclerView2.getLayoutManager().R(accessibilityEvent);
                }
            }
        }
    }

    @Override // g0.c
    public final void d(View view, h0.h hVar) {
        boolean z9;
        this.f4171a.onInitializeAccessibilityNodeInfo(view, hVar.f4539a);
        RecyclerView recyclerView = this.f7187d;
        if (recyclerView.L && !recyclerView.T && !recyclerView.f1236e.g()) {
            z9 = false;
        } else {
            z9 = true;
        }
        if (!z9 && recyclerView.getLayoutManager() != null) {
            k0 layoutManager = recyclerView.getLayoutManager();
            RecyclerView recyclerView2 = layoutManager.f7279b;
            layoutManager.S(recyclerView2.f1232c, recyclerView2.f1258x0, hVar);
        }
    }

    @Override // g0.c
    public final boolean g(View view, int i10, Bundle bundle) {
        boolean z9;
        int i11;
        int C;
        if (super.g(view, i10, bundle)) {
            return true;
        }
        RecyclerView recyclerView = this.f7187d;
        if (recyclerView.L && !recyclerView.T && !recyclerView.f1236e.g()) {
            z9 = false;
        } else {
            z9 = true;
        }
        if (z9 || recyclerView.getLayoutManager() == null) {
            return false;
        }
        k0 layoutManager = recyclerView.getLayoutManager();
        a3.h hVar = layoutManager.f7279b.f1232c;
        int i12 = layoutManager.o;
        int i13 = layoutManager.f7291n;
        Rect rect = new Rect();
        if (layoutManager.f7279b.getMatrix().isIdentity() && layoutManager.f7279b.getGlobalVisibleRect(rect)) {
            i12 = rect.height();
            i13 = rect.width();
        }
        if (i10 != 4096) {
            if (i10 != 8192) {
                i11 = 0;
                C = 0;
            } else {
                if (layoutManager.f7279b.canScrollVertically(-1)) {
                    i11 = -((i12 - layoutManager.E()) - layoutManager.B());
                } else {
                    i11 = 0;
                }
                if (layoutManager.f7279b.canScrollHorizontally(-1)) {
                    C = -((i13 - layoutManager.C()) - layoutManager.D());
                }
                C = 0;
            }
        } else {
            if (layoutManager.f7279b.canScrollVertically(1)) {
                i11 = (i12 - layoutManager.E()) - layoutManager.B();
            } else {
                i11 = 0;
            }
            if (layoutManager.f7279b.canScrollHorizontally(1)) {
                C = (i13 - layoutManager.C()) - layoutManager.D();
            }
            C = 0;
        }
        if (i11 == 0 && C == 0) {
            return false;
        }
        layoutManager.f7279b.g0(C, i11, true);
        return true;
    }
}
