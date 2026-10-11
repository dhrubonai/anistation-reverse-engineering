package q3;

/* loaded from: classes.dex */
public final class w extends t {

    /* renamed from: a, reason: collision with root package name */
    public final x f9192a;

    public w(x xVar) {
        this.f9192a = xVar;
    }

    @Override // q3.r
    public final void c(s sVar) {
        x xVar = this.f9192a;
        int i10 = xVar.Q - 1;
        xVar.Q = i10;
        if (i10 == 0) {
            xVar.R = false;
            xVar.n();
        }
        sVar.w(this);
    }

    @Override // q3.t, q3.r
    public final void e(s sVar) {
        x xVar = this.f9192a;
        if (!xVar.R) {
            xVar.G();
            xVar.R = true;
        }
    }
}
