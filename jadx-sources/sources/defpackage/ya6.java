package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class ya6 extends t36 implements jc2 {
    public /* synthetic */ long A;
    public final /* synthetic */ Object B;
    public final /* synthetic */ Object C;
    public final /* synthetic */ byte x;
    public boolean y;
    public /* synthetic */ ot4 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ya6(Object obj, Object obj2, vz0 vz0Var, byte b) {
        super(3, vz0Var);
        this.x = b;
        this.B = obj;
        this.C = obj2;
    }

    @Override // defpackage.jc2
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        byte b = this.x;
        pn6 pn6Var = pn6.a;
        Object obj4 = this.C;
        Object obj5 = this.B;
        ot4 ot4Var = (ot4) obj;
        xc4 xc4Var = (xc4) obj2;
        switch (b) {
            case 0:
                long j = xc4Var.a;
                ya6 ya6Var = new ya6((v11) obj5, (w44) obj4, (vz0) obj3, (byte) 0);
                ya6Var.z = ot4Var;
                ya6Var.A = j;
                return ya6Var.invokeSuspend(pn6Var);
            default:
                long j2 = xc4Var.a;
                ya6 ya6Var2 = new ya6((u34) obj5, (cc6) obj4, (vz0) obj3, (byte) 1);
                ya6Var2.z = ot4Var;
                ya6Var2.A = j2;
                return ya6Var2.invokeSuspend(pn6Var);
        }
    }

    @Override // defpackage.h30
    public final Object invokeSuspend(Object obj) {
        Object e;
        byte b = this.x;
        pn6 pn6Var = pn6.a;
        Object obj2 = this.C;
        Object obj3 = this.B;
        w11 w11Var = w11.x;
        switch (b) {
            case 0:
                w44 w44Var = (w44) obj2;
                v11 v11Var = (v11) obj3;
                boolean z = this.y;
                if (z) {
                    if (z) {
                        m37.N(obj);
                        e = obj;
                    } else {
                        ze0.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    m37.N(obj);
                    ot4 ot4Var = this.z;
                    tl7.z(v11Var, null, null, new x10(w44Var, this.A, (vz0) null), 3);
                    this.y = true;
                    e = ot4Var.e(this);
                    if (e == w11Var) {
                        return w11Var;
                    }
                }
                tl7.z(v11Var, null, null, new hu1(w44Var, ((Boolean) e).booleanValue(), null, (byte) 28), 3);
                return pn6Var;
            default:
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
                ot4 ot4Var2 = this.z;
                long j = this.A;
                u34 u34Var = (u34) obj3;
                if (u34Var != null) {
                    dc6 dc6Var = new dc6(ot4Var2, (cc6) obj2, j, u34Var, null);
                    this.y = true;
                    if (db.K(dc6Var, this) == w11Var) {
                        return w11Var;
                    }
                    return pn6Var;
                }
                return pn6Var;
        }
    }
}
