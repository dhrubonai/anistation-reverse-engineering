package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class y8 extends t36 implements ub2 {
    public final /* synthetic */ ec2 A;
    public final /* synthetic */ Object B;
    public final /* synthetic */ byte x;
    public boolean y;
    public final /* synthetic */ Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y8(Object obj, Object obj2, ec2 ec2Var, vz0 vz0Var, byte b) {
        super(1, vz0Var);
        this.x = b;
        this.B = obj;
        this.z = obj2;
        this.A = ec2Var;
    }

    @Override // defpackage.h30
    public final vz0 create(vz0 vz0Var) {
        byte b = this.x;
        ec2 ec2Var = this.A;
        Object obj = this.B;
        switch (b) {
            case 0:
                return new y8((d9) obj, this.z, (kc2) ec2Var, vz0Var, (byte) 0);
            case 1:
                return new y8((e9) obj, this.z, (kc2) ec2Var, vz0Var, (byte) 1);
            default:
                return new y8((mj4) obj, (uh6) this.z, (ic2) ec2Var, vz0Var, (byte) 2);
        }
    }

    @Override // defpackage.ub2
    public final Object invoke(Object obj) {
        byte b = this.x;
        pn6 pn6Var = pn6.a;
        vz0 vz0Var = (vz0) obj;
        switch (b) {
            case 0:
                return ((y8) create(vz0Var)).invokeSuspend(pn6Var);
            case 1:
                return ((y8) create(vz0Var)).invokeSuspend(pn6Var);
            default:
                return ((y8) create(vz0Var)).invokeSuspend(pn6Var);
        }
    }

    @Override // defpackage.h30
    public final Object invokeSuspend(Object obj) {
        byte b = this.x;
        pn6 pn6Var = pn6.a;
        ec2 ec2Var = this.A;
        Object obj2 = this.z;
        Object obj3 = this.B;
        w11 w11Var = w11.x;
        vz0 vz0Var = null;
        switch (b) {
            case 0:
                d9 d9Var = (d9) obj3;
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
                d9Var.k.setValue(obj2);
                byte b2 = 3;
                s8 s8Var = new s8(d9Var, b2);
                e0 e0Var = new e0((kc2) ec2Var, d9Var, vz0Var, b2);
                this.y = true;
                if (h41.Y(s8Var, e0Var, this) == w11Var) {
                    return w11Var;
                }
                return pn6Var;
            case 1:
                e9 e9Var = (e9) obj3;
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
                    e9Var.h.setValue(obj2);
                    t8 t8Var = new t8(e9Var, (byte) 2);
                    e0 e0Var2 = new e0((kc2) ec2Var, e9Var, vz0Var, (byte) 4);
                    this.y = true;
                    if (z51.J(t8Var, e0Var2, this) == w11Var) {
                        return w11Var;
                    }
                }
                b3 b3Var = e9Var.a;
                e9Var.j.a(e9Var.b().c(obj2), e9Var.g.h());
                e9Var.d.setValue(obj2);
                e9Var.c.setValue(obj2);
                return pn6Var;
            default:
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
                Object e = ((mj4) obj3).e((uh6) obj2, (ic2) ec2Var, this);
                if (e == w11Var) {
                    return w11Var;
                }
                return e;
        }
    }
}
