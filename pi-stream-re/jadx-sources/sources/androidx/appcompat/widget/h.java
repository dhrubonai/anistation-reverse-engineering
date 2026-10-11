package androidx.appcompat.widget;

import android.content.Context;
import android.view.View;

/* loaded from: classes.dex */
public final class h extends j.a0 {

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f510m = 0;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ m f511n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(m mVar, Context context, j.o oVar, l lVar) {
        super(context, oVar, lVar, true);
        this.f511n = mVar;
        this.f5493g = 8388613;
        f.p0 p0Var = mVar.N;
        this.f5495i = p0Var;
        j.x xVar = this.f5496j;
        if (xVar != null) {
            xVar.j(p0Var);
        }
    }

    @Override // j.a0
    public final void c() {
        int i10 = this.f510m;
        m mVar = this.f511n;
        switch (i10) {
            case 0:
                mVar.K = null;
                super.c();
                return;
            default:
                j.o oVar = mVar.f565c;
                if (oVar != null) {
                    oVar.c(true);
                }
                mVar.J = null;
                super.c();
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(m mVar, Context context, j.i0 i0Var, View view) {
        super(context, i0Var, view, false);
        this.f511n = mVar;
        if (!i0Var.A.f()) {
            View view2 = mVar.f571z;
            this.f5492f = view2 == null ? (View) mVar.f570y : view2;
        }
        f.p0 p0Var = mVar.N;
        this.f5495i = p0Var;
        j.x xVar = this.f5496j;
        if (xVar != null) {
            xVar.j(p0Var);
        }
    }
}
