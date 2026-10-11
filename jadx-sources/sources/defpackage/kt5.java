package defpackage;

import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class kt5 implements Iterable, j73 {
    public static final kt5 B = new kt5(0, 0, 0, null);
    public final long[] A;
    public final long x;
    public final long y;
    public final long z;

    public kt5(long j, long j2, long j3, long[] jArr) {
        this.x = j;
        this.y = j2;
        this.z = j3;
        this.A = jArr;
    }

    public final kt5 b(kt5 kt5Var) {
        long[] jArr;
        kt5 kt5Var2 = this;
        kt5 kt5Var3 = B;
        if (kt5Var == kt5Var3) {
            return kt5Var2;
        }
        if (kt5Var2 == kt5Var3) {
            return kt5Var3;
        }
        long j = kt5Var.z;
        long j2 = kt5Var.z;
        long[] jArr2 = kt5Var.A;
        long j3 = kt5Var.y;
        long j4 = kt5Var.x;
        long j5 = kt5Var2.z;
        if (j == j5 && jArr2 == (jArr = kt5Var2.A)) {
            return new kt5(kt5Var2.x & (~j4), kt5Var2.y & (~j3), j5, jArr);
        }
        if (jArr2 != null) {
            for (long j6 : jArr2) {
                kt5Var2 = kt5Var2.c(j6);
            }
        }
        if (j3 != 0) {
            for (int i = 0; i < 64; i++) {
                if (((1 << i) & j3) != 0) {
                    kt5Var2 = kt5Var2.c(i + j2);
                }
            }
        }
        if (j4 != 0) {
            for (int i2 = 0; i2 < 64; i2++) {
                if (((1 << i2) & j4) != 0) {
                    kt5Var2 = kt5Var2.c(i2 + j2 + 64);
                }
            }
        }
        return kt5Var2;
    }

    public final kt5 c(long j) {
        long[] jArr;
        int k;
        long[] jArr2;
        long j2 = j - this.z;
        if (a34.E(j2, 0L) >= 0 && a34.E(j2, 64L) < 0) {
            long j3 = 1 << ((int) j2);
            long j4 = this.y;
            if ((j4 & j3) != 0) {
                return new kt5(this.x, j4 & (~j3), this.z, this.A);
            }
        } else if (a34.E(j2, 64L) >= 0 && a34.E(j2, 128L) < 0) {
            long j5 = 1 << (((int) j2) - 64);
            long j6 = this.x;
            if ((j6 & j5) != 0) {
                return new kt5(j6 & (~j5), this.y, this.z, this.A);
            }
        } else if (a34.E(j2, 0L) < 0 && (jArr = this.A) != null && (k = lt5.k(jArr, j)) >= 0) {
            int length = jArr.length;
            int i = length - 1;
            if (i == 0) {
                jArr2 = null;
            } else {
                long[] jArr3 = new long[i];
                if (k > 0) {
                    ms.z0(jArr, jArr3, 0, 0, k);
                }
                if (k < i) {
                    ms.z0(jArr, jArr3, k, k + 1, length);
                }
                jArr2 = jArr3;
            }
            return new kt5(this.x, this.y, this.z, jArr2);
        }
        return this;
    }

    public final boolean d(long j) {
        long[] jArr;
        long j2 = j - this.z;
        if (a34.E(j2, 0L) >= 0 && a34.E(j2, 64L) < 0) {
            if (((1 << ((int) j2)) & this.y) != 0) {
                return true;
            }
            return false;
        }
        if (a34.E(j2, 64L) >= 0 && a34.E(j2, 128L) < 0) {
            if (((1 << (((int) j2) - 64)) & this.x) != 0) {
                return true;
            }
            return false;
        }
        if (a34.E(j2, 0L) <= 0 && (jArr = this.A) != null && lt5.k(jArr, j) >= 0) {
            return true;
        }
        return false;
    }

    public final kt5 f(kt5 kt5Var) {
        kt5 kt5Var2;
        long[] jArr;
        kt5 kt5Var3 = this;
        kt5 kt5Var4 = B;
        if (kt5Var == kt5Var4) {
            return kt5Var3;
        }
        if (kt5Var3 == kt5Var4) {
            return kt5Var;
        }
        long j = kt5Var.z;
        long j2 = kt5Var.z;
        long[] jArr2 = kt5Var.A;
        long j3 = kt5Var.y;
        long j4 = kt5Var.x;
        long j5 = kt5Var3.z;
        long j6 = kt5Var3.y;
        long j7 = kt5Var3.x;
        if (j == j5 && jArr2 == (jArr = kt5Var3.A)) {
            return new kt5(j7 | j4, j6 | j3, j5, jArr);
        }
        int i = 0;
        long[] jArr3 = kt5Var3.A;
        if (jArr3 == null) {
            if (jArr3 != null) {
                kt5Var2 = kt5Var;
                for (long j8 : jArr3) {
                    kt5Var2 = kt5Var2.g(j8);
                }
            } else {
                kt5Var2 = kt5Var;
            }
            long j9 = kt5Var3.z;
            if (j6 != 0) {
                for (int i2 = 0; i2 < 64; i2++) {
                    if (((1 << i2) & j6) != 0) {
                        kt5Var2 = kt5Var2.g(i2 + j9);
                    }
                }
            }
            if (j7 != 0) {
                while (i < 64) {
                    if (((1 << i) & j7) != 0) {
                        kt5Var2 = kt5Var2.g(i + j9 + 64);
                    }
                    i++;
                }
            }
            return kt5Var2;
        }
        if (jArr2 != null) {
            for (long j10 : jArr2) {
                kt5Var3 = kt5Var3.g(j10);
            }
        }
        if (j3 != 0) {
            for (int i3 = 0; i3 < 64; i3++) {
                if (((1 << i3) & j3) != 0) {
                    kt5Var3 = kt5Var3.g(i3 + j2);
                }
            }
        }
        if (j4 != 0) {
            while (i < 64) {
                if (((1 << i) & j4) != 0) {
                    kt5Var3 = kt5Var3.g(i + j2 + 64);
                }
                i++;
            }
        }
        return kt5Var3;
    }

    public final kt5 g(long j) {
        long j2;
        long j3;
        long[] jArr;
        long[] jArr2;
        int i;
        long j4;
        long j5 = this.z;
        long j6 = j - j5;
        long j7 = 0;
        int E = a34.E(j6, 0L);
        long j8 = this.y;
        if (E >= 0 && a34.E(j6, 64L) < 0) {
            long j9 = 1 << ((int) j6);
            if ((j8 & j9) == 0) {
                return new kt5(this.x, j8 | j9, this.z, this.A);
            }
        } else {
            int E2 = a34.E(j6, 64L);
            long j10 = this.x;
            int i2 = 64;
            if (E2 >= 0 && a34.E(j6, 128L) < 0) {
                long j11 = 1 << (((int) j6) - 64);
                if ((j10 & j11) == 0) {
                    return new kt5(j10 | j11, this.y, this.z, this.A);
                }
            } else {
                int E3 = a34.E(j6, 128L);
                long[] jArr3 = this.A;
                if (E3 >= 0) {
                    if (!d(j)) {
                        long j12 = ((j + 1) / 64) * 64;
                        if (a34.E(j12, 0L) < 0) {
                            j12 = 9223372036854775680L;
                        }
                        long j13 = j10;
                        eo3 eo3Var = null;
                        while (true) {
                            if (a34.E(j5, j12) < 0) {
                                if (j8 != j7) {
                                    if (eo3Var == null) {
                                        eo3Var = new eo3(jArr3);
                                    }
                                    int i3 = 0;
                                    i = i2;
                                    while (i3 < i) {
                                        if ((j8 & (1 << i3)) != j7) {
                                            j4 = j7;
                                            ((w34) eo3Var.y).a(i3 + j5);
                                        } else {
                                            j4 = j7;
                                        }
                                        i3++;
                                        j7 = j4;
                                    }
                                } else {
                                    i = i2;
                                }
                                long j14 = j7;
                                if (j13 == j14) {
                                    j2 = j12;
                                    j3 = j14;
                                    break;
                                }
                                j5 += 64;
                                j7 = j14;
                                j8 = j13;
                                i2 = i;
                                j13 = j7;
                            } else {
                                j2 = j5;
                                j3 = j8;
                                break;
                            }
                        }
                        if (eo3Var != null) {
                            w34 w34Var = (w34) eo3Var.y;
                            int i4 = w34Var.b;
                            if (i4 == 0) {
                                jArr2 = null;
                            } else {
                                long[] jArr4 = new long[i4];
                                long[] jArr5 = w34Var.a;
                                for (int i5 = 0; i5 < i4; i5++) {
                                    jArr4[i5] = jArr5[i5];
                                }
                                jArr2 = jArr4;
                            }
                            if (jArr2 != null) {
                                jArr = jArr2;
                                return new kt5(j13, j3, j2, jArr).g(j);
                            }
                        }
                        jArr = jArr3;
                        return new kt5(j13, j3, j2, jArr).g(j);
                    }
                } else {
                    if (jArr3 == null) {
                        return new kt5(this.x, this.y, this.z, new long[]{j});
                    }
                    int k = lt5.k(jArr3, j);
                    if (k < 0) {
                        int i6 = -(k + 1);
                        int length = jArr3.length;
                        long[] jArr6 = new long[length + 1];
                        ms.z0(jArr3, jArr6, 0, 0, i6);
                        ms.z0(jArr3, jArr6, i6 + 1, i6, length);
                        jArr6[i6] = j;
                        return new kt5(this.x, this.y, this.z, jArr6);
                    }
                }
            }
        }
        return this;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return io3.V(new jt5(this, null));
    }

    public final String toString() {
        String obj = super.toString();
        ArrayList arrayList = new ArrayList(zo0.V(this, 10));
        Iterator it = iterator();
        while (it.hasNext()) {
            arrayList.add(String.valueOf(((Number) it.next()).longValue()));
        }
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "");
        int size = arrayList.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            Object obj2 = arrayList.get(i2);
            boolean z = true;
            i++;
            if (i > 1) {
                sb.append((CharSequence) ", ");
            }
            if (obj2 != null) {
                z = obj2 instanceof CharSequence;
            }
            if (z) {
                sb.append((CharSequence) obj2);
            } else if (obj2 instanceof Character) {
                sb.append(((Character) obj2).charValue());
            } else {
                sb.append((CharSequence) obj2.toString());
            }
        }
        sb.append((CharSequence) "");
        return obj + " [" + sb.toString() + "]";
    }
}
