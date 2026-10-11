package f9;

/* loaded from: classes.dex */
public final class z implements k9.w {

    /* renamed from: a, reason: collision with root package name */
    public final long f4113a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f4114b;

    /* renamed from: c, reason: collision with root package name */
    public final k9.g f4115c = new k9.g();

    /* renamed from: d, reason: collision with root package name */
    public final k9.g f4116d = new k9.g();

    /* renamed from: e, reason: collision with root package name */
    public boolean f4117e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ b0 f4118f;

    public z(b0 b0Var, long j4, boolean z9) {
        this.f4118f = b0Var;
        this.f4113a = j4;
        this.f4114b = z9;
    }

    @Override // k9.w
    public final k9.y c() {
        return this.f4118f.f3992k;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        long j4;
        b0 b0Var = this.f4118f;
        synchronized (b0Var) {
            this.f4117e = true;
            k9.g gVar = this.f4116d;
            j4 = gVar.f6521b;
            gVar.a();
            b0Var.notifyAll();
        }
        if (j4 > 0) {
            byte[] bArr = z8.b.f12133a;
            this.f4118f.f3983b.x(j4);
        }
        this.f4118f.a();
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x009e, code lost:
    
        throw new java.io.IOException("stream closed");
     */
    @Override // k9.w
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long z(k9.g r16, long r17) {
        /*
            r15 = this;
            r1 = r15
            r0 = r16
            r2 = r17
            java.lang.String r4 = "sink"
            r6.h0.u(r0, r4)
            r4 = 0
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 < 0) goto L12
            r6 = 1
            goto L13
        L12:
            r6 = 0
        L13:
            if (r6 == 0) goto La9
        L15:
            f9.b0 r6 = r1.f4118f
            monitor-enter(r6)
            f9.a0 r9 = r6.f3992k     // Catch: java.lang.Throwable -> La6
            r9.h()     // Catch: java.lang.Throwable -> La6
            f9.b r9 = r6.f()     // Catch: java.lang.Throwable -> L9f
            if (r9 == 0) goto L38
            boolean r9 = r1.f4114b     // Catch: java.lang.Throwable -> L9f
            if (r9 != 0) goto L38
            java.io.IOException r9 = r6.f3995n     // Catch: java.lang.Throwable -> L9f
            if (r9 != 0) goto L39
            f9.g0 r9 = new f9.g0     // Catch: java.lang.Throwable -> L9f
            f9.b r10 = r6.f()     // Catch: java.lang.Throwable -> L9f
            r6.h0.q(r10)     // Catch: java.lang.Throwable -> L9f
            r9.<init>(r10)     // Catch: java.lang.Throwable -> L9f
            goto L39
        L38:
            r9 = 0
        L39:
            boolean r10 = r1.f4117e     // Catch: java.lang.Throwable -> L9f
            if (r10 != 0) goto L97
            k9.g r10 = r1.f4116d     // Catch: java.lang.Throwable -> L9f
            long r11 = r10.f6521b     // Catch: java.lang.Throwable -> L9f
            int r4 = (r11 > r4 ? 1 : (r11 == r4 ? 0 : -1))
            r13 = -1
            if (r4 <= 0) goto L76
            long r4 = java.lang.Math.min(r2, r11)     // Catch: java.lang.Throwable -> L9f
            long r4 = r10.z(r0, r4)     // Catch: java.lang.Throwable -> L9f
            long r10 = r6.f3984c     // Catch: java.lang.Throwable -> L9f
            long r10 = r10 + r4
            r6.f3984c = r10     // Catch: java.lang.Throwable -> L9f
            long r7 = r6.f3985d     // Catch: java.lang.Throwable -> L9f
            long r10 = r10 - r7
            if (r9 != 0) goto L73
            f9.t r7 = r6.f3983b     // Catch: java.lang.Throwable -> L9f
            f9.f0 r7 = r7.I     // Catch: java.lang.Throwable -> L9f
            int r7 = r7.a()     // Catch: java.lang.Throwable -> L9f
            int r7 = r7 / 2
            long r7 = (long) r7     // Catch: java.lang.Throwable -> L9f
            int r7 = (r10 > r7 ? 1 : (r10 == r7 ? 0 : -1))
            if (r7 < 0) goto L73
            f9.t r7 = r6.f3983b     // Catch: java.lang.Throwable -> L9f
            int r8 = r6.f3982a     // Catch: java.lang.Throwable -> L9f
            r7.I(r8, r10)     // Catch: java.lang.Throwable -> L9f
            long r7 = r6.f3984c     // Catch: java.lang.Throwable -> L9f
            r6.f3985d = r7     // Catch: java.lang.Throwable -> L9f
        L73:
            r7 = r4
            r4 = 0
            goto L83
        L76:
            boolean r4 = r1.f4114b     // Catch: java.lang.Throwable -> L9f
            if (r4 != 0) goto L81
            if (r9 != 0) goto L81
            r6.l()     // Catch: java.lang.Throwable -> L9f
            r4 = 1
            goto L82
        L81:
            r4 = 0
        L82:
            r7 = r13
        L83:
            f9.a0 r5 = r6.f3992k     // Catch: java.lang.Throwable -> La6
            r5.l()     // Catch: java.lang.Throwable -> La6
            monitor-exit(r6)
            if (r4 == 0) goto L8e
            r4 = 0
            goto L15
        L8e:
            int r0 = (r7 > r13 ? 1 : (r7 == r13 ? 0 : -1))
            if (r0 == 0) goto L93
            return r7
        L93:
            if (r9 != 0) goto L96
            return r13
        L96:
            throw r9
        L97:
            java.io.IOException r0 = new java.io.IOException     // Catch: java.lang.Throwable -> L9f
            java.lang.String r2 = "stream closed"
            r0.<init>(r2)     // Catch: java.lang.Throwable -> L9f
            throw r0     // Catch: java.lang.Throwable -> L9f
        L9f:
            r0 = move-exception
            f9.a0 r2 = r6.f3992k     // Catch: java.lang.Throwable -> La6
            r2.l()     // Catch: java.lang.Throwable -> La6
            throw r0     // Catch: java.lang.Throwable -> La6
        La6:
            r0 = move-exception
            monitor-exit(r6)
            throw r0
        La9:
            java.lang.String r0 = "byteCount < 0: "
            java.lang.String r0 = a3.g.q(r0, r2)
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r0 = r0.toString()
            r2.<init>(r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: f9.z.z(k9.g, long):long");
    }
}
