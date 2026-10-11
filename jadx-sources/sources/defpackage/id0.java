package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class id0 extends t36 implements ub2 {
    public final /* synthetic */ byte x;
    public boolean y;
    public final /* synthetic */ Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ id0(Object obj, vz0 vz0Var, byte b) {
        super(1, vz0Var);
        this.x = b;
        this.z = obj;
    }

    @Override // defpackage.h30
    public final vz0 create(vz0 vz0Var) {
        byte b = this.x;
        Object obj = this.z;
        switch (b) {
            case 0:
                return new id0((bx5) obj, vz0Var, (byte) 0);
            case 1:
                return new id0((i41) obj, vz0Var, (byte) 1);
            case 2:
                return new id0((m51) obj, vz0Var, (byte) 2);
            case 3:
                return new id0((af3) obj, vz0Var, (byte) 3);
            case 4:
                return new id0((yc5) obj, vz0Var, (byte) 4);
            default:
                return new id0((ng6) obj, vz0Var, (byte) 5);
        }
    }

    @Override // defpackage.ub2
    public final Object invoke(Object obj) {
        byte b = this.x;
        pn6 pn6Var = pn6.a;
        vz0 vz0Var = (vz0) obj;
        switch (b) {
            case 0:
                return ((id0) create(vz0Var)).invokeSuspend(pn6Var);
            case 1:
                return ((id0) create(vz0Var)).invokeSuspend(pn6Var);
            case 2:
                return ((id0) create(vz0Var)).invokeSuspend(pn6Var);
            case 3:
                return ((id0) create(vz0Var)).invokeSuspend(pn6Var);
            case 4:
                return ((id0) create(vz0Var)).invokeSuspend(pn6Var);
            default:
                return ((id0) create(vz0Var)).invokeSuspend(pn6Var);
        }
    }

    @Override // defpackage.h30
    public final Object invokeSuspend(Object obj) {
        byte b = this.x;
        pn6 pn6Var = pn6.a;
        Object obj2 = this.z;
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
                if (((bx5) obj2).G(this) == w11Var) {
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
                if (((i41) obj2).cleanUp(this) == w11Var) {
                    return w11Var;
                }
                return pn6Var;
            case 2:
                boolean z3 = this.y;
                if (z3) {
                    if (z3) {
                        m37.N(obj);
                        return obj;
                    }
                    ze0.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                m37.N(obj);
                this.y = true;
                Object invoke = ((m51) obj2).invoke(this);
                if (invoke == w11Var) {
                    return w11Var;
                }
                return invoke;
            case 3:
                boolean z4 = this.y;
                if (z4) {
                    if (z4) {
                        m37.N(obj);
                        return pn6Var;
                    }
                    ze0.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                m37.N(obj);
                this.y = true;
                y23 y23Var = af3.y;
                if (((af3) obj2).l(0, 0, this) == w11Var) {
                    return w11Var;
                }
                return pn6Var;
            case 4:
                boolean z5 = this.y;
                if (z5) {
                    if (z5) {
                        m37.N(obj);
                        return pn6Var;
                    }
                    ze0.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                m37.N(obj);
                yc5 yc5Var = (yc5) obj2;
                this.y = true;
                if (jf7.I(yc5Var, 0 - yc5Var.a.h(), this) == w11Var) {
                    return w11Var;
                }
                return pn6Var;
            default:
                boolean z6 = this.y;
                if (z6) {
                    if (z6) {
                        m37.N(obj);
                        return pn6Var;
                    }
                    ze0.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                m37.N(obj);
                ng6 ng6Var = (ng6) obj2;
                this.y = true;
                qg0 qg0Var = new qg0(1, wc7.z(this));
                qg0Var.t();
                ng6Var.b.z.setValue(Boolean.TRUE);
                ng6Var.c = qg0Var;
                if (qg0Var.r() == w11Var) {
                    return w11Var;
                }
                return pn6Var;
        }
    }
}
