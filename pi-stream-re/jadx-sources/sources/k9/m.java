package k9;

import java.util.zip.Inflater;

/* loaded from: classes.dex */
public final class m implements w {

    /* renamed from: a, reason: collision with root package name */
    public final i f6532a;

    /* renamed from: b, reason: collision with root package name */
    public final Inflater f6533b;

    /* renamed from: c, reason: collision with root package name */
    public int f6534c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f6535d;

    public m(q qVar, Inflater inflater) {
        this.f6532a = qVar;
        this.f6533b = inflater;
    }

    @Override // k9.w
    public final y c() {
        return this.f6532a.c();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f6535d) {
            return;
        }
        this.f6533b.end();
        this.f6535d = true;
        this.f6532a.close();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x008b A[SYNTHETIC] */
    @Override // k9.w
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long z(k9.g r10, long r11) {
        /*
            r9 = this;
            java.lang.String r0 = "sink"
            r6.h0.u(r10, r0)
        L5:
            r0 = 0
            int r2 = (r11 > r0 ? 1 : (r11 == r0 ? 0 : -1))
            r3 = 1
            if (r2 < 0) goto Le
            r4 = r3
            goto Lf
        Le:
            r4 = 0
        Lf:
            if (r4 == 0) goto Lbf
            boolean r4 = r9.f6535d
            r4 = r4 ^ r3
            if (r4 == 0) goto Lb3
            k9.i r4 = r9.f6532a
            java.util.zip.Inflater r5 = r9.f6533b
            if (r2 != 0) goto L1d
            goto L86
        L1d:
            k9.r r2 = r10.H(r3)     // Catch: java.util.zip.DataFormatException -> Lac
            int r3 = r2.f6547c     // Catch: java.util.zip.DataFormatException -> Lac
            int r3 = 8192 - r3
            long r6 = (long) r3     // Catch: java.util.zip.DataFormatException -> Lac
            long r6 = java.lang.Math.min(r11, r6)     // Catch: java.util.zip.DataFormatException -> Lac
            int r3 = (int) r6     // Catch: java.util.zip.DataFormatException -> Lac
            boolean r6 = r5.needsInput()     // Catch: java.util.zip.DataFormatException -> Lac
            if (r6 != 0) goto L32
            goto L4e
        L32:
            boolean r6 = r4.n()     // Catch: java.util.zip.DataFormatException -> Lac
            if (r6 == 0) goto L39
            goto L4e
        L39:
            k9.g r6 = r4.m()     // Catch: java.util.zip.DataFormatException -> Lac
            k9.r r6 = r6.f6520a     // Catch: java.util.zip.DataFormatException -> Lac
            r6.h0.q(r6)     // Catch: java.util.zip.DataFormatException -> Lac
            int r7 = r6.f6547c     // Catch: java.util.zip.DataFormatException -> Lac
            int r8 = r6.f6546b     // Catch: java.util.zip.DataFormatException -> Lac
            int r7 = r7 - r8
            r9.f6534c = r7     // Catch: java.util.zip.DataFormatException -> Lac
            byte[] r6 = r6.f6545a     // Catch: java.util.zip.DataFormatException -> Lac
            r5.setInput(r6, r8, r7)     // Catch: java.util.zip.DataFormatException -> Lac
        L4e:
            byte[] r6 = r2.f6545a     // Catch: java.util.zip.DataFormatException -> Lac
            int r7 = r2.f6547c     // Catch: java.util.zip.DataFormatException -> Lac
            int r3 = r5.inflate(r6, r7, r3)     // Catch: java.util.zip.DataFormatException -> Lac
            int r6 = r9.f6534c     // Catch: java.util.zip.DataFormatException -> Lac
            if (r6 != 0) goto L5b
            goto L69
        L5b:
            int r7 = r5.getRemaining()     // Catch: java.util.zip.DataFormatException -> Lac
            int r6 = r6 - r7
            int r7 = r9.f6534c     // Catch: java.util.zip.DataFormatException -> Lac
            int r7 = r7 - r6
            r9.f6534c = r7     // Catch: java.util.zip.DataFormatException -> Lac
            long r6 = (long) r6     // Catch: java.util.zip.DataFormatException -> Lac
            r4.b(r6)     // Catch: java.util.zip.DataFormatException -> Lac
        L69:
            if (r3 <= 0) goto L77
            int r6 = r2.f6547c     // Catch: java.util.zip.DataFormatException -> Lac
            int r6 = r6 + r3
            r2.f6547c = r6     // Catch: java.util.zip.DataFormatException -> Lac
            long r6 = r10.f6521b     // Catch: java.util.zip.DataFormatException -> Lac
            long r2 = (long) r3     // Catch: java.util.zip.DataFormatException -> Lac
            long r6 = r6 + r2
            r10.f6521b = r6     // Catch: java.util.zip.DataFormatException -> Lac
            goto L87
        L77:
            int r3 = r2.f6546b     // Catch: java.util.zip.DataFormatException -> Lac
            int r6 = r2.f6547c     // Catch: java.util.zip.DataFormatException -> Lac
            if (r3 != r6) goto L86
            k9.r r3 = r2.a()     // Catch: java.util.zip.DataFormatException -> Lac
            r10.f6520a = r3     // Catch: java.util.zip.DataFormatException -> Lac
            k9.s.a(r2)     // Catch: java.util.zip.DataFormatException -> Lac
        L86:
            r2 = r0
        L87:
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 <= 0) goto L8c
            return r2
        L8c:
            boolean r0 = r5.finished()
            if (r0 != 0) goto La9
            boolean r0 = r5.needsDictionary()
            if (r0 == 0) goto L99
            goto La9
        L99:
            boolean r0 = r4.n()
            if (r0 != 0) goto La1
            goto L5
        La1:
            java.io.EOFException r10 = new java.io.EOFException
            java.lang.String r11 = "source exhausted prematurely"
            r10.<init>(r11)
            throw r10
        La9:
            r10 = -1
            return r10
        Lac:
            r10 = move-exception
            java.io.IOException r11 = new java.io.IOException
            r11.<init>(r10)
            throw r11
        Lb3:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "closed"
            java.lang.String r11 = r11.toString()
            r10.<init>(r11)
            throw r10
        Lbf:
            java.lang.String r10 = "byteCount < 0: "
            java.lang.String r10 = a3.g.q(r10, r11)
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException
            java.lang.String r10 = r10.toString()
            r11.<init>(r10)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: k9.m.z(k9.g, long):long");
    }
}
