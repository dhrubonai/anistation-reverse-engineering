package v2;

import d2.a0;
import d2.c0;
import f1.b0;
import java.math.RoundingMode;

/* loaded from: classes.dex */
public final class b implements f {

    /* renamed from: a, reason: collision with root package name */
    public final long f10591a;

    /* renamed from: b, reason: collision with root package name */
    public final d0.h f10592b;

    /* renamed from: c, reason: collision with root package name */
    public final d0.h f10593c;

    /* renamed from: d, reason: collision with root package name */
    public final int f10594d;

    /* renamed from: e, reason: collision with root package name */
    public long f10595e;

    public b(long j4, long j10, long j11) {
        this.f10595e = j4;
        this.f10591a = j11;
        d0.h hVar = new d0.h(2);
        this.f10592b = hVar;
        d0.h hVar2 = new d0.h(2);
        this.f10593c = hVar2;
        hVar.e(0L);
        hVar2.e(j10);
        int i10 = -2147483647;
        if (j4 != -9223372036854775807L) {
            long X = b0.X(j10 - j11, 8L, j4, RoundingMode.HALF_UP);
            if (X > 0 && X <= 2147483647L) {
                i10 = (int) X;
            }
            this.f10594d = i10;
            return;
        }
        this.f10594d = -2147483647;
    }

    public final boolean a(long j4) {
        d0.h hVar = this.f10592b;
        if (j4 - hVar.h(hVar.f3026a - 1) < 100000) {
            return true;
        }
        return false;
    }

    @Override // v2.f
    public final long b(long j4) {
        return this.f10592b.h(b0.c(this.f10593c, j4));
    }

    @Override // v2.f
    public final long d() {
        return this.f10591a;
    }

    @Override // d2.b0
    public final boolean g() {
        return true;
    }

    @Override // d2.b0
    public final a0 j(long j4) {
        d0.h hVar = this.f10592b;
        int c6 = b0.c(hVar, j4);
        long h10 = hVar.h(c6);
        d0.h hVar2 = this.f10593c;
        c0 c0Var = new c0(h10, hVar2.h(c6));
        if (h10 != j4 && c6 != hVar.f3026a - 1) {
            int i10 = c6 + 1;
            return new a0(c0Var, new c0(hVar.h(i10), hVar2.h(i10)));
        }
        return new a0(c0Var, c0Var);
    }

    @Override // v2.f
    public final int k() {
        return this.f10594d;
    }

    @Override // d2.b0
    public final long l() {
        return this.f10595e;
    }
}
