package j1;

/* loaded from: classes.dex */
public final class m extends c1.s0 {

    /* renamed from: c, reason: collision with root package name */
    public final int f5823c;

    /* renamed from: d, reason: collision with root package name */
    public final String f5824d;

    /* renamed from: e, reason: collision with root package name */
    public final int f5825e;

    /* renamed from: f, reason: collision with root package name */
    public final c1.v f5826f;

    /* renamed from: x, reason: collision with root package name */
    public final int f5827x;

    /* renamed from: y, reason: collision with root package name */
    public final v1.w f5828y;

    /* renamed from: z, reason: collision with root package name */
    public final boolean f5829z;

    static {
        f1.b0.J(1001);
        f1.b0.J(1002);
        f1.b0.J(1003);
        f1.b0.J(1004);
        f1.b0.J(1005);
        f1.b0.J(1006);
    }

    public m(int i10, int i11, Throwable th) {
        this(i10, th, i11, null, -1, null, 4, false);
    }

    public final m a(v1.w wVar) {
        return new m(getMessage(), getCause(), this.f1890a, this.f5823c, this.f5824d, this.f5825e, this.f5826f, this.f5827x, wVar, this.f1891b, this.f5829z);
    }

    public m(String str, Throwable th, int i10, int i11, String str2, int i12, c1.v vVar, int i13, v1.w wVar, long j4, boolean z9) {
        super(str, th, i10, j4);
        w7.b.g(!z9 || i11 == 1);
        w7.b.g(th != null || i11 == 3);
        this.f5823c = i11;
        this.f5824d = str2;
        this.f5825e = i12;
        this.f5826f = vVar;
        this.f5827x = i13;
        this.f5828y = wVar;
        this.f5829z = z9;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public m(int r14, java.lang.Throwable r15, int r16, java.lang.String r17, int r18, c1.v r19, int r20, boolean r21) {
        /*
            r13 = this;
            r4 = r14
            r8 = r20
            if (r4 == 0) goto L64
            r0 = 3
            r1 = 1
            if (r4 == r1) goto L17
            if (r4 == r0) goto Le
            java.lang.String r0 = "Unexpected runtime error"
            goto L10
        Le:
            java.lang.String r0 = "Remote error"
        L10:
            r5 = r17
            r6 = r18
            r7 = r19
            goto L6c
        L17:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r5 = r17
            r2.append(r5)
            java.lang.String r3 = " error, index="
            r2.append(r3)
            r6 = r18
            r2.append(r6)
            java.lang.String r3 = ", format="
            r2.append(r3)
            r7 = r19
            r2.append(r7)
            java.lang.String r3 = ", format_supported="
            r2.append(r3)
            int r3 = f1.b0.f3799a
            if (r8 == 0) goto L5a
            if (r8 == r1) goto L57
            r1 = 2
            if (r8 == r1) goto L54
            if (r8 == r0) goto L51
            r0 = 4
            if (r8 != r0) goto L4b
            java.lang.String r0 = "YES"
            goto L5c
        L4b:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>()
            throw r0
        L51:
            java.lang.String r0 = "NO_EXCEEDS_CAPABILITIES"
            goto L5c
        L54:
            java.lang.String r0 = "NO_UNSUPPORTED_DRM"
            goto L5c
        L57:
            java.lang.String r0 = "NO_UNSUPPORTED_TYPE"
            goto L5c
        L5a:
            java.lang.String r0 = "NO"
        L5c:
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            goto L6c
        L64:
            r5 = r17
            r6 = r18
            r7 = r19
            java.lang.String r0 = "Source error"
        L6c:
            r1 = 0
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L79
            java.lang.String r1 = ": null"
            java.lang.String r0 = a3.g.s(r0, r1)
        L79:
            r1 = r0
            r9 = 0
            long r10 = android.os.SystemClock.elapsedRealtime()
            r0 = r13
            r2 = r15
            r3 = r16
            r4 = r14
            r5 = r17
            r6 = r18
            r7 = r19
            r8 = r20
            r12 = r21
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: j1.m.<init>(int, java.lang.Throwable, int, java.lang.String, int, c1.v, int, boolean):void");
    }
}
