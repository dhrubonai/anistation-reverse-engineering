package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class lo2 extends xz3 implements xq4 {
    public u34 L;
    public fo2 M;

    @Override // defpackage.xq4
    public final void J() {
        c1();
    }

    @Override // defpackage.xz3
    public final void T0() {
        c1();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Type inference failed for: r5v3, types: [n13, fo2, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a1(defpackage.xz0 r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.io2
            if (r0 == 0) goto L13
            r0 = r5
            io2 r0 = (defpackage.io2) r0
            int r1 = r0.A
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.A = r1
            goto L18
        L13:
            io2 r0 = new io2
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.y
            int r1 = r0.A
            r2 = 1
            if (r1 == 0) goto L2e
            if (r1 != r2) goto L27
            fo2 r0 = r0.x
            defpackage.m37.N(r5)
            goto L4a
        L27:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ze0.m(r4)
            r4 = 0
            return r4
        L2e:
            defpackage.m37.N(r5)
            fo2 r5 = r4.M
            if (r5 != 0) goto L4c
            fo2 r5 = new fo2
            r5.<init>()
            u34 r1 = r4.L
            r0.x = r5
            r0.A = r2
            java.lang.Object r0 = r1.a(r5, r0)
            w11 r1 = defpackage.w11.x
            if (r0 != r1) goto L49
            return r1
        L49:
            r0 = r5
        L4a:
            r4.M = r0
        L4c:
            pn6 r4 = defpackage.pn6.a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lo2.a1(xz0):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b1(defpackage.xz0 r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.jo2
            if (r0 == 0) goto L13
            r0 = r5
            jo2 r0 = (defpackage.jo2) r0
            int r1 = r0.z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.z = r1
            goto L18
        L13:
            jo2 r0 = new jo2
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.x
            int r1 = r0.z
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L2c
            if (r1 != r3) goto L26
            defpackage.m37.N(r5)
            goto L45
        L26:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ze0.m(r4)
            return r2
        L2c:
            defpackage.m37.N(r5)
            fo2 r5 = r4.M
            if (r5 == 0) goto L47
            go2 r1 = new go2
            r1.<init>(r5)
            u34 r5 = r4.L
            r0.z = r3
            java.lang.Object r5 = r5.a(r1, r0)
            w11 r0 = defpackage.w11.x
            if (r5 != r0) goto L45
            return r0
        L45:
            r4.M = r2
        L47:
            pn6 r4 = defpackage.pn6.a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lo2.b1(xz0):java.lang.Object");
    }

    public final void c1() {
        fo2 fo2Var = this.M;
        if (fo2Var != null) {
            this.L.b(new go2(fo2Var));
            this.M = null;
        }
    }

    @Override // defpackage.xq4
    public final void x(nq4 nq4Var, oq4 oq4Var, long j) {
        if (oq4Var == oq4.y) {
            int i = nq4Var.f;
            vz0 vz0Var = null;
            if (i == 4) {
                tl7.z(O0(), null, null, new ko2(this, vz0Var, (byte) 0), 3);
            } else if (i == 5) {
                tl7.z(O0(), null, null, new ko2(this, vz0Var, (byte) 1), 3);
            }
        }
    }
}
