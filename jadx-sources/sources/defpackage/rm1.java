package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class rm1 extends t36 implements ic2 {
    public final /* synthetic */ byte x;
    public boolean y;
    public final /* synthetic */ tm1 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ rm1(tm1 tm1Var, vz0 vz0Var, byte b) {
        super(2, vz0Var);
        this.x = b;
        this.z = tm1Var;
    }

    @Override // defpackage.h30
    public final vz0 create(Object obj, vz0 vz0Var) {
        byte b = this.x;
        tm1 tm1Var = this.z;
        switch (b) {
            case 0:
                return new rm1(tm1Var, vz0Var, (byte) 0);
            case 1:
                return new rm1(tm1Var, vz0Var, (byte) 1);
            case 2:
                return new rm1(tm1Var, vz0Var, (byte) 2);
            case 3:
                return new rm1(tm1Var, vz0Var, (byte) 3);
            default:
                return new rm1(tm1Var, vz0Var, (byte) 4);
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
                return ((rm1) create(v11Var, vz0Var)).invokeSuspend(pn6Var);
            case 1:
                return ((rm1) create(v11Var, vz0Var)).invokeSuspend(pn6Var);
            case 2:
                return ((rm1) create(v11Var, vz0Var)).invokeSuspend(pn6Var);
            case 3:
                return ((rm1) create(v11Var, vz0Var)).invokeSuspend(pn6Var);
            default:
                return ((rm1) create(v11Var, vz0Var)).invokeSuspend(pn6Var);
        }
    }

    @Override // defpackage.h30
    public final Object invokeSuspend(Object obj) {
        Object value;
        byte b = this.x;
        pn6 pn6Var = pn6.a;
        tm1 tm1Var = this.z;
        w11 w11Var = w11.x;
        byte b2 = 1;
        vz0 vz0Var = null;
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
                sx5 sx5Var = tm1Var.d;
                do {
                    value = sx5Var.getValue();
                } while (!sx5Var.j(value, pm1.a((pm1) value, null, null, false, null, null, null, null, true, 127)));
                vy4 vy4Var = ((fl1) tm1Var.b).j;
                qm1 qm1Var = new qm1(tm1Var, vz0Var, (byte) 0);
                this.y = true;
                if (iv.q(vy4Var, qm1Var, this) == w11Var) {
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
                vy4 vy4Var2 = ((fl1) tm1Var.b).k;
                qm1 qm1Var2 = new qm1(tm1Var, vz0Var, b2);
                this.y = true;
                if (iv.q(vy4Var2, qm1Var2, this) == w11Var) {
                    return w11Var;
                }
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
                vy4 vy4Var3 = ((fl1) tm1Var.b).m;
                qm1 qm1Var3 = new qm1(tm1Var, vz0Var, (byte) 2);
                this.y = true;
                if (iv.q(vy4Var3, qm1Var3, this) == w11Var) {
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
                hu6 hu6Var = new hu6(((ny6) tm1Var.c).a.getAllLastWatchedProgress(), (byte) 4);
                ja1 ja1Var = rh1.a;
                w42 D = zz.D(hu6Var, j91.y);
                qm1 qm1Var4 = new qm1(tm1Var, vz0Var, (byte) 3);
                this.y = true;
                if (iv.q(D, qm1Var4, this) == w11Var) {
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
                qk1 qk1Var = tm1Var.b;
                this.y = true;
                if (((fl1) qk1Var).p(this) == w11Var) {
                    return w11Var;
                }
                return pn6Var;
        }
    }
}
