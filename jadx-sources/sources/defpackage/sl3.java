package defpackage;

import java.util.Arrays;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class sl3 implements Cloneable {
    public /* synthetic */ int A;
    public /* synthetic */ boolean x;
    public /* synthetic */ long[] y;
    public /* synthetic */ Object[] z;

    public sl3(int i) {
        if (i == 0) {
            this.y = w65.d;
            this.z = w65.e;
            return;
        }
        int i2 = i * 8;
        int i3 = 4;
        while (true) {
            if (i3 >= 32) {
                break;
            }
            int i4 = (1 << i3) - 12;
            if (i2 <= i4) {
                i2 = i4;
                break;
            }
            i3++;
        }
        int i5 = i2 / 8;
        this.y = new long[i5];
        this.z = new Object[i5];
    }

    public final void a() {
        int i = this.A;
        Object[] objArr = this.z;
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = null;
        }
        this.A = 0;
        this.x = false;
    }

    public final Object b(long j) {
        Object obj;
        int q = w65.q(this.y, this.A, j);
        if (q >= 0 && (obj = this.z[q]) != sw0.H) {
            return obj;
        }
        return null;
    }

    public final long c(int i) {
        int i2;
        if (i >= 0 && i < (i2 = this.A)) {
            if (this.x) {
                long[] jArr = this.y;
                Object[] objArr = this.z;
                int i3 = 0;
                for (int i4 = 0; i4 < i2; i4++) {
                    Object obj = objArr[i4];
                    if (obj != sw0.H) {
                        if (i4 != i3) {
                            jArr[i3] = jArr[i4];
                            objArr[i3] = obj;
                            objArr[i4] = null;
                        }
                        i3++;
                    }
                }
                this.x = false;
                this.A = i3;
            }
            return this.y[i];
        }
        ze0.k(qx1.h(i, "Expected index to be within 0..size()-1, but was "));
        return 0L;
    }

    public final Object clone() {
        Object clone = super.clone();
        clone.getClass();
        sl3 sl3Var = (sl3) clone;
        sl3Var.y = (long[]) this.y.clone();
        sl3Var.z = (Object[]) this.z.clone();
        return sl3Var;
    }

    public final void d(long j, Object obj) {
        Object obj2 = sw0.H;
        int q = w65.q(this.y, this.A, j);
        if (q >= 0) {
            this.z[q] = obj;
            return;
        }
        int i = ~q;
        int i2 = this.A;
        if (i < i2) {
            Object[] objArr = this.z;
            if (objArr[i] == obj2) {
                this.y[i] = j;
                objArr[i] = obj;
                return;
            }
        }
        if (this.x) {
            long[] jArr = this.y;
            if (i2 >= jArr.length) {
                Object[] objArr2 = this.z;
                int i3 = 0;
                for (int i4 = 0; i4 < i2; i4++) {
                    Object obj3 = objArr2[i4];
                    if (obj3 != obj2) {
                        if (i4 != i3) {
                            jArr[i3] = jArr[i4];
                            objArr2[i3] = obj3;
                            objArr2[i4] = null;
                        }
                        i3++;
                    }
                }
                this.x = false;
                this.A = i3;
                i = ~w65.q(this.y, i3, j);
            }
        }
        int i5 = this.A;
        if (i5 >= this.y.length) {
            int i6 = (i5 + 1) * 8;
            int i7 = 4;
            while (true) {
                if (i7 >= 32) {
                    break;
                }
                int i8 = (1 << i7) - 12;
                if (i6 <= i8) {
                    i6 = i8;
                    break;
                }
                i7++;
            }
            int i9 = i6 / 8;
            this.y = Arrays.copyOf(this.y, i9);
            this.z = Arrays.copyOf(this.z, i9);
        }
        int i10 = this.A;
        if (i10 - i != 0) {
            long[] jArr2 = this.y;
            int i11 = i + 1;
            ms.z0(jArr2, jArr2, i11, i, i10);
            Object[] objArr3 = this.z;
            ms.x0(i11, i, this.A, objArr3, objArr3);
        }
        this.y[i] = j;
        this.z[i] = obj;
        this.A++;
    }

    public final void e(long j) {
        int q = w65.q(this.y, this.A, j);
        if (q >= 0) {
            Object[] objArr = this.z;
            Object obj = objArr[q];
            Object obj2 = sw0.H;
            if (obj != obj2) {
                objArr[q] = obj2;
                this.x = true;
            }
        }
    }

    public final int f() {
        if (this.x) {
            int i = this.A;
            long[] jArr = this.y;
            Object[] objArr = this.z;
            int i2 = 0;
            for (int i3 = 0; i3 < i; i3++) {
                Object obj = objArr[i3];
                if (obj != sw0.H) {
                    if (i3 != i2) {
                        jArr[i2] = jArr[i3];
                        objArr[i2] = obj;
                        objArr[i3] = null;
                    }
                    i2++;
                }
            }
            this.x = false;
            this.A = i2;
        }
        return this.A;
    }

    public final Object g(int i) {
        int i2;
        if (i >= 0 && i < (i2 = this.A)) {
            if (this.x) {
                long[] jArr = this.y;
                Object[] objArr = this.z;
                int i3 = 0;
                for (int i4 = 0; i4 < i2; i4++) {
                    Object obj = objArr[i4];
                    if (obj != sw0.H) {
                        if (i4 != i3) {
                            jArr[i3] = jArr[i4];
                            objArr[i3] = obj;
                            objArr[i4] = null;
                        }
                        i3++;
                    }
                }
                this.x = false;
                this.A = i3;
            }
            return this.z[i];
        }
        ze0.k(qx1.h(i, "Expected index to be within 0..size()-1, but was "));
        return null;
    }

    public final String toString() {
        if (f() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.A * 28);
        sb.append('{');
        int i = this.A;
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            sb.append(c(i2));
            sb.append('=');
            Object g = g(i2);
            if (g != sb) {
                sb.append(g);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public /* synthetic */ sl3(Object obj) {
        this(10);
    }
}
