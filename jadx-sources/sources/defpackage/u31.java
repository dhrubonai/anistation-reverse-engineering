package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class u31 extends t36 implements ic2 {
    public /* synthetic */ Object A;
    public final /* synthetic */ boolean B;
    public final /* synthetic */ boolean C;
    public final /* synthetic */ v65 D;
    public final /* synthetic */ ub2 E;
    public final /* synthetic */ byte x;
    public uh6 y;
    public byte z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u31(boolean z, boolean z2, v65 v65Var, vz0 vz0Var, ub2 ub2Var, byte b) {
        super(2, vz0Var);
        this.x = b;
        this.B = z;
        this.C = z2;
        this.D = v65Var;
        this.E = ub2Var;
    }

    @Override // defpackage.h30
    public final vz0 create(Object obj, vz0 vz0Var) {
        switch (this.x) {
            case 0:
                u31 u31Var = new u31(this.B, this.C, this.D, vz0Var, this.E, (byte) 0);
                u31Var.A = obj;
                return u31Var;
            default:
                u31 u31Var2 = new u31(this.B, this.C, this.D, vz0Var, this.E, (byte) 1);
                u31Var2.A = obj;
                return u31Var2;
        }
    }

    @Override // defpackage.ic2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.x;
        pn6 pn6Var = pn6.a;
        vh6 vh6Var = (vh6) obj;
        vz0 vz0Var = (vz0) obj2;
        switch (b) {
            case 0:
                return ((u31) create(vh6Var, vz0Var)).invokeSuspend(pn6Var);
            default:
                return ((u31) create(vh6Var, vz0Var)).invokeSuspend(pn6Var);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:59:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:74:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.h30
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r17) {
        /*
            Method dump skipped, instructions count: 404
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.u31.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
