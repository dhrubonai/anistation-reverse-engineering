package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class vz6 extends t36 implements ic2 {
    public final /* synthetic */ byte x;
    public boolean y;
    public final /* synthetic */ v27 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vz6(boolean z, v27 v27Var, vz0 vz0Var) {
        super(2, vz0Var);
        this.x = (byte) 0;
        this.y = z;
        this.z = v27Var;
    }

    @Override // defpackage.h30
    public final vz0 create(Object obj, vz0 vz0Var) {
        byte b = this.x;
        v27 v27Var = this.z;
        switch (b) {
            case 0:
                return new vz6(this.y, v27Var, vz0Var);
            case 1:
                return new vz6(v27Var, vz0Var, (byte) 1);
            case 2:
                return new vz6(v27Var, vz0Var, (byte) 2);
            case 3:
                return new vz6(v27Var, vz0Var, (byte) 3);
            case 4:
                return new vz6(v27Var, vz0Var, (byte) 4);
            case 5:
                return new vz6(v27Var, vz0Var, (byte) 5);
            case 6:
                return new vz6(v27Var, vz0Var, (byte) 6);
            case 7:
                return new vz6(v27Var, vz0Var, (byte) 7);
            case 8:
                return new vz6(v27Var, vz0Var, (byte) 8);
            case 9:
                return new vz6(v27Var, vz0Var, (byte) 9);
            case 10:
                return new vz6(v27Var, vz0Var, (byte) 10);
            case 11:
                vz6 vz6Var = new vz6(v27Var, vz0Var, (byte) 11);
                vz6Var.y = ((Boolean) obj).booleanValue();
                return vz6Var;
            case 12:
                return new vz6(v27Var, vz0Var, (byte) 12);
            case 13:
                return new vz6(v27Var, vz0Var, (byte) 13);
            default:
                return new vz6(v27Var, vz0Var, (byte) 14);
        }
    }

    @Override // defpackage.ic2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.x;
        w11 w11Var = w11.x;
        pn6 pn6Var = pn6.a;
        switch (b) {
            case 0:
                ((vz6) create((v11) obj, (vz0) obj2)).invokeSuspend(pn6Var);
                return pn6Var;
            case 1:
                return ((vz6) create((v11) obj, (vz0) obj2)).invokeSuspend(pn6Var);
            case 2:
                return ((vz6) create((v11) obj, (vz0) obj2)).invokeSuspend(pn6Var);
            case 3:
                return ((vz6) create((v11) obj, (vz0) obj2)).invokeSuspend(pn6Var);
            case 4:
                return ((vz6) create((v11) obj, (vz0) obj2)).invokeSuspend(pn6Var);
            case 5:
                return ((vz6) create((v11) obj, (vz0) obj2)).invokeSuspend(pn6Var);
            case 6:
                return ((vz6) create((v11) obj, (vz0) obj2)).invokeSuspend(pn6Var);
            case 7:
                return ((vz6) create((v11) obj, (vz0) obj2)).invokeSuspend(pn6Var);
            case 8:
                return ((vz6) create((v11) obj, (vz0) obj2)).invokeSuspend(pn6Var);
            case 9:
                return ((vz6) create((v11) obj, (vz0) obj2)).invokeSuspend(pn6Var);
            case 10:
                return ((vz6) create((v11) obj, (vz0) obj2)).invokeSuspend(pn6Var);
            case 11:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                ((vz6) create(bool, (vz0) obj2)).invokeSuspend(pn6Var);
                return pn6Var;
            case 12:
                return ((vz6) create((v11) obj, (vz0) obj2)).invokeSuspend(pn6Var);
            case 13:
                ((vz6) create((v11) obj, (vz0) obj2)).invokeSuspend(pn6Var);
                return w11Var;
            default:
                ((vz6) create((v11) obj, (vz0) obj2)).invokeSuspend(pn6Var);
                return w11Var;
        }
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x005c -> B:18:0x005f). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:9:0x0035 -> B:7:0x0038). Please report as a decompilation issue!!! */
    @Override // defpackage.h30
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r56) {
        /*
            Method dump skipped, instructions count: 1504
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vz6.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vz6(v27 v27Var, vz0 vz0Var, byte b) {
        super(2, vz0Var);
        this.x = b;
        this.z = v27Var;
    }
}
