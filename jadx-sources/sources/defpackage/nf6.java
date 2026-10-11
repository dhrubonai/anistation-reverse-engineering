package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class nf6 extends t36 implements ic2 {
    public final /* synthetic */ byte x;
    public byte y;
    public final /* synthetic */ Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ nf6(Object obj, vz0 vz0Var, byte b) {
        super(2, vz0Var);
        this.x = b;
        this.z = obj;
    }

    @Override // defpackage.h30
    public final vz0 create(Object obj, vz0 vz0Var) {
        byte b = this.x;
        Object obj2 = this.z;
        switch (b) {
            case 0:
                return new nf6((pf6) obj2, vz0Var, (byte) 0);
            case 1:
                return new nf6((do5) obj2, vz0Var, (byte) 1);
            case 2:
                nf6 nf6Var = new nf6((cc6) obj2, vz0Var, (byte) 2);
                long j = ((xc4) obj).a;
                return nf6Var;
            case 3:
                return new nf6((km3) obj2, vz0Var, (byte) 3);
            case 4:
                return new nf6((lx4) obj2, vz0Var, (byte) 4);
            default:
                return new nf6((a46) obj2, vz0Var, (byte) 5);
        }
    }

    @Override // defpackage.ic2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.x;
        pn6 pn6Var = pn6.a;
        switch (b) {
            case 0:
                return ((nf6) create((v11) obj, (vz0) obj2)).invokeSuspend(pn6Var);
            case 1:
                return ((nf6) create((v11) obj, (vz0) obj2)).invokeSuspend(pn6Var);
            case 2:
                long j = ((xc4) obj).a;
                return new nf6((cc6) this.z, (vz0) obj2, (byte) 2).invokeSuspend(pn6Var);
            case 3:
                ((nf6) create((v11) obj, (vz0) obj2)).invokeSuspend(pn6Var);
                return w11.x;
            case 4:
                return ((nf6) create((v11) obj, (vz0) obj2)).invokeSuspend(pn6Var);
            default:
                return ((nf6) create((v11) obj, (vz0) obj2)).invokeSuspend(pn6Var);
        }
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0095  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:44:0x0093 -> B:37:0x0084). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:46:0x00af -> B:35:0x00b3). Please report as a decompilation issue!!! */
    @Override // defpackage.h30
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            Method dump skipped, instructions count: 466
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nf6.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
