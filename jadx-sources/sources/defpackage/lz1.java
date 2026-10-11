package defpackage;

import java.nio.charset.Charset;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public final class lz1 implements fy0 {
    public final y43 a;

    public lz1(y43 y43Var) {
        this.a = y43Var;
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [qq5, java.lang.Object, oa0] */
    @Override // defpackage.fy0
    public final Object a(jz0 jz0Var, Charset charset, vk6 vk6Var, Object obj, vz0 vz0Var) {
        x73 b;
        y43 y43Var = this.a;
        uj5 uj5Var = y43Var.b;
        try {
            b = oj5.serializerForTypeInfo(uj5Var, vk6Var);
        } catch (lj5 unused) {
            b = oj5.b(obj, uj5Var);
        }
        ?? obj2 = new Object();
        b.getClass();
        m33.encodeToSink(y43Var, b, obj, obj2);
        return new fk0(new yh(obj2, null, (byte) 6), jz0Var, new Long(obj2.z), 4);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // defpackage.fy0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.nio.charset.Charset r4, defpackage.vk6 r5, defpackage.wc0 r6, defpackage.xz0 r7) {
        /*
            r3 = this;
            boolean r4 = r7 instanceof defpackage.kz1
            if (r4 == 0) goto L13
            r4 = r7
            kz1 r4 = (defpackage.kz1) r4
            int r0 = r4.A
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r0 & r1
            if (r2 == 0) goto L13
            int r0 = r0 - r1
            r4.A = r0
            goto L18
        L13:
            kz1 r4 = new kz1
            r4.<init>(r3, r7)
        L18:
            java.lang.Object r7 = r4.y
            int r0 = r4.A
            y43 r3 = r3.a
            r1 = 1
            if (r0 == 0) goto L32
            if (r0 != r1) goto L2b
            x73 r4 = r4.x
            x73 r4 = (defpackage.x73) r4
            defpackage.m37.N(r7)
            goto L4c
        L2b:
            java.lang.String r3 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ze0.m(r3)
            r3 = 0
            return r3
        L32:
            defpackage.m37.N(r7)
            uj5 r7 = r3.b
            x73 r5 = defpackage.oj5.serializerForTypeInfo(r7, r5)
            r7 = r5
            x73 r7 = (defpackage.x73) r7
            r4.x = r7
            r4.A = r1
            java.lang.Object r7 = defpackage.zz.V(r6, r4)
            w11 r4 = defpackage.w11.x
            if (r7 != r4) goto L4b
            return r4
        L4b:
            r4 = r5
        L4c:
            oa0 r7 = (defpackage.oa0) r7
            ne1 r4 = (defpackage.ne1) r4     // Catch: java.lang.Throwable -> L55
            java.lang.Object r3 = defpackage.m33.decodeFromSource(r3, r4, r7)     // Catch: java.lang.Throwable -> L55
            return r3
        L55:
            r3 = move-exception
            h53 r4 = new h53
            java.lang.String r5 = r3.getMessage()
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "Illegal input: "
            r6.<init>(r7)
            r6.append(r5)
            java.lang.String r5 = r6.toString()
            r4.<init>(r5, r3, r1)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lz1.b(java.nio.charset.Charset, vk6, wc0, xz0):java.lang.Object");
    }
}
