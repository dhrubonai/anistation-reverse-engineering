package h1;

import android.net.Uri;
import java.io.IOException;
import java.io.RandomAccessFile;

/* loaded from: classes.dex */
public final class u extends c {

    /* renamed from: e, reason: collision with root package name */
    public RandomAccessFile f4639e;

    /* renamed from: f, reason: collision with root package name */
    public Uri f4640f;

    /* renamed from: g, reason: collision with root package name */
    public long f4641g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f4642h;

    public u() {
        super(false);
    }

    @Override // h1.h
    public final void close() {
        this.f4640f = null;
        try {
            try {
                RandomAccessFile randomAccessFile = this.f4639e;
                if (randomAccessFile != null) {
                    randomAccessFile.close();
                }
            } catch (IOException e10) {
                throw new t(2000, e10);
            }
        } finally {
            this.f4639e = null;
            if (this.f4642h) {
                this.f4642h = false;
                s();
            }
        }
    }

    @Override // h1.h
    public final Uri j() {
        return this.f4640f;
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0083, code lost:
    
        if (r1 != false) goto L35;
     */
    @Override // h1.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long m(h1.l r10) {
        /*
            r9 = this;
            android.net.Uri r0 = r10.f4597a
            long r1 = r10.f4602f
            r9.f4640f = r0
            r9.t()
            r3 = 1
            r4 = 2000(0x7d0, float:2.803E-42)
            r5 = 2006(0x7d6, float:2.811E-42)
            java.io.RandomAccessFile r6 = new java.io.RandomAccessFile     // Catch: java.lang.RuntimeException -> L50 java.lang.SecurityException -> L57 java.io.FileNotFoundException -> L5e
            java.lang.String r7 = r0.getPath()     // Catch: java.lang.RuntimeException -> L50 java.lang.SecurityException -> L57 java.io.FileNotFoundException -> L5e
            r7.getClass()     // Catch: java.lang.RuntimeException -> L50 java.lang.SecurityException -> L57 java.io.FileNotFoundException -> L5e
            java.lang.String r8 = "r"
            r6.<init>(r7, r8)     // Catch: java.lang.RuntimeException -> L50 java.lang.SecurityException -> L57 java.io.FileNotFoundException -> L5e
            r9.f4639e = r6
            r6.seek(r1)     // Catch: java.io.IOException -> L49
            long r5 = r10.f4603g     // Catch: java.io.IOException -> L49
            r7 = -1
            int r0 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r0 != 0) goto L30
            java.io.RandomAccessFile r0 = r9.f4639e     // Catch: java.io.IOException -> L49
            long r5 = r0.length()     // Catch: java.io.IOException -> L49
            long r5 = r5 - r1
        L30:
            r9.f4641g = r5     // Catch: java.io.IOException -> L49
            r0 = 0
            int r0 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r0 < 0) goto L40
            r9.f4642h = r3
            r9.u(r10)
            long r0 = r9.f4641g
            return r0
        L40:
            h1.t r10 = new h1.t
            r0 = 2008(0x7d8, float:2.814E-42)
            r1 = 0
            r10.<init>(r0, r1, r1)
            throw r10
        L49:
            r10 = move-exception
            h1.t r0 = new h1.t
            r0.<init>(r4, r10)
            throw r0
        L50:
            r10 = move-exception
            h1.t r0 = new h1.t
            r0.<init>(r4, r10)
            throw r0
        L57:
            r10 = move-exception
            h1.t r0 = new h1.t
            r0.<init>(r5, r10)
            throw r0
        L5e:
            r10 = move-exception
            java.lang.String r1 = r0.getQuery()
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 == 0) goto L8c
            java.lang.String r1 = r0.getFragment()
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 == 0) goto L8c
            h1.t r0 = new h1.t
            int r1 = f1.b0.f3799a
            r2 = 21
            if (r1 < r2) goto L86
            java.lang.Throwable r1 = r10.getCause()
            boolean r1 = h1.s.a(r1)
            if (r1 == 0) goto L86
            goto L88
        L86:
            r5 = 2005(0x7d5, float:2.81E-42)
        L88:
            r0.<init>(r5, r10)
            throw r0
        L8c:
            h1.t r1 = new h1.t
            r2 = 3
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r4 = 0
            java.lang.String r5 = r0.getPath()
            r2[r4] = r5
            java.lang.String r4 = r0.getQuery()
            r2[r3] = r4
            r3 = 2
            java.lang.String r0 = r0.getFragment()
            r2[r3] = r0
            java.lang.String r0 = "uri has query and/or fragment, which are not supported. Did you call Uri.parse() on a string containing '?' or '#'? Use Uri.fromFile(new File(path)) to avoid this. path=%s,query=%s,fragment=%s"
            java.lang.String r0 = java.lang.String.format(r0, r2)
            r2 = 1004(0x3ec, float:1.407E-42)
            r1.<init>(r2, r0, r10)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: h1.u.m(h1.l):long");
    }

    @Override // c1.l
    public final int p(byte[] bArr, int i10, int i11) {
        if (i11 == 0) {
            return 0;
        }
        long j4 = this.f4641g;
        if (j4 == 0) {
            return -1;
        }
        try {
            RandomAccessFile randomAccessFile = this.f4639e;
            int i12 = f1.b0.f3799a;
            int read = randomAccessFile.read(bArr, i10, (int) Math.min(j4, i11));
            if (read > 0) {
                this.f4641g -= read;
                r(read);
            }
            return read;
        } catch (IOException e10) {
            throw new t(2000, e10);
        }
    }
}
