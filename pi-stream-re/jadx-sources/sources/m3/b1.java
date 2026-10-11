package m3;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.recyclerview.widget.RecyclerView;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class b1 extends g0.c {

    /* renamed from: d, reason: collision with root package name */
    public final c1 f7179d;

    /* renamed from: e, reason: collision with root package name */
    public final WeakHashMap f7180e = new WeakHashMap();

    public b1(c1 c1Var) {
        this.f7179d = c1Var;
    }

    @Override // g0.c
    public final boolean a(View view, AccessibilityEvent accessibilityEvent) {
        g0.c cVar = (g0.c) this.f7180e.get(view);
        if (cVar != null) {
            return cVar.a(view, accessibilityEvent);
        }
        return super.a(view, accessibilityEvent);
    }

    @Override // g0.c
    public final androidx.fragment.app.o b(View view) {
        g0.c cVar = (g0.c) this.f7180e.get(view);
        if (cVar != null) {
            return cVar.b(view);
        }
        return super.b(view);
    }

    @Override // g0.c
    public final void c(View view, AccessibilityEvent accessibilityEvent) {
        g0.c cVar = (g0.c) this.f7180e.get(view);
        if (cVar != null) {
            cVar.c(view, accessibilityEvent);
        } else {
            super.c(view, accessibilityEvent);
        }
    }

    @Override // g0.c
    public final void d(View view, h0.h hVar) {
        boolean z9;
        c1 c1Var = this.f7179d;
        RecyclerView recyclerView = c1Var.f7187d;
        if (recyclerView.L && !recyclerView.T && !recyclerView.f1236e.g()) {
            z9 = false;
        } else {
            z9 = true;
        }
        AccessibilityNodeInfo accessibilityNodeInfo = hVar.f4539a;
        View.AccessibilityDelegate accessibilityDelegate = this.f4171a;
        if (!z9) {
            RecyclerView recyclerView2 = c1Var.f7187d;
            if (recyclerView2.getLayoutManager() != null) {
                recyclerView2.getLayoutManager().U(view, hVar);
                g0.c cVar = (g0.c) this.f7180e.get(view);
                if (cVar != null) {
                    cVar.d(view, hVar);
                    return;
                } else {
                    accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                    return;
                }
            }
        }
        accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
    }

    @Override // g0.c
    public final void e(View view, AccessibilityEvent accessibilityEvent) {
        g0.c cVar = (g0.c) this.f7180e.get(view);
        if (cVar != null) {
            cVar.e(view, accessibilityEvent);
        } else {
            super.e(view, accessibilityEvent);
        }
    }

    @Override // g0.c
    public final boolean f(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        g0.c cVar = (g0.c) this.f7180e.get(viewGroup);
        if (cVar != null) {
            return cVar.f(viewGroup, view, accessibilityEvent);
        }
        return super.f(viewGroup, view, accessibilityEvent);
    }

    @Override // g0.c
    public final boolean g(View view, int i10, Bundle bundle) {
        boolean z9;
        c1 c1Var = this.f7179d;
        RecyclerView recyclerView = c1Var.f7187d;
        if (recyclerView.L && !recyclerView.T && !recyclerView.f1236e.g()) {
            z9 = false;
        } else {
            z9 = true;
        }
        if (!z9) {
            RecyclerView recyclerView2 = c1Var.f7187d;
            if (recyclerView2.getLayoutManager() != null) {
                g0.c cVar = (g0.c) this.f7180e.get(view);
                if (cVar != null) {
                    if (cVar.g(view, i10, bundle)) {
                        return true;
                    }
                } else if (super.g(view, i10, bundle)) {
                    return true;
                }
                a3.h hVar = recyclerView2.getLayoutManager().f7279b.f1232c;
                return false;
            }
        }
        return super.g(view, i10, bundle);
    }

    @Override // g0.c
    public final void h(View view, int i10) {
        g0.c cVar = (g0.c) this.f7180e.get(view);
        if (cVar != null) {
            cVar.h(view, i10);
        } else {
            super.h(view, i10);
        }
    }

    @Override // g0.c
    public final void i(View view, AccessibilityEvent accessibilityEvent) {
        g0.c cVar = (g0.c) this.f7180e.get(view);
        if (cVar != null) {
            cVar.i(view, accessibilityEvent);
        } else {
            super.i(view, accessibilityEvent);
        }
    }
}
