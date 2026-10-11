package defpackage;

import java.util.Arrays;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public class in5 extends d3 implements t44, w42, wc2 {
    public final int B;
    public final int C;
    public final ta0 D;
    public Object[] E;
    public long F;
    public long G;
    public int H;
    public int I;

    public in5(int i, int i2, ta0 ta0Var) {
        this.B = i;
        this.C = i2;
        this.D = ta0Var;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:1|(2:3|(7:5|6|(3:(6:(1:(1:11)(2:47|48))(1:49)|12|13|14|15|(3:16|(3:38|39|(3:41|42|43)(1:44))(4:18|(1:23)|32|(2:34|35)(1:36))|37))(4:50|51|52|53)|29|30)(5:59|60|61|(2:63|(1:65))|67)|54|55|15|(3:16|(0)(0)|37)))|70|6|(0)(0)|54|55|15|(3:16|(0)(0)|37)) */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00b8, code lost:
    
        throw r1.I();
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00a7, code lost:
    
        r10 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00a8, code lost:
    
        r4 = r8;
        r8 = r10;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00ab A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0096 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void l(defpackage.in5 r8, defpackage.x42 r9, defpackage.vz0 r10) {
        /*
            Method dump skipped, instructions count: 206
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.in5.l(in5, x42, vz0):void");
    }

    @Override // defpackage.wc2
    public final w42 a(l11 l11Var, int i, ta0 ta0Var) {
        return jn5.c(this, l11Var, i, ta0Var);
    }

    @Override // defpackage.t44
    public final void b() {
        in5 in5Var;
        synchronized (this) {
            try {
                in5Var = this;
                try {
                    in5Var.u(p() + this.H, this.G, p() + this.H, p() + this.H + this.I);
                } catch (Throwable th) {
                    th = th;
                    Throwable th2 = th;
                    throw th2;
                }
            } catch (Throwable th3) {
                th = th3;
                in5Var = this;
            }
        }
    }

    @Override // defpackage.w42
    public final Object collect(x42 x42Var, vz0 vz0Var) {
        l(this, x42Var, vz0Var);
        return w11.x;
    }

    @Override // defpackage.t44
    public final boolean d(Object obj) {
        int i;
        boolean z;
        vz0[] vz0VarArr = t80.a;
        synchronized (this) {
            if (r(obj)) {
                vz0VarArr = o(vz0VarArr);
                z = true;
            } else {
                z = false;
            }
        }
        for (vz0 vz0Var : vz0VarArr) {
            if (vz0Var != null) {
                vz0Var.resumeWith(pn6.a);
            }
        }
        return z;
    }

    @Override // defpackage.t44, defpackage.x42
    public final Object emit(Object obj, vz0 vz0Var) {
        in5 in5Var;
        Throwable th;
        vz0[] o;
        gn5 gn5Var;
        if (d(obj)) {
            return pn6.a;
        }
        qg0 qg0Var = new qg0(1, wc7.z(vz0Var));
        qg0Var.t();
        vz0[] vz0VarArr = t80.a;
        synchronized (this) {
            try {
                if (r(obj)) {
                    try {
                        qg0Var.resumeWith(pn6.a);
                        o = o(vz0VarArr);
                        gn5Var = null;
                        in5Var = this;
                    } catch (Throwable th2) {
                        th = th2;
                        in5Var = this;
                        throw th;
                    }
                } else {
                    try {
                        in5Var = this;
                        try {
                            gn5 gn5Var2 = new gn5(in5Var, p() + this.H + this.I, obj, qg0Var);
                            in5Var.n(gn5Var2);
                            in5Var.I++;
                            if (in5Var.C == 0) {
                                vz0VarArr = in5Var.o(vz0VarArr);
                            }
                            o = vz0VarArr;
                            gn5Var = gn5Var2;
                        } catch (Throwable th3) {
                            th = th3;
                            th = th;
                            throw th;
                        }
                    } catch (Throwable th4) {
                        in5Var = this;
                        th = th4;
                        throw th;
                    }
                }
                if (gn5Var != null) {
                    qg0Var.w(new kg0(gn5Var, (byte) 2));
                }
                for (vz0 vz0Var2 : o) {
                    if (vz0Var2 != null) {
                        vz0Var2.resumeWith(pn6.a);
                    }
                }
                Object r = qg0Var.r();
                w11 w11Var = w11.x;
                if (r != w11Var) {
                    r = pn6.a;
                }
                if (r == w11Var) {
                    return r;
                }
                return pn6.a;
            } catch (Throwable th5) {
                th = th5;
                in5Var = this;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [kn5, java.lang.Object, e3] */
    @Override // defpackage.d3
    public final e3 f() {
        ?? obj = new Object();
        obj.a = -1L;
        return obj;
    }

    @Override // defpackage.d3
    public final e3[] g() {
        return new kn5[2];
    }

    public final Object j(kn5 kn5Var, hn5 hn5Var) {
        qg0 qg0Var = new qg0(1, wc7.z(hn5Var));
        qg0Var.t();
        synchronized (this) {
            try {
                if (s(kn5Var) < 0) {
                    kn5Var.b = qg0Var;
                } else {
                    qg0Var.resumeWith(pn6.a);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        Object r = qg0Var.r();
        if (r == w11.x) {
            return r;
        }
        return pn6.a;
    }

    public final void k() {
        if (this.C != 0 || this.I > 1) {
            Object[] objArr = this.E;
            objArr.getClass();
            while (this.I > 0) {
                long p = p();
                int i = this.H;
                int i2 = this.I;
                if (objArr[((int) ((p + (i + i2)) - 1)) & (objArr.length - 1)] == jn5.a) {
                    this.I = i2 - 1;
                    jn5.d(objArr, p() + this.H + this.I, null);
                } else {
                    return;
                }
            }
        }
    }

    public final void m() {
        e3[] e3VarArr;
        Object[] objArr = this.E;
        objArr.getClass();
        jn5.d(objArr, p(), null);
        this.H--;
        long p = p() + 1;
        if (this.F < p) {
            this.F = p;
        }
        if (this.G < p) {
            if (this.y != 0 && (e3VarArr = this.x) != null) {
                for (e3 e3Var : e3VarArr) {
                    if (e3Var != null) {
                        kn5 kn5Var = (kn5) e3Var;
                        long j = kn5Var.a;
                        if (0 <= j && j < p) {
                            kn5Var.a = p;
                        }
                    }
                }
            }
            this.G = p;
        }
    }

    public final void n(Object obj) {
        int i = this.H + this.I;
        Object[] objArr = this.E;
        if (objArr == null) {
            objArr = q(null, 0, 2);
        } else if (i >= objArr.length) {
            objArr = q(objArr, i, objArr.length * 2);
        }
        jn5.d(objArr, p() + i, obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final vz0[] o(vz0[] vz0VarArr) {
        e3[] e3VarArr;
        kn5 kn5Var;
        qg0 qg0Var;
        int length = vz0VarArr.length;
        if (this.y != 0 && (e3VarArr = this.x) != null) {
            int length2 = e3VarArr.length;
            int i = 0;
            vz0VarArr = vz0VarArr;
            while (i < length2) {
                e3 e3Var = e3VarArr[i];
                if (e3Var != null && (qg0Var = (kn5Var = (kn5) e3Var).b) != null && s(kn5Var) >= 0) {
                    int length3 = vz0VarArr.length;
                    vz0VarArr = vz0VarArr;
                    if (length >= length3) {
                        vz0VarArr = Arrays.copyOf(vz0VarArr, Math.max(2, vz0VarArr.length * 2));
                    }
                    vz0VarArr[length] = qg0Var;
                    kn5Var.b = null;
                    length++;
                }
                i++;
                vz0VarArr = vz0VarArr;
            }
        }
        return vz0VarArr;
    }

    public final long p() {
        return Math.min(this.G, this.F);
    }

    public final Object[] q(Object[] objArr, int i, int i2) {
        if (i2 > 0) {
            Object[] objArr2 = new Object[i2];
            this.E = objArr2;
            if (objArr != null) {
                long p = p();
                for (int i3 = 0; i3 < i; i3++) {
                    long j = i3 + p;
                    jn5.d(objArr2, j, objArr[((int) j) & (objArr.length - 1)]);
                }
            }
            return objArr2;
        }
        ze0.m("Buffer size overflow");
        return null;
    }

    public final boolean r(Object obj) {
        int i = this.y;
        int i2 = this.B;
        if (i == 0) {
            if (i2 != 0) {
                n(obj);
                int i3 = this.H + 1;
                this.H = i3;
                if (i3 > i2) {
                    m();
                }
                this.G = p() + this.H;
                return true;
            }
        } else {
            int i4 = this.H;
            int i5 = this.C;
            if (i4 >= i5 && this.G <= this.F) {
                int ordinal = this.D.ordinal();
                if (ordinal != 0) {
                    if (ordinal != 1) {
                        if (ordinal != 2) {
                            ze0.l();
                            return false;
                        }
                    }
                } else {
                    return false;
                }
            }
            n(obj);
            int i6 = this.H + 1;
            this.H = i6;
            if (i6 > i5) {
                m();
            }
            long p = p() + this.H;
            long j = this.F;
            if (((int) (p - j)) > i2) {
                u(1 + j, this.G, p() + this.H, p() + this.H + this.I);
            }
        }
        return true;
    }

    public final long s(kn5 kn5Var) {
        long j = kn5Var.a;
        if (j >= p() + this.H && (this.C > 0 || j > p() || this.I == 0)) {
            return -1L;
        }
        return j;
    }

    public final Object t(kn5 kn5Var) {
        Object obj;
        vz0[] vz0VarArr = t80.a;
        synchronized (this) {
            try {
                long s = s(kn5Var);
                if (s < 0) {
                    obj = jn5.a;
                } else {
                    long j = kn5Var.a;
                    Object[] objArr = this.E;
                    objArr.getClass();
                    Object obj2 = objArr[((int) s) & (objArr.length - 1)];
                    if (obj2 instanceof gn5) {
                        obj2 = ((gn5) obj2).z;
                    }
                    kn5Var.a = s + 1;
                    Object obj3 = obj2;
                    vz0VarArr = v(j);
                    obj = obj3;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        for (vz0 vz0Var : vz0VarArr) {
            if (vz0Var != null) {
                vz0Var.resumeWith(pn6.a);
            }
        }
        return obj;
    }

    public final void u(long j, long j2, long j3, long j4) {
        long min = Math.min(j2, j);
        for (long p = p(); p < min; p++) {
            Object[] objArr = this.E;
            objArr.getClass();
            jn5.d(objArr, p, null);
        }
        this.F = j;
        this.G = j2;
        this.H = (int) (j3 - min);
        this.I = (int) (j4 - j3);
    }

    public final vz0[] v(long j) {
        long j2;
        int i;
        long j3;
        vz0[] vz0VarArr;
        long j4;
        vz0[] vz0VarArr2;
        e3[] e3VarArr;
        vz0[] vz0VarArr3 = t80.a;
        if (j <= this.G) {
            long p = p();
            long j5 = this.H + p;
            int i2 = this.C;
            if (i2 == 0 && this.I > 0) {
                j5++;
            }
            int i3 = 0;
            if (this.y != 0 && (e3VarArr = this.x) != null) {
                for (e3 e3Var : e3VarArr) {
                    if (e3Var != null) {
                        long j6 = ((kn5) e3Var).a;
                        if (0 <= j6 && j6 < j5) {
                            j5 = j6;
                        }
                    }
                }
            }
            if (j5 > this.G) {
                long p2 = p() + this.H;
                int i4 = this.y;
                int i5 = this.I;
                if (i4 > 0) {
                    i5 = Math.min(i5, i2 - ((int) (p2 - j5)));
                }
                long j7 = this.I + p2;
                ni1 ni1Var = jn5.a;
                if (i5 > 0) {
                    vz0[] vz0VarArr4 = new vz0[i5];
                    j3 = 1;
                    Object[] objArr = this.E;
                    objArr.getClass();
                    j2 = j5;
                    long j8 = p2;
                    while (true) {
                        if (p2 < j7) {
                            vz0VarArr2 = vz0VarArr4;
                            Object obj = objArr[(objArr.length - 1) & ((int) p2)];
                            if (obj != ni1Var) {
                                obj.getClass();
                                gn5 gn5Var = (gn5) obj;
                                int i6 = i3 + 1;
                                i = i2;
                                vz0VarArr2[i3] = gn5Var.A;
                                jn5.d(objArr, p2, ni1Var);
                                jn5.d(objArr, j8, gn5Var.z);
                                j8++;
                                if (i6 >= i5) {
                                    break;
                                }
                                i3 = i6;
                            } else {
                                i = i2;
                            }
                            p2++;
                            vz0VarArr4 = vz0VarArr2;
                            i2 = i;
                        } else {
                            vz0VarArr2 = vz0VarArr4;
                            i = i2;
                            break;
                        }
                    }
                    p2 = j8;
                    vz0VarArr = vz0VarArr2;
                } else {
                    j2 = j5;
                    i = i2;
                    j3 = 1;
                    vz0VarArr = vz0VarArr3;
                }
                long max = Math.max(this.F, Math.max(p, p2 - this.B));
                if (i == 0 && max < j7) {
                    Object[] objArr2 = this.E;
                    objArr2.getClass();
                    if (a34.i(objArr2[((int) max) & (objArr2.length - 1)], ni1Var)) {
                        p2 += j3;
                        max += j3;
                    }
                }
                long j9 = p2;
                if (this.y == 0) {
                    j4 = j9;
                } else {
                    j4 = j2;
                }
                u(max, j4, j9, j7);
                k();
                if (vz0VarArr.length == 0) {
                    return vz0VarArr;
                }
                return o(vz0VarArr);
            }
        }
        return vz0VarArr3;
    }
}
