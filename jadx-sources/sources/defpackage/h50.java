package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class h50 extends t36 implements ic2 {
    public final /* synthetic */ yq4 A;
    public final /* synthetic */ ng6 B;
    public final /* synthetic */ byte x;
    public boolean y;
    public /* synthetic */ Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h50(yq4 yq4Var, ng6 ng6Var, vz0 vz0Var, byte b) {
        super(2, vz0Var);
        this.x = b;
        this.A = yq4Var;
        this.B = ng6Var;
    }

    @Override // defpackage.h30
    public final vz0 create(Object obj, vz0 vz0Var) {
        switch (this.x) {
            case 0:
                h50 h50Var = new h50(this.A, this.B, vz0Var, (byte) 0);
                h50Var.z = obj;
                return h50Var;
            default:
                h50 h50Var2 = new h50(this.A, this.B, vz0Var, (byte) 1);
                h50Var2.z = obj;
                return h50Var2;
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
                return ((h50) create(v11Var, vz0Var)).invokeSuspend(pn6Var);
            default:
                return ((h50) create(v11Var, vz0Var)).invokeSuspend(pn6Var);
        }
    }

    @Override // defpackage.h30
    public final Object invokeSuspend(Object obj) {
        byte b = this.x;
        pn6 pn6Var = pn6.a;
        ng6 ng6Var = this.B;
        yq4 yq4Var = this.A;
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
                g50 g50Var = new g50((v11) this.z, ng6Var, null);
                this.y = true;
                if (n77.t(yq4Var, g50Var, this) == w11Var) {
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
                j50 j50Var = new j50((v11) this.z, ng6Var, null);
                this.y = true;
                if (((a46) yq4Var).a1(j50Var, this) == w11Var) {
                    return w11Var;
                }
                return pn6Var;
        }
    }
}
