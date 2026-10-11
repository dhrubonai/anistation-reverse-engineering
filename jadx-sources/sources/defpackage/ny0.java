package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class ny0 extends t36 implements ic2 {
    public /* synthetic */ Object A;
    public final /* synthetic */ Object B;
    public final /* synthetic */ Object C;
    public final /* synthetic */ Object D;
    public final /* synthetic */ Object E;
    public final /* synthetic */ byte x = 1;
    public boolean y;
    public final /* synthetic */ long z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ny0(bn4 bn4Var, String str, long j, nd6 nd6Var, jb6 jb6Var, h12 h12Var, vz0 vz0Var) {
        super(2, vz0Var);
        this.A = bn4Var;
        this.B = str;
        this.z = j;
        this.C = nd6Var;
        this.D = jb6Var;
        this.E = h12Var;
    }

    @Override // defpackage.h30
    public final vz0 create(Object obj, vz0 vz0Var) {
        byte b = this.x;
        Object obj2 = this.E;
        Object obj3 = this.D;
        Object obj4 = this.C;
        Object obj5 = this.B;
        switch (b) {
            case 0:
                ny0 ny0Var = new ny0((yo6) obj5, (py0) obj4, (fa0) obj3, this.z, (h43) obj2, vz0Var);
                ny0Var.A = obj;
                return ny0Var;
            case 1:
                return new ny0((bn4) this.A, (String) obj5, this.z, (nd6) obj4, (jb6) obj3, (h12) obj2, vz0Var);
            default:
                ny0 ny0Var2 = new ny0((hr2) obj5, this.z, (String) obj4, (bw0) obj3, (wc0) obj2, vz0Var);
                ny0Var2.A = obj;
                return ny0Var2;
        }
    }

    @Override // defpackage.ic2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.x;
        pn6 pn6Var = pn6.a;
        switch (b) {
            case 0:
                return ((ny0) create((pd5) obj, (vz0) obj2)).invokeSuspend(pn6Var);
            case 1:
                return ((ny0) create((v11) obj, (vz0) obj2)).invokeSuspend(pn6Var);
            default:
                return ((ny0) create((l97) obj, (vz0) obj2)).invokeSuspend(pn6Var);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x00b4, code lost:
    
        if (r0 == r10) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00c1, code lost:
    
        if (r0 == r10) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00df, code lost:
    
        if (r0 == r10) goto L51;
     */
    /* JADX WARN: Removed duplicated region for block: B:79:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.h30
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r23) {
        /*
            Method dump skipped, instructions count: 484
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ny0.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ny0(hr2 hr2Var, long j, String str, bw0 bw0Var, wc0 wc0Var, vz0 vz0Var) {
        super(2, vz0Var);
        this.B = hr2Var;
        this.z = j;
        this.C = str;
        this.D = bw0Var;
        this.E = wc0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ny0(yo6 yo6Var, py0 py0Var, fa0 fa0Var, long j, h43 h43Var, vz0 vz0Var) {
        super(2, vz0Var);
        this.B = yo6Var;
        this.C = py0Var;
        this.D = fa0Var;
        this.z = j;
        this.E = h43Var;
    }
}
