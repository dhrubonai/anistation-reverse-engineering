package defpackage;

import com.unity3d.services.UnityAdsConstants;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class fq1 implements Comparable {
    public final long x;
    public static final m18 y = new m18((byte) 16);
    public static final long z = w65.x(4611686018427387903L);
    public static final long A = w65.x(-4611686018427387903L);
    public static final long B = 9223372036854759646L;

    public static final long a(long j, long j2) {
        long j3 = j2 / 1000000;
        long n = w65.n(j, j3);
        if (-4611686018426L <= n && n < 4611686018427L) {
            return w65.y((n * 1000000) + (j2 - (j3 * 1000000)));
        }
        return w65.x(n);
    }

    public static final void b(StringBuilder sb, int i, int i2, int i3, String str, boolean z2) {
        sb.append(i);
        if (i2 != 0) {
            sb.append('.');
            String a0 = uz5.a0(i3, String.valueOf(i2));
            int i4 = -1;
            int length = a0.length() - 1;
            if (length >= 0) {
                while (true) {
                    int i5 = length - 1;
                    if (a0.charAt(length) != '0') {
                        i4 = length;
                        break;
                    } else if (i5 < 0) {
                        break;
                    } else {
                        length = i5;
                    }
                }
            }
            int i6 = i4 + 1;
            if (!z2 && i6 < 3) {
                sb.append((CharSequence) a0, 0, i6);
            } else {
                sb.append((CharSequence) a0, 0, ((i4 + 3) / 3) * 3);
            }
        }
        sb.append(str);
    }

    public static int c(long j, long j2) {
        long j3 = j ^ j2;
        if (j3 >= 0 && (((int) j3) & 1) != 0) {
            int i = (((int) j) & 1) - (((int) j2) & 1);
            if (j < 0) {
                return -i;
            }
            return i;
        }
        return a34.E(j, j2);
    }

    public static final long d(long j) {
        if ((((int) j) & 1) == 1 && !f(j)) {
            return j >> 1;
        }
        return i(j, jq1.MILLISECONDS);
    }

    public static final int e(long j) {
        long j2;
        if (f(j)) {
            return 0;
        }
        if ((((int) j) & 1) == 1) {
            j2 = ((j >> 1) % 1000) * 1000000;
        } else {
            j2 = (j >> 1) % 1000000000;
        }
        return (int) j2;
    }

    public static final boolean f(long j) {
        if (j != z && j != A) {
            return false;
        }
        return true;
    }

    public static final long g(long j, long j2) {
        int i = ((int) j) & 1;
        if (i == (((int) j2) & 1)) {
            if (i == 0) {
                long j3 = (j >> 1) + (j2 >> 1);
                if (-4611686018426999999L <= j3 && j3 < 4611686018427000000L) {
                    return w65.y(j3);
                }
                return w65.x(j3 / 1000000);
            }
            long n = w65.n(j >> 1, j2 >> 1);
            if (n != 9223372036854759646L) {
                if (n != 4611686018427387903L && n != -4611686018427387903L) {
                    if (-4611686018426L <= n && n < 4611686018427L) {
                        return w65.y(n * 1000000);
                    }
                    return w65.x(db.D(n, -4611686018427387903L, 4611686018427387903L));
                }
                return w65.x(n);
            }
            ze0.k("Summing infinite durations of different signs yields an undefined result.");
            return 0L;
        }
        if (i == 1) {
            return a(j >> 1, j2 >> 1);
        }
        return a(j2 >> 1, j >> 1);
    }

    public static final double h(long j) {
        jq1 jq1Var;
        if (j == z) {
            return Double.POSITIVE_INFINITY;
        }
        if (j == A) {
            return Double.NEGATIVE_INFINITY;
        }
        double d = j >> 1;
        if ((((int) j) & 1) == 0) {
            jq1Var = jq1.NANOSECONDS;
        } else {
            jq1Var = jq1.MILLISECONDS;
        }
        TimeUnit timeUnit = jq1Var.x;
        long convert = TimeUnit.MILLISECONDS.convert(1L, timeUnit);
        if (convert > 0) {
            return d * convert;
        }
        return d / timeUnit.convert(1L, r10);
    }

    public static final long i(long j, jq1 jq1Var) {
        jq1 jq1Var2;
        if (j == z) {
            return Long.MAX_VALUE;
        }
        if (j == A) {
            return Long.MIN_VALUE;
        }
        long j2 = j >> 1;
        if ((((int) j) & 1) == 0) {
            jq1Var2 = jq1.NANOSECONDS;
        } else {
            jq1Var2 = jq1.MILLISECONDS;
        }
        return jq1Var.x.convert(j2, jq1Var2.x);
    }

    public static String j(long j) {
        boolean z2;
        int i;
        int i2;
        int i3;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        if (j == 0) {
            return "0s";
        }
        if (j == z) {
            return "Infinity";
        }
        if (j == A) {
            return "-Infinity";
        }
        int i4 = 0;
        if (j < 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        StringBuilder sb = new StringBuilder();
        if (z2) {
            sb.append('-');
        }
        if (j < 0) {
            j = k(j);
        }
        long i5 = i(j, jq1.DAYS);
        if (f(j)) {
            i = 0;
        } else {
            i = (int) (i(j, jq1.HOURS) % 24);
        }
        if (f(j)) {
            i2 = 0;
        } else {
            i2 = (int) (i(j, jq1.MINUTES) % 60);
        }
        if (f(j)) {
            i3 = 0;
        } else {
            i3 = (int) (i(j, jq1.SECONDS) % 60);
        }
        int e = e(j);
        if (i5 != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (i != 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (i2 != 0) {
            z5 = true;
        } else {
            z5 = false;
        }
        if (i3 == 0 && e == 0) {
            z6 = false;
        } else {
            z6 = true;
        }
        if (z3) {
            sb.append(i5);
            sb.append('d');
            i4 = 1;
        }
        if (z4 || (z3 && (z5 || z6))) {
            int i6 = i4 + 1;
            if (i4 > 0) {
                sb.append(' ');
            }
            sb.append(i);
            sb.append('h');
            i4 = i6;
        }
        if (z5 || (z6 && (z4 || z3))) {
            int i7 = i4 + 1;
            if (i4 > 0) {
                sb.append(' ');
            }
            sb.append(i2);
            sb.append('m');
            i4 = i7;
        }
        if (z6) {
            int i8 = i4 + 1;
            if (i4 > 0) {
                sb.append(' ');
            }
            if (i3 == 0 && !z3 && !z4 && !z5) {
                if (e >= 1000000) {
                    b(sb, e / 1000000, e % 1000000, 6, "ms", false);
                } else if (e >= 1000) {
                    b(sb, e / UnityAdsConstants.SafeGuards.InitRequestTimeoutPolicy.MIN_TIMEOUT, e % UnityAdsConstants.SafeGuards.InitRequestTimeoutPolicy.MIN_TIMEOUT, 3, "us", false);
                } else {
                    sb.append(e);
                    sb.append("ns");
                }
            } else {
                b(sb, i3, e, 9, "s", false);
            }
            i4 = i8;
        }
        if (z2 && i4 > 1) {
            sb.insert(1, '(').append(')');
        }
        return sb.toString();
    }

    public static final long k(long j) {
        long j2 = ((-(j >> 1)) << 1) + (((int) j) & 1);
        int i = hq1.a;
        return j2;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return c(this.x, ((fq1) obj).x);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof fq1) {
            if (this.x != ((fq1) obj).x) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.x);
    }

    public final String toString() {
        return j(this.x);
    }
}
