package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class zj6 extends t36 implements ic2 {
    public int A;
    public int B;
    public int C;
    public byte D;
    public final /* synthetic */ jc4[] E;
    public final /* synthetic */ ak6 F;
    public final /* synthetic */ vh6 G;
    public jc4[] x;
    public ak6 y;
    public vh6 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zj6(jc4[] jc4VarArr, ak6 ak6Var, vh6 vh6Var, vz0 vz0Var) {
        super(2, vz0Var);
        this.E = jc4VarArr;
        this.F = ak6Var;
        this.G = vh6Var;
    }

    @Override // defpackage.h30
    public final vz0 create(Object obj, vz0 vz0Var) {
        return new zj6(this.E, this.F, this.G, vz0Var);
    }

    @Override // defpackage.ic2
    public final Object invoke(Object obj, Object obj2) {
        return ((zj6) create((ij4) obj, (vz0) obj2)).invokeSuspend(pn6.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x006f, code lost:
    
        if (r7.f(r6, r12, r11) == r10) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0057, code lost:
    
        r5 = r9;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0075  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x0072 -> B:10:0x0073). Please report as a decompilation issue!!! */
    @Override // defpackage.h30
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            r11 = this;
            byte r0 = r11.D
            r1 = 0
            r2 = 2
            r3 = 1
            if (r0 == 0) goto L21
            if (r0 == r3) goto Lb
            if (r0 != r2) goto L1b
        Lb:
            int r0 = r11.C
            int r4 = r11.B
            int r5 = r11.A
            vh6 r6 = r11.z
            ak6 r7 = r11.y
            jc4[] r8 = r11.x
            defpackage.m37.N(r12)
            goto L57
        L1b:
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ze0.m(r11)
            return r1
        L21:
            defpackage.m37.N(r12)
            jc4[] r12 = r11.E
            int r0 = r12.length
            r4 = 0
            ak6 r5 = r11.F
            vh6 r6 = r11.G
            r8 = r12
            r12 = r4
            r7 = r5
        L2f:
            if (r4 >= r0) goto L75
            r5 = r8[r4]
            int r9 = r12 + 1
            int r5 = r5.ordinal()
            if (r5 == 0) goto L72
            w11 r10 = defpackage.w11.x
            if (r5 == r3) goto L5d
            if (r5 != r2) goto L59
            r11.x = r8
            r11.y = r7
            r11.z = r6
            r11.A = r9
            r11.B = r4
            r11.C = r0
            r11.D = r2
            java.lang.Object r12 = r7.g(r6, r12, r11)
            if (r12 != r10) goto L56
            goto L71
        L56:
            r5 = r9
        L57:
            r12 = r5
            goto L73
        L59:
            defpackage.ze0.l()
            return r1
        L5d:
            r11.x = r8
            r11.y = r7
            r11.z = r6
            r11.A = r9
            r11.B = r4
            r11.C = r0
            r11.D = r3
            java.lang.Object r12 = r7.f(r6, r12, r11)
            if (r12 != r10) goto L56
        L71:
            return r10
        L72:
            r12 = r9
        L73:
            int r4 = r4 + r3
            goto L2f
        L75:
            pn6 r11 = defpackage.pn6.a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zj6.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
