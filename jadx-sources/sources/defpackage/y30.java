package defpackage;

import android.os.SystemClock;
import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public abstract class y30 implements jz1 {
    public static final be g = new be(2);
    public final yg6 a;
    public final int b;
    public final int[] c;
    public final ea2[] d;
    public final long[] e;
    public int f;

    public y30(yg6 yg6Var, int[] iArr, Object obj) {
        boolean z;
        ea2[] ea2VarArr;
        int i = 0;
        if (iArr.length > 0) {
            z = true;
        } else {
            z = false;
        }
        io3.B(z);
        yg6Var.getClass();
        this.a = yg6Var;
        int length = iArr.length;
        this.b = length;
        this.d = new ea2[length];
        int i2 = 0;
        while (true) {
            int length2 = iArr.length;
            ea2VarArr = this.d;
            if (i2 >= length2) {
                break;
            }
            ea2VarArr[i2] = yg6Var.d[iArr[i2]];
            i2++;
        }
        Arrays.sort(ea2VarArr, g);
        this.c = new int[this.b];
        while (true) {
            int i3 = this.b;
            if (i < i3) {
                this.c[i] = yg6Var.a(this.d[i]);
                i++;
            } else {
                this.e = new long[i3];
                return;
            }
        }
    }

    @Override // defpackage.jz1
    public final boolean a(int i, long j) {
        if (this.e[i] > j) {
            return true;
        }
        return false;
    }

    @Override // defpackage.jz1
    public final yg6 c() {
        return this.a;
    }

    @Override // defpackage.jz1
    public final void e() {
        Arrays.fill(this.e, 0L);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            y30 y30Var = (y30) obj;
            if (this.a.equals(y30Var.a) && Arrays.equals(this.c, y30Var.c)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.jz1
    public final ea2 h(int i) {
        return this.d[i];
    }

    public final int hashCode() {
        int i = this.f;
        if (i == 0) {
            int hashCode = Arrays.hashCode(this.c) + (System.identityHashCode(this.a) * 31);
            this.f = hashCode;
            return hashCode;
        }
        return i;
    }

    @Override // defpackage.jz1
    public final int j(int i) {
        return this.c[i];
    }

    @Override // defpackage.jz1
    public int k(long j, List list) {
        return list.size();
    }

    @Override // defpackage.jz1
    public final int length() {
        return this.c.length;
    }

    @Override // defpackage.jz1
    public final int m() {
        return this.c[d()];
    }

    @Override // defpackage.jz1
    public final ea2 n() {
        return this.d[d()];
    }

    @Override // defpackage.jz1
    public final boolean p(int i, long j) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        boolean a = a(i, elapsedRealtime);
        for (int i2 = 0; i2 < this.b && !a; i2++) {
            if (i2 != i && !a(i2, elapsedRealtime)) {
                a = true;
            } else {
                a = false;
            }
        }
        if (!a) {
            return false;
        }
        long[] jArr = this.e;
        jArr[i] = Math.max(jArr[i], eq6.a(elapsedRealtime, j));
        return true;
    }

    @Override // defpackage.jz1
    public final int u(int i) {
        for (int i2 = 0; i2 < this.b; i2++) {
            if (this.c[i2] == i) {
                return i2;
            }
        }
        return -1;
    }

    @Override // defpackage.jz1
    public void i() {
    }

    @Override // defpackage.jz1
    public void l() {
    }

    @Override // defpackage.jz1
    public final void g(boolean z) {
    }

    @Override // defpackage.jz1
    public void q(float f) {
    }
}
