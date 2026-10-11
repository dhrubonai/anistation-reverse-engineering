package m3;

import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public final class l extends o0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7292a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f7293b;

    public /* synthetic */ l(Object obj, int i10) {
        this.f7292a = i10;
        this.f7293b = obj;
    }

    @Override // m3.o0
    public final void a(RecyclerView recyclerView, int i10) {
        switch (this.f7292a) {
            case 2:
                if (i10 == 0) {
                    l8.r0 r0Var = (l8.r0) this.f7293b;
                    int i11 = l8.r0.D0;
                    r0Var.a0();
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override // m3.o0
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        boolean z9;
        boolean z10;
        String str;
        int i12 = this.f7292a;
        Object obj = this.f7293b;
        switch (i12) {
            case 0:
                o oVar = (o) obj;
                int computeHorizontalScrollOffset = recyclerView.computeHorizontalScrollOffset();
                int computeVerticalScrollOffset = recyclerView.computeVerticalScrollOffset();
                int computeVerticalScrollRange = oVar.f7326s.computeVerticalScrollRange();
                int i13 = oVar.f7325r;
                int i14 = computeVerticalScrollRange - i13;
                int i15 = oVar.f7309a;
                if (i14 > 0 && i13 >= i15) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                oVar.f7327t = z9;
                int computeHorizontalScrollRange = oVar.f7326s.computeHorizontalScrollRange();
                int i16 = oVar.f7324q;
                if (computeHorizontalScrollRange - i16 > 0 && i16 >= i15) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                oVar.f7328u = z10;
                boolean z11 = oVar.f7327t;
                if (!z11 && !z10) {
                    if (oVar.f7329v != 0) {
                        oVar.e(0);
                        return;
                    }
                    return;
                }
                if (z11) {
                    float f10 = i13;
                    oVar.f7320l = (int) ((((f10 / 2.0f) + computeVerticalScrollOffset) * f10) / computeVerticalScrollRange);
                    oVar.f7319k = Math.min(i13, (i13 * i13) / computeVerticalScrollRange);
                }
                if (oVar.f7328u) {
                    float f11 = computeHorizontalScrollOffset;
                    float f12 = i16;
                    oVar.o = (int) ((((f12 / 2.0f) + f11) * f12) / computeHorizontalScrollRange);
                    oVar.f7322n = Math.min(i16, (i16 * i16) / computeHorizontalScrollRange);
                }
                int i17 = oVar.f7329v;
                if (i17 == 0 || i17 == 1) {
                    oVar.e(1);
                    return;
                }
                return;
            case 1:
                GridLayoutManager gridLayoutManager = (GridLayoutManager) recyclerView.getLayoutManager();
                if (gridLayoutManager != null) {
                    int v9 = gridLayoutManager.v();
                    int z12 = gridLayoutManager.z();
                    int J0 = gridLayoutManager.J0();
                    l8.n0 n0Var = (l8.n0) obj;
                    if (!n0Var.F0 && n0Var.E0 && v9 + J0 >= z12 - 4 && (str = n0Var.C0) != null && !str.isEmpty()) {
                        n0Var.F0 = true;
                        View view = n0Var.A0;
                        if (view != null) {
                            view.setVisibility(0);
                        }
                        int i18 = n0Var.B0 + 1;
                        n0Var.B0 = i18;
                        n0Var.f6985s0.b(i18, n0Var.C0);
                        return;
                    }
                    return;
                }
                return;
            default:
                return;
        }
    }
}
