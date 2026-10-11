package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public abstract class f34 {
    public static final yd0 a;
    public static final yd0 b;

    static {
        byte[] l = et5.l("\r\n", kl0.a);
        a = new yd0(l, 0, l.length);
        b = new yd0(new byte[]{45, 45});
    }

    public static final void a(u05 u05Var, byte[] bArr, byte b2) {
        int i = u05Var.x;
        if (i < bArr.length) {
            u05Var.x = i + 1;
            bArr[i] = b2;
        } else {
            qi2.k("Failed to parse multipart: boundary shouldn't be longer than 70 characters");
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x01ac, code lost:
    
        if (r5.d(r6) != r11) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x016f, code lost:
    
        if (r2 == r11) goto L75;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:30:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b(defpackage.yd0 r29, defpackage.g21 r30, defpackage.nc0 r31, defpackage.sq2 r32, long r33, defpackage.xz0 r35) {
        /*
            Method dump skipped, instructions count: 459
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.f34.b(yd0, g21, nc0, sq2, long, xz0):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0052 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0053 A[Catch: all -> 0x0027, TryCatch #0 {all -> 0x0027, blocks: (B:11:0x0023, B:12:0x004e, B:16:0x0053, B:17:0x005a), top: B:10:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object c(defpackage.g21 r5, defpackage.xz0 r6) {
        /*
            boolean r0 = r6 instanceof defpackage.d34
            if (r0 == 0) goto L13
            r0 = r6
            d34 r0 = (defpackage.d34) r0
            int r1 = r0.z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.z = r1
            goto L18
        L13:
            d34 r0 = new d34
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.y
            int r1 = r0.z
            r2 = 1
            if (r1 == 0) goto L30
            if (r1 != r2) goto L29
            mk0 r5 = r0.x
            defpackage.m37.N(r6)     // Catch: java.lang.Throwable -> L27
            goto L4e
        L27:
            r6 = move-exception
            goto L61
        L29:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ze0.m(r5)
            r5 = 0
            return r5
        L30:
            defpackage.m37.N(r6)
            mk0 r6 = new mk0
            r6.<init>()
            r0.x = r6     // Catch: java.lang.Throwable -> L5f
            r0.z = r2     // Catch: java.lang.Throwable -> L5f
            h12 r1 = new h12     // Catch: java.lang.Throwable -> L5f
            r2 = 3
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L5f
            java.lang.Object r5 = defpackage.br2.c(r5, r6, r1, r0)     // Catch: java.lang.Throwable -> L5f
            w11 r0 = defpackage.w11.x
            if (r5 != r0) goto L4b
            return r0
        L4b:
            r4 = r6
            r6 = r5
            r5 = r4
        L4e:
            sq2 r6 = (defpackage.sq2) r6     // Catch: java.lang.Throwable -> L27
            if (r6 == 0) goto L53
            return r6
        L53:
            java.io.EOFException r6 = new java.io.EOFException     // Catch: java.lang.Throwable -> L27
            java.lang.String r0 = "Failed to parse multipart headers: unexpected end of stream"
            r6.<init>(r0)     // Catch: java.lang.Throwable -> L27
            throw r6     // Catch: java.lang.Throwable -> L27
        L5b:
            r4 = r6
            r6 = r5
            r5 = r4
            goto L61
        L5f:
            r5 = move-exception
            goto L5b
        L61:
            r5.e()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.f34.c(g21, xz0):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object d(defpackage.wc0 r4, defpackage.yd0 r5, defpackage.xz0 r6) {
        /*
            boolean r0 = r6 instanceof defpackage.e34
            if (r0 == 0) goto L13
            r0 = r6
            e34 r0 = (defpackage.e34) r0
            int r1 = r0.z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.z = r1
            goto L18
        L13:
            e34 r0 = new e34
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.y
            int r1 = r0.z
            r2 = 1
            if (r1 == 0) goto L2e
            if (r1 != r2) goto L27
            yd0 r5 = r0.x
            defpackage.m37.N(r6)
            goto L3e
        L27:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ze0.m(r4)
            r4 = 0
            return r4
        L2e:
            defpackage.m37.N(r6)
            r0.x = r5
            r0.z = r2
            java.lang.Object r6 = defpackage.zz.b0(r4, r5, r0)
            w11 r4 = defpackage.w11.x
            if (r6 != r4) goto L3e
            return r4
        L3e:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r4 = r6.booleanValue()
            if (r4 == 0) goto L4b
            byte[] r4 = r5.x
            int r4 = r4.length
            long r4 = (long) r4
            goto L4d
        L4b:
            r4 = 0
        L4d:
            java.lang.Long r6 = new java.lang.Long
            r6.<init>(r4)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.f34.d(wc0, yd0, xz0):java.lang.Object");
    }
}
