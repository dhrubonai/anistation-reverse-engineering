package v1;

import android.util.SparseArray;
import java.io.EOFException;

/* loaded from: classes.dex */
public class u0 implements d2.g0 {
    public c1.v A;
    public c1.v B;
    public long C;
    public boolean E;
    public long F;
    public boolean G;

    /* renamed from: a, reason: collision with root package name */
    public final q0 f10534a;

    /* renamed from: d, reason: collision with root package name */
    public final o1.q f10537d;

    /* renamed from: e, reason: collision with root package name */
    public final o1.n f10538e;

    /* renamed from: f, reason: collision with root package name */
    public t0 f10539f;

    /* renamed from: g, reason: collision with root package name */
    public c1.v f10540g;

    /* renamed from: h, reason: collision with root package name */
    public o1.k f10541h;

    /* renamed from: p, reason: collision with root package name */
    public int f10548p;

    /* renamed from: q, reason: collision with root package name */
    public int f10549q;

    /* renamed from: r, reason: collision with root package name */
    public int f10550r;

    /* renamed from: s, reason: collision with root package name */
    public int f10551s;

    /* renamed from: w, reason: collision with root package name */
    public boolean f10555w;

    /* renamed from: z, reason: collision with root package name */
    public boolean f10558z;

    /* renamed from: b, reason: collision with root package name */
    public final r0 f10535b = new r0();

    /* renamed from: i, reason: collision with root package name */
    public int f10542i = 1000;

    /* renamed from: j, reason: collision with root package name */
    public long[] f10543j = new long[1000];

    /* renamed from: k, reason: collision with root package name */
    public long[] f10544k = new long[1000];

    /* renamed from: n, reason: collision with root package name */
    public long[] f10547n = new long[1000];

    /* renamed from: m, reason: collision with root package name */
    public int[] f10546m = new int[1000];

    /* renamed from: l, reason: collision with root package name */
    public int[] f10545l = new int[1000];
    public d2.f0[] o = new d2.f0[1000];

    /* renamed from: c, reason: collision with root package name */
    public final y.c f10536c = new y.c(new j1.l(12));

    /* renamed from: t, reason: collision with root package name */
    public long f10552t = Long.MIN_VALUE;

    /* renamed from: u, reason: collision with root package name */
    public long f10553u = Long.MIN_VALUE;

    /* renamed from: v, reason: collision with root package name */
    public long f10554v = Long.MIN_VALUE;

    /* renamed from: y, reason: collision with root package name */
    public boolean f10557y = true;

    /* renamed from: x, reason: collision with root package name */
    public boolean f10556x = true;
    public boolean D = true;

    public u0(z1.d dVar, o1.q qVar, o1.n nVar) {
        this.f10537d = qVar;
        this.f10538e = nVar;
        this.f10534a = new q0(dVar);
    }

    public final void A(boolean z9) {
        boolean z10;
        y.c cVar;
        q0 q0Var = this.f10534a;
        q0Var.a(q0Var.f10510d);
        p0 p0Var = q0Var.f10510d;
        int i10 = 0;
        if (p0Var.f10504c == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        w7.b.u(z10);
        p0Var.f10502a = 0L;
        p0Var.f10503b = q0Var.f10508b + 0;
        p0 p0Var2 = q0Var.f10510d;
        q0Var.f10511e = p0Var2;
        q0Var.f10512f = p0Var2;
        q0Var.f10513g = 0L;
        q0Var.f10507a.b();
        this.f10548p = 0;
        this.f10549q = 0;
        this.f10550r = 0;
        this.f10551s = 0;
        this.f10556x = true;
        this.f10552t = Long.MIN_VALUE;
        this.f10553u = Long.MIN_VALUE;
        this.f10554v = Long.MIN_VALUE;
        this.f10555w = false;
        while (true) {
            cVar = this.f10536c;
            if (i10 >= ((SparseArray) cVar.f11424b).size()) {
                break;
            }
            ((f1.c) cVar.f11425c).accept(((SparseArray) cVar.f11424b).valueAt(i10));
            i10++;
        }
        cVar.f11423a = -1;
        ((SparseArray) cVar.f11424b).clear();
        if (z9) {
            this.A = null;
            this.B = null;
            this.f10557y = true;
            this.D = true;
        }
    }

    public final synchronized void B() {
        this.f10551s = 0;
        q0 q0Var = this.f10534a;
        q0Var.f10511e = q0Var.f10510d;
    }

    public final synchronized boolean C(int i10) {
        B();
        int i11 = this.f10549q;
        if (i10 >= i11 && i10 <= this.f10548p + i11) {
            this.f10552t = Long.MIN_VALUE;
            this.f10551s = i10 - i11;
            return true;
        }
        return false;
    }

    public final synchronized boolean D(long j4, boolean z9) {
        boolean z10;
        int m5;
        B();
        int r8 = r(this.f10551s);
        int i10 = this.f10551s;
        int i11 = this.f10548p;
        if (i10 != i11) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10 && j4 >= this.f10547n[r8] && (j4 <= this.f10554v || z9)) {
            if (this.D) {
                int i12 = i11 - i10;
                m5 = 0;
                while (true) {
                    if (m5 < i12) {
                        if (this.f10547n[r8] >= j4) {
                            break;
                        }
                        r8++;
                        if (r8 == this.f10542i) {
                            r8 = 0;
                        }
                        m5++;
                    } else {
                        if (!z9) {
                            i12 = -1;
                        }
                        m5 = i12;
                    }
                }
            } else {
                m5 = m(r8, i11 - i10, j4, true);
            }
            if (m5 == -1) {
                return false;
            }
            this.f10552t = j4;
            this.f10551s += m5;
            return true;
        }
        return false;
    }

    public final synchronized void E(int i10) {
        boolean z9;
        if (i10 >= 0) {
            try {
                if (this.f10551s + i10 <= this.f10548p) {
                    z9 = true;
                    w7.b.g(z9);
                    this.f10551s += i10;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        z9 = false;
        w7.b.g(z9);
        this.f10551s += i10;
    }

    @Override // d2.g0
    public final int a(c1.l lVar, int i10, boolean z9) {
        q0 q0Var = this.f10534a;
        int c6 = q0Var.c(i10);
        p0 p0Var = q0Var.f10512f;
        z1.a aVar = p0Var.f10504c;
        int p3 = lVar.p(aVar.f11888a, ((int) (q0Var.f10513g - p0Var.f10502a)) + aVar.f11889b, c6);
        if (p3 == -1) {
            if (z9) {
                return -1;
            }
            throw new EOFException();
        }
        long j4 = q0Var.f10513g + p3;
        q0Var.f10513g = j4;
        p0 p0Var2 = q0Var.f10512f;
        if (j4 == p0Var2.f10503b) {
            q0Var.f10512f = p0Var2.f10505d;
            return p3;
        }
        return p3;
    }

    @Override // d2.g0
    public final void b(c1.v vVar) {
        boolean z9;
        c1.v n9 = n(vVar);
        boolean z10 = false;
        this.f10558z = false;
        this.A = vVar;
        synchronized (this) {
            this.f10557y = false;
            if (!f1.b0.a(n9, this.B)) {
                if (((SparseArray) this.f10536c.f11424b).size() == 0) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                if (!z9 && ((s0) this.f10536c.e()).f10532a.equals(n9)) {
                    this.B = ((s0) this.f10536c.e()).f10532a;
                } else {
                    this.B = n9;
                }
                boolean z11 = this.D;
                c1.v vVar2 = this.B;
                this.D = z11 & c1.q0.a(vVar2.f1935m, vVar2.f1932j);
                this.E = false;
                z10 = true;
            }
        }
        t0 t0Var = this.f10539f;
        if (t0Var != null && z10) {
            t0Var.a();
        }
    }

    @Override // d2.g0
    public final int c(c1.l lVar, int i10, boolean z9) {
        return a(lVar, i10, z9);
    }

    @Override // d2.g0
    public void d(long j4, int i10, int i11, int i12, d2.f0 f0Var) {
        boolean z9;
        boolean z10;
        boolean z11;
        o1.p pVar;
        boolean z12;
        if (this.f10558z) {
            c1.v vVar = this.A;
            w7.b.w(vVar);
            b(vVar);
        }
        int i13 = i10 & 1;
        if (i13 != 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (this.f10556x) {
            if (!z9) {
                return;
            } else {
                this.f10556x = false;
            }
        }
        long j10 = j4 + this.F;
        if (this.D) {
            if (j10 < this.f10552t) {
                return;
            }
            if (i13 == 0) {
                if (!this.E) {
                    f1.o.f("SampleQueue", "Overriding unexpected non-sync sample for format: " + this.B);
                    this.E = true;
                }
                i10 |= 1;
            }
        }
        if (this.G) {
            if (z9 && g(j10)) {
                this.G = false;
            } else {
                return;
            }
        }
        long j11 = (this.f10534a.f10513g - i11) - i12;
        synchronized (this) {
            int i14 = this.f10548p;
            if (i14 > 0) {
                if (this.f10544k[r(i14 - 1)] + this.f10545l[r14] <= j11) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                w7.b.g(z12);
            }
            if ((536870912 & i10) != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.f10555w = z10;
            this.f10554v = Math.max(this.f10554v, j10);
            int r8 = r(this.f10548p);
            this.f10547n[r8] = j10;
            this.f10544k[r8] = j11;
            this.f10545l[r8] = i11;
            this.f10546m[r8] = i10;
            this.o[r8] = f0Var;
            this.f10543j[r8] = this.C;
            if (((SparseArray) this.f10536c.f11424b).size() == 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11 || !((s0) this.f10536c.e()).f10532a.equals(this.B)) {
                c1.v vVar2 = this.B;
                vVar2.getClass();
                o1.q qVar = this.f10537d;
                if (qVar != null) {
                    pVar = qVar.r(this.f10538e, vVar2);
                } else {
                    pVar = o1.p.f8165l;
                }
                this.f10536c.a(this.f10549q + this.f10548p, new s0(vVar2, pVar));
            }
            int i15 = this.f10548p + 1;
            this.f10548p = i15;
            int i16 = this.f10542i;
            if (i15 == i16) {
                int i17 = i16 + 1000;
                long[] jArr = new long[i17];
                long[] jArr2 = new long[i17];
                long[] jArr3 = new long[i17];
                int[] iArr = new int[i17];
                int[] iArr2 = new int[i17];
                d2.f0[] f0VarArr = new d2.f0[i17];
                int i18 = this.f10550r;
                int i19 = i16 - i18;
                System.arraycopy(this.f10544k, i18, jArr2, 0, i19);
                System.arraycopy(this.f10547n, this.f10550r, jArr3, 0, i19);
                System.arraycopy(this.f10546m, this.f10550r, iArr, 0, i19);
                System.arraycopy(this.f10545l, this.f10550r, iArr2, 0, i19);
                System.arraycopy(this.o, this.f10550r, f0VarArr, 0, i19);
                System.arraycopy(this.f10543j, this.f10550r, jArr, 0, i19);
                int i20 = this.f10550r;
                System.arraycopy(this.f10544k, 0, jArr2, i19, i20);
                System.arraycopy(this.f10547n, 0, jArr3, i19, i20);
                System.arraycopy(this.f10546m, 0, iArr, i19, i20);
                System.arraycopy(this.f10545l, 0, iArr2, i19, i20);
                System.arraycopy(this.o, 0, f0VarArr, i19, i20);
                System.arraycopy(this.f10543j, 0, jArr, i19, i20);
                this.f10544k = jArr2;
                this.f10547n = jArr3;
                this.f10546m = iArr;
                this.f10545l = iArr2;
                this.o = f0VarArr;
                this.f10543j = jArr;
                this.f10550r = 0;
                this.f10542i = i17;
            }
        }
    }

    @Override // d2.g0
    public final void e(int i10, int i11, f1.t tVar) {
        while (true) {
            q0 q0Var = this.f10534a;
            if (i10 > 0) {
                int c6 = q0Var.c(i10);
                p0 p0Var = q0Var.f10512f;
                z1.a aVar = p0Var.f10504c;
                tVar.d(aVar.f11888a, ((int) (q0Var.f10513g - p0Var.f10502a)) + aVar.f11889b, c6);
                i10 -= c6;
                long j4 = q0Var.f10513g + c6;
                q0Var.f10513g = j4;
                p0 p0Var2 = q0Var.f10512f;
                if (j4 == p0Var2.f10503b) {
                    q0Var.f10512f = p0Var2.f10505d;
                }
            } else {
                q0Var.getClass();
                return;
            }
        }
    }

    @Override // d2.g0
    public final void f(int i10, f1.t tVar) {
        e(i10, 0, tVar);
    }

    public final synchronized boolean g(long j4) {
        boolean z9 = true;
        if (this.f10548p == 0) {
            if (j4 <= this.f10553u) {
                z9 = false;
            }
            return z9;
        }
        if (p() >= j4) {
            return false;
        }
        int i10 = this.f10548p;
        int r8 = r(i10 - 1);
        while (i10 > this.f10551s && this.f10547n[r8] >= j4) {
            i10--;
            r8--;
            if (r8 == -1) {
                r8 = this.f10542i - 1;
            }
        }
        k(this.f10549q + i10);
        return true;
    }

    public final long h(int i10) {
        this.f10553u = Math.max(this.f10553u, q(i10));
        this.f10548p -= i10;
        int i11 = this.f10549q + i10;
        this.f10549q = i11;
        int i12 = this.f10550r + i10;
        this.f10550r = i12;
        int i13 = this.f10542i;
        if (i12 >= i13) {
            this.f10550r = i12 - i13;
        }
        int i14 = this.f10551s - i10;
        this.f10551s = i14;
        int i15 = 0;
        if (i14 < 0) {
            this.f10551s = 0;
        }
        while (true) {
            y.c cVar = this.f10536c;
            if (i15 >= ((SparseArray) cVar.f11424b).size() - 1) {
                break;
            }
            int i16 = i15 + 1;
            if (i11 < ((SparseArray) cVar.f11424b).keyAt(i16)) {
                break;
            }
            ((f1.c) cVar.f11425c).accept(((SparseArray) cVar.f11424b).valueAt(i15));
            ((SparseArray) cVar.f11424b).removeAt(i15);
            int i17 = cVar.f11423a;
            if (i17 > 0) {
                cVar.f11423a = i17 - 1;
            }
            i15 = i16;
        }
        if (this.f10548p == 0) {
            int i18 = this.f10550r;
            if (i18 == 0) {
                i18 = this.f10542i;
            }
            return this.f10544k[i18 - 1] + this.f10545l[r6];
        }
        return this.f10544k[this.f10550r];
    }

    public final void i(long j4, boolean z9) {
        long j10;
        int i10;
        int i11;
        q0 q0Var = this.f10534a;
        synchronized (this) {
            int i12 = this.f10548p;
            if (i12 != 0) {
                long[] jArr = this.f10547n;
                int i13 = this.f10550r;
                if (j4 >= jArr[i13]) {
                    if (z9 && (i11 = this.f10551s) != i12) {
                        i10 = i11 + 1;
                    } else {
                        i10 = i12;
                    }
                    int m5 = m(i13, i10, j4, false);
                    if (m5 != -1) {
                        j10 = h(m5);
                    } else {
                        j10 = -1;
                    }
                }
            }
            j10 = -1;
        }
        q0Var.b(j10);
    }

    public final void j() {
        long h10;
        q0 q0Var = this.f10534a;
        synchronized (this) {
            int i10 = this.f10548p;
            if (i10 == 0) {
                h10 = -1;
            } else {
                h10 = h(i10);
            }
        }
        q0Var.b(h10);
    }

    public final long k(int i10) {
        boolean z9;
        int i11 = this.f10549q;
        int i12 = this.f10548p;
        int i13 = (i11 + i12) - i10;
        boolean z10 = false;
        if (i13 >= 0 && i13 <= i12 - this.f10551s) {
            z9 = true;
        } else {
            z9 = false;
        }
        w7.b.g(z9);
        int i14 = this.f10548p - i13;
        this.f10548p = i14;
        this.f10554v = Math.max(this.f10553u, q(i14));
        if (i13 == 0 && this.f10555w) {
            z10 = true;
        }
        this.f10555w = z10;
        y.c cVar = this.f10536c;
        int i15 = -1;
        for (int size = ((SparseArray) cVar.f11424b).size() - 1; size >= 0 && i10 < ((SparseArray) cVar.f11424b).keyAt(size); size--) {
            ((f1.c) cVar.f11425c).accept(((SparseArray) cVar.f11424b).valueAt(size));
            ((SparseArray) cVar.f11424b).removeAt(size);
        }
        if (((SparseArray) cVar.f11424b).size() > 0) {
            i15 = Math.min(cVar.f11423a, ((SparseArray) cVar.f11424b).size() - 1);
        }
        cVar.f11423a = i15;
        int i16 = this.f10548p;
        if (i16 != 0) {
            return this.f10544k[r(i16 - 1)] + this.f10545l[r9];
        }
        return 0L;
    }

    public final void l(int i10) {
        boolean z9;
        long k10 = k(i10);
        q0 q0Var = this.f10534a;
        if (k10 <= q0Var.f10513g) {
            z9 = true;
        } else {
            z9 = false;
        }
        w7.b.g(z9);
        q0Var.f10513g = k10;
        int i11 = q0Var.f10508b;
        if (k10 != 0) {
            p0 p0Var = q0Var.f10510d;
            if (k10 != p0Var.f10502a) {
                while (q0Var.f10513g > p0Var.f10503b) {
                    p0Var = p0Var.f10505d;
                }
                p0 p0Var2 = p0Var.f10505d;
                p0Var2.getClass();
                q0Var.a(p0Var2);
                p0 p0Var3 = new p0(i11, p0Var.f10503b);
                p0Var.f10505d = p0Var3;
                if (q0Var.f10513g == p0Var.f10503b) {
                    p0Var = p0Var3;
                }
                q0Var.f10512f = p0Var;
                if (q0Var.f10511e == p0Var2) {
                    q0Var.f10511e = p0Var3;
                    return;
                }
                return;
            }
        }
        q0Var.a(q0Var.f10510d);
        p0 p0Var4 = new p0(i11, q0Var.f10513g);
        q0Var.f10510d = p0Var4;
        q0Var.f10511e = p0Var4;
        q0Var.f10512f = p0Var4;
    }

    public final int m(int i10, int i11, long j4, boolean z9) {
        int i12 = -1;
        for (int i13 = 0; i13 < i11; i13++) {
            long j10 = this.f10547n[i10];
            if (j10 <= j4) {
                if (!z9 || (this.f10546m[i10] & 1) != 0) {
                    if (j10 == j4) {
                        return i13;
                    }
                    i12 = i13;
                }
                i10++;
                if (i10 == this.f10542i) {
                    i10 = 0;
                }
            } else {
                return i12;
            }
        }
        return i12;
    }

    public c1.v n(c1.v vVar) {
        if (this.F != 0 && vVar.f1938q != Long.MAX_VALUE) {
            c1.u a10 = vVar.a();
            a10.f1911p = vVar.f1938q + this.F;
            return a10.a();
        }
        return vVar;
    }

    public final synchronized long o() {
        return this.f10554v;
    }

    public final synchronized long p() {
        return Math.max(this.f10553u, q(this.f10551s));
    }

    public final long q(int i10) {
        long j4 = Long.MIN_VALUE;
        if (i10 == 0) {
            return Long.MIN_VALUE;
        }
        int r8 = r(i10 - 1);
        for (int i11 = 0; i11 < i10; i11++) {
            j4 = Math.max(j4, this.f10547n[r8]);
            if ((this.f10546m[r8] & 1) != 0) {
                break;
            }
            r8--;
            if (r8 == -1) {
                r8 = this.f10542i - 1;
            }
        }
        return j4;
    }

    public final int r(int i10) {
        int i11 = this.f10550r + i10;
        int i12 = this.f10542i;
        if (i11 >= i12) {
            return i11 - i12;
        }
        return i11;
    }

    public final synchronized int s(long j4, boolean z9) {
        boolean z10;
        int r8 = r(this.f10551s);
        int i10 = this.f10551s;
        int i11 = this.f10548p;
        if (i10 != i11) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10 && j4 >= this.f10547n[r8]) {
            if (j4 > this.f10554v && z9) {
                return i11 - i10;
            }
            int m5 = m(r8, i11 - i10, j4, true);
            if (m5 == -1) {
                return 0;
            }
            return m5;
        }
        return 0;
    }

    public final synchronized c1.v t() {
        c1.v vVar;
        if (this.f10557y) {
            vVar = null;
        } else {
            vVar = this.B;
        }
        return vVar;
    }

    public final synchronized boolean u(boolean z9) {
        boolean z10;
        c1.v vVar;
        int i10 = this.f10551s;
        boolean z11 = true;
        if (i10 != this.f10548p) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            if (!z9 && !this.f10555w && ((vVar = this.B) == null || vVar == this.f10540g)) {
                z11 = false;
            }
            return z11;
        }
        if (((s0) this.f10536c.d(this.f10549q + i10)).f10532a != this.f10540g) {
            return true;
        }
        return v(r(this.f10551s));
    }

    public final boolean v(int i10) {
        o1.k kVar = this.f10541h;
        if (kVar != null && kVar.getState() != 4 && ((this.f10546m[i10] & 1073741824) != 0 || !this.f10541h.b())) {
            return false;
        }
        return true;
    }

    public final void w() {
        o1.k kVar = this.f10541h;
        if (kVar != null && kVar.getState() == 1) {
            o1.j f10 = this.f10541h.f();
            f10.getClass();
            throw f10;
        }
    }

    public final void x(c1.v vVar, androidx.appcompat.widget.a0 a0Var) {
        boolean z9;
        c1.p pVar;
        c1.v vVar2;
        c1.v vVar3 = this.f10540g;
        if (vVar3 == null) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (vVar3 == null) {
            pVar = null;
        } else {
            pVar = vVar3.f1937p;
        }
        this.f10540g = vVar;
        c1.p pVar2 = vVar.f1937p;
        o1.q qVar = this.f10537d;
        if (qVar != null) {
            int o = qVar.o(vVar);
            c1.u a10 = vVar.a();
            a10.H = o;
            vVar2 = a10.a();
        } else {
            vVar2 = vVar;
        }
        a0Var.f404c = vVar2;
        a0Var.f403b = this.f10541h;
        if (qVar == null) {
            return;
        }
        if (!z9 && f1.b0.a(pVar, pVar2)) {
            return;
        }
        o1.k kVar = this.f10541h;
        o1.n nVar = this.f10538e;
        o1.k l10 = qVar.l(nVar, vVar);
        this.f10541h = l10;
        a0Var.f403b = l10;
        if (kVar != null) {
            kVar.a(nVar);
        }
    }

    public final synchronized long y() {
        boolean z9;
        long j4;
        int r8 = r(this.f10551s);
        if (this.f10551s != this.f10548p) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (z9) {
            j4 = this.f10543j[r8];
        } else {
            j4 = this.C;
        }
        return j4;
    }

    public final int z(androidx.appcompat.widget.a0 a0Var, i1.h hVar, int i10, boolean z9) {
        boolean z10;
        boolean z11;
        int i11;
        boolean z12 = false;
        if ((i10 & 2) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        r0 r0Var = this.f10535b;
        synchronized (this) {
            hVar.f5263f = false;
            int i12 = this.f10551s;
            if (i12 != this.f10548p) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (!z11) {
                if (!z9 && !this.f10555w) {
                    c1.v vVar = this.B;
                    if (vVar != null && (z10 || vVar != this.f10540g)) {
                        x(vVar, a0Var);
                        i11 = -5;
                    } else {
                        i11 = -3;
                    }
                }
                hVar.f5247b = 4;
                hVar.f5264x = Long.MIN_VALUE;
                i11 = -4;
            } else {
                c1.v vVar2 = ((s0) this.f10536c.d(this.f10549q + i12)).f10532a;
                if (!z10 && vVar2 == this.f10540g) {
                    int r8 = r(this.f10551s);
                    if (!v(r8)) {
                        hVar.f5263f = true;
                        i11 = -3;
                    } else {
                        hVar.f5247b = this.f10546m[r8];
                        if (this.f10551s == this.f10548p - 1 && (z9 || this.f10555w)) {
                            hVar.e(536870912);
                        }
                        long j4 = this.f10547n[r8];
                        hVar.f5264x = j4;
                        if (j4 < this.f10552t) {
                            hVar.e(Integer.MIN_VALUE);
                        }
                        r0Var.f10522a = this.f10545l[r8];
                        r0Var.f10523b = this.f10544k[r8];
                        r0Var.f10524c = this.o[r8];
                        i11 = -4;
                    }
                }
                x(vVar2, a0Var);
                i11 = -5;
            }
        }
        if (i11 == -4 && !hVar.g(4)) {
            if ((i10 & 1) != 0) {
                z12 = true;
            }
            if ((i10 & 4) == 0) {
                if (z12) {
                    q0 q0Var = this.f10534a;
                    q0.f(q0Var.f10511e, hVar, this.f10535b, q0Var.f10509c);
                } else {
                    q0 q0Var2 = this.f10534a;
                    q0Var2.f10511e = q0.f(q0Var2.f10511e, hVar, this.f10535b, q0Var2.f10509c);
                }
            }
            if (!z12) {
                this.f10551s++;
            }
        }
        return i11;
    }
}
