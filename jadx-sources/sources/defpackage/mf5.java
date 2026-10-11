package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class mf5 extends t36 implements ub2 {
    public final /* synthetic */ Object A;
    public final /* synthetic */ xi6 B;
    public final /* synthetic */ byte x;
    public boolean y;
    public final /* synthetic */ sf5 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mf5(sf5 sf5Var, Object obj, xi6 xi6Var, vz0 vz0Var, byte b) {
        super(1, vz0Var);
        this.x = b;
        this.z = sf5Var;
        this.A = obj;
        this.B = xi6Var;
    }

    @Override // defpackage.h30
    public final vz0 create(vz0 vz0Var) {
        switch (this.x) {
            case 0:
                return new mf5(this.z, this.A, this.B, vz0Var, (byte) 0);
            default:
                return new mf5(this.z, this.A, this.B, vz0Var, (byte) 1);
        }
    }

    @Override // defpackage.ub2
    public final Object invoke(Object obj) {
        byte b = this.x;
        pn6 pn6Var = pn6.a;
        vz0 vz0Var = (vz0) obj;
        switch (b) {
            case 0:
                return ((mf5) create(vz0Var)).invokeSuspend(pn6Var);
            default:
                return ((mf5) create(vz0Var)).invokeSuspend(pn6Var);
        }
    }

    @Override // defpackage.h30
    public final Object invokeSuspend(Object obj) {
        float f;
        byte b = this.x;
        pn6 pn6Var = pn6.a;
        w11 w11Var = w11.x;
        sf5 sf5Var = this.z;
        Object obj2 = this.A;
        xi6 xi6Var = this.B;
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
                cl1 cl1Var = new cl1(sf5Var, obj2, xi6Var, null);
                this.y = true;
                if (db.K(cl1Var, this) == w11Var) {
                    return w11Var;
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
                    sf5Var.N();
                    ti4 ti4Var = sf5Var.y;
                    sf5Var.J = Long.MIN_VALUE;
                    sf5Var.T(0.0f);
                    if (a34.i(obj2, sf5Var.z.getValue())) {
                        f = -4.0f;
                    } else if (a34.i(obj2, ti4Var.getValue())) {
                        f = -5.0f;
                    } else {
                        f = -3.0f;
                    }
                    xi6Var.r(obj2);
                    xi6Var.o(0L);
                    ti4Var.setValue(obj2);
                    sf5Var.T(0.0f);
                    sf5Var.B(obj2);
                    xi6Var.k(f);
                    if (f == -3.0f) {
                        this.y = true;
                        if (sf5Var.W(this) == w11Var) {
                            return w11Var;
                        }
                    }
                }
                xi6Var.j();
                return pn6Var;
        }
    }
}
