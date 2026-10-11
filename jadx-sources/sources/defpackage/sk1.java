package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class sk1 extends t36 implements ic2 {
    public final /* synthetic */ byte x;
    public boolean y;
    public final /* synthetic */ fl1 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ sk1(fl1 fl1Var, vz0 vz0Var, byte b) {
        super(2, vz0Var);
        this.x = b;
        this.z = fl1Var;
    }

    @Override // defpackage.h30
    public final vz0 create(Object obj, vz0 vz0Var) {
        byte b = this.x;
        fl1 fl1Var = this.z;
        switch (b) {
            case 0:
                return new sk1(fl1Var, vz0Var, (byte) 0);
            default:
                return new sk1(fl1Var, vz0Var, (byte) 1);
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
                ((sk1) create(v11Var, vz0Var)).invokeSuspend(pn6Var);
                return w11.x;
            default:
                return ((sk1) create(v11Var, vz0Var)).invokeSuspend(pn6Var);
        }
    }

    @Override // defpackage.h30
    public final Object invokeSuspend(Object obj) {
        byte b = this.x;
        fl1 fl1Var = this.z;
        w11 w11Var = w11.x;
        switch (b) {
            case 0:
                boolean z = this.y;
                if (z) {
                    if (!z) {
                        ze0.m("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        m37.N(obj);
                        v71.e();
                    }
                    return null;
                }
                m37.N(obj);
                vy4 vy4Var = fl1Var.e.b;
                rc rcVar = new rc(fl1Var, (byte) 5);
                this.y = true;
                vy4Var.x.collect(rcVar, this);
                return w11Var;
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
                    this.y = true;
                    if (fl1Var.n(this) == w11Var) {
                        return w11Var;
                    }
                }
                return pn6.a;
        }
    }
}
