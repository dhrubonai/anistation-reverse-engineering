package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class b66 extends t36 implements ic2 {
    public final /* synthetic */ float A;
    public final /* synthetic */ c66 B;
    public final /* synthetic */ byte x;
    public boolean y;
    public final /* synthetic */ wj z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b66(wj wjVar, float f, c66 c66Var, vz0 vz0Var, byte b) {
        super(2, vz0Var);
        this.x = b;
        this.z = wjVar;
        this.A = f;
        this.B = c66Var;
    }

    @Override // defpackage.h30
    public final vz0 create(Object obj, vz0 vz0Var) {
        switch (this.x) {
            case 0:
                return new b66(this.z, this.A, this.B, vz0Var, (byte) 0);
            default:
                return new b66(this.z, this.A, this.B, vz0Var, (byte) 1);
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
                return ((b66) create(v11Var, vz0Var)).invokeSuspend(pn6Var);
            default:
                return ((b66) create(v11Var, vz0Var)).invokeSuspend(pn6Var);
        }
    }

    @Override // defpackage.h30
    public final Object invokeSuspend(Object obj) {
        byte b = this.x;
        pn6 pn6Var = pn6.a;
        c66 c66Var = this.B;
        float f = this.A;
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
                vm1 vm1Var = new vm1(f);
                tw5 tw5Var = c66Var.N;
                this.y = true;
                if (wj.a(this.z, vm1Var, tw5Var, null, this, 12) == w11Var) {
                    return w11Var;
                }
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
                vm1 vm1Var2 = new vm1(f);
                tw5 tw5Var2 = c66Var.N;
                this.y = true;
                if (wj.a(this.z, vm1Var2, tw5Var2, null, this, 12) == w11Var) {
                    return w11Var;
                }
                return pn6Var;
        }
    }
}
