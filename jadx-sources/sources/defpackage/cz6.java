package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class cz6 extends t36 implements ic2 {
    public final /* synthetic */ byte x;
    public /* synthetic */ boolean y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ cz6(int i, vz0 vz0Var, byte b) {
        super(i, vz0Var);
        this.x = b;
    }

    @Override // defpackage.h30
    public final vz0 create(Object obj, vz0 vz0Var) {
        switch (this.x) {
            case 0:
                cz6 cz6Var = new cz6(2, vz0Var, (byte) 0);
                cz6Var.y = ((Boolean) obj).booleanValue();
                return cz6Var;
            default:
                cz6 cz6Var2 = new cz6(2, vz0Var, (byte) 1);
                cz6Var2.y = ((Boolean) obj).booleanValue();
                return cz6Var2;
        }
    }

    @Override // defpackage.ic2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.x;
        pn6 pn6Var = pn6.a;
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        vz0 vz0Var = (vz0) obj2;
        switch (b) {
            case 0:
                return ((cz6) create(bool, vz0Var)).invokeSuspend(pn6Var);
            default:
                return ((cz6) create(bool, vz0Var)).invokeSuspend(pn6Var);
        }
    }

    @Override // defpackage.h30
    public final Object invokeSuspend(Object obj) {
        byte b = this.x;
        boolean z = this.y;
        switch (b) {
            case 0:
                m37.N(obj);
                return Boolean.valueOf(z);
            default:
                m37.N(obj);
                return Boolean.valueOf(z);
        }
    }
}
