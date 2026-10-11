package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class jd3 extends t36 implements ic2 {
    public final /* synthetic */ byte x;
    public boolean y;
    public final /* synthetic */ kd3 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jd3(kd3 kd3Var, vz0 vz0Var, byte b) {
        super(2, vz0Var);
        this.x = b;
        this.z = kd3Var;
    }

    @Override // defpackage.h30
    public final vz0 create(Object obj, vz0 vz0Var) {
        byte b = this.x;
        kd3 kd3Var = this.z;
        switch (b) {
            case 0:
                return new jd3(kd3Var, vz0Var, (byte) 0);
            case 1:
                return new jd3(kd3Var, vz0Var, (byte) 1);
            case 2:
                return new jd3(kd3Var, vz0Var, (byte) 2);
            case 3:
                return new jd3(kd3Var, vz0Var, (byte) 3);
            default:
                return new jd3(kd3Var, vz0Var, (byte) 4);
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
                return ((jd3) create(v11Var, vz0Var)).invokeSuspend(pn6Var);
            case 1:
                return ((jd3) create(v11Var, vz0Var)).invokeSuspend(pn6Var);
            case 2:
                return ((jd3) create(v11Var, vz0Var)).invokeSuspend(pn6Var);
            case 3:
                return ((jd3) create(v11Var, vz0Var)).invokeSuspend(pn6Var);
            default:
                return ((jd3) create(v11Var, vz0Var)).invokeSuspend(pn6Var);
        }
    }

    @Override // defpackage.h30
    public final Object invokeSuspend(Object obj) {
        byte b = this.x;
        pn6 pn6Var = pn6.a;
        kd3 kd3Var = this.z;
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
                wj wjVar = kd3Var.o;
                Float f = new Float(1.0f);
                this.y = true;
                if (wjVar.f(this, f) == w11Var) {
                    return w11Var;
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
                    wj wjVar2 = kd3Var.n;
                    c13 c13Var = new c13(0L);
                    this.y = true;
                    if (wjVar2.f(this, c13Var) == w11Var) {
                        return w11Var;
                    }
                }
                kd3Var.d(0L);
                kd3Var.f.setValue(Boolean.FALSE);
                return pn6Var;
            case 2:
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
                wj wjVar3 = kd3Var.n;
                this.y = true;
                if (wjVar3.g(this) == w11Var) {
                    return w11Var;
                }
                return pn6Var;
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
                wj wjVar4 = kd3Var.o;
                this.y = true;
                if (wjVar4.g(this) == w11Var) {
                    return w11Var;
                }
                return pn6Var;
            default:
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
                wj wjVar5 = kd3Var.o;
                this.y = true;
                if (wjVar5.g(this) == w11Var) {
                    return w11Var;
                }
                return pn6Var;
        }
    }
}
