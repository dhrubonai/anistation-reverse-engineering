package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class a97 extends t36 implements ic2 {
    public final /* synthetic */ byte x;
    public boolean y;
    public final /* synthetic */ b97 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a97(b97 b97Var, vz0 vz0Var, byte b) {
        super(2, vz0Var);
        this.x = b;
        this.z = b97Var;
    }

    @Override // defpackage.h30
    public final vz0 create(Object obj, vz0 vz0Var) {
        byte b = this.x;
        b97 b97Var = this.z;
        switch (b) {
            case 0:
                return new a97(b97Var, vz0Var, (byte) 0);
            default:
                return new a97(b97Var, vz0Var, (byte) 1);
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
                return ((a97) create(v11Var, vz0Var)).invokeSuspend(pn6Var);
            default:
                return ((a97) create(v11Var, vz0Var)).invokeSuspend(pn6Var);
        }
    }

    @Override // defpackage.h30
    public final Object invokeSuspend(Object obj) {
        byte b = this.x;
        b97 b97Var = this.z;
        w11 w11Var = w11.x;
        pn6 pn6Var = pn6.a;
        switch (b) {
            case 0:
                boolean z = this.y;
                if (z) {
                    if (z) {
                        m37.N(obj);
                    } else {
                        ze0.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    m37.N(obj);
                    oa oaVar = b97Var.x;
                    this.y = true;
                    Object g = oaVar.T.g(this);
                    if (g != w11Var) {
                        g = pn6Var;
                    }
                    if (g == w11Var) {
                        return w11Var;
                    }
                }
                return pn6Var;
            default:
                boolean z2 = this.y;
                if (z2) {
                    if (z2) {
                        m37.N(obj);
                    } else {
                        ze0.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    m37.N(obj);
                    oa oaVar2 = b97Var.x;
                    this.y = true;
                    Object a = oaVar2.U.a(this);
                    if (a != w11Var) {
                        a = pn6Var;
                    }
                    if (a == w11Var) {
                        return w11Var;
                    }
                }
                return pn6Var;
        }
    }
}
