package c1;

/* loaded from: classes.dex */
public final class c1 {

    /* renamed from: a, reason: collision with root package name */
    public Object f1641a;

    /* renamed from: b, reason: collision with root package name */
    public Object f1642b;

    /* renamed from: c, reason: collision with root package name */
    public int f1643c;

    /* renamed from: d, reason: collision with root package name */
    public long f1644d;

    /* renamed from: e, reason: collision with root package name */
    public long f1645e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f1646f;

    /* renamed from: g, reason: collision with root package name */
    public b f1647g = b.f1626c;

    static {
        f1.b0.J(0);
        f1.b0.J(1);
        f1.b0.J(2);
        f1.b0.J(3);
        f1.b0.J(4);
    }

    public final long a(int i10, int i11) {
        a a10 = this.f1647g.a(i10);
        if (a10.f1615b != -1) {
            return a10.f1620g[i11];
        }
        return -9223372036854775807L;
    }

    public final int b(long j4) {
        int i10;
        boolean z9;
        b bVar = this.f1647g;
        long j10 = this.f1644d;
        bVar.getClass();
        if (j4 == Long.MIN_VALUE) {
            return -1;
        }
        if (j10 != -9223372036854775807L && j4 >= j10) {
            return -1;
        }
        int i11 = 0;
        while (true) {
            i10 = bVar.f1628a;
            if (i11 >= i10) {
                break;
            }
            if (bVar.a(i11).f1614a == Long.MIN_VALUE || bVar.a(i11).f1614a > j4) {
                a a10 = bVar.a(i11);
                int i12 = a10.f1615b;
                if (i12 != -1 && a10.a(-1) >= i12) {
                    z9 = false;
                } else {
                    z9 = true;
                }
                if (z9) {
                    break;
                }
            }
            i11++;
        }
        if (i11 >= i10) {
            return -1;
        }
        return i11;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0041 A[LOOP:0: B:2:0x000d->B:18:0x0041, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0044 A[EDGE_INSN: B:19:0x0044->B:20:0x0044 BREAK  A[LOOP:0: B:2:0x000d->B:18:0x0041], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int c(long r13) {
        /*
            r12 = this;
            c1.b r0 = r12.f1647g
            long r1 = r12.f1644d
            int r3 = r0.f1628a
            r4 = 1
            int r3 = r3 - r4
            boolean r5 = r0.b(r3)
            int r3 = r3 - r5
        Ld:
            r5 = 0
            r6 = -1
            if (r3 < 0) goto L44
            r7 = -9223372036854775808
            int r9 = (r13 > r7 ? 1 : (r13 == r7 ? 0 : -1))
            if (r9 != 0) goto L18
            goto L3e
        L18:
            c1.a r9 = r0.a(r3)
            long r10 = r9.f1614a
            int r7 = (r10 > r7 ? 1 : (r10 == r7 ? 0 : -1))
            if (r7 != 0) goto L38
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r7 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r7 == 0) goto L3c
            boolean r7 = r9.f1622i
            if (r7 == 0) goto L33
            int r7 = r9.f1615b
            if (r7 == r6) goto L3c
        L33:
            int r7 = (r13 > r1 ? 1 : (r13 == r1 ? 0 : -1))
            if (r7 >= 0) goto L3e
            goto L3c
        L38:
            int r7 = (r13 > r10 ? 1 : (r13 == r10 ? 0 : -1))
            if (r7 >= 0) goto L3e
        L3c:
            r7 = r4
            goto L3f
        L3e:
            r7 = r5
        L3f:
            if (r7 == 0) goto L44
            int r3 = r3 + (-1)
            goto Ld
        L44:
            if (r3 < 0) goto L62
            c1.a r13 = r0.a(r3)
            int r14 = r13.f1615b
            if (r14 != r6) goto L4f
            goto L5f
        L4f:
            r0 = r5
        L50:
            if (r0 >= r14) goto L5e
            int[] r1 = r13.f1619f
            r1 = r1[r0]
            if (r1 == 0) goto L5f
            if (r1 != r4) goto L5b
            goto L5f
        L5b:
            int r0 = r0 + 1
            goto L50
        L5e:
            r4 = r5
        L5f:
            if (r4 == 0) goto L62
            goto L63
        L62:
            r3 = r6
        L63:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: c1.c1.c(long):int");
    }

    public final long d(int i10) {
        return this.f1647g.a(i10).f1614a;
    }

    public final int e(int i10, int i11) {
        a a10 = this.f1647g.a(i10);
        if (a10.f1615b != -1) {
            return a10.f1619f[i11];
        }
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !c1.class.equals(obj.getClass())) {
            return false;
        }
        c1 c1Var = (c1) obj;
        if (f1.b0.a(this.f1641a, c1Var.f1641a) && f1.b0.a(this.f1642b, c1Var.f1642b) && this.f1643c == c1Var.f1643c && this.f1644d == c1Var.f1644d && this.f1645e == c1Var.f1645e && this.f1646f == c1Var.f1646f && f1.b0.a(this.f1647g, c1Var.f1647g)) {
            return true;
        }
        return false;
    }

    public final int f(int i10) {
        return this.f1647g.a(i10).a(-1);
    }

    public final long g() {
        return this.f1645e;
    }

    public final boolean h(int i10) {
        b bVar = this.f1647g;
        if (i10 == bVar.f1628a - 1 && bVar.b(i10)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        Object obj = this.f1641a;
        int i10 = 0;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        int i11 = (217 + hashCode) * 31;
        Object obj2 = this.f1642b;
        if (obj2 != null) {
            i10 = obj2.hashCode();
        }
        int i12 = (((i11 + i10) * 31) + this.f1643c) * 31;
        long j4 = this.f1644d;
        int i13 = (i12 + ((int) (j4 ^ (j4 >>> 32)))) * 31;
        long j10 = this.f1645e;
        return this.f1647g.hashCode() + ((((i13 + ((int) (j10 ^ (j10 >>> 32)))) * 31) + (this.f1646f ? 1 : 0)) * 31);
    }

    public final boolean i(int i10) {
        return this.f1647g.a(i10).f1622i;
    }
}
