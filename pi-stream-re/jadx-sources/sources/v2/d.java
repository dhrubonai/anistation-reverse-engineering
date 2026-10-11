package v2;

import c1.o0;
import c1.p0;
import d2.g0;
import d2.o;
import d2.p;
import d2.q;
import d2.r;
import d2.x;
import d2.y;
import f1.b0;
import f1.t;
import j1.l;
import java.io.EOFException;

/* loaded from: classes.dex */
public final class d implements p {

    /* renamed from: u, reason: collision with root package name */
    public static final l f10599u = new l(24);

    /* renamed from: a, reason: collision with root package name */
    public final int f10600a;

    /* renamed from: b, reason: collision with root package name */
    public final long f10601b;

    /* renamed from: c, reason: collision with root package name */
    public final t f10602c;

    /* renamed from: d, reason: collision with root package name */
    public final d2.b f10603d;

    /* renamed from: e, reason: collision with root package name */
    public final x f10604e;

    /* renamed from: f, reason: collision with root package name */
    public final y f10605f;

    /* renamed from: g, reason: collision with root package name */
    public final o f10606g;

    /* renamed from: h, reason: collision with root package name */
    public r f10607h;

    /* renamed from: i, reason: collision with root package name */
    public g0 f10608i;

    /* renamed from: j, reason: collision with root package name */
    public g0 f10609j;

    /* renamed from: k, reason: collision with root package name */
    public int f10610k;

    /* renamed from: l, reason: collision with root package name */
    public p0 f10611l;

    /* renamed from: m, reason: collision with root package name */
    public long f10612m;

    /* renamed from: n, reason: collision with root package name */
    public long f10613n;
    public long o;

    /* renamed from: p, reason: collision with root package name */
    public int f10614p;

    /* renamed from: q, reason: collision with root package name */
    public f f10615q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f10616r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f10617s;

    /* renamed from: t, reason: collision with root package name */
    public long f10618t;

    public d(int i10) {
        this(-9223372036854775807L);
    }

    public static long d(p0 p0Var) {
        if (p0Var != null) {
            int g10 = p0Var.g();
            for (int i10 = 0; i10 < g10; i10++) {
                o0 f10 = p0Var.f(i10);
                if (f10 instanceof q2.o) {
                    q2.o oVar = (q2.o) f10;
                    if (oVar.f9106a.equals("TLEN")) {
                        return b0.O(Long.parseLong((String) oVar.f9118c.get(0)));
                    }
                }
            }
            return -9223372036854775807L;
        }
        return -9223372036854775807L;
    }

    @Override // d2.p
    public final void a() {
    }

    public final a b(q qVar, long j4, boolean z9) {
        t tVar = this.f10602c;
        qVar.n(tVar.f3858a, 0, 4);
        tVar.G(0);
        this.f10603d.a(tVar.f());
        if (qVar.c() != -1) {
            j4 = qVar.c();
        }
        return new a(j4, qVar.q(), this.f10603d, z9);
    }

    @Override // d2.p
    public final p c() {
        return this;
    }

    @Override // d2.p
    public final void e(long j4, long j10) {
        this.f10610k = 0;
        this.f10612m = -9223372036854775807L;
        this.f10613n = 0L;
        this.f10614p = 0;
        this.f10618t = j10;
        f fVar = this.f10615q;
        if ((fVar instanceof b) && !((b) fVar).a(j10)) {
            this.f10617s = true;
            this.f10609j = this.f10606g;
        }
    }

    @Override // d2.p
    public final void f(r rVar) {
        this.f10607h = rVar;
        g0 i10 = rVar.i(0, 1);
        this.f10608i = i10;
        this.f10609j = i10;
        this.f10607h.b();
    }

    public final boolean g(q qVar) {
        f fVar = this.f10615q;
        if (fVar != null) {
            long d10 = fVar.d();
            if (d10 != -1 && qVar.l() > d10 - 4) {
                return true;
            }
        }
        try {
            return !qVar.k(this.f10602c.f3858a, 0, 4, true);
        } catch (EOFException unused) {
            return true;
        }
    }

    @Override // d2.p
    public final boolean h(q qVar) {
        return j(qVar, true);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0060, code lost:
    
        if (r11 != 1231971951) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x01dc A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0264  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x027e  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x02e5  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0364  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0375  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x049d  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0366  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x02eb  */
    @Override // d2.p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int i(d2.q r49, d2.t r50) {
        /*
            Method dump skipped, instructions count: 1221
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: v2.d.i(d2.q, d2.t):int");
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x00ab, code lost:
    
        if (r19 == false) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00ad, code lost:
    
        r18.h(r3 + r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00b5, code lost:
    
        r17.f10610k = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00b7, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00b2, code lost:
    
        r18.g();
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0081 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean j(d2.q r18, boolean r19) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            if (r19 == 0) goto La
            r2 = 32768(0x8000, float:4.5918E-41)
            goto Lc
        La:
            r2 = 131072(0x20000, float:1.83671E-40)
        Lc:
            r18.g()
            long r3 = r18.q()
            r5 = 0
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            r4 = 0
            r5 = 1
            r6 = 0
            if (r3 != 0) goto L45
            int r3 = r0.f10600a
            r3 = r3 & 8
            if (r3 != 0) goto L24
            r3 = r5
            goto L25
        L24:
            r3 = r4
        L25:
            if (r3 == 0) goto L29
            r3 = r6
            goto L2b
        L29:
            j1.l r3 = v2.d.f10599u
        L2b:
            d2.y r7 = r0.f10605f
            c1.p0 r3 = r7.a(r1, r3)
            r0.f10611l = r3
            if (r3 == 0) goto L3a
            d2.x r7 = r0.f10604e
            r7.b(r3)
        L3a:
            long r7 = r18.l()
            int r3 = (int) r7
            if (r19 != 0) goto L46
            r1.h(r3)
            goto L46
        L45:
            r3 = r4
        L46:
            r7 = r4
            r8 = r7
            r9 = r8
        L49:
            boolean r10 = r17.g(r18)
            if (r10 == 0) goto L58
            if (r8 <= 0) goto L52
            goto Lab
        L52:
            java.io.EOFException r1 = new java.io.EOFException
            r1.<init>()
            throw r1
        L58:
            f1.t r10 = r0.f10602c
            r10.G(r4)
            int r10 = r10.f()
            if (r7 == 0) goto L76
            long r11 = (long) r7
            r13 = -128000(0xfffffffffffe0c00, float:NaN)
            r13 = r13 & r10
            long r13 = (long) r13
            r15 = -128000(0xfffffffffffe0c00, double:NaN)
            long r11 = r11 & r15
            int r11 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r11 != 0) goto L73
            r11 = r5
            goto L74
        L73:
            r11 = r4
        L74:
            if (r11 == 0) goto L7d
        L76:
            int r11 = p7.a0.y(r10)
            r12 = -1
            if (r11 != r12) goto L9d
        L7d:
            int r7 = r9 + 1
            if (r9 != r2) goto L8b
            if (r19 == 0) goto L84
            return r4
        L84:
            java.lang.String r1 = "Searched too many bytes."
            c1.r0 r1 = c1.r0.a(r1, r6)
            throw r1
        L8b:
            if (r19 == 0) goto L96
            r18.g()
            int r8 = r3 + r7
            r1.o(r8)
            goto L99
        L96:
            r1.h(r5)
        L99:
            r8 = r4
            r9 = r7
            r7 = r8
            goto L49
        L9d:
            int r8 = r8 + 1
            if (r8 != r5) goto La8
            d2.b r7 = r0.f10603d
            r7.a(r10)
            r7 = r10
            goto Lb8
        La8:
            r10 = 4
            if (r8 != r10) goto Lb8
        Lab:
            if (r19 == 0) goto Lb2
            int r3 = r3 + r9
            r1.h(r3)
            goto Lb5
        Lb2:
            r18.g()
        Lb5:
            r0.f10610k = r7
            return r5
        Lb8:
            int r11 = r11 + (-4)
            r1.o(r11)
            goto L49
        */
        throw new UnsupportedOperationException("Method not decompiled: v2.d.j(d2.q, boolean):boolean");
    }

    public d(long j4) {
        this.f10600a = 0;
        this.f10601b = j4;
        this.f10602c = new t(10);
        this.f10603d = new d2.b();
        this.f10604e = new x();
        this.f10612m = -9223372036854775807L;
        this.f10605f = new y(0);
        o oVar = new o();
        this.f10606g = oVar;
        this.f10609j = oVar;
    }
}
