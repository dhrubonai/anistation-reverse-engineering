package androidx.appcompat.widget;

import android.view.MenuItem;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class a4 implements p, j.m {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Toolbar f414a;

    public /* synthetic */ a4(Toolbar toolbar) {
        this.f414a = toolbar;
    }

    @Override // j.m
    public final void p(j.o oVar) {
        boolean z9;
        Toolbar toolbar = this.f414a;
        m mVar = toolbar.f375a.K;
        if (mVar != null && mVar.f()) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (!z9) {
            Iterator it = toolbar.f376a0.f4248b.iterator();
            while (it.hasNext()) {
                ((androidx.fragment.app.l0) ((g0.t) it.next())).f925a.s();
            }
        }
    }

    @Override // j.m
    public final boolean q(j.o oVar, MenuItem menuItem) {
        this.f414a.getClass();
        return false;
    }
}
