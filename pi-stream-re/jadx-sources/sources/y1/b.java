package y1;

import android.os.SystemClock;
import c1.f1;
import f1.b0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import r6.g1;
import r6.h0;
import r6.j1;
import r6.l0;
import r6.l1;
import r6.n1;
import r6.o0;

/* loaded from: classes.dex */
public final class b extends c {

    /* renamed from: g, reason: collision with root package name */
    public final z1.c f11466g;

    /* renamed from: h, reason: collision with root package name */
    public final long f11467h;

    /* renamed from: i, reason: collision with root package name */
    public final long f11468i;

    /* renamed from: j, reason: collision with root package name */
    public final long f11469j;

    /* renamed from: k, reason: collision with root package name */
    public final int f11470k;

    /* renamed from: l, reason: collision with root package name */
    public final int f11471l;

    /* renamed from: m, reason: collision with root package name */
    public final float f11472m;

    /* renamed from: n, reason: collision with root package name */
    public final float f11473n;
    public final o0 o;

    /* renamed from: p, reason: collision with root package name */
    public final f1.a f11474p;

    /* renamed from: q, reason: collision with root package name */
    public float f11475q;

    /* renamed from: r, reason: collision with root package name */
    public int f11476r;

    /* renamed from: s, reason: collision with root package name */
    public int f11477s;

    /* renamed from: t, reason: collision with root package name */
    public long f11478t;

    /* renamed from: u, reason: collision with root package name */
    public w1.n f11479u;

    public b(f1 f1Var, int[] iArr, int i10, z1.c cVar, long j4, long j10, long j11, int i11, int i12, float f10, float f11, o0 o0Var, f1.a aVar) {
        super(f1Var, iArr);
        z1.c cVar2;
        long j12;
        if (j11 < j4) {
            f1.o.f("AdaptiveTrackSelection", "Adjusting minDurationToRetainAfterDiscardMs to be at least minDurationForQualityIncreaseMs");
            cVar2 = cVar;
            j12 = j4;
        } else {
            cVar2 = cVar;
            j12 = j11;
        }
        this.f11466g = cVar2;
        this.f11467h = j4 * 1000;
        this.f11468i = j10 * 1000;
        this.f11469j = j12 * 1000;
        this.f11470k = i11;
        this.f11471l = i12;
        this.f11472m = f10;
        this.f11473n = f11;
        this.o = o0.j(o0Var);
        this.f11474p = aVar;
        this.f11475q = 1.0f;
        this.f11477s = 0;
        this.f11478t = -9223372036854775807L;
    }

    public static n1 v(q[] qVarArr) {
        int i10;
        int i11;
        n1 C0;
        int i12;
        double d10;
        long j4;
        ArrayList arrayList = new ArrayList();
        int i13 = 0;
        int i14 = 0;
        while (true) {
            i10 = 1;
            if (i14 >= qVarArr.length) {
                break;
            }
            q qVar = qVarArr[i14];
            if (qVar != null && qVar.f11525b.length > 1) {
                l0 i15 = o0.i();
                i15.y0(new a(0L, 0L));
                arrayList.add(i15);
            } else {
                arrayList.add(null);
            }
            i14++;
        }
        int length = qVarArr.length;
        long[][] jArr = new long[length];
        for (int i16 = 0; i16 < qVarArr.length; i16++) {
            q qVar2 = qVarArr[i16];
            if (qVar2 == null) {
                jArr[i16] = new long[0];
            } else {
                int[] iArr = qVar2.f11525b;
                jArr[i16] = new long[iArr.length];
                for (int i17 = 0; i17 < iArr.length; i17++) {
                    long j10 = qVar2.f11524a.f1693d[iArr[i17]].f1931i;
                    long[] jArr2 = jArr[i16];
                    if (j10 == -1) {
                        j10 = 0;
                    }
                    jArr2[i17] = j10;
                }
                Arrays.sort(jArr[i16]);
            }
        }
        int[] iArr2 = new int[length];
        long[] jArr3 = new long[length];
        for (int i18 = 0; i18 < length; i18++) {
            long[] jArr4 = jArr[i18];
            if (jArr4.length == 0) {
                j4 = 0;
            } else {
                j4 = jArr4[0];
            }
            jArr3[i18] = j4;
        }
        w(arrayList, jArr3);
        l1 l1Var = l1.f9489a;
        l1Var.getClass();
        j1 x02 = new g1(l1Var).c().x0();
        int i19 = 0;
        while (i19 < length) {
            long[] jArr5 = jArr[i19];
            if (jArr5.length <= i10) {
                i12 = length;
            } else {
                int length2 = jArr5.length;
                double[] dArr = new double[length2];
                int i20 = i13;
                while (true) {
                    long[] jArr6 = jArr[i19];
                    double d11 = 0.0d;
                    if (i20 >= jArr6.length) {
                        break;
                    }
                    int i21 = length;
                    long j11 = jArr6[i20];
                    if (j11 != -1) {
                        d11 = Math.log(j11);
                    }
                    dArr[i20] = d11;
                    i20++;
                    length = i21;
                }
                i12 = length;
                int i22 = length2 - 1;
                double d12 = dArr[i22] - dArr[0];
                int i23 = 0;
                while (i23 < i22) {
                    double d13 = dArr[i23];
                    i23++;
                    double d14 = (d13 + dArr[i23]) * 0.5d;
                    if (d12 == 0.0d) {
                        d10 = 1.0d;
                    } else {
                        d10 = (d14 - dArr[0]) / d12;
                    }
                    x02.f(Double.valueOf(d10), Integer.valueOf(i19));
                }
            }
            i19++;
            length = i12;
            i13 = 0;
            i10 = 1;
        }
        r6.s sVar = x02.f9536b;
        if (sVar == null) {
            i11 = 0;
            sVar = new r6.s(x02, 0);
            x02.f9536b = sVar;
        } else {
            i11 = 0;
        }
        o0 j12 = o0.j(sVar);
        for (int i24 = i11; i24 < j12.size(); i24++) {
            int intValue = ((Integer) j12.get(i24)).intValue();
            int i25 = iArr2[intValue] + 1;
            iArr2[intValue] = i25;
            jArr3[intValue] = jArr[intValue][i25];
            w(arrayList, jArr3);
        }
        for (int i26 = i11; i26 < qVarArr.length; i26++) {
            if (arrayList.get(i26) != null) {
                jArr3[i26] = jArr3[i26] * 2;
            }
        }
        w(arrayList, jArr3);
        l0 i27 = o0.i();
        for (int i28 = i11; i28 < arrayList.size(); i28++) {
            l0 l0Var = (l0) arrayList.get(i28);
            if (l0Var == null) {
                C0 = o0.m();
            } else {
                C0 = l0Var.C0();
            }
            i27.y0(C0);
        }
        return i27.C0();
    }

    public static void w(ArrayList arrayList, long[] jArr) {
        long j4 = 0;
        for (long j10 : jArr) {
            j4 += j10;
        }
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            l0 l0Var = (l0) arrayList.get(i10);
            if (l0Var != null) {
                l0Var.x0(new a(j4, jArr[i10]));
            }
        }
    }

    public static long y(List list) {
        if (list.isEmpty()) {
            return -9223372036854775807L;
        }
        w1.n nVar = (w1.n) h0.X(list);
        long j4 = nVar.f10772x;
        if (j4 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        long j10 = nVar.f10773y;
        if (j10 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return j10 - j4;
    }

    @Override // y1.c, y1.s
    public final void e() {
        this.f11478t = -9223372036854775807L;
        this.f11479u = null;
    }

    @Override // y1.c, y1.s
    public final int g(long j4, List list) {
        boolean z9;
        w1.n nVar;
        int i10;
        int i11;
        ((f1.v) this.f11474p).getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j10 = this.f11478t;
        if (j10 != -9223372036854775807L && elapsedRealtime - j10 < 1000 && (list.isEmpty() || ((w1.n) h0.X(list)).equals(this.f11479u))) {
            z9 = false;
        } else {
            z9 = true;
        }
        if (!z9) {
            return list.size();
        }
        this.f11478t = elapsedRealtime;
        if (list.isEmpty()) {
            nVar = null;
        } else {
            nVar = (w1.n) h0.X(list);
        }
        this.f11479u = nVar;
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        long A = b0.A(((w1.n) list.get(size - 1)).f10772x - j4, this.f11475q);
        long j11 = this.f11469j;
        if (A < j11) {
            return size;
        }
        y(list);
        c1.v vVar = this.f11483d[x(elapsedRealtime)];
        for (int i12 = 0; i12 < size; i12++) {
            w1.n nVar2 = (w1.n) list.get(i12);
            c1.v vVar2 = nVar2.f10769d;
            if (b0.A(nVar2.f10772x - j4, this.f11475q) >= j11 && vVar2.f1931i < vVar.f1931i && (i10 = vVar2.f1940s) != -1 && i10 <= this.f11471l && (i11 = vVar2.f1939r) != -1 && i11 <= this.f11470k && i10 < vVar.f1940s) {
                return i12;
            }
        }
        return size;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0049  */
    @Override // y1.s
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void h(long r14, long r16, long r18, java.util.List r20, w1.p[] r21) {
        /*
            r13 = this;
            r0 = r13
            r1 = r21
            f1.a r2 = r0.f11474p
            f1.v r2 = (f1.v) r2
            r2.getClass()
            long r2 = android.os.SystemClock.elapsedRealtime()
            int r4 = r0.f11476r
            int r5 = r1.length
            if (r4 >= r5) goto L28
            r4 = r1[r4]
            boolean r4 = r4.next()
            if (r4 == 0) goto L28
            int r4 = r0.f11476r
            r1 = r1[r4]
            long r4 = r1.a()
            long r6 = r1.k()
            goto L3c
        L28:
            int r4 = r1.length
            r5 = 0
        L2a:
            if (r5 >= r4) goto L41
            r6 = r1[r5]
            boolean r7 = r6.next()
            if (r7 == 0) goto L3e
            long r4 = r6.a()
            long r6 = r6.k()
        L3c:
            long r4 = r4 - r6
            goto L45
        L3e:
            int r5 = r5 + 1
            goto L2a
        L41:
            long r4 = y(r20)
        L45:
            int r1 = r0.f11477s
            if (r1 != 0) goto L53
            r1 = 1
            r0.f11477s = r1
            int r1 = r13.x(r2)
            r0.f11476r = r1
            return
        L53:
            int r6 = r0.f11476r
            boolean r7 = r20.isEmpty()
            r8 = -1
            if (r7 == 0) goto L5e
            r7 = r8
            goto L6a
        L5e:
            java.lang.Object r7 = r6.h0.X(r20)
            w1.n r7 = (w1.n) r7
            c1.v r7 = r7.f10769d
            int r7 = r13.d(r7)
        L6a:
            if (r7 == r8) goto L75
            java.lang.Object r1 = r6.h0.X(r20)
            w1.n r1 = (w1.n) r1
            int r1 = r1.f10770e
            r6 = r7
        L75:
            int r7 = r13.x(r2)
            if (r7 == r6) goto Lb9
            boolean r2 = r13.b(r6, r2)
            if (r2 != 0) goto Lb9
            c1.v[] r2 = r0.f11483d
            r3 = r2[r6]
            r2 = r2[r7]
            r8 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r10 = (r18 > r8 ? 1 : (r18 == r8 ? 0 : -1))
            long r11 = r0.f11467h
            if (r10 != 0) goto L93
            goto La5
        L93:
            int r8 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r8 == 0) goto L9a
            long r4 = r18 - r4
            goto L9c
        L9a:
            r4 = r18
        L9c:
            float r4 = (float) r4
            float r5 = r0.f11473n
            float r4 = r4 * r5
            long r4 = (long) r4
            long r11 = java.lang.Math.min(r4, r11)
        La5:
            int r2 = r2.f1931i
            int r3 = r3.f1931i
            if (r2 <= r3) goto Lb0
            int r4 = (r16 > r11 ? 1 : (r16 == r11 ? 0 : -1))
            if (r4 >= 0) goto Lb0
            goto Lb8
        Lb0:
            if (r2 >= r3) goto Lb9
            long r2 = r0.f11468i
            int r2 = (r16 > r2 ? 1 : (r16 == r2 ? 0 : -1))
            if (r2 < 0) goto Lb9
        Lb8:
            r7 = r6
        Lb9:
            if (r7 != r6) goto Lbc
            goto Lbd
        Lbc:
            r1 = 3
        Lbd:
            r0.f11477s = r1
            r0.f11476r = r7
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: y1.b.h(long, long, long, java.util.List, w1.p[]):void");
    }

    @Override // y1.c, y1.s
    public final void i() {
        this.f11479u = null;
    }

    @Override // y1.s
    public final int m() {
        return this.f11477s;
    }

    @Override // y1.s
    public final int n() {
        return this.f11476r;
    }

    @Override // y1.c, y1.s
    public final void p(float f10) {
        this.f11475q = f10;
    }

    @Override // y1.s
    public final Object q() {
        return null;
    }

    public final int x(long j4) {
        long j10;
        boolean z9;
        z1.g gVar = (z1.g) this.f11466g;
        synchronized (gVar) {
            j10 = gVar.f11921k;
        }
        long j11 = ((float) j10) * this.f11472m;
        this.f11466g.getClass();
        long j12 = ((float) j11) / this.f11475q;
        if (!this.o.isEmpty()) {
            int i10 = 1;
            while (i10 < this.o.size() - 1 && ((a) this.o.get(i10)).f11464a < j12) {
                i10++;
            }
            a aVar = (a) this.o.get(i10 - 1);
            a aVar2 = (a) this.o.get(i10);
            long j13 = aVar.f11464a;
            float f10 = ((float) (j12 - j13)) / ((float) (aVar2.f11464a - j13));
            j12 = (f10 * ((float) (aVar2.f11465b - r4))) + aVar.f11465b;
        }
        int i11 = 0;
        for (int i12 = 0; i12 < this.f11481b; i12++) {
            if (j4 == Long.MIN_VALUE || !b(i12, j4)) {
                if (c(i12).f1931i <= j12) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                if (z9) {
                    return i12;
                }
                i11 = i12;
            }
        }
        return i11;
    }
}
