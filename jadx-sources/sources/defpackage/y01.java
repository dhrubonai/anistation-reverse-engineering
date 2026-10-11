package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class y01 extends t36 implements ic2 {
    public final /* synthetic */ k96 A;
    public final /* synthetic */ byte x;
    public boolean y;
    public final /* synthetic */ yq4 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y01(yq4 yq4Var, k96 k96Var, vz0 vz0Var, byte b) {
        super(2, vz0Var);
        this.x = b;
        this.z = yq4Var;
        this.A = k96Var;
    }

    @Override // defpackage.h30
    public final vz0 create(Object obj, vz0 vz0Var) {
        switch (this.x) {
            case 0:
                return new y01(this.z, this.A, vz0Var, (byte) 0);
            case 1:
                return new y01(this.z, this.A, vz0Var, (byte) 1);
            default:
                return new y01(this.z, this.A, vz0Var, (byte) 2);
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
                return ((y01) create(v11Var, vz0Var)).invokeSuspend(pn6Var);
            case 1:
                return ((y01) create(v11Var, vz0Var)).invokeSuspend(pn6Var);
            default:
                return ((y01) create(v11Var, vz0Var)).invokeSuspend(pn6Var);
        }
    }

    @Override // defpackage.h30
    public final Object invokeSuspend(Object obj) {
        byte b = this.x;
        yq4 yq4Var = this.z;
        final k96 k96Var = this.A;
        w11 w11Var = w11.x;
        pn6 pn6Var = pn6.a;
        final byte b2 = 1;
        vz0 vz0Var = null;
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
                    this.y = true;
                    Object K = db.K(new xg(yq4Var, k96Var, vz0Var, (byte) 5), this);
                    if (K != w11Var) {
                        K = pn6Var;
                    }
                    if (K == w11Var) {
                        return w11Var;
                    }
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
                    this.y = true;
                    Object t = n77.t(yq4Var, new x92(k96Var, null), this);
                    if (t != w11Var) {
                        t = pn6Var;
                    }
                    if (t == w11Var) {
                        return w11Var;
                    }
                }
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
                    this.y = true;
                    final byte b3 = 0;
                    Object d = bo1.d(this.z, new ml3(k96Var, (byte) 0), new sb2() { // from class: nl3
                        @Override // defpackage.sb2
                        public final Object invoke() {
                            byte b4 = b3;
                            pn6 pn6Var2 = pn6.a;
                            k96 k96Var2 = k96Var;
                            switch (b4) {
                                case 0:
                                    k96Var2.b();
                                    return pn6Var2;
                                default:
                                    k96Var2.onCancel();
                                    return pn6Var2;
                            }
                        }
                    }, new sb2() { // from class: nl3
                        @Override // defpackage.sb2
                        public final Object invoke() {
                            byte b4 = b2;
                            pn6 pn6Var2 = pn6.a;
                            k96 k96Var2 = k96Var;
                            switch (b4) {
                                case 0:
                                    k96Var2.b();
                                    return pn6Var2;
                                default:
                                    k96Var2.onCancel();
                                    return pn6Var2;
                            }
                        }
                    }, new o0(k96Var, (byte) 17), this);
                    if (d != w11Var) {
                        d = pn6Var;
                    }
                    if (d == w11Var) {
                        return w11Var;
                    }
                }
                return pn6Var;
        }
    }
}
