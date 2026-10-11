package defpackage;

import java.io.EOFException;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class l26 implements bh6 {
    public final bh6 a;
    public final w16 b;
    public y16 g;
    public ea2 h;
    public boolean i;
    public int d = 0;
    public int e = 0;
    public byte[] f = eq6.b;
    public final zi4 c = new zi4();

    public l26(bh6 bh6Var, w16 w16Var) {
        this.a = bh6Var;
        this.b = w16Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.bh6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(long r5, int r7, int r8, int r9, defpackage.ah6 r10) {
        /*
            r4 = this;
            y16 r0 = r4.g
            if (r0 != 0) goto La
            bh6 r4 = r4.a
            r4.a(r5, r7, r8, r9, r10)
            return
        La:
            r1 = 0
            if (r10 != 0) goto Lf
            r10 = 1
            goto L10
        Lf:
            r10 = r1
        L10:
            java.lang.String r0 = "DRM on subtitles is not supported"
            defpackage.io3.m(r0, r10)
            int r10 = r4.e
            int r10 = r10 - r9
            int r10 = r10 - r8
            r2 = r5
            y16 r5 = r4.g     // Catch: java.lang.RuntimeException -> L2e
            byte[] r6 = r4.f     // Catch: java.lang.RuntimeException -> L2e
            x16 r9 = defpackage.x16.c     // Catch: java.lang.RuntimeException -> L2e
            r0 = r7
            r7 = r10
            z61 r10 = new z61     // Catch: java.lang.RuntimeException -> L2b
            r10.<init>(r4, r2, r0)     // Catch: java.lang.RuntimeException -> L2b
            r5.E(r6, r7, r8, r9, r10)     // Catch: java.lang.RuntimeException -> L2b
            goto L3c
        L2b:
            r0 = move-exception
        L2c:
            r5 = r0
            goto L31
        L2e:
            r0 = move-exception
            r7 = r10
            goto L2c
        L31:
            boolean r6 = r4.i
            if (r6 == 0) goto L49
            java.lang.String r6 = "SubtitleTranscodingTO"
            java.lang.String r9 = "Parsing subtitles failed, ignoring sample."
            defpackage.kb0.P(r6, r9, r5)
        L3c:
            int r10 = r7 + r8
            r4.d = r10
            int r5 = r4.e
            if (r10 != r5) goto L48
            r4.d = r1
            r4.e = r1
        L48:
            return
        L49:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.l26.a(long, int, int, int, ah6):void");
    }

    @Override // defpackage.bh6
    public final void b(zi4 zi4Var, int i, int i2) {
        if (this.g == null) {
            this.a.b(zi4Var, i, i2);
            return;
        }
        h(i);
        zi4Var.k(this.f, this.e, i);
        this.e += i;
    }

    @Override // defpackage.bh6
    public final int c(m41 m41Var, int i, boolean z) {
        if (this.g == null) {
            return this.a.c(m41Var, i, z);
        }
        h(i);
        int read = m41Var.read(this.f, this.e, i);
        if (read == -1) {
            if (z) {
                return -1;
            }
            throw new EOFException();
        }
        this.e += read;
        return read;
    }

    @Override // defpackage.bh6
    public final void g(ea2 ea2Var) {
        boolean z;
        y16 y16Var;
        ea2Var.p.getClass();
        String str = ea2Var.p;
        if (qy3.h(str) == 3) {
            z = true;
        } else {
            z = false;
        }
        io3.n(z);
        boolean equals = ea2Var.equals(this.h);
        w16 w16Var = this.b;
        if (!equals) {
            this.h = ea2Var;
            if (w16Var.i(ea2Var)) {
                y16Var = w16Var.s(ea2Var);
            } else {
                y16Var = null;
            }
            this.g = y16Var;
        }
        y16 y16Var2 = this.g;
        bh6 bh6Var = this.a;
        if (y16Var2 == null) {
            bh6Var.g(ea2Var);
            return;
        }
        da2 a = ea2Var.a();
        a.o = qy3.n("application/x-media3-cues");
        a.k = str;
        a.t = Long.MAX_VALUE;
        a.P = w16Var.A(ea2Var);
        zo5.q(a, bh6Var);
    }

    public final void h(int i) {
        byte[] bArr;
        int length = this.f.length;
        int i2 = this.e;
        if (length - i2 >= i) {
            return;
        }
        int i3 = i2 - this.d;
        int max = Math.max(i3 * 2, i + i3);
        byte[] bArr2 = this.f;
        if (max <= bArr2.length) {
            bArr = bArr2;
        } else {
            bArr = new byte[max];
        }
        System.arraycopy(bArr2, this.d, bArr, 0, i3);
        this.d = 0;
        this.e = i3;
        this.f = bArr;
    }
}
