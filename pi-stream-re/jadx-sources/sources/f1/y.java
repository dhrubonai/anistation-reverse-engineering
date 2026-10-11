package f1;

import android.os.SystemClock;
import java.util.concurrent.TimeoutException;

/* loaded from: classes.dex */
public final class y {

    /* renamed from: a, reason: collision with root package name */
    public long f3867a;

    /* renamed from: b, reason: collision with root package name */
    public long f3868b;

    /* renamed from: c, reason: collision with root package name */
    public long f3869c;

    /* renamed from: d, reason: collision with root package name */
    public final ThreadLocal f3870d = new ThreadLocal();

    public y(long j4) {
        g(j4);
    }

    public final synchronized long a(long j4) {
        if (j4 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        if (!f()) {
            long j10 = this.f3867a;
            if (j10 == 9223372036854775806L) {
                Long l10 = (Long) this.f3870d.get();
                l10.getClass();
                j10 = l10.longValue();
            }
            this.f3868b = j10 - j4;
            notifyAll();
        }
        this.f3869c = j4;
        return j4 + this.f3868b;
    }

    public final synchronized long b(long j4) {
        if (j4 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        long j10 = this.f3869c;
        if (j10 != -9223372036854775807L) {
            long j11 = (j10 * 90000) / 1000000;
            long j12 = (4294967296L + j11) / 8589934592L;
            long j13 = ((j12 - 1) * 8589934592L) + j4;
            j4 += j12 * 8589934592L;
            if (Math.abs(j13 - j11) < Math.abs(j4 - j11)) {
                j4 = j13;
            }
        }
        return a((j4 * 1000000) / 90000);
    }

    public final synchronized long c(long j4) {
        long j10;
        if (j4 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        long j11 = this.f3869c;
        if (j11 != -9223372036854775807L) {
            long j12 = (j11 * 90000) / 1000000;
            long j13 = j12 / 8589934592L;
            Long.signum(j13);
            long j14 = (j13 * 8589934592L) + j4;
            j10 = ((j13 + 1) * 8589934592L) + j4;
            if (j14 >= j12) {
                j10 = j14;
            }
        } else {
            j10 = j4;
        }
        return a((j10 * 1000000) / 90000);
    }

    public final synchronized long d() {
        long j4;
        j4 = this.f3867a;
        if (j4 == Long.MAX_VALUE || j4 == 9223372036854775806L) {
            j4 = -9223372036854775807L;
        }
        return j4;
    }

    public final synchronized long e() {
        return this.f3868b;
    }

    public final synchronized boolean f() {
        boolean z9;
        if (this.f3868b != -9223372036854775807L) {
            z9 = true;
        } else {
            z9 = false;
        }
        return z9;
    }

    public final synchronized void g(long j4) {
        long j10;
        this.f3867a = j4;
        if (j4 == Long.MAX_VALUE) {
            j10 = 0;
        } else {
            j10 = -9223372036854775807L;
        }
        this.f3868b = j10;
        this.f3869c = -9223372036854775807L;
    }

    public final synchronized void h(long j4, long j10, boolean z9) {
        boolean z10;
        boolean z11;
        if (this.f3867a == 9223372036854775806L) {
            z10 = true;
        } else {
            z10 = false;
        }
        w7.b.u(z10);
        if (f()) {
            return;
        }
        if (z9) {
            this.f3870d.set(Long.valueOf(j4));
        } else {
            long j11 = 0;
            long j12 = j10;
            while (!f()) {
                if (j10 == 0) {
                    wait();
                } else {
                    if (j12 > 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    w7.b.u(z11);
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    wait(j12);
                    j11 += SystemClock.elapsedRealtime() - elapsedRealtime;
                    if (j11 >= j10 && !f()) {
                        throw new TimeoutException("TimestampAdjuster failed to initialize in " + j10 + " milliseconds");
                    }
                    j12 = j10 - j11;
                }
            }
        }
    }
}
