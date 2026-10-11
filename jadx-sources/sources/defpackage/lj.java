package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class lj extends t36 implements ic2 {
    public final /* synthetic */ Object A;
    public Object B;
    public Object C;
    public /* synthetic */ Object D;
    public final /* synthetic */ Object E;
    public final /* synthetic */ byte x = 3;
    public boolean y;
    public final /* synthetic */ Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lj(boolean z, ub2 ub2Var, dq4 dq4Var, ic2 ic2Var, w44 w44Var, w44 w44Var2, w44 w44Var3, vz0 vz0Var) {
        super(2, vz0Var);
        this.y = z;
        this.B = ub2Var;
        this.C = dq4Var;
        this.D = ic2Var;
        this.z = w44Var;
        this.A = w44Var2;
        this.E = w44Var3;
    }

    @Override // defpackage.h30
    public final vz0 create(Object obj, vz0 vz0Var) {
        byte b = this.x;
        Object obj2 = this.E;
        Object obj3 = this.A;
        Object obj4 = this.z;
        switch (b) {
            case 0:
                return new lj(this.y, (ub2) this.B, (dq4) this.C, (ic2) this.D, (w44) obj4, (w44) obj3, (w44) obj2, vz0Var);
            case 1:
                lj ljVar = new lj((lj0) this.D, (wj) obj2, (w44) obj4, (w44) obj3, vz0Var);
                ljVar.C = obj;
                return ljVar;
            case 2:
                lj ljVar2 = new lj((pi3) obj4, (eo3) obj3, (z77) obj2, vz0Var);
                ljVar2.D = obj;
                return ljVar2;
            default:
                return new lj((fg3) this.D, (eg3) obj4, (v11) obj3, (an) obj2, vz0Var);
        }
    }

    @Override // defpackage.ic2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.x;
        pn6 pn6Var = pn6.a;
        v11 v11Var = (v11) obj;
        vz0 vz0Var = (vz0) obj2;
        switch (b) {
            case 0:
                ((lj) create(v11Var, vz0Var)).invokeSuspend(pn6Var);
                return pn6Var;
            case 1:
                return ((lj) create(v11Var, vz0Var)).invokeSuspend(pn6Var);
            case 2:
                return ((lj) create(v11Var, vz0Var)).invokeSuspend(pn6Var);
            default:
                return ((lj) create(v11Var, vz0Var)).invokeSuspend(pn6Var);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:108:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:110:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:42:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0181 A[Catch: all -> 0x0160, TryCatch #0 {all -> 0x0160, blocks: (B:92:0x013d, B:94:0x015c, B:95:0x015f, B:63:0x0162, B:65:0x0181, B:66:0x0184, B:69:0x018c, B:72:0x0194, B:73:0x019d, B:74:0x019e, B:56:0x00eb, B:58:0x0133, B:80:0x0123), top: B:51:0x00da, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x018b  */
    /* JADX WARN: Type inference failed for: r14v3, types: [java.lang.Object, w05] */
    /* JADX WARN: Type inference failed for: r1v11, types: [h43] */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v6, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v7, types: [h43] */
    /* JADX WARN: Type inference failed for: r3v18, types: [java.lang.Object, w05] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:103:0x01da -> B:96:0x01dd). Please report as a decompilation issue!!! */
    @Override // defpackage.h30
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r23) {
        /*
            Method dump skipped, instructions count: 588
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lj.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lj(fg3 fg3Var, eg3 eg3Var, v11 v11Var, an anVar, vz0 vz0Var) {
        super(2, vz0Var);
        this.D = fg3Var;
        this.z = eg3Var;
        this.A = v11Var;
        this.E = anVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lj(pi3 pi3Var, eo3 eo3Var, z77 z77Var, vz0 vz0Var) {
        super(2, vz0Var);
        this.z = pi3Var;
        this.A = eo3Var;
        this.E = z77Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lj(lj0 lj0Var, wj wjVar, w44 w44Var, w44 w44Var2, vz0 vz0Var) {
        super(2, vz0Var);
        this.D = lj0Var;
        this.E = wjVar;
        this.z = w44Var;
        this.A = w44Var2;
    }
}
