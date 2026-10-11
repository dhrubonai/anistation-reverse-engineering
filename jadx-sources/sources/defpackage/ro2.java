package defpackage;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public final class ro2 extends po2 {
    public final ws2 A;
    public long B;
    public boolean C;
    public final /* synthetic */ uo2 D;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ro2(uo2 uo2Var, ws2 ws2Var) {
        super(uo2Var);
        ws2Var.getClass();
        this.D = uo2Var;
        this.A = ws2Var;
        this.B = -1L;
        this.C = true;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        boolean z;
        if (this.y) {
            return;
        }
        if (this.C) {
            byte[] bArr = dq6.a;
            TimeUnit.MILLISECONDS.getClass();
            try {
                z = dq6.t(this, 100);
            } catch (IOException unused) {
                z = false;
            }
            if (!z) {
                this.D.b.k();
                a();
            }
        }
        this.y = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0078, code lost:
    
        if (r11.C == false) goto L27;
     */
    @Override // defpackage.po2, defpackage.bv5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long j0(long r12, defpackage.pa0 r14) {
        /*
            r11 = this;
            uo2 r0 = r11.D
            db0 r1 = r0.c
            r14.getClass()
            r2 = 0
            int r4 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r4 < 0) goto Lcc
            boolean r4 = r11.y
            if (r4 != 0) goto Lc6
            boolean r4 = r11.C
            r5 = -1
            if (r4 != 0) goto L18
            goto L7a
        L18:
            long r7 = r11.B
            int r4 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r4 == 0) goto L22
            int r4 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r4 != 0) goto L7b
        L22:
            java.lang.String r4 = "expected chunk size and optional extensions but was \""
            int r7 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r7 == 0) goto L2b
            r1.e0()
        L2b:
            long r7 = r1.r0()     // Catch: java.lang.NumberFormatException -> Lbb
            r11.B = r7     // Catch: java.lang.NumberFormatException -> Lbb
            java.lang.String r1 = r1.e0()     // Catch: java.lang.NumberFormatException -> Lbb
            java.lang.CharSequence r1 = defpackage.uz5.w0(r1)     // Catch: java.lang.NumberFormatException -> Lbb
            java.lang.String r1 = r1.toString()     // Catch: java.lang.NumberFormatException -> Lbb
            long r7 = r11.B     // Catch: java.lang.NumberFormatException -> Lbb
            int r7 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r7 < 0) goto L9f
            int r7 = r1.length()     // Catch: java.lang.NumberFormatException -> Lbb
            r8 = 0
            if (r7 <= 0) goto L52
            java.lang.String r7 = ";"
            boolean r7 = defpackage.b06.I(r1, r7, r8)     // Catch: java.lang.NumberFormatException -> Lbb
            if (r7 == 0) goto L9f
        L52:
            long r9 = r11.B
            int r1 = (r9 > r2 ? 1 : (r9 == r2 ? 0 : -1))
            if (r1 != 0) goto L76
            r11.C = r8
            ok2 r1 = r0.f
            ik2 r1 = r1.D()
            r0.g = r1
            jd4 r1 = r0.a
            r1.getClass()
            l68 r1 = r1.G
            ik2 r2 = r0.g
            r2.getClass()
            ws2 r3 = r11.A
            defpackage.pq2.b(r1, r3, r2)
            r11.a()
        L76:
            boolean r1 = r11.C
            if (r1 != 0) goto L7b
        L7a:
            return r5
        L7b:
            long r1 = r11.B
            long r12 = java.lang.Math.min(r12, r1)
            long r12 = super.j0(r12, r14)
            int r14 = (r12 > r5 ? 1 : (r12 == r5 ? 0 : -1))
            if (r14 == 0) goto L8f
            long r0 = r11.B
            long r0 = r0 - r12
            r11.B = r0
            return r12
        L8f:
            ez4 r12 = r0.b
            r12.k()
            java.net.ProtocolException r12 = new java.net.ProtocolException
            java.lang.String r13 = "unexpected end of stream"
            r12.<init>(r13)
            r11.a()
            throw r12
        L9f:
            java.net.ProtocolException r12 = new java.net.ProtocolException     // Catch: java.lang.NumberFormatException -> Lbb
            java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch: java.lang.NumberFormatException -> Lbb
            r13.<init>(r4)     // Catch: java.lang.NumberFormatException -> Lbb
            long r2 = r11.B     // Catch: java.lang.NumberFormatException -> Lbb
            r13.append(r2)     // Catch: java.lang.NumberFormatException -> Lbb
            r13.append(r1)     // Catch: java.lang.NumberFormatException -> Lbb
            r11 = 34
            r13.append(r11)     // Catch: java.lang.NumberFormatException -> Lbb
            java.lang.String r11 = r13.toString()     // Catch: java.lang.NumberFormatException -> Lbb
            r12.<init>(r11)     // Catch: java.lang.NumberFormatException -> Lbb
            throw r12     // Catch: java.lang.NumberFormatException -> Lbb
        Lbb:
            r11 = move-exception
            java.net.ProtocolException r12 = new java.net.ProtocolException
            java.lang.String r11 = r11.getMessage()
            r12.<init>(r11)
            throw r12
        Lc6:
            java.lang.String r11 = "closed"
            defpackage.ze0.m(r11)
            return r2
        Lcc:
            java.lang.String r11 = "byteCount < 0: "
            java.lang.String r11 = defpackage.h11.h(r12, r11)
            defpackage.ze0.e(r11)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ro2.j0(long, pa0):long");
    }
}
