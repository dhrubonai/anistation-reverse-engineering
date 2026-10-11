package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public abstract class up2 {
    public static final yk3 a = u93.a("io.ktor.client.plugins.HttpCallValidator");
    public static final dn0 b = new dn0("HttpResponseValidator", op2.x, new t72(12));
    public static final ou c;

    static {
        al6 al6Var;
        im0 a2 = z05.a(Boolean.class);
        try {
            al6Var = z05.c(Boolean.TYPE);
        } catch (Throwable unused) {
            al6Var = null;
        }
        c = new ou("ExpectSuccessAttributeKey", new vk6(a2, false, al6Var));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x006a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(java.util.List r4, java.lang.Throwable r5, defpackage.nr2 r6, defpackage.xz0 r7) {
        /*
            boolean r0 = r7 instanceof defpackage.rp2
            if (r0 == 0) goto L13
            r0 = r7
            rp2 r0 = (defpackage.rp2) r0
            int r1 = r0.y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.y = r1
            goto L18
        L13:
            rp2 r0 = new rp2
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.x
            int r0 = r0.y
            if (r0 == 0) goto L30
            r4 = 1
            if (r0 == r4) goto L24
            r4 = 2
            if (r0 != r4) goto L28
        L24:
            defpackage.m37.N(r7)
            goto L2e
        L28:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ze0.m(r4)
            return
        L2e:
            r4 = 0
            goto L64
        L30:
            defpackage.m37.N(r7)
            yk3 r7 = defpackage.up2.a
            boolean r0 = defpackage.nx7.N(r7)
            if (r0 == 0) goto L60
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Processing exception "
            r0.<init>(r1)
            java.lang.Class r1 = r5.getClass()
            im0 r1 = defpackage.z05.a(r1)
            r0.append(r1)
            java.lang.String r1 = " for request "
            r0.append(r1)
            op6 r6 = r6.getUrl()
            r0.append(r6)
            java.lang.String r6 = r0.toString()
            r7.trace(r6, r5)
        L60:
            java.util.Iterator r4 = r4.iterator()
        L64:
            boolean r5 = r4.hasNext()
            if (r5 != 0) goto L6b
            return
        L6b:
            java.lang.Object r4 = r4.next()
            if (r4 != 0) goto L75
            defpackage.ze0.l()
            return
        L75:
            defpackage.ov3.d()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.up2.a(java.util.List, java.lang.Throwable, nr2, xz0):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b(java.util.List r5, defpackage.f91 r6, defpackage.xz0 r7) {
        /*
            boolean r0 = r7 instanceof defpackage.sp2
            if (r0 == 0) goto L13
            r0 = r7
            sp2 r0 = (defpackage.sp2) r0
            int r1 = r0.B
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.B = r1
            goto L18
        L13:
            sp2 r0 = new sp2
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.A
            int r1 = r0.B
            r2 = 1
            if (r1 == 0) goto L33
            if (r1 != r2) goto L2c
            int r5 = r0.z
            java.util.Iterator r6 = r0.y
            f91 r1 = r0.x
            defpackage.m37.N(r7)
            r7 = r1
            goto L64
        L2c:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ze0.m(r5)
            r5 = 0
            return r5
        L33:
            defpackage.m37.N(r7)
            yk3 r7 = defpackage.up2.a
            boolean r1 = defpackage.nx7.N(r7)
            if (r1 == 0) goto L5b
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r3 = "Validating response for request "
            r1.<init>(r3)
            yp2 r3 = r6.d0()
            nr2 r3 = r3.c()
            op6 r3 = r3.getUrl()
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            r7.h(r1)
        L5b:
            java.util.Iterator r5 = r5.iterator()
            r7 = 0
            r4 = r6
            r6 = r5
            r5 = r7
            r7 = r4
        L64:
            boolean r1 = r6.hasNext()
            if (r1 == 0) goto L81
            java.lang.Object r1 = r6.next()
            ic2 r1 = (defpackage.ic2) r1
            r0.x = r7
            r0.y = r6
            r0.z = r5
            r0.B = r2
            java.lang.Object r1 = r1.invoke(r7, r0)
            w11 r3 = defpackage.w11.x
            if (r1 != r3) goto L64
            return r3
        L81:
            pn6 r5 = defpackage.pn6.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.up2.b(java.util.List, f91, xz0):java.lang.Object");
    }
}
