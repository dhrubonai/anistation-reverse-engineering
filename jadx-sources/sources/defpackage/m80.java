package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class m80 extends t36 implements ic2 {
    public final /* synthetic */ float A;
    public final /* synthetic */ byte x;
    public boolean y;
    public final /* synthetic */ do5 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m80(do5 do5Var, float f, vz0 vz0Var, byte b) {
        super(2, vz0Var);
        this.x = b;
        this.z = do5Var;
        this.A = f;
    }

    @Override // defpackage.h30
    public final vz0 create(Object obj, vz0 vz0Var) {
        switch (this.x) {
            case 0:
                return new m80(this.z, this.A, vz0Var, (byte) 0);
            default:
                return new m80(this.z, this.A, vz0Var, (byte) 1);
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
                return ((m80) create(v11Var, vz0Var)).invokeSuspend(pn6Var);
            default:
                return ((m80) create(v11Var, vz0Var)).invokeSuspend(pn6Var);
        }
    }

    @Override // defpackage.h30
    public final Object invokeSuspend(Object obj) {
        byte b = this.x;
        float f = this.A;
        do5 do5Var = this.z;
        w11 w11Var = w11.x;
        pn6 pn6Var = pn6.a;
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
                    Object h = do5Var.e.h(f, this);
                    if (h != w11Var) {
                        h = pn6Var;
                    }
                    if (h == w11Var) {
                        return w11Var;
                    }
                }
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
                    Object h2 = do5Var.e.h(f, this);
                    if (h2 != w11Var) {
                        h2 = pn6Var;
                    }
                    if (h2 == w11Var) {
                        return w11Var;
                    }
                }
                return pn6Var;
        }
    }
}
