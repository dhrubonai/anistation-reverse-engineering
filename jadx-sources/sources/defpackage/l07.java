package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class l07 extends x45 implements ic2 {
    public boolean y;
    public /* synthetic */ Object z;

    /* JADX WARN: Type inference failed for: r1v1, types: [l07, x45, vz0] */
    @Override // defpackage.h30
    public final vz0 create(Object obj, vz0 vz0Var) {
        ?? x45Var = new x45(2, vz0Var);
        x45Var.z = obj;
        return x45Var;
    }

    @Override // defpackage.ic2
    public final Object invoke(Object obj, Object obj2) {
        ((l07) create((z36) obj, (vz0) obj2)).invokeSuspend(pn6.a);
        return w11.x;
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0027 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0036 A[LOOP:0: B:6:0x0030->B:8:0x0036, LOOP_END] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:9:0x0025 -> B:5:0x0028). Please report as a decompilation issue!!! */
    @Override // defpackage.h30
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r4) {
        /*
            r3 = this;
            java.lang.Object r0 = r3.z
            z36 r0 = (defpackage.z36) r0
            boolean r1 = r3.y
            r2 = 1
            if (r1 == 0) goto L16
            if (r1 != r2) goto Lf
            defpackage.m37.N(r4)
            goto L28
        Lf:
            java.lang.String r3 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ze0.m(r3)
            r3 = 0
            return r3
        L16:
            defpackage.m37.N(r4)
        L19:
            r3.z = r0
            r3.y = r2
            oq4 r4 = defpackage.oq4.x
            java.lang.Object r4 = r0.d(r4, r3)
            w11 r1 = defpackage.w11.x
            if (r4 != r1) goto L28
            return r1
        L28:
            nq4 r4 = (defpackage.nq4) r4
            java.util.List r4 = r4.a
            java.util.Iterator r4 = r4.iterator()
        L30:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L19
            java.lang.Object r1 = r4.next()
            uq4 r1 = (defpackage.uq4) r1
            r1.a()
            goto L30
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.l07.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
