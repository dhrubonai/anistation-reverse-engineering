package w1;

import androidx.appcompat.widget.a0;
import v1.b0;
import v1.u0;
import v1.v0;

/* loaded from: classes.dex */
public final class i implements v0 {

    /* renamed from: a, reason: collision with root package name */
    public final k f10775a;

    /* renamed from: b, reason: collision with root package name */
    public final u0 f10776b;

    /* renamed from: c, reason: collision with root package name */
    public final int f10777c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f10778d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ k f10779e;

    public i(k kVar, k kVar2, u0 u0Var, int i10) {
        this.f10779e = kVar;
        this.f10775a = kVar2;
        this.f10776b = u0Var;
        this.f10777c = i10;
    }

    @Override // v1.v0
    public final boolean a() {
        k kVar = this.f10779e;
        if (!kVar.y() && this.f10776b.u(kVar.N)) {
            return true;
        }
        return false;
    }

    @Override // v1.v0
    public final void b() {
    }

    public final void c() {
        if (!this.f10778d) {
            k kVar = this.f10779e;
            b0 b0Var = kVar.f10786x;
            int[] iArr = kVar.f10781b;
            int i10 = this.f10777c;
            b0Var.a(iArr[i10], kVar.f10782c[i10], 0, null, kVar.K);
            this.f10778d = true;
        }
    }

    public final void d() {
        k kVar = this.f10779e;
        boolean[] zArr = kVar.f10783d;
        int i10 = this.f10777c;
        w7.b.u(zArr[i10]);
        kVar.f10783d[i10] = false;
    }

    @Override // v1.v0
    public final int g(a0 a0Var, i1.h hVar, int i10) {
        k kVar = this.f10779e;
        if (kVar.y()) {
            return -3;
        }
        a aVar = kVar.M;
        u0 u0Var = this.f10776b;
        if (aVar != null && aVar.d(this.f10777c + 1) <= u0Var.f10549q + u0Var.f10551s) {
            return -3;
        }
        c();
        return u0Var.z(a0Var, hVar, i10, kVar.N);
    }

    @Override // v1.v0
    public final int i(long j4) {
        k kVar = this.f10779e;
        if (kVar.y()) {
            return 0;
        }
        boolean z9 = kVar.N;
        u0 u0Var = this.f10776b;
        int s9 = u0Var.s(j4, z9);
        a aVar = kVar.M;
        if (aVar != null) {
            s9 = Math.min(s9, aVar.d(this.f10777c + 1) - (u0Var.f10549q + u0Var.f10551s));
        }
        u0Var.E(s9);
        if (s9 > 0) {
            c();
        }
        return s9;
    }
}
