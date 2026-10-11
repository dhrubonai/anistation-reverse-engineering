package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class jr extends t36 implements ic2 {
    public final /* synthetic */ Object A;
    public final /* synthetic */ byte x;
    public boolean y;
    public /* synthetic */ int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jr(Object obj, int i, vz0 vz0Var, byte b) {
        super(2, vz0Var);
        this.x = b;
        this.A = obj;
        this.z = i;
    }

    @Override // defpackage.h30
    public final vz0 create(Object obj, vz0 vz0Var) {
        byte b = this.x;
        Object obj2 = this.A;
        switch (b) {
            case 0:
                return new jr((kr) obj2, this.z, vz0Var, (byte) 0);
            case 1:
                return new jr((le3) obj2, this.z, vz0Var, (byte) 1);
            case 2:
                return new jr((ld5) obj2, this.z, vz0Var, (byte) 2);
            case 3:
                jr jrVar = new jr((u96) obj2, vz0Var);
                jrVar.z = ((Number) obj).intValue();
                return jrVar;
            default:
                return new jr((af3) obj2, this.z, vz0Var, (byte) 4);
        }
    }

    @Override // defpackage.ic2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.x;
        pn6 pn6Var = pn6.a;
        switch (b) {
            case 0:
                return ((jr) create((v11) obj, (vz0) obj2)).invokeSuspend(pn6Var);
            case 1:
                return ((jr) create((v11) obj, (vz0) obj2)).invokeSuspend(pn6Var);
            case 2:
                return ((jr) create((v11) obj, (vz0) obj2)).invokeSuspend(pn6Var);
            case 3:
                return ((jr) create(Integer.valueOf(((Number) obj).intValue()), (vz0) obj2)).invokeSuspend(pn6Var);
            default:
                return ((jr) create((v11) obj, (vz0) obj2)).invokeSuspend(pn6Var);
        }
    }

    @Override // defpackage.h30
    public final Object invokeSuspend(Object obj) {
        Object value;
        j31 j31Var;
        byte b = this.x;
        pn6 pn6Var = pn6.a;
        Object obj2 = this.A;
        w11 w11Var = w11.x;
        vz0 vz0Var = null;
        switch (b) {
            case 0:
                kr krVar = (kr) obj2;
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
                    rq rqVar = krVar.b;
                    int i = this.z;
                    this.y = true;
                    Object a = ((tq) rqVar).c.a(i, this);
                    if (a != w11Var) {
                        a = pn6Var;
                    }
                    if (a == w11Var) {
                        return w11Var;
                    }
                }
                sx5 sx5Var = krVar.d;
                do {
                    value = sx5Var.getValue();
                } while (!sx5Var.j(value, dr.a));
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
                fe3 fe3Var = ((le3) obj2).M;
                int i2 = this.z;
                this.y = true;
                if (fe3Var.c(i2, this) == w11Var) {
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
                ld5 ld5Var = (ld5) obj2;
                yc5 yc5Var = ld5Var.a;
                int i3 = this.z;
                tw5 tw5Var = ld5Var.c;
                this.y = true;
                Object e = jf7.e(yc5Var, i3 - yc5Var.a.h(), tw5Var, this);
                if (e != w11Var) {
                    e = pn6Var;
                }
                if (e == w11Var) {
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
                if (Math.abs(this.z) == 1 && (j31Var = ((u96) obj2).Y) != null) {
                    this.y = true;
                    Object K = db.K(new yh(j31Var, vz0Var, (byte) 3), this);
                    if (K != w11Var) {
                        K = pn6Var;
                    }
                    if (K == w11Var) {
                        return w11Var;
                    }
                    return pn6Var;
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
                int i4 = this.z;
                this.y = true;
                if (((af3) obj2).f(i4, -200, this) == w11Var) {
                    return w11Var;
                }
                return pn6Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jr(u96 u96Var, vz0 vz0Var) {
        super(2, vz0Var);
        this.x = (byte) 3;
        this.A = u96Var;
    }
}
