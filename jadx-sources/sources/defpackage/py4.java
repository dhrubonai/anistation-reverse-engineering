package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public final class py4 implements xj0 {
    public final yn0 a;
    public final bx5 b;

    public py4(yn0 yn0Var, bx5 bx5Var) {
        this.a = yn0Var;
        this.b = bx5Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0092, code lost:
    
        if (r7.a.f(r0) == r6) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0088 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(defpackage.xz0 r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof defpackage.oy4
            if (r0 == 0) goto L13
            r0 = r8
            oy4 r0 = (defpackage.oy4) r0
            int r1 = r0.B
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.B = r1
            goto L18
        L13:
            oy4 r0 = new oy4
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.z
            int r1 = r0.B
            r2 = 2
            r3 = 1
            r4 = 0
            if (r1 == 0) goto L37
            if (r1 == r3) goto L2f
            if (r1 != r2) goto L29
            defpackage.m37.N(r8)
            goto L95
        L29:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ze0.m(r7)
            return r4
        L2f:
            int r1 = r0.y
            java.util.Iterator r5 = r0.x
            defpackage.m37.N(r8)
            goto L6a
        L37:
            defpackage.m37.N(r8)
            bx5 r8 = r7.b
            ni5 r1 = r8.B()
            os r1 = (defpackage.os) r1
            java.lang.Object r1 = r1.b
            ic2 r1 = (defpackage.ic2) r1
            ri5 r1 = defpackage.io3.V(r1)
        L4a:
            boolean r5 = r1.hasNext()
            if (r5 == 0) goto L5a
            java.lang.Object r5 = r1.next()
            h43 r5 = (defpackage.h43) r5
            r5.l(r4)
            goto L4a
        L5a:
            ni5 r8 = r8.B()
            os r8 = (defpackage.os) r8
            java.lang.Object r8 = r8.b
            ic2 r8 = (defpackage.ic2) r8
            ri5 r8 = defpackage.io3.V(r8)
            r1 = 0
            r5 = r8
        L6a:
            boolean r8 = r5.hasNext()
            w11 r6 = defpackage.w11.x
            if (r8 == 0) goto L88
            java.lang.Object r8 = r5.next()
            h43 r8 = (defpackage.h43) r8
            r8.l(r4)
            r0.x = r5
            r0.y = r1
            r0.B = r3
            java.lang.Object r8 = r8.G(r0)
            if (r8 != r6) goto L6a
            goto L94
        L88:
            r0.x = r4
            r0.B = r2
            yn0 r7 = r7.a
            java.lang.Object r7 = r7.f(r0)
            if (r7 != r6) goto L95
        L94:
            return r6
        L95:
            pn6 r7 = defpackage.pn6.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.py4.a(xz0):java.lang.Object");
    }

    @Override // defpackage.xj0
    public final h43 c() {
        return this.b;
    }
}
