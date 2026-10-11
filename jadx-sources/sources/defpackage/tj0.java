package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class tj0 extends t36 implements ic2 {
    public final /* synthetic */ wj0 A;
    public final /* synthetic */ x42 B;
    public final /* synthetic */ byte x = 0;
    public boolean y;
    public /* synthetic */ Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tj0(wj0 wj0Var, x42 x42Var, Object obj, vz0 vz0Var) {
        super(2, vz0Var);
        this.A = wj0Var;
        this.B = x42Var;
        this.z = obj;
    }

    @Override // defpackage.h30
    public final vz0 create(Object obj, vz0 vz0Var) {
        byte b = this.x;
        x42 x42Var = this.B;
        wj0 wj0Var = this.A;
        switch (b) {
            case 0:
                return new tj0(wj0Var, x42Var, this.z, vz0Var);
            default:
                tj0 tj0Var = new tj0(wj0Var, x42Var, vz0Var);
                tj0Var.z = obj;
                return tj0Var;
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
                return ((tj0) create(v11Var, vz0Var)).invokeSuspend(pn6Var);
            default:
                return ((tj0) create(v11Var, vz0Var)).invokeSuspend(pn6Var);
        }
    }

    @Override // defpackage.h30
    public final Object invokeSuspend(Object obj) {
        byte b = this.x;
        pn6 pn6Var = pn6.a;
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
                jc2 jc2Var = this.A.B;
                Object obj2 = this.z;
                this.y = true;
                if (jc2Var.invoke(this.B, obj2, this) == w11Var) {
                    return w11Var;
                }
                return pn6Var;
            default:
                v11 v11Var = (v11) this.z;
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
                Object obj3 = new Object();
                wj0 wj0Var = this.A;
                w42 w42Var = wj0Var.A;
                vj0 vj0Var = new vj0(obj3, v11Var, wj0Var, this.B, (byte) 0);
                this.z = null;
                this.y = true;
                if (w42Var.collect(vj0Var, this) == w11Var) {
                    return w11Var;
                }
                return pn6Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tj0(wj0 wj0Var, x42 x42Var, vz0 vz0Var) {
        super(2, vz0Var);
        this.A = wj0Var;
        this.B = x42Var;
    }
}
