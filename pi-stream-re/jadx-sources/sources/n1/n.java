package n1;

import f1.b0;
import java.util.List;

/* loaded from: classes.dex */
public abstract class n extends s {

    /* renamed from: d, reason: collision with root package name */
    public final long f7966d;

    /* renamed from: e, reason: collision with root package name */
    public final long f7967e;

    /* renamed from: f, reason: collision with root package name */
    public final List f7968f;

    /* renamed from: g, reason: collision with root package name */
    public final long f7969g;

    /* renamed from: h, reason: collision with root package name */
    public final long f7970h;

    /* renamed from: i, reason: collision with root package name */
    public final long f7971i;

    public n(j jVar, long j4, long j10, long j11, long j12, List list, long j13, long j14, long j15) {
        super(jVar, j4, j10);
        this.f7966d = j11;
        this.f7967e = j12;
        this.f7968f = list;
        this.f7971i = j13;
        this.f7969g = j14;
        this.f7970h = j15;
    }

    public final long b(long j4, long j10) {
        long d10 = d(j4);
        if (d10 != -1) {
            return d10;
        }
        return (int) (f((j10 - this.f7970h) + this.f7971i, j4) - c(j4, j10));
    }

    public final long c(long j4, long j10) {
        long d10 = d(j4);
        long j11 = this.f7966d;
        if (d10 == -1) {
            long j12 = this.f7969g;
            if (j12 != -9223372036854775807L) {
                return Math.max(j11, f((j10 - this.f7970h) - j12, j4));
            }
        }
        return j11;
    }

    public abstract long d(long j4);

    public final long e(long j4, long j10) {
        long j11 = this.f7981b;
        long j12 = this.f7966d;
        List list = this.f7968f;
        if (list != null) {
            return (((q) list.get((int) (j4 - j12))).f7977b * 1000000) / j11;
        }
        long d10 = d(j10);
        if (d10 != -1 && j4 == (j12 + d10) - 1) {
            return j10 - g(j4);
        }
        return (this.f7967e * 1000000) / j11;
    }

    public final long f(long j4, long j10) {
        long d10 = d(j10);
        long j11 = this.f7966d;
        if (d10 == 0) {
            return j11;
        }
        if (this.f7968f == null) {
            long j12 = (j4 / ((this.f7967e * 1000000) / this.f7981b)) + j11;
            if (j12 >= j11) {
                if (d10 == -1) {
                    return j12;
                }
                return Math.min(j12, (j11 + d10) - 1);
            }
            return j11;
        }
        long j13 = (d10 + j11) - 1;
        long j14 = j11;
        while (j14 <= j13) {
            long j15 = ((j13 - j14) / 2) + j14;
            long g10 = g(j15);
            if (g10 < j4) {
                j14 = j15 + 1;
            } else if (g10 > j4) {
                j13 = j15 - 1;
            } else {
                return j15;
            }
        }
        if (j14 == j11) {
            return j14;
        }
        return j13;
    }

    public final long g(long j4) {
        long j10;
        long j11 = this.f7966d;
        List list = this.f7968f;
        if (list != null) {
            j10 = ((q) list.get((int) (j4 - j11))).f7976a - this.f7982c;
        } else {
            j10 = (j4 - j11) * this.f7967e;
        }
        return b0.V(j10, 1000000L, this.f7981b);
    }

    public abstract j h(long j4, m mVar);

    public boolean i() {
        if (this.f7968f != null) {
            return true;
        }
        return false;
    }
}
