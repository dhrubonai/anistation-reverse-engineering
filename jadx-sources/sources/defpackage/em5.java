package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class em5 extends t36 implements ic2 {
    public final /* synthetic */ boolean A;
    public final /* synthetic */ byte x;
    public boolean y;
    public final /* synthetic */ hm5 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ em5(hm5 hm5Var, boolean z, vz0 vz0Var, byte b) {
        super(2, vz0Var);
        this.x = b;
        this.z = hm5Var;
        this.A = z;
    }

    @Override // defpackage.h30
    public final vz0 create(Object obj, vz0 vz0Var) {
        switch (this.x) {
            case 0:
                return new em5(this.z, this.A, vz0Var, (byte) 0);
            case 1:
                return new em5(this.z, this.A, vz0Var, (byte) 1);
            case 2:
                return new em5(this.z, this.A, vz0Var, (byte) 2);
            case 3:
                return new em5(this.z, this.A, vz0Var, (byte) 3);
            case 4:
                return new em5(this.z, this.A, vz0Var, (byte) 4);
            case 5:
                return new em5(this.z, this.A, vz0Var, (byte) 5);
            case 6:
                return new em5(this.z, this.A, vz0Var, (byte) 6);
            case 7:
                return new em5(this.z, this.A, vz0Var, (byte) 7);
            default:
                return new em5(this.z, this.A, vz0Var, (byte) 8);
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
                return ((em5) create(v11Var, vz0Var)).invokeSuspend(pn6Var);
            case 1:
                return ((em5) create(v11Var, vz0Var)).invokeSuspend(pn6Var);
            case 2:
                return ((em5) create(v11Var, vz0Var)).invokeSuspend(pn6Var);
            case 3:
                return ((em5) create(v11Var, vz0Var)).invokeSuspend(pn6Var);
            case 4:
                return ((em5) create(v11Var, vz0Var)).invokeSuspend(pn6Var);
            case 5:
                return ((em5) create(v11Var, vz0Var)).invokeSuspend(pn6Var);
            case 6:
                return ((em5) create(v11Var, vz0Var)).invokeSuspend(pn6Var);
            case 7:
                return ((em5) create(v11Var, vz0Var)).invokeSuspend(pn6Var);
            default:
                return ((em5) create(v11Var, vz0Var)).invokeSuspend(pn6Var);
        }
    }

    @Override // defpackage.h30
    public final Object invokeSuspend(Object obj) {
        byte b = this.x;
        boolean z = this.A;
        hm5 hm5Var = this.z;
        w11 w11Var = w11.x;
        pn6 pn6Var = pn6.a;
        switch (b) {
            case 0:
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
                    kf2 kf2Var = hm5Var.d;
                    this.y = true;
                    Object e = ((mf2) kf2Var).a.e(z, this);
                    if (e != w11Var) {
                        e = pn6Var;
                    }
                    if (e == w11Var) {
                        return w11Var;
                    }
                }
                return pn6Var;
            case 1:
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
                    kf2 kf2Var2 = hm5Var.d;
                    this.y = true;
                    Object h = ((mf2) kf2Var2).a.h(z, this);
                    if (h != w11Var) {
                        h = pn6Var;
                    }
                    if (h == w11Var) {
                        return w11Var;
                    }
                }
                return pn6Var;
            case 2:
                boolean z4 = this.y;
                if (z4) {
                    if (z4) {
                        m37.N(obj);
                    } else {
                        ze0.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    m37.N(obj);
                    kf2 kf2Var3 = hm5Var.d;
                    this.y = true;
                    Object i = ((mf2) kf2Var3).a.i(z, this);
                    if (i != w11Var) {
                        i = pn6Var;
                    }
                    if (i == w11Var) {
                        return w11Var;
                    }
                }
                return pn6Var;
            case 3:
                boolean z5 = this.y;
                if (z5) {
                    if (z5) {
                        m37.N(obj);
                    } else {
                        ze0.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    m37.N(obj);
                    kf2 kf2Var4 = hm5Var.d;
                    this.y = true;
                    Object j = ((mf2) kf2Var4).a.j(z, this);
                    if (j != w11Var) {
                        j = pn6Var;
                    }
                    if (j == w11Var) {
                        return w11Var;
                    }
                }
                return pn6Var;
            case 4:
                boolean z6 = this.y;
                if (z6) {
                    if (z6) {
                        m37.N(obj);
                    } else {
                        ze0.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    m37.N(obj);
                    kf2 kf2Var5 = hm5Var.d;
                    this.y = true;
                    Object k = ((mf2) kf2Var5).a.k(z, this);
                    if (k != w11Var) {
                        k = pn6Var;
                    }
                    if (k == w11Var) {
                        return w11Var;
                    }
                }
                return pn6Var;
            case 5:
                boolean z7 = this.y;
                if (z7) {
                    if (z7) {
                        m37.N(obj);
                    } else {
                        ze0.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    m37.N(obj);
                    kf2 kf2Var6 = hm5Var.d;
                    this.y = true;
                    Object m = ((mf2) kf2Var6).a.m(z, this);
                    if (m != w11Var) {
                        m = pn6Var;
                    }
                    if (m == w11Var) {
                        return w11Var;
                    }
                }
                return pn6Var;
            case 6:
                boolean z8 = this.y;
                if (z8) {
                    if (z8) {
                        m37.N(obj);
                    } else {
                        ze0.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    m37.N(obj);
                    w00 w00Var = hm5Var.h;
                    this.y = true;
                    Object c = ((m10) w00Var).g.c(z, this);
                    if (c != w11Var) {
                        c = pn6Var;
                    }
                    if (c == w11Var) {
                        return w11Var;
                    }
                }
                return pn6Var;
            case 7:
                boolean z9 = this.y;
                if (z9) {
                    if (z9) {
                        m37.N(obj);
                    } else {
                        ze0.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    m37.N(obj);
                    kf2 kf2Var7 = hm5Var.d;
                    this.y = true;
                    Object p = ((mf2) kf2Var7).a.p(z, this);
                    if (p != w11Var) {
                        p = pn6Var;
                    }
                    if (p == w11Var) {
                        return w11Var;
                    }
                }
                return pn6Var;
            default:
                boolean z10 = this.y;
                if (z10) {
                    if (z10) {
                        m37.N(obj);
                    } else {
                        ze0.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    m37.N(obj);
                    kf2 kf2Var8 = hm5Var.d;
                    this.y = true;
                    Object r = ((mf2) kf2Var8).a.r(z, this);
                    if (r != w11Var) {
                        r = pn6Var;
                    }
                    if (r == w11Var) {
                        return w11Var;
                    }
                }
                return pn6Var;
        }
    }
}
