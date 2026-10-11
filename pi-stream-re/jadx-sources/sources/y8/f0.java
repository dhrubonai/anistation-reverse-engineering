package y8;

import java.io.Closeable;
import java.io.IOException;

/* loaded from: classes.dex */
public abstract class f0 implements Closeable {
    public final byte[] a() {
        e0 e0Var = (e0) this;
        long j4 = e0Var.f11705b;
        if (j4 <= 2147483647L) {
            k9.i iVar = e0Var.f11706c;
            try {
                byte[] l10 = iVar.l();
                r6.h0.A(iVar, null);
                int length = l10.length;
                if (j4 != -1 && j4 != length) {
                    throw new IOException("Content-Length (" + j4 + ") and stream length (" + length + ") disagree");
                }
                return l10;
            } finally {
            }
        } else {
            throw new IOException(a3.g.q("Cannot buffer entire body for content length: ", j4));
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        z8.b.c(f());
    }

    public abstract k9.i f();

    /* JADX WARN: Code restructure failed: missing block: B:24:0x004f, code lost:
    
        if (r2 == null) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String q() {
        /*
            r8 = this;
            r0 = r8
            y8.e0 r0 = (y8.e0) r0
            k9.i r0 = r0.f11706c
            r1 = r8
            y8.e0 r1 = (y8.e0) r1     // Catch: java.lang.Throwable -> L1f
            int r2 = r1.f11704a     // Catch: java.lang.Throwable -> L1f
            java.lang.Object r1 = r1.f11707d     // Catch: java.lang.Throwable -> L1f
            r3 = 0
            switch(r2) {
                case 0: goto L11;
                default: goto L10;
            }     // Catch: java.lang.Throwable -> L1f
        L10:
            goto L14
        L11:
            y8.s r1 = (y8.s) r1     // Catch: java.lang.Throwable -> L1f
            goto L22
        L14:
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Throwable -> L1f
            if (r1 == 0) goto L21
            java.util.regex.Pattern r2 = y8.s.f11790d     // Catch: java.lang.Throwable -> L1f
            y8.s r1 = y8.j.k(r1)     // Catch: java.lang.Throwable -> L1f java.lang.IllegalArgumentException -> L21
            goto L22
        L1f:
            r1 = move-exception
            goto L5f
        L21:
            r1 = r3
        L22:
            if (r1 == 0) goto L51
            java.nio.charset.Charset r2 = o7.a.f8311a     // Catch: java.lang.Throwable -> L1f
            java.lang.String[] r1 = r1.f11794c     // Catch: java.lang.Throwable -> L1f
            int r4 = r1.length     // Catch: java.lang.Throwable -> L1f
            int r4 = r4 + (-1)
            r5 = 2
            r6 = 0
            int r4 = com.bumptech.glide.d.C(r6, r4, r5)     // Catch: java.lang.Throwable -> L1f
            if (r4 < 0) goto L47
        L33:
            r5 = r1[r6]     // Catch: java.lang.Throwable -> L1f
            java.lang.String r7 = "charset"
            boolean r5 = o7.j.l1(r5, r7)     // Catch: java.lang.Throwable -> L1f
            if (r5 == 0) goto L42
            int r6 = r6 + 1
            r1 = r1[r6]     // Catch: java.lang.Throwable -> L1f
            goto L48
        L42:
            if (r6 == r4) goto L47
            int r6 = r6 + 2
            goto L33
        L47:
            r1 = r3
        L48:
            if (r1 != 0) goto L4b
            goto L4f
        L4b:
            java.nio.charset.Charset r2 = java.nio.charset.Charset.forName(r1)     // Catch: java.lang.Throwable -> L1f java.lang.IllegalArgumentException -> L4f
        L4f:
            if (r2 != 0) goto L53
        L51:
            java.nio.charset.Charset r2 = o7.a.f8311a     // Catch: java.lang.Throwable -> L1f
        L53:
            java.nio.charset.Charset r1 = z8.b.r(r0, r2)     // Catch: java.lang.Throwable -> L1f
            java.lang.String r1 = r0.E(r1)     // Catch: java.lang.Throwable -> L1f
            r6.h0.A(r0, r3)
            return r1
        L5f:
            throw r1     // Catch: java.lang.Throwable -> L60
        L60:
            r2 = move-exception
            r6.h0.A(r0, r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: y8.f0.q():java.lang.String");
    }
}
