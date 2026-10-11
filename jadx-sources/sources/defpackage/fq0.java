package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class fq0 extends t36 implements ic2 {
    public final /* synthetic */ byte x;
    public boolean y;
    public final /* synthetic */ gq0 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fq0(gq0 gq0Var, vz0 vz0Var, byte b) {
        super(2, vz0Var);
        this.x = b;
        this.z = gq0Var;
    }

    @Override // defpackage.h30
    public final vz0 create(Object obj, vz0 vz0Var) {
        byte b = this.x;
        gq0 gq0Var = this.z;
        switch (b) {
            case 0:
                return new fq0(gq0Var, vz0Var, (byte) 0);
            case 1:
                return new fq0(gq0Var, vz0Var, (byte) 1);
            default:
                return new fq0(gq0Var, vz0Var, (byte) 2);
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
                return ((fq0) create(v11Var, vz0Var)).invokeSuspend(pn6Var);
            case 1:
                return ((fq0) create(v11Var, vz0Var)).invokeSuspend(pn6Var);
            default:
                return ((fq0) create(v11Var, vz0Var)).invokeSuspend(pn6Var);
        }
    }

    @Override // defpackage.h30
    public final Object invokeSuspend(Object obj) {
        byte b = this.x;
        pn6 pn6Var = pn6.a;
        w11 w11Var = w11.x;
        gq0 gq0Var = this.z;
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
                    long b2 = ((rv6) t80.C(gq0Var, bv0.t)).b();
                    this.y = true;
                    if (x97.u(b2, this) == w11Var) {
                        return w11Var;
                    }
                }
                sb2 sb2Var = gq0Var.h0;
                if (sb2Var != null) {
                    sb2Var.invoke();
                }
                if (gq0Var.i0) {
                    ((mm4) ((sj2) t80.C(gq0Var, bv0.l))).a(0);
                }
                gq0Var.p0 = true;
                bx5 bx5Var = gq0Var.n0;
                if (bx5Var != null) {
                    bx5Var.l(null);
                }
                gq0Var.n0 = null;
                gq0Var.m0 = null;
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
                    long b3 = ((rv6) t80.C(gq0Var, bv0.t)).b();
                    this.y = true;
                    if (x97.u(b3, this) == w11Var) {
                        return w11Var;
                    }
                }
                sb2 sb2Var2 = gq0Var.h0;
                if (sb2Var2 != null) {
                    sb2Var2.invoke();
                }
                if (gq0Var.i0) {
                    ((mm4) ((sj2) t80.C(gq0Var, bv0.l))).a(0);
                }
                gq0Var.w0 = true;
                bx5 bx5Var2 = gq0Var.u0;
                if (bx5Var2 != null) {
                    bx5Var2.l(null);
                }
                gq0Var.u0 = null;
                gq0Var.t0 = null;
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
                    long b4 = ((rv6) t80.C(gq0Var, bv0.t)).b();
                    this.y = true;
                    if (x97.u(b4, this) == w11Var) {
                        return w11Var;
                    }
                }
                sb2 sb2Var3 = gq0Var.h0;
                if (sb2Var3 != null) {
                    sb2Var3.invoke();
                    return pn6Var;
                }
                return pn6Var;
        }
    }
}
