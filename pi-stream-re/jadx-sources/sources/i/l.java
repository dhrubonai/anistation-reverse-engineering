package i;

import android.view.View;
import androidx.appcompat.widget.g4;
import g0.m1;
import g0.n1;

/* loaded from: classes.dex */
public final class l extends n1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5236a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f5237b;

    /* renamed from: c, reason: collision with root package name */
    public int f5238c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f5239d;

    public l(m mVar) {
        this.f5236a = 0;
        this.f5239d = mVar;
        this.f5237b = false;
        this.f5238c = 0;
    }

    @Override // g0.m1
    public final void a() {
        int i10 = this.f5236a;
        Object obj = this.f5239d;
        switch (i10) {
            case 0:
                int i11 = this.f5238c + 1;
                this.f5238c = i11;
                m mVar = (m) obj;
                if (i11 == mVar.f5240a.size()) {
                    m1 m1Var = mVar.f5243d;
                    if (m1Var != null) {
                        m1Var.a();
                    }
                    this.f5238c = 0;
                    this.f5237b = false;
                    mVar.f5244e = false;
                    return;
                }
                return;
            default:
                if (!this.f5237b) {
                    ((g4) obj).f496a.setVisibility(this.f5238c);
                    return;
                }
                return;
        }
    }

    @Override // g0.n1, g0.m1
    public final void b(View view) {
        switch (this.f5236a) {
            case 1:
                this.f5237b = true;
                return;
            default:
                return;
        }
    }

    @Override // g0.n1, g0.m1
    public final void c() {
        int i10 = this.f5236a;
        Object obj = this.f5239d;
        switch (i10) {
            case 0:
                if (!this.f5237b) {
                    this.f5237b = true;
                    m1 m1Var = ((m) obj).f5243d;
                    if (m1Var != null) {
                        m1Var.c();
                        return;
                    }
                    return;
                }
                return;
            default:
                ((g4) obj).f496a.setVisibility(0);
                return;
        }
    }

    public l(g4 g4Var, int i10) {
        this.f5236a = 1;
        this.f5239d = g4Var;
        this.f5238c = i10;
        this.f5237b = false;
    }
}
