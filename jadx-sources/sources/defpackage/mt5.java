package defpackage;

import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public abstract class mt5 {
    public static final tg5 a = new tg5(17);
    public static final dn0 b = new dn0((byte) 29);
    public static final Object c = new Object();
    public static kt5 d;
    public static long e;
    public static final yf f;
    public static final eb2 g;
    public static List h;
    public static List i;
    public static final jh2 j;
    public static final nu k;

    /* JADX WARN: Type inference failed for: r0v12, types: [java.util.concurrent.atomic.AtomicInteger, nu] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, yf] */
    /* JADX WARN: Type inference failed for: r1v4, types: [u44, jh2, ft5] */
    static {
        kt5 kt5Var = kt5.B;
        d = kt5Var;
        e = 2L;
        ?? obj = new Object();
        obj.d = new long[16];
        obj.b = new int[16];
        int[] iArr = new int[16];
        int i2 = 0;
        while (i2 < 16) {
            int i3 = i2 + 1;
            iArr[i2] = i3;
            i2 = i3;
        }
        obj.e = iArr;
        f = obj;
        eb2 eb2Var = new eb2((byte) 10);
        eb2Var.z = new int[16];
        eb2Var.A = new d37[16];
        g = eb2Var;
        nt1 nt1Var = nt1.x;
        h = nt1Var;
        i = nt1Var;
        long j2 = e;
        e = 1 + j2;
        ?? u44Var = new u44(j2, kt5Var, null, new t72((byte) 3));
        d = d.g(u44Var.b);
        j = u44Var;
        k = new AtomicInteger(0);
    }

    public static final kt5 a(kt5 kt5Var, long j2, long j3) {
        while (a34.E(j2, j3) < 0) {
            kt5Var = kt5Var.g(j2);
            j2++;
        }
        return kt5Var;
    }

    public static final Object b(ub2 ub2Var) {
        q44 q44Var;
        Object u;
        jh2 jh2Var = j;
        synchronized (c) {
            try {
                q44Var = jh2Var.h;
                if (q44Var != null) {
                    k.addAndGet(1);
                }
                u = u(jh2Var, ub2Var);
            } catch (Throwable th) {
                throw th;
            }
        }
        if (q44Var != null) {
            try {
                List list = h;
                eb5 eb5Var = new eb5(q44Var);
                int size = list.size();
                for (int i2 = 0; i2 < size; i2++) {
                    ((ic2) list.get(i2)).invoke(eb5Var, jh2Var);
                }
            } finally {
                k.addAndGet(-1);
            }
        }
        synchronized (c) {
            d();
            if (q44Var != null) {
                Object[] objArr = q44Var.b;
                long[] jArr = q44Var.a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i3 = 0;
                    while (true) {
                        long j2 = jArr[i3];
                        if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i4 = 8 - ((~(i3 - length)) >>> 31);
                            for (int i5 = 0; i5 < i4; i5++) {
                                if ((255 & j2) < 128) {
                                    p((xx5) objArr[(i3 << 3) + i5]);
                                }
                                j2 >>= 8;
                            }
                            if (i4 != 8) {
                                break;
                            }
                        }
                        if (i3 == length) {
                            break;
                        }
                        i3++;
                    }
                }
            }
        }
        return u;
    }

    public static final void c() {
        b(a);
    }

    public static final void d() {
        eb2 eb2Var = g;
        int i2 = eb2Var.y;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            Object obj = null;
            if (i3 >= i2) {
                break;
            }
            d37 d37Var = ((d37[]) eb2Var.A)[i3];
            if (d37Var != null) {
                obj = d37Var.get();
            }
            if (obj != null && o((xx5) obj)) {
                if (i4 != i3) {
                    ((d37[]) eb2Var.A)[i4] = d37Var;
                    int[] iArr = (int[]) eb2Var.z;
                    iArr[i4] = iArr[i3];
                }
                i4++;
            }
            i3++;
        }
        for (int i5 = i4; i5 < i2; i5++) {
            ((d37[]) eb2Var.A)[i5] = null;
            ((int[]) eb2Var.z)[i5] = 0;
        }
        if (i4 != i2) {
            eb2Var.y = i4;
        }
    }

    public static final ft5 e(ft5 ft5Var, ub2 ub2Var, boolean z) {
        u44 u44Var;
        boolean z2 = ft5Var instanceof u44;
        if (!z2 && ft5Var != null) {
            return new fj6(ft5Var, ub2Var, false, z);
        }
        if (z2) {
            u44Var = (u44) ft5Var;
        } else {
            u44Var = null;
        }
        return new ej6(u44Var, ub2Var, null, false, z);
    }

    public static final zx5 f(zx5 zx5Var) {
        zx5 r;
        ft5 h2 = h();
        zx5 r2 = r(zx5Var, h2.g(), h2.d());
        if (r2 == null) {
            synchronized (c) {
                ft5 h3 = h();
                r = r(zx5Var, h3.g(), h3.d());
            }
            if (r != null) {
                return r;
            }
            q();
            throw null;
        }
        return r2;
    }

    public static final zx5 g(zx5 zx5Var, ft5 ft5Var) {
        zx5 r;
        zx5 r2 = r(zx5Var, ft5Var.g(), ft5Var.d());
        if (r2 == null) {
            synchronized (c) {
                r = r(zx5Var, ft5Var.g(), ft5Var.d());
            }
            if (r != null) {
                return r;
            }
            q();
            throw null;
        }
        return r2;
    }

    public static final ft5 h() {
        ft5 ft5Var = (ft5) b.get();
        if (ft5Var == null) {
            return j;
        }
        return ft5Var;
    }

    public static final ub2 i(ub2 ub2Var, ub2 ub2Var2, boolean z) {
        if (!z) {
            ub2Var2 = null;
        }
        if (ub2Var != null && ub2Var2 != null && ub2Var != ub2Var2) {
            return new cj(ub2Var, ub2Var2, (byte) 3);
        }
        if (ub2Var == null) {
            return ub2Var2;
        }
        return ub2Var;
    }

    public static final ub2 j(ub2 ub2Var, ub2 ub2Var2) {
        if (ub2Var != null && ub2Var2 != null && ub2Var != ub2Var2) {
            return new cj(ub2Var, ub2Var2, (byte) 4);
        }
        if (ub2Var == null) {
            return ub2Var2;
        }
        return ub2Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0043, code lost:
    
        r3 = r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final defpackage.zx5 k(defpackage.zx5 r10, defpackage.xx5 r11) {
        /*
            zx5 r0 = r11.b()
            long r1 = defpackage.mt5.e
            yf r3 = defpackage.mt5.f
            int r4 = r3.a
            if (r4 <= 0) goto L13
            java.lang.Object r1 = r3.d
            long[] r1 = (long[]) r1
            r2 = 0
            r1 = r1[r2]
        L13:
            r3 = 1
            long r1 = r1 - r3
            r3 = 0
            r4 = r3
        L18:
            if (r0 == 0) goto L4a
            long r5 = r0.a
            r7 = 0
            int r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r9 != 0) goto L23
            goto L43
        L23:
            int r7 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r7 == 0) goto L47
            int r7 = defpackage.a34.E(r5, r1)
            if (r7 > 0) goto L47
            kt5 r7 = defpackage.kt5.B
            boolean r5 = r7.d(r5)
            if (r5 != 0) goto L47
            if (r4 != 0) goto L39
            r4 = r0
            goto L47
        L39:
            long r1 = r0.a
            long r5 = r4.a
            int r1 = defpackage.a34.E(r1, r5)
            if (r1 >= 0) goto L45
        L43:
            r3 = r0
            goto L4a
        L45:
            r3 = r4
            goto L4a
        L47:
            zx5 r0 = r0.b
            goto L18
        L4a:
            r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            if (r3 == 0) goto L54
            r3.a = r0
            return r3
        L54:
            zx5 r10 = r10.c(r0)
            zx5 r0 = r11.b()
            r10.b = r0
            r11.f(r10)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mt5.k(zx5, xx5):zx5");
    }

    public static final void l(ft5 ft5Var, xx5 xx5Var) {
        ft5Var.t(ft5Var.h() + 1);
        ub2 i2 = ft5Var.i();
        if (i2 != null) {
            i2.invoke(xx5Var);
        }
    }

    public static final HashMap m(long j2, u44 u44Var, kt5 kt5Var) {
        long[] jArr;
        kt5 kt5Var2;
        long[] jArr2;
        kt5 kt5Var3;
        int i2;
        int i3;
        zx5 r;
        q44 x = u44Var.x();
        if (x != null) {
            long g2 = u44Var.g();
            kt5 f2 = u44Var.d().g(g2).f(u44Var.j);
            Object[] objArr = x.b;
            long[] jArr3 = x.a;
            int length = jArr3.length - 2;
            if (length >= 0) {
                int i4 = 0;
                HashMap hashMap = null;
                while (true) {
                    long j3 = jArr3[i4];
                    if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i5 = 8;
                        int i6 = 8 - ((~(i4 - length)) >>> 31);
                        int i7 = 0;
                        while (i7 < i6) {
                            if ((j3 & 255) < 128) {
                                xx5 xx5Var = (xx5) objArr[(i4 << 3) + i7];
                                zx5 b2 = xx5Var.b();
                                jArr2 = jArr3;
                                i2 = i5;
                                i3 = i7;
                                zx5 r2 = r(b2, j2, kt5Var);
                                if (r2 != null && (r = r(b2, g2, f2)) != null && !r2.equals(r)) {
                                    kt5Var3 = f2;
                                    zx5 r3 = r(b2, g2, u44Var.d());
                                    if (r3 != null) {
                                        zx5 c2 = xx5Var.c(r, r2, r3);
                                        if (c2 == null) {
                                            return null;
                                        }
                                        if (hashMap == null) {
                                            hashMap = new HashMap();
                                        }
                                        hashMap.put(r2, c2);
                                        hashMap = hashMap;
                                    } else {
                                        q();
                                        throw null;
                                    }
                                } else {
                                    kt5Var3 = f2;
                                }
                            } else {
                                jArr2 = jArr3;
                                kt5Var3 = f2;
                                i2 = i5;
                                i3 = i7;
                            }
                            j3 >>= i2;
                            i7 = i3 + 1;
                            i5 = i2;
                            jArr3 = jArr2;
                            f2 = kt5Var3;
                        }
                        jArr = jArr3;
                        kt5Var2 = f2;
                        if (i6 != i5) {
                            return hashMap;
                        }
                    } else {
                        jArr = jArr3;
                        kt5Var2 = f2;
                    }
                    if (i4 != length) {
                        i4++;
                        jArr3 = jArr;
                        f2 = kt5Var2;
                    } else {
                        return hashMap;
                    }
                }
            }
        }
        return null;
    }

    public static final zx5 n(zx5 zx5Var, yx5 yx5Var, ft5 ft5Var, zx5 zx5Var2) {
        zx5 k2;
        if (ft5Var.f()) {
            ft5Var.n(yx5Var);
        }
        long g2 = ft5Var.g();
        if (zx5Var2.a == g2) {
            return zx5Var2;
        }
        synchronized (c) {
            k2 = k(zx5Var, yx5Var);
        }
        k2.a = g2;
        ft5Var.n(yx5Var);
        return k2;
    }

    public static final boolean o(xx5 xx5Var) {
        zx5 zx5Var;
        long j2 = e;
        yf yfVar = f;
        if (yfVar.a > 0) {
            j2 = ((long[]) yfVar.d)[0];
        }
        zx5 zx5Var2 = null;
        zx5 zx5Var3 = null;
        int i2 = 0;
        for (zx5 b2 = xx5Var.b(); b2 != null; b2 = b2.b) {
            long j3 = b2.a;
            if (j3 != 0) {
                if (a34.E(j3, j2) < 0) {
                    if (zx5Var2 == null) {
                        i2++;
                        zx5Var2 = b2;
                    } else {
                        if (a34.E(b2.a, zx5Var2.a) < 0) {
                            zx5Var = zx5Var2;
                            zx5Var2 = b2;
                        } else {
                            zx5Var = b2;
                        }
                        if (zx5Var3 == null) {
                            zx5Var3 = xx5Var.b();
                            zx5 zx5Var4 = zx5Var3;
                            while (true) {
                                if (zx5Var3 != null) {
                                    if (a34.E(zx5Var3.a, j2) >= 0) {
                                        break;
                                    }
                                    if (a34.E(zx5Var4.a, zx5Var3.a) < 0) {
                                        zx5Var4 = zx5Var3;
                                    }
                                    zx5Var3 = zx5Var3.b;
                                } else {
                                    zx5Var3 = zx5Var4;
                                    break;
                                }
                            }
                        }
                        zx5Var2.a = 0L;
                        zx5Var2.a(zx5Var3);
                        zx5Var2 = zx5Var;
                    }
                } else {
                    i2++;
                }
            }
        }
        if (i2 <= 1) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void p(xx5 xx5Var) {
        Object obj;
        Object obj2;
        Object obj3;
        if (o(xx5Var)) {
            eb2 eb2Var = g;
            int i2 = eb2Var.y;
            int identityHashCode = System.identityHashCode(xx5Var);
            int i3 = -1;
            if (i2 > 0) {
                int i4 = eb2Var.y - 1;
                int i5 = 0;
                while (true) {
                    if (i5 <= i4) {
                        int i6 = (i5 + i4) >>> 1;
                        int i7 = ((int[]) eb2Var.z)[i6];
                        if (i7 < identityHashCode) {
                            i5 = i6 + 1;
                        } else if (i7 > identityHashCode) {
                            i4 = i6 - 1;
                        } else {
                            d37 d37Var = ((d37[]) eb2Var.A)[i6];
                            if (d37Var != null) {
                                obj = d37Var.get();
                            } else {
                                obj = null;
                            }
                            if (xx5Var != obj) {
                                for (int i8 = i6 - 1; -1 < i8 && ((int[]) eb2Var.z)[i8] == identityHashCode; i8--) {
                                    d37 d37Var2 = ((d37[]) eb2Var.A)[i8];
                                    if (d37Var2 != null) {
                                        obj3 = d37Var2.get();
                                    } else {
                                        obj3 = null;
                                    }
                                    if (obj3 == xx5Var) {
                                        i3 = i8;
                                        break;
                                    }
                                }
                                i6++;
                                int i9 = eb2Var.y;
                                while (true) {
                                    if (i6 < i9) {
                                        if (((int[]) eb2Var.z)[i6] != identityHashCode) {
                                            i3 = -(i6 + 1);
                                            break;
                                        }
                                        d37 d37Var3 = ((d37[]) eb2Var.A)[i6];
                                        if (d37Var3 != null) {
                                            obj2 = d37Var3.get();
                                        } else {
                                            obj2 = null;
                                        }
                                        if (obj2 == xx5Var) {
                                            break;
                                        } else {
                                            i6++;
                                        }
                                    } else {
                                        i3 = -(eb2Var.y + 1);
                                        break;
                                    }
                                }
                            }
                            i3 = i6;
                        }
                    } else {
                        i3 = -(i5 + 1);
                        break;
                    }
                }
                if (i3 >= 0) {
                    return;
                }
            }
            int i10 = -(i3 + 1);
            d37[] d37VarArr = (d37[]) eb2Var.A;
            int length = d37VarArr.length;
            if (i2 == length) {
                int i11 = length * 2;
                d37[] d37VarArr2 = new d37[i11];
                int[] iArr = new int[i11];
                int i12 = i10 + 1;
                System.arraycopy(d37VarArr, i10, d37VarArr2, i12, i2 - i10);
                System.arraycopy((d37[]) eb2Var.A, 0, d37VarArr2, 0, i10);
                ms.w0(i12, i10, i2, (int[]) eb2Var.z, iArr);
                ms.A0(0, i10, 6, (int[]) eb2Var.z, iArr);
                eb2Var.A = d37VarArr2;
                eb2Var.z = iArr;
            } else {
                int i13 = i10 + 1;
                System.arraycopy(d37VarArr, i10, d37VarArr, i13, i2 - i10);
                int[] iArr2 = (int[]) eb2Var.z;
                ms.w0(i13, i10, i2, iArr2, iArr2);
            }
            ((d37[]) eb2Var.A)[i10] = new WeakReference(xx5Var);
            ((int[]) eb2Var.z)[i10] = identityHashCode;
            eb2Var.y++;
        }
    }

    public static final void q() {
        throw new IllegalStateException("Reading a state that was created after the snapshot was taken or in a snapshot that has not yet been applied");
    }

    public static final zx5 r(zx5 zx5Var, long j2, kt5 kt5Var) {
        zx5 zx5Var2 = null;
        while (zx5Var != null) {
            long j3 = zx5Var.a;
            if (j3 != 0 && a34.E(j3, j2) <= 0 && !kt5Var.d(j3) && (zx5Var2 == null || a34.E(zx5Var2.a, zx5Var.a) < 0)) {
                zx5Var2 = zx5Var;
            }
            zx5Var = zx5Var.b;
        }
        if (zx5Var2 == null) {
            return null;
        }
        return zx5Var2;
    }

    public static final zx5 s(zx5 zx5Var, xx5 xx5Var) {
        zx5 r;
        ft5 h2 = h();
        ub2 e2 = h2.e();
        if (e2 != null) {
            e2.invoke(xx5Var);
        }
        zx5 r2 = r(zx5Var, h2.g(), h2.d());
        if (r2 == null) {
            synchronized (c) {
                ft5 h3 = h();
                zx5 b2 = xx5Var.b();
                b2.getClass();
                r = r(b2, h3.g(), h3.d());
                if (r == null) {
                    q();
                    throw null;
                }
            }
            return r;
        }
        return r2;
    }

    public static final void t(int i2) {
        yf yfVar = f;
        int i3 = ((int[]) yfVar.e)[i2];
        yfVar.d(i3, yfVar.a - 1);
        yfVar.a--;
        long[] jArr = (long[]) yfVar.d;
        long j2 = jArr[i3];
        int i4 = i3;
        while (i4 > 0) {
            int i5 = ((i4 + 1) >> 1) - 1;
            if (a34.E(jArr[i5], j2) <= 0) {
                break;
            }
            yfVar.d(i5, i4);
            i4 = i5;
        }
        long[] jArr2 = (long[]) yfVar.d;
        int i6 = yfVar.a >> 1;
        while (i3 < i6) {
            int i7 = (i3 + 1) << 1;
            int i8 = i7 - 1;
            if (i7 < yfVar.a && a34.E(jArr2[i7], jArr2[i8]) < 0) {
                if (a34.E(jArr2[i7], jArr2[i3]) >= 0) {
                    break;
                }
                yfVar.d(i7, i3);
                i3 = i7;
            } else {
                if (a34.E(jArr2[i8], jArr2[i3]) >= 0) {
                    break;
                }
                yfVar.d(i8, i3);
                i3 = i8;
            }
        }
        ((int[]) yfVar.e)[i2] = yfVar.c;
        yfVar.c = i2;
    }

    public static final Object u(jh2 jh2Var, ub2 ub2Var) {
        long j2 = jh2Var.b;
        Object invoke = ub2Var.invoke(d.c(j2));
        long j3 = e;
        e = 1 + j3;
        kt5 c2 = d.c(j2);
        d = c2;
        jh2Var.b = j3;
        jh2Var.a = c2;
        jh2Var.g = 0;
        jh2Var.h = null;
        jh2Var.o();
        d = d.g(j3);
        return invoke;
    }

    public static final void v(ft5 ft5Var) {
        u44 u44Var;
        Object obj;
        long j2;
        Long valueOf;
        if (!d.d(ft5Var.g())) {
            long g2 = ft5Var.g();
            boolean z = ft5Var.c;
            if (ft5Var instanceof u44) {
                u44Var = (u44) ft5Var;
            } else {
                u44Var = null;
            }
            if (u44Var != null) {
                obj = Boolean.valueOf(u44Var.m);
            } else {
                obj = "read-only";
            }
            synchronized (c) {
                yf yfVar = f;
                if (yfVar.a > 0) {
                    j2 = ((long[]) yfVar.d)[0];
                } else {
                    j2 = -1;
                }
                valueOf = Long.valueOf(j2);
            }
            throw new IllegalStateException(("Snapshot is not open: snapshotId=" + g2 + ", disposed=" + z + ", applied=" + obj + ", lowestPin=" + valueOf).toString());
        }
    }

    public static final zx5 w(zx5 zx5Var, xx5 xx5Var, ft5 ft5Var) {
        zx5 r;
        zx5 r2;
        if (ft5Var.f()) {
            ft5Var.n(xx5Var);
        }
        long g2 = ft5Var.g();
        zx5 r3 = r(zx5Var, g2, ft5Var.d());
        if (r3 == null) {
            synchronized (c) {
                ft5 h2 = h();
                zx5 b2 = xx5Var.b();
                b2.getClass();
                r2 = r(b2, h2.g(), h2.d());
                if (r2 == null) {
                    q();
                    throw null;
                }
            }
            r3 = r2;
        }
        if (r3.a == ft5Var.g()) {
            return r3;
        }
        synchronized (c) {
            r = r(xx5Var.b(), g2, ft5Var.d());
            if (r != null) {
                if (r.a != g2) {
                    zx5 k2 = k(r, xx5Var);
                    k2.a(r);
                    k2.a = ft5Var.g();
                    r = k2;
                }
            } else {
                q();
                throw null;
            }
        }
        ft5Var.n(xx5Var);
        return r;
    }
}
