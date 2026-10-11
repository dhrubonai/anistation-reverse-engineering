package j1;

import android.util.Pair;

/* loaded from: classes.dex */
public final class r0 {

    /* renamed from: a, reason: collision with root package name */
    public final c1.c1 f5885a = new c1.c1();

    /* renamed from: b, reason: collision with root package name */
    public final c1.d1 f5886b = new c1.d1();

    /* renamed from: c, reason: collision with root package name */
    public final k1.a f5887c;

    /* renamed from: d, reason: collision with root package name */
    public final f1.i f5888d;

    /* renamed from: e, reason: collision with root package name */
    public final w.f f5889e;

    /* renamed from: f, reason: collision with root package name */
    public long f5890f;

    /* renamed from: g, reason: collision with root package name */
    public int f5891g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f5892h;

    /* renamed from: i, reason: collision with root package name */
    public p0 f5893i;

    /* renamed from: j, reason: collision with root package name */
    public p0 f5894j;

    /* renamed from: k, reason: collision with root package name */
    public p0 f5895k;

    /* renamed from: l, reason: collision with root package name */
    public int f5896l;

    /* renamed from: m, reason: collision with root package name */
    public Object f5897m;

    /* renamed from: n, reason: collision with root package name */
    public long f5898n;

    public r0(k1.a aVar, f1.x xVar, w.f fVar) {
        this.f5887c = aVar;
        this.f5888d = xVar;
        this.f5889e = fVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0066, code lost:
    
        if (r24.f1644d <= r11) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static v1.w m(c1.e1 r17, java.lang.Object r18, long r19, long r21, c1.d1 r23, c1.c1 r24) {
        /*
            r0 = r17
            r1 = r19
            r3 = r23
            r4 = r18
            r5 = r24
            r0.h(r4, r5)
            int r6 = r5.f1643c
            r0.n(r6, r3)
            int r6 = r17.b(r18)
            r16 = r6
            r6 = r4
            r4 = r16
        L1b:
            c1.b r7 = r5.f1647g
            int r7 = r7.f1628a
            r8 = -1
            r9 = 1
            r10 = 0
            if (r7 == 0) goto L69
            if (r7 != r9) goto L2c
            boolean r11 = r5.h(r10)
            if (r11 != 0) goto L69
        L2c:
            c1.b r11 = r5.f1647g
            r11.getClass()
            boolean r11 = r5.i(r10)
            if (r11 == 0) goto L69
            r11 = 0
            int r13 = r5.c(r11)
            if (r13 == r8) goto L40
            goto L69
        L40:
            long r13 = r5.f1644d
            int r13 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r13 != 0) goto L47
            goto L68
        L47:
            int r13 = r7 + (-1)
            boolean r13 = r5.h(r13)
            if (r13 == 0) goto L51
            r13 = 2
            goto L52
        L51:
            r13 = r9
        L52:
            int r7 = r7 - r13
            r13 = r10
        L54:
            if (r13 > r7) goto L62
            c1.b r14 = r5.f1647g
            c1.a r14 = r14.a(r13)
            long r14 = r14.f1621h
            long r11 = r11 + r14
            int r13 = r13 + 1
            goto L54
        L62:
            long r13 = r5.f1644d
            int r7 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r7 > 0) goto L69
        L68:
            r10 = r9
        L69:
            if (r10 == 0) goto L7a
            int r7 = r3.f1669p
            if (r4 > r7) goto L7a
            r0.g(r4, r5, r9)
            java.lang.Object r6 = r5.f1642b
            r6.getClass()
            int r4 = r4 + 1
            goto L1b
        L7a:
            r0.h(r6, r5)
            int r3 = r5.c(r1)
            if (r3 != r8) goto L8f
            int r0 = r5.b(r1)
            v1.w r1 = new v1.w
            r7 = r21
            r1.<init>(r6, r0, r7)
            return r1
        L8f:
            r7 = r21
            int r2 = r5.f(r3)
            v1.w r9 = new v1.w
            r0 = r9
            r1 = r3
            r3 = r21
            r5 = r6
            r0.<init>(r1, r2, r3, r5)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: j1.r0.m(c1.e1, java.lang.Object, long, long, c1.d1, c1.c1):v1.w");
    }

    public final p0 a() {
        p0 p0Var = this.f5893i;
        if (p0Var == null) {
            return null;
        }
        if (p0Var == this.f5894j) {
            this.f5894j = p0Var.f5868l;
        }
        p0Var.g();
        int i10 = this.f5896l - 1;
        this.f5896l = i10;
        if (i10 == 0) {
            this.f5895k = null;
            p0 p0Var2 = this.f5893i;
            this.f5897m = p0Var2.f5858b;
            this.f5898n = p0Var2.f5862f.f5874a.f10562d;
        }
        this.f5893i = this.f5893i.f5868l;
        k();
        return this.f5893i;
    }

    public final void b() {
        if (this.f5896l == 0) {
            return;
        }
        p0 p0Var = this.f5893i;
        w7.b.w(p0Var);
        this.f5897m = p0Var.f5858b;
        this.f5898n = p0Var.f5862f.f5874a.f10562d;
        while (p0Var != null) {
            p0Var.g();
            p0Var = p0Var.f5868l;
        }
        this.f5893i = null;
        this.f5895k = null;
        this.f5894j = null;
        this.f5896l = 0;
        k();
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x00e0, code lost:
    
        if (r5 != false) goto L38;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final j1.q0 c(c1.e1 r26, j1.p0 r27, long r28) {
        /*
            Method dump skipped, instructions count: 241
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: j1.r0.c(c1.e1, j1.p0, long):j1.q0");
    }

    public final q0 d(c1.e1 e1Var, p0 p0Var, long j4) {
        boolean z9;
        long j10;
        long j11;
        q0 q0Var = p0Var.f5862f;
        long j12 = (p0Var.o + q0Var.f5878e) - j4;
        if (q0Var.f5880g) {
            return c(e1Var, p0Var, j12);
        }
        v1.w wVar = q0Var.f5874a;
        Object obj = wVar.f10559a;
        c1.c1 c1Var = this.f5885a;
        e1Var.h(obj, c1Var);
        boolean b10 = wVar.b();
        Object obj2 = wVar.f10559a;
        if (b10) {
            int i10 = wVar.f10560b;
            int i11 = c1Var.f1647g.a(i10).f1615b;
            if (i11 != -1) {
                int a10 = c1Var.f1647g.a(i10).a(wVar.f10561c);
                if (a10 < i11) {
                    return f(e1Var, wVar.f10559a, i10, a10, q0Var.f5876c, wVar.f10562d);
                }
                long j13 = q0Var.f5876c;
                if (j13 == -9223372036854775807L) {
                    Pair k10 = e1Var.k(this.f5886b, c1Var, c1Var.f1643c, -9223372036854775807L, Math.max(0L, j12));
                    if (k10 != null) {
                        j13 = ((Long) k10.second).longValue();
                    }
                }
                e1Var.h(obj2, c1Var);
                int i12 = wVar.f10560b;
                long d10 = c1Var.d(i12);
                if (d10 == Long.MIN_VALUE) {
                    j11 = c1Var.f1644d;
                } else {
                    j11 = c1Var.f1647g.a(i12).f1621h + d10;
                }
                return g(e1Var, wVar.f10559a, Math.max(j11, j13), q0Var.f5876c, wVar.f10562d);
            }
            return null;
        }
        int i13 = wVar.f10563e;
        if (i13 != -1 && c1Var.h(i13)) {
            return c(e1Var, p0Var, j12);
        }
        int f10 = c1Var.f(i13);
        if (c1Var.i(i13) && c1Var.e(i13, f10) == 3) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (f10 != c1Var.f1647g.a(i13).f1615b && !z9) {
            return f(e1Var, wVar.f10559a, wVar.f10563e, f10, q0Var.f5878e, wVar.f10562d);
        }
        e1Var.h(obj2, c1Var);
        long d11 = c1Var.d(i13);
        if (d11 == Long.MIN_VALUE) {
            j10 = c1Var.f1644d;
        } else {
            j10 = c1Var.f1647g.a(i13).f1621h + d11;
        }
        return g(e1Var, wVar.f10559a, j10, q0Var.f5878e, wVar.f10562d);
    }

    public final q0 e(c1.e1 e1Var, v1.w wVar, long j4, long j10) {
        e1Var.h(wVar.f10559a, this.f5885a);
        if (wVar.b()) {
            return f(e1Var, wVar.f10559a, wVar.f10560b, wVar.f10561c, j4, wVar.f10562d);
        }
        return g(e1Var, wVar.f10559a, j10, j4, wVar.f10562d);
    }

    public final q0 f(c1.e1 e1Var, Object obj, int i10, int i11, long j4, long j10) {
        long j11;
        v1.w wVar = new v1.w(i10, i11, j10, obj);
        c1.c1 c1Var = this.f5885a;
        long a10 = e1Var.h(obj, c1Var).a(i10, i11);
        if (i11 == c1Var.f(i10)) {
            c1Var.f1647g.getClass();
        }
        boolean i12 = c1Var.i(i10);
        if (a10 != -9223372036854775807L && 0 >= a10) {
            j11 = Math.max(0L, a10 - 1);
        } else {
            j11 = 0;
        }
        return new q0(wVar, j11, j4, -9223372036854775807L, a10, i12, false, false, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:68:0x005f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final j1.q0 g(c1.e1 r27, java.lang.Object r28, long r29, long r31, long r33) {
        /*
            Method dump skipped, instructions count: 216
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: j1.r0.g(c1.e1, java.lang.Object, long, long, long):j1.q0");
    }

    public final q0 h(c1.e1 e1Var, q0 q0Var) {
        boolean z9;
        long j4;
        long j10;
        boolean z10;
        v1.w wVar = q0Var.f5874a;
        if (!wVar.b() && wVar.f10563e == -1) {
            z9 = true;
        } else {
            z9 = false;
        }
        boolean j11 = j(e1Var, wVar);
        boolean i10 = i(e1Var, wVar, z9);
        Object obj = q0Var.f5874a.f10559a;
        c1.c1 c1Var = this.f5885a;
        e1Var.h(obj, c1Var);
        boolean b10 = wVar.b();
        int i11 = wVar.f10563e;
        if (!b10 && i11 != -1) {
            j4 = c1Var.d(i11);
        } else {
            j4 = -9223372036854775807L;
        }
        boolean b11 = wVar.b();
        int i12 = wVar.f10560b;
        if (b11) {
            j10 = c1Var.a(i12, wVar.f10561c);
        } else if (j4 != -9223372036854775807L && j4 != Long.MIN_VALUE) {
            j10 = j4;
        } else {
            j10 = c1Var.f1644d;
        }
        if (wVar.b()) {
            z10 = c1Var.i(i12);
        } else if (i11 != -1 && c1Var.i(i11)) {
            z10 = true;
        } else {
            z10 = false;
        }
        return new q0(wVar, q0Var.f5875b, q0Var.f5876c, j4, j10, z10, z9, j11, i10);
    }

    public final boolean i(c1.e1 e1Var, v1.w wVar, boolean z9) {
        boolean z10;
        int b10 = e1Var.b(wVar.f10559a);
        if (e1Var.n(e1Var.g(b10, this.f5885a, false).f1643c, this.f5886b).f1663i) {
            return false;
        }
        if (e1Var.d(b10, this.f5885a, this.f5886b, this.f5891g, this.f5892h) == -1) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10 || !z9) {
            return false;
        }
        return true;
    }

    public final boolean j(c1.e1 e1Var, v1.w wVar) {
        boolean z9;
        if (!wVar.b() && wVar.f10563e == -1) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (!z9) {
            return false;
        }
        Object obj = wVar.f10559a;
        if (e1Var.n(e1Var.h(obj, this.f5885a).f1643c, this.f5886b).f1669p == e1Var.b(obj)) {
            return true;
        }
        return false;
    }

    public final void k() {
        v1.w wVar;
        r6.m0 m0Var = r6.o0.f9505b;
        r6.l0 l0Var = new r6.l0();
        for (p0 p0Var = this.f5893i; p0Var != null; p0Var = p0Var.f5868l) {
            l0Var.x0(p0Var.f5862f.f5874a);
        }
        p0 p0Var2 = this.f5894j;
        if (p0Var2 == null) {
            wVar = null;
        } else {
            wVar = p0Var2.f5862f.f5874a;
        }
        ((f1.x) this.f5888d).c(new q0.o(this, l0Var, wVar, 1));
    }

    public final boolean l(p0 p0Var) {
        w7.b.w(p0Var);
        boolean z9 = false;
        if (p0Var.equals(this.f5895k)) {
            return false;
        }
        this.f5895k = p0Var;
        while (true) {
            p0Var = p0Var.f5868l;
            if (p0Var == null) {
                break;
            }
            if (p0Var == this.f5894j) {
                this.f5894j = this.f5893i;
                z9 = true;
            }
            p0Var.g();
            this.f5896l--;
        }
        p0 p0Var2 = this.f5895k;
        p0Var2.getClass();
        if (p0Var2.f5868l != null) {
            p0Var2.b();
            p0Var2.f5868l = null;
            p0Var2.c();
        }
        k();
        return z9;
    }

    public final v1.w n(c1.e1 e1Var, Object obj, long j4) {
        long j10;
        int b10;
        Object obj2 = obj;
        c1.c1 c1Var = this.f5885a;
        int i10 = e1Var.h(obj2, c1Var).f1643c;
        Object obj3 = this.f5897m;
        if (obj3 != null && (b10 = e1Var.b(obj3)) != -1 && e1Var.g(b10, c1Var, false).f1643c == i10) {
            j10 = this.f5898n;
        } else {
            p0 p0Var = this.f5893i;
            while (true) {
                if (p0Var != null) {
                    if (p0Var.f5858b.equals(obj2)) {
                        j10 = p0Var.f5862f.f5874a.f10562d;
                        break;
                    }
                    p0Var = p0Var.f5868l;
                } else {
                    p0 p0Var2 = this.f5893i;
                    while (true) {
                        if (p0Var2 != null) {
                            int b11 = e1Var.b(p0Var2.f5858b);
                            if (b11 != -1 && e1Var.g(b11, c1Var, false).f1643c == i10) {
                                j10 = p0Var2.f5862f.f5874a.f10562d;
                                break;
                            }
                            p0Var2 = p0Var2.f5868l;
                        } else {
                            j10 = this.f5890f;
                            this.f5890f = 1 + j10;
                            if (this.f5893i == null) {
                                this.f5897m = obj2;
                                this.f5898n = j10;
                            }
                        }
                    }
                }
            }
        }
        long j11 = j10;
        e1Var.h(obj2, c1Var);
        int i11 = c1Var.f1643c;
        c1.d1 d1Var = this.f5886b;
        e1Var.n(i11, d1Var);
        boolean z9 = false;
        for (int b12 = e1Var.b(obj); b12 >= d1Var.o; b12--) {
            boolean z10 = true;
            e1Var.g(b12, c1Var, true);
            if (c1Var.f1647g.f1628a <= 0) {
                z10 = false;
            }
            z9 |= z10;
            if (c1Var.c(c1Var.f1644d) != -1) {
                obj2 = c1Var.f1642b;
                obj2.getClass();
            }
            if (z9 && (!z10 || c1Var.f1644d != 0)) {
                break;
            }
        }
        return m(e1Var, obj2, j4, j11, this.f5886b, this.f5885a);
    }

    public final boolean o(c1.e1 e1Var) {
        p0 p0Var;
        p0 p0Var2 = this.f5893i;
        if (p0Var2 == null) {
            return true;
        }
        int b10 = e1Var.b(p0Var2.f5858b);
        while (true) {
            b10 = e1Var.d(b10, this.f5885a, this.f5886b, this.f5891g, this.f5892h);
            while (true) {
                p0Var2.getClass();
                p0Var = p0Var2.f5868l;
                if (p0Var == null || p0Var2.f5862f.f5880g) {
                    break;
                }
                p0Var2 = p0Var;
            }
            if (b10 == -1 || p0Var == null || e1Var.b(p0Var.f5858b) != b10) {
                break;
            }
            p0Var2 = p0Var;
        }
        boolean l10 = l(p0Var2);
        p0Var2.f5862f = h(e1Var, p0Var2.f5862f);
        return !l10;
    }

    public final boolean p(c1.e1 e1Var, long j4, long j10) {
        boolean l10;
        boolean z9;
        q0 q0Var;
        boolean z10;
        long j11;
        boolean z11;
        p0 p0Var = null;
        for (p0 p0Var2 = this.f5893i; p0Var2 != null; p0Var2 = p0Var2.f5868l) {
            q0 q0Var2 = p0Var2.f5862f;
            if (p0Var == null) {
                q0Var = h(e1Var, q0Var2);
            } else {
                q0 d10 = d(e1Var, p0Var, j4);
                if (d10 == null) {
                    l10 = l(p0Var);
                } else {
                    if (q0Var2.f5875b == d10.f5875b && q0Var2.f5874a.equals(d10.f5874a)) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    if (!z9) {
                        l10 = l(p0Var);
                    } else {
                        q0Var = d10;
                    }
                }
                return !l10;
            }
            p0Var2.f5862f = q0Var.a(q0Var2.f5876c);
            long j12 = q0Var2.f5878e;
            long j13 = q0Var.f5878e;
            if (j12 != -9223372036854775807L && j12 != j13) {
                z10 = false;
            } else {
                z10 = true;
            }
            if (!z10) {
                p0Var2.i();
                if (j13 == -9223372036854775807L) {
                    j11 = Long.MAX_VALUE;
                } else {
                    j11 = p0Var2.o + j13;
                }
                if (p0Var2 == this.f5894j && !p0Var2.f5862f.f5879f && (j10 == Long.MIN_VALUE || j10 >= j11)) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (!l(p0Var2) && !z11) {
                    return true;
                }
                return false;
            }
            p0Var = p0Var2;
        }
        return true;
    }
}
