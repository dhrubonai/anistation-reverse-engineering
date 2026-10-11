package b2;

import android.content.Context;
import android.os.SystemClock;
import android.util.Pair;
import android.view.Surface;
import c1.p1;
import f.m0;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class d implements i0, z {
    public static final k.a o = new k.a(2);

    /* renamed from: a, reason: collision with root package name */
    public final Context f1311a;

    /* renamed from: b, reason: collision with root package name */
    public final b f1312b;

    /* renamed from: c, reason: collision with root package name */
    public f1.a f1313c;

    /* renamed from: d, reason: collision with root package name */
    public r f1314d;

    /* renamed from: e, reason: collision with root package name */
    public a0 f1315e;

    /* renamed from: f, reason: collision with root package name */
    public c1.v f1316f;

    /* renamed from: g, reason: collision with root package name */
    public p f1317g;

    /* renamed from: h, reason: collision with root package name */
    public f1.x f1318h;

    /* renamed from: i, reason: collision with root package name */
    public List f1319i;

    /* renamed from: j, reason: collision with root package name */
    public Pair f1320j;

    /* renamed from: k, reason: collision with root package name */
    public g0 f1321k;

    /* renamed from: l, reason: collision with root package name */
    public Executor f1322l;

    /* renamed from: m, reason: collision with root package name */
    public int f1323m;

    /* renamed from: n, reason: collision with root package name */
    public int f1324n;

    public d(o1.d0 d0Var) {
        this.f1311a = (Context) d0Var.f8138b;
        b bVar = (b) d0Var.f8140d;
        w7.b.w(bVar);
        this.f1312b = bVar;
        this.f1313c = f1.a.f3794a;
        this.f1321k = g0.f1343h;
        this.f1322l = o;
        this.f1324n = 0;
    }

    public static boolean a(d dVar, long j4) {
        boolean z9;
        if (dVar.f1323m != 0) {
            return false;
        }
        a0 a0Var = dVar.f1315e;
        w7.b.w(a0Var);
        long j10 = a0Var.f1298j;
        if (j10 != -9223372036854775807L && j10 >= j4) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (!z9) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x003e, code lost:
    
        if (r1 != false) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(c1.v r8) {
        /*
            r7 = this;
            int r0 = r7.f1324n
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L8
            r0 = r2
            goto L9
        L8:
            r0 = r1
        L9:
            w7.b.u(r0)
            java.util.List r0 = r7.f1319i
            w7.b.w(r0)
            b2.a0 r0 = r7.f1315e
            if (r0 == 0) goto L1b
            b2.r r0 = r7.f1314d
            if (r0 == 0) goto L1b
            r0 = r2
            goto L1c
        L1b:
            r0 = r1
        L1c:
            w7.b.u(r0)
            f1.a r0 = r7.f1313c
            android.os.Looper r3 = android.os.Looper.myLooper()
            w7.b.w(r3)
            f1.v r0 = (f1.v) r0
            r4 = 0
            f1.x r0 = r0.a(r3, r4)
            r7.f1318h = r0
            r0 = 7
            c1.k r3 = r8.f1946y
            if (r3 == 0) goto L41
            int r5 = r3.f1763c
            if (r5 == r0) goto L3d
            r6 = 6
            if (r5 != r6) goto L3e
        L3d:
            r1 = r2
        L3e:
            if (r1 == 0) goto L41
            goto L43
        L41:
            c1.k r3 = c1.k.f1760h
        L43:
            int r1 = r3.f1763c
            if (r1 != r0) goto L49
            c1.k r0 = new c1.k
        L49:
            b2.b r0 = r7.f1312b     // Catch: c1.n1 -> L69
            f1.x r1 = r7.f1318h     // Catch: c1.n1 -> L69
            java.util.Objects.requireNonNull(r1)     // Catch: c1.n1 -> L69
            r6.n1 r1 = r6.n1.f9497e     // Catch: c1.n1 -> L69
            r0.a()     // Catch: c1.n1 -> L69
            android.util.Pair r0 = r7.f1320j     // Catch: c1.n1 -> L69
            if (r0 == 0) goto L63
            java.lang.Object r1 = r0.first     // Catch: c1.n1 -> L69
            android.view.Surface r1 = (android.view.Surface) r1     // Catch: c1.n1 -> L69
            java.lang.Object r0 = r0.second     // Catch: c1.n1 -> L69
            f1.u r0 = (f1.u) r0     // Catch: c1.n1 -> L69
            int r0 = r0.f3862a     // Catch: c1.n1 -> L69
        L63:
            android.content.Context r0 = r7.f1311a     // Catch: c1.n1 -> L69
            f1.b0.L(r0)     // Catch: c1.n1 -> L69
            throw r4     // Catch: c1.n1 -> L69
        L69:
            r0 = move-exception
            b2.h0 r1 = new b2.h0
            r1.<init>(r0, r8)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: b2.d.b(c1.v):void");
    }

    public final boolean c() {
        if (this.f1324n == 1) {
            return true;
        }
        return false;
    }

    public final void d(long j4, long j10) {
        boolean z9;
        boolean z10;
        boolean z11;
        boolean z12;
        c1.v vVar;
        if (this.f1323m == 0) {
            a0 a0Var = this.f1315e;
            w7.b.w(a0Var);
            f1.p pVar = a0Var.f1294f;
            int i10 = pVar.f3841c;
            boolean z13 = true;
            if (i10 == 0) {
                z9 = true;
            } else {
                z9 = false;
            }
            if (!z9) {
                if (i10 != 0) {
                    long j11 = ((long[]) pVar.f3843e)[pVar.f3839a];
                    Long l10 = (Long) a0Var.f1293e.f(j11);
                    if (l10 != null && l10.longValue() != a0Var.f1297i) {
                        a0Var.f1297i = l10.longValue();
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    r rVar = a0Var.f1290b;
                    if (z10) {
                        rVar.d(2);
                    }
                    int a10 = a0Var.f1290b.a(j11, j4, j10, a0Var.f1297i, false, a0Var.f1291c);
                    z zVar = a0Var.f1289a;
                    if (a10 != 0 && a10 != 1) {
                        if (a10 != 2 && a10 != 3 && a10 != 4) {
                            if (a10 != 5) {
                                throw new IllegalStateException(String.valueOf(a10));
                            }
                            return;
                        }
                        a0Var.f1298j = j11;
                        w7.b.w(Long.valueOf(pVar.d()));
                        d dVar = (d) zVar;
                        dVar.f1322l.execute(new m0(12, dVar, dVar.f1321k));
                        w7.b.w(null);
                        throw null;
                    }
                    a0Var.f1298j = j11;
                    if (a10 == 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    Long valueOf = Long.valueOf(pVar.d());
                    w7.b.w(valueOf);
                    long longValue = valueOf.longValue();
                    p1 p1Var = (p1) a0Var.f1292d.f(longValue);
                    if (p1Var != null && !p1Var.equals(p1.f1878e) && !p1Var.equals(a0Var.f1296h)) {
                        a0Var.f1296h = p1Var;
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (z12) {
                        p1 p1Var2 = a0Var.f1296h;
                        d dVar2 = (d) zVar;
                        dVar2.getClass();
                        c1.u uVar = new c1.u();
                        uVar.f1912q = p1Var2.f1879a;
                        uVar.f1913r = p1Var2.f1880b;
                        uVar.e("video/raw");
                        dVar2.f1316f = new c1.v(uVar);
                        dVar2.getClass();
                        w7.b.w(null);
                        dVar2.f1322l.execute(new q0.o(dVar2.f1321k, null, p1Var2, 6));
                    }
                    if (!z11) {
                        long j12 = a0Var.f1291c.f8965b;
                    }
                    long j13 = a0Var.f1297i;
                    if (rVar.f1390e == 3) {
                        z13 = false;
                    }
                    rVar.f1390e = 3;
                    ((f1.v) rVar.f1396k).getClass();
                    rVar.f1392g = f1.b0.O(SystemClock.elapsedRealtime());
                    d dVar3 = (d) zVar;
                    if (z13 && dVar3.f1322l != o) {
                        dVar3.getClass();
                        w7.b.w(null);
                        dVar3.f1322l.execute(new m0(11, dVar3.f1321k, null));
                    }
                    if (dVar3.f1317g != null) {
                        c1.v vVar2 = dVar3.f1316f;
                        if (vVar2 == null) {
                            vVar = new c1.v(new c1.u());
                        } else {
                            vVar = vVar2;
                        }
                        ((f1.v) dVar3.f1313c).getClass();
                        dVar3.f1317g.j(longValue - j13, System.nanoTime(), vVar, null);
                    }
                    w7.b.w(null);
                    throw null;
                }
                throw new NoSuchElementException();
            }
        }
    }

    public final void e(Surface surface, f1.u uVar) {
        Pair pair = this.f1320j;
        if (pair != null && ((Surface) pair.first).equals(surface) && ((f1.u) this.f1320j.second).equals(uVar)) {
            return;
        }
        this.f1320j = Pair.create(surface, uVar);
        int i10 = uVar.f3862a;
    }

    public final void f(long j4) {
        w7.b.w(null);
        throw null;
    }
}
