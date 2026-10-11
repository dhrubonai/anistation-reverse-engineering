package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class lt4 extends x45 implements ic2 {
    public /* synthetic */ Object A;
    public Object B;
    public Object C;
    public final /* synthetic */ Object D;
    public final /* synthetic */ byte y = 1;
    public byte z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lt4(eb2 eb2Var, b14 b14Var, k96 k96Var, vz0 vz0Var) {
        super(2, vz0Var);
        this.B = eb2Var;
        this.C = b14Var;
        this.D = k96Var;
    }

    @Override // defpackage.h30
    public final vz0 create(Object obj, vz0 vz0Var) {
        byte b = this.y;
        Object obj2 = this.D;
        switch (b) {
            case 0:
                lt4 lt4Var = new lt4((mn0) this.C, (g40) obj2, vz0Var);
                lt4Var.A = obj;
                return lt4Var;
            case 1:
                lt4 lt4Var2 = new lt4((eb2) this.B, (b14) this.C, (k96) obj2, vz0Var);
                lt4Var2.A = obj;
                return lt4Var2;
            default:
                lt4 lt4Var3 = new lt4((n06) obj2, vz0Var);
                lt4Var3.A = obj;
                return lt4Var3;
        }
    }

    @Override // defpackage.ic2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.y;
        pn6 pn6Var = pn6.a;
        z36 z36Var = (z36) obj;
        vz0 vz0Var = (vz0) obj2;
        switch (b) {
            case 0:
                return ((lt4) create(z36Var, vz0Var)).invokeSuspend(pn6Var);
            case 1:
                return ((lt4) create(z36Var, vz0Var)).invokeSuspend(pn6Var);
            default:
                return ((lt4) create(z36Var, vz0Var)).invokeSuspend(pn6Var);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:150:0x01b8, code lost:
    
        continue;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x024c  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:160:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0107 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0272  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x031f  */
    /* JADX WARN: Removed duplicated region for block: B:227:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:233:0x034c  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x0359  */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:254:0x0408  */
    /* JADX WARN: Removed duplicated region for block: B:261:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x026c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0144  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:119:0x00d1 -> B:30:0x00d5). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:206:0x03fa -> B:199:0x03fd). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x023e -> B:9:0x0241). Please report as a decompilation issue!!! */
    @Override // defpackage.h30
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r21) {
        /*
            Method dump skipped, instructions count: 1070
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lt4.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lt4(mn0 mn0Var, g40 g40Var, vz0 vz0Var) {
        super(2, vz0Var);
        this.C = mn0Var;
        this.D = g40Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lt4(n06 n06Var, vz0 vz0Var) {
        super(2, vz0Var);
        this.D = n06Var;
    }
}
