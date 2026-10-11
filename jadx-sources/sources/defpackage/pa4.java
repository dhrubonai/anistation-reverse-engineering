package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class pa4 extends x45 implements ic2 {
    public /* synthetic */ Object A;
    public final /* synthetic */ sb2 B;
    public Object y;
    public boolean z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pa4(sb2 sb2Var, vz0 vz0Var) {
        super(2, vz0Var);
        this.B = sb2Var;
    }

    @Override // defpackage.h30
    public final vz0 create(Object obj, vz0 vz0Var) {
        pa4 pa4Var = new pa4(this.B, vz0Var);
        pa4Var.A = obj;
        return pa4Var;
    }

    @Override // defpackage.ic2
    public final Object invoke(Object obj, Object obj2) {
        return ((pa4) create((ri5) obj, (vz0) obj2)).invokeSuspend(pn6.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x0034 -> B:5:0x0035). Please report as a decompilation issue!!! */
    @Override // defpackage.h30
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r5) {
        /*
            r4 = this;
            boolean r0 = r4.z
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L18
            if (r0 != r2) goto L12
            java.lang.Object r0 = r4.y
            java.lang.Object r3 = r4.A
            ri5 r3 = (defpackage.ri5) r3
            defpackage.m37.N(r5)
            goto L35
        L12:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ze0.m(r4)
            return r1
        L18:
            defpackage.m37.N(r5)
            java.lang.Object r5 = r4.A
            ri5 r5 = (defpackage.ri5) r5
            r3 = r5
        L20:
            sb2 r5 = r4.B
            java.lang.Object r5 = r5.invoke()
            if (r5 == 0) goto L34
            r4.A = r3
            r4.y = r5
            r4.z = r2
            r3.d(r4, r5)
            w11 r4 = defpackage.w11.x
            return r4
        L34:
            r0 = r1
        L35:
            if (r0 != 0) goto L20
            pn6 r4 = defpackage.pn6.a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pa4.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
