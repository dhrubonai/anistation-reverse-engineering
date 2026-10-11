package defpackage;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.List;
import javax.crypto.spec.SecretKeySpec;
import javax.net.ssl.SSLException;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public final class g56 implements v11 {
    public final oa0 A;
    public final byte[] B;
    public final d46 C;
    public final d46 D;
    public final su4 E;
    public boolean F;
    public final k5 G;
    public final su4 H;
    private volatile SecretKeySpec masterSecret;
    private volatile t56 serverHello;
    public final kz x;
    public final l11 y;
    public final ar0 z;

    /* JADX WARN: Type inference failed for: r10v1, types: [java.lang.Object, oa0] */
    /* JADX WARN: Type inference failed for: r4v3, types: [t43, nj0, k5, s0] */
    public g56(wc0 wc0Var, ae0 ae0Var, kz kzVar, l11 l11Var) {
        j43 e = h98.e();
        wc0Var.getClass();
        ae0Var.getClass();
        kzVar.getClass();
        l11Var.getClass();
        this.x = kzVar;
        this.y = l11Var;
        this.z = e;
        this.A = new Object();
        byte[] bArr = new byte[32];
        ((SecureRandom) kzVar.x).nextBytes(bArr);
        long currentTimeMillis = System.currentTimeMillis() / 1000;
        final byte b = 0;
        bArr[0] = (byte) (currentTimeMillis >> 24);
        final byte b2 = 1;
        bArr[1] = (byte) (currentTimeMillis >> 16);
        bArr[2] = (byte) (currentTimeMillis >> 8);
        bArr[3] = (byte) currentTimeMillis;
        this.B = bArr;
        this.C = new d46(new sb2(this) { // from class: x46
            public final /* synthetic */ g56 y;

            {
                this.y = this;
            }

            @Override // defpackage.sb2
            public final Object invoke() {
                byte b3 = b;
                g56 g56Var = this.y;
                switch (b3) {
                    case 0:
                        return g56.d(g56Var);
                    default:
                        return g56.a(g56Var);
                }
            }
        });
        this.D = new d46(new sb2(this) { // from class: x46
            public final /* synthetic */ g56 y;

            {
                this.y = this;
            }

            @Override // defpackage.sb2
            public final Object invoke() {
                byte b3 = b2;
                g56 g56Var = this.y;
                switch (b3) {
                    case 0:
                        return g56.d(g56Var);
                    default:
                        return g56.a(g56Var);
                }
            }
        });
        vz0 vz0Var = null;
        this.E = n77.X(this, new r11("cio-tls-parser"), new iy6(wc0Var, this, null), 2);
        r11 r11Var = new r11("cio-tls-encoder");
        j10 j10Var = new j10(this, ae0Var, vz0Var, (byte) 9);
        l11 E = bx7.E(this, r11Var);
        ?? nj0Var = new nj0(E, iv.d(0, 6, null), false, true);
        nj0Var.N((h43) E.get(h95.F));
        nj0Var.i0(y11.x, nj0Var, j10Var);
        nj0Var.j0(new ll5((Object) this, (Object) ae0Var, (byte) 5));
        this.G = nj0Var;
        this.H = n77.X(this, new r11("cio-tls-handshake"), new j10(this, vz0Var, (byte) 8), 2);
    }

    public static final v46 a(g56 g56Var) {
        t56 t56Var = g56Var.serverHello;
        if (t56Var != null) {
            cm0 cm0Var = t56Var.c;
            byte[] bArr = (byte[]) g56Var.C.getValue();
            bArr.getClass();
            int ordinal = cm0Var.n.ordinal();
            if (ordinal != 0) {
                if (ordinal == 1) {
                    return new de0(cm0Var, bArr);
                }
                ze0.l();
                return null;
            }
            return new ad2(cm0Var, bArr);
        }
        a34.s0("serverHello");
        throw null;
    }

    public static final byte[] d(g56 g56Var) {
        t56 t56Var = g56Var.serverHello;
        if (t56Var != null) {
            cm0 cm0Var = t56Var.c;
            SecretKeySpec secretKeySpec = g56Var.masterSecret;
            if (secretKeySpec != null) {
                t56 t56Var2 = g56Var.serverHello;
                if (t56Var2 != null) {
                    byte[] Q0 = ms.Q0(t56Var2.a, g56Var.B);
                    int i = cm0Var.o;
                    int i2 = cm0Var.p;
                    int i3 = cm0Var.g * 2;
                    return sw0.c(secretKeySpec, u83.b, Q0, i3 + (i * 2) + (i2 * 2));
                }
                a34.s0("serverHello");
                throw null;
            }
            a34.s0("masterSecret");
            throw null;
        }
        a34.s0("serverHello");
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:122:0x0354, code lost:
    
        throw new javax.net.ssl.SSLException("Certificate length is too big", null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x035b, code lost:
    
        throw new javax.net.ssl.SSLException("Certificate length is too big", null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00a5, code lost:
    
        if (r0.c(r11, (java.security.cert.Certificate) r1, r9, r3, r2) == r6) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00a7, code lost:
    
        return r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x006a, code lost:
    
        if (r1 != r6) goto L22;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:263:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /* JADX WARN: Type inference failed for: r10v0 */
    /* JADX WARN: Type inference failed for: r10v1, types: [w05] */
    /* JADX WARN: Type inference failed for: r10v6 */
    /* JADX WARN: Type inference failed for: r10v7 */
    /* JADX WARN: Type inference failed for: r11v23, types: [cv5, java.lang.Object, oa0] */
    /* JADX WARN: Type inference failed for: r13v31, types: [cv5, qq5, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v14, types: [nt1] */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v23, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r7v23 */
    /* JADX WARN: Type inference failed for: r7v24, types: [java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r7v50 */
    /* JADX WARN: Type inference failed for: r8v2, types: [bf5, java.lang.Throwable, r18, w05, cu1] */
    /* JADX WARN: Type inference failed for: r8v25 */
    /* JADX WARN: Type inference failed for: r8v26 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:43:0x006a -> B:17:0x006d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(defpackage.xz0 r29) {
        /*
            Method dump skipped, instructions count: 1497
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.g56.b(xz0):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x01b7, code lost:
    
        if (h(r4) != r5) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0089, code lost:
    
        if (r9 == r5) goto L87;
     */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0235  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x006e  */
    /* JADX WARN: Type inference failed for: r1v13, types: [qq5, java.lang.Object, oa0] */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, oa0] */
    /* JADX WARN: Type inference failed for: r6v29, types: [qq5, java.lang.Object, oa0] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(defpackage.bf5 r18, java.security.cert.Certificate r19, defpackage.r18 r20, defpackage.cu1 r21, defpackage.xz0 r22) {
        /*
            Method dump skipped, instructions count: 569
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.g56.c(bf5, java.security.cert.Certificate, r18, cu1, xz0):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x008b, code lost:
    
        if (r7 == r2) goto L53;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00a9 A[Catch: all -> 0x00cd, TryCatch #6 {all -> 0x00cd, blocks: (B:25:0x00bb, B:20:0x00a1, B:22:0x00a9, B:16:0x008e, B:10:0x0074), top: B:9:0x0074 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0027 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x006a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(defpackage.xz0 r13) {
        /*
            Method dump skipped, instructions count: 225
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.g56.e(xz0):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(defpackage.xz0 r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof defpackage.b56
            if (r0 == 0) goto L13
            r0 = r6
            b56 r0 = (defpackage.b56) r0
            int r1 = r0.z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.z = r1
            goto L18
        L13:
            b56 r0 = new b56
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.x
            w11 r1 = defpackage.w11.x
            int r2 = r0.z
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L2e
            if (r2 != r4) goto L28
            defpackage.m37.N(r6)
            goto L3e
        L28:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ze0.m(r5)
            return r3
        L2e:
            defpackage.m37.N(r6)
            su4 r6 = r5.H
            r0.z = r4
            za0 r6 = r6.B
            java.lang.Object r6 = r6.g(r0)
            if (r6 != r1) goto L3e
            return r1
        L3e:
            n56 r6 = (defpackage.n56) r6
            o56 r0 = r6.a
            o56 r1 = defpackage.o56.F
            if (r0 != r1) goto Laf
            oa0 r6 = r6.b
            r6.getClass()
            r0 = -1
            byte[] r6 = defpackage.nv5.p(r6, r0)
            oa0 r0 = r5.A
            t56 r1 = r5.serverHello
            if (r1 == 0) goto La9
            cm0 r1 = r1.c
            vj2 r1 = r1.l
            java.lang.String r1 = r1.y
            byte[] r0 = defpackage.jg1.a(r0, r1)
            javax.crypto.spec.SecretKeySpec r5 = r5.masterSecret
            if (r5 == 0) goto La3
            int r1 = r6.length
            byte[] r2 = defpackage.u83.d
            byte[] r5 = defpackage.sw0.c(r5, r2, r0, r1)
            boolean r0 = java.util.Arrays.equals(r6, r5)
            if (r0 == 0) goto L74
            pn6 r5 = defpackage.pn6.a
            return r5
        L74:
            k56 r0 = new k56
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Handshake: ServerFinished verification failed:\n                |Expected: "
            r1.<init>(r2)
            r2 = 63
            java.lang.String r5 = defpackage.ms.O0(r5, r3, r3, r2)
            r1.append(r5)
            java.lang.String r5 = "\n                |Actual: "
            r1.append(r5)
            java.lang.String r5 = defpackage.ms.O0(r6, r3, r3, r2)
            r1.append(r5)
            java.lang.String r5 = "\n                "
            r1.append(r5)
            java.lang.String r5 = r1.toString()
            java.lang.String r5 = defpackage.vz5.v(r5)
            r0.<init>(r5, r3)
            throw r0
        La3:
            java.lang.String r5 = "masterSecret"
            defpackage.a34.s0(r5)
            throw r3
        La9:
            java.lang.String r5 = "serverHello"
            defpackage.a34.s0(r5)
            throw r3
        Laf:
            k56 r5 = new k56
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Finished handshake expected, received: "
            r0.<init>(r1)
            r0.append(r6)
            java.lang.String r6 = r0.toString()
            r5.<init>(r6, r3)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.g56.f(xz0):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /* JADX WARN: Type inference failed for: r14v24, types: [qq5, java.lang.Object, oa0] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(defpackage.xz0 r14) {
        /*
            Method dump skipped, instructions count: 307
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.g56.g(xz0):java.lang.Object");
    }

    @Override // defpackage.v11
    public final l11 getCoroutineContext() {
        return this.y;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Type inference failed for: r7v2, types: [cv5, java.lang.Object, oa0] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h(defpackage.xz0 r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof defpackage.d56
            if (r0 == 0) goto L13
            r0 = r7
            d56 r0 = (defpackage.d56) r0
            int r1 = r0.A
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.A = r1
            goto L18
        L13:
            d56 r0 = new d56
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.y
            int r1 = r0.A
            r2 = 1
            if (r1 == 0) goto L30
            if (r1 != r2) goto L29
            oa0 r6 = r0.x
            defpackage.m37.N(r7)     // Catch: java.lang.Throwable -> L27
            goto L53
        L27:
            r7 = move-exception
            goto L5a
        L29:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ze0.m(r6)
            r6 = 0
            return r6
        L30:
            defpackage.m37.N(r7)
            oa0 r7 = new oa0
            r7.<init>()
            r7.l0(r2)
            k5 r6 = r6.G     // Catch: java.lang.Throwable -> L56
            p56 r1 = new p56     // Catch: java.lang.Throwable -> L56
            r56 r3 = defpackage.r56.A     // Catch: java.lang.Throwable -> L56
            z56 r4 = defpackage.z56.A     // Catch: java.lang.Throwable -> L56
            r1.<init>(r3, r4, r7)     // Catch: java.lang.Throwable -> L56
            r0.x = r7     // Catch: java.lang.Throwable -> L56
            r0.A = r2     // Catch: java.lang.Throwable -> L56
            java.lang.Object r6 = r6.b(r0, r1)     // Catch: java.lang.Throwable -> L56
            w11 r7 = defpackage.w11.x
            if (r6 != r7) goto L53
            return r7
        L53:
            pn6 r6 = defpackage.pn6.a
            return r6
        L56:
            r6 = move-exception
            r5 = r7
            r7 = r6
            r6 = r5
        L5a:
            r6.getClass()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.g56.h(xz0):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.w11 i(defpackage.xz0 r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof defpackage.e56
            if (r0 == 0) goto L13
            r0 = r6
            e56 r0 = (defpackage.e56) r0
            int r1 = r0.z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.z = r1
            goto L18
        L13:
            e56 r0 = new e56
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.x
            int r1 = r0.z
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L2c
            if (r1 != r2) goto L26
            defpackage.m37.N(r6)
            return r3
        L26:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ze0.m(r5)
            return r3
        L2c:
            defpackage.m37.N(r6)
            kz r6 = r5.x
            java.lang.Object r6 = r6.y
            java.util.ArrayList r6 = (java.util.ArrayList) r6
            java.util.Iterator r6 = r6.iterator()
            boolean r1 = r6.hasNext()
            if (r1 != 0) goto L54
            o56 r6 = defpackage.o56.D
            tg5 r1 = new tg5
            r4 = 22
            r1.<init>(r4)
            r0.z = r2
            java.lang.Object r5 = r5.j(r6, r1, r0)
            w11 r6 = defpackage.w11.x
            if (r5 != r6) goto L53
            return r6
        L53:
            return r3
        L54:
            java.lang.ClassCastException r5 = defpackage.qx1.f(r6)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.g56.i(xz0):w11");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Type inference failed for: r10v2, types: [cv5, java.lang.Object, oa0] */
    /* JADX WARN: Type inference failed for: r9v1, types: [cv5, qq5, java.lang.Object, oa0] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object j(defpackage.o56 r8, defpackage.ub2 r9, defpackage.xz0 r10) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof defpackage.f56
            if (r0 == 0) goto L13
            r0 = r10
            f56 r0 = (defpackage.f56) r0
            int r1 = r0.A
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.A = r1
            goto L18
        L13:
            f56 r0 = new f56
            r0.<init>(r7, r10)
        L18:
            java.lang.Object r10 = r0.y
            w11 r1 = defpackage.w11.x
            int r2 = r0.A
            r3 = 1
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2b
            p56 r7 = r0.x
            defpackage.m37.N(r10)     // Catch: java.lang.Throwable -> L29
            goto L74
        L29:
            r8 = move-exception
            goto L7b
        L2b:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ze0.m(r7)
            r7 = 0
            return r7
        L32:
            defpackage.m37.N(r10)
            oa0 r10 = new oa0
            r10.<init>()
            r9.invoke(r10)
            oa0 r9 = new oa0
            r9.<init>()
            long r4 = r10.z
            int r2 = (int) r4
            defpackage.w65.c0(r9, r8, r2)
            defpackage.db.w0(r9, r10)
            oa0 r8 = r7.A
            monitor-enter(r8)
            boolean r10 = r9.D()     // Catch: java.lang.Throwable -> L81
            if (r10 == 0) goto L56
        L54:
            monitor-exit(r8)
            goto L5e
        L56:
            qz4 r10 = r9.l()     // Catch: java.lang.Throwable -> L81
            defpackage.db.w0(r8, r10)     // Catch: java.lang.Throwable -> L81
            goto L54
        L5e:
            p56 r8 = new p56
            r56 r10 = defpackage.r56.C
            z56 r2 = defpackage.z56.A
            r8.<init>(r10, r2, r9)
            k5 r7 = r7.G     // Catch: java.lang.Throwable -> L77
            r0.x = r8     // Catch: java.lang.Throwable -> L77
            r0.A = r3     // Catch: java.lang.Throwable -> L77
            java.lang.Object r7 = r7.b(r0, r8)     // Catch: java.lang.Throwable -> L77
            if (r7 != r1) goto L74
            return r1
        L74:
            pn6 r7 = defpackage.pn6.a
            return r7
        L77:
            r7 = move-exception
            r6 = r8
            r8 = r7
            r7 = r6
        L7b:
            cv5 r7 = r7.c
            r7.close()
            throw r8
        L81:
            r7 = move-exception
            monitor-exit(r8)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.g56.j(o56, ub2, xz0):java.lang.Object");
    }

    public final void k(t56 t56Var) {
        cm0 cm0Var = t56Var.c;
        if (((List) this.x.A).contains(cm0Var)) {
            List list = po5.a;
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                wj2 wj2Var = (wj2) obj;
                if (wj2Var.a == cm0Var.l && wj2Var.b == cm0Var.m) {
                    arrayList.add(obj);
                }
            }
            if (!arrayList.isEmpty()) {
                ArrayList arrayList2 = t56Var.d;
                if (!arrayList2.isEmpty()) {
                    if (!arrayList.isEmpty()) {
                        int size = arrayList.size();
                        int i = 0;
                        while (i < size) {
                            Object obj2 = arrayList.get(i);
                            i++;
                            if (arrayList2.contains((wj2) obj2)) {
                                return;
                            }
                        }
                    }
                    throw new SSLException("No sign algorithms in common. \nServer candidates: " + arrayList2 + " \nClient candidates: " + arrayList, null);
                }
                return;
            }
            throw new SSLException("No appropriate hash algorithm for suite: " + cm0Var, null);
        }
        p65.f(h11.k(new StringBuilder("Unsupported cipher suite "), cm0Var.b, " in SERVER_HELLO"));
    }
}
