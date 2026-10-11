package androidx.appcompat.widget;

import android.view.View;

/* loaded from: classes.dex */
public final class k extends e2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ Object B;
    public final /* synthetic */ View C;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(View view, View view2, Object obj, int i10) {
        super(view2);
        this.A = i10;
        this.C = view;
        this.B = obj;
    }

    @Override // androidx.appcompat.widget.e2
    public final j.g0 b() {
        switch (this.A) {
            case 0:
                h hVar = ((l) this.C).f558d.J;
                if (hVar == null) {
                    return null;
                }
                return hVar.a();
            default:
                return (t0) this.B;
        }
    }

    @Override // androidx.appcompat.widget.e2
    public final boolean c() {
        int i10 = this.A;
        View view = this.C;
        switch (i10) {
            case 0:
                ((l) view).f558d.l();
                return true;
            default:
                w0 w0Var = (w0) view;
                if (!w0Var.getInternalPopup().b()) {
                    w0Var.f693f.m(o0.b(w0Var), o0.a(w0Var));
                }
                return true;
        }
    }

    @Override // androidx.appcompat.widget.e2
    public final boolean d() {
        switch (this.A) {
            case 0:
                m mVar = ((l) this.C).f558d;
                if (mVar.L != null) {
                    return false;
                }
                mVar.d();
                return true;
            default:
                super.d();
                return true;
        }
    }
}
