package x2;

import d2.a0;
import d2.b0;
import d2.c0;
import java.math.BigInteger;

/* loaded from: classes.dex */
public final class a implements b0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ b f11085a;

    public a(b bVar) {
        this.f11085a = bVar;
    }

    @Override // d2.b0
    public final boolean g() {
        return true;
    }

    @Override // d2.b0
    public final a0 j(long j4) {
        b bVar = this.f11085a;
        BigInteger valueOf = BigInteger.valueOf((bVar.f11089d.f11125i * j4) / 1000000);
        long j10 = bVar.f11088c;
        long j11 = bVar.f11087b;
        c0 c0Var = new c0(j4, f1.b0.i((valueOf.multiply(BigInteger.valueOf(j10 - j11)).divide(BigInteger.valueOf(bVar.f11091f)).longValue() + j11) - 30000, bVar.f11087b, j10 - 1));
        return new a0(c0Var, c0Var);
    }

    @Override // d2.b0
    public final long l() {
        return (this.f11085a.f11091f * 1000000) / r0.f11089d.f11125i;
    }
}
