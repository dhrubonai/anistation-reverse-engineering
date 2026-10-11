package defpackage;

import android.util.SparseArray;
import com.unity3d.services.UnityAdsConstants;
import java.io.EOFException;
import java.util.Objects;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public class f95 implements bh6 {
    public boolean C;
    public ea2 D;
    public ea2 E;
    public long F;
    public boolean H;
    public long I;
    public boolean J;
    public final dy1 a;
    public final xp1 d;
    public final tp1 e;
    public e95 f;
    public ea2 g;
    public qp1 h;
    public int p;
    public int q;
    public int r;
    public int s;
    public boolean z;
    public final ri0 b = new Object();
    public int i = UnityAdsConstants.SafeGuards.InitRequestTimeoutPolicy.MIN_TIMEOUT;
    public long[] j = new long[UnityAdsConstants.SafeGuards.InitRequestTimeoutPolicy.MIN_TIMEOUT];
    public long[] k = new long[UnityAdsConstants.SafeGuards.InitRequestTimeoutPolicy.MIN_TIMEOUT];
    public long[] n = new long[UnityAdsConstants.SafeGuards.InitRequestTimeoutPolicy.MIN_TIMEOUT];
    public int[] m = new int[UnityAdsConstants.SafeGuards.InitRequestTimeoutPolicy.MIN_TIMEOUT];
    public int[] l = new int[UnityAdsConstants.SafeGuards.InitRequestTimeoutPolicy.MIN_TIMEOUT];
    public ah6[] o = new ah6[UnityAdsConstants.SafeGuards.InitRequestTimeoutPolicy.MIN_TIMEOUT];
    public final eb2 c = new eb2(new p65((byte) 3));
    public long t = Long.MIN_VALUE;
    public long v = Long.MIN_VALUE;
    public long w = Long.MIN_VALUE;
    public boolean B = true;
    public boolean A = true;
    public boolean G = true;
    public long u = Long.MIN_VALUE;
    public int x = -1;
    public int y = -1;

    /* JADX WARN: Type inference failed for: r1v1, types: [ri0, java.lang.Object] */
    public f95(l7 l7Var, xp1 xp1Var, tp1 tp1Var) {
        this.d = xp1Var;
        this.e = tp1Var;
        this.a = new dy1(l7Var);
    }

    public final synchronized void A(long j) {
        if (j == this.u) {
            return;
        }
        this.u = j;
        this.x = -1;
        this.y = -1;
        if (j != Long.MIN_VALUE && j <= this.w) {
            for (int i = 0; i < this.p; i++) {
                int p = p(i);
                C(this.q + i, this.n[p], this.m[p]);
                if (this.x != -1) {
                    break;
                }
            }
        }
    }

    public final synchronized void B(int i) {
        boolean z;
        if (i >= 0) {
            try {
                if (this.s + i <= this.p) {
                    z = true;
                    io3.n(z);
                    this.s += i;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        z = false;
        io3.n(z);
        this.s += i;
    }

    public final void C(int i, long j, int i2) {
        boolean z;
        int i3;
        long j2 = this.u;
        if (j2 != Long.MIN_VALUE && this.x == -1) {
            if (j < j2) {
                this.y = -1;
                return;
            }
            int i4 = this.y;
            if (i4 == -1) {
                this.y = i;
                i4 = i;
            }
            int i5 = (i - i4) + 1;
            boolean z2 = false;
            if ((i2 & 1) != 0) {
                z = true;
            } else {
                z = false;
            }
            if ((i2 & 536870912) != 0) {
                z2 = true;
            }
            ea2 ea2Var = this.E;
            if (ea2Var == null || (i3 = ea2Var.r) == -1) {
                i3 = 16;
            }
            if (i5 < i3 + 1 && !z && !z2) {
                return;
            }
            this.x = i4;
            this.y = -1;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:89:0x0145, code lost:
    
        if (((defpackage.d95) r0.valueAt(r0.size() - 1)).a.equals(r16.E) == false) goto L89;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00c0 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // defpackage.bh6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(long r17, int r19, int r20, int r21, defpackage.ah6 r22) {
        /*
            Method dump skipped, instructions count: 541
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.f95.a(long, int, int, int, ah6):void");
    }

    @Override // defpackage.bh6
    public final void b(zi4 zi4Var, int i, int i2) {
        while (i > 0) {
            dy1 dy1Var = this.a;
            int c = dy1Var.c(i);
            g90 g90Var = (g90) dy1Var.g;
            k7 k7Var = (k7) g90Var.z;
            zi4Var.k(k7Var.a, ((int) (dy1Var.b - g90Var.x)) + k7Var.b, c);
            i -= c;
            long j = dy1Var.b + c;
            dy1Var.b = j;
            g90 g90Var2 = (g90) dy1Var.g;
            if (j == g90Var2.y) {
                dy1Var.g = (g90) g90Var2.A;
            }
        }
    }

    @Override // defpackage.bh6
    public final int c(m41 m41Var, int i, boolean z) {
        dy1 dy1Var = this.a;
        int c = dy1Var.c(i);
        g90 g90Var = (g90) dy1Var.g;
        k7 k7Var = (k7) g90Var.z;
        int read = m41Var.read(k7Var.a, ((int) (dy1Var.b - g90Var.x)) + k7Var.b, c);
        if (read == -1) {
            if (z) {
                return -1;
            }
            throw new EOFException();
        }
        long j = dy1Var.b + read;
        dy1Var.b = j;
        g90 g90Var2 = (g90) dy1Var.g;
        if (j == g90Var2.y) {
            dy1Var.g = (g90) g90Var2.A;
        }
        return read;
    }

    @Override // defpackage.bh6
    public final void g(ea2 ea2Var) {
        boolean z;
        String str;
        boolean z2;
        ea2 m = m(ea2Var);
        boolean z3 = false;
        this.C = false;
        this.D = ea2Var;
        synchronized (this) {
            try {
                this.B = false;
                if (!Objects.equals(m, this.E)) {
                    if (((SparseArray) this.c.z).size() == 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (!z) {
                        SparseArray sparseArray = (SparseArray) this.c.z;
                        if (((d95) sparseArray.valueAt(sparseArray.size() - 1)).a.equals(m)) {
                            SparseArray sparseArray2 = (SparseArray) this.c.z;
                            m = ((d95) sparseArray2.valueAt(sparseArray2.size() - 1)).a;
                            this.E = m;
                            boolean z4 = this.G;
                            str = m.p;
                            String str2 = m.l;
                            if (qy3.h(str) != 1 && qy3.a(str, str2)) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            this.G = z4 & z2;
                            this.H = false;
                            z3 = true;
                        }
                    }
                    this.E = m;
                    boolean z42 = this.G;
                    str = m.p;
                    String str22 = m.l;
                    if (qy3.h(str) != 1) {
                    }
                    z2 = false;
                    this.G = z42 & z2;
                    this.H = false;
                    z3 = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        e95 e95Var = this.f;
        if (e95Var != null && z3) {
            e95Var.u();
        }
    }

    public final long h(int i) {
        this.v = Math.max(this.v, n(i));
        this.p -= i;
        int i2 = this.q + i;
        this.q = i2;
        int i3 = this.r + i;
        this.r = i3;
        int i4 = this.i;
        if (i3 >= i4) {
            this.r = i3 - i4;
        }
        int i5 = this.s - i;
        this.s = i5;
        int i6 = 0;
        if (i5 < 0) {
            this.s = 0;
        }
        eb2 eb2Var = this.c;
        SparseArray sparseArray = (SparseArray) eb2Var.z;
        while (i6 < sparseArray.size() - 1) {
            int i7 = i6 + 1;
            if (i2 < sparseArray.keyAt(i7)) {
                break;
            }
            ((p65) eb2Var.A).accept(sparseArray.valueAt(i6));
            sparseArray.removeAt(i6);
            int i8 = eb2Var.y;
            if (i8 > 0) {
                eb2Var.y = i8 - 1;
            }
            i6 = i7;
        }
        if (this.p == 0) {
            int i9 = this.r;
            if (i9 == 0) {
                i9 = this.i;
            }
            return this.k[i9 - 1] + this.l[r7];
        }
        return this.k[this.r];
    }

    public final void i(long j, boolean z) {
        f95 f95Var;
        Throwable th;
        long j2;
        dy1 dy1Var = this.a;
        synchronized (this) {
            try {
                try {
                    int i = this.p;
                    j2 = -1;
                    if (i != 0) {
                        long[] jArr = this.n;
                        int i2 = this.r;
                        if (j >= jArr[i2]) {
                            if (z) {
                                try {
                                    int i3 = this.s;
                                    if (i3 != i) {
                                        i = i3 + 1;
                                    }
                                } catch (Throwable th2) {
                                    th = th2;
                                    f95Var = this;
                                    throw th;
                                }
                            }
                            int l = l(i2, i, j, false);
                            if (l != -1) {
                                j2 = h(l);
                            }
                        }
                    }
                } catch (Throwable th3) {
                    th = th3;
                    th = th;
                    throw th;
                }
            } catch (Throwable th4) {
                th = th4;
                f95Var = this;
                th = th;
                throw th;
            }
        }
        dy1Var.b(j2);
    }

    public final void j() {
        long h;
        dy1 dy1Var = this.a;
        synchronized (this) {
            int i = this.p;
            if (i == 0) {
                h = -1;
            } else {
                h = h(i);
            }
        }
        dy1Var.b(h);
    }

    public final long k(int i) {
        boolean z;
        int i2 = this.q;
        int i3 = this.p;
        int i4 = (i2 + i3) - i;
        boolean z2 = false;
        if (i4 >= 0 && i4 <= i3 - this.s) {
            z = true;
        } else {
            z = false;
        }
        io3.n(z);
        int i5 = this.p - i4;
        this.p = i5;
        this.w = Math.max(this.v, n(i5));
        if (i4 == 0 && this.z) {
            z2 = true;
        }
        this.z = z2;
        int i6 = this.x;
        int i7 = -1;
        if (i6 != -1 && i < i6) {
            this.x = -1;
        }
        int i8 = this.y;
        if (i8 != -1 && i < i8) {
            this.y = -1;
        }
        eb2 eb2Var = this.c;
        SparseArray sparseArray = (SparseArray) eb2Var.z;
        for (int size = sparseArray.size() - 1; size >= 0 && i < sparseArray.keyAt(size); size--) {
            ((p65) eb2Var.A).accept(sparseArray.valueAt(size));
            sparseArray.removeAt(size);
        }
        if (sparseArray.size() > 0) {
            i7 = Math.min(eb2Var.y, sparseArray.size() - 1);
        }
        eb2Var.y = i7;
        int i9 = this.p;
        if (i9 != 0) {
            return this.k[p(i9 - 1)] + this.l[r9];
        }
        return 0L;
    }

    public final int l(int i, int i2, long j, boolean z) {
        int i3 = -1;
        for (int i4 = 0; i4 < i2; i4++) {
            long j2 = this.n[i];
            if (j2 > j) {
                break;
            }
            if (!z || (this.m[i] & 1) != 0) {
                if (j2 == j) {
                    return i4;
                }
                i3 = i4;
            }
            i++;
            if (i == this.i) {
                i = 0;
            }
        }
        return i3;
    }

    public ea2 m(ea2 ea2Var) {
        if (this.I != 0 && ea2Var.u != Long.MAX_VALUE) {
            da2 a = ea2Var.a();
            a.t = ea2Var.u + this.I;
            return new ea2(a);
        }
        return ea2Var;
    }

    public final long n(int i) {
        long j = Long.MIN_VALUE;
        if (i == 0) {
            return Long.MIN_VALUE;
        }
        int p = p(i - 1);
        for (int i2 = 0; i2 < i; i2++) {
            j = Math.max(j, this.n[p]);
            if ((this.m[p] & 1) != 0) {
                return j;
            }
            p--;
            if (p == -1) {
                p = this.i - 1;
            }
        }
        return j;
    }

    public final int o() {
        return this.q + this.s;
    }

    public final int p(int i) {
        int i2 = this.r + i;
        int i3 = this.i;
        if (i2 < i3) {
            return i2;
        }
        return i2 - i3;
    }

    public final synchronized int q(long j, boolean z) {
        boolean z2;
        try {
            try {
                int p = p(this.s);
                int i = this.s;
                int i2 = this.p;
                if (i != i2) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (!z2 || j < this.n[p]) {
                    return 0;
                }
                if (j > this.w && z) {
                    return i2 - i;
                }
                int l = l(p, i2 - i, j, true);
                if (l == -1) {
                    return 0;
                }
                return l;
            } catch (Throwable th) {
                th = th;
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            throw th;
        }
    }

    public final synchronized ea2 r() {
        ea2 ea2Var;
        if (this.B) {
            ea2Var = null;
        } else {
            ea2Var = this.E;
        }
        return ea2Var;
    }

    public final synchronized boolean s(boolean z) {
        boolean z2;
        ea2 ea2Var;
        boolean z3;
        int o = o();
        int i = this.x;
        boolean z4 = true;
        if (i != -1 && o >= i) {
            return true;
        }
        if (this.s != this.p) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            if (i == -1 && this.y != -1 && o() >= this.y) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (!z3) {
                if (((d95) this.c.j(o)).a != this.g) {
                    return true;
                }
                return t(p(this.s));
            }
        }
        if (!z && !this.z && ((ea2Var = this.E) == null || ea2Var == this.g)) {
            z4 = false;
        }
        return z4;
    }

    public final boolean t(int i) {
        qp1 qp1Var = this.h;
        if (qp1Var != null && qp1Var.e() != 4) {
            if ((this.m[i] & 1073741824) != 0 || !this.h.b()) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final void u(ea2 ea2Var, pz2 pz2Var) {
        boolean z;
        op1 op1Var;
        ea2 ea2Var2;
        ea2 ea2Var3 = this.g;
        if (ea2Var3 == null) {
            z = true;
        } else {
            z = false;
        }
        if (ea2Var3 == null) {
            op1Var = null;
        } else {
            op1Var = ea2Var3.t;
        }
        this.g = ea2Var;
        op1 op1Var2 = ea2Var.t;
        xp1 xp1Var = this.d;
        if (xp1Var != null) {
            int e = xp1Var.e(ea2Var);
            da2 a = ea2Var.a();
            a.S = e;
            ea2Var2 = new ea2(a);
        } else {
            ea2Var2 = ea2Var;
        }
        pz2Var.z = ea2Var2;
        pz2Var.y = this.h;
        if (xp1Var != null) {
            if (z || !Objects.equals(op1Var, op1Var2)) {
                qp1 qp1Var = this.h;
                tp1 tp1Var = this.e;
                qp1 b = xp1Var.b(tp1Var, ea2Var);
                this.h = b;
                pz2Var.y = b;
                if (qp1Var != null) {
                    qp1Var.c(tp1Var);
                }
            }
        }
    }

    public final synchronized long v() {
        boolean z;
        long j;
        try {
            int p = p(this.s);
            if (this.s != this.p) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                j = this.j[p];
            } else {
                j = this.F;
            }
        } catch (Throwable th) {
            throw th;
        }
        return j;
    }

    /* JADX WARN: Code restructure failed: missing block: B:65:0x00a8, code lost:
    
        if (r16.z != false) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x00aa, code lost:
    
        if (r10 == false) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00ad, code lost:
    
        r6 = r16.E;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x00af, code lost:
    
        if (r6 == null) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x00b1, code lost:
    
        if (r3 != false) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x00b5, code lost:
    
        if (r6 == r16.g) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x00b7, code lost:
    
        u(r6, r17);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int w(defpackage.pz2 r17, defpackage.q61 r18, int r19, boolean r20) {
        /*
            Method dump skipped, instructions count: 257
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.f95.w(pz2, q61, int, boolean):int");
    }

    public final void x(boolean z) {
        boolean z2;
        dy1 dy1Var = this.a;
        l7 l7Var = (l7) dy1Var.c;
        g90 g90Var = (g90) dy1Var.e;
        if (((k7) g90Var.z) != null) {
            l7Var.a(g90Var);
            g90Var.z = null;
            g90Var.A = null;
        }
        g90 g90Var2 = (g90) dy1Var.e;
        int i = dy1Var.a;
        if (((k7) g90Var2.z) == null) {
            z2 = true;
        } else {
            z2 = false;
        }
        io3.B(z2);
        g90Var2.x = 0L;
        g90Var2.y = i;
        g90 g90Var3 = (g90) dy1Var.e;
        dy1Var.f = g90Var3;
        dy1Var.g = g90Var3;
        dy1Var.b = 0L;
        l7Var.i();
        this.p = 0;
        this.q = 0;
        this.r = 0;
        this.s = 0;
        this.x = -1;
        this.y = -1;
        this.A = true;
        this.t = Long.MIN_VALUE;
        this.v = Long.MIN_VALUE;
        this.w = Long.MIN_VALUE;
        this.z = false;
        eb2 eb2Var = this.c;
        SparseArray sparseArray = (SparseArray) eb2Var.z;
        for (int i2 = 0; i2 < sparseArray.size(); i2++) {
            ((p65) eb2Var.A).accept(sparseArray.valueAt(i2));
        }
        eb2Var.y = -1;
        sparseArray.clear();
        if (z) {
            this.D = null;
            this.E = null;
            this.B = true;
            this.G = true;
        }
    }

    public final synchronized boolean y(int i) {
        synchronized (this) {
            this.s = 0;
            dy1 dy1Var = this.a;
            dy1Var.f = (g90) dy1Var.e;
        }
        int i2 = this.q;
        if (i >= i2 && i <= this.p + i2) {
            int i3 = this.x;
            if (i3 != -1 && i >= i3) {
                return false;
            }
            int i4 = this.y;
            if (i4 != -1 && i >= i4) {
                return false;
            }
            this.t = Long.MIN_VALUE;
            this.s = i - i2;
            return true;
        }
        return false;
    }

    public final synchronized boolean z(long j, boolean z) {
        Throwable th;
        f95 f95Var;
        boolean z2;
        f95 f95Var2;
        long j2;
        int l;
        try {
            synchronized (this) {
                try {
                    try {
                        synchronized (this) {
                            try {
                                this.s = 0;
                                dy1 dy1Var = this.a;
                                dy1Var.f = (g90) dy1Var.e;
                                try {
                                } catch (Throwable th2) {
                                    th = th2;
                                    f95Var = this;
                                    th = th;
                                    throw th;
                                }
                            } catch (Throwable th3) {
                                th = th3;
                                f95Var = this;
                                while (true) {
                                    try {
                                        try {
                                            break;
                                        } catch (Throwable th4) {
                                            th = th4;
                                            th = th;
                                            throw th;
                                        }
                                    } catch (Throwable th5) {
                                        th = th5;
                                    }
                                }
                                throw th;
                            }
                        }
                        return false;
                    } catch (Throwable th6) {
                        th = th6;
                        f95Var = this;
                    }
                } catch (Throwable th7) {
                    th = th7;
                }
            }
            int p = p(0);
            long j3 = this.u;
            long j4 = this.w;
            if (j3 != Long.MIN_VALUE) {
                try {
                    j4 = Math.min(j4, j3);
                } catch (Throwable th8) {
                    th = th8;
                    f95Var = this;
                    throw th;
                }
            }
            int i = this.s;
            int i2 = this.p;
            if (i != i2) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (!z2 || j < this.n[p] || (j > j4 && !z)) {
                return false;
            }
            if (this.G) {
                l = i2 - i;
                int i3 = 0;
                while (true) {
                    if (i3 < l) {
                        if (this.n[p] >= j) {
                            l = i3;
                            break;
                        }
                        p++;
                        if (p == this.i) {
                            p = 0;
                        }
                        i3++;
                    } else if (!z) {
                        l = -1;
                    }
                }
                f95Var2 = this;
                j2 = j;
            } else {
                f95Var2 = this;
                j2 = j;
                l = f95Var2.l(p, i2 - i, j2, true);
            }
            if (l == -1) {
                return false;
            }
            f95Var2.t = j2;
            f95Var2.s += l;
            return true;
        } catch (Throwable th9) {
            th = th9;
            f95Var = this;
            th = th;
            throw th;
        }
    }
}
