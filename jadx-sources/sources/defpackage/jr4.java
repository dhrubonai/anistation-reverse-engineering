package defpackage;

import java.util.concurrent.locks.ReentrantLock;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class jr4 {
    public final int a;
    public final sb2 b;
    public final ReentrantLock c = new ReentrantLock();
    public int d;
    public boolean e;
    public final ow0[] f;
    public final gi5 g;
    public final bs h;

    /* JADX WARN: Type inference failed for: r2v4, types: [gi5, fi5] */
    public jr4(int i, sb2 sb2Var) {
        this.a = i;
        this.b = sb2Var;
        this.f = new ow0[i];
        int i2 = hi5.a;
        this.g = new fi5(i);
        this.h = new bs(i);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0047 A[Catch: all -> 0x007a, TryCatch #1 {all -> 0x007a, blocks: (B:13:0x0043, B:15:0x0047, B:17:0x004d, B:20:0x0054, B:21:0x006e, B:25:0x007c, B:26:0x0083), top: B:12:0x0043, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x007c A[Catch: all -> 0x007a, TRY_ENTER, TryCatch #1 {all -> 0x007a, blocks: (B:13:0x0043, B:15:0x0047, B:17:0x004d, B:20:0x0054, B:21:0x006e, B:25:0x007c, B:26:0x0083), top: B:12:0x0043, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.xz0 r7) {
        /*
            r6 = this;
            bs r0 = r6.h
            boolean r1 = r7 instanceof defpackage.hr4
            if (r1 == 0) goto L15
            r1 = r7
            hr4 r1 = (defpackage.hr4) r1
            int r2 = r1.z
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.z = r2
            goto L1a
        L15:
            hr4 r1 = new hr4
            r1.<init>(r6, r7)
        L1a:
            java.lang.Object r7 = r1.x
            int r2 = r1.z
            r3 = 0
            gi5 r4 = r6.g
            r5 = 1
            if (r2 == 0) goto L30
            if (r2 != r5) goto L2a
            defpackage.m37.N(r7)
            goto L3e
        L2a:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ze0.m(r6)
            return r3
        L30:
            defpackage.m37.N(r7)
            r1.z = r5
            java.lang.Object r7 = r4.b(r1)
            w11 r1 = defpackage.w11.x
            if (r7 != r1) goto L3e
            return r1
        L3e:
            java.util.concurrent.locks.ReentrantLock r7 = r6.c     // Catch: java.lang.Throwable -> L78
            r7.lock()     // Catch: java.lang.Throwable -> L78
            boolean r1 = r6.e     // Catch: java.lang.Throwable -> L7a
            if (r1 != 0) goto L7c
            boolean r1 = r0.isEmpty()     // Catch: java.lang.Throwable -> L7a
            if (r1 == 0) goto L6e
            int r1 = r6.d     // Catch: java.lang.Throwable -> L7a
            int r2 = r6.a     // Catch: java.lang.Throwable -> L7a
            if (r1 < r2) goto L54
            goto L6e
        L54:
            ow0 r1 = new ow0     // Catch: java.lang.Throwable -> L7a
            sb2 r2 = r6.b     // Catch: java.lang.Throwable -> L7a
            java.lang.Object r2 = r2.invoke()     // Catch: java.lang.Throwable -> L7a
            g85 r2 = (defpackage.g85) r2     // Catch: java.lang.Throwable -> L7a
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L7a
            ow0[] r2 = r6.f     // Catch: java.lang.Throwable -> L7a
            int r3 = r6.d     // Catch: java.lang.Throwable -> L7a
            int r5 = r3 + 1
            r6.d = r5     // Catch: java.lang.Throwable -> L7a
            r2[r3] = r1     // Catch: java.lang.Throwable -> L7a
            r0.addLast(r1)     // Catch: java.lang.Throwable -> L7a
        L6e:
            java.lang.Object r6 = r0.removeLast()     // Catch: java.lang.Throwable -> L7a
            ow0 r6 = (defpackage.ow0) r6     // Catch: java.lang.Throwable -> L7a
            r7.unlock()     // Catch: java.lang.Throwable -> L78
            return r6
        L78:
            r6 = move-exception
            goto L88
        L7a:
            r6 = move-exception
            goto L84
        L7c:
            java.lang.String r6 = "Connection pool is closed"
            r0 = 21
            defpackage.zz.c0(r0, r6)     // Catch: java.lang.Throwable -> L7a
            throw r3     // Catch: java.lang.Throwable -> L7a
        L84:
            r7.unlock()     // Catch: java.lang.Throwable -> L78
            throw r6     // Catch: java.lang.Throwable -> L78
        L88:
            r4.d()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jr4.a(xz0):java.lang.Object");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:9|(2:10|11)|12|13|14|(1:(1:38)(2:35|(1:37)))(1:16)|17|18|19|20|(3:22|23|(1:25)(10:27|12|13|14|(0)(0)|17|18|19|20|(2:28|29)(0)))(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0077, code lost:
    
        r1 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0079, code lost:
    
        r13 = r13;
        r12 = r12;
        r1 = r0;
        r0 = r1;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0082 A[Catch: all -> 0x0086, TryCatch #0 {all -> 0x0086, blocks: (B:14:0x007e, B:16:0x0082, B:35:0x008a, B:38:0x0091), top: B:13:0x007e }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0055 A[Catch: all -> 0x0077, TRY_LEAVE, TryCatch #1 {all -> 0x0077, blocks: (B:20:0x003c, B:22:0x0055, B:28:0x006a, B:29:0x0071), top: B:19:0x003c }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x006a A[Catch: all -> 0x0077, TRY_ENTER, TryCatch #1 {all -> 0x0077, blocks: (B:20:0x003c, B:22:0x0055, B:28:0x006a, B:29:0x0071), top: B:19:0x003c }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /* JADX WARN: Type inference failed for: r13v2, types: [java.lang.Object, w05] */
    /* JADX WARN: Type inference failed for: r1v11, types: [sb2] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x0063 -> B:12:0x0065). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(long r10, defpackage.l40 r12, defpackage.xz0 r13) {
        /*
            r9 = this;
            boolean r0 = r13 instanceof defpackage.ir4
            if (r0 == 0) goto L13
            r0 = r13
            ir4 r0 = (defpackage.ir4) r0
            int r1 = r0.C
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.C = r1
            goto L18
        L13:
            ir4 r0 = new ir4
            r0.<init>(r9, r13)
        L18:
            java.lang.Object r13 = r0.A
            int r1 = r0.C
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L34
            if (r1 != r2) goto L2e
            long r10 = r0.x
            w05 r12 = r0.z
            sb2 r1 = r0.y
            defpackage.m37.N(r13)     // Catch: java.lang.Throwable -> L2c
            goto L65
        L2c:
            r13 = move-exception
            goto L79
        L2e:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ze0.m(r9)
            return r3
        L34:
            defpackage.m37.N(r13)
        L37:
            w05 r13 = new w05
            r13.<init>()
            e0 r1 = new e0     // Catch: java.lang.Throwable -> L77
            r4 = 28
            r1.<init>(r13, r9, r3, r4)     // Catch: java.lang.Throwable -> L77
            r0.y = r12     // Catch: java.lang.Throwable -> L77
            r0.z = r13     // Catch: java.lang.Throwable -> L77
            r0.x = r10     // Catch: java.lang.Throwable -> L77
            r0.C = r2     // Catch: java.lang.Throwable -> L77
            long r4 = defpackage.x97.T(r10)     // Catch: java.lang.Throwable -> L77
            r6 = 0
            int r6 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r6 <= 0) goto L6a
            rf6 r6 = new rf6     // Catch: java.lang.Throwable -> L77
            r6.<init>(r4, r0)     // Catch: java.lang.Throwable -> L77
            java.lang.Object r1 = defpackage.rz5.d(r6, r1)     // Catch: java.lang.Throwable -> L77
            w11 r4 = defpackage.w11.x
            if (r1 != r4) goto L63
            return r4
        L63:
            r1 = r12
            r12 = r13
        L65:
            r13 = r12
            r12 = r1
            r1 = r0
            r0 = r3
            goto L7e
        L6a:
            qf6 r1 = new qf6     // Catch: java.lang.Throwable -> L77
            java.lang.String r4 = "Timed out immediately"
            r1.<init>(r4, r3)     // Catch: java.lang.Throwable -> L77
            throw r1     // Catch: java.lang.Throwable -> L77
        L72:
            r8 = r1
            r1 = r12
            r12 = r13
            r13 = r8
            goto L79
        L77:
            r1 = move-exception
            goto L72
        L79:
            r8 = r13
            r13 = r12
            r12 = r1
            r1 = r0
            r0 = r8
        L7e:
            boolean r4 = r0 instanceof defpackage.qf6     // Catch: java.lang.Throwable -> L86
            if (r4 == 0) goto L88
            r12.invoke()     // Catch: java.lang.Throwable -> L86
            goto L8f
        L86:
            r10 = move-exception
            goto L92
        L88:
            if (r0 != 0) goto L91
            java.lang.Object r13 = r13.x     // Catch: java.lang.Throwable -> L86
            if (r13 == 0) goto L8f
            return r13
        L8f:
            r0 = r1
            goto L37
        L91:
            throw r0     // Catch: java.lang.Throwable -> L86
        L92:
            java.lang.Object r11 = r13.x
            ow0 r11 = (defpackage.ow0) r11
            if (r11 == 0) goto L9b
            r9.e(r11)
        L9b:
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jr4.b(long, l40, xz0):java.lang.Object");
    }

    public final void c() {
        ReentrantLock reentrantLock = this.c;
        reentrantLock.lock();
        try {
            this.e = true;
            for (ow0 ow0Var : this.f) {
                if (ow0Var != null) {
                    ow0Var.close();
                }
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void d(StringBuilder sb) {
        String str;
        bs bsVar = this.h;
        ReentrantLock reentrantLock = this.c;
        reentrantLock.lock();
        try {
            ai3 y = te4.y();
            int i = bsVar.z;
            for (int i2 = 0; i2 < i; i2++) {
                y.add(bsVar.get(i2));
            }
            ai3 r = te4.r(y);
            sb.append('\t' + toString() + " (");
            sb.append("capacity=" + this.a + ", ");
            sb.append("permits=" + Math.max(qs.a.getIntVolatile(this.g, fi5.C), 0) + ", ");
            sb.append("queue=(size=" + r.b() + ")[" + yo0.q0(r, null, null, null, null, 63) + ']');
            sb.append(")");
            sb.append('\n');
            int i3 = 0;
            for (ow0 ow0Var : this.f) {
                i3++;
                StringBuilder sb2 = new StringBuilder();
                sb2.append("\t\t[");
                sb2.append(i3);
                sb2.append("] - ");
                if (ow0Var != null) {
                    str = ow0Var.x.toString();
                } else {
                    str = null;
                }
                sb2.append(str);
                sb.append(sb2.toString());
                sb.append('\n');
                if (ow0Var != null) {
                    ow0Var.p(sb);
                }
            }
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final void e(ow0 ow0Var) {
        ReentrantLock reentrantLock = this.c;
        reentrantLock.lock();
        try {
            this.h.addLast(ow0Var);
            reentrantLock.unlock();
            this.g.d();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }
}
