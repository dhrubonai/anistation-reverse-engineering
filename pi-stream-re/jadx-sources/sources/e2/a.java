package e2;

import d2.b0;
import d2.g0;
import d2.k;
import d2.p;
import d2.q;
import d2.r;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class a implements p {

    /* renamed from: q, reason: collision with root package name */
    public static final int[] f3381q;

    /* renamed from: t, reason: collision with root package name */
    public static final int f3384t;

    /* renamed from: c, reason: collision with root package name */
    public boolean f3387c;

    /* renamed from: d, reason: collision with root package name */
    public long f3388d;

    /* renamed from: e, reason: collision with root package name */
    public int f3389e;

    /* renamed from: f, reason: collision with root package name */
    public int f3390f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f3391g;

    /* renamed from: h, reason: collision with root package name */
    public long f3392h;

    /* renamed from: j, reason: collision with root package name */
    public int f3394j;

    /* renamed from: k, reason: collision with root package name */
    public long f3395k;

    /* renamed from: l, reason: collision with root package name */
    public r f3396l;

    /* renamed from: m, reason: collision with root package name */
    public g0 f3397m;

    /* renamed from: n, reason: collision with root package name */
    public b0 f3398n;
    public boolean o;

    /* renamed from: p, reason: collision with root package name */
    public static final int[] f3380p = {13, 14, 16, 18, 20, 21, 27, 32, 6, 7, 6, 6, 1, 1, 1, 1};

    /* renamed from: r, reason: collision with root package name */
    public static final byte[] f3382r = f1.b0.G("#!AMR\n");

    /* renamed from: s, reason: collision with root package name */
    public static final byte[] f3383s = f1.b0.G("#!AMR-WB\n");

    /* renamed from: b, reason: collision with root package name */
    public final int f3386b = 0;

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f3385a = new byte[1];

    /* renamed from: i, reason: collision with root package name */
    public int f3393i = -1;

    static {
        int[] iArr = {18, 24, 33, 37, 41, 47, 51, 59, 61, 6, 1, 1, 1, 1, 1, 1};
        f3381q = iArr;
        f3384t = iArr[8];
    }

    @Override // d2.p
    public final void a() {
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0038, code lost:
    
        if (r0 != false) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int b(d2.q r6) {
        /*
            r5 = this;
            r6.g()
            byte[] r0 = r5.f3385a
            r1 = 0
            r2 = 1
            r6.n(r0, r1, r2)
            r6 = r0[r1]
            r0 = r6 & 131(0x83, float:1.84E-43)
            r3 = 0
            if (r0 > 0) goto L6f
            int r6 = r6 >> 3
            r0 = 15
            r6 = r6 & r0
            if (r6 < 0) goto L3b
            if (r6 > r0) goto L3b
            boolean r0 = r5.f3387c
            if (r0 == 0) goto L28
            r4 = 10
            if (r6 < r4) goto L26
            r4 = 13
            if (r6 <= r4) goto L28
        L26:
            r4 = r2
            goto L29
        L28:
            r4 = r1
        L29:
            if (r4 != 0) goto L3a
            if (r0 != 0) goto L37
            r0 = 12
            if (r6 < r0) goto L35
            r0 = 14
            if (r6 <= r0) goto L37
        L35:
            r0 = r2
            goto L38
        L37:
            r0 = r1
        L38:
            if (r0 == 0) goto L3b
        L3a:
            r1 = r2
        L3b:
            if (r1 != 0) goto L61
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Illegal AMR "
            r0.<init>(r1)
            boolean r1 = r5.f3387c
            if (r1 == 0) goto L4b
            java.lang.String r1 = "WB"
            goto L4d
        L4b:
            java.lang.String r1 = "NB"
        L4d:
            r0.append(r1)
            java.lang.String r1 = " frame type "
            r0.append(r1)
            r0.append(r6)
            java.lang.String r6 = r0.toString()
            c1.r0 r6 = c1.r0.a(r6, r3)
            throw r6
        L61:
            boolean r0 = r5.f3387c
            if (r0 == 0) goto L6a
            int[] r0 = e2.a.f3381q
            r6 = r0[r6]
            goto L6e
        L6a:
            int[] r0 = e2.a.f3380p
            r6 = r0[r6]
        L6e:
            return r6
        L6f:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Invalid padding bits for frame header "
            r0.<init>(r1)
            r0.append(r6)
            java.lang.String r6 = r0.toString()
            c1.r0 r6 = c1.r0.a(r6, r3)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: e2.a.b(d2.q):int");
    }

    @Override // d2.p
    public final p c() {
        return this;
    }

    public final boolean d(q qVar) {
        qVar.g();
        byte[] bArr = f3382r;
        byte[] bArr2 = new byte[bArr.length];
        qVar.n(bArr2, 0, bArr.length);
        if (Arrays.equals(bArr2, bArr)) {
            this.f3387c = false;
            qVar.h(bArr.length);
            return true;
        }
        qVar.g();
        byte[] bArr3 = f3383s;
        byte[] bArr4 = new byte[bArr3.length];
        qVar.n(bArr4, 0, bArr3.length);
        if (!Arrays.equals(bArr4, bArr3)) {
            return false;
        }
        this.f3387c = true;
        qVar.h(bArr3.length);
        return true;
    }

    @Override // d2.p
    public final void e(long j4, long j10) {
        this.f3388d = 0L;
        this.f3389e = 0;
        this.f3390f = 0;
        if (j4 != 0) {
            b0 b0Var = this.f3398n;
            if (b0Var instanceof k) {
                this.f3395k = ((Math.max(0L, j4 - ((k) b0Var).f3171b) * 8) * 1000000) / r0.f3174e;
                return;
            }
        }
        this.f3395k = 0L;
    }

    @Override // d2.p
    public final void f(r rVar) {
        this.f3396l = rVar;
        this.f3397m = rVar.i(0, 1);
        rVar.b();
    }

    @Override // d2.p
    public final boolean h(q qVar) {
        return d(qVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00a8  */
    @Override // d2.p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int i(d2.q r14, d2.t r15) {
        /*
            Method dump skipped, instructions count: 252
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: e2.a.i(d2.q, d2.t):int");
    }
}
