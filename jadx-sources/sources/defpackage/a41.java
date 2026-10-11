package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class a41 extends t36 implements ub2 {
    public final /* synthetic */ ub2 A;
    public final /* synthetic */ byte x;
    public boolean y;
    public final /* synthetic */ v65 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a41(byte b, vz0 vz0Var, ub2 ub2Var, v65 v65Var) {
        super(1, vz0Var);
        this.x = b;
        this.z = v65Var;
        this.A = ub2Var;
    }

    @Override // defpackage.h30
    public final vz0 create(vz0 vz0Var) {
        byte b = this.x;
        ub2 ub2Var = this.A;
        v65 v65Var = this.z;
        switch (b) {
            case 0:
                return new a41((byte) 0, vz0Var, ub2Var, v65Var);
            default:
                return new a41((byte) 1, vz0Var, ub2Var, v65Var);
        }
    }

    @Override // defpackage.ub2
    public final Object invoke(Object obj) {
        byte b = this.x;
        pn6 pn6Var = pn6.a;
        vz0 vz0Var = (vz0) obj;
        switch (b) {
            case 0:
                return ((a41) create(vz0Var)).invokeSuspend(pn6Var);
            default:
                return ((a41) create(vz0Var)).invokeSuspend(pn6Var);
        }
    }

    @Override // defpackage.h30
    public final Object invokeSuspend(Object obj) {
        byte b = this.x;
        ub2 ub2Var = this.A;
        w11 w11Var = w11.x;
        v65 v65Var = this.z;
        vz0 vz0Var = null;
        switch (b) {
            case 0:
                boolean z = this.y;
                if (z) {
                    if (z) {
                        m37.N(obj);
                        return obj;
                    }
                    ze0.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                m37.N(obj);
                z31 z31Var = new z31((byte) 0, vz0Var, ub2Var, v65Var);
                this.y = true;
                Object useConnection = v65Var.useConnection(false, z31Var, this);
                if (useConnection == w11Var) {
                    return w11Var;
                }
                return useConnection;
            default:
                boolean z2 = this.y;
                try {
                    if (z2) {
                        if (z2) {
                            m37.N(obj);
                        } else {
                            ze0.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                    } else {
                        m37.N(obj);
                        v65Var.beginTransaction();
                        this.y = true;
                        obj = ub2Var.invoke(this);
                        if (obj == w11Var) {
                            return w11Var;
                        }
                    }
                    v65Var.setTransactionSuccessful();
                    v65Var.endTransaction();
                    return obj;
                } catch (Throwable th) {
                    v65Var.endTransaction();
                    throw th;
                }
        }
    }
}
