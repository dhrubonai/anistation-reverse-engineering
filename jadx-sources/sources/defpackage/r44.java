package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public final class r44 extends x45 implements ic2 {
    public long[] A;
    public int B;
    public int C;
    public int D;
    public int E;
    public long F;
    public boolean G;
    public /* synthetic */ Object H;
    public final /* synthetic */ s44 I;
    public final /* synthetic */ xd2 J;
    public xd2 y;
    public s44 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r44(s44 s44Var, xd2 xd2Var, vz0 vz0Var) {
        super(2, vz0Var);
        this.I = s44Var;
        this.J = xd2Var;
    }

    @Override // defpackage.h30
    public final vz0 create(Object obj, vz0 vz0Var) {
        r44 r44Var = new r44(this.I, this.J, vz0Var);
        r44Var.H = obj;
        return r44Var;
    }

    @Override // defpackage.ic2
    public final Object invoke(Object obj, Object obj2) {
        return ((r44) create((ri5) obj, (vz0) obj2)).invokeSuspend(pn6.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0066  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x004f -> B:14:0x009f). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0051 -> B:6:0x0064). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:8:0x006d -> B:5:0x0094). Please report as a decompilation issue!!! */
    @Override // defpackage.h30
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r21) {
        /*
            r20 = this;
            r0 = r20
            boolean r1 = r0.G
            r2 = 0
            r3 = 8
            r4 = 1
            if (r1 == 0) goto L2c
            if (r1 != r4) goto L25
            int r1 = r0.E
            int r5 = r0.D
            long r6 = r0.F
            int r8 = r0.C
            int r9 = r0.B
            long[] r10 = r0.A
            s44 r11 = r0.z
            xd2 r12 = r0.y
            java.lang.Object r13 = r0.H
            ri5 r13 = (defpackage.ri5) r13
            defpackage.m37.N(r21)
            goto L94
        L25:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ze0.m(r0)
            r0 = 0
            return r0
        L2c:
            defpackage.m37.N(r21)
            java.lang.Object r1 = r0.H
            ri5 r1 = (defpackage.ri5) r1
            s44 r5 = r0.I
            q44 r6 = r5.y
            long[] r6 = r6.a
            int r7 = r6.length
            int r7 = r7 + (-2)
            if (r7 < 0) goto La4
            xd2 r8 = r0.J
            r9 = r2
        L41:
            r10 = r6[r9]
            long r12 = ~r10
            r14 = 7
            long r12 = r12 << r14
            long r12 = r12 & r10
            r14 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r12 = r12 & r14
            int r12 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r12 == 0) goto L9f
            int r12 = r9 - r7
            int r12 = ~r12
            int r12 = r12 >>> 31
            int r12 = 8 - r12
            r13 = r1
            r1 = r2
            r18 = r10
            r11 = r5
            r10 = r6
            r5 = r12
            r12 = r8
            r8 = r9
            r9 = r7
            r6 = r18
        L64:
            if (r1 >= r5) goto L97
            r14 = 255(0xff, double:1.26E-321)
            long r14 = r14 & r6
            r16 = 128(0x80, double:6.3E-322)
            int r14 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r14 >= 0) goto L94
            int r2 = r8 << 3
            int r2 = r2 + r1
            r12.y = r2
            q44 r3 = r11.y
            java.lang.Object[] r3 = r3.b
            r2 = r3[r2]
            r0.H = r13
            r0.y = r12
            r0.z = r11
            r0.A = r10
            r0.B = r9
            r0.C = r8
            r0.F = r6
            r0.D = r5
            r0.E = r1
            r0.G = r4
            r13.d(r0, r2)
            w11 r0 = defpackage.w11.x
            return r0
        L94:
            long r6 = r6 >> r3
            int r1 = r1 + r4
            goto L64
        L97:
            if (r5 != r3) goto La4
            r7 = r9
            r6 = r10
            r5 = r11
            r1 = r13
            r9 = r8
            r8 = r12
        L9f:
            if (r9 == r7) goto La4
            int r9 = r9 + 1
            goto L41
        La4:
            pn6 r0 = defpackage.pn6.a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.r44.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
