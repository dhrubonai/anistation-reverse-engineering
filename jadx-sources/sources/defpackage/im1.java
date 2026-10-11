package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class im1 extends t36 implements ub2 {
    public final /* synthetic */ byte x;
    public boolean y;
    public final /* synthetic */ wc3 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ im1(wc3 wc3Var, vz0 vz0Var, byte b) {
        super(1, vz0Var);
        this.x = b;
        this.z = wc3Var;
    }

    @Override // defpackage.h30
    public final vz0 create(vz0 vz0Var) {
        switch (this.x) {
            case 0:
                return new im1(this.z, vz0Var, (byte) 0);
            case 1:
                return new im1(this.z, vz0Var, (byte) 1);
            default:
                return new im1(this.z, vz0Var, (byte) 2);
        }
    }

    @Override // defpackage.ub2
    public final Object invoke(Object obj) {
        byte b = this.x;
        pn6 pn6Var = pn6.a;
        vz0 vz0Var = (vz0) obj;
        switch (b) {
            case 0:
                return ((im1) create(vz0Var)).invokeSuspend(pn6Var);
            case 1:
                return ((im1) create(vz0Var)).invokeSuspend(pn6Var);
            default:
                return ((im1) create(vz0Var)).invokeSuspend(pn6Var);
        }
    }

    @Override // defpackage.h30
    public final Object invokeSuspend(Object obj) {
        byte b = this.x;
        pn6 pn6Var = pn6.a;
        wc3 wc3Var = this.z;
        w11 w11Var = w11.x;
        switch (b) {
            case 0:
                boolean z = this.y;
                if (z) {
                    if (z) {
                        m37.N(obj);
                        return pn6Var;
                    }
                    ze0.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                m37.N(obj);
                this.y = true;
                if (wc3.i(wc3Var, 0, this) == w11Var) {
                    return w11Var;
                }
                return pn6Var;
            case 1:
                boolean z2 = this.y;
                if (z2) {
                    if (z2) {
                        m37.N(obj);
                        return pn6Var;
                    }
                    ze0.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                m37.N(obj);
                this.y = true;
                if (wc3.i(wc3Var, 0, this) == w11Var) {
                    return w11Var;
                }
                return pn6Var;
            default:
                boolean z3 = this.y;
                if (z3) {
                    if (z3) {
                        m37.N(obj);
                        return pn6Var;
                    }
                    ze0.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                m37.N(obj);
                this.y = true;
                if (wc3.i(wc3Var, 0, this) == w11Var) {
                    return w11Var;
                }
                return pn6Var;
        }
    }
}
