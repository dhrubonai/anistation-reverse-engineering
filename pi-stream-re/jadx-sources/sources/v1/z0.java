package v1;

import android.net.Uri;

/* loaded from: classes.dex */
public final class z0 extends c1.e1 {

    /* renamed from: n, reason: collision with root package name */
    public static final Object f10577n = new Object();

    /* renamed from: b, reason: collision with root package name */
    public final long f10578b;

    /* renamed from: c, reason: collision with root package name */
    public final long f10579c;

    /* renamed from: d, reason: collision with root package name */
    public final long f10580d;

    /* renamed from: e, reason: collision with root package name */
    public final long f10581e;

    /* renamed from: f, reason: collision with root package name */
    public final long f10582f;

    /* renamed from: g, reason: collision with root package name */
    public final long f10583g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f10584h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f10585i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f10586j;

    /* renamed from: k, reason: collision with root package name */
    public final Object f10587k;

    /* renamed from: l, reason: collision with root package name */
    public final c1.k0 f10588l;

    /* renamed from: m, reason: collision with root package name */
    public final c1.e0 f10589m;

    static {
        c1.y yVar = new c1.y();
        yVar.f1952a = "SinglePeriodTimeline";
        yVar.f1953b = Uri.EMPTY;
        yVar.a();
    }

    public z0(long j4, boolean z9, boolean z10, c1.k0 k0Var) {
        this(-9223372036854775807L, -9223372036854775807L, j4, j4, 0L, 0L, z9, false, false, null, k0Var, z10 ? k0Var.f1770c : null);
    }

    @Override // c1.e1
    public final int b(Object obj) {
        if (f10577n.equals(obj)) {
            return 0;
        }
        return -1;
    }

    @Override // c1.e1
    public final c1.c1 g(int i10, c1.c1 c1Var, boolean z9) {
        Object obj;
        w7.b.m(i10, 1);
        if (z9) {
            obj = f10577n;
        } else {
            obj = null;
        }
        long j4 = -this.f10582f;
        c1Var.getClass();
        c1.b bVar = c1.b.f1626c;
        c1Var.f1641a = null;
        c1Var.f1642b = obj;
        c1Var.f1643c = 0;
        c1Var.f1644d = this.f10580d;
        c1Var.f1645e = j4;
        c1Var.f1647g = bVar;
        c1Var.f1646f = false;
        return c1Var;
    }

    @Override // c1.e1
    public final int i() {
        return 1;
    }

    @Override // c1.e1
    public final Object m(int i10) {
        w7.b.m(i10, 1);
        return f10577n;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0028, code lost:
    
        if (r1 > r3) goto L13;
     */
    @Override // c1.e1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final c1.d1 o(int r22, c1.d1 r23, long r24) {
        /*
            r21 = this;
            r0 = r21
            r1 = 1
            r2 = r22
            w7.b.m(r2, r1)
            boolean r12 = r0.f10585i
            long r1 = r0.f10583g
            if (r12 == 0) goto L2c
            boolean r3 = r0.f10586j
            if (r3 != 0) goto L2c
            r3 = 0
            int r3 = (r24 > r3 ? 1 : (r24 == r3 ? 0 : -1))
            if (r3 == 0) goto L2c
            long r3 = r0.f10581e
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 != 0) goto L24
            goto L2a
        L24:
            long r1 = r1 + r24
            int r3 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r3 <= 0) goto L2c
        L2a:
            r14 = r5
            goto L2d
        L2c:
            r14 = r1
        L2d:
            java.lang.Object r1 = c1.d1.f1653r
            c1.k0 r3 = r0.f10588l
            java.lang.Object r4 = r0.f10587k
            long r5 = r0.f10578b
            long r7 = r0.f10579c
            r9 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            boolean r11 = r0.f10584h
            c1.e0 r13 = r0.f10589m
            long r1 = r0.f10581e
            r16 = r1
            r18 = 0
            long r1 = r0.f10582f
            r19 = r1
            r2 = r23
            r2.b(r3, r4, r5, r7, r9, r11, r12, r13, r14, r16, r18, r19)
            return r23
        */
        throw new UnsupportedOperationException("Method not decompiled: v1.z0.o(int, c1.d1, long):c1.d1");
    }

    @Override // c1.e1
    public final int p() {
        return 1;
    }

    public z0(long j4, long j10, long j11, long j12, long j13, long j14, boolean z9, boolean z10, boolean z11, androidx.appcompat.widget.a0 a0Var, c1.k0 k0Var, c1.e0 e0Var) {
        this.f10578b = j4;
        this.f10579c = j10;
        this.f10580d = j11;
        this.f10581e = j12;
        this.f10582f = j13;
        this.f10583g = j14;
        this.f10584h = z9;
        this.f10585i = z10;
        this.f10586j = z11;
        this.f10587k = a0Var;
        k0Var.getClass();
        this.f10588l = k0Var;
        this.f10589m = e0Var;
    }
}
