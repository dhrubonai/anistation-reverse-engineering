package j3;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import c1.z0;
import m3.a1;
import msr.pistream.app.R;
import r6.n1;

/* loaded from: classes.dex */
public final class k extends v {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f6029f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ x f6030g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(x xVar, int i10) {
        super(xVar);
        this.f6029f = i10;
        this.f6030g = xVar;
    }

    @Override // m3.d0
    public final /* bridge */ /* synthetic */ void c(a1 a1Var, int i10) {
        switch (this.f6029f) {
            case 1:
                e((s) a1Var, i10);
                return;
            default:
                e((s) a1Var, i10);
                return;
        }
    }

    @Override // j3.v
    public final void e(s sVar, int i10) {
        int i11;
        switch (this.f6029f) {
            case 1:
                super.e(sVar, i10);
                if (i10 > 0) {
                    t tVar = (t) this.f6102d.get(i10 - 1);
                    if (tVar.f6086a.f1805e[tVar.f6087b]) {
                        i11 = 0;
                    } else {
                        i11 = 4;
                    }
                    sVar.f6085v.setVisibility(i11);
                    return;
                }
                return;
            default:
                super.e(sVar, i10);
                return;
        }
    }

    public final boolean f(y1.j jVar) {
        for (int i10 = 0; i10 < this.f6102d.size(); i10++) {
            if (jVar.A.containsKey(((t) this.f6102d.get(i10)).f6086a.f1802b)) {
                return true;
            }
        }
        return false;
    }

    public final void g(n1 n1Var) {
        Drawable drawable;
        String str;
        int i10 = this.f6029f;
        int i11 = 0;
        x xVar = this.f6030g;
        switch (i10) {
            case 0:
                this.f6102d = n1Var;
                z0 z0Var = xVar.f6136y0;
                z0Var.getClass();
                y1.j I = ((j1.d0) z0Var).I();
                boolean isEmpty = n1Var.isEmpty();
                r rVar = xVar.f6114f;
                if (isEmpty) {
                    rVar.f6079e[1] = xVar.getResources().getString(R.string.exo_track_selection_none);
                    return;
                } else {
                    if (!f(I)) {
                        rVar.f6079e[1] = xVar.getResources().getString(R.string.exo_track_selection_auto);
                        return;
                    }
                    while (i11 < n1Var.f9499d) {
                        t tVar = (t) n1Var.get(i11);
                        if (tVar.f6086a.f1805e[tVar.f6087b]) {
                            rVar.f6079e[1] = tVar.f6088c;
                            return;
                        }
                        i11++;
                    }
                    return;
                }
            default:
                int i12 = 0;
                while (true) {
                    if (i12 < n1Var.f9499d) {
                        t tVar2 = (t) n1Var.get(i12);
                        if (tVar2.f6086a.f1805e[tVar2.f6087b]) {
                            i11 = 1;
                        } else {
                            i12++;
                        }
                    }
                }
                ImageView imageView = xVar.N;
                if (imageView != null) {
                    if (i11 != 0) {
                        drawable = xVar.f6126q0;
                    } else {
                        drawable = xVar.f6127r0;
                    }
                    imageView.setImageDrawable(drawable);
                    if (i11 != 0) {
                        str = xVar.f6128s0;
                    } else {
                        str = xVar.f6129t0;
                    }
                    xVar.N.setContentDescription(str);
                }
                this.f6102d = n1Var;
                return;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(x xVar, int i10, int i11) {
        this(xVar, 0);
        this.f6029f = i10;
        int i12 = 1;
        if (i10 != 1) {
        } else {
            this(xVar, i12);
        }
    }
}
