package c1;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: c, reason: collision with root package name */
    public static final b f1626c = new b(new a[0]);

    /* renamed from: d, reason: collision with root package name */
    public static final a f1627d;

    /* renamed from: a, reason: collision with root package name */
    public final int f1628a;

    /* renamed from: b, reason: collision with root package name */
    public final a[] f1629b;

    static {
        a aVar = new a(0L, -1, -1, new int[0], new k0[0], new long[0], 0L, false);
        int[] iArr = aVar.f1619f;
        int length = iArr.length;
        int max = Math.max(0, length);
        int[] copyOf = Arrays.copyOf(iArr, max);
        Arrays.fill(copyOf, length, max, 0);
        long[] jArr = aVar.f1620g;
        int length2 = jArr.length;
        int max2 = Math.max(0, length2);
        long[] copyOf2 = Arrays.copyOf(jArr, max2);
        Arrays.fill(copyOf2, length2, max2, -9223372036854775807L);
        f1627d = new a(aVar.f1614a, 0, aVar.f1616c, copyOf, (k0[]) Arrays.copyOf(aVar.f1618e, 0), copyOf2, aVar.f1621h, aVar.f1622i);
        f1.b0.J(1);
        f1.b0.J(2);
        f1.b0.J(3);
        f1.b0.J(4);
    }

    public b(a[] aVarArr) {
        this.f1628a = aVarArr.length + 0;
        this.f1629b = aVarArr;
    }

    public final a a(int i10) {
        if (i10 < 0) {
            return f1627d;
        }
        return this.f1629b[i10 + 0];
    }

    public final boolean b(int i10) {
        boolean z9;
        if (i10 == this.f1628a - 1) {
            a a10 = a(i10);
            if (a10.f1622i && a10.f1614a == Long.MIN_VALUE && a10.f1615b == -1) {
                z9 = true;
            } else {
                z9 = false;
            }
            if (z9) {
                return true;
            }
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        if (f1.b0.a(null, null) && this.f1628a == bVar.f1628a && Arrays.equals(this.f1629b, bVar.f1629b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f1629b) + (((((((((this.f1628a * 31) + 0) * 31) + ((int) 0)) * 31) + ((int) (-9223372036854775807L))) * 31) + 0) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AdPlaybackState(adsId=null, adResumePositionUs=0, adGroups=[");
        int i10 = 0;
        while (true) {
            a[] aVarArr = this.f1629b;
            if (i10 < aVarArr.length) {
                sb.append("adGroup(timeUs=");
                sb.append(aVarArr[i10].f1614a);
                sb.append(", ads=[");
                for (int i11 = 0; i11 < aVarArr[i10].f1619f.length; i11++) {
                    sb.append("ad(state=");
                    int i12 = aVarArr[i10].f1619f[i11];
                    if (i12 != 0) {
                        if (i12 != 1) {
                            if (i12 != 2) {
                                if (i12 != 3) {
                                    if (i12 != 4) {
                                        sb.append('?');
                                    } else {
                                        sb.append('!');
                                    }
                                } else {
                                    sb.append('P');
                                }
                            } else {
                                sb.append('S');
                            }
                        } else {
                            sb.append('R');
                        }
                    } else {
                        sb.append('_');
                    }
                    sb.append(", durationUs=");
                    sb.append(aVarArr[i10].f1620g[i11]);
                    sb.append(')');
                    if (i11 < aVarArr[i10].f1619f.length - 1) {
                        sb.append(", ");
                    }
                }
                sb.append("])");
                if (i10 < -1) {
                    sb.append(", ");
                }
                i10++;
            } else {
                sb.append("])");
                return sb.toString();
            }
        }
    }
}
