package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class j50 extends x45 implements ic2 {
    public /* synthetic */ Object A;
    public final /* synthetic */ v11 B;
    public final /* synthetic */ ng6 C;
    public oq4 y;
    public boolean z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j50(v11 v11Var, ng6 ng6Var, vz0 vz0Var) {
        super(2, vz0Var);
        this.B = v11Var;
        this.C = ng6Var;
    }

    @Override // defpackage.h30
    public final vz0 create(Object obj, vz0 vz0Var) {
        j50 j50Var = new j50(this.B, this.C, vz0Var);
        j50Var.A = obj;
        return j50Var;
    }

    @Override // defpackage.ic2
    public final Object invoke(Object obj, Object obj2) {
        ((j50) create((z36) obj, (vz0) obj2)).invokeSuspend(pn6.a);
        return w11.x;
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0030 A[RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:8:0x002e -> B:5:0x0031). Please report as a decompilation issue!!! */
    @Override // defpackage.h30
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            boolean r0 = r7.z
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L18
            if (r0 != r2) goto L12
            oq4 r0 = r7.y
            java.lang.Object r3 = r7.A
            z36 r3 = (defpackage.z36) r3
            defpackage.m37.N(r8)
            goto L31
        L12:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ze0.m(r7)
            return r1
        L18:
            defpackage.m37.N(r8)
            java.lang.Object r8 = r7.A
            z36 r8 = (defpackage.z36) r8
            oq4 r0 = defpackage.oq4.y
            r3 = r8
        L22:
            r7.A = r3
            r7.y = r0
            r7.z = r2
            java.lang.Object r8 = r3.d(r0, r7)
            w11 r4 = defpackage.w11.x
            if (r8 != r4) goto L31
            return r4
        L31:
            nq4 r8 = (defpackage.nq4) r8
            java.util.List r4 = r8.a
            r5 = 0
            java.lang.Object r4 = r4.get(r5)
            uq4 r4 = (defpackage.uq4) r4
            int r4 = r4.i
            r5 = 2
            if (r4 != r5) goto L22
            int r8 = r8.f
            r4 = 4
            ng6 r6 = r7.C
            if (r8 != r4) goto L54
            e50 r8 = new e50
            r8.<init>(r6, r1, r5)
            r4 = 3
            v11 r5 = r7.B
            defpackage.tl7.z(r5, r1, r1, r8, r4)
            goto L22
        L54:
            r4 = 5
            if (r8 != r4) goto L22
            r6.a()
            goto L22
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.j50.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
