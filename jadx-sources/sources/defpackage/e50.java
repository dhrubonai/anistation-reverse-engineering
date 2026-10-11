package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class e50 extends t36 implements ic2 {
    public final /* synthetic */ byte x;
    public boolean y;
    public final /* synthetic */ ng6 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e50(ng6 ng6Var, vz0 vz0Var, byte b) {
        super(2, vz0Var);
        this.x = b;
        this.z = ng6Var;
    }

    @Override // defpackage.h30
    public final vz0 create(Object obj, vz0 vz0Var) {
        switch (this.x) {
            case 0:
                return new e50(this.z, vz0Var, (byte) 0);
            case 1:
                e50 e50Var = new e50(this.z, vz0Var, (byte) 1);
                e50Var.y = ((Boolean) obj).booleanValue();
                return e50Var;
            default:
                return new e50(this.z, vz0Var, (byte) 2);
        }
    }

    @Override // defpackage.ic2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.x;
        pn6 pn6Var = pn6.a;
        switch (b) {
            case 0:
                return ((e50) create((v11) obj, (vz0) obj2)).invokeSuspend(pn6Var);
            case 1:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                ((e50) create(bool, (vz0) obj2)).invokeSuspend(pn6Var);
                return pn6Var;
            default:
                return ((e50) create((v11) obj, (vz0) obj2)).invokeSuspend(pn6Var);
        }
    }

    @Override // defpackage.h30
    public final Object invokeSuspend(Object obj) {
        byte b = this.x;
        pn6 pn6Var = pn6.a;
        ng6 ng6Var = this.z;
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
                    if (ng6Var.c(c54.x, this) == w11Var) {
                        return w11Var;
                    }
                }
                return pn6Var;
            case 1:
                m37.N(obj);
                if (!this.y) {
                    ng6Var.a();
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
                    if (ng6Var.c(c54.y, this) == w11Var) {
                        return w11Var;
                    }
                }
                return pn6Var;
        }
    }
}
