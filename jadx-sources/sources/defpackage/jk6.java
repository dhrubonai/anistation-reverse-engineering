package defpackage;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class jk6 implements b12 {
    public final byte a;
    public final int b;
    public final List c;
    public final zi4 d;
    public final SparseIntArray e;
    public final rb1 f;
    public final w16 g;
    public final SparseArray h;
    public final SparseBooleanArray i;
    public final SparseBooleanArray j;
    public final rw4 k;
    public b42 l;
    public d12 m;
    public int n;
    public boolean o;
    public boolean p;
    public boolean q;
    public mk6 r;
    public int s;
    public int t;

    /* JADX WARN: Multi-variable type inference failed */
    public jk6(int i, int i2, w16 w16Var, tf6 tf6Var, rb1 rb1Var) {
        this.f = rb1Var;
        this.a = i;
        this.b = i2;
        this.g = w16Var;
        if (i != 1 && i != 2) {
            ArrayList arrayList = new ArrayList();
            this.c = arrayList;
            arrayList.add(tf6Var);
        } else {
            this.c = Collections.singletonList(tf6Var);
        }
        this.d = new zi4(0, new byte[9400]);
        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
        this.i = sparseBooleanArray;
        this.j = new SparseBooleanArray();
        SparseArray sparseArray = new SparseArray();
        this.h = sparseArray;
        this.e = new SparseIntArray();
        this.k = new rw4((byte) 1);
        this.m = d12.g;
        this.t = -1;
        sparseBooleanArray.clear();
        sparseArray.clear();
        SparseArray sparseArray2 = new SparseArray();
        int size = sparseArray2.size();
        for (int i3 = 0; i3 < size; i3++) {
            sparseArray.put(sparseArray2.keyAt(i3), (mk6) sparseArray2.valueAt(i3));
        }
        sparseArray.put(0, new df5(new y23(this)));
        this.r = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v2, types: [int, boolean] */
    @Override // defpackage.b12
    public final int a(c12 c12Var, d42 d42Var) {
        boolean z;
        c12 c12Var2;
        ?? r1;
        int i;
        byte b;
        byte b2;
        byte b3;
        int i2;
        boolean z2;
        byte b4;
        int i3;
        boolean z3;
        long j;
        long j2;
        long p = c12Var.p();
        byte b5 = this.a;
        if (b5 == 2) {
            z = true;
        } else {
            z = false;
        }
        byte b6 = 8;
        if (this.o) {
            rw4 rw4Var = this.k;
            if (p != -1 && !z && !rw4Var.d) {
                int i4 = this.t;
                tf6 tf6Var = rw4Var.b;
                zi4 zi4Var = rw4Var.c;
                if (i4 <= 0) {
                    rw4Var.a(c12Var);
                    return 0;
                }
                if (!rw4Var.f) {
                    long p2 = c12Var.p();
                    int min = (int) Math.min(112800L, p2);
                    long j3 = p2 - min;
                    if (c12Var.getPosition() != j3) {
                        d42Var.a = j3;
                        return 1;
                    }
                    zi4Var.K(min);
                    c12Var.u();
                    c12Var.A(zi4Var.a, 0, min);
                    int i5 = zi4Var.b;
                    int i6 = zi4Var.c;
                    int i7 = i6 - 188;
                    while (true) {
                        if (i7 >= i5) {
                            byte[] bArr = zi4Var.a;
                            int i8 = -4;
                            int i9 = 0;
                            while (true) {
                                if (i8 > 4) {
                                    break;
                                }
                                int i10 = (i8 * 188) + i7;
                                if (i10 >= i5 && i10 < i6 && bArr[i10] == 71) {
                                    i9++;
                                    if (i9 == 5) {
                                        long d = ov5.d(zi4Var, i7, i4);
                                        if (d != -9223372036854775807L) {
                                            j2 = d;
                                            break;
                                        }
                                    }
                                } else {
                                    i9 = 0;
                                }
                                i8++;
                            }
                            i7--;
                        } else {
                            j2 = -9223372036854775807L;
                            break;
                        }
                    }
                    rw4Var.h = j2;
                    rw4Var.f = true;
                    return 0;
                }
                if (rw4Var.h == -9223372036854775807L) {
                    rw4Var.a(c12Var);
                    return 0;
                }
                if (!rw4Var.e) {
                    int min2 = (int) Math.min(112800L, c12Var.p());
                    if (c12Var.getPosition() != 0) {
                        d42Var.a = 0L;
                        return 1;
                    }
                    zi4Var.K(min2);
                    c12Var.u();
                    c12Var.A(zi4Var.a, 0, min2);
                    int i11 = zi4Var.b;
                    int i12 = zi4Var.c;
                    while (true) {
                        if (i11 < i12) {
                            if (zi4Var.a[i11] == 71) {
                                long d2 = ov5.d(zi4Var, i11, i4);
                                if (d2 != -9223372036854775807L) {
                                    j = d2;
                                    break;
                                }
                            }
                            i11++;
                        } else {
                            j = -9223372036854775807L;
                            break;
                        }
                    }
                    rw4Var.g = j;
                    rw4Var.e = true;
                    return 0;
                }
                long j4 = rw4Var.g;
                if (j4 == -9223372036854775807L) {
                    rw4Var.a(c12Var);
                    return 0;
                }
                rw4Var.i = tf6Var.c(rw4Var.h) - tf6Var.b(j4);
                rw4Var.a(c12Var);
                return 0;
            }
            if (!this.p) {
                this.p = true;
                long j5 = rw4Var.i;
                if (j5 != -9223372036854775807L) {
                    i = 1;
                    b = b5;
                    z3 = false;
                    b42 b42Var = new b42(new i18(b6), new eb2(this.t, rw4Var.b), j5, j5 + 1, 0L, p, 188L, 940);
                    this.l = b42Var;
                    this.m.I(b42Var.a);
                } else {
                    i = 1;
                    z3 = false;
                    b = b5;
                    this.m.I(new zy(j5));
                }
            } else {
                i = 1;
                z3 = false;
                b = b5;
            }
            if (this.q) {
                this.q = z3;
                c(0L, 0L);
                if (c12Var.getPosition() != 0) {
                    d42Var.a = 0L;
                    return i;
                }
            }
            b42 b42Var2 = this.l;
            if (b42Var2 != null && b42Var2.c != null) {
                return b42Var2.a(c12Var, d42Var);
            }
            c12Var2 = c12Var;
            r1 = z3;
        } else {
            c12Var2 = c12Var;
            r1 = 0;
            i = 1;
            b = b5;
        }
        zi4 zi4Var2 = this.d;
        byte[] bArr2 = zi4Var2.a;
        if (9400 - zi4Var2.b < 188) {
            int a = zi4Var2.a();
            if (a > 0) {
                System.arraycopy(bArr2, zi4Var2.b, bArr2, r1, a);
            }
            zi4Var2.L(a, bArr2);
        }
        while (true) {
            int a2 = zi4Var2.a();
            SparseArray sparseArray = this.h;
            if (a2 < 188) {
                int i13 = zi4Var2.c;
                int read = c12Var2.read(bArr2, i13, 9400 - i13);
                if (read == -1) {
                    int i14 = r1;
                    while (i14 < sparseArray.size()) {
                        mk6 mk6Var = (mk6) sparseArray.valueAt(i14);
                        if (mk6Var instanceof pl4) {
                            pl4 pl4Var = (pl4) mk6Var;
                            if (z && !pl4Var.e()) {
                                i3 = r1;
                            } else {
                                i3 = i;
                            }
                            int i15 = pl4Var.c;
                            if (((i15 == 3 && pl4Var.j == -1) || i15 == i) && ((!z || !(pl4Var.a instanceof ti2)) && i3 != 0)) {
                                pl4Var.a(1, new zi4());
                            }
                        }
                        i14++;
                        i = 1;
                    }
                    return -1;
                }
                zi4Var2.M(i13 + read);
                i = 1;
            } else {
                int i16 = zi4Var2.b;
                int i17 = zi4Var2.c;
                byte[] bArr3 = zi4Var2.a;
                int i18 = i16;
                while (i18 < i17 && bArr3[i18] != 71) {
                    i18++;
                }
                zi4Var2.N(i18);
                int i19 = i18 + 188;
                mk6 mk6Var2 = null;
                if (i19 > i17) {
                    int i20 = (i18 - i16) + this.s;
                    this.s = i20;
                    b2 = b;
                    b3 = 2;
                    if (b2 == 2 && i20 > 376) {
                        throw bj4.a("Cannot find sync byte. Most likely not a Transport Stream.", null);
                    }
                } else {
                    b2 = b;
                    b3 = 2;
                    this.s = r1;
                }
                int i21 = zi4Var2.c;
                if (i19 > i21) {
                    return r1;
                }
                int m = zi4Var2.m();
                if ((8388608 & m) != 0) {
                    zi4Var2.N(i19);
                    return r1;
                }
                if ((4194304 & m) != 0) {
                    i2 = 1;
                } else {
                    i2 = r1;
                }
                int i22 = (2096896 & m) >> 8;
                if ((m & 32) != 0) {
                    z2 = true;
                } else {
                    z2 = r1;
                }
                if ((m & 16) != 0) {
                    mk6Var2 = (mk6) sparseArray.get(i22);
                }
                if (mk6Var2 == null) {
                    zi4Var2.N(i19);
                    return r1;
                }
                if (b2 != b3) {
                    int i23 = m & 15;
                    SparseIntArray sparseIntArray = this.e;
                    int i24 = sparseIntArray.get(i22, i23 - 1);
                    sparseIntArray.put(i22, i23);
                    if (i24 == i23) {
                        zi4Var2.N(i19);
                        return r1;
                    }
                    if (i23 != ((i24 + 1) & 15)) {
                        mk6Var2.c();
                    }
                }
                if (z2) {
                    int A = zi4Var2.A();
                    if ((zi4Var2.A() & 64) != 0) {
                        b4 = b3;
                    } else {
                        b4 = r1;
                    }
                    i2 |= b4;
                    zi4Var2.O(A - 1);
                }
                boolean z4 = this.o;
                if (b2 == b3 || z4 || !this.j.get(i22, r1)) {
                    zi4Var2.M(i19);
                    mk6Var2.a(i2, zi4Var2);
                    zi4Var2.M(i21);
                }
                if (b2 != b3 && !z4 && this.o && p != -1) {
                    this.q = true;
                }
                zi4Var2.N(i19);
                return r1;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x001e, code lost:
    
        r1 = r1 + 1;
     */
    @Override // defpackage.b12
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean b(defpackage.c12 r6) {
        /*
            r5 = this;
            zi4 r5 = r5.d
            byte[] r5 = r5.a
            p81 r6 = (defpackage.p81) r6
            r0 = 0
            r1 = 940(0x3ac, float:1.317E-42)
            r6.j(r5, r0, r1, r0)
            r1 = r0
        Ld:
            r2 = 188(0xbc, float:2.63E-43)
            if (r1 >= r2) goto L29
            r2 = r0
        L12:
            r3 = 5
            if (r2 >= r3) goto L24
            int r3 = r2 * 188
            int r3 = r3 + r1
            r3 = r5[r3]
            r4 = 71
            if (r3 == r4) goto L21
            int r1 = r1 + 1
            goto Ld
        L21:
            int r2 = r2 + 1
            goto L12
        L24:
            r6.i(r1, r0)
            r5 = 1
            return r5
        L29:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jk6.b(c12):boolean");
    }

    @Override // defpackage.b12
    public final void c(long j, long j2) {
        boolean z;
        b42 b42Var;
        long j3;
        boolean z2;
        SparseArray sparseArray = this.h;
        List list = this.c;
        if (this.a != 2) {
            z = true;
        } else {
            z = false;
        }
        io3.B(z);
        int size = list.size();
        for (int i = 0; i < size; i++) {
            tf6 tf6Var = (tf6) list.get(i);
            synchronized (tf6Var) {
                j3 = tf6Var.b;
            }
            if (j3 == -9223372036854775807L) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (!z2) {
                long d = tf6Var.d();
                if (d != -9223372036854775807L && d != 0 && d != j2) {
                    z2 = true;
                } else {
                    z2 = false;
                }
            }
            if (z2) {
                tf6Var.f(j2);
            }
        }
        if (j2 != 0 && (b42Var = this.l) != null) {
            b42Var.d(j2);
        }
        this.d.K(0);
        this.e.clear();
        for (int i2 = 0; i2 < sparseArray.size(); i2++) {
            ((mk6) sparseArray.valueAt(i2)).c();
        }
        this.s = 0;
    }

    @Override // defpackage.b12
    public final void e(d12 d12Var) {
        if ((this.b & 1) == 0) {
            d12Var = new tu(d12Var, this.g);
        }
        this.m = d12Var;
    }

    @Override // defpackage.b12
    public final void release() {
    }
}
