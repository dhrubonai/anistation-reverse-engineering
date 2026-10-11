package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class c51 extends t36 implements jc2 {
    public final /* synthetic */ byte x = 1;
    public boolean y;
    public /* synthetic */ Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c51(p51 p51Var, vz0 vz0Var) {
        super(3, vz0Var);
        this.z = p51Var;
    }

    @Override // defpackage.jc2
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        byte b = this.x;
        pn6 pn6Var = pn6.a;
        switch (b) {
            case 0:
                return new c51((p51) this.z, (vz0) obj3).invokeSuspend(pn6Var);
            default:
                ((Boolean) obj2).getClass();
                c51 c51Var = new c51(3, (vz0) obj3);
                c51Var.z = (h22) obj;
                return c51Var.invokeSuspend(pn6Var);
        }
    }

    @Override // defpackage.h30
    public final Object invokeSuspend(Object obj) {
        byte b = this.x;
        w11 w11Var = w11.x;
        vz0 vz0Var = null;
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
                    p51 p51Var = (p51) this.z;
                    this.y = true;
                    if (p51Var.b(this) == w11Var) {
                        return w11Var;
                    }
                }
                return pn6.a;
            default:
                boolean z2 = this.y;
                if (z2) {
                    if (z2) {
                        m37.N(obj);
                        return obj;
                    }
                    ze0.m("call to 'resume' before 'invoke' with coroutine");
                } else {
                    m37.N(obj);
                    h22 h22Var = (h22) this.z;
                    this.y = true;
                    if (!h22Var.c.get()) {
                        Object e0 = n77.e0(h22Var.a, new i10(h22Var, vz0Var, (byte) 2), this);
                        if (e0 == w11Var) {
                            return w11Var;
                        }
                        return e0;
                    }
                    ze0.m("This scope has already been closed.");
                }
                return null;
        }
    }

    public /* synthetic */ c51(int i, vz0 vz0Var) {
        super(i, vz0Var);
    }
}
