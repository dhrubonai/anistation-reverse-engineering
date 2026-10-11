package v2;

import android.util.Pair;
import d2.a0;
import d2.c0;
import f1.b0;

/* loaded from: classes.dex */
public final class c implements f {

    /* renamed from: a, reason: collision with root package name */
    public final long[] f10596a;

    /* renamed from: b, reason: collision with root package name */
    public final long[] f10597b;

    /* renamed from: c, reason: collision with root package name */
    public final long f10598c;

    public c(long[] jArr, long[] jArr2, long j4) {
        this.f10596a = jArr;
        this.f10597b = jArr2;
        this.f10598c = j4 == -9223372036854775807L ? b0.O(jArr2[jArr2.length - 1]) : j4;
    }

    public static Pair a(long[] jArr, long[] jArr2, long j4) {
        double d10;
        int f10 = b0.f(jArr, j4, true);
        long j10 = jArr[f10];
        long j11 = jArr2[f10];
        int i10 = f10 + 1;
        if (i10 == jArr.length) {
            return Pair.create(Long.valueOf(j10), Long.valueOf(j11));
        }
        long j12 = jArr[i10];
        long j13 = jArr2[i10];
        if (j12 == j10) {
            d10 = 0.0d;
        } else {
            d10 = (j4 - j10) / (j12 - j10);
        }
        return Pair.create(Long.valueOf(j4), Long.valueOf(((long) (d10 * (j13 - j11))) + j11));
    }

    @Override // v2.f
    public final long b(long j4) {
        return b0.O(((Long) a(this.f10596a, this.f10597b, j4).second).longValue());
    }

    @Override // v2.f
    public final long d() {
        return -1L;
    }

    @Override // d2.b0
    public final boolean g() {
        return true;
    }

    @Override // d2.b0
    public final a0 j(long j4) {
        Pair a10 = a(this.f10597b, this.f10596a, b0.c0(b0.i(j4, 0L, this.f10598c)));
        c0 c0Var = new c0(b0.O(((Long) a10.first).longValue()), ((Long) a10.second).longValue());
        return new a0(c0Var, c0Var);
    }

    @Override // v2.f
    public final int k() {
        return -2147483647;
    }

    @Override // d2.b0
    public final long l() {
        return this.f10598c;
    }
}
