package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public final class q43 extends x45 implements ic2 {
    public int A;
    public int B;
    public byte C;
    public /* synthetic */ Object D;
    public final /* synthetic */ t43 E;
    public ha4 y;
    public ol0 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q43(vz0 vz0Var, t43 t43Var) {
        super(2, vz0Var);
        this.E = t43Var;
    }

    @Override // defpackage.h30
    public final vz0 create(Object obj, vz0 vz0Var) {
        q43 q43Var = new q43(vz0Var, this.E);
        q43Var.D = obj;
        return q43Var;
    }

    @Override // defpackage.ic2
    public final Object invoke(Object obj, Object obj2) {
        return ((q43) create((ri5) obj, (vz0) obj2)).invokeSuspend(pn6.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x005f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0061 -> B:6:0x0077). Please report as a decompilation issue!!! */
    @Override // defpackage.h30
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            java.lang.Object r0 = r7.D
            ri5 r0 = (defpackage.ri5) r0
            byte r1 = r7.C
            r2 = 2
            r3 = 1
            r4 = 0
            w11 r5 = defpackage.w11.x
            if (r1 == 0) goto L27
            if (r1 == r3) goto L23
            if (r1 != r2) goto L1d
            int r1 = r7.B
            int r3 = r7.A
            ol0 r4 = r7.z
            ha4 r6 = r7.y
            defpackage.m37.N(r8)
            goto L77
        L1d:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ze0.m(r7)
            return r4
        L23:
            defpackage.m37.N(r8)
            goto L7c
        L27:
            defpackage.m37.N(r8)
            t43 r8 = r7.E
            java.lang.Object r8 = r8.K()
            boolean r1 = r8 instanceof defpackage.ol0
            if (r1 == 0) goto L40
            ol0 r8 = (defpackage.ol0) r8
            t43 r8 = r8.B
            r7.D = r4
            r7.C = r3
            r0.d(r7, r8)
            return r5
        L40:
            boolean r1 = r8 instanceof defpackage.ox2
            if (r1 == 0) goto L7c
            ox2 r8 = (defpackage.ox2) r8
            ha4 r8 = r8.a()
            if (r8 == 0) goto L7c
            java.lang.Object r1 = r8.e()
            r1.getClass()
            jk3 r1 = (defpackage.jk3) r1
            r3 = 0
            r6 = r8
            r4 = r1
            r1 = r3
        L59:
            boolean r8 = r4.equals(r6)
            if (r8 != 0) goto L7c
            boolean r8 = r4 instanceof defpackage.ol0
            if (r8 == 0) goto L77
            ol0 r4 = (defpackage.ol0) r4
            t43 r8 = r4.B
            r7.D = r0
            r7.y = r6
            r7.z = r4
            r7.A = r3
            r7.B = r1
            r7.C = r2
            r0.d(r7, r8)
            return r5
        L77:
            jk3 r4 = r4.f()
            goto L59
        L7c:
            pn6 r7 = defpackage.pn6.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.q43.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
