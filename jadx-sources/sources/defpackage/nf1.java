package defpackage;

import com.anistation.model.Info;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class nf1 extends t36 implements ic2 {
    public final /* synthetic */ Integer A;
    public final /* synthetic */ int B;
    public final /* synthetic */ int C;
    public final /* synthetic */ vv6 D;
    public final /* synthetic */ byte x;
    public boolean y;
    public final /* synthetic */ Info z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ nf1(vv6 vv6Var, Info info, Integer num, int i, int i2, vz0 vz0Var, byte b) {
        super(2, vz0Var);
        this.x = b;
        this.D = vv6Var;
        this.z = info;
        this.A = num;
        this.B = i;
        this.C = i2;
    }

    @Override // defpackage.h30
    public final vz0 create(Object obj, vz0 vz0Var) {
        byte b = this.x;
        vv6 vv6Var = this.D;
        switch (b) {
            case 0:
                return new nf1((pf1) vv6Var, this.z, this.A, this.B, this.C, vz0Var, (byte) 0);
            default:
                return new nf1((v27) vv6Var, this.z, this.A, this.B, this.C, vz0Var, (byte) 1);
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
                return ((nf1) create(v11Var, vz0Var)).invokeSuspend(pn6Var);
            default:
                return ((nf1) create(v11Var, vz0Var)).invokeSuspend(pn6Var);
        }
    }

    @Override // defpackage.h30
    public final Object invokeSuspend(Object obj) {
        byte b = this.x;
        pn6 pn6Var = pn6.a;
        vv6 vv6Var = this.D;
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
                cn cnVar = ((pf1) vv6Var).d;
                this.y = true;
                if (((on) cnVar).f(this.z, this.A, this.B, this.C, this) == w11Var) {
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
                cn cnVar2 = ((v27) vv6Var).f;
                this.y = true;
                if (((on) cnVar2).f(this.z, this.A, this.B, this.C, this) == w11Var) {
                    return w11Var;
                }
                return pn6Var;
        }
    }
}
