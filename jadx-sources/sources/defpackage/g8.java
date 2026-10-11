package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class g8 extends t36 implements ic2 {
    public final /* synthetic */ Object A;
    public final /* synthetic */ v11 B;
    public final /* synthetic */ byte x;
    public boolean y;
    public final /* synthetic */ ic2 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g8(ic2 ic2Var, Object obj, v11 v11Var, vz0 vz0Var, byte b) {
        super(2, vz0Var);
        this.x = b;
        this.z = ic2Var;
        this.A = obj;
        this.B = v11Var;
    }

    @Override // defpackage.h30
    public final vz0 create(Object obj, vz0 vz0Var) {
        switch (this.x) {
            case 0:
                return new g8(this.z, this.A, this.B, vz0Var, (byte) 0);
            default:
                return new g8(this.z, this.A, this.B, vz0Var, (byte) 1);
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
                return ((g8) create(v11Var, vz0Var)).invokeSuspend(pn6Var);
            default:
                return ((g8) create(v11Var, vz0Var)).invokeSuspend(pn6Var);
        }
    }

    @Override // defpackage.h30
    public final Object invokeSuspend(Object obj) {
        byte b = this.x;
        pn6 pn6Var = pn6.a;
        v11 v11Var = this.B;
        Object obj2 = this.A;
        ic2 ic2Var = this.z;
        w11 w11Var = w11.x;
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
                    if (ic2Var.invoke(obj2, this) == w11Var) {
                        return w11Var;
                    }
                }
                db.t(v11Var, new u7());
                return pn6Var;
            default:
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
                    if (ic2Var.invoke(obj2, this) == w11Var) {
                        return w11Var;
                    }
                }
                db.t(v11Var, new v7());
                return pn6Var;
        }
    }
}
