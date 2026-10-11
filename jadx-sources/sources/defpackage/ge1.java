package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class ge1 extends zx5 {
    public static final Object h = new Object();
    public long c;
    public int d;
    public b44 e;
    public Object f;
    public int g;

    public ge1(long j) {
        super(j);
        b44 b44Var = dc4.a;
        b44Var.getClass();
        this.e = b44Var;
        this.f = h;
    }

    @Override // defpackage.zx5
    public final void a(zx5 zx5Var) {
        zx5Var.getClass();
        ge1 ge1Var = (ge1) zx5Var;
        this.e = ge1Var.e;
        this.f = ge1Var.f;
        this.g = ge1Var.g;
    }

    @Override // defpackage.zx5
    public final zx5 c(long j) {
        return new ge1(j);
    }

    public final boolean d(he1 he1Var, ft5 ft5Var) {
        boolean z;
        boolean z2;
        Object obj = mt5.c;
        synchronized (obj) {
            z = true;
            if (this.c == ft5Var.g()) {
                if (this.d == ft5Var.h()) {
                    z2 = false;
                }
            }
            z2 = true;
        }
        if (this.f == h || (z2 && this.g != e(he1Var, ft5Var))) {
            z = false;
        }
        if (z && z2) {
            synchronized (obj) {
                this.c = ft5Var.g();
                this.d = ft5Var.h();
            }
            return z;
        }
        return z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v10, types: [ge1] */
    /* JADX WARN: Type inference failed for: r13v5, types: [zx5] */
    /* JADX WARN: Type inference failed for: r13v6, types: [zx5, java.lang.Object] */
    public final int e(he1 he1Var, ft5 ft5Var) {
        b44 b44Var;
        int i;
        long[] jArr;
        int i2;
        Object[] objArr;
        long[] jArr2;
        int i3;
        Object[] objArr2;
        long j;
        long j2;
        int i4;
        ?? g;
        synchronized (mt5.c) {
            b44Var = this.e;
        }
        int i5 = 7;
        if (b44Var.e == 0) {
            return 7;
        }
        z44 a = ut5.a();
        Object[] objArr3 = a.x;
        int i6 = a.z;
        boolean z = false;
        for (int i7 = 0; i7 < i6; i7++) {
            ((jd2) objArr3[i7]).b();
        }
        try {
            Object[] objArr4 = b44Var.b;
            int[] iArr = b44Var.c;
            long[] jArr3 = b44Var.a;
            int length = jArr3.length - 2;
            if (length >= 0) {
                i = 7;
                int i8 = 0;
                while (true) {
                    long j3 = jArr3[i8];
                    long j4 = -9187201950435737472L;
                    if ((((~j3) << i5) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i9 = 8;
                        int i10 = 8 - ((~(i8 - length)) >>> 31);
                        i2 = i5;
                        int i11 = z ? 1 : 0;
                        while (i11 < i10) {
                            if ((j3 & 255) < 128) {
                                int i12 = (i8 << 3) + i11;
                                j2 = j4;
                                xx5 xx5Var = (xx5) objArr4[i12];
                                int i13 = i9;
                                if (iArr[i12] != 1) {
                                    jArr2 = jArr3;
                                    i3 = i11;
                                    objArr2 = objArr4;
                                    j = j3;
                                } else {
                                    if (xx5Var instanceof he1) {
                                        he1 he1Var2 = (he1) xx5Var;
                                        g = he1Var2.h((ge1) mt5.g(he1Var2.A, ft5Var), ft5Var, z, he1Var2.y);
                                        b44 b44Var2 = g.e;
                                        Object[] objArr5 = b44Var2.b;
                                        long[] jArr4 = b44Var2.a;
                                        int length2 = jArr4.length - 2;
                                        jArr2 = jArr3;
                                        i3 = i11;
                                        objArr2 = objArr4;
                                        if (length2 >= 0) {
                                            int i14 = 0;
                                            while (true) {
                                                long j5 = jArr4[i14];
                                                j = j3;
                                                int i15 = i;
                                                if ((((~j5) << i2) & j5 & j2) != j2) {
                                                    int i16 = 8 - ((~(i14 - length2)) >>> 31);
                                                    for (int i17 = 0; i17 < i16; i17++) {
                                                        if ((j5 & 255) < 128) {
                                                            i15 = (i15 * 31) + System.identityHashCode((xx5) objArr5[(i14 << 3) + i17]);
                                                        }
                                                        j5 >>= i13;
                                                    }
                                                    if (i16 != i13) {
                                                        i = i15;
                                                        break;
                                                    }
                                                }
                                                i = i15;
                                                if (i14 == length2) {
                                                    break;
                                                }
                                                i14++;
                                                j3 = j;
                                                i13 = 8;
                                            }
                                        } else {
                                            j = j3;
                                        }
                                    } else {
                                        jArr2 = jArr3;
                                        i3 = i11;
                                        objArr2 = objArr4;
                                        j = j3;
                                        g = mt5.g(xx5Var.b(), ft5Var);
                                    }
                                    i = (((i * 31) + System.identityHashCode(g)) * 31) + Long.hashCode(g.a);
                                }
                                i4 = 8;
                            } else {
                                jArr2 = jArr3;
                                i3 = i11;
                                objArr2 = objArr4;
                                j = j3;
                                j2 = j4;
                                i4 = i9;
                            }
                            j3 = j >> i4;
                            i9 = i4;
                            j4 = j2;
                            objArr4 = objArr2;
                            z = false;
                            i11 = i3 + 1;
                            jArr3 = jArr2;
                        }
                        jArr = jArr3;
                        objArr = objArr4;
                        if (i10 != i9) {
                            break;
                        }
                    } else {
                        jArr = jArr3;
                        i2 = i5;
                        objArr = objArr4;
                    }
                    if (i8 != length) {
                        i8++;
                        i5 = i2;
                        jArr3 = jArr;
                        objArr4 = objArr;
                        z = false;
                    } else {
                        i5 = i;
                        break;
                    }
                }
            }
            i = i5;
            Object[] objArr6 = a.x;
            int i18 = a.z;
            for (int i19 = 0; i19 < i18; i19++) {
                ((jd2) objArr6[i19]).a();
            }
            return i;
        } catch (Throwable th) {
            Object[] objArr7 = a.x;
            int i20 = a.z;
            for (int i21 = 0; i21 < i20; i21++) {
                ((jd2) objArr7[i21]).a();
            }
            throw th;
        }
    }
}
