package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class d76 extends t36 implements ic2 {
    public final /* synthetic */ byte x;
    public final /* synthetic */ ot4 y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d76(ot4 ot4Var, vz0 vz0Var, byte b) {
        super(2, vz0Var);
        this.x = b;
        this.y = ot4Var;
    }

    @Override // defpackage.h30
    public final vz0 create(Object obj, vz0 vz0Var) {
        byte b = this.x;
        ot4 ot4Var = this.y;
        switch (b) {
            case 0:
                return new d76(ot4Var, vz0Var, (byte) 0);
            case 1:
                return new d76(ot4Var, vz0Var, (byte) 1);
            case 2:
                return new d76(ot4Var, vz0Var, (byte) 2);
            case 3:
                return new d76(ot4Var, vz0Var, (byte) 3);
            case 4:
                return new d76(ot4Var, vz0Var, (byte) 4);
            case 5:
                return new d76(ot4Var, vz0Var, (byte) 5);
            case 6:
                return new d76(ot4Var, vz0Var, (byte) 6);
            default:
                return new d76(ot4Var, vz0Var, (byte) 7);
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
                ((d76) create(v11Var, vz0Var)).invokeSuspend(pn6Var);
                return pn6Var;
            case 1:
                ((d76) create(v11Var, vz0Var)).invokeSuspend(pn6Var);
                return pn6Var;
            case 2:
                ((d76) create(v11Var, vz0Var)).invokeSuspend(pn6Var);
                return pn6Var;
            case 3:
                ((d76) create(v11Var, vz0Var)).invokeSuspend(pn6Var);
                return pn6Var;
            case 4:
                ((d76) create(v11Var, vz0Var)).invokeSuspend(pn6Var);
                return pn6Var;
            case 5:
                ((d76) create(v11Var, vz0Var)).invokeSuspend(pn6Var);
                return pn6Var;
            case 6:
                ((d76) create(v11Var, vz0Var)).invokeSuspend(pn6Var);
                return pn6Var;
            default:
                ((d76) create(v11Var, vz0Var)).invokeSuspend(pn6Var);
                return pn6Var;
        }
    }

    @Override // defpackage.h30
    public final Object invokeSuspend(Object obj) {
        byte b = this.x;
        pn6 pn6Var = pn6.a;
        ot4 ot4Var = this.y;
        switch (b) {
            case 0:
                m37.N(obj);
                ot4Var.a();
                return pn6Var;
            case 1:
                m37.N(obj);
                ot4Var.c();
                return pn6Var;
            case 2:
                m37.N(obj);
                ot4Var.c();
                return pn6Var;
            case 3:
                m37.N(obj);
                ot4Var.a();
                return pn6Var;
            case 4:
                m37.N(obj);
                ot4Var.c();
                return pn6Var;
            case 5:
                m37.N(obj);
                ot4Var.c();
                return pn6Var;
            case 6:
                m37.N(obj);
                ot4Var.a();
                return pn6Var;
            default:
                m37.N(obj);
                ot4Var.c();
                return pn6Var;
        }
    }
}
