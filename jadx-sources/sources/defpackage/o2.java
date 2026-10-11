package defpackage;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public abstract class o2 {
    public static final o2 x;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [o2] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    static {
        ?? r0;
        Integer num = y33.a;
        if (num != null && num.intValue() < 34) {
            r0 = new m12();
        } else {
            r0 = new Object();
        }
        x = r0;
    }

    public Random a() {
        ThreadLocalRandom current = ThreadLocalRandom.current();
        current.getClass();
        return current;
    }

    public final int b(int i) {
        return (a().nextInt() >>> (32 - i)) & ((-i) >> 31);
    }

    public final int c() {
        return a().nextInt();
    }

    public final int d(int i) {
        return a().nextInt(i);
    }

    public final long e() {
        return a().nextLong();
    }

    public long f(long j, long j2) {
        long e;
        long j3;
        long j4;
        int c;
        if (j2 > j) {
            long j5 = j2 - j;
            if (j5 > 0) {
                if (((-j5) & j5) == j5) {
                    int i = (int) j5;
                    int i2 = (int) (j5 >>> 32);
                    if (i != 0) {
                        c = b(31 - Integer.numberOfLeadingZeros(i));
                    } else if (i2 == 1) {
                        c = c();
                    } else {
                        j4 = (b(31 - Integer.numberOfLeadingZeros(i2)) << 32) + (c() & 4294967295L);
                        return j + j4;
                    }
                    j4 = c & 4294967295L;
                    return j + j4;
                }
                do {
                    e = e() >>> 1;
                    j3 = e % j5;
                } while ((j5 - 1) + (e - j3) < 0);
                j4 = j3;
                return j + j4;
            }
            while (true) {
                long e2 = e();
                if (j <= e2 && e2 < j2) {
                    return e2;
                }
            }
        } else {
            ov3.n("Random range is empty: [", Long.valueOf(j), ", ", Long.valueOf(j2), ").");
            return 0L;
        }
    }

    public long g() {
        return f(0L, 1000L);
    }
}
