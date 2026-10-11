package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class rr4 implements vh6, by4 {
    public final p18 a;
    public final ow0 b;
    public final boolean c;
    public final bs d;
    public volatile boolean e;

    public rr4(p18 p18Var, ow0 ow0Var, boolean z) {
        p18Var.getClass();
        this.a = p18Var;
        this.b = ow0Var;
        this.c = z;
        this.d = new bs();
    }

    @Override // defpackage.vh6
    public final Object a(uh6 uh6Var, ic2 ic2Var, t36 t36Var) {
        if (!this.e) {
            zv0 zv0Var = (zv0) t36Var.getContext().get(this.a);
            if (zv0Var != null && zv0Var.y == this) {
                return g(uh6Var, ic2Var, t36Var);
            }
            zz.c0(21, "Attempted to use connection on a different coroutine");
            throw null;
        }
        zz.c0(21, "Connection is recycled");
        throw null;
    }

    @Override // defpackage.vh6
    public final Boolean b(vz0 vz0Var) {
        boolean z;
        if (!this.e) {
            zv0 zv0Var = (zv0) vz0Var.getContext().get(this.a);
            if (zv0Var != null && zv0Var.y == this) {
                if (this.d.isEmpty() && !this.b.x.j()) {
                    z = false;
                } else {
                    z = true;
                }
                return Boolean.valueOf(z);
            }
            zz.c0(21, "Attempted to use connection on a different coroutine");
            throw null;
        }
        zz.c0(21, "Connection is recycled");
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.kr4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(java.lang.String r7, defpackage.ub2 r8, defpackage.xz0 r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof defpackage.qr4
            if (r0 == 0) goto L13
            r0 = r9
            qr4 r0 = (defpackage.qr4) r0
            int r1 = r0.C
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.C = r1
            goto L18
        L13:
            qr4 r0 = new qr4
            r0.<init>(r6, r9)
        L18:
            java.lang.Object r9 = r0.A
            w11 r1 = defpackage.w11.x
            int r2 = r0.C
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L36
            if (r2 != r3) goto L30
            ow0 r7 = r0.z
            ub2 r8 = r0.y
            java.lang.String r0 = r0.x
            defpackage.m37.N(r9)
            r9 = r7
            r7 = r0
            goto L64
        L30:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ze0.m(r6)
            return r4
        L36:
            defpackage.m37.N(r9)
            boolean r9 = r6.e
            r2 = 21
            if (r9 != 0) goto L8d
            l11 r9 = r0.getContext()
            p18 r5 = r6.a
            j11 r9 = r9.get(r5)
            zv0 r9 = (defpackage.zv0) r9
            if (r9 == 0) goto L87
            rr4 r9 = r9.y
            if (r9 != r6) goto L87
            ow0 r9 = r6.b
            r0.x = r7
            r0.y = r8
            r0.z = r9
            r0.C = r3
            k54 r2 = r9.y
            java.lang.Object r0 = r2.a(r0)
            if (r0 != r1) goto L64
            return r1
        L64:
            lr4 r0 = new lr4     // Catch: java.lang.Throwable -> L7a
            ow0 r1 = r6.b     // Catch: java.lang.Throwable -> L7a
            m85 r7 = r1.s0(r7)     // Catch: java.lang.Throwable -> L7a
            r0.<init>(r6, r7)     // Catch: java.lang.Throwable -> L7a
            java.lang.Object r6 = r8.invoke(r0)     // Catch: java.lang.Throwable -> L7c
            defpackage.o80.r(r0, r4)     // Catch: java.lang.Throwable -> L7a
            r9.l(r4)
            return r6
        L7a:
            r6 = move-exception
            goto L83
        L7c:
            r6 = move-exception
            throw r6     // Catch: java.lang.Throwable -> L7e
        L7e:
            r7 = move-exception
            defpackage.o80.r(r0, r6)     // Catch: java.lang.Throwable -> L7a
            throw r7     // Catch: java.lang.Throwable -> L7a
        L83:
            r9.l(r4)
            throw r6
        L87:
            java.lang.String r6 = "Attempted to use connection on a different coroutine"
            defpackage.zz.c0(r2, r6)
            throw r4
        L8d:
            java.lang.String r6 = "Connection is recycled"
            defpackage.zz.c0(r2, r6)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rr4.c(java.lang.String, ub2, xz0):java.lang.Object");
    }

    @Override // defpackage.by4
    public final g85 d() {
        return this.b;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0055 A[Catch: all -> 0x0066, TryCatch #0 {all -> 0x0066, blocks: (B:11:0x004d, B:13:0x0055, B:18:0x0060, B:19:0x008f, B:23:0x0068, B:24:0x006e, B:25:0x006f, B:26:0x0075, B:27:0x007b), top: B:10:0x004d }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x007b A[Catch: all -> 0x0066, TryCatch #0 {all -> 0x0066, blocks: (B:11:0x004d, B:13:0x0055, B:18:0x0060, B:19:0x008f, B:23:0x0068, B:24:0x006e, B:25:0x006f, B:26:0x0075, B:27:0x007b), top: B:10:0x004d }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(defpackage.uh6 r7, defpackage.xz0 r8) {
        /*
            r6 = this;
            bs r0 = r6.d
            java.lang.String r1 = "SAVEPOINT '"
            boolean r2 = r8 instanceof defpackage.nr4
            if (r2 == 0) goto L17
            r2 = r8
            nr4 r2 = (defpackage.nr4) r2
            int r3 = r2.B
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.B = r3
            goto L1c
        L17:
            nr4 r2 = new nr4
            r2.<init>(r6, r8)
        L1c:
            java.lang.Object r8 = r2.z
            int r3 = r2.B
            r4 = 1
            ow0 r6 = r6.b
            r5 = 0
            if (r3 == 0) goto L38
            if (r3 != r4) goto L32
            ow0 r7 = r2.y
            uh6 r2 = r2.x
            defpackage.m37.N(r8)
            r8 = r7
            r7 = r2
            goto L4d
        L32:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ze0.m(r6)
            return r5
        L38:
            defpackage.m37.N(r8)
            r2.x = r7
            r2.y = r6
            r2.B = r4
            k54 r8 = r6.y
            java.lang.Object r8 = r8.a(r2)
            w11 r2 = defpackage.w11.x
            if (r8 != r2) goto L4c
            return r2
        L4c:
            r8 = r6
        L4d:
            int r2 = r0.z     // Catch: java.lang.Throwable -> L66
            boolean r3 = r0.isEmpty()     // Catch: java.lang.Throwable -> L66
            if (r3 == 0) goto L7b
            int r7 = r7.ordinal()     // Catch: java.lang.Throwable -> L66
            if (r7 == 0) goto L75
            if (r7 == r4) goto L6f
            r1 = 2
            if (r7 != r1) goto L68
            java.lang.String r7 = "BEGIN EXCLUSIVE TRANSACTION"
            defpackage.zz.y(r7, r6)     // Catch: java.lang.Throwable -> L66
            goto L8f
        L66:
            r6 = move-exception
            goto L9d
        L68:
            er0 r6 = new er0     // Catch: java.lang.Throwable -> L66
            r7 = 4
            r6.<init>(r7)     // Catch: java.lang.Throwable -> L66
            throw r6     // Catch: java.lang.Throwable -> L66
        L6f:
            java.lang.String r7 = "BEGIN IMMEDIATE TRANSACTION"
            defpackage.zz.y(r7, r6)     // Catch: java.lang.Throwable -> L66
            goto L8f
        L75:
            java.lang.String r7 = "BEGIN DEFERRED TRANSACTION"
            defpackage.zz.y(r7, r6)     // Catch: java.lang.Throwable -> L66
            goto L8f
        L7b:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L66
            r7.<init>(r1)     // Catch: java.lang.Throwable -> L66
            r7.append(r2)     // Catch: java.lang.Throwable -> L66
            r1 = 39
            r7.append(r1)     // Catch: java.lang.Throwable -> L66
            java.lang.String r7 = r7.toString()     // Catch: java.lang.Throwable -> L66
            defpackage.zz.y(r7, r6)     // Catch: java.lang.Throwable -> L66
        L8f:
            mr4 r6 = new mr4     // Catch: java.lang.Throwable -> L66
            r6.<init>(r2)     // Catch: java.lang.Throwable -> L66
            r0.addLast(r6)     // Catch: java.lang.Throwable -> L66
            pn6 r6 = defpackage.pn6.a     // Catch: java.lang.Throwable -> L66
            r8.l(r5)
            return r6
        L9d:
            r8.l(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rr4.e(uh6, xz0):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0053 A[Catch: all -> 0x006c, TryCatch #0 {all -> 0x006c, blocks: (B:11:0x004d, B:13:0x0053, B:15:0x005d, B:17:0x0066, B:18:0x00a3, B:22:0x006e, B:23:0x0083, B:25:0x0089, B:26:0x008f, B:27:0x00a9, B:28:0x00b0), top: B:10:0x004d }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00a9 A[Catch: all -> 0x006c, TRY_ENTER, TryCatch #0 {all -> 0x006c, blocks: (B:11:0x004d, B:13:0x0053, B:15:0x005d, B:17:0x0066, B:18:0x00a3, B:22:0x006e, B:23:0x0083, B:25:0x0089, B:26:0x008f, B:27:0x00a9, B:28:0x00b0), top: B:10:0x004d }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(boolean r8, defpackage.xz0 r9) {
        /*
            r7 = this;
            bs r0 = r7.d
            java.lang.String r1 = "ROLLBACK TRANSACTION TO SAVEPOINT '"
            java.lang.String r2 = "RELEASE SAVEPOINT '"
            boolean r3 = r9 instanceof defpackage.or4
            if (r3 == 0) goto L19
            r3 = r9
            or4 r3 = (defpackage.or4) r3
            int r4 = r3.B
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L19
            int r4 = r4 - r5
            r3.B = r4
            goto L1e
        L19:
            or4 r3 = new or4
            r3.<init>(r7, r9)
        L1e:
            java.lang.Object r9 = r3.z
            int r4 = r3.B
            r5 = 1
            ow0 r7 = r7.b
            r6 = 0
            if (r4 == 0) goto L38
            if (r4 != r5) goto L32
            boolean r8 = r3.x
            ow0 r3 = r3.y
            defpackage.m37.N(r9)
            goto L4d
        L32:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ze0.m(r7)
            return r6
        L38:
            defpackage.m37.N(r9)
            r3.y = r7
            r3.x = r8
            r3.B = r5
            k54 r9 = r7.y
            java.lang.Object r9 = r9.a(r3)
            w11 r3 = defpackage.w11.x
            if (r9 != r3) goto L4c
            return r3
        L4c:
            r3 = r7
        L4d:
            boolean r9 = r0.isEmpty()     // Catch: java.lang.Throwable -> L6c
            if (r9 != 0) goto La9
            java.lang.Object r9 = defpackage.dp0.b0(r0)     // Catch: java.lang.Throwable -> L6c
            mr4 r9 = (defpackage.mr4) r9     // Catch: java.lang.Throwable -> L6c
            r4 = 39
            if (r8 == 0) goto L83
            r9.getClass()     // Catch: java.lang.Throwable -> L6c
            boolean r8 = r0.isEmpty()     // Catch: java.lang.Throwable -> L6c
            if (r8 == 0) goto L6e
            java.lang.String r8 = "END TRANSACTION"
            defpackage.zz.y(r8, r7)     // Catch: java.lang.Throwable -> L6c
            goto La3
        L6c:
            r7 = move-exception
            goto Lb1
        L6e:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L6c
            r8.<init>(r2)     // Catch: java.lang.Throwable -> L6c
            int r9 = r9.a     // Catch: java.lang.Throwable -> L6c
            r8.append(r9)     // Catch: java.lang.Throwable -> L6c
            r8.append(r4)     // Catch: java.lang.Throwable -> L6c
            java.lang.String r8 = r8.toString()     // Catch: java.lang.Throwable -> L6c
            defpackage.zz.y(r8, r7)     // Catch: java.lang.Throwable -> L6c
            goto La3
        L83:
            boolean r8 = r0.isEmpty()     // Catch: java.lang.Throwable -> L6c
            if (r8 == 0) goto L8f
            java.lang.String r8 = "ROLLBACK TRANSACTION"
            defpackage.zz.y(r8, r7)     // Catch: java.lang.Throwable -> L6c
            goto La3
        L8f:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L6c
            r8.<init>(r1)     // Catch: java.lang.Throwable -> L6c
            int r9 = r9.a     // Catch: java.lang.Throwable -> L6c
            r8.append(r9)     // Catch: java.lang.Throwable -> L6c
            r8.append(r4)     // Catch: java.lang.Throwable -> L6c
            java.lang.String r8 = r8.toString()     // Catch: java.lang.Throwable -> L6c
            defpackage.zz.y(r8, r7)     // Catch: java.lang.Throwable -> L6c
        La3:
            pn6 r7 = defpackage.pn6.a     // Catch: java.lang.Throwable -> L6c
            r3.l(r6)
            return r7
        La9:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L6c
            java.lang.String r8 = "Not in a transaction"
            r7.<init>(r8)     // Catch: java.lang.Throwable -> L6c
            throw r7     // Catch: java.lang.Throwable -> L6c
        Lb1:
            r3.l(r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rr4.f(boolean, xz0):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x007b, code lost:
    
        if (r12 != r7) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0069, code lost:
    
        if (e(r10, r0) == r7) goto L48;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /* JADX WARN: Type inference failed for: r9v7, types: [java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(defpackage.uh6 r10, defpackage.ic2 r11, defpackage.xz0 r12) {
        /*
            r9 = this;
            boolean r0 = r12 instanceof defpackage.pr4
            if (r0 == 0) goto L13
            r0 = r12
            pr4 r0 = (defpackage.pr4) r0
            int r1 = r0.C
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.C = r1
            goto L18
        L13:
            pr4 r0 = new pr4
            r0.<init>(r9, r12)
        L18:
            java.lang.Object r12 = r0.A
            int r1 = r0.C
            r2 = 0
            r3 = 5
            r4 = 3
            r5 = 2
            r6 = 1
            w11 r7 = defpackage.w11.x
            if (r1 == 0) goto L5a
            if (r1 == r6) goto L51
            if (r1 == r5) goto L49
            if (r1 == r4) goto L43
            r9 = 4
            if (r1 == r9) goto L43
            if (r1 == r3) goto L36
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ze0.m(r9)
            return r2
        L36:
            java.lang.Throwable r9 = r0.y
            java.lang.Object r10 = r0.x
            java.lang.Throwable r10 = (java.lang.Throwable) r10
            defpackage.m37.N(r12)     // Catch: android.database.SQLException -> L41
            goto La5
        L41:
            r11 = move-exception
            goto La0
        L43:
            java.lang.Object r9 = r0.x
            defpackage.m37.N(r12)
            return r9
        L49:
            boolean r6 = r0.z
            defpackage.m37.N(r12)     // Catch: java.lang.Throwable -> L4f
            goto L7e
        L4f:
            r10 = move-exception
            goto L8a
        L51:
            java.lang.Object r10 = r0.x
            r11 = r10
            ic2 r11 = (defpackage.ic2) r11
            defpackage.m37.N(r12)
            goto L6c
        L5a:
            defpackage.m37.N(r12)
            if (r10 != 0) goto L61
            uh6 r10 = defpackage.uh6.x
        L61:
            r0.x = r11
            r0.C = r6
            java.lang.Object r10 = r9.e(r10, r0)
            if (r10 != r7) goto L6c
            goto L99
        L6c:
            ij4 r10 = new ij4     // Catch: java.lang.Throwable -> L4f
            r10.<init>(r9, r6)     // Catch: java.lang.Throwable -> L4f
            r0.x = r2     // Catch: java.lang.Throwable -> L4f
            r0.z = r6     // Catch: java.lang.Throwable -> L4f
            r0.C = r5     // Catch: java.lang.Throwable -> L4f
            java.lang.Object r12 = r11.invoke(r10, r0)     // Catch: java.lang.Throwable -> L4f
            if (r12 != r7) goto L7e
            goto L99
        L7e:
            r0.x = r12
            r0.C = r4
            java.lang.Object r9 = r9.f(r6, r0)
            if (r9 != r7) goto L89
            goto L99
        L89:
            return r12
        L8a:
            throw r10     // Catch: java.lang.Throwable -> L8b
        L8b:
            r11 = move-exception
            r0.x = r10     // Catch: android.database.SQLException -> L9c
            r0.y = r11     // Catch: android.database.SQLException -> L9c
            r0.C = r3     // Catch: android.database.SQLException -> L9c
            r12 = 0
            java.lang.Object r9 = r9.f(r12, r0)     // Catch: android.database.SQLException -> L9c
            if (r9 != r7) goto L9a
        L99:
            return r7
        L9a:
            r9 = r11
            goto La5
        L9c:
            r9 = move-exception
            r8 = r11
            r11 = r9
            r9 = r8
        La0:
            if (r10 == 0) goto La6
            defpackage.n03.i(r10, r11)
        La5:
            throw r9
        La6:
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rr4.g(uh6, ic2, xz0):java.lang.Object");
    }
}
