package n1;

import c1.v;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.util.List;

/* loaded from: classes.dex */
public final class p extends n {

    /* renamed from: j, reason: collision with root package name */
    public final f.c f7973j;

    /* renamed from: k, reason: collision with root package name */
    public final f.c f7974k;

    /* renamed from: l, reason: collision with root package name */
    public final long f7975l;

    public p(j jVar, long j4, long j10, long j11, long j12, long j13, List list, long j14, f.c cVar, f.c cVar2, long j15, long j16) {
        super(jVar, j4, j10, j11, j13, list, j14, j15, j16);
        this.f7973j = cVar;
        this.f7974k = cVar2;
        this.f7975l = j12;
    }

    @Override // n1.s
    public final j a(m mVar) {
        f.c cVar = this.f7973j;
        if (cVar != null) {
            v vVar = mVar.f7959a;
            return new j(cVar.k(vVar.f1923a, 0L, vVar.f1931i, 0L), 0L, -1L);
        }
        return this.f7980a;
    }

    @Override // n1.n
    public final long d(long j4) {
        if (this.f7968f != null) {
            return r0.size();
        }
        long j10 = this.f7975l;
        if (j10 != -1) {
            return (j10 - this.f7966d) + 1;
        }
        if (j4 == -9223372036854775807L) {
            return -1L;
        }
        BigInteger multiply = BigInteger.valueOf(j4).multiply(BigInteger.valueOf(this.f7981b));
        BigInteger multiply2 = BigInteger.valueOf(this.f7967e).multiply(BigInteger.valueOf(1000000L));
        RoundingMode roundingMode = RoundingMode.CEILING;
        int i10 = s6.a.f9925a;
        return new BigDecimal(multiply).divide(new BigDecimal(multiply2), 0, roundingMode).toBigIntegerExact().longValue();
    }

    @Override // n1.n
    public final j h(long j4, m mVar) {
        long j10;
        long j11 = this.f7966d;
        List list = this.f7968f;
        if (list != null) {
            j10 = ((q) list.get((int) (j4 - j11))).f7976a;
        } else {
            j10 = (j4 - j11) * this.f7967e;
        }
        long j12 = j10;
        f.c cVar = this.f7974k;
        v vVar = mVar.f7959a;
        return new j(cVar.k(vVar.f1923a, j4, vVar.f1931i, j12), 0L, -1L);
    }
}
