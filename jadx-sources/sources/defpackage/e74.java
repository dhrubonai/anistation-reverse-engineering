package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class e74 extends t36 implements ic2 {
    public /* synthetic */ Object A;
    public final /* synthetic */ Object B;
    public final /* synthetic */ byte x;
    public boolean y;
    public float z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e74(Object obj, float f, Object obj2, vz0 vz0Var, byte b) {
        super(2, vz0Var);
        this.x = b;
        this.A = obj;
        this.z = f;
        this.B = obj2;
    }

    @Override // defpackage.h30
    public final vz0 create(Object obj, vz0 vz0Var) {
        byte b = this.x;
        Object obj2 = this.B;
        switch (b) {
            case 0:
                return new e74((sf5) this.A, this.z, (wp5) obj2, vz0Var, (byte) 0);
            case 1:
                return new e74((qb0) this.A, this.z, (ll) obj2, vz0Var, (byte) 1);
            default:
                e74 e74Var = new e74((xi6) obj2, vz0Var);
                e74Var.A = obj;
                return e74Var;
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
                return ((e74) create(v11Var, vz0Var)).invokeSuspend(pn6Var);
            case 1:
                return ((e74) create(v11Var, vz0Var)).invokeSuspend(pn6Var);
            default:
                return ((e74) create(v11Var, vz0Var)).invokeSuspend(pn6Var);
        }
    }

    @Override // defpackage.h30
    public final Object invokeSuspend(Object obj) {
        float j;
        v11 v11Var;
        byte b = this.x;
        pn6 pn6Var = pn6.a;
        Object obj2 = this.B;
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
                this.y = true;
                if (((sf5) this.A).R(this.z, (wp5) obj2, this) == w11Var) {
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
                this.y = true;
                if (wj.a((wj) ((qb0) this.A).z, new Float(this.z), (ll) obj2, null, this, 12) == w11Var) {
                    return w11Var;
                }
                return pn6Var;
            default:
                boolean z3 = this.y;
                if (z3) {
                    if (z3) {
                        j = this.z;
                        v11Var = (v11) this.A;
                        m37.N(obj);
                    } else {
                        ze0.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    m37.N(obj);
                    v11 v11Var2 = (v11) this.A;
                    j = nv5.j(v11Var2.getCoroutineContext());
                    v11Var = v11Var2;
                }
                while (db.W(v11Var)) {
                    co1 co1Var = new co1((xi6) obj2, j);
                    this.A = v11Var;
                    this.z = j;
                    this.y = true;
                    if (t80.P(getContext()).a(co1Var, this) == w11Var) {
                        return w11Var;
                    }
                }
                return pn6Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e74(xi6 xi6Var, vz0 vz0Var) {
        super(2, vz0Var);
        this.x = (byte) 2;
        this.B = xi6Var;
    }
}
