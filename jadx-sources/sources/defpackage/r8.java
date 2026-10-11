package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class r8 extends ho1 {
    public e9 g0;
    public ys5 h0;
    public i42 i0;
    public ud1 j0;

    @Override // defpackage.xz3
    public final void S0() {
        x1(this.h0);
    }

    @Override // defpackage.ho1
    public final Object e1(l5 l5Var, j10 j10Var) {
        e9 e9Var = this.g0;
        vz0 vz0Var = null;
        m8 m8Var = new m8(l5Var, this, null);
        i54 i54Var = e9Var.b;
        v8 v8Var = new v8(e9Var, m8Var, vz0Var, (byte) 1);
        i54Var.getClass();
        Object K = db.K(new d23(c54.x, i54Var, v8Var, vz0Var, (byte) 1), j10Var);
        pn6 pn6Var = pn6.a;
        w11 w11Var = w11.x;
        if (K != w11Var) {
            K = pn6Var;
        }
        if (K == w11Var) {
            return K;
        }
        return pn6Var;
    }

    @Override // defpackage.yc1, defpackage.xq4
    public final void f() {
        J();
        if (this.K) {
            ud1 ud1Var = wc7.O(this).V;
            ud1 ud1Var2 = this.j0;
            if (ud1Var2 == null || !ud1Var2.equals(ud1Var)) {
                this.j0 = ud1Var;
                x1(this.h0);
            }
        }
    }

    @Override // defpackage.ho1
    public final boolean s1() {
        if (this.g0.h.getValue() != null) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /* JADX WARN: Type inference failed for: r13v3, types: [t05, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object v1(float r12, defpackage.xz0 r13) {
        /*
            r11 = this;
            boolean r0 = r13 instanceof defpackage.n8
            if (r0 == 0) goto L13
            r0 = r13
            n8 r0 = (defpackage.n8) r0
            int r1 = r0.A
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.A = r1
            goto L18
        L13:
            n8 r0 = new n8
            r0.<init>(r11, r13)
        L18:
            java.lang.Object r13 = r0.y
            int r1 = r0.A
            r2 = 1
            r3 = 2
            if (r1 == 0) goto L35
            if (r1 == r2) goto L31
            if (r1 != r3) goto L2a
            t05 r11 = r0.x
            defpackage.m37.N(r13)
            goto L71
        L2a:
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ze0.m(r11)
            r11 = 0
            return r11
        L31:
            defpackage.m37.N(r13)
            return r13
        L35:
            defpackage.m37.N(r13)
            e9 r13 = r11.g0
            r13.getClass()
            t05 r13 = new t05
            r13.<init>()
            r13.x = r12
            e9 r1 = r11.g0
            p8 r4 = new p8
            r9 = 0
            r4.<init>(r11, r13, r12, r9)
            r0.x = r13
            r0.A = r3
            i54 r7 = r1.b
            v8 r8 = new v8
            r8.<init>(r1, r4, r9, r2)
            r7.getClass()
            d23 r5 = new d23
            r10 = 1
            c54 r6 = defpackage.c54.x
            r5.<init>(r6, r7, r8, r9, r10)
            java.lang.Object r11 = defpackage.db.K(r5, r0)
            w11 r12 = defpackage.w11.x
            if (r11 != r12) goto L6b
            goto L6d
        L6b:
            pn6 r11 = defpackage.pn6.a
        L6d:
            if (r11 != r12) goto L70
            return r12
        L70:
            r11 = r13
        L71:
            float r11 = r11.x
            java.lang.Float r12 = new java.lang.Float
            r12.<init>(r11)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.r8.v1(float, xz0):java.lang.Object");
    }

    public final boolean w1() {
        if (wc7.O(this).W == ia3.y && this.N == rg4.y) {
            return true;
        }
        return false;
    }

    public final void x1(ys5 ys5Var) {
        if (ys5Var == null) {
            sk6 sk6Var = w7.a;
            b3 b3Var = w7.b;
            ud1 ud1Var = wc7.O(this).V;
            this.j0 = ud1Var;
            ys5Var = new ys5(new dn0((Object) this.g0, (Object) b3Var, (Object) new y7(ud1Var, (byte) 0), (byte) 3), sk6Var);
        }
        this.i0 = ys5Var;
    }
}
