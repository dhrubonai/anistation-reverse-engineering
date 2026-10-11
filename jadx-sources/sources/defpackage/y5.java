package defpackage;

import java.util.Arrays;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class y5 {
    public static final y5 c = new y5(new w5[0]);
    public static final w5 d;
    public static final String e;
    public final int a;
    public final w5[] b;

    static {
        w5 w5Var = new w5(-1, new int[0], new ar3[0], new long[0], new String[0], new x5[0]);
        int[] iArr = w5Var.d;
        int length = iArr.length;
        int max = Math.max(0, length);
        int[] copyOf = Arrays.copyOf(iArr, max);
        Arrays.fill(copyOf, length, max, 0);
        long[] jArr = w5Var.e;
        int length2 = jArr.length;
        int max2 = Math.max(0, length2);
        long[] copyOf2 = Arrays.copyOf(jArr, max2);
        Arrays.fill(copyOf2, length2, max2, -9223372036854775807L);
        ar3[] ar3VarArr = (ar3[]) Arrays.copyOf(w5Var.c, 0);
        String[] strArr = (String[]) Arrays.copyOf(w5Var.f, 0);
        x5[] x5VarArr = w5Var.g;
        d = new w5(0, copyOf, ar3VarArr, copyOf2, strArr, (x5[]) Arrays.copyOf(x5VarArr, Math.max(0, x5VarArr.length)));
        String str = eq6.a;
        e = Integer.toString(1, 36);
        Integer.toString(2, 36);
        Integer.toString(3, 36);
        Integer.toString(4, 36);
    }

    public y5(w5[] w5VarArr) {
        this.a = w5VarArr.length;
        this.b = w5VarArr;
    }

    public final w5 a(int i) {
        if (i < 0) {
            return d;
        }
        return this.b[i];
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && y5.class == obj.getClass()) {
                y5 y5Var = (y5) obj;
                if (this.a == y5Var.a && Arrays.equals(this.b, y5Var.b)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.b) + (((this.a * 29791) + 1) * 961);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AdPlaybackState(adsId=null, adResumePositionUs=0, adGroups=[");
        int i = 0;
        while (true) {
            w5[] w5VarArr = this.b;
            if (i < w5VarArr.length) {
                sb.append("adGroup(timeUs=0, contentResumeOffsetUs=0, ads=[");
                w5VarArr[i].getClass();
                w5VarArr[i].getClass();
                for (int i2 = 0; i2 < w5VarArr[i].d.length; i2++) {
                    sb.append("ad(state=");
                    int i3 = w5VarArr[i].d[i2];
                    if (i3 != 0) {
                        if (i3 != 1) {
                            if (i3 != 2) {
                                if (i3 != 3) {
                                    if (i3 != 4) {
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
                    sb.append(w5VarArr[i].e[i2]);
                    sb.append(')');
                    if (i2 < w5VarArr[i].d.length - 1) {
                        sb.append(", ");
                    }
                }
                sb.append("])");
                if (i < w5VarArr.length - 1) {
                    sb.append(", ");
                }
                i++;
            } else {
                sb.append("])");
                return sb.toString();
            }
        }
    }
}
