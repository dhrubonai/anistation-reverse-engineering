package defpackage;

import java.util.Arrays;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class cl3 {
    public final /* synthetic */ byte a = 1;
    public int b;
    public long[] c;

    public cl3(int i) {
        this.c = new long[i];
    }

    public final void a(long j) {
        switch (this.a) {
            case 0:
                int i = this.b;
                long[] jArr = this.c;
                if (i == jArr.length) {
                    jArr = Arrays.copyOf(jArr, i * 2);
                    this.c = jArr;
                }
                int i2 = this.b;
                this.b = i2 + 1;
                jArr[i2] = j;
                return;
            default:
                if (!c(j)) {
                    int i3 = this.b;
                    long[] jArr2 = this.c;
                    if (i3 >= jArr2.length) {
                        jArr2 = Arrays.copyOf(jArr2, Math.max(i3 + 1, jArr2.length * 2));
                        this.c = jArr2;
                    }
                    jArr2[i3] = j;
                    if (i3 >= this.b) {
                        this.b = i3 + 1;
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public void b(long[] jArr) {
        int length = this.b + jArr.length;
        long[] jArr2 = this.c;
        if (length > jArr2.length) {
            jArr2 = Arrays.copyOf(jArr2, Math.max(jArr2.length * 2, length));
            this.c = jArr2;
        }
        System.arraycopy(jArr, 0, jArr2, this.b, jArr.length);
        this.b = length;
    }

    public boolean c(long j) {
        int i = this.b;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.c[i2] == j) {
                return true;
            }
        }
        return false;
    }

    public long d(int i) {
        if (i >= 0 && i < this.b) {
            return this.c[i];
        }
        p65.k(qx1.s(i, "Invalid index ", ", size is "), this.b);
        return 0L;
    }

    public void e(long j) {
        int i = this.b;
        int i2 = 0;
        while (i2 < i) {
            if (j == this.c[i2]) {
                int i3 = this.b - 1;
                while (i2 < i3) {
                    long[] jArr = this.c;
                    int i4 = i2 + 1;
                    jArr[i2] = jArr[i4];
                    i2 = i4;
                }
                this.b--;
                return;
            }
            i2++;
        }
    }

    public /* synthetic */ cl3() {
    }
}
