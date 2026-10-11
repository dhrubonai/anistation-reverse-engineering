package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class aa4 extends ka4 {
    public final xz3 c;
    public final cl3 d;
    public final sl3 e;
    public fa4 f;
    public nq4 g;
    public boolean h;
    public boolean i;
    public boolean j;

    public aa4(xz3 xz3Var) {
        this.c = xz3Var;
        cl3 cl3Var = new cl3();
        cl3Var.c = new long[2];
        this.d = cl3Var;
        this.e = new sl3(2);
        this.i = true;
        this.j = true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v6, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v0, types: [xz3] */
    /* JADX WARN: Type inference failed for: r5v1, types: [xz3] */
    /* JADX WARN: Type inference failed for: r5v39 */
    /* JADX WARN: Type inference failed for: r5v40, types: [xz3] */
    /* JADX WARN: Type inference failed for: r5v41, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v42 */
    /* JADX WARN: Type inference failed for: r5v43 */
    /* JADX WARN: Type inference failed for: r5v44 */
    /* JADX WARN: Type inference failed for: r5v45 */
    /* JADX WARN: Type inference failed for: r5v46 */
    /* JADX WARN: Type inference failed for: r5v47 */
    /* JADX WARN: Type inference failed for: r5v48 */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9, types: [int] */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v18 */
    /* JADX WARN: Type inference failed for: r8v19, types: [z44] */
    /* JADX WARN: Type inference failed for: r8v20 */
    /* JADX WARN: Type inference failed for: r8v21 */
    /* JADX WARN: Type inference failed for: r8v22, types: [z44] */
    /* JADX WARN: Type inference failed for: r8v24 */
    /* JADX WARN: Type inference failed for: r8v25 */
    /* JADX WARN: Type inference failed for: r8v26 */
    /* JADX WARN: Type inference failed for: r8v27 */
    @Override // defpackage.ka4
    public final boolean a(sl3 sl3Var, ha3 ha3Var, u98 u98Var, boolean z) {
        cl3 cl3Var;
        sl3 sl3Var2;
        Object obj;
        boolean z2;
        boolean z3;
        nq4 nq4Var;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        int i;
        int i2;
        boolean z9;
        int i3;
        boolean z10;
        int i4;
        int i5;
        uq4 uq4Var;
        ha3 ha3Var2 = ha3Var;
        boolean a = super.a(sl3Var, ha3Var, u98Var, z);
        zc1 zc1Var = this.c;
        boolean z11 = true;
        if (zc1Var.K) {
            ?? r8 = 0;
            while (zc1Var != 0) {
                if (zc1Var instanceof xq4) {
                    this.f = wc7.M((xq4) zc1Var, 16);
                } else if ((zc1Var.z & 16) != 0 && (zc1Var instanceof zc1)) {
                    xz3 xz3Var = zc1Var.M;
                    int i6 = 0;
                    zc1Var = zc1Var;
                    r8 = r8;
                    while (xz3Var != null) {
                        if ((xz3Var.z & 16) != 0) {
                            i6++;
                            r8 = r8;
                            if (i6 == 1) {
                                zc1Var = xz3Var;
                            } else {
                                if (r8 == 0) {
                                    r8 = new z44(new xz3[16], 0);
                                }
                                if (zc1Var != 0) {
                                    r8.b(zc1Var);
                                    zc1Var = 0;
                                }
                                r8.b(xz3Var);
                            }
                        }
                        xz3Var = xz3Var.C;
                        zc1Var = zc1Var;
                        r8 = r8;
                    }
                    if (i6 == 1) {
                    }
                }
                zc1Var = wc7.J(r8);
            }
            if (this.f != null) {
                int f = sl3Var.f();
                int i7 = 0;
                while (true) {
                    cl3Var = this.d;
                    sl3Var2 = this.e;
                    if (i7 >= f) {
                        break;
                    }
                    long c = sl3Var.c(i7);
                    uq4 uq4Var2 = (uq4) sl3Var.g(i7);
                    if (cl3Var.c(c)) {
                        boolean z12 = z11;
                        long j = uq4Var2.g;
                        long j2 = uq4Var2.c;
                        if ((((j & 9223372034707292159L) + 36028792732385279L) & (-9223372034707292160L)) == 0 && (((j2 & 9223372034707292159L) + 36028792732385279L) & (-9223372034707292160L)) == 0) {
                            z10 = z12;
                            z9 = a;
                            ArrayList arrayList = new ArrayList(uq4Var2.b().size());
                            List b = uq4Var2.b();
                            i3 = f;
                            int size = b.size();
                            i4 = i7;
                            int i8 = 0;
                            while (i8 < size) {
                                List list = b;
                                el2 el2Var = (el2) b.get(i8);
                                sl3 sl3Var3 = sl3Var2;
                                long j3 = c;
                                long j4 = el2Var.b;
                                if ((((j4 & 9223372034707292159L) + 36028792732385279L) & (-9223372034707292160L)) == 0) {
                                    uq4Var = uq4Var2;
                                    long j5 = el2Var.a;
                                    i5 = size;
                                    fa4 fa4Var = this.f;
                                    fa4Var.getClass();
                                    arrayList.add(new el2(j5, fa4Var.E(ha3Var2, j4), el2Var.c, el2Var.d, el2Var.e));
                                } else {
                                    i5 = size;
                                    uq4Var = uq4Var2;
                                }
                                i8++;
                                size = i5;
                                b = list;
                                sl3Var2 = sl3Var3;
                                c = j3;
                                uq4Var2 = uq4Var;
                            }
                            sl3 sl3Var4 = sl3Var2;
                            long j6 = c;
                            fa4 fa4Var2 = this.f;
                            fa4Var2.getClass();
                            long E = fa4Var2.E(ha3Var2, j);
                            fa4 fa4Var3 = this.f;
                            fa4Var3.getClass();
                            uq4 uq4Var3 = new uq4(uq4Var2.a, uq4Var2.b, fa4Var3.E(ha3Var2, j2), uq4Var2.d, uq4Var2.e, uq4Var2.f, E, uq4Var2.h, uq4Var2.i, arrayList, uq4Var2.j, uq4Var2.k, uq4Var2.l, uq4Var2.n);
                            uq4 uq4Var4 = uq4Var2.q;
                            if (uq4Var4 == null) {
                                uq4Var4 = uq4Var2;
                            }
                            uq4Var3.q = uq4Var4;
                            uq4 uq4Var5 = uq4Var2.q;
                            if (uq4Var5 != null) {
                                uq4Var2 = uq4Var5;
                            }
                            uq4Var3.q = uq4Var2;
                            sl3Var4.d(j6, uq4Var3);
                        } else {
                            z9 = a;
                            i3 = f;
                            i4 = i7;
                            z10 = z12;
                        }
                    } else {
                        z9 = a;
                        i3 = f;
                        z10 = z11;
                        i4 = i7;
                    }
                    i7 = i4 + 1;
                    ha3Var2 = ha3Var;
                    z11 = z10;
                    f = i3;
                    a = z9;
                }
                boolean z13 = a;
                boolean z14 = z11;
                if (sl3Var2.f() == 0) {
                    cl3Var.b = 0;
                    this.a.h();
                    return z14;
                }
                int i9 = cl3Var.b;
                while (true) {
                    i9--;
                    if (-1 >= i9) {
                        break;
                    }
                    long j7 = cl3Var.c[i9];
                    if (sl3Var.x) {
                        int i10 = sl3Var.A;
                        long[] jArr = sl3Var.y;
                        Object[] objArr = sl3Var.z;
                        int i11 = 0;
                        for (int i12 = 0; i12 < i10; i12++) {
                            Object obj2 = objArr[i12];
                            if (obj2 != sw0.H) {
                                if (i12 != i11) {
                                    jArr[i11] = jArr[i12];
                                    objArr[i11] = obj2;
                                    objArr[i12] = null;
                                }
                                i11++;
                            }
                        }
                        sl3Var.x = false;
                        sl3Var.A = i11;
                    }
                    if (w65.q(sl3Var.y, sl3Var.A, j7) < 0 && i9 < (i2 = cl3Var.b)) {
                        int i13 = i2 - 1;
                        int i14 = i9;
                        while (i14 < i13) {
                            long[] jArr2 = cl3Var.c;
                            int i15 = i14 + 1;
                            jArr2[i14] = jArr2[i15];
                            i14 = i15;
                        }
                        cl3Var.b--;
                    }
                }
                ArrayList arrayList2 = new ArrayList(sl3Var2.f());
                int f2 = sl3Var2.f();
                for (int i16 = 0; i16 < f2; i16++) {
                    arrayList2.add(sl3Var2.g(i16));
                }
                nq4 nq4Var2 = new nq4(arrayList2, u98Var);
                int size2 = arrayList2.size();
                int i17 = 0;
                while (true) {
                    if (i17 < size2) {
                        obj = arrayList2.get(i17);
                        if (u98Var.g(((uq4) obj).a)) {
                            break;
                        }
                        i17++;
                    } else {
                        obj = null;
                        break;
                    }
                }
                uq4 uq4Var6 = (uq4) obj;
                if (uq4Var6 != null) {
                    boolean z15 = uq4Var6.d;
                    if (!z) {
                        z2 = false;
                        this.i = false;
                        z4 = false;
                    } else {
                        z2 = false;
                        z4 = this.i;
                        if (!z4 && (z15 || uq4Var6.h)) {
                            fa4 fa4Var4 = this.f;
                            fa4Var4.getClass();
                            long j8 = fa4Var4.z;
                            long j9 = uq4Var6.c;
                            float intBitsToFloat = Float.intBitsToFloat((int) (j9 >> 32));
                            float intBitsToFloat2 = Float.intBitsToFloat((int) (j9 & 4294967295L));
                            int i18 = (int) (j8 >> 32);
                            int i19 = (int) (j8 & 4294967295L);
                            if (intBitsToFloat < 0.0f) {
                                z5 = z14;
                            } else {
                                z5 = false;
                            }
                            if (intBitsToFloat > i18) {
                                z6 = z14;
                            } else {
                                z6 = false;
                            }
                            boolean z16 = z6 | z5;
                            if (intBitsToFloat2 < 0.0f) {
                                z7 = z14;
                            } else {
                                z7 = false;
                            }
                            boolean z17 = z7 | z16;
                            if (intBitsToFloat2 > i19) {
                                z8 = z14;
                            } else {
                                z8 = false;
                            }
                            z4 = !(z8 | z17);
                            this.i = z4;
                        }
                    }
                    boolean z18 = this.h;
                    int i20 = 5;
                    if (z4 != z18 && ((i = nq4Var2.f) == 3 || i == 4 || i == 5)) {
                        if (z4) {
                            i20 = 4;
                        }
                        nq4Var2.f = i20;
                    } else {
                        int i21 = nq4Var2.f;
                        if (i21 == 4 && z18 && !this.j) {
                            nq4Var2.f = 3;
                        } else if (i21 == 5 && z4 && z15) {
                            nq4Var2.f = 3;
                        }
                    }
                } else {
                    z2 = false;
                }
                if (!z13 && nq4Var2.f == 3 && (nq4Var = this.g) != null) {
                    ?? r1 = nq4Var.a;
                    int size3 = r1.size();
                    ?? r4 = nq4Var2.a;
                    if (size3 == r4.size()) {
                        int size4 = r4.size();
                        for (?? r5 = z2; r5 < size4; r5++) {
                            if (xc4.b(((uq4) r1.get(r5)).c, ((uq4) r4.get(r5)).c)) {
                            }
                        }
                        z3 = z2;
                        this.g = nq4Var2;
                        return z3;
                    }
                }
                z3 = z14;
                this.g = nq4Var2;
                return z3;
            }
        }
        return true;
    }

    @Override // defpackage.ka4
    public final void b(u98 u98Var) {
        super.b(u98Var);
        nq4 nq4Var = this.g;
        if (nq4Var == null) {
            return;
        }
        this.h = this.i;
        List list = nq4Var.a;
        int size = list.size();
        boolean z = false;
        for (int i = 0; i < size; i++) {
            uq4 uq4Var = (uq4) list.get(i);
            boolean z2 = uq4Var.d;
            long j = uq4Var.a;
            boolean g = u98Var.g(j);
            boolean z3 = this.i;
            if ((!z2 && !g) || (!z2 && !z3)) {
                this.d.e(j);
            }
        }
        this.i = false;
        if (nq4Var.f == 5) {
            z = true;
        }
        this.j = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4, types: [z44] */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7, types: [z44] */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r8v1, types: [xz3] */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v2, types: [xz3] */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5, types: [xz3] */
    /* JADX WARN: Type inference failed for: r8v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    public final void c() {
        z44 z44Var = this.a;
        Object[] objArr = z44Var.x;
        int i = z44Var.z;
        for (int i2 = 0; i2 < i; i2++) {
            ((aa4) objArr[i2]).c();
        }
        zc1 zc1Var = this.c;
        ?? r1 = 0;
        while (zc1Var != 0) {
            if (zc1Var instanceof xq4) {
                ((xq4) zc1Var).J();
            } else if ((zc1Var.z & 16) != 0 && (zc1Var instanceof zc1)) {
                xz3 xz3Var = zc1Var.M;
                int i3 = 0;
                r1 = r1;
                zc1Var = zc1Var;
                while (xz3Var != null) {
                    if ((xz3Var.z & 16) != 0) {
                        i3++;
                        r1 = r1;
                        if (i3 == 1) {
                            zc1Var = xz3Var;
                        } else {
                            if (r1 == 0) {
                                r1 = new z44(new xz3[16], 0);
                            }
                            if (zc1Var != 0) {
                                r1.b(zc1Var);
                                zc1Var = 0;
                            }
                            r1.b(xz3Var);
                        }
                    }
                    xz3Var = xz3Var.C;
                    r1 = r1;
                    zc1Var = zc1Var;
                }
                if (i3 == 1) {
                }
            }
            zc1Var = wc7.J(r1);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1, types: [xz3] */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4, types: [xz3] */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v3, types: [z44] */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6, types: [z44] */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    public final boolean d(u98 u98Var) {
        boolean z;
        za3 za3Var;
        sl3 sl3Var = this.e;
        boolean z2 = false;
        z2 = false;
        z2 = false;
        if (sl3Var.f() != 0) {
            xz3 xz3Var = this.c;
            if (xz3Var.K) {
                fa4 fa4Var = xz3Var.E;
                if (fa4Var != null && (za3Var = fa4Var.R) != null) {
                    z = za3Var.J();
                } else {
                    z = false;
                }
                if (z) {
                    nq4 nq4Var = this.g;
                    nq4Var.getClass();
                    fa4 fa4Var2 = this.f;
                    fa4Var2.getClass();
                    long j = fa4Var2.z;
                    zc1 zc1Var = xz3Var;
                    ?? r8 = 0;
                    while (zc1Var != 0) {
                        if (zc1Var instanceof xq4) {
                            ((xq4) zc1Var).x(nq4Var, oq4.z, j);
                        } else if ((zc1Var.z & 16) != 0 && (zc1Var instanceof zc1)) {
                            xz3 xz3Var2 = zc1Var.M;
                            int i = 0;
                            zc1Var = zc1Var;
                            r8 = r8;
                            while (xz3Var2 != null) {
                                if ((xz3Var2.z & 16) != 0) {
                                    i++;
                                    r8 = r8;
                                    if (i == 1) {
                                        zc1Var = xz3Var2;
                                    } else {
                                        if (r8 == 0) {
                                            r8 = new z44(new xz3[16], 0);
                                        }
                                        if (zc1Var != 0) {
                                            r8.b(zc1Var);
                                            zc1Var = 0;
                                        }
                                        r8.b(xz3Var2);
                                    }
                                }
                                xz3Var2 = xz3Var2.C;
                                zc1Var = zc1Var;
                                r8 = r8;
                            }
                            if (i == 1) {
                            }
                        }
                        zc1Var = wc7.J(r8);
                    }
                    if (xz3Var.K) {
                        z44 z44Var = this.a;
                        Object[] objArr = z44Var.x;
                        int i2 = z44Var.z;
                        for (int i3 = 0; i3 < i2; i3++) {
                            ((aa4) objArr[i3]).d(u98Var);
                        }
                    }
                    z2 = true;
                }
            }
        }
        b(u98Var);
        sl3Var.a();
        this.f = null;
        return z2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v2, types: [xz3] */
    /* JADX WARN: Type inference failed for: r0v3, types: [xz3] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6, types: [xz3] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r13v10 */
    /* JADX WARN: Type inference failed for: r13v11 */
    /* JADX WARN: Type inference failed for: r13v12 */
    /* JADX WARN: Type inference failed for: r13v13 */
    /* JADX WARN: Type inference failed for: r13v2 */
    /* JADX WARN: Type inference failed for: r13v3 */
    /* JADX WARN: Type inference failed for: r13v4 */
    /* JADX WARN: Type inference failed for: r13v5, types: [z44] */
    /* JADX WARN: Type inference failed for: r13v6 */
    /* JADX WARN: Type inference failed for: r13v7 */
    /* JADX WARN: Type inference failed for: r13v8, types: [z44] */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1, types: [xz3] */
    /* JADX WARN: Type inference failed for: r6v10, types: [xz3] */
    /* JADX WARN: Type inference failed for: r6v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v9 */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4, types: [z44] */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7, types: [z44] */
    /* JADX WARN: Type inference failed for: r7v9 */
    public final boolean e(u98 u98Var, boolean z) {
        boolean z2;
        za3 za3Var;
        if (this.e.f() == 0) {
            return false;
        }
        zc1 zc1Var = this.c;
        if (zc1Var.K) {
            fa4 fa4Var = zc1Var.E;
            if (fa4Var != null && (za3Var = fa4Var.R) != null) {
                z2 = za3Var.J();
            } else {
                z2 = false;
            }
            if (z2) {
                nq4 nq4Var = this.g;
                nq4Var.getClass();
                fa4 fa4Var2 = this.f;
                fa4Var2.getClass();
                long j = fa4Var2.z;
                zc1 zc1Var2 = zc1Var;
                ?? r7 = 0;
                while (zc1Var2 != 0) {
                    if (zc1Var2 instanceof xq4) {
                        ((xq4) zc1Var2).x(nq4Var, oq4.x, j);
                    } else if ((zc1Var2.z & 16) != 0 && (zc1Var2 instanceof zc1)) {
                        xz3 xz3Var = zc1Var2.M;
                        int i = 0;
                        zc1Var2 = zc1Var2;
                        r7 = r7;
                        while (xz3Var != null) {
                            if ((xz3Var.z & 16) != 0) {
                                i++;
                                r7 = r7;
                                if (i == 1) {
                                    zc1Var2 = xz3Var;
                                } else {
                                    if (r7 == 0) {
                                        r7 = new z44(new xz3[16], 0);
                                    }
                                    if (zc1Var2 != 0) {
                                        r7.b(zc1Var2);
                                        zc1Var2 = 0;
                                    }
                                    r7.b(xz3Var);
                                }
                            }
                            xz3Var = xz3Var.C;
                            zc1Var2 = zc1Var2;
                            r7 = r7;
                        }
                        if (i == 1) {
                        }
                    }
                    zc1Var2 = wc7.J(r7);
                }
                if (zc1Var.K) {
                    z44 z44Var = this.a;
                    Object[] objArr = z44Var.x;
                    int i2 = z44Var.z;
                    for (int i3 = 0; i3 < i2; i3++) {
                        aa4 aa4Var = (aa4) objArr[i3];
                        this.f.getClass();
                        aa4Var.e(u98Var, z);
                    }
                }
                if (zc1Var.K) {
                    ?? r13 = 0;
                    while (zc1Var != 0) {
                        if (zc1Var instanceof xq4) {
                            ((xq4) zc1Var).x(nq4Var, oq4.y, j);
                        } else if ((zc1Var.z & 16) != 0 && (zc1Var instanceof zc1)) {
                            xz3 xz3Var2 = zc1Var.M;
                            int i4 = 0;
                            zc1Var = zc1Var;
                            r13 = r13;
                            while (xz3Var2 != null) {
                                if ((xz3Var2.z & 16) != 0) {
                                    i4++;
                                    r13 = r13;
                                    if (i4 == 1) {
                                        zc1Var = xz3Var2;
                                    } else {
                                        if (r13 == 0) {
                                            r13 = new z44(new xz3[16], 0);
                                        }
                                        if (zc1Var != 0) {
                                            r13.b(zc1Var);
                                            zc1Var = 0;
                                        }
                                        r13.b(xz3Var2);
                                    }
                                }
                                xz3Var2 = xz3Var2.C;
                                zc1Var = zc1Var;
                                r13 = r13;
                            }
                            if (i4 == 1) {
                            }
                        }
                        zc1Var = wc7.J(r13);
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final void f(long j, f44 f44Var) {
        cl3 cl3Var = this.d;
        if (cl3Var.c(j) && !f44Var.e(this)) {
            cl3Var.e(j);
            this.e.e(j);
        }
        z44 z44Var = this.a;
        Object[] objArr = z44Var.x;
        int i = z44Var.z;
        for (int i2 = 0; i2 < i; i2++) {
            ((aa4) objArr[i2]).f(j, f44Var);
        }
    }

    public final String toString() {
        return "Node(modifierNode=" + this.c + ", children=" + this.a + ", pointerIds=" + this.d + ")";
    }
}
