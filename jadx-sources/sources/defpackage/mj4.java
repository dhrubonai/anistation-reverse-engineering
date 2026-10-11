package defpackage;

import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class mj4 implements vh6, by4 {
    public final ic2 a;
    public final g85 b;
    public final AtomicInteger c;
    public uh6 d;

    public mj4(ic2 ic2Var, g85 g85Var) {
        g85Var.getClass();
        this.a = ic2Var;
        this.b = g85Var;
        this.c = new AtomicInteger(0);
    }

    @Override // defpackage.vh6
    public final Object a(uh6 uh6Var, ic2 ic2Var, t36 t36Var) {
        return this.a.invoke(new y8(this, uh6Var, ic2Var, null, (byte) 2), t36Var);
    }

    @Override // defpackage.vh6
    public final Boolean b(vz0 vz0Var) {
        boolean z;
        if (this.d == null && !this.b.j()) {
            z = false;
        } else {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x0046, code lost:
    
        if (r9 == r5) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // defpackage.kr4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(java.lang.String r7, defpackage.ub2 r8, defpackage.xz0 r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof defpackage.kj4
            if (r0 == 0) goto L13
            r0 = r9
            kj4 r0 = (defpackage.kj4) r0
            int r1 = r0.B
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.B = r1
            goto L18
        L13:
            kj4 r0 = new kj4
            r0.<init>(r6, r9)
        L18:
            java.lang.Object r9 = r0.z
            int r1 = r0.B
            r2 = 2
            r3 = 1
            r4 = 0
            w11 r5 = defpackage.w11.x
            if (r1 == 0) goto L39
            if (r1 == r3) goto L31
            if (r1 != r2) goto L2b
            defpackage.m37.N(r9)
            return r9
        L2b:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ze0.m(r6)
            return r4
        L31:
            ub2 r8 = r0.y
            java.lang.String r7 = r0.x
            defpackage.m37.N(r9)
            goto L49
        L39:
            defpackage.m37.N(r9)
            r0.x = r7
            r0.y = r8
            r0.B = r3
            java.lang.Boolean r9 = r6.b(r0)
            if (r9 != r5) goto L49
            goto L64
        L49:
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 == 0) goto L66
            lj4 r9 = new lj4
            r9.<init>(r6, r7, r8, r4)
            r0.x = r4
            r0.y = r4
            r0.B = r2
            ic2 r6 = r6.a
            java.lang.Object r6 = r6.invoke(r9, r0)
            if (r6 != r5) goto L65
        L64:
            return r5
        L65:
            return r6
        L66:
            g85 r6 = r6.b
            m85 r6 = r6.s0(r7)
            java.lang.Object r7 = r8.invoke(r6)     // Catch: java.lang.Throwable -> L74
            defpackage.o80.r(r6, r4)
            return r7
        L74:
            r7 = move-exception
            throw r7     // Catch: java.lang.Throwable -> L76
        L76:
            r8 = move-exception
            defpackage.o80.r(r6, r7)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mj4.c(java.lang.String, ub2, xz0):java.lang.Object");
    }

    @Override // defpackage.by4
    public final g85 d() {
        return this.b;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(defpackage.uh6 r8, defpackage.ic2 r9, defpackage.xz0 r10) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof defpackage.jj4
            if (r0 == 0) goto L13
            r0 = r10
            jj4 r0 = (defpackage.jj4) r0
            int r1 = r0.A
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.A = r1
            goto L18
        L13:
            jj4 r0 = new jj4
            r0.<init>(r7, r10)
        L18:
            java.lang.Object r10 = r0.y
            int r1 = r0.A
            java.lang.String r2 = "ROLLBACK TRANSACTION"
            r3 = 0
            java.util.concurrent.atomic.AtomicInteger r4 = r7.c
            r5 = 1
            g85 r6 = r7.b
            if (r1 == 0) goto L36
            if (r1 != r5) goto L30
            boolean r5 = r0.x
            defpackage.m37.N(r10)     // Catch: java.lang.Throwable -> L2e
            goto L74
        L2e:
            r8 = move-exception
            goto L88
        L30:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ze0.m(r7)
            return r3
        L36:
            defpackage.m37.N(r10)
            int r10 = r8.ordinal()
            if (r10 == 0) goto L54
            if (r10 == r5) goto L4e
            r1 = 2
            if (r10 != r1) goto L4a
            java.lang.String r10 = "BEGIN EXCLUSIVE TRANSACTION"
            defpackage.zz.y(r10, r6)
            goto L59
        L4a:
            defpackage.ze0.l()
            return r3
        L4e:
            java.lang.String r10 = "BEGIN IMMEDIATE TRANSACTION"
            defpackage.zz.y(r10, r6)
            goto L59
        L54:
            java.lang.String r10 = "BEGIN DEFERRED TRANSACTION"
            defpackage.zz.y(r10, r6)
        L59:
            int r10 = r4.incrementAndGet()
            if (r10 <= 0) goto L61
            r7.d = r8
        L61:
            ij4 r8 = new ij4     // Catch: java.lang.Throwable -> L2e
            r10 = 0
            r8.<init>(r7, r10)     // Catch: java.lang.Throwable -> L2e
            r0.x = r5     // Catch: java.lang.Throwable -> L2e
            r0.A = r5     // Catch: java.lang.Throwable -> L2e
            java.lang.Object r10 = r9.invoke(r8, r0)     // Catch: java.lang.Throwable -> L2e
            w11 r8 = defpackage.w11.x
            if (r10 != r8) goto L74
            return r8
        L74:
            int r8 = r4.decrementAndGet()
            if (r8 != 0) goto L7c
            r7.d = r3
        L7c:
            if (r5 == 0) goto L84
            java.lang.String r7 = "END TRANSACTION"
            defpackage.zz.y(r7, r6)
            return r10
        L84:
            defpackage.zz.y(r2, r6)
            return r10
        L88:
            throw r8     // Catch: java.lang.Throwable -> L89
        L89:
            r9 = move-exception
            int r10 = r4.decrementAndGet()     // Catch: android.database.SQLException -> L93
            if (r10 != 0) goto L95
            r7.d = r3     // Catch: android.database.SQLException -> L93
            goto L95
        L93:
            r7 = move-exception
            goto L99
        L95:
            defpackage.zz.y(r2, r6)     // Catch: android.database.SQLException -> L93
            goto L9c
        L99:
            defpackage.n03.i(r8, r7)
        L9c:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mj4.e(uh6, ic2, xz0):java.lang.Object");
    }
}
