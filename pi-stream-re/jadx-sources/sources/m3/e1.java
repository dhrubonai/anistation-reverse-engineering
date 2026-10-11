package m3;

import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.Scroller;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

/* loaded from: classes.dex */
public abstract class e1 extends m0 {

    /* renamed from: a, reason: collision with root package name */
    public RecyclerView f7202a;

    /* renamed from: b, reason: collision with root package name */
    public Scroller f7203b;

    /* renamed from: c, reason: collision with root package name */
    public final d1 f7204c = new d1(this);

    public final void a(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.f7202a;
        if (recyclerView2 == recyclerView) {
            return;
        }
        d1 d1Var = this.f7204c;
        if (recyclerView2 != null) {
            ArrayList arrayList = recyclerView2.f1262z0;
            if (arrayList != null) {
                arrayList.remove(d1Var);
            }
            this.f7202a.setOnFlingListener(null);
        }
        this.f7202a = recyclerView;
        if (recyclerView != null) {
            if (recyclerView.getOnFlingListener() == null) {
                this.f7202a.j(d1Var);
                this.f7202a.setOnFlingListener(this);
                this.f7203b = new Scroller(this.f7202a.getContext(), new DecelerateInterpolator());
                d();
                return;
            }
            throw new IllegalStateException("An instance of OnFlingListener already set.");
        }
    }

    public abstract int[] b(k0 k0Var, View view);

    public abstract View c(k0 k0Var);

    public final void d() {
        k0 layoutManager;
        View c6;
        RecyclerView recyclerView = this.f7202a;
        if (recyclerView == null || (layoutManager = recyclerView.getLayoutManager()) == null || (c6 = c(layoutManager)) == null) {
            return;
        }
        int[] b10 = b(layoutManager, c6);
        int i10 = b10[0];
        if (i10 != 0 || b10[1] != 0) {
            this.f7202a.g0(i10, b10[1], false);
        }
    }
}
