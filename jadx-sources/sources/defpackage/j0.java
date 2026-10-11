package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class j0 extends t36 implements ic2 {
    public final /* synthetic */ byte x;
    public final /* synthetic */ k0 y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j0(k0 k0Var, vz0 vz0Var, byte b) {
        super(2, vz0Var);
        this.x = b;
        this.y = k0Var;
    }

    @Override // defpackage.h30
    public final vz0 create(Object obj, vz0 vz0Var) {
        byte b = this.x;
        k0 k0Var = this.y;
        switch (b) {
            case 0:
                return new j0(k0Var, vz0Var, (byte) 0);
            default:
                return new j0(k0Var, vz0Var, (byte) 1);
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
                ((j0) create(v11Var, vz0Var)).invokeSuspend(pn6Var);
                return pn6Var;
            default:
                ((j0) create(v11Var, vz0Var)).invokeSuspend(pn6Var);
                return pn6Var;
        }
    }

    /* JADX WARN: Type inference failed for: r8v2, types: [fo2, java.lang.Object] */
    @Override // defpackage.h30
    public final Object invokeSuspend(Object obj) {
        byte b = this.x;
        pn6 pn6Var = pn6.a;
        k0 k0Var = this.y;
        switch (b) {
            case 0:
                m37.N(obj);
                if (k0Var.a0 == null) {
                    ?? obj2 = new Object();
                    u34 u34Var = k0Var.N;
                    if (u34Var != null) {
                        tl7.z(k0Var.O0(), null, null, new c0(u34Var, obj2, null, (byte) 0), 3);
                    }
                    k0Var.a0 = obj2;
                }
                return pn6Var;
            default:
                m37.N(obj);
                fo2 fo2Var = k0Var.a0;
                if (fo2Var != null) {
                    go2 go2Var = new go2(fo2Var);
                    u34 u34Var2 = k0Var.N;
                    if (u34Var2 != null) {
                        tl7.z(k0Var.O0(), null, null, new c0(u34Var2, go2Var, null, (byte) 1), 3);
                    }
                    k0Var.a0 = null;
                }
                return pn6Var;
        }
    }
}
