package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class ea6 extends t36 implements ic2 {
    public final /* synthetic */ byte x;
    public boolean y;
    public final /* synthetic */ cc6 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ea6(cc6 cc6Var, vz0 vz0Var, byte b) {
        super(2, vz0Var);
        this.x = b;
        this.z = cc6Var;
    }

    @Override // defpackage.h30
    public final vz0 create(Object obj, vz0 vz0Var) {
        byte b = this.x;
        cc6 cc6Var = this.z;
        switch (b) {
            case 0:
                return new ea6(cc6Var, vz0Var, (byte) 0);
            case 1:
                return new ea6(cc6Var, vz0Var, (byte) 1);
            default:
                return new ea6(cc6Var, vz0Var, (byte) 2);
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
                return ((ea6) create(v11Var, vz0Var)).invokeSuspend(pn6Var);
            case 1:
                return ((ea6) create(v11Var, vz0Var)).invokeSuspend(pn6Var);
            default:
                return ((ea6) create(v11Var, vz0Var)).invokeSuspend(pn6Var);
        }
    }

    @Override // defpackage.h30
    public final Object invokeSuspend(Object obj) {
        byte b = this.x;
        cc6 cc6Var = this.z;
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
                    this.y = true;
                    if (cc6Var.y(this) == w11Var) {
                        return w11Var;
                    }
                }
                return pn6Var;
            case 1:
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
                    this.y = true;
                    cc6Var.getClass();
                    mx0 j = wt5.j(new g40(cc6Var, (byte) 5));
                    wb6 wb6Var = wb6.x;
                    f01 f01Var = sw0.F;
                    wk6.j(2, wb6Var);
                    Object collect = sw0.n(j, f01Var, wb6Var).collect(new ii(new Object(), new xb6(cc6Var, (byte) 0), (byte) 3), this);
                    if (collect != w11Var) {
                        collect = pn6Var;
                    }
                    if (collect != w11Var) {
                        collect = pn6Var;
                    }
                    if (collect == w11Var) {
                        return w11Var;
                    }
                }
                return pn6Var;
            default:
                boolean z3 = this.y;
                if (z3) {
                    if (z3) {
                        m37.N(obj);
                    } else {
                        ze0.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    m37.N(obj);
                    this.y = true;
                    cc6Var.getClass();
                    Object collect2 = sw0.n(wt5.j(new g40(cc6Var, (byte) 4)), new ka6((byte) 4), sw0.G).collect(new xb6(cc6Var, (byte) 1), this);
                    if (collect2 != w11Var) {
                        collect2 = pn6Var;
                    }
                    if (collect2 == w11Var) {
                        return w11Var;
                    }
                }
                return pn6Var;
        }
    }
}
