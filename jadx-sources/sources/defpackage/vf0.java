package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public final class vf0 extends pj0 {
    public final ic2 C;

    public vf0(ic2 ic2Var, l11 l11Var, int i, ta0 ta0Var) {
        super(ic2Var, l11Var, i, ta0Var, (byte) 0);
        this.C = ic2Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.pj0, defpackage.oj0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(defpackage.tu4 r5, defpackage.vz0 r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.uf0
            if (r0 == 0) goto L13
            r0 = r6
            uf0 r0 = (defpackage.uf0) r0
            int r1 = r0.A
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.A = r1
            goto L1a
        L13:
            uf0 r0 = new uf0
            xz0 r6 = (defpackage.xz0) r6
            r0.<init>(r4, r6)
        L1a:
            java.lang.Object r6 = r0.y
            int r1 = r0.A
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L30
            if (r1 != r3) goto L2a
            tu4 r5 = r0.x
            defpackage.m37.N(r6)
            goto L40
        L2a:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ze0.m(r4)
            return r2
        L30:
            defpackage.m37.N(r6)
            r0.x = r5
            r0.A = r3
            java.lang.Object r4 = super.f(r5, r0)
            w11 r6 = defpackage.w11.x
            if (r4 != r6) goto L40
            return r6
        L40:
            nj0 r5 = (defpackage.nj0) r5
            za0 r4 = r5.B
            boolean r4 = r4.z()
            if (r4 == 0) goto L4d
            pn6 r4 = defpackage.pn6.a
            return r4
        L4d:
            java.lang.String r4 = "'awaitClose { yourCallbackOrListener.cancel() }' should be used in the end of callbackFlow block.\nOtherwise, a callback/listener may leak in case of external cancellation.\nSee callbackFlow API documentation for the details."
            defpackage.ze0.m(r4)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vf0.f(tu4, vz0):java.lang.Object");
    }

    @Override // defpackage.pj0, defpackage.oj0
    public final oj0 g(l11 l11Var, int i, ta0 ta0Var) {
        return new vf0(this.C, l11Var, i, ta0Var);
    }
}
