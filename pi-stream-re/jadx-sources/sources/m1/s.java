package m1;

import android.os.Handler;
import androidx.appcompat.widget.a0;
import c1.p0;
import c1.r0;
import c1.v;
import d2.f0;
import d2.g0;
import f1.b0;
import v1.q0;
import v1.u0;

/* loaded from: classes.dex */
public final class s implements g0 {

    /* renamed from: a, reason: collision with root package name */
    public final u0 f7129a;

    /* renamed from: b, reason: collision with root package name */
    public final a0 f7130b = new a0(7, (Object) null);

    /* renamed from: c, reason: collision with root package name */
    public final l2.a f7131c = new l2.a();

    /* renamed from: d, reason: collision with root package name */
    public long f7132d = -9223372036854775807L;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ t f7133e;

    public s(t tVar, z1.d dVar) {
        this.f7133e = tVar;
        this.f7129a = new u0(dVar, null, null);
    }

    @Override // d2.g0
    public final int a(c1.l lVar, int i10, boolean z9) {
        u0 u0Var = this.f7129a;
        u0Var.getClass();
        return u0Var.a(lVar, i10, z9);
    }

    @Override // d2.g0
    public final void b(v vVar) {
        this.f7129a.b(vVar);
    }

    @Override // d2.g0
    public final int c(c1.l lVar, int i10, boolean z9) {
        return a(lVar, i10, z9);
    }

    @Override // d2.g0
    public final void d(long j4, int i10, int i11, int i12, f0 f0Var) {
        long h10;
        long j10;
        this.f7129a.d(j4, i10, i11, i12, f0Var);
        while (true) {
            boolean z9 = false;
            if (!this.f7129a.u(false)) {
                break;
            }
            l2.a aVar = this.f7131c;
            aVar.h();
            if (this.f7129a.z(this.f7130b, aVar, 0, false) == -4) {
                aVar.k();
            } else {
                aVar = null;
            }
            if (aVar != null) {
                long j11 = aVar.f5264x;
                p0 G = this.f7133e.f7136c.G(aVar);
                if (G != null) {
                    n2.a aVar2 = (n2.a) G.f1876a[0];
                    String str = aVar2.f7989a;
                    String str2 = aVar2.f7990b;
                    if ("urn:mpeg:dash:event:2012".equals(str) && ("1".equals(str2) || "2".equals(str2) || "3".equals(str2))) {
                        z9 = true;
                    }
                    if (z9) {
                        try {
                            j10 = b0.R(b0.n(aVar2.f7993e));
                        } catch (r0 unused) {
                            j10 = -9223372036854775807L;
                        }
                        if (j10 != -9223372036854775807L) {
                            r rVar = new r(j11, j10);
                            Handler handler = this.f7133e.f7137d;
                            handler.sendMessage(handler.obtainMessage(1, rVar));
                        }
                    }
                }
            }
        }
        u0 u0Var = this.f7129a;
        q0 q0Var = u0Var.f10534a;
        synchronized (u0Var) {
            int i13 = u0Var.f10551s;
            if (i13 == 0) {
                h10 = -1;
            } else {
                h10 = u0Var.h(i13);
            }
        }
        q0Var.b(h10);
    }

    @Override // d2.g0
    public final void e(int i10, int i11, f1.t tVar) {
        u0 u0Var = this.f7129a;
        u0Var.getClass();
        a3.g.a(u0Var, tVar, i10);
    }

    @Override // d2.g0
    public final void f(int i10, f1.t tVar) {
        e(i10, 0, tVar);
    }
}
