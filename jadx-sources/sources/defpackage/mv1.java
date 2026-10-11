package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class mv1 extends x45 implements ic2 {
    public int A;
    public int B;
    public int C;
    public int D;
    public long E;
    public boolean F;
    public /* synthetic */ Object G;
    public Object H;
    public final /* synthetic */ Object I;
    public final /* synthetic */ byte y;
    public long[] z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mv1(Object obj, vz0 vz0Var, byte b) {
        super(2, vz0Var);
        this.y = b;
        this.I = obj;
    }

    @Override // defpackage.h30
    public final vz0 create(Object obj, vz0 vz0Var) {
        byte b = this.y;
        Object obj2 = this.I;
        switch (b) {
            case 0:
                mv1 mv1Var = new mv1((nv1) obj2, vz0Var, (byte) 0);
                mv1Var.G = obj;
                return mv1Var;
            case 1:
                mv1 mv1Var2 = new mv1((nv1) obj2, vz0Var, (byte) 1);
                mv1Var2.G = obj;
                return mv1Var2;
            case 2:
                mv1 mv1Var3 = new mv1((eb5) obj2, vz0Var, (byte) 2);
                mv1Var3.G = obj;
                return mv1Var3;
            default:
                mv1 mv1Var4 = new mv1((y06) obj2, vz0Var, (byte) 3);
                mv1Var4.G = obj;
                return mv1Var4;
        }
    }

    @Override // defpackage.ic2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.y;
        pn6 pn6Var = pn6.a;
        ri5 ri5Var = (ri5) obj;
        vz0 vz0Var = (vz0) obj2;
        switch (b) {
            case 0:
                return ((mv1) create(ri5Var, vz0Var)).invokeSuspend(pn6Var);
            case 1:
                return ((mv1) create(ri5Var, vz0Var)).invokeSuspend(pn6Var);
            case 2:
                return ((mv1) create(ri5Var, vz0Var)).invokeSuspend(pn6Var);
            default:
                return ((mv1) create(ri5Var, vz0Var)).invokeSuspend(pn6Var);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:46:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:71:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0269  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0272  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:96:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0080  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0084 -> B:7:0x00a2). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x006d -> B:16:0x00ac). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x006f -> B:8:0x007e). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x0117 -> B:29:0x0135). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:40:0x00fe -> B:37:0x013e). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:41:0x0100 -> B:30:0x0111). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:53:0x01a9 -> B:50:0x01c7). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:61:0x0190 -> B:58:0x01d0). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:62:0x0192 -> B:51:0x01a3). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:74:0x023b -> B:71:0x0266). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:82:0x0221 -> B:79:0x0270). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:83:0x0223 -> B:72:0x0235). Please report as a decompilation issue!!! */
    @Override // defpackage.h30
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r26) {
        /*
            Method dump skipped, instructions count: 640
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mv1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
