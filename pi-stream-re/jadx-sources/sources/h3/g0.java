package h3;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import c1.r0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class g0 implements d2.p {

    /* renamed from: a, reason: collision with root package name */
    public final int f4768a;

    /* renamed from: b, reason: collision with root package name */
    public final int f4769b;

    /* renamed from: c, reason: collision with root package name */
    public final List f4770c;

    /* renamed from: d, reason: collision with root package name */
    public final f1.t f4771d;

    /* renamed from: e, reason: collision with root package name */
    public final SparseIntArray f4772e;

    /* renamed from: f, reason: collision with root package name */
    public final h f4773f;

    /* renamed from: g, reason: collision with root package name */
    public final y2.k f4774g;

    /* renamed from: h, reason: collision with root package name */
    public final SparseArray f4775h;

    /* renamed from: i, reason: collision with root package name */
    public final SparseBooleanArray f4776i;

    /* renamed from: j, reason: collision with root package name */
    public final SparseBooleanArray f4777j;

    /* renamed from: k, reason: collision with root package name */
    public final e0 f4778k;

    /* renamed from: l, reason: collision with root package name */
    public h2.a f4779l;

    /* renamed from: m, reason: collision with root package name */
    public d2.r f4780m;

    /* renamed from: n, reason: collision with root package name */
    public int f4781n;
    public boolean o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f4782p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f4783q;

    /* renamed from: r, reason: collision with root package name */
    public j0 f4784r;

    /* renamed from: s, reason: collision with root package name */
    public int f4785s;

    /* renamed from: t, reason: collision with root package name */
    public int f4786t;

    public g0(int i10, int i11, y2.k kVar, f1.y yVar, h hVar) {
        this.f4773f = hVar;
        this.f4768a = i10;
        this.f4769b = i11;
        this.f4774g = kVar;
        if (i10 != 1 && i10 != 2) {
            ArrayList arrayList = new ArrayList();
            this.f4770c = arrayList;
            arrayList.add(yVar);
        } else {
            this.f4770c = Collections.singletonList(yVar);
        }
        this.f4771d = new f1.t(new byte[9400], 0);
        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
        this.f4776i = sparseBooleanArray;
        this.f4777j = new SparseBooleanArray();
        SparseArray sparseArray = new SparseArray();
        this.f4775h = sparseArray;
        this.f4772e = new SparseIntArray();
        this.f4778k = new e0();
        this.f4780m = d2.r.f3190j;
        this.f4786t = -1;
        sparseBooleanArray.clear();
        sparseArray.clear();
        SparseArray sparseArray2 = new SparseArray();
        int size = sparseArray2.size();
        for (int i12 = 0; i12 < size; i12++) {
            sparseArray.put(sparseArray2.keyAt(i12), (j0) sparseArray2.valueAt(i12));
        }
        sparseArray.put(0, new d0(new androidx.appcompat.widget.a0(this)));
        this.f4784r = null;
    }

    @Override // d2.p
    public final void a() {
    }

    @Override // d2.p
    public final d2.p c() {
        return this;
    }

    @Override // d2.p
    public final void e(long j4, long j10) {
        boolean z9;
        h2.a aVar;
        boolean z10;
        if (this.f4768a != 2) {
            z9 = true;
        } else {
            z9 = false;
        }
        w7.b.u(z9);
        List list = this.f4770c;
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            f1.y yVar = (f1.y) list.get(i10);
            if (yVar.e() == -9223372036854775807L) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10) {
                long d10 = yVar.d();
                if (d10 != -9223372036854775807L && d10 != 0 && d10 != j10) {
                    z10 = true;
                } else {
                    z10 = false;
                }
            }
            if (z10) {
                yVar.g(j10);
            }
        }
        if (j10 != 0 && (aVar = this.f4779l) != null) {
            aVar.c(j10);
        }
        this.f4771d.D(0);
        this.f4772e.clear();
        int i11 = 0;
        while (true) {
            SparseArray sparseArray = this.f4775h;
            if (i11 < sparseArray.size()) {
                ((j0) sparseArray.valueAt(i11)).a();
                i11++;
            } else {
                this.f4785s = 0;
                return;
            }
        }
    }

    @Override // d2.p
    public final void f(d2.r rVar) {
        if ((this.f4769b & 1) == 0) {
            rVar = new y2.n(rVar, this.f4774g);
        }
        this.f4780m = rVar;
    }

    @Override // d2.p
    public final boolean h(d2.q qVar) {
        boolean z9;
        byte[] bArr = this.f4771d.f3858a;
        qVar.n(bArr, 0, 940);
        for (int i10 = 0; i10 < 188; i10++) {
            int i11 = 0;
            while (true) {
                if (i11 < 5) {
                    if (bArr[(i11 * 188) + i10] != 71) {
                        z9 = false;
                        break;
                    }
                    i11++;
                } else {
                    z9 = true;
                    break;
                }
            }
            if (z9) {
                qVar.h(i10);
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v1 */
    /* JADX WARN: Type inference failed for: r15v2, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r15v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r15v5 */
    /* JADX WARN: Type inference failed for: r15v6 */
    @Override // d2.p
    public final int i(d2.q qVar, d2.t tVar) {
        boolean z9;
        int i10;
        boolean z10;
        int i11;
        int i12;
        int i13;
        boolean z11;
        boolean z12;
        boolean z13;
        int i14;
        boolean z14;
        boolean z15;
        long j4;
        int i15;
        long j10;
        boolean z16;
        long c6 = qVar.c();
        boolean z17 = this.o;
        int i16 = this.f4768a;
        if (z17) {
            if (c6 != -1 && i16 != 2) {
                z14 = true;
            } else {
                z14 = false;
            }
            e0 e0Var = this.f4778k;
            if (z14 && !e0Var.f4723d) {
                int i17 = this.f4786t;
                if (i17 <= 0) {
                    e0Var.a(qVar);
                    return 0;
                }
                boolean z18 = e0Var.f4725f;
                f1.t tVar2 = e0Var.f4722c;
                int i18 = e0Var.f4720a;
                if (!z18) {
                    long c10 = qVar.c();
                    int min = (int) Math.min(i18, c10);
                    long j11 = c10 - min;
                    if (qVar.q() != j11) {
                        tVar.f3191a = j11;
                        i15 = 1;
                    } else {
                        tVar2.D(min);
                        qVar.g();
                        qVar.n(tVar2.f3858a, 0, min);
                        int i19 = tVar2.f3859b;
                        int i20 = tVar2.f3860c;
                        int i21 = i20 - 188;
                        while (true) {
                            if (i21 >= i19) {
                                byte[] bArr = tVar2.f3858a;
                                int i22 = -4;
                                int i23 = 0;
                                while (true) {
                                    if (i22 <= 4) {
                                        int i24 = (i22 * 188) + i21;
                                        if (i24 >= i19 && i24 < i20 && bArr[i24] == 71) {
                                            i23++;
                                            if (i23 == 5) {
                                                z16 = true;
                                                break;
                                            }
                                        } else {
                                            i23 = 0;
                                        }
                                        i22++;
                                    } else {
                                        z16 = false;
                                        break;
                                    }
                                }
                                if (z16) {
                                    long V = j5.a.V(i21, i17, tVar2);
                                    if (V != -9223372036854775807L) {
                                        j10 = V;
                                        break;
                                    }
                                }
                                i21--;
                            } else {
                                j10 = -9223372036854775807L;
                                break;
                            }
                        }
                        e0Var.f4727h = j10;
                        e0Var.f4725f = true;
                        i15 = 0;
                    }
                } else {
                    if (e0Var.f4727h == -9223372036854775807L) {
                        e0Var.a(qVar);
                        return 0;
                    }
                    if (!e0Var.f4724e) {
                        int min2 = (int) Math.min(i18, qVar.c());
                        long j12 = 0;
                        if (qVar.q() != j12) {
                            tVar.f3191a = j12;
                            i15 = 1;
                        } else {
                            tVar2.D(min2);
                            qVar.g();
                            qVar.n(tVar2.f3858a, 0, min2);
                            int i25 = tVar2.f3859b;
                            int i26 = tVar2.f3860c;
                            while (true) {
                                if (i25 < i26) {
                                    if (tVar2.f3858a[i25] == 71) {
                                        j4 = j5.a.V(i25, i17, tVar2);
                                        if (j4 != -9223372036854775807L) {
                                            break;
                                        }
                                    }
                                    i25++;
                                } else {
                                    j4 = -9223372036854775807L;
                                    break;
                                }
                            }
                            e0Var.f4726g = j4;
                            e0Var.f4724e = true;
                            i15 = 0;
                        }
                    } else {
                        long j13 = e0Var.f4726g;
                        if (j13 == -9223372036854775807L) {
                            e0Var.a(qVar);
                            return 0;
                        }
                        f1.y yVar = e0Var.f4721b;
                        e0Var.f4728i = yVar.c(e0Var.f4727h) - yVar.b(j13);
                        e0Var.a(qVar);
                        return 0;
                    }
                }
                return i15;
            }
            if (!this.f4782p) {
                this.f4782p = true;
                long j14 = e0Var.f4728i;
                if (j14 != -9223372036854775807L) {
                    z9 = 0;
                    i10 = i16;
                    h2.a aVar = new h2.a(e0Var.f4721b, j14, c6, this.f4786t, 112800);
                    this.f4779l = aVar;
                    this.f4780m.s(aVar.f3152a);
                } else {
                    z9 = 0;
                    i10 = i16;
                    this.f4780m.s(new d2.u(j14));
                }
            } else {
                z9 = 0;
                i10 = i16;
            }
            if (this.f4783q) {
                this.f4783q = z9;
                e(0L, 0L);
                if (qVar.q() != 0) {
                    tVar.f3191a = 0L;
                    return 1;
                }
            }
            h2.a aVar2 = this.f4779l;
            if (aVar2 != null) {
                if (aVar2.f3154c != null) {
                    z15 = true;
                } else {
                    z15 = z9 == true ? 1 : 0;
                }
                if (z15) {
                    return aVar2.a(qVar, tVar);
                }
            }
        } else {
            z9 = 0;
            i10 = i16;
        }
        f1.t tVar3 = this.f4771d;
        byte[] bArr2 = tVar3.f3858a;
        int i27 = tVar3.f3859b;
        if (9400 - i27 < 188) {
            int i28 = tVar3.f3860c - i27;
            if (i28 > 0) {
                System.arraycopy(bArr2, i27, bArr2, z9, i28);
            }
            tVar3.E(bArr2, i28);
        }
        while (true) {
            int i29 = tVar3.f3860c;
            if (i29 - tVar3.f3859b < 188) {
                int p3 = qVar.p(bArr2, i29, 9400 - i29);
                if (p3 == -1) {
                    z10 = z9;
                    break;
                }
                tVar3.F(i29 + p3);
            } else {
                z10 = true;
                break;
            }
        }
        if (!z10) {
            return -1;
        }
        int i30 = tVar3.f3859b;
        int i31 = tVar3.f3860c;
        byte[] bArr3 = tVar3.f3858a;
        int i32 = i30;
        while (i32 < i31 && bArr3[i32] != 71) {
            i32++;
        }
        tVar3.G(i32);
        int i33 = i32 + 188;
        j0 j0Var = null;
        if (i33 > i31) {
            int i34 = (i32 - i30) + this.f4785s;
            this.f4785s = i34;
            i11 = i10;
            i12 = 2;
            if (i11 == 2 && i34 > 376) {
                throw r0.a("Cannot find sync byte. Most likely not a Transport Stream.", null);
            }
        } else {
            i11 = i10;
            i12 = 2;
            this.f4785s = z9;
        }
        int i35 = tVar3.f3860c;
        if (i33 > i35) {
            return z9;
        }
        int f10 = tVar3.f();
        if ((8388608 & f10) != 0) {
            tVar3.G(i33);
            return z9;
        }
        if ((4194304 & f10) != 0) {
            i13 = 1;
        } else {
            i13 = z9;
        }
        int i36 = i13 | z9;
        int i37 = (2096896 & f10) >> 8;
        if ((f10 & 32) != 0) {
            z11 = true;
        } else {
            z11 = z9;
        }
        if ((f10 & 16) != 0) {
            z12 = true;
        } else {
            z12 = z9;
        }
        if (z12) {
            j0Var = (j0) this.f4775h.get(i37);
        }
        if (j0Var == null) {
            tVar3.G(i33);
            return z9;
        }
        if (i11 != i12) {
            int i38 = f10 & 15;
            SparseIntArray sparseIntArray = this.f4772e;
            int i39 = sparseIntArray.get(i37, i38 - 1);
            sparseIntArray.put(i37, i38);
            if (i39 == i38) {
                tVar3.G(i33);
                return z9;
            }
            if (i38 != ((i39 + 1) & 15)) {
                j0Var.a();
            }
        }
        if (z11) {
            int v9 = tVar3.v();
            if ((tVar3.v() & 64) != 0) {
                i14 = i12;
            } else {
                i14 = z9;
            }
            i36 |= i14;
            tVar3.H(v9 - 1);
        }
        boolean z19 = this.o;
        if (i11 != i12 && !z19 && this.f4777j.get(i37, z9)) {
            z13 = z9;
        } else {
            z13 = true;
        }
        if (z13) {
            tVar3.F(i33);
            j0Var.b(i36, tVar3);
            tVar3.F(i35);
        }
        if (i11 != i12 && !z19 && this.o && c6 != -1) {
            this.f4783q = true;
        }
        tVar3.G(i33);
        return z9;
    }
}
