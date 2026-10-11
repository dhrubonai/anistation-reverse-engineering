package defpackage;

import java.util.List;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class c10 extends t36 implements ub2 {
    public final /* synthetic */ boolean A;
    public final /* synthetic */ m10 B;
    public List x;
    public List y;
    public byte z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c10(boolean z, m10 m10Var, vz0 vz0Var) {
        super(1, vz0Var);
        this.A = z;
        this.B = m10Var;
    }

    @Override // defpackage.h30
    public final vz0 create(vz0 vz0Var) {
        return new c10(this.A, this.B, vz0Var);
    }

    @Override // defpackage.ub2
    public final Object invoke(Object obj) {
        return ((c10) create((vz0) obj)).invokeSuspend(pn6.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x004e, code lost:
    
        if (r0 != r6) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x003e, code lost:
    
        if (r9 == r6) goto L24;
     */
    @Override // defpackage.h30
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            m10 r0 = r8.B
            zx6 r1 = r0.c
            byte r2 = r8.z
            r3 = 3
            r4 = 2
            r5 = 1
            w11 r6 = defpackage.w11.x
            if (r2 == 0) goto L2f
            if (r2 == r5) goto L2b
            if (r2 == r4) goto L22
            if (r2 != r3) goto L1b
            java.util.List r0 = r8.y
            java.util.List r8 = r8.x
            defpackage.m37.N(r9)
            goto L63
        L1b:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ze0.m(r8)
            r8 = 0
            return r8
        L22:
            java.util.List r0 = r8.x
            defpackage.m37.N(r9)
            r7 = r0
            r0 = r9
            r9 = r7
            goto L51
        L2b:
            defpackage.m37.N(r9)
            goto L41
        L2f:
            defpackage.m37.N(r9)
            boolean r9 = r8.A
            if (r9 == 0) goto L44
            tm r9 = r0.b
            r8.z = r5
            java.lang.Object r9 = r9.getAllOnce(r8)
            if (r9 != r6) goto L41
            goto L5f
        L41:
            java.util.List r9 = (java.util.List) r9
            goto L46
        L44:
            nt1 r9 = defpackage.nt1.x
        L46:
            r8.x = r9
            r8.z = r4
            java.lang.Object r0 = r1.getAllOnce(r8)
            if (r0 != r6) goto L51
            goto L5f
        L51:
            java.util.List r0 = (java.util.List) r0
            r8.x = r9
            r8.y = r0
            r8.z = r3
            java.lang.Object r8 = r1.getAllRemovedOnce(r8)
            if (r8 != r6) goto L60
        L5f:
            return r6
        L60:
            r7 = r9
            r9 = r8
            r8 = r7
        L63:
            java.util.List r9 = (java.util.List) r9
            z00 r1 = new z00
            r1.<init>(r8, r0, r9)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.c10.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
