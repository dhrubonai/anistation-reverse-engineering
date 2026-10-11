package q3;

import android.view.ViewGroup;

/* loaded from: classes.dex */
public final class e extends t {

    /* renamed from: a, reason: collision with root package name */
    public boolean f9129a = false;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ViewGroup f9130b;

    public e(ViewGroup viewGroup) {
        this.f9130b = viewGroup;
    }

    @Override // q3.t, q3.r
    public final void a() {
        p7.a0.X(this.f9130b, false);
    }

    @Override // q3.t, q3.r
    public final void b() {
        p7.a0.X(this.f9130b, true);
    }

    @Override // q3.r
    public final void c(s sVar) {
        if (!this.f9129a) {
            p7.a0.X(this.f9130b, false);
        }
        sVar.w(this);
    }

    @Override // q3.t, q3.r
    public final void d() {
        p7.a0.X(this.f9130b, false);
        this.f9129a = true;
    }
}
