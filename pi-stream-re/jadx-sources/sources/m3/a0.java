package m3;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.carousel.CarouselLayoutManager;

/* loaded from: classes.dex */
public final class a0 extends w {

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f7150q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Object f7151r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a0(int i10, Context context, Object obj) {
        super(context);
        this.f7150q = i10;
        this.f7151r = obj;
    }

    @Override // m3.w
    public final int b(View view, int i10) {
        switch (this.f7150q) {
            case 2:
                ((CarouselLayoutManager) this.f7151r).getClass();
                throw null;
            default:
                return super.b(view, i10);
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0004. Please report as an issue. */
    @Override // m3.w
    public final float c(DisplayMetrics displayMetrics) {
        int i10;
        switch (this.f7150q) {
            case 0:
                i10 = displayMetrics.densityDpi;
                return 100.0f / i10;
            case 1:
                i10 = displayMetrics.densityDpi;
                return 100.0f / i10;
            case 2:
            default:
                return 25.0f / displayMetrics.densityDpi;
            case 3:
                i10 = displayMetrics.densityDpi;
                return 100.0f / i10;
        }
    }

    @Override // m3.w
    public final int e(int i10) {
        switch (this.f7150q) {
            case 0:
                return Math.min(100, super.e(i10));
            default:
                return super.e(i10);
        }
    }

    @Override // m3.w
    public final PointF f(int i10) {
        switch (this.f7150q) {
            case 2:
                ((CarouselLayoutManager) this.f7151r).getClass();
                return null;
            default:
                return super.f(i10);
        }
    }

    @Override // m3.w
    public final void h(View view, w0 w0Var, u0 u0Var) {
        DecelerateInterpolator decelerateInterpolator = this.f7400j;
        int i10 = this.f7150q;
        Object obj = this.f7151r;
        switch (i10) {
            case 0:
                x xVar = (x) obj;
                int[] b10 = xVar.b(xVar.f7202a.getLayoutManager(), view);
                int i11 = b10[0];
                int i12 = b10[1];
                int d10 = d(Math.max(Math.abs(i11), Math.abs(i12)));
                if (d10 > 0) {
                    u0Var.f7381a = i11;
                    u0Var.f7382b = i12;
                    u0Var.f7383c = d10;
                    u0Var.f7385e = decelerateInterpolator;
                    u0Var.f7386f = true;
                    return;
                }
                return;
            case 1:
                e1 e1Var = (e1) obj;
                RecyclerView recyclerView = e1Var.f7202a;
                if (recyclerView != null) {
                    int[] b11 = e1Var.b(recyclerView.getLayoutManager(), view);
                    int i13 = b11[0];
                    int i14 = b11[1];
                    int d11 = d(Math.max(Math.abs(i13), Math.abs(i14)));
                    if (d11 > 0) {
                        u0Var.f7381a = i13;
                        u0Var.f7382b = i14;
                        u0Var.f7383c = d11;
                        u0Var.f7385e = decelerateInterpolator;
                        u0Var.f7386f = true;
                        return;
                    }
                    return;
                }
                return;
            default:
                super.h(view, w0Var, u0Var);
                return;
        }
    }
}
