package defpackage;

import java.util.Arrays;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class w34 {
    public long[] a;
    public int b;

    public w34(int i) {
        long[] jArr;
        if (i == 0) {
            jArr = rl3.a;
        } else {
            jArr = new long[i];
        }
        this.a = jArr;
    }

    public final void a(long j) {
        b(this.b + 1);
        long[] jArr = this.a;
        int i = this.b;
        jArr[i] = j;
        this.b = i + 1;
    }

    public final void b(int i) {
        long[] jArr = this.a;
        if (jArr.length < i) {
            this.a = Arrays.copyOf(jArr, Math.max(i, (jArr.length * 3) / 2));
        }
    }

    public final long c(int i) {
        if (i >= 0 && i < this.b) {
            return this.a[i];
        }
        ze0.g("Index must be between 0 and size");
        return 0L;
    }

    public final void d(int i, int i2) {
        int i3;
        if (i >= 0 && i <= (i3 = this.b) && i2 >= 0 && i2 <= i3) {
            if (i2 >= i) {
                if (i2 != i) {
                    if (i2 < i3) {
                        long[] jArr = this.a;
                        ms.z0(jArr, jArr, i, i2, i3);
                    }
                    this.b -= i2 - i;
                    return;
                }
                return;
            }
            ze0.k("The end index must be < start index");
            return;
        }
        ze0.g("Index must be between 0 and size");
    }

    public final void e(int i, long j) {
        if (i >= 0 && i < this.b) {
            long[] jArr = this.a;
            long j2 = jArr[i];
            jArr[i] = j;
            return;
        }
        ze0.g("Index must be between 0 and size");
    }

    public final boolean equals(Object obj) {
        if (obj instanceof w34) {
            w34 w34Var = (w34) obj;
            int i = w34Var.b;
            int i2 = this.b;
            if (i == i2) {
                long[] jArr = this.a;
                long[] jArr2 = w34Var.a;
                f13 r0 = db.r0(0, i2);
                int i3 = r0.x;
                int i4 = r0.y;
                if (i3 <= i4) {
                    while (jArr[i3] == jArr2[i3]) {
                        if (i3 != i4) {
                            i3++;
                        } else {
                            return true;
                        }
                    }
                    return false;
                }
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long[] jArr = this.a;
        int i = this.b;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            i2 += Long.hashCode(jArr[i3]) * 31;
        }
        return i2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        long[] jArr = this.a;
        int i = this.b;
        int i2 = 0;
        while (true) {
            if (i2 < i) {
                long j = jArr[i2];
                if (i2 == -1) {
                    sb.append((CharSequence) "...");
                    break;
                }
                if (i2 != 0) {
                    sb.append((CharSequence) ", ");
                }
                sb.append(j);
                i2++;
            } else {
                sb.append((CharSequence) "]");
                break;
            }
        }
        return sb.toString();
    }

    public /* synthetic */ w34() {
        this(16);
    }
}
