package defpackage;

import java.util.zip.Inflater;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class sy2 implements bv5 {
    public boolean A;
    public final xy4 x;
    public final Inflater y;
    public int z;

    public sy2(xy4 xy4Var, Inflater inflater) {
        this.x = xy4Var;
        this.y = inflater;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.A) {
            return;
        }
        this.y.end();
        this.A = true;
        this.x.close();
    }

    @Override // defpackage.bv5
    public final of6 d() {
        return this.x.x.d();
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0082 A[SYNTHETIC] */
    @Override // defpackage.bv5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long j0(long r11, defpackage.pa0 r13) {
        /*
            r10 = this;
            r13.getClass()
        L3:
            r0 = 0
            int r2 = (r11 > r0 ? 1 : (r11 == r0 ? 0 : -1))
            if (r2 < 0) goto Lb0
            boolean r3 = r10.A
            if (r3 != 0) goto Laa
            xy4 r3 = r10.x
            java.util.zip.Inflater r4 = r10.y
            if (r2 != 0) goto L15
        L13:
            r8 = r0
            goto L7e
        L15:
            r2 = 1
            zf5 r2 = r13.k0(r2)     // Catch: java.util.zip.DataFormatException -> La3
            int r5 = r2.c     // Catch: java.util.zip.DataFormatException -> La3
            int r5 = 8192 - r5
            long r5 = (long) r5     // Catch: java.util.zip.DataFormatException -> La3
            long r5 = java.lang.Math.min(r11, r5)     // Catch: java.util.zip.DataFormatException -> La3
            int r5 = (int) r5     // Catch: java.util.zip.DataFormatException -> La3
            boolean r6 = r4.needsInput()     // Catch: java.util.zip.DataFormatException -> La3
            if (r6 != 0) goto L2b
            goto L45
        L2b:
            boolean r6 = r3.D()     // Catch: java.util.zip.DataFormatException -> La3
            if (r6 == 0) goto L32
            goto L45
        L32:
            pa0 r6 = r3.y     // Catch: java.util.zip.DataFormatException -> La3
            zf5 r6 = r6.x     // Catch: java.util.zip.DataFormatException -> La3
            r6.getClass()     // Catch: java.util.zip.DataFormatException -> La3
            int r7 = r6.c     // Catch: java.util.zip.DataFormatException -> La3
            int r8 = r6.b     // Catch: java.util.zip.DataFormatException -> La3
            int r7 = r7 - r8
            r10.z = r7     // Catch: java.util.zip.DataFormatException -> La3
            byte[] r6 = r6.a     // Catch: java.util.zip.DataFormatException -> La3
            r4.setInput(r6, r8, r7)     // Catch: java.util.zip.DataFormatException -> La3
        L45:
            byte[] r6 = r2.a     // Catch: java.util.zip.DataFormatException -> La3
            int r7 = r2.c     // Catch: java.util.zip.DataFormatException -> La3
            int r5 = r4.inflate(r6, r7, r5)     // Catch: java.util.zip.DataFormatException -> La3
            int r6 = r10.z     // Catch: java.util.zip.DataFormatException -> La3
            if (r6 != 0) goto L52
            goto L60
        L52:
            int r7 = r4.getRemaining()     // Catch: java.util.zip.DataFormatException -> La3
            int r6 = r6 - r7
            int r7 = r10.z     // Catch: java.util.zip.DataFormatException -> La3
            int r7 = r7 - r6
            r10.z = r7     // Catch: java.util.zip.DataFormatException -> La3
            long r6 = (long) r6     // Catch: java.util.zip.DataFormatException -> La3
            r3.skip(r6)     // Catch: java.util.zip.DataFormatException -> La3
        L60:
            if (r5 <= 0) goto L6e
            int r6 = r2.c     // Catch: java.util.zip.DataFormatException -> La3
            int r6 = r6 + r5
            r2.c = r6     // Catch: java.util.zip.DataFormatException -> La3
            long r6 = r13.y     // Catch: java.util.zip.DataFormatException -> La3
            long r8 = (long) r5     // Catch: java.util.zip.DataFormatException -> La3
            long r6 = r6 + r8
            r13.y = r6     // Catch: java.util.zip.DataFormatException -> La3
            goto L7e
        L6e:
            int r5 = r2.b     // Catch: java.util.zip.DataFormatException -> La3
            int r6 = r2.c     // Catch: java.util.zip.DataFormatException -> La3
            if (r5 != r6) goto L13
            zf5 r5 = r2.a()     // Catch: java.util.zip.DataFormatException -> La3
            r13.x = r5     // Catch: java.util.zip.DataFormatException -> La3
            defpackage.hg5.a(r2)     // Catch: java.util.zip.DataFormatException -> La3
            goto L13
        L7e:
            int r0 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r0 <= 0) goto L83
            return r8
        L83:
            boolean r0 = r4.finished()
            if (r0 != 0) goto La0
            boolean r0 = r4.needsDictionary()
            if (r0 == 0) goto L90
            goto La0
        L90:
            boolean r0 = r3.D()
            if (r0 != 0) goto L98
            goto L3
        L98:
            java.io.EOFException r10 = new java.io.EOFException
            java.lang.String r11 = "source exhausted prematurely"
            r10.<init>(r11)
            throw r10
        La0:
            r10 = -1
            return r10
        La3:
            r10 = move-exception
            java.io.IOException r11 = new java.io.IOException
            r11.<init>(r10)
            throw r11
        Laa:
            java.lang.String r10 = "closed"
            defpackage.ze0.m(r10)
            return r0
        Lb0:
            java.lang.String r10 = "byteCount < 0: "
            java.lang.String r10 = defpackage.h11.h(r11, r10)
            defpackage.ze0.e(r10)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sy2.j0(long, pa0):long");
    }
}
