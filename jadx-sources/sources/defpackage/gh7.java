package defpackage;

import java.util.Arrays;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class gh7 {
    public static final gh7 f = new gh7(0, new int[0], new Object[0], false);
    public int a;
    public int[] b;
    public Object[] c;
    public int d = -1;
    public boolean e;

    public gh7(int i, int[] iArr, Object[] objArr, boolean z) {
        this.a = i;
        this.b = iArr;
        this.c = objArr;
        this.e = z;
    }

    public static gh7 a() {
        return new gh7(0, new int[8], new Object[8], true);
    }

    public final void b(ub7 ub7Var) {
        ef7 ef7Var = (ef7) ub7Var.y;
        if (this.a != 0) {
            for (int i = 0; i < this.a; i++) {
                int i2 = this.b[i];
                Object obj = this.c[i];
                int i3 = i2 & 7;
                int i4 = i2 >>> 3;
                if (i3 != 0) {
                    if (i3 != 1) {
                        if (i3 != 2) {
                            if (i3 != 3) {
                                if (i3 == 5) {
                                    ef7Var.g(i4, ((Integer) obj).intValue());
                                } else {
                                    throw new RuntimeException(new zf7());
                                }
                            } else {
                                ef7Var.d(i4, 3);
                                ((gh7) obj).b(ub7Var);
                                ef7Var.d(i4, 4);
                            }
                        } else {
                            ef7Var.l(i4, (we7) obj);
                        }
                    } else {
                        ef7Var.i(i4, ((Long) obj).longValue());
                    }
                } else {
                    ef7Var.h(i4, ((Long) obj).longValue());
                }
            }
        }
    }

    public final int c() {
        int a;
        int b;
        int a2;
        int i = this.d;
        if (i == -1) {
            int i2 = 0;
            for (int i3 = 0; i3 < this.a; i3++) {
                int i4 = this.b[i3];
                int i5 = i4 >>> 3;
                int i6 = i4 & 7;
                if (i6 != 0) {
                    if (i6 != 1) {
                        if (i6 != 2) {
                            if (i6 != 3) {
                                if (i6 == 5) {
                                    ((Integer) this.c[i3]).getClass();
                                    a2 = ef7.a(i5 << 3) + 4;
                                } else {
                                    throw new IllegalStateException(new zf7());
                                }
                            } else {
                                int a3 = ef7.a(i5 << 3);
                                a = a3 + a3;
                                b = ((gh7) this.c[i3]).c();
                            }
                        } else {
                            int i7 = i5 << 3;
                            we7 we7Var = (we7) this.c[i3];
                            int a4 = ef7.a(i7);
                            int c = we7Var.c();
                            i2 = zo5.e(c, c, a4, i2);
                        }
                    } else {
                        ((Long) this.c[i3]).getClass();
                        a2 = ef7.a(i5 << 3) + 8;
                    }
                    i2 = a2 + i2;
                } else {
                    int i8 = i5 << 3;
                    long longValue = ((Long) this.c[i3]).longValue();
                    a = ef7.a(i8);
                    b = ef7.b(longValue);
                }
                i2 = b + a + i2;
            }
            this.d = i2;
            return i2;
        }
        return i;
    }

    public final void d(int i, Object obj) {
        if (this.e) {
            e(this.a + 1);
            int[] iArr = this.b;
            int i2 = this.a;
            iArr[i2] = i;
            this.c[i2] = obj;
            this.a = i2 + 1;
            return;
        }
        ze0.d();
    }

    public final void e(int i) {
        int[] iArr = this.b;
        if (i > iArr.length) {
            int i2 = this.a;
            int i3 = (i2 / 2) + i2;
            if (i3 >= i) {
                i = i3;
            }
            if (i < 8) {
                i = 8;
            }
            this.b = Arrays.copyOf(iArr, i);
            this.c = Arrays.copyOf(this.c, i);
        }
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && (obj instanceof gh7)) {
                gh7 gh7Var = (gh7) obj;
                int i = this.a;
                if (i == gh7Var.a) {
                    int[] iArr = this.b;
                    int[] iArr2 = gh7Var.b;
                    int i2 = 0;
                    while (true) {
                        if (i2 < i) {
                            if (iArr[i2] != iArr2[i2]) {
                                break;
                            }
                            i2++;
                        } else {
                            Object[] objArr = this.c;
                            Object[] objArr2 = gh7Var.c;
                            int i3 = this.a;
                            for (int i4 = 0; i4 < i3; i4++) {
                                if (objArr[i4].equals(objArr2[i4])) {
                                }
                            }
                            return true;
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i = this.a;
        int i2 = i + 527;
        int[] iArr = this.b;
        int i3 = 17;
        int i4 = 17;
        for (int i5 = 0; i5 < i; i5++) {
            i4 = (i4 * 31) + iArr[i5];
        }
        int i6 = ((i2 * 31) + i4) * 31;
        Object[] objArr = this.c;
        int i7 = this.a;
        for (int i8 = 0; i8 < i7; i8++) {
            i3 = (i3 * 31) + objArr[i8].hashCode();
        }
        return i6 + i3;
    }
}
