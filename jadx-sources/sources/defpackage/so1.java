package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class so1 extends t36 implements ic2 {
    public /* synthetic */ Object A;
    public final /* synthetic */ Object B;
    public final /* synthetic */ byte x = 2;
    public boolean y;
    public final /* synthetic */ long z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public so1(iu1 iu1Var, ny2 ny2Var, long j, vz0 vz0Var) {
        super(2, vz0Var);
        this.A = iu1Var;
        this.B = ny2Var;
        this.z = j;
    }

    @Override // defpackage.h30
    public final vz0 create(Object obj, vz0 vz0Var) {
        byte b = this.x;
        Object obj2 = this.B;
        switch (b) {
            case 0:
                so1 so1Var = new so1((to1) obj2, this.z, vz0Var);
                so1Var.A = obj;
                return so1Var;
            case 1:
                return new so1((iu1) this.A, (ny2) obj2, this.z, vz0Var);
            case 2:
                return new so1(this.z, (l11) this.A, (ls0) obj2, vz0Var);
            default:
                return new so1((wq5) this.A, this.z, (yq5) obj2, vz0Var);
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
                return ((so1) create(v11Var, vz0Var)).invokeSuspend(pn6Var);
            case 1:
                return ((so1) create(v11Var, vz0Var)).invokeSuspend(pn6Var);
            case 2:
                return ((so1) create(v11Var, vz0Var)).invokeSuspend(pn6Var);
            default:
                return ((so1) create(v11Var, vz0Var)).invokeSuspend(pn6Var);
        }
    }

    @Override // defpackage.h30
    public final Object invokeSuspend(Object obj) {
        Long l;
        Object a;
        byte b = this.x;
        pn6 pn6Var = pn6.a;
        long j = this.z;
        w11 w11Var = w11.x;
        Object obj2 = this.B;
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
                v11 v11Var = (v11) this.A;
                jc2 jc2Var = ((to1) obj2).i0;
                xc4 xc4Var = new xc4(j);
                this.y = true;
                if (jc2Var.invoke(v11Var, xc4Var, this) == w11Var) {
                    return w11Var;
                }
                return pn6Var;
            case 1:
                boolean z2 = this.y;
                if (z2) {
                    if (z2) {
                        m37.N(obj);
                        return obj;
                    }
                    ze0.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                m37.N(obj);
                pb pbVar = new pb(j, (byte) 4);
                this.y = true;
                Object r = ((iu1) this.A).C.r((ny2) obj2, pbVar, this);
                if (r == w11Var) {
                    return w11Var;
                }
                return r;
            case 2:
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
                    if (x97.u(j, this) == w11Var) {
                        return w11Var;
                    }
                }
                h43 w = h98.w((l11) this.A);
                ls0 ls0Var = (ls0) obj2;
                String str = ((op6) ls0Var.y).C;
                ss2 ss2Var = (ss2) ls0Var.i(rs2.a);
                if (ss2Var != null) {
                    l = ss2Var.a;
                } else {
                    l = null;
                }
                h98.j(w, "Request is timed out", new zr2(str, l, null));
                return pn6Var;
            default:
                yq5 yq5Var = (yq5) obj2;
                wq5 wq5Var = (wq5) this.A;
                boolean z4 = this.y;
                if (z4) {
                    if (z4) {
                        m37.N(obj);
                        a = obj;
                    } else {
                        ze0.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    m37.N(obj);
                    wj wjVar = wq5Var.a;
                    k13 k13Var = new k13(j);
                    tw5 tw5Var = yq5Var.M;
                    this.y = true;
                    a = wj.a(wjVar, k13Var, tw5Var, null, this, 12);
                    if (a == w11Var) {
                        return w11Var;
                    }
                }
                hl hlVar = ((jl) a).b;
                return pn6Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public so1(to1 to1Var, long j, vz0 vz0Var) {
        super(2, vz0Var);
        this.B = to1Var;
        this.z = j;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public so1(long j, l11 l11Var, ls0 ls0Var, vz0 vz0Var) {
        super(2, vz0Var);
        this.z = j;
        this.A = l11Var;
        this.B = ls0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public so1(wq5 wq5Var, long j, yq5 yq5Var, vz0 vz0Var) {
        super(2, vz0Var);
        this.A = wq5Var;
        this.z = j;
        this.B = yq5Var;
    }
}
