package v1;

/* loaded from: classes.dex */
public final class c implements v0 {

    /* renamed from: a, reason: collision with root package name */
    public final v0 f10372a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f10373b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ d f10374c;

    public c(d dVar, v0 v0Var) {
        this.f10374c = dVar;
        this.f10372a = v0Var;
    }

    @Override // v1.v0
    public final boolean a() {
        if (!this.f10374c.a() && this.f10372a.a()) {
            return true;
        }
        return false;
    }

    @Override // v1.v0
    public final void b() {
        this.f10372a.b();
    }

    @Override // v1.v0
    public final int g(androidx.appcompat.widget.a0 a0Var, i1.h hVar, int i10) {
        d dVar = this.f10374c;
        if (dVar.a()) {
            return -3;
        }
        if (this.f10373b) {
            hVar.f5247b = 4;
            return -4;
        }
        long o = dVar.o();
        int g10 = this.f10372a.g(a0Var, hVar, i10);
        if (g10 == -5) {
            c1.v vVar = (c1.v) a0Var.f404c;
            vVar.getClass();
            int i11 = vVar.C;
            int i12 = vVar.D;
            if (i11 != 0 || i12 != 0) {
                if (dVar.f10388e != 0) {
                    i11 = 0;
                }
                if (dVar.f10389f != Long.MIN_VALUE) {
                    i12 = 0;
                }
                c1.u a10 = vVar.a();
                a10.B = i11;
                a10.C = i12;
                a0Var.f404c = a10.a();
            }
            return -5;
        }
        long j4 = dVar.f10389f;
        if (j4 != Long.MIN_VALUE && ((g10 == -4 && hVar.f5264x >= j4) || (g10 == -3 && o == Long.MIN_VALUE && !hVar.f5263f))) {
            hVar.h();
            hVar.f5247b = 4;
            this.f10373b = true;
            return -4;
        }
        return g10;
    }

    @Override // v1.v0
    public final int i(long j4) {
        if (this.f10374c.a()) {
            return -3;
        }
        return this.f10372a.i(j4);
    }
}
