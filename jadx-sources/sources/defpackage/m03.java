package defpackage;

import com.unity3d.services.UnityAdsConstants;
import java.io.Serializable;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class m03 implements Comparable, Serializable {
    public final long x;
    public final int y;
    public static final m03 z = new m03(-31557014167219200L, 0);
    public static final m03 A = new m03(31556889864403199L, 999999999);

    public m03(long j, int i) {
        this.x = j;
        this.y = i;
        if (-31557014167219200L <= j && j < 31556889864403200L) {
            return;
        }
        ze0.k("Instant exceeds minimum or maximum instant");
        throw null;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        m03 m03Var = (m03) obj;
        m03Var.getClass();
        int E = a34.E(this.x, m03Var.x);
        if (E != 0) {
            return E;
        }
        return a34.D(this.y, m03Var.y);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof m03) {
                m03 m03Var = (m03) obj;
                if (this.x != m03Var.x || this.y != m03Var.y) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (this.y * 51) + Long.hashCode(this.x);
    }

    public final String toString() {
        long j;
        int[] iArr;
        StringBuilder sb = new StringBuilder();
        long j2 = this.x;
        long j3 = j2 / 86400;
        if ((j2 ^ 86400) < 0 && j3 * 86400 != j2) {
            j3--;
        }
        long j4 = j2 % 86400;
        int i = (int) (j4 + (86400 & (((j4 ^ 86400) & ((-j4) | j4)) >> 63)));
        long j5 = 719468 + j3;
        if (j5 < 0) {
            long j6 = ((j3 + 719469) / 146097) - 1;
            j = j6 * 400;
            j5 += (-j6) * 146097;
        } else {
            j = 0;
        }
        long j7 = ((400 * j5) + 591) / 146097;
        long j8 = j5 - ((j7 / 400) + (((j7 / 4) + (365 * j7)) - (j7 / 100)));
        if (j8 < 0) {
            j7--;
            j8 = j5 - ((j7 / 400) + (((j7 / 4) + (365 * j7)) - (j7 / 100)));
        }
        int i2 = (int) j8;
        int i3 = ((i2 * 5) + 2) / 153;
        int i4 = ((i3 + 2) % 12) + 1;
        int i5 = (i2 - (((i3 * 306) + 5) / 10)) + 1;
        int i6 = (int) (j7 + j + (i3 / 10));
        int i7 = i / 3600;
        int i8 = i - (i7 * 3600);
        int i9 = i8 / 60;
        int i10 = i8 - (i9 * 60);
        int i11 = 0;
        if (Math.abs(i6) < 1000) {
            StringBuilder sb2 = new StringBuilder();
            if (i6 >= 0) {
                sb2.append(i6 + UnityAdsConstants.AdOperations.SHOW_TIMEOUT_MS);
                sb2.deleteCharAt(0).getClass();
            } else {
                sb2.append(i6 - UnityAdsConstants.AdOperations.SHOW_TIMEOUT_MS);
                sb2.deleteCharAt(1).getClass();
            }
            sb.append((CharSequence) sb2);
        } else {
            if (i6 >= 10000) {
                sb.append('+');
            }
            sb.append(i6);
        }
        sb.append('-');
        w65.A(sb, sb, i4);
        sb.append('-');
        w65.A(sb, sb, i5);
        sb.append('T');
        w65.A(sb, sb, i7);
        sb.append(':');
        w65.A(sb, sb, i9);
        sb.append(':');
        w65.A(sb, sb, i10);
        int i12 = this.y;
        if (i12 != 0) {
            sb.append('.');
            while (true) {
                iArr = w65.f;
                int i13 = i11 + 1;
                if (i12 % iArr[i13] != 0) {
                    break;
                }
                i11 = i13;
            }
            int i14 = i11 - (i11 % 3);
            String valueOf = String.valueOf((i12 / iArr[i14]) + iArr[9 - i14]);
            valueOf.getClass();
            sb.append(valueOf.substring(1));
        }
        sb.append('Z');
        return sb.toString();
    }
}
