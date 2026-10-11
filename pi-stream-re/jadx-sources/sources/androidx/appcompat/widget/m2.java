package androidx.appcompat.widget;

import android.os.Handler;
import android.widget.AbsListView;

/* loaded from: classes.dex */
public final class m2 implements AbsListView.OnScrollListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ o2 f578a;

    public m2(o2 o2Var) {
        this.f578a = o2Var;
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScroll(AbsListView absListView, int i10, int i11, int i12) {
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScrollStateChanged(AbsListView absListView, int i10) {
        boolean z9 = true;
        if (i10 == 1) {
            o2 o2Var = this.f578a;
            if (o2Var.Q.getInputMethodMode() != 2) {
                z9 = false;
            }
            if (!z9 && o2Var.Q.getContentView() != null) {
                Handler handler = o2Var.M;
                h2 h2Var = o2Var.I;
                handler.removeCallbacks(h2Var);
                h2Var.run();
            }
        }
    }
}
