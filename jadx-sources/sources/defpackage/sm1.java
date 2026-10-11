package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class sm1 extends t36 implements ic2 {
    public final /* synthetic */ Object A;
    public final /* synthetic */ byte x;
    public boolean y;
    public final /* synthetic */ boolean z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sm1(boolean z, boolean z2, w44 w44Var, vz0 vz0Var) {
        super(2, vz0Var);
        this.x = (byte) 1;
        this.y = z;
        this.z = z2;
        this.A = w44Var;
    }

    @Override // defpackage.h30
    public final vz0 create(Object obj, vz0 vz0Var) {
        byte b = this.x;
        Object obj2 = this.A;
        boolean z = this.z;
        switch (b) {
            case 0:
                return new sm1(obj2, z, vz0Var, (byte) 0);
            case 1:
                return new sm1(this.y, z, (w44) obj2, vz0Var);
            case 2:
                return new sm1(obj2, z, vz0Var, (byte) 2);
            default:
                return new sm1(z, (af3) obj2, vz0Var);
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
                return ((sm1) create(v11Var, vz0Var)).invokeSuspend(pn6Var);
            case 1:
                ((sm1) create(v11Var, vz0Var)).invokeSuspend(pn6Var);
                return pn6Var;
            case 2:
                return ((sm1) create(v11Var, vz0Var)).invokeSuspend(pn6Var);
            default:
                return ((sm1) create(v11Var, vz0Var)).invokeSuspend(pn6Var);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.h30
    public final Object invokeSuspend(Object obj) {
        kn0 kn0Var;
        byte b = this.x;
        pn6 pn6Var = pn6.a;
        Object obj2 = this.A;
        boolean z = this.z;
        w11 w11Var = w11.x;
        ko koVar = null;
        Object[] objArr = 0;
        switch (b) {
            case 0:
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
                qk1 qk1Var = ((tm1) obj2).b;
                this.y = true;
                Object b2 = ((zl1) ((fl1) qk1Var).e.a).b(z, this);
                if (b2 != w11Var) {
                    b2 = pn6Var;
                }
                if (b2 != w11Var) {
                    b2 = pn6Var;
                }
                if (b2 == w11Var) {
                    return w11Var;
                }
                return pn6Var;
            case 1:
                m37.N(obj);
                if (!this.y) {
                    ((w44) obj2).setValue(Boolean.valueOf(z));
                }
                return pn6Var;
            case 2:
                jb6 jb6Var = (jb6) obj2;
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
                if (!nd6.d(jb6Var.l().b)) {
                    koVar = gv5.d(jb6Var.l());
                    if (z) {
                        int f = nd6.f(jb6Var.l().b);
                        jb6Var.c.invoke(jb6.b(jb6Var.l().a, fy5.a(f, f)));
                        jb6Var.r(hj2.x);
                    }
                }
                if (koVar != null && (kn0Var = jb6Var.g) != null) {
                    in0 T = q23.T(koVar);
                    this.y = true;
                    ((x9) kn0Var).a(T);
                    if (pn6Var == w11Var) {
                        return w11Var;
                    }
                    return pn6Var;
                }
                return pn6Var;
            default:
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
                if (!z) {
                    byte b3 = 2;
                    pf pfVar = new pf(b3, objArr == true ? 1 : 0, b3);
                    this.y = true;
                    if (((af3) obj2).d(c54.x, pfVar, this) == w11Var) {
                        return w11Var;
                    }
                    return pn6Var;
                }
                return pn6Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sm1(boolean z, af3 af3Var, vz0 vz0Var) {
        super(2, vz0Var);
        this.x = (byte) 3;
        this.z = z;
        this.A = af3Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ sm1(Object obj, boolean z, vz0 vz0Var, byte b) {
        super(2, vz0Var);
        this.x = b;
        this.A = obj;
        this.z = z;
    }
}
